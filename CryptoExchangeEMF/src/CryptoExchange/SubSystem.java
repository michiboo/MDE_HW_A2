/**
 */
package CryptoExchange;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.SubSystem#getName <em>Name</em>}</li>
 *   <li>{@link CryptoExchange.SubSystem#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link CryptoExchange.SubSystem#getTokenPairs <em>Token Pairs</em>}</li>
 *   <li>{@link CryptoExchange.SubSystem#getOrders <em>Orders</em>}</li>
 *   <li>{@link CryptoExchange.SubSystem#getSavingOrders <em>Saving Orders</em>}</li>
 * </ul>
 *
 * @see CryptoExchange.CryptoExchangePackage#getSubSystem()
 * @model
 * @generated
 */
public interface SubSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link CryptoExchange.SubSystemName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see CryptoExchange.SubSystemName
	 * @see #setName(SubSystemName)
	 * @see CryptoExchange.CryptoExchangePackage#getSubSystem_Name()
	 * @model
	 * @generated
	 */
	SubSystemName getName();

	/**
	 * Sets the value of the '{@link CryptoExchange.SubSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see CryptoExchange.SubSystemName
	 * @see #getName()
	 * @generated
	 */
	void setName(SubSystemName value);

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link CryptoExchange.Account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see CryptoExchange.CryptoExchangePackage#getSubSystem_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * Returns the value of the '<em><b>Token Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link CryptoExchange.TokenPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Pairs</em>' containment reference list.
	 * @see CryptoExchange.CryptoExchangePackage#getSubSystem_TokenPairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TokenPair> getTokenPairs();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' reference list.
	 * The list contents are of type {@link CryptoExchange.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' reference list.
	 * @see CryptoExchange.CryptoExchangePackage#getSubSystem_Orders()
	 * @model
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Saving Orders</b></em>' containment reference list.
	 * The list contents are of type {@link CryptoExchange.SavingOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saving Orders</em>' containment reference list.
	 * @see CryptoExchange.CryptoExchangePackage#getSubSystem_SavingOrders()
	 * @model containment="true"
	 * @generated
	 */
	EList<SavingOrder> getSavingOrders();

} // SubSystem
