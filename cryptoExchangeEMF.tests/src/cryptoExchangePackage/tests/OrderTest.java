/**
 */
package cryptoExchangePackage.tests;

import cryptoExchangePackage.CryptoExchangePackageFactory;
import cryptoExchangePackage.Order;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrderTest extends TestCase {

	/**
	 * The fixture for this Order test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Order fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrderTest.class);
	}

	/**
	 * Constructs a new Order test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Order test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Order fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Order test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Order getFixture() {
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
		setFixture(CryptoExchangePackageFactory.eINSTANCE.createOrder());
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

} //OrderTest
