/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.Account;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.Order;
import cryptoExchangePackage.SavingOrder;
import cryptoExchangePackage.SubSystem;
import cryptoExchangePackage.SubSystemName;
import cryptoExchangePackage.TokenPair;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.SubSystemImpl#getName <em>Name</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.SubSystemImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.SubSystemImpl#getTokenPairs <em>Token Pairs</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.SubSystemImpl#getOrders <em>Orders</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.SubSystemImpl#getSavingOrders <em>Saving Orders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubSystemImpl extends MinimalEObjectImpl.Container implements SubSystem {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final SubSystemName NAME_EDEFAULT = SubSystemName.SPOT;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected SubSystemName name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccounts() <em>Accounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<Account> accounts;

	/**
	 * The cached value of the '{@link #getTokenPairs() <em>Token Pairs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenPairs()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenPair> tokenPairs;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * The cached value of the '{@link #getSavingOrders() <em>Saving Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSavingOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<SavingOrder> savingOrders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.SUB_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystemName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SubSystemName newName) {
		SubSystemName oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.SUB_SYSTEM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Account> getAccounts() {
		if (accounts == null) {
			accounts = new EObjectContainmentEList<Account>(Account.class, this, CryptoExchangePackagePackage.SUB_SYSTEM__ACCOUNTS);
		}
		return accounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenPair> getTokenPairs() {
		if (tokenPairs == null) {
			tokenPairs = new EObjectContainmentEList<TokenPair>(TokenPair.class, this, CryptoExchangePackagePackage.SUB_SYSTEM__TOKEN_PAIRS);
		}
		return tokenPairs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectResolvingEList<Order>(Order.class, this, CryptoExchangePackagePackage.SUB_SYSTEM__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SavingOrder> getSavingOrders() {
		if (savingOrders == null) {
			savingOrders = new EObjectContainmentEList<SavingOrder>(SavingOrder.class, this, CryptoExchangePackagePackage.SUB_SYSTEM__SAVING_ORDERS);
		}
		return savingOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CryptoExchangePackagePackage.SUB_SYSTEM__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackagePackage.SUB_SYSTEM__TOKEN_PAIRS:
				return ((InternalEList<?>)getTokenPairs()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackagePackage.SUB_SYSTEM__SAVING_ORDERS:
				return ((InternalEList<?>)getSavingOrders()).basicRemove(otherEnd, msgs);
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
			case CryptoExchangePackagePackage.SUB_SYSTEM__NAME:
				return getName();
			case CryptoExchangePackagePackage.SUB_SYSTEM__ACCOUNTS:
				return getAccounts();
			case CryptoExchangePackagePackage.SUB_SYSTEM__TOKEN_PAIRS:
				return getTokenPairs();
			case CryptoExchangePackagePackage.SUB_SYSTEM__ORDERS:
				return getOrders();
			case CryptoExchangePackagePackage.SUB_SYSTEM__SAVING_ORDERS:
				return getSavingOrders();
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
			case CryptoExchangePackagePackage.SUB_SYSTEM__NAME:
				setName((SubSystemName)newValue);
				return;
			case CryptoExchangePackagePackage.SUB_SYSTEM__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
				return;
			case CryptoExchangePackagePackage.SUB_SYSTEM__TOKEN_PAIRS:
				getTokenPairs().clear();
				getTokenPairs().addAll((Collection<? extends TokenPair>)newValue);
				return;
			case CryptoExchangePackagePackage.SUB_SYSTEM__ORDERS:
				getOrders().clear();
				getOrders().addAll((Collection<? extends Order>)newValue);
				return;
			case CryptoExchangePackagePackage.SUB_SYSTEM__SAVING_ORDERS:
				getSavingOrders().clear();
				getSavingOrders().addAll((Collection<? extends SavingOrder>)newValue);
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
			case CryptoExchangePackagePackage.SUB_SYSTEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.SUB_SYSTEM__ACCOUNTS:
				getAccounts().clear();
				return;
			case CryptoExchangePackagePackage.SUB_SYSTEM__TOKEN_PAIRS:
				getTokenPairs().clear();
				return;
			case CryptoExchangePackagePackage.SUB_SYSTEM__ORDERS:
				getOrders().clear();
				return;
			case CryptoExchangePackagePackage.SUB_SYSTEM__SAVING_ORDERS:
				getSavingOrders().clear();
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
			case CryptoExchangePackagePackage.SUB_SYSTEM__NAME:
				return name != NAME_EDEFAULT;
			case CryptoExchangePackagePackage.SUB_SYSTEM__ACCOUNTS:
				return accounts != null && !accounts.isEmpty();
			case CryptoExchangePackagePackage.SUB_SYSTEM__TOKEN_PAIRS:
				return tokenPairs != null && !tokenPairs.isEmpty();
			case CryptoExchangePackagePackage.SUB_SYSTEM__ORDERS:
				return orders != null && !orders.isEmpty();
			case CryptoExchangePackagePackage.SUB_SYSTEM__SAVING_ORDERS:
				return savingOrders != null && !savingOrders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubSystemImpl
