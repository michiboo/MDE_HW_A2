/**
 */
package CryptoExchange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Balance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.TokenBalance#getBalance <em>Balance</em>}</li>
 *   <li>{@link CryptoExchange.TokenBalance#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see CryptoExchange.CryptoExchangePackage#getTokenBalance()
 * @model
 * @generated
 */
public interface TokenBalance extends EObject {
	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(float)
	 * @see CryptoExchange.CryptoExchangePackage#getTokenBalance_Balance()
	 * @model
	 * @generated
	 */
	float getBalance();

	/**
	 * Sets the value of the '{@link CryptoExchange.TokenBalance#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(float value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see CryptoExchange.CryptoExchangePackage#getTokenBalance_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link CryptoExchange.TokenBalance#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

} // TokenBalance
