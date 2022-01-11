/**
 */
package cryptoExchangePackage.impl;

import cryptoExchangePackage.Account;
import cryptoExchangePackage.CryptoExchangePackagePackage;
import cryptoExchangePackage.CryptoExchangePackageTables;
import cryptoExchangePackage.Order;
import cryptoExchangePackage.SavingOrder;
import cryptoExchangePackage.SubSystem;
import cryptoExchangePackage.SubSystemName;
import cryptoExchangePackage.TokenPair;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericPlusOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

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
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
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
			orders = new EObjectContainmentEList<Order>(Order.class, this, CryptoExchangePackagePackage.SUB_SYSTEM__ORDERS);
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
	public String getNextOrderId() {
		/**
		 * '0x' + (Orders->size() + 1).toString()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Order> Orders = this.getOrders();
		final /*@NonInvalid*/ OrderedSetValue BOXED_Orders = idResolver.createOrderedSetOfAll(CryptoExchangePackageTables.ORD_CLSSid_Order, Orders);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_Orders);
		final /*@NonInvalid*/ IntegerValue sum = (IntegerValue)NumericPlusOperation.INSTANCE.evaluate(size, CryptoExchangePackageTables.INT_1);
		final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(sum);
		final /*@NonInvalid*/ String sum_0 = StringConcatOperation.INSTANCE.evaluate(CryptoExchangePackageTables.STR_0x, toString);
		return sum_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkOrderTypeConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "SubSystem::checkOrderTypeConstraint";
		try {
			/**
			 *
			 * inv checkOrderTypeConstraint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.SavingOrders->size() > 0 and
			 *         self.Name.toString() = 'Saving' or
			 *         self.SavingOrders->size() = 0 and
			 *         self.Name.toString() <> 'Saving'
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CryptoExchangePackagePackage.Literals.SUB_SYSTEM___CHECK_ORDER_TYPE_CONSTRAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CryptoExchangePackageTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean symbol_0;
			if (le) {
				symbol_0 = true;
			}
			else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					/*@Caught*/ Object CAUGHT_and;
					try {
						final /*@NonInvalid*/ List<SavingOrder> SavingOrders = this.getSavingOrders();
						final /*@NonInvalid*/ OrderedSetValue BOXED_SavingOrders = idResolver.createOrderedSetOfAll(CryptoExchangePackageTables.ORD_CLSSid_SavingOrder, SavingOrders);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_SavingOrders);
						final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, size, CryptoExchangePackageTables.INT_0).booleanValue();
						final /*@Thrown*/ Boolean and;
						if (!gt) {
							and = ValueUtil.FALSE_VALUE;
						}
						else {
							/*@Caught*/ Object CAUGHT_eq;
							try {
								final /*@NonInvalid*/ SubSystemName Name = this.getName();
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_Name = Name == null ? null : CryptoExchangePackageTables.ENUMid_SubSystemName.getEnumerationLiteralId(ClassUtil.nonNullState(Name.getName()));
								final /*@Thrown*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_Name);
								final /*@Thrown*/ boolean eq = toString.equals(CryptoExchangePackageTables.STR_Saving);
								CAUGHT_eq = eq;
							}
							catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							}
							else {
								if (CAUGHT_eq instanceof InvalidValueException) {
									throw (InvalidValueException)CAUGHT_eq;
								}
								and = ValueUtil.TRUE_VALUE;
							}
						}
						CAUGHT_and = and;
					}
					catch (Exception e) {
						CAUGHT_and = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean result;
					if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
						result = ValueUtil.TRUE_VALUE;
					}
					else {
						/*@Caught*/ Object CAUGHT_and_0;
						try {
							final /*@NonInvalid*/ List<SavingOrder> SavingOrders_0 = this.getSavingOrders();
							final /*@NonInvalid*/ OrderedSetValue BOXED_SavingOrders_0 = idResolver.createOrderedSetOfAll(CryptoExchangePackageTables.ORD_CLSSid_SavingOrder, SavingOrders_0);
							final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(BOXED_SavingOrders_0);
							final /*@NonInvalid*/ boolean eq_0 = size_0.equals(CryptoExchangePackageTables.INT_0);
							final /*@Thrown*/ Boolean and_0;
							if (!eq_0) {
								and_0 = ValueUtil.FALSE_VALUE;
							}
							else {
								/*@Caught*/ Object CAUGHT_ne;
								try {
									final /*@NonInvalid*/ SubSystemName Name_0 = this.getName();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_Name_0 = Name_0 == null ? null : CryptoExchangePackageTables.ENUMid_SubSystemName.getEnumerationLiteralId(ClassUtil.nonNullState(Name_0.getName()));
									final /*@Thrown*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_Name_0);
									final /*@Thrown*/ boolean ne = !toString_0.equals(CryptoExchangePackageTables.STR_Saving);
									CAUGHT_ne = ne;
								}
								catch (Exception e) {
									CAUGHT_ne = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_ne == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								}
								else {
									if (CAUGHT_ne instanceof InvalidValueException) {
										throw (InvalidValueException)CAUGHT_ne;
									}
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and_0 = and_0;
						}
						catch (Exception e) {
							CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and;
							}
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException)CAUGHT_and_0;
							}
							if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
								result = null;
							}
							else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
					}
					CAUGHT_result = result;
				}
				catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, CAUGHT_result, CryptoExchangePackageTables.INT_0).booleanValue();
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CryptoExchangePackagePackage.SUB_SYSTEM__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackagePackage.SUB_SYSTEM__TOKEN_PAIRS:
				return ((InternalEList<?>)getTokenPairs()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackagePackage.SUB_SYSTEM__ORDERS:
				return ((InternalEList<?>)getOrders()).basicRemove(otherEnd, msgs);
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CryptoExchangePackagePackage.SUB_SYSTEM___GET_NEXT_ORDER_ID:
				return getNextOrderId();
			case CryptoExchangePackagePackage.SUB_SYSTEM___CHECK_ORDER_TYPE_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return checkOrderTypeConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SubSystemImpl
