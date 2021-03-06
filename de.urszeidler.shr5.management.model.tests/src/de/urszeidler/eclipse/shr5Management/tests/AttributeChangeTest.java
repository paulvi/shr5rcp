/**
 * 2014 Urs Zeidler
 */
package de.urszeidler.eclipse.shr5Management.tests;

import junit.textui.TestRunner;
import de.urszeidler.eclipse.shr5.Shr5Package;
import de.urszeidler.eclipse.shr5Management.AttributeChange;
import de.urszeidler.eclipse.shr5Management.Shr5managementFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Change</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeChangeTest extends PersonaValueChangeTest {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AttributeChangeTest.class);
    }

    /**
     * Constructs a new Attribute Change test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeChangeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this Attribute Change test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected AttributeChange getFixture() {
        return (AttributeChange)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(Shr5managementFactory.eINSTANCE.createAttributeChange());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost() <em>Karma Cost</em>}' feature getter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#getKarmaCost()
     * @generated not
     */
    public void testGetKarmaCost() {
        getFixture().setCharacter(playerCharacter);
        getFixture().setAttibute(Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS);
        getFixture().setFrom(3);
        getFixture().setTo(4);
        assertEquals(-20, getFixture().getKarmaCost());
        
        getFixture().applyChanges();
    }

    /**
     * Tests the '{@link de.urszeidler.eclipse.shr5Management.Changes#applyChanges() <em>Apply Changes</em>}' operation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see de.urszeidler.eclipse.shr5Management.Changes#applyChanges()
     * @generated not
     */
    public void testApplyChanges() {
        getFixture().setCharacter(playerCharacter);
        getFixture().setAttibute(Shr5Package.Literals.ABSTRAKT_PERSONA__KONSTITUTION_BASIS);
        getFixture().setFrom(3);
        getFixture().setTo(4);
        assertEquals(-20, getFixture().getKarmaCost());
        
        getFixture().applyChanges();
        assertEquals(true, getFixture().isChangeApplied());
        assertNotNull(getFixture().getDateApplied());

    }

} // AttributeChangeTest
