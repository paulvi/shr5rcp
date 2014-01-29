package de.urszeidler.shr5.ecp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.exceptions.ECPProjectWithNameExistsException;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "de.urszeidler.shr5.ecp"; //$NON-NLS-1$

    private static final String DEFAUL_PROJECT_NAME = "shr5Resources";

    // The shared instance
    private static Activator plugin;

    /**
     * The constructor
     */
    public Activator() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
        
        //createDefaultWorkspace();
        
       // createECPWorkspace();

    }

    public void createECPWorkspace() throws ECPProjectWithNameExistsException {
        ECPProvider provider = ECPUtil.getECPProviderRegistry().getProvider("org.eclipse.emf.ecp.workspace.provider");
        ECPProperties ecpProperties = ECPUtil.createProperties();
        ecpProperties.addProperty("rootURI", "platform:/resource/shr5Resource/shr5-1.xmi");
        ECPProject ecpProject = ECPUtil.getECPProjectManager().getProject(DEFAUL_PROJECT_NAME);
        if (ecpProject == null) {
            ECPProject project = ECPUtil.getECPProjectManager().createProject(provider, DEFAUL_PROJECT_NAME, ecpProperties);
            project.open();
        }
    }

    public void createDefaultWorkspace() {
        IProgressMonitor progressMonitor = new NullProgressMonitor();
        IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
        IProject project = root.getProject("shr5Resource");
        if (!project.exists()) {
            try {
                project.create(progressMonitor);
                project.open(progressMonitor);
                copyResource(progressMonitor, project);
                project.refreshLocal(3, progressMonitor);
            } catch (CoreException e) {
                Activator.logError(e.getMessage());
            }
        }
    }
    
    private void copyResource(IProgressMonitor monitor, IProject project) throws CoreException {
        Bundle extensionBundle = Activator.getDefault().getBundle();
        IContainer target =project;//.getFolder("resource");
        Enumeration<String> entryPaths = extensionBundle.getEntryPaths("shr5Resource");
        processPath(entryPaths, target, extensionBundle, "shr5Resource");        
    }

    protected void processPath(Enumeration<String> entryPaths, IContainer target,
            Bundle extensionBundle, String basename) throws CoreException {
        for (Enumeration<String> iter = entryPaths; iter.hasMoreElements();) {
            String name = (String) iter.nextElement();
            if (name.endsWith("/.svn/"))
                continue;

            File file = getFile(name);
            IFileStore fileStore = EFS.getLocalFileSystem().getStore(
                    target.getLocationURI());
            IContainer ntarget;
            if (file.isDirectory()) {
                IFileStore dir = fileStore.getChild(
                        name.substring(basename.length())).mkdir(EFS.SHALLOW,
                        null);
                IContainer[] containers = ResourcesPlugin.getWorkspace()
                        .getRoot().findContainersForLocationURI(dir.toURI());
                if (containers.length == 1) {
                    Enumeration<String> entrys = extensionBundle.getEntryPaths(name);
                    ntarget = containers[0];
                    if (entrys != null) {
                        ntarget.refreshLocal(1, null);
                        processPath(entrys, ntarget, extensionBundle, name);
                    }
                }
            }
            if (!file.isDirectory())
                generate(new NullProgressMonitor(), file, target);
        }

    }
    
    public IResource generate(IProgressMonitor monitor, File _source, IContainer _destination) throws CoreException {
        monitor.setTaskName("Template Generation Process");
        IResource dest = null;

        dest = _copyFile(_source, _destination, monitor);
        monitor.subTask(""); //$NON-NLS-1$
        monitor.worked(1);
        return dest;
    }

    
    protected IFile _copyFile(File file, IContainer dest,
            IProgressMonitor monitor) throws CoreException {
        String targetFileName = (file.getName());

        monitor.subTask(targetFileName);
        IFile dstFile = dest.getFile(new Path(targetFileName));

        InputStream stream = null;
        try {
            stream =  new FileInputStream(file);//  file. _getProcessedStream(file, dest.getDefaultCharset());
            if (dstFile.exists()) {
                dstFile.setContents(stream, true, true, monitor);
            } else {
                dstFile.create(stream, true, monitor);
            }

        } catch (IOException ioe) {
            //Activator.getDefault().log(ioe);
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException ioe2) {
                //CallchainEditPlugin.log(ioe2);
            }
        }

        return dstFile;
    }

    /**
     * Returns the file of the given relativePath
     * 
     * @param relativePath
     *            the relativePath of the template which represent the file to
     *            get
     * @return the file
     */
    protected File getFile(String relativePath) {
        try {
            Bundle extensionBundle = Platform.getBundle(Activator.PLUGIN_ID);
            URL templateFileURL = extensionBundle.getEntry(relativePath);
            FileLocator.toFileURL(templateFileURL);
            return new File(Platform.asLocalURL(templateFileURL).getFile());
        } catch (IOException e) {
            e.printStackTrace();
            ILog log = Activator.getDefault().getLog();
            log.log(new  Status(IStatus.ERROR,Activator.PLUGIN_ID,e.getMessage()));
            
        }
        return null;
    }
    
    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    public static void logError(String message, Exception e) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), message, e));
    }

    public static void logError(String message) {
        plugin.getLog().log(new Status(IStatus.ERROR, plugin.getBundle().getSymbolicName(), message));
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

}