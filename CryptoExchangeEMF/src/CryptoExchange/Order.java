/**
 */
package CryptoExchange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.Order#getID <em>ID</em>}</li>
 *   <li>{@link CryptoExchange.Order#getPrice <em>Price</em>}</li>
 *   <li>{@link CryptoExchange.Order#getAmount <em>Amount</em>}</li>
 *   <li>{@link CryptoExchange.Order#getLeverage <em>Leverage</em>}</li>
 *   <li>{@link CryptoExchange.Order#getType <em>Type</em>}</li>
 *   <li>{@link CryptoExchange.Order#getAccount <em>Account</em>}</li>
 *   <li>{@link CryptoExchange.Order#getTokenPair <em>Token Pair</em>}</li>
 * </ul>
 *
 * @see CryptoExchange.CryptoExchangePackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see CryptoExchange.CryptoExchangePackage#getOrder_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link CryptoExchange.Order#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(float)
	 * @see CryptoExchange.CryptoExchangePackage#getOrder_Price()
	 * @model
	 * @generated
	 */
	float getPrice();

	/**
	 * Sets the value of the '{@link CryptoExchange.Order#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(float value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see CryptoExchange.CryptoExchangePackage#getOrder_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link CryptoExchange.Order#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Leverage</b></em>' attribute.
	 * The literals are from the enumeration {@link CryptoExchange.LeverageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leverage</em>' attribute.
	 * @see CryptoExchange.LeverageType
	 * @see #setLeverage(LeverageType)
	 * @see CryptoExchange.CryptoExchangePackage#getOrder_Leverage()
	 * @model
	 * @generated
	 */
	LeverageType getLeverage();

	/**
	 * Sets the value of the '{@link CryptoExchange.Order#getLeverage <em>Leverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leverage</em>' attribute.
	 * @see CryptoExchange.LeverageType
	 * @see #getLeverage()
	 * @generated
	 */
	void setLeverage(LeverageType value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CryptoExchange.OrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CryptoExchange.OrderType
	 * @see #setType(OrderType)
	 * @see CryptoExchange.CryptoExchangePackage#getOrder_Type()
	 * @model
	 * @generated
	 */
	OrderType getType();

	/**
	 * Sets the value of the '{@link CryptoExchange.Order#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CryptoExchange.OrderType
	 * @see #getType()
	 * @generated
	 */
	void setType(OrderType value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference.
	 * @see #setAccount(Account)
	 * @see CryptoExchange.CryptoExchangePackage#getOrder_Account()
	 * @model required="true"
	 * @generated
	 */
	Account getAccount();

	/**
	 * Sets the value of the '{@link CryptoExchange.Order#getAccount <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Token Pair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Pair</em>' reference.
	 * @see #setTokenPair(TokenPair)
	 * @see CryptoExchange.CryptoExchangePackage#getOrder_TokenPair()
	 * @model required="true"
	 * @generated
	 */
	TokenPair getTokenPair();

	/**
	 * Sets the value of the '{@link CryptoExchange.Order#getTokenPair <em>Token Pair</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Pair</em>' reference.
	 * @see #getTokenPair()
	 * @generated
	 */
	void setTokenPair(TokenPair value);

} // Order
