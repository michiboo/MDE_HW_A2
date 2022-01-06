/**
 */
package CryptoExchange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.Token#getAddress <em>Address</em>}</li>
 *   <li>{@link CryptoExchange.Token#getDecimal <em>Decimal</em>}</li>
 *   <li>{@link CryptoExchange.Token#getTokenNetwork <em>Token Network</em>}</li>
 * </ul>
 *
 * @see CryptoExchange.CryptoExchangePackage#getToken()
 * @model
 * @generated
 */
public interface Token extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see CryptoExchange.CryptoExchangePackage#getToken_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link CryptoExchange.Token#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' attribute.
	 * @see #setDecimal(int)
	 * @see CryptoExchange.CryptoExchangePackage#getToken_Decimal()
	 * @model
	 * @generated
	 */
	int getDecimal();

	/**
	 * Sets the value of the '{@link CryptoExchange.Token#getDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal</em>' attribute.
	 * @see #getDecimal()
	 * @generated
	 */
	void setDecimal(int value);

	/**
	 * Returns the value of the '<em><b>Token Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Network</em>' reference.
	 * @see #setTokenNetwork(TokenNetwork)
	 * @see CryptoExchange.CryptoExchangePackage#getToken_TokenNetwork()
	 * @model required="true"
	 * @generated
	 */
	TokenNetwork getTokenNetwork();

	/**
	 * Sets the value of the '{@link CryptoExchange.Token#getTokenNetwork <em>Token Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Network</em>' reference.
	 * @see #getTokenNetwork()
	 * @generated
	 */
	void setTokenNetwork(TokenNetwork value);

} // Token
