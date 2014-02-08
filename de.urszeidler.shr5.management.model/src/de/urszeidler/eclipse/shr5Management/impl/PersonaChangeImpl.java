/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.urszeidler.eclipse.shr5.Erlernbar;
import de.urszeidler.eclipse.shr5.Fertigkeit;
import de.urszeidler.eclipse.shr5.Initation;
import de.urszeidler.eclipse.shr5.PersonaEigenschaft;
import de.urszeidler.eclipse.shr5.PersonaFertigkeit;
import de.urszeidler.eclipse.shr5.PersonaFertigkeitsGruppe;
import de.urszeidler.eclipse.shr5.Steigerbar;
import de.urszeidler.eclipse.shr5.util.Shr5Switch;
import de.urszeidler.eclipse.shr5Management.CharacterGenerator;
import de.urszeidler.eclipse.shr5Management.IncreaseCharacterPart;
import de.urszeidler.eclipse.shr5Management.PersonaChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementPackage;
import de.urszeidler.eclipse.shr5Management.util.ShadowrunManagmentTools;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persona Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.urszeidler.eclipse.shr5Management.impl.PersonaChangeImpl#getChangeable <em>Changeable</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class PersonaChangeImpl extends PersonaValueChangeImpl implements PersonaChange {
    /**
     * The cached value of the '{@link #getChangeable() <em>Changeable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getChangeable()
     * @generated
     * @ordered
     */
    protected Erlernbar changeable;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected PersonaChangeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Shr5managementPackage.Literals.PERSONA_CHANGE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Erlernbar getChangeable() {
        if (changeable != null && changeable.eIsProxy()) {
            InternalEObject oldChangeable = (InternalEObject)changeable;
            changeable = (Erlernbar)eResolveProxy(oldChangeable);
            if (changeable != oldChangeable) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE, oldChangeable,
                            changeable));
            }
        }
        return changeable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public Erlernbar basicGetChangeable() {
        return changeable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void setChangeable(Erlernbar newChangeable) {
        Erlernbar oldChangeable = changeable;
        changeable = newChangeable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE, oldChangeable, changeable));

        if (newChangeable != null) {
            Shr5Switch<Object> shr5Switch = new Shr5Switch<Object>() {
                @Override
                public Object caseSteigerbar(Steigerbar object) {
                    setFrom(object.getStufe());
                    setTo(object.getStufe() + 1);
                    return object;
                }

                @Override
                public Object caseErlernbar(Erlernbar object) {
                    // TODO Auto-generated method stub
                    return super.caseErlernbar(object);
                }
            };
            Object ret = shr5Switch.doSwitch(newChangeable);
            if (ret != null)
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.SET, Shr5managementPackage.Literals.CHANGES__KARMA_COST, 0, 1));

        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                if (resolve)
                    return getChangeable();
                return basicGetChangeable();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                setChangeable((Erlernbar)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                setChangeable((Erlernbar)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Shr5managementPackage.PERSONA_CHANGE__CHANGEABLE:
                return changeable != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated not
     */
    public void applyChanges() {
        if (getChangeable() == null)
            return;

        internalApply();

        Shr5Switch<Object> shr5Switch = new Shr5Switch<Object>() {
            @Override
            public Object caseSteigerbar(Steigerbar object) {
                object.setStufe(getTo());
                return object;
            }
        };
        shr5Switch.doSwitch(getChangeable());

        shr5Switch = new Shr5Switch<Object>() {
            @Override
            public Object casePersonaFertigkeit(PersonaFertigkeit object) {
                return super.casePersonaFertigkeit(object);
            }
        };
        
    }

    /**
     * @generated not
     */
    public int getKarmaCost() {
        Shr5Switch<Integer> sw = new Shr5Switch<Integer>() {
            @Override
            public Integer casePersonaEigenschaft(PersonaEigenschaft object) {
                return getKarmaCostQuallity(object);
            }

            @Override
            public Integer casePersonaFertigkeit(PersonaFertigkeit object) {
                return getKarmaCostSkill(object);
            }

            @Override
            public Integer casePersonaFertigkeitsGruppe(PersonaFertigkeitsGruppe object) {
                return getKarmaCostSkillGroup(object);
            }

            @Override
            public Integer caseInitation(Initation object) {
                return getKarmaCostInitation(object);
            }
        };

        Integer i = sw.doSwitch(getChangeable());
        if (i != null){
         
            
            return i;
        }
        return 0;
    }

    /**
     * @generated not
     */
    private int getKarmaCostQuallity(PersonaEigenschaft quallity) {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        if (quallity != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(),
                    quallity.eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * Math.abs(karmaFactor * quallity.getKarmaKosten());
            }
        }
        return 0;
    }

    /**
     * @generated not
     */
    private int getKarmaCostInitation(Initation initation) {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        if (initation != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(),
                    initation.eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * Math.abs(karmaFactor * initation.getStufe());
            }
        }
        return 0;
    }

    /**
     * @generated not
     */
    private int getKarmaCostSkill(PersonaFertigkeit skill) {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        if (skill != null) {
            Fertigkeit fertigkeit = skill.getFertigkeit();
            EClass eClass = fertigkeit.eClass();

            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(), eClass);
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * karmaFactor * (getTo());
            }
        }
        return 0;
    }

    /**
     * @generated not
     */
    private int getKarmaCostSkillGroup(PersonaFertigkeitsGruppe skill) {
        if (getCharacter() == null)
            return 0;
        CharacterGenerator chracterSource = getCharacter().getChracterSource();
        if (chracterSource == null)
            return 0;

        if (skill != null) {
            IncreaseCharacterPart part = ShadowrunManagmentTools.findAdvancment(chracterSource.getGenerator().getCharacterAdvancements(), skill
                    .getGruppe().eClass());
            if (part != null) {
                int karmaFactor = part.getKarmaFactor();
                return -1 * karmaFactor * (getTo());
            }
        }
        return 0;
    }

} // PersonaChangeImpl
