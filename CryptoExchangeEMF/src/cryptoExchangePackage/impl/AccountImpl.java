/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.Account;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.TokenBalance;
import cryptoExchangePackage.TransferRequest;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.AccountImpl#getTokensBalance <em>Tokens Balance</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.AccountImpl#getTransferRequest <em>Transfer Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
	/**
	 * The cached value of the '{@link #getTokensBalance() <em>Tokens Balance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokensBalance()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenBalance> tokensBalance;

	/**
	 * The cached value of the '{@link #getTransferRequest() <em>Transfer Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferRequest> transferRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenBalance> getTokensBalance() {
		if (tokensBalance == null) {
			tokensBalance = new EObjectContainmentEList<TokenBalance>(TokenBalance.class, this, CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE);
		}
		return tokensBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferRequest> getTransferRequest() {
		if (transferRequest == null) {
			transferRequest = new EObjectContainmentEList<TransferRequest>(TransferRequest.class, this, CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST);
		}
		return transferRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				return ((InternalEList<?>)getTokensBalance()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				return ((InternalEList<?>)getTransferRequest()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				return getTokensBalance();
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				return getTransferRequest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				getTokensBalance().clear();
				getTokensBalance().addAll((Collection<? extends TokenBalance>)newValue);
				return;
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				getTransferRequest().clear();
				getTransferRequest().addAll((Collection<? extends TransferRequest>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				getTokensBalance().clear();
				return;
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				getTransferRequest().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				return tokensBalance != null && !tokensBalance.isEmpty();
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				return transferRequest != null && !transferRequest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccountImpl
