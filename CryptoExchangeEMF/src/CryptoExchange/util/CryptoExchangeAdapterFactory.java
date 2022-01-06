/**
 */
package CryptoExchange.util;

import CryptoExchange.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CryptoExchange.CryptoExchangePackage
 * @generated
 */
public class CryptoExchangeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CryptoExchangePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CryptoExchangePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CryptoExchangeSwitch<Adapter> modelSwitch =
		new CryptoExchangeSwitch<Adapter>() {
			@Override
			public Adapter caseCryptoExchange(CryptoExchange object) {
				return createCryptoExchangeAdapter();
			}
			@Override
			public Adapter caseAccount(Account object) {
				return createAccountAdapter();
			}
			@Override
			public Adapter caseOrder(Order object) {
				return createOrderAdapter();
			}
			@Override
			public Adapter caseSavingOrder(SavingOrder object) {
				return createSavingOrderAdapter();
			}
			@Override
			public Adapter caseSubSystem(SubSystem object) {
				return createSubSystemAdapter();
			}
			@Override
			public Adapter caseToken(Token object) {
				return createTokenAdapter();
			}
			@Override
			public Adapter caseTokenBalance(TokenBalance object) {
				return createTokenBalanceAdapter();
			}
			@Override
			public Adapter caseTokenNetwork(TokenNetwork object) {
				return createTokenNetworkAdapter();
			}
			@Override
			public Adapter caseTokenPair(TokenPair object) {
				return createTokenPairAdapter();
			}
			@Override
			public Adapter caseTransferRequest(TransferRequest object) {
				return createTransferRequestAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.CryptoExchange <em>Crypto Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.CryptoExchange
	 * @generated
	 */
	public Adapter createCryptoExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.Account
	 * @generated
	 */
	public Adapter createAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.Order
	 * @generated
	 */
	public Adapter createOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.SavingOrder <em>Saving Order</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.SavingOrder
	 * @generated
	 */
	public Adapter createSavingOrderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.SubSystem
	 * @generated
	 */
	public Adapter createSubSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.Token
	 * @generated
	 */
	public Adapter createTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.TokenBalance <em>Token Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.TokenBalance
	 * @generated
	 */
	public Adapter createTokenBalanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.TokenNetwork <em>Token Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.TokenNetwork
	 * @generated
	 */
	public Adapter createTokenNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.TokenPair <em>Token Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.TokenPair
	 * @generated
	 */
	public Adapter createTokenPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoExchange.TransferRequest <em>Transfer Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoExchange.TransferRequest
	 * @generated
	 */
	public Adapter createTransferRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CryptoExchangeAdapterFactory
