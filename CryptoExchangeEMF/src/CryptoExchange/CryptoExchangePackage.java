/**
 */
package CryptoExchange;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CryptoExchange.CryptoExchangeFactory
 * @model kind="package"
 * @generated
 */
public interface CryptoExchangePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CryptoExchange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://CryptoExchange/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CryptoExchange";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CryptoExchangePackage eINSTANCE = CryptoExchange.impl.CryptoExchangePackageImpl.init();

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.CryptoExchangeImpl <em>Crypto Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.CryptoExchangeImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getCryptoExchange()
	 * @generated
	 */
	int CRYPTO_EXCHANGE = 0;

	/**
	 * The feature id for the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__IP = 0;

	/**
	 * The feature id for the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__DOMAIN_NAME = 1;

	/**
	 * The feature id for the '<em><b>Sub System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__SUB_SYSTEM = 2;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__TOKENS = 3;

	/**
	 * The feature id for the '<em><b>Token Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE__TOKEN_NETWORKS = 4;

	/**
	 * The number of structural features of the '<em>Crypto Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Crypto Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_EXCHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.AccountImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Tokens Balance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TOKENS_BALANCE = 0;

	/**
	 * The feature id for the '<em><b>Transfer Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__TRANSFER_REQUEST = 1;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.OrderImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ID = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Leverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__LEVERAGE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ACCOUNT = 5;

	/**
	 * The feature id for the '<em><b>Token Pair</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__TOKEN_PAIR = 6;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.SavingOrderImpl <em>Saving Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.SavingOrderImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getSavingOrder()
	 * @generated
	 */
	int SAVING_ORDER = 3;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Mature Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__MATURE_DATE = 1;

	/**
	 * The feature id for the '<em><b>Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__INTEREST = 2;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER__TOKEN = 3;

	/**
	 * The number of structural features of the '<em>Saving Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Saving Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAVING_ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.SubSystemImpl <em>Sub System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.SubSystemImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getSubSystem()
	 * @generated
	 */
	int SUB_SYSTEM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ACCOUNTS = 1;

	/**
	 * The feature id for the '<em><b>Token Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__TOKEN_PAIRS = 2;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__ORDERS = 3;

	/**
	 * The feature id for the '<em><b>Saving Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__SAVING_ORDERS = 4;

	/**
	 * The number of structural features of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.TokenImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__DECIMAL = 1;

	/**
	 * The feature id for the '<em><b>Token Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__TOKEN_NETWORK = 2;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.TokenBalanceImpl <em>Token Balance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.TokenBalanceImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTokenBalance()
	 * @generated
	 */
	int TOKEN_BALANCE = 6;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE__BALANCE = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE__TOKEN = 1;

	/**
	 * The number of structural features of the '<em>Token Balance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Token Balance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_BALANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.TokenNetworkImpl <em>Token Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.TokenNetworkImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTokenNetwork()
	 * @generated
	 */
	int TOKEN_NETWORK = 7;

	/**
	 * The feature id for the '<em><b>Chain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK__CHAIN_ID = 0;

	/**
	 * The feature id for the '<em><b>RPC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK__RPC = 1;

	/**
	 * The number of structural features of the '<em>Token Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Token Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.TokenPairImpl <em>Token Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.TokenPairImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTokenPair()
	 * @generated
	 */
	int TOKEN_PAIR = 8;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__PRICE = 0;

	/**
	 * The feature id for the '<em><b>Token A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__TOKEN_A = 1;

	/**
	 * The feature id for the '<em><b>Token B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR__TOKEN_B = 2;

	/**
	 * The number of structural features of the '<em>Token Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Token Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.impl.TransferRequestImpl <em>Transfer Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.impl.TransferRequestImpl
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTransferRequest()
	 * @generated
	 */
	int TRANSFER_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST__DESTINATION = 3;

	/**
	 * The number of structural features of the '<em>Transfer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transfer Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoExchange.OrderType <em>Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.OrderType
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getOrderType()
	 * @generated
	 */
	int ORDER_TYPE = 10;

	/**
	 * The meta object id for the '{@link CryptoExchange.LeverageType <em>Leverage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.LeverageType
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getLeverageType()
	 * @generated
	 */
	int LEVERAGE_TYPE = 11;

	/**
	 * The meta object id for the '{@link CryptoExchange.SubSystemName <em>Sub System Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.SubSystemName
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getSubSystemName()
	 * @generated
	 */
	int SUB_SYSTEM_NAME = 12;

	/**
	 * The meta object id for the '{@link CryptoExchange.TransferType <em>Transfer Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoExchange.TransferType
	 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTransferType()
	 * @generated
	 */
	int TRANSFER_TYPE = 13;


	/**
	 * Returns the meta object for class '{@link CryptoExchange.CryptoExchange <em>Crypto Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crypto Exchange</em>'.
	 * @see CryptoExchange.CryptoExchange
	 * @generated
	 */
	EClass getCryptoExchange();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.CryptoExchange#getIP <em>IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IP</em>'.
	 * @see CryptoExchange.CryptoExchange#getIP()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EAttribute getCryptoExchange_IP();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.CryptoExchange#getDomainName <em>Domain Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Name</em>'.
	 * @see CryptoExchange.CryptoExchange#getDomainName()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EAttribute getCryptoExchange_DomainName();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoExchange.CryptoExchange#getSubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub System</em>'.
	 * @see CryptoExchange.CryptoExchange#getSubSystem()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EReference getCryptoExchange_SubSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoExchange.CryptoExchange#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see CryptoExchange.CryptoExchange#getTokens()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EReference getCryptoExchange_Tokens();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoExchange.CryptoExchange#getTokenNetworks <em>Token Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Networks</em>'.
	 * @see CryptoExchange.CryptoExchange#getTokenNetworks()
	 * @see #getCryptoExchange()
	 * @generated
	 */
	EReference getCryptoExchange_TokenNetworks();

	/**
	 * Returns the meta object for class '{@link CryptoExchange.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see CryptoExchange.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoExchange.Account#getTokensBalance <em>Tokens Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens Balance</em>'.
	 * @see CryptoExchange.Account#getTokensBalance()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_TokensBalance();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoExchange.Account#getTransferRequest <em>Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transfer Request</em>'.
	 * @see CryptoExchange.Account#getTransferRequest()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_TransferRequest();

	/**
	 * Returns the meta object for class '{@link CryptoExchange.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see CryptoExchange.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.Order#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see CryptoExchange.Order#getID()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_ID();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.Order#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see CryptoExchange.Order#getPrice()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Price();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.Order#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CryptoExchange.Order#getAmount()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Amount();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.Order#getLeverage <em>Leverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Leverage</em>'.
	 * @see CryptoExchange.Order#getLeverage()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Leverage();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.Order#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CryptoExchange.Order#getType()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Type();

	/**
	 * Returns the meta object for the reference '{@link CryptoExchange.Order#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Account</em>'.
	 * @see CryptoExchange.Order#getAccount()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Account();

	/**
	 * Returns the meta object for the reference '{@link CryptoExchange.Order#getTokenPair <em>Token Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token Pair</em>'.
	 * @see CryptoExchange.Order#getTokenPair()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_TokenPair();

	/**
	 * Returns the meta object for class '{@link CryptoExchange.SavingOrder <em>Saving Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Saving Order</em>'.
	 * @see CryptoExchange.SavingOrder
	 * @generated
	 */
	EClass getSavingOrder();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.SavingOrder#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CryptoExchange.SavingOrder#getAmount()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_Amount();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.SavingOrder#getMatureDate <em>Mature Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mature Date</em>'.
	 * @see CryptoExchange.SavingOrder#getMatureDate()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_MatureDate();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.SavingOrder#getInterest <em>Interest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interest</em>'.
	 * @see CryptoExchange.SavingOrder#getInterest()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EAttribute getSavingOrder_Interest();

	/**
	 * Returns the meta object for the reference '{@link CryptoExchange.SavingOrder#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see CryptoExchange.SavingOrder#getToken()
	 * @see #getSavingOrder()
	 * @generated
	 */
	EReference getSavingOrder_Token();

	/**
	 * Returns the meta object for class '{@link CryptoExchange.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub System</em>'.
	 * @see CryptoExchange.SubSystem
	 * @generated
	 */
	EClass getSubSystem();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.SubSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CryptoExchange.SubSystem#getName()
	 * @see #getSubSystem()
	 * @generated
	 */
	EAttribute getSubSystem_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoExchange.SubSystem#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see CryptoExchange.SubSystem#getAccounts()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_Accounts();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoExchange.SubSystem#getTokenPairs <em>Token Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Token Pairs</em>'.
	 * @see CryptoExchange.SubSystem#getTokenPairs()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_TokenPairs();

	/**
	 * Returns the meta object for the reference list '{@link CryptoExchange.SubSystem#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Orders</em>'.
	 * @see CryptoExchange.SubSystem#getOrders()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoExchange.SubSystem#getSavingOrders <em>Saving Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Saving Orders</em>'.
	 * @see CryptoExchange.SubSystem#getSavingOrders()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_SavingOrders();

	/**
	 * Returns the meta object for class '{@link CryptoExchange.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see CryptoExchange.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.Token#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see CryptoExchange.Token#getAddress()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Address();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.Token#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see CryptoExchange.Token#getDecimal()
	 * @see #getToken()
	 * @generated
	 */
	EAttribute getToken_Decimal();

	/**
	 * Returns the meta object for the reference '{@link CryptoExchange.Token#getTokenNetwork <em>Token Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token Network</em>'.
	 * @see CryptoExchange.Token#getTokenNetwork()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_TokenNetwork();

	/**
	 * Returns the meta object for class '{@link CryptoExchange.TokenBalance <em>Token Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Balance</em>'.
	 * @see CryptoExchange.TokenBalance
	 * @generated
	 */
	EClass getTokenBalance();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.TokenBalance#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see CryptoExchange.TokenBalance#getBalance()
	 * @see #getTokenBalance()
	 * @generated
	 */
	EAttribute getTokenBalance_Balance();

	/**
	 * Returns the meta object for the reference '{@link CryptoExchange.TokenBalance#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see CryptoExchange.TokenBalance#getToken()
	 * @see #getTokenBalance()
	 * @generated
	 */
	EReference getTokenBalance_Token();

	/**
	 * Returns the meta object for class '{@link CryptoExchange.TokenNetwork <em>Token Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Network</em>'.
	 * @see CryptoExchange.TokenNetwork
	 * @generated
	 */
	EClass getTokenNetwork();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.TokenNetwork#getChainID <em>Chain ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chain ID</em>'.
	 * @see CryptoExchange.TokenNetwork#getChainID()
	 * @see #getTokenNetwork()
	 * @generated
	 */
	EAttribute getTokenNetwork_ChainID();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.TokenNetwork#getRPC <em>RPC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RPC</em>'.
	 * @see CryptoExchange.TokenNetwork#getRPC()
	 * @see #getTokenNetwork()
	 * @generated
	 */
	EAttribute getTokenNetwork_RPC();

	/**
	 * Returns the meta object for class '{@link CryptoExchange.TokenPair <em>Token Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Pair</em>'.
	 * @see CryptoExchange.TokenPair
	 * @generated
	 */
	EClass getTokenPair();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.TokenPair#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see CryptoExchange.TokenPair#getPrice()
	 * @see #getTokenPair()
	 * @generated
	 */
	EAttribute getTokenPair_Price();

	/**
	 * Returns the meta object for the reference '{@link CryptoExchange.TokenPair#getTokenA <em>Token A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token A</em>'.
	 * @see CryptoExchange.TokenPair#getTokenA()
	 * @see #getTokenPair()
	 * @generated
	 */
	EReference getTokenPair_TokenA();

	/**
	 * Returns the meta object for the reference '{@link CryptoExchange.TokenPair#getTokenB <em>Token B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token B</em>'.
	 * @see CryptoExchange.TokenPair#getTokenB()
	 * @see #getTokenPair()
	 * @generated
	 */
	EReference getTokenPair_TokenB();

	/**
	 * Returns the meta object for class '{@link CryptoExchange.TransferRequest <em>Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Request</em>'.
	 * @see CryptoExchange.TransferRequest
	 * @generated
	 */
	EClass getTransferRequest();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.TransferRequest#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CryptoExchange.TransferRequest#getType()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EAttribute getTransferRequest_Type();

	/**
	 * Returns the meta object for the attribute '{@link CryptoExchange.TransferRequest#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see CryptoExchange.TransferRequest#getAmount()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EAttribute getTransferRequest_Amount();

	/**
	 * Returns the meta object for the reference '{@link CryptoExchange.TransferRequest#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see CryptoExchange.TransferRequest#getToken()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EReference getTransferRequest_Token();

	/**
	 * Returns the meta object for the reference '{@link CryptoExchange.TransferRequest#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see CryptoExchange.TransferRequest#getDestination()
	 * @see #getTransferRequest()
	 * @generated
	 */
	EReference getTransferRequest_Destination();

	/**
	 * Returns the meta object for enum '{@link CryptoExchange.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Type</em>'.
	 * @see CryptoExchange.OrderType
	 * @generated
	 */
	EEnum getOrderType();

	/**
	 * Returns the meta object for enum '{@link CryptoExchange.LeverageType <em>Leverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leverage Type</em>'.
	 * @see CryptoExchange.LeverageType
	 * @generated
	 */
	EEnum getLeverageType();

	/**
	 * Returns the meta object for enum '{@link CryptoExchange.SubSystemName <em>Sub System Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sub System Name</em>'.
	 * @see CryptoExchange.SubSystemName
	 * @generated
	 */
	EEnum getSubSystemName();

	/**
	 * Returns the meta object for enum '{@link CryptoExchange.TransferType <em>Transfer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transfer Type</em>'.
	 * @see CryptoExchange.TransferType
	 * @generated
	 */
	EEnum getTransferType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CryptoExchangeFactory getCryptoExchangeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.CryptoExchangeImpl <em>Crypto Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.CryptoExchangeImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getCryptoExchange()
		 * @generated
		 */
		EClass CRYPTO_EXCHANGE = eINSTANCE.getCryptoExchange();

		/**
		 * The meta object literal for the '<em><b>IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_EXCHANGE__IP = eINSTANCE.getCryptoExchange_IP();

		/**
		 * The meta object literal for the '<em><b>Domain Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRYPTO_EXCHANGE__DOMAIN_NAME = eINSTANCE.getCryptoExchange_DomainName();

		/**
		 * The meta object literal for the '<em><b>Sub System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYPTO_EXCHANGE__SUB_SYSTEM = eINSTANCE.getCryptoExchange_SubSystem();

		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYPTO_EXCHANGE__TOKENS = eINSTANCE.getCryptoExchange_Tokens();

		/**
		 * The meta object literal for the '<em><b>Token Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CRYPTO_EXCHANGE__TOKEN_NETWORKS = eINSTANCE.getCryptoExchange_TokenNetworks();

		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.AccountImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Tokens Balance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__TOKENS_BALANCE = eINSTANCE.getAccount_TokensBalance();

		/**
		 * The meta object literal for the '<em><b>Transfer Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__TRANSFER_REQUEST = eINSTANCE.getAccount_TransferRequest();

		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.OrderImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ID = eINSTANCE.getOrder_ID();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__PRICE = eINSTANCE.getOrder_Price();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__AMOUNT = eINSTANCE.getOrder_Amount();

		/**
		 * The meta object literal for the '<em><b>Leverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__LEVERAGE = eINSTANCE.getOrder_Leverage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__TYPE = eINSTANCE.getOrder_Type();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ACCOUNT = eINSTANCE.getOrder_Account();

		/**
		 * The meta object literal for the '<em><b>Token Pair</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__TOKEN_PAIR = eINSTANCE.getOrder_TokenPair();

		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.SavingOrderImpl <em>Saving Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.SavingOrderImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getSavingOrder()
		 * @generated
		 */
		EClass SAVING_ORDER = eINSTANCE.getSavingOrder();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__AMOUNT = eINSTANCE.getSavingOrder_Amount();

		/**
		 * The meta object literal for the '<em><b>Mature Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__MATURE_DATE = eINSTANCE.getSavingOrder_MatureDate();

		/**
		 * The meta object literal for the '<em><b>Interest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAVING_ORDER__INTEREST = eINSTANCE.getSavingOrder_Interest();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAVING_ORDER__TOKEN = eINSTANCE.getSavingOrder_Token();

		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.SubSystemImpl <em>Sub System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.SubSystemImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getSubSystem()
		 * @generated
		 */
		EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_SYSTEM__NAME = eINSTANCE.getSubSystem_Name();

		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__ACCOUNTS = eINSTANCE.getSubSystem_Accounts();

		/**
		 * The meta object literal for the '<em><b>Token Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__TOKEN_PAIRS = eINSTANCE.getSubSystem_TokenPairs();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__ORDERS = eINSTANCE.getSubSystem_Orders();

		/**
		 * The meta object literal for the '<em><b>Saving Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__SAVING_ORDERS = eINSTANCE.getSubSystem_SavingOrders();

		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.TokenImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__ADDRESS = eINSTANCE.getToken_Address();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN__DECIMAL = eINSTANCE.getToken_Decimal();

		/**
		 * The meta object literal for the '<em><b>Token Network</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__TOKEN_NETWORK = eINSTANCE.getToken_TokenNetwork();

		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.TokenBalanceImpl <em>Token Balance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.TokenBalanceImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTokenBalance()
		 * @generated
		 */
		EClass TOKEN_BALANCE = eINSTANCE.getTokenBalance();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_BALANCE__BALANCE = eINSTANCE.getTokenBalance_Balance();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_BALANCE__TOKEN = eINSTANCE.getTokenBalance_Token();

		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.TokenNetworkImpl <em>Token Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.TokenNetworkImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTokenNetwork()
		 * @generated
		 */
		EClass TOKEN_NETWORK = eINSTANCE.getTokenNetwork();

		/**
		 * The meta object literal for the '<em><b>Chain ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_NETWORK__CHAIN_ID = eINSTANCE.getTokenNetwork_ChainID();

		/**
		 * The meta object literal for the '<em><b>RPC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_NETWORK__RPC = eINSTANCE.getTokenNetwork_RPC();

		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.TokenPairImpl <em>Token Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.TokenPairImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTokenPair()
		 * @generated
		 */
		EClass TOKEN_PAIR = eINSTANCE.getTokenPair();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOKEN_PAIR__PRICE = eINSTANCE.getTokenPair_Price();

		/**
		 * The meta object literal for the '<em><b>Token A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_PAIR__TOKEN_A = eINSTANCE.getTokenPair_TokenA();

		/**
		 * The meta object literal for the '<em><b>Token B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_PAIR__TOKEN_B = eINSTANCE.getTokenPair_TokenB();

		/**
		 * The meta object literal for the '{@link CryptoExchange.impl.TransferRequestImpl <em>Transfer Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.impl.TransferRequestImpl
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTransferRequest()
		 * @generated
		 */
		EClass TRANSFER_REQUEST = eINSTANCE.getTransferRequest();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_REQUEST__TYPE = eINSTANCE.getTransferRequest_Type();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_REQUEST__AMOUNT = eINSTANCE.getTransferRequest_Amount();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_REQUEST__TOKEN = eINSTANCE.getTransferRequest_Token();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_REQUEST__DESTINATION = eINSTANCE.getTransferRequest_Destination();

		/**
		 * The meta object literal for the '{@link CryptoExchange.OrderType <em>Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.OrderType
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getOrderType()
		 * @generated
		 */
		EEnum ORDER_TYPE = eINSTANCE.getOrderType();

		/**
		 * The meta object literal for the '{@link CryptoExchange.LeverageType <em>Leverage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.LeverageType
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getLeverageType()
		 * @generated
		 */
		EEnum LEVERAGE_TYPE = eINSTANCE.getLeverageType();

		/**
		 * The meta object literal for the '{@link CryptoExchange.SubSystemName <em>Sub System Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.SubSystemName
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getSubSystemName()
		 * @generated
		 */
		EEnum SUB_SYSTEM_NAME = eINSTANCE.getSubSystemName();

		/**
		 * The meta object literal for the '{@link CryptoExchange.TransferType <em>Transfer Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoExchange.TransferType
		 * @see CryptoExchange.impl.CryptoExchangePackageImpl#getTransferType()
		 * @generated
		 */
		EEnum TRANSFER_TYPE = eINSTANCE.getTransferType();

	}

} //CryptoExchangePackage
