/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lizenz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.urszeidler.eclipse.shr5.Lizenz#getLizenGegenstand <em>Lizen Gegenstand</em>}</li>
 *   <li>{@link de.urszeidler.eclipse.shr5.Lizenz#getLizenzTraeger <em>Lizenz Traeger</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.urszeidler.eclipse.shr5.Shr5Package#getLizenz()
 * @model
 * @generated
 */
public interface Lizenz extends Fakeable {
    /**
     * Returns the value of the '<em><b>Lizen Gegenstand</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lizen Gegenstand</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lizen Gegenstand</em>' attribute.
     * @see #setLizenGegenstand(String)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getLizenz_LizenGegenstand()
     * @model
     * @generated
     */
    String getLizenGegenstand();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Lizenz#getLizenGegenstand <em>Lizen Gegenstand</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lizen Gegenstand</em>' attribute.
     * @see #getLizenGegenstand()
     * @generated
     */
    void setLizenGegenstand(String value);

    /**
     * Returns the value of the '<em><b>Lizenz Traeger</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lizenz Traeger</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lizenz Traeger</em>' reference.
     * @see #setLizenzTraeger(Sin)
     * @see de.urszeidler.eclipse.shr5.Shr5Package#getLizenz_LizenzTraeger()
     * @model required="true"
     * @generated
     */
    Sin getLizenzTraeger();

    /**
     * Sets the value of the '{@link de.urszeidler.eclipse.shr5.Lizenz#getLizenzTraeger <em>Lizenz Traeger</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lizenz Traeger</em>' reference.
     * @see #getLizenzTraeger()
     * @generated
     */
    void setLizenzTraeger(Sin value);

} // Lizenz
