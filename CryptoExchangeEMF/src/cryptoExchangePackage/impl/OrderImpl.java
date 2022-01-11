/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.Account;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.CryptoExchangePackageTables;
import cryptoExchangePackage.LeverageType;
import cryptoExchangePackage.Order;
import cryptoExchangePackage.OrderType;
import cryptoExchangePackage.SubSystem;
import cryptoExchangePackage.Token;
import cryptoExchangePackage.TokenBalance;
import cryptoExchangePackage.TokenPair;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclElementOclAsModelTypeOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;
import org.eclipse.ocl.pivot.values.RealValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cryptoExchangePackage.impl.OrderImpl#getID <em>ID</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.OrderImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.OrderImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.OrderImpl#getLeverage <em>Leverage</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.OrderImpl#getType <em>Type</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.OrderImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link cryptoExchangePackage.impl.OrderImpl#getTokenPair <em>Token Pair</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
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
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final float PRICE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected float price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNT_EDEFAULT = 0.0F;

	/**
	 * The default value of the '{@link #getLeverage() <em>Leverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeverage()
	 * @generated
	 * @ordered
	 */
	protected static final LeverageType LEVERAGE_EDEFAULT = LeverageType._1X;

	/**
	 * The cached value of the '{@link #getLeverage() <em>Leverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeverage()
	 * @generated
	 * @ordered
	 */
	protected LeverageType leverage = LEVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final OrderType TYPE_EDEFAULT = OrderType.BUY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected OrderType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected Account account;

	/**
	 * The cached value of the '{@link #getTokenPair() <em>Token Pair</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenPair()
	 * @generated
	 * @ordered
	 */
	protected TokenPair tokenPair;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackagePackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		/**
		 * self.oclContainer().oclAsModelType(SubSystem).getNextOrderId()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cryptoExchangePackage_c_c_SubSystem_0 = idResolver.getClass(CryptoExchangePackageTables.CLSSid_SubSystem, null);
		final /*@NonInvalid*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor, this);
		if (oclContainer == null) {
			throw new InvalidValueException("Null \'\'OclElement\'\' rather than \'\'OclVoid\'\' value required");
		}
		final /*@Thrown*/ SubSystem oclAsModelType = (SubSystem)OclElementOclAsModelTypeOperation.INSTANCE.evaluate(executor, oclContainer, TYP_cryptoExchangePackage_c_c_SubSystem_0);
		final /*@Thrown*/ String getNextOrderId = oclAsModelType.getNextOrderId();
		return getNextOrderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		// TODO: implement this method to set the 'ID' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(float newPrice) {
		float oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.ORDER__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAmount() {
		/**
		 *
		 * if
		 *   self.account.oclAsModelType(Account)
		 *   .availableBalance(self.TokenPair.TokenA) >= Amount
		 * then Amount
		 * else
		 *   self.account.oclAsModelType(Account)
		 *   .availableBalance(self.TokenPair.TokenA)
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ float Amount_0 = this.getAmount();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cryptoExchangePackage_c_c_Account_1 = idResolver.getClass(CryptoExchangePackageTables.CLSSid_Account, null);
		final /*@NonInvalid*/ TokenPair TokenPair_0 = this.getTokenPair();
		final /*@NonInvalid*/ Account account_0 = this.getAccount();
		final /*@NonInvalid*/ Token TokenA_0 = TokenPair_0.getTokenA();
		final /*@Thrown*/ Account oclAsModelType_0 = (Account)OclElementOclAsModelTypeOperation.INSTANCE.evaluate(executor, account_0, TYP_cryptoExchangePackage_c_c_Account_1);
		final /*@Thrown*/ float availableBalance_0 = oclAsModelType_0.availableBalance(TokenA_0);
		final /*@Thrown*/ RealValue BOXED_availableBalance = ValueUtil.realValueOf(availableBalance_0);
		final /*@NonInvalid*/ RealValue BOXED_Amount = ValueUtil.realValueOf(Amount_0);
		final /*@Thrown*/ boolean ge = OclComparableGreaterThanEqualOperation.INSTANCE.evaluate(executor, BOXED_availableBalance, BOXED_Amount).booleanValue();
		/*@Thrown*/ float symbol_0;
		if (ge) {
			symbol_0 = Amount_0;
		}
		else {
			symbol_0 = availableBalance_0;
		}
		return symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(float newAmount) {
		// TODO: implement this method to set the 'Amount' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeverageType getLeverage() {
		return leverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeverage(LeverageType newLeverage) {
		LeverageType oldLeverage = leverage;
		leverage = newLeverage == null ? LEVERAGE_EDEFAULT : newLeverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.ORDER__LEVERAGE, oldLeverage, leverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(OrderType newType) {
		OrderType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.ORDER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getAccount() {
		if (account != null && account.eIsProxy()) {
			InternalEObject oldAccount = (InternalEObject)account;
			account = (Account)eResolveProxy(oldAccount);
			if (account != oldAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangePackagePackage.ORDER__ACCOUNT, oldAccount, account));
			}
		}
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account basicGetAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(Account newAccount) {
		Account oldAccount = account;
		account = newAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.ORDER__ACCOUNT, oldAccount, account));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenPair getTokenPair() {
		if (tokenPair != null && tokenPair.eIsProxy()) {
			InternalEObject oldTokenPair = (InternalEObject)tokenPair;
			tokenPair = (TokenPair)eResolveProxy(oldTokenPair);
			if (tokenPair != oldTokenPair) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CryptoExchangePackagePackage.ORDER__TOKEN_PAIR, oldTokenPair, tokenPair));
			}
		}
		return tokenPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenPair basicGetTokenPair() {
		return tokenPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTokenPair(TokenPair newTokenPair) {
		TokenPair oldTokenPair = tokenPair;
		tokenPair = newTokenPair;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackagePackage.ORDER__TOKEN_PAIR, oldTokenPair, tokenPair));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkAccountBalance(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Order::checkAccountBalance";
		try {
			/**
			 *
			 * inv checkAccountBalance:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if self->notEmpty()
			 *         then
			 *           self.account.TokensBalance->select(Token = self.TokenPair.TokenA)
			 *           ->forAll(balance <= self.Amount)
			 *         else true
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CryptoExchangePackagePackage.Literals.ORDER___CHECK_ACCOUNT_BALANCE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CryptoExchangePackageTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor, CryptoExchangePackageTables.SET_CLSSid_Order, this);
				final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(oclAsSet).booleanValue();
				/*@NonInvalid*/ Boolean result;
				if (notEmpty) {
					final /*@NonInvalid*/ Account account = this.getAccount();
					final /*@NonInvalid*/ List<TokenBalance> TokensBalance = account.getTokensBalance();
					final /*@NonInvalid*/ OrderedSetValue BOXED_TokensBalance = idResolver.createOrderedSetOfAll(CryptoExchangePackageTables.ORD_CLSSid_TokenBalance, TokensBalance);
					/*@Thrown*/ Accumulator accumulator = ValueUtil.createOrderedSetAccumulatorValue(CryptoExchangePackageTables.ORD_CLSSid_TokenBalance);
					Iterator<Object> ITERATOR__1 = BOXED_TokensBalance.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR__1.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ TokenBalance _1 = (TokenBalance)ITERATOR__1.next();
						/**
						 * Token = self.TokenPair.TokenA
						 */
						final /*@NonInvalid*/ Token Token = _1.getToken();
						final /*@NonInvalid*/ TokenPair TokenPair = this.getTokenPair();
						final /*@NonInvalid*/ Token TokenA = TokenPair.getTokenA();
						final /*@NonInvalid*/ boolean eq = Token.equals(TokenA);
						//
						if (eq) {
							accumulator.add(_1);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR__1_0 = select.iterator();
					/*@NonInvalid*/ Boolean forAll;
					while (true) {
						if (!ITERATOR__1_0.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								forAll = ValueUtil.TRUE_VALUE;
							}
							else {
								throw (InvalidValueException)accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ TokenBalance _1_0 = (TokenBalance)ITERATOR__1_0.next();
						/**
						 * balance <= self.Amount
						 */
						final /*@NonInvalid*/ float balance = _1_0.getBalance();
						final /*@NonInvalid*/ RealValue BOXED_balance = ValueUtil.realValueOf(balance);
						final /*@NonInvalid*/ float Amount = this.getAmount();
						final /*@NonInvalid*/ RealValue BOXED_Amount = ValueUtil.realValueOf(Amount);
						final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, BOXED_balance, BOXED_Amount).booleanValue();
						//
						if (!le_0) {					// Normal unsuccessful body evaluation result
							forAll = ValueUtil.FALSE_VALUE;
							break;														// Stop immediately
						}
						else if (le_0) {				// Normal successful body evaluation result
							;															// Carry on
						}
						else {															// Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					result = forAll;
				}
				else {
					result = ValueUtil.TRUE_VALUE;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CryptoExchangePackageTables.INT_0).booleanValue();
				symbol_0 = logDiagnostic;
			}
			return symbol_0;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ORDER__ID:
				return getID();
			case CryptoExchangePackagePackage.ORDER__PRICE:
				return getPrice();
			case CryptoExchangePackagePackage.ORDER__AMOUNT:
				return getAmount();
			case CryptoExchangePackagePackage.ORDER__LEVERAGE:
				return getLeverage();
			case CryptoExchangePackagePackage.ORDER__TYPE:
				return getType();
			case CryptoExchangePackagePackage.ORDER__ACCOUNT:
				if (resolve) return getAccount();
				return basicGetAccount();
			case CryptoExchangePackagePackage.ORDER__TOKEN_PAIR:
				if (resolve) return getTokenPair();
				return basicGetTokenPair();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CryptoExchangePackagePackage.ORDER__ID:
				setID((String)newValue);
				return;
			case CryptoExchangePackagePackage.ORDER__PRICE:
				setPrice((Float)newValue);
				return;
			case CryptoExchangePackagePackage.ORDER__AMOUNT:
				setAmount((Float)newValue);
				return;
			case CryptoExchangePackagePackage.ORDER__LEVERAGE:
				setLeverage((LeverageType)newValue);
				return;
			case CryptoExchangePackagePackage.ORDER__TYPE:
				setType((OrderType)newValue);
				return;
			case CryptoExchangePackagePackage.ORDER__ACCOUNT:
				setAccount((Account)newValue);
				return;
			case CryptoExchangePackagePackage.ORDER__TOKEN_PAIR:
				setTokenPair((TokenPair)newValue);
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
			case CryptoExchangePackagePackage.ORDER__ID:
				setID(ID_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.ORDER__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.ORDER__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.ORDER__LEVERAGE:
				setLeverage(LEVERAGE_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.ORDER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CryptoExchangePackagePackage.ORDER__ACCOUNT:
				setAccount((Account)null);
				return;
			case CryptoExchangePackagePackage.ORDER__TOKEN_PAIR:
				setTokenPair((TokenPair)null);
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
			case CryptoExchangePackagePackage.ORDER__ID:
				return ID_EDEFAULT == null ? getID() != null : !ID_EDEFAULT.equals(getID());
			case CryptoExchangePackagePackage.ORDER__PRICE:
				return price != PRICE_EDEFAULT;
			case CryptoExchangePackagePackage.ORDER__AMOUNT:
				return getAmount() != AMOUNT_EDEFAULT;
			case CryptoExchangePackagePackage.ORDER__LEVERAGE:
				return leverage != LEVERAGE_EDEFAULT;
			case CryptoExchangePackagePackage.ORDER__TYPE:
				return type != TYPE_EDEFAULT;
			case CryptoExchangePackagePackage.ORDER__ACCOUNT:
				return account != null;
			case CryptoExchangePackagePackage.ORDER__TOKEN_PAIR:
				return tokenPair != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CryptoExchangePackagePackage.ORDER___CHECK_ACCOUNT_BALANCE__DIAGNOSTICCHAIN_MAP:
				return checkAccountBalance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (Price: ");
		result.append(price);
		result.append(", leverage: ");
		result.append(leverage);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
