/**
 */
package CryptoExchange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.TransferRequest#getType <em>Type</em>}</li>
 *   <li>{@link CryptoExchange.TransferRequest#getAmount <em>Amount</em>}</li>
 *   <li>{@link CryptoExchange.TransferRequest#getToken <em>Token</em>}</li>
 *   <li>{@link CryptoExchange.TransferRequest#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see CryptoExchange.CryptoExchangePackage#getTransferRequest()
 * @model
 * @generated
 */
public interface TransferRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CryptoExchange.TransferType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CryptoExchange.TransferType
	 * @see #setType(TransferType)
	 * @see CryptoExchange.CryptoExchangePackage#getTransferRequest_Type()
	 * @model
	 * @generated
	 */
	TransferType getType();

	/**
	 * Sets the value of the '{@link CryptoExchange.TransferRequest#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CryptoExchange.TransferType
	 * @see #getType()
	 * @generated
	 */
	void setType(TransferType value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see CryptoExchange.CryptoExchangePackage#getTransferRequest_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link CryptoExchange.TransferRequest#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see CryptoExchange.CryptoExchangePackage#getTransferRequest_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link CryptoExchange.TransferRequest#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Account)
	 * @see CryptoExchange.CryptoExchangePackage#getTransferRequest_Destination()
	 * @model required="true"
	 * @generated
	 */
	Account getDestination();

	/**
	 * Sets the value of the '{@link CryptoExchange.TransferRequest#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Account value);

} // TransferRequest
