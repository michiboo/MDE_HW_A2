/**
 */
package cryptoExchangePackage.tests;

import cryptoExchangePackage.CryptoExchangePackageFactory;
import cryptoExchangePackage.SubSystem;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubSystemTest extends TestCase {

	/**
	 * The fixture for this Sub System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystem fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubSystemTest.class);
	}

	/**
	 * Constructs a new Sub System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystemTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sub System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SubSystem fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sub System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystem getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CryptoExchangePackageFactory.eINSTANCE.createSubSystem());
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

} //SubSystemTest
