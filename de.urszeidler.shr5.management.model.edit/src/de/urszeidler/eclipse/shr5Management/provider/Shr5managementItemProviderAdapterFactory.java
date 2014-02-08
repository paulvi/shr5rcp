/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5.ShrList;
import de.urszeidler.eclipse.shr5.util.Shr5Switch;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.Shr5managementAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Shr5managementItemProviderAdapterFactory extends Shr5managementAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
     * This constructs an instance.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Shr5managementItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.NonPlayerCharacter} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected NonPlayerCharacterItemProvider nonPlayerCharacterItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.NonPlayerCharacter}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createNonPlayerCharacterAdapter() {
        if (nonPlayerCharacterItemProvider == null) {
            nonPlayerCharacterItemProvider = new NonPlayerCharacterItemProvider(this);
        }

        return nonPlayerCharacterItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.KarmaGaint} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected KarmaGaintItemProvider karmaGaintItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.KarmaGaint}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createKarmaGaintAdapter() {
        if (karmaGaintItemProvider == null) {
            karmaGaintItemProvider = new KarmaGaintItemProvider(this);
        }

        return karmaGaintItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.FreeStyle} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FreeStyleItemProvider freeStyleItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.FreeStyle}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createFreeStyleAdapter() {
        if (freeStyleItemProvider == null) {
            freeStyleItemProvider = new FreeStyleItemProvider(this);
        }

        return freeStyleItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Shr5System} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Shr5SystemItemProvider shr5SystemItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Shr5System}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createShr5SystemAdapter() {
        if (shr5SystemItemProvider == null) {
            shr5SystemItemProvider = new Shr5SystemItemProvider(this);
        }

        return shr5SystemItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.MetaType} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MetaTypeItemProvider metaTypeItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.MetaType}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createMetaTypeAdapter() {
        if (metaTypeItemProvider == null) {
            metaTypeItemProvider = new MetaTypeItemProvider(this);
        }

        return metaTypeItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Attributes} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AttributesItemProvider attributesItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Attributes}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createAttributesAdapter() {
        if (attributesItemProvider == null) {
            attributesItemProvider = new AttributesItemProvider(this);
        }

        return attributesItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Skill} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SkillItemProvider skillItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Skill}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createSkillAdapter() {
        if (skillItemProvider == null) {
            skillItemProvider = new SkillItemProvider(this);
        }

        return skillItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Resourcen} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ResourcenItemProvider resourcenItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Resourcen}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createResourcenAdapter() {
        if (resourcenItemProvider == null) {
            resourcenItemProvider = new ResourcenItemProvider(this);
        }

        return resourcenItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Technomancer} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TechnomancerItemProvider technomancerItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Technomancer}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createTechnomancerAdapter() {
        if (technomancerItemProvider == null) {
            technomancerItemProvider = new TechnomancerItemProvider(this);
        }

        return technomancerItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Spellcaster} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SpellcasterItemProvider spellcasterItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Spellcaster}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createSpellcasterAdapter() {
        if (spellcasterItemProvider == null) {
            spellcasterItemProvider = new SpellcasterItemProvider(this);
        }

        return spellcasterItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Adept} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AdeptItemProvider adeptItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Adept}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createAdeptAdapter() {
        if (adeptItemProvider == null) {
            adeptItemProvider = new AdeptItemProvider(this);
        }

        return adeptItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FreeStyleGeneratorItemProvider freeStyleGeneratorItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.FreeStyleGenerator}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createFreeStyleGeneratorAdapter() {
        if (freeStyleGeneratorItemProvider == null) {
            freeStyleGeneratorItemProvider = new FreeStyleGeneratorItemProvider(this);
        }

        return freeStyleGeneratorItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Shr5Generator} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected Shr5GeneratorItemProvider shr5GeneratorItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Shr5Generator}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createShr5GeneratorAdapter() {
        if (shr5GeneratorItemProvider == null) {
            shr5GeneratorItemProvider = new Shr5GeneratorItemProvider(this);
        }

        return shr5GeneratorItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.AttributeChange} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AttributeChangeItemProvider attributeChangeItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.AttributeChange}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createAttributeChangeAdapter() {
        if (attributeChangeItemProvider == null) {
            attributeChangeItemProvider = new AttributeChangeItemProvider(this);
        }

        return attributeChangeItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.PlayerCharacter} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PlayerCharacterItemProvider playerCharacterItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.PlayerCharacter}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createPlayerCharacterAdapter() {
        if (playerCharacterItemProvider == null) {
            playerCharacterItemProvider = new PlayerCharacterItemProvider(this);
        }

        return playerCharacterItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Mudan} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MudanItemProvider mudanItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Mudan}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createMudanAdapter() {
        if (mudanItemProvider == null) {
            mudanItemProvider = new MudanItemProvider(this);
        }

        return mudanItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.CharacterGroup} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CharacterGroupItemProvider characterGroupItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.CharacterGroup}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createCharacterGroupAdapter() {
        if (characterGroupItemProvider == null) {
            characterGroupItemProvider = new CharacterGroupItemProvider(this);
        }

        return characterGroupItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.Connection} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ConnectionItemProvider connectionItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.Connection}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createConnectionAdapter() {
        if (connectionItemProvider == null) {
            connectionItemProvider = new ConnectionItemProvider(this);
        }

        return connectionItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.FertigkeitChange} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FertigkeitChangeItemProvider fertigkeitChangeItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.FertigkeitChange}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createFertigkeitChangeAdapter() {
        if (fertigkeitChangeItemProvider == null) {
            fertigkeitChangeItemProvider = new FertigkeitChangeItemProvider(this);
        }

        return fertigkeitChangeItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GeneratorStateToEStringMapEntryItemProvider generatorStateToEStringMapEntryItemProvider;

	/**
     * This creates an adapter for a {@link java.util.Map.Entry}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createGeneratorStateToEStringMapEntryAdapter() {
        if (generatorStateToEStringMapEntryItemProvider == null) {
            generatorStateToEStringMapEntryItemProvider = new GeneratorStateToEStringMapEntryItemProvider(this);
        }

        return generatorStateToEStringMapEntryItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected IncreaseCharacterPartItemProvider increaseCharacterPartItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createIncreaseCharacterPartAdapter() {
        if (increaseCharacterPartItemProvider == null) {
            increaseCharacterPartItemProvider = new IncreaseCharacterPartItemProvider(this);
        }

        return increaseCharacterPartItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.ChangeQuallity} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ChangeQuallityItemProvider changeQuallityItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.ChangeQuallity}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createChangeQuallityAdapter() {
        if (changeQuallityItemProvider == null) {
            changeQuallityItemProvider = new ChangeQuallityItemProvider(this);
        }

        return changeQuallityItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.QuallityChange} instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected QuallityChangeItemProvider quallityChangeItemProvider;

	/**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.QuallityChange}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter createQuallityChangeAdapter() {
        if (quallityChangeItemProvider == null) {
            quallityChangeItemProvider = new QuallityChangeItemProvider(this);
        }

        return quallityChangeItemProvider;
    }

	/**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LifestyleToStartMoneyItemProvider lifestyleToStartMoneyItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.LifestyleToStartMoney}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createLifestyleToStartMoneyAdapter() {
        if (lifestyleToStartMoneyItemProvider == null) {
            lifestyleToStartMoneyItemProvider = new LifestyleToStartMoneyItemProvider(this);
        }

        return lifestyleToStartMoneyItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link de.urszeidler.eclipse.shr5Management.PersonaInitation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PersonaInitationItemProvider personaInitationItemProvider;

    /**
     * This creates an adapter for a {@link de.urszeidler.eclipse.shr5Management.PersonaInitation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPersonaInitationAdapter() {
        if (personaInitationItemProvider == null) {
            personaInitationItemProvider = new PersonaInitationItemProvider(this);
        }

        return personaInitationItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

	/**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

	/**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

	/**
     * This adds a listener.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

	/**
     * This removes a listener.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

	/**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

	/**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void dispose() {
        if (nonPlayerCharacterItemProvider != null) nonPlayerCharacterItemProvider.dispose();
        if (karmaGaintItemProvider != null) karmaGaintItemProvider.dispose();
        if (freeStyleItemProvider != null) freeStyleItemProvider.dispose();
        if (shr5SystemItemProvider != null) shr5SystemItemProvider.dispose();
        if (metaTypeItemProvider != null) metaTypeItemProvider.dispose();
        if (attributesItemProvider != null) attributesItemProvider.dispose();
        if (skillItemProvider != null) skillItemProvider.dispose();
        if (resourcenItemProvider != null) resourcenItemProvider.dispose();
        if (technomancerItemProvider != null) technomancerItemProvider.dispose();
        if (spellcasterItemProvider != null) spellcasterItemProvider.dispose();
        if (adeptItemProvider != null) adeptItemProvider.dispose();
        if (freeStyleGeneratorItemProvider != null) freeStyleGeneratorItemProvider.dispose();
        if (shr5GeneratorItemProvider != null) shr5GeneratorItemProvider.dispose();
        if (attributeChangeItemProvider != null) attributeChangeItemProvider.dispose();
        if (playerCharacterItemProvider != null) playerCharacterItemProvider.dispose();
        if (mudanItemProvider != null) mudanItemProvider.dispose();
        if (characterGroupItemProvider != null) characterGroupItemProvider.dispose();
        if (connectionItemProvider != null) connectionItemProvider.dispose();
        if (fertigkeitChangeItemProvider != null) fertigkeitChangeItemProvider.dispose();
        if (generatorStateToEStringMapEntryItemProvider != null) generatorStateToEStringMapEntryItemProvider.dispose();
        if (increaseCharacterPartItemProvider != null) increaseCharacterPartItemProvider.dispose();
        if (changeQuallityItemProvider != null) changeQuallityItemProvider.dispose();
        if (quallityChangeItemProvider != null) quallityChangeItemProvider.dispose();
        if (lifestyleToStartMoneyItemProvider != null) lifestyleToStartMoneyItemProvider.dispose();
        if (personaInitationItemProvider != null) personaInitationItemProvider.dispose();
    }

	/**
     * A child creation extender for the {@link Shr5Package}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static class Shr5ChildCreationExtender implements IChildCreationExtender {
		/**
         * The switch for creating child descriptors specific to each extended class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		protected static class CreationSwitch extends Shr5Switch<Object> {
			/**
             * The child descriptors being populated.
             * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
             * @generated
             */
			protected List<Object> newChildDescriptors;

			/**
             * The domain in which to create the children.
             * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
             * @generated
             */
			protected EditingDomain editingDomain;

			/**
             * Creates the a switch for populating child descriptors in the given domain.
             * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
             * @generated
             */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
                this.newChildDescriptors = newChildDescriptors;
                this.editingDomain = editingDomain;
            }
			/**
             * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
             * @generated
             */
			@Override
			public Object caseShrList(ShrList object) {
                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createNonPlayerCharacter()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createKarmaGaint()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createFreeStyle()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createShr5System()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createMetaType()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createAttributes()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createSkill()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createResourcen()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createTechnomancer()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createAdept()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createSpellcaster()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createFreeStyleGenerator()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createShr5Generator()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createAttributeChange()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createPlayerCharacter()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createMudan()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createCharacterGroup()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createConnection()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createFertigkeitChange()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.create(Shr5managementPackage.Literals.GENERATOR_STATE_TO_ESTRING_MAP_ENTRY)));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createIncreaseCharacterPart()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createChangeQuallity()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createQuallityChange()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createLifestyleToStartMoney()));

                newChildDescriptors.add
                    (createChildParameter
                        (Shr5Package.Literals.SHR_LIST__ENTRIES,
                         Shr5managementFactory.eINSTANCE.createPersonaInitation()));

                return null;
            }
 
			/**
             * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
             * @generated
             */
			protected CommandParameter createChildParameter(Object feature, Object child) {
                return new CommandParameter(null, feature, child);
            }

		}

		/**
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
            ArrayList<Object> result = new ArrayList<Object>();
            new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
            return result;
        }

		/**
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		public ResourceLocator getResourceLocator() {
            return Shr5ManagementEditPlugin.INSTANCE;
        }
	}

}
