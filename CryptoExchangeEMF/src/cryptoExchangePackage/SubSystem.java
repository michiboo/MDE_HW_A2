/**
 */
package cryptoExchangePackage;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link cryptoExchangePackage.SubSystem#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.SubSystem#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link cryptoExchangePackage.SubSystem#getTokenPairs <em>Token Pairs</em>}</li>
 *   <li>{@link cryptoExchangePackage.SubSystem#getOrders <em>Orders</em>}</li>
 *   <li>{@link cryptoExchangePackage.SubSystem#getSavingOrders <em>Saving Orders</em>}</li>
 * </ul>
 *
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSubSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkOrderTypeConstraint'"
 * @generated
 */
public interface SubSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link cryptoExchangePackage.SubSystemName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see cryptoExchangePackage.SubSystemName
	 * @see #setName(SubSystemName)
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSubSystem_Name()
	 * @model
	 * @generated
	 */
	SubSystemName getName();

	/**
	 * Sets the value of the '{@link cryptoExchangePackage.SubSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see cryptoExchangePackage.SubSystemName
	 * @see #getName()
	 * @generated
	 */
	void setName(SubSystemName value);

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.Account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSubSystem_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * Returns the value of the '<em><b>Token Pairs</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.TokenPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Pairs</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSubSystem_TokenPairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TokenPair> getTokenPairs();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSubSystem_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Saving Orders</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.SavingOrder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Saving Orders</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getSubSystem_SavingOrders()
	 * @model containment="true"
	 * @generated
	 */
	EList<SavingOrder> getSavingOrders();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\'0x\' + (Orders-&gt;size() + 1).toString()'"
	 * @generated
	 */
	String getNextOrderId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='(self.SavingOrders-&gt;size() &gt; 0 and self.Name.toString() = \'Saving\') or (self.SavingOrders-&gt;size() = 0 and self.Name.toString() &lt;&gt; \'Saving\')'"
	 * @generated
	 */
	boolean checkOrderTypeConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SubSystem
