package de.urszeidler.shr5.ecp.editor.pages;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import de.urszeidler.eclipse.shr5.Reichweite;
import de.urszeidler.eclipse.shr5.Shr5Factory;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.util.AdapterFactoryUtil;
import de.urszeidler.emf.commons.ui.util.EmfFormBuilder.ReferenceManager;
import de.urszeidler.shr5.ecp.editor.widgets.BeschreibbarWidget;

public class ReichweitePage extends AbstractShr5Page<Reichweite> {
    private Reichweite object;
    private EditingDomain editingDomain;

    private DataBindingContext m_bindingContext;

    /**
     * Create the form page.
     * 
     * @param id
     * @param title
     */
    public ReichweitePage(String id, String title) {
        super(id, title);
    }

    public ReichweitePage(FormEditor editor, String id, String title, Reichweite object, EditingDomain editingDomain, ReferenceManager manager) {
        super(editor, id, title, manager);
        this.object = object;
        this.editingDomain = editingDomain;

    }

    /**
     * Create the form page.
     * 
     * @param editor
     * @param id
     * @param title
     * @wbp.parser.constructor
     * @wbp.eval.method.parameter id "Some id"
     * @wbp.eval.method.parameter title "Some title"
     */
    public ReichweitePage(FormEditor editor, String id, String title) {
        super(editor, id, title);
        this.object = Shr5Factory.eINSTANCE.createReichweite();
    }

    /**
     * Create contents of the form.
     * 
     * @param managedForm
     */
    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        ScrolledForm form = managedForm.getForm();
        form.setText(AdapterFactoryUtil.getInstance().getLabelProvider().getText(object));
        Composite body = form.getBody();
        toolkit.decorateFormHeading(form.getForm());
        toolkit.paintBordersFor(body);
        managedForm.getForm().getBody().setLayout(new GridLayout(1, false));

        BeschreibbarWidget beschreibbarWidget = new BeschreibbarWidget(managedForm.getForm().getBody(), SWT.NONE, object, toolkit, editingDomain);
        GridData gd_beschreibbarWidget = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
        gd_beschreibbarWidget.widthHint = 0;
        gd_beschreibbarWidget.heightHint = 0;
        beschreibbarWidget.setLayoutData(gd_beschreibbarWidget);
        managedForm.getToolkit().adapt(beschreibbarWidget);
        managedForm.getToolkit().paintBordersFor(beschreibbarWidget);

        Group grpGegenstand = new Group(managedForm.getForm().getBody(), SWT.NONE);
        grpGegenstand.setText(Messages.ObjectPage_range);
        grpGegenstand.setLayout(new GridLayout(15, false));
        grpGegenstand.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        managedForm.getToolkit().adapt(grpGegenstand);
        managedForm.getToolkit().paintBordersFor(grpGegenstand);

        m_bindingContext = initDataBindings();

        createFormBuilder(managedForm);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.REICHWEITE__MIN, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.REICHWEITE__KURZ, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.REICHWEITE__MITTEL, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.REICHWEITE__WEIT, grpGegenstand);
        emfFormBuilder.addTextEntry(Shr5Package.Literals.REICHWEITE__EXTREM, grpGegenstand);
        emfFormBuilder.buildinComposite(m_bindingContext, managedForm.getForm().getBody(), object);
        managedForm.reflow(true);
    }

    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        return bindingContext;
    }

    @Override
    protected EditingDomain getEditingDomain() {
        return editingDomain;
    }
}
