/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Changes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Changes#getDate <em>Date</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost <em>Karma Cost</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5Management.Changes#getCharacter <em>Character</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getChanges()
 * @model abstract="true"
 * @generated
 */
public interface Changes extends EObject {
	/**
     * Returns the value of the '<em><b>Date</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Date</em>' attribute.
     * @see #setDate(Date)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getChanges_Date()
     * @model dataType="de.urszeidler.eclipse.shr5.ShrDate"
     * @generated
     */
	Date getDate();

	/**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Changes#getDate <em>Date</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date</em>' attribute.
     * @see #getDate()
     * @generated
     */
	void setDate(Date value);

    /**
     * Returns the value of the '<em><b>Karma Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Karma Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Karma Cost</em>' attribute.
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getChanges_KarmaCost()
     * @model transient="true" changeable="false" volatile="true" derived="true"
     * @generated
     */
    int getKarmaCost();

    /**
     * Returns the value of the '<em><b>Character</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChanges <em>Changes</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Character</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Character</em>' container reference.
     * @see #setCharacter(ManagedCharacter)
     * @see de.urszeidler.eclipse.shr5Management.Shr5managementPackage#getChanges_Character()
     * @see de.urszeidler.eclipse.shr5Management.ManagedCharacter#getChanges
     * @model opposite="changes" transient="false"
     * @generated
     */
    ManagedCharacter getCharacter();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5Management.Changes#getCharacter <em>Character</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Character</em>' container reference.
     * @see #getCharacter()
     * @generated
     */
    void setCharacter(ManagedCharacter value);

} // Changes
