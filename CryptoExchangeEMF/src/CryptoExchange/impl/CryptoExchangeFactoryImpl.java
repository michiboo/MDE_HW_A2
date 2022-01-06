/**
 */
package CryptoExchange.impl;

import CryptoExchange.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptoExchangeFactoryImpl extends EFactoryImpl implements CryptoExchangeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CryptoExchangeFactory init() {
		try {
			CryptoExchangeFactory theCryptoExchangeFactory = (CryptoExchangeFactory)EPackage.Registry.INSTANCE.getEFactory(CryptoExchangePackage.eNS_URI);
			if (theCryptoExchangeFactory != null) {
				return theCryptoExchangeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CryptoExchangeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CryptoExchangePackage.CRYPTO_EXCHANGE: return createCryptoExchange();
			case CryptoExchangePackage.ACCOUNT: return createAccount();
			case CryptoExchangePackage.ORDER: return createOrder();
			case CryptoExchangePackage.SAVING_ORDER: return createSavingOrder();
			case CryptoExchangePackage.SUB_SYSTEM: return createSubSystem();
			case CryptoExchangePackage.TOKEN: return createToken();
			case CryptoExchangePackage.TOKEN_BALANCE: return createTokenBalance();
			case CryptoExchangePackage.TOKEN_NETWORK: return createTokenNetwork();
			case CryptoExchangePackage.TOKEN_PAIR: return createTokenPair();
			case CryptoExchangePackage.TRANSFER_REQUEST: return createTransferRequest();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CryptoExchangePackage.ORDER_TYPE:
				return createOrderTypeFromString(eDataType, initialValue);
			case CryptoExchangePackage.LEVERAGE_TYPE:
				return createLeverageTypeFromString(eDataType, initialValue);
			case CryptoExchangePackage.SUB_SYSTEM_NAME:
				return createSubSystemNameFromString(eDataType, initialValue);
			case CryptoExchangePackage.TRANSFER_TYPE:
				return createTransferTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CryptoExchangePackage.ORDER_TYPE:
				return convertOrderTypeToString(eDataType, instanceValue);
			case CryptoExchangePackage.LEVERAGE_TYPE:
				return convertLeverageTypeToString(eDataType, instanceValue);
			case CryptoExchangePackage.SUB_SYSTEM_NAME:
				return convertSubSystemNameToString(eDataType, instanceValue);
			case CryptoExchangePackage.TRANSFER_TYPE:
				return convertTransferTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchange createCryptoExchange() {
		CryptoExchangeImpl cryptoExchange = new CryptoExchangeImpl();
		return cryptoExchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		AccountImpl account = new AccountImpl();
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder() {
		OrderImpl order = new OrderImpl();
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SavingOrder createSavingOrder() {
		SavingOrderImpl savingOrder = new SavingOrderImpl();
		return savingOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem createSubSystem() {
		SubSystemImpl subSystem = new SubSystemImpl();
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenBalance createTokenBalance() {
		TokenBalanceImpl tokenBalance = new TokenBalanceImpl();
		return tokenBalance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenNetwork createTokenNetwork() {
		TokenNetworkImpl tokenNetwork = new TokenNetworkImpl();
		return tokenNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenPair createTokenPair() {
		TokenPairImpl tokenPair = new TokenPairImpl();
		return tokenPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferRequest createTransferRequest() {
		TransferRequestImpl transferRequest = new TransferRequestImpl();
		return transferRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderTypeFromString(EDataType eDataType, String initialValue) {
		OrderType result = OrderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeverageType createLeverageTypeFromString(EDataType eDataType, String initialValue) {
		LeverageType result = LeverageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeverageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystemName createSubSystemNameFromString(EDataType eDataType, String initialValue) {
		SubSystemName result = SubSystemName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubSystemNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferType createTransferTypeFromString(EDataType eDataType, String initialValue) {
		TransferType result = TransferType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransferTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangePackage getCryptoExchangePackage() {
		return (CryptoExchangePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CryptoExchangePackage getPackage() {
		return CryptoExchangePackage.eINSTANCE;
	}

} //CryptoExchangeFactoryImpl
