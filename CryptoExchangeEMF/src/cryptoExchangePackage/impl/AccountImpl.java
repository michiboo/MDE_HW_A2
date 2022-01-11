/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.Account;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.CryptoExchangePackageTables;
import cryptoExchangePackage.Token;
import cryptoExchangePackage.TokenBalance;
import cryptoExchangePackage.TransferRequest;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSumOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.AccountImpl#getID <em>ID</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.AccountImpl#getTokensBalance <em>Tokens Balance</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.AccountImpl#getTransferRequest <em>Transfer Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountImpl extends MinimalEObjectImpl.Container implements Account {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.ACCOUNT__ID, oldID, id));
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
	public float availableBalance(final Token fToken) {
		/**
		 *
		 * if
		 *   not self.TokensBalance->select((Token = fToken))
		 *   ->isEmpty()
		 * then
		 *   self.TokensBalance->select(Token = fToken)
		 *   ->collect(balance)
		 *   ->sum()
		 *   .oclAsType(ecore::EFloat)
		 * else 0
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<TokenBalance> TokensBalance_0 = this.getTokensBalance();
		final /*@NonInvalid*/ OrderedSetValue BOXED_TokensBalance_0 = idResolver.createOrderedSetOfAll(CryptoExchangePackageTables.ORD_CLSSid_TokenBalance, TokensBalance_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(CryptoExchangePackageTables.ORD_CLSSid_TokenBalance);
		Iterator<Object> ITERATOR__1_0 = BOXED_TokensBalance_0.iterator();
		/*@NonInvalid*/ OrderedSetValue select_0;
		while (true) {
			if (!ITERATOR__1_0.hasNext()) {
				select_0 = accumulator;
				break;
			}
			/*@NonInvalid*/ TokenBalance _1_0 = (TokenBalance)ITERATOR__1_0.next();
			/**
			 * Token = fToken
			 */
			final /*@NonInvalid*/ Token Token_0 = _1_0.getToken();
			final /*@NonInvalid*/ boolean eq_0 = Token_0.equals(fToken);
			//
			if (eq_0) {
				accumulator.add(_1_0);
			}
		}
		final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(select_0).booleanValue();
		final /*@NonInvalid*/ Boolean not;
		if (!isEmpty) {
			not = ValueUtil.TRUE_VALUE;
		}
		else {
			if (isEmpty) {
				not = ValueUtil.FALSE_VALUE;
			}
			else {
				not = null;
			}
		}
		if (not == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@Thrown*/ RealValue symbol_0;
		if (not) {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_ecore_c_c_EFloat_0 = idResolver.getClass(CryptoExchangePackageTables.DATAid_EFloat, null);
			/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_0 = ValueUtil.createSequenceAccumulatorValue(CryptoExchangePackageTables.SEQ_DATAid_EFloat);
			Iterator<Object> ITERATOR__1_1 = select_0.iterator();
			/*@NonInvalid*/ SequenceValue collect;
			while (true) {
				if (!ITERATOR__1_1.hasNext()) {
					collect = accumulator_0;
					break;
				}
				/*@NonInvalid*/ TokenBalance _1_1 = (TokenBalance)ITERATOR__1_1.next();
				/**
				 * balance
				 */
				final /*@NonInvalid*/ float balance = _1_1.getBalance();
				final /*@NonInvalid*/ RealValue BOXED_balance = ValueUtil.realValueOf(balance);
				//
				accumulator_0.add(BOXED_balance);
			}
			final /*@NonInvalid*/ RealValue sum = (RealValue)CollectionSumOperation.INSTANCE.evaluate(executor, CryptoExchangePackageTables.DATAid_EFloat, collect);
			final /*@Thrown*/ RealValue oclAsType = (RealValue)OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, sum, TYP_ecore_c_c_EFloat_0);
			symbol_0 = oclAsType;
		}
		else {
			symbol_0 = CryptoExchangePackageTables.INT_0;
		}
		final /*@Thrown*/ float ECORE_symbol_0 = ValueUtil.floatValueOf(symbol_0);
		return ECORE_symbol_0;
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
			case CryptoExchangePackagePackage.ACCOUNT__ID:
				return getID();
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
			case CryptoExchangePackagePackage.ACCOUNT__ID:
				setID((String)newValue);
				return;
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
			case CryptoExchangePackagePackage.ACCOUNT__ID:
				setID(ID_EDEFAULT);
				return;
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
			case CryptoExchangePackagePackage.ACCOUNT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CryptoExchangePackagePackage.ACCOUNT__TOKENS_BALANCE:
				return tokensBalance != null && !tokensBalance.isEmpty();
			case CryptoExchangePackagePackage.ACCOUNT__TRANSFER_REQUEST:
				return transferRequest != null && !transferRequest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CryptoExchangePackagePackage.ACCOUNT___AVAILABLE_BALANCE__TOKEN:
				return availableBalance((Token)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //AccountImpl
