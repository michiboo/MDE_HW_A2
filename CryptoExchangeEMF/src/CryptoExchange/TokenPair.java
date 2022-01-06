/**
 */
package CryptoExchange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.TokenPair#getPrice <em>Price</em>}</li>
 *   <li>{@link CryptoExchange.TokenPair#getTokenA <em>Token A</em>}</li>
 *   <li>{@link CryptoExchange.TokenPair#getTokenB <em>Token B</em>}</li>
 * </ul>
 *
 * @see CryptoExchange.CryptoExchangePackage#getTokenPair()
 * @model
 * @generated
 */
public interface TokenPair extends EObject {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see CryptoExchange.CryptoExchangePackage#getTokenPair_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link CryptoExchange.TokenPair#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Token A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token A</em>' reference.
	 * @see #setTokenA(Token)
	 * @see CryptoExchange.CryptoExchangePackage#getTokenPair_TokenA()
	 * @model required="true"
	 * @generated
	 */
	Token getTokenA();

	/**
	 * Sets the value of the '{@link CryptoExchange.TokenPair#getTokenA <em>Token A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token A</em>' reference.
	 * @see #getTokenA()
	 * @generated
	 */
	void setTokenA(Token value);

	/**
	 * Returns the value of the '<em><b>Token B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token B</em>' reference.
	 * @see #setTokenB(Token)
	 * @see CryptoExchange.CryptoExchangePackage#getTokenPair_TokenB()
	 * @model required="true"
	 * @generated
	 */
	Token getTokenB();

	/**
	 * Sets the value of the '{@link CryptoExchange.TokenPair#getTokenB <em>Token B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token B</em>' reference.
	 * @see #getTokenB()
	 * @generated
	 */
	void setTokenB(Token value);

} // TokenPair
