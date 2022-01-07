/**
 */
package cryptoExchangePackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.Account#getTokensBalance <em>Tokens Balance</em>}</li>
 *   <li>{@link cryptoExchangePackage.Account#getTransferRequest <em>Transfer Request</em>}</li>
 * </ul>
 *
 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Tokens Balance</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.TokenBalance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens Balance</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getAccount_TokensBalance()
	 * @model containment="true"
	 * @generated
	 */
	EList<TokenBalance> getTokensBalance();

	/**
	 * Returns the value of the '<em><b>Transfer Request</b></em>' containment reference list.
	 * The list contents are of type {@link cryptoExchangePackage.TransferRequest}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Request</em>' containment reference list.
	 * @see cryptoExchangePackage.CryptoExchangePackagePackage#getAccount_TransferRequest()
	 * @model containment="true"
	 * @generated
	 */
	EList<TransferRequest> getTransferRequest();

} // Account
