/**
 */
package cryptoExchangePackage.tests;

import cryptoExchangePackage.CryptoExchangePackageFactory;
import cryptoExchangePackage.TokenPair;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Token Pair</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TokenPairTest extends TestCase {

	/**
	 * The fixture for this Token Pair test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenPair fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TokenPairTest.class);
	}

	/**
	 * Constructs a new Token Pair test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenPairTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Token Pair test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TokenPair fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Token Pair test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenPair getFixture() {
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
		setFixture(CryptoExchangePackageFactory.eINSTANCE.createTokenPair());
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

} //TokenPairTest
