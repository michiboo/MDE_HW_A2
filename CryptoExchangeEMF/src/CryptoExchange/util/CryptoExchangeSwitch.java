/**
 */
package CryptoExchange.util;

import CryptoExchange.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CryptoExchange.CryptoExchangePackage
 * @generated
 */
public class CryptoExchangeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CryptoExchangePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoExchangeSwitch() {
		if (modelPackage == null) {
			modelPackage = CryptoExchangePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CryptoExchangePackage.CRYPTO_EXCHANGE: {
				CryptoExchange cryptoExchange = (CryptoExchange)theEObject;
				T result = caseCryptoExchange(cryptoExchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CryptoExchangePackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T result = caseAccount(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CryptoExchangePackage.ORDER: {
				Order order = (Order)theEObject;
				T result = caseOrder(order);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CryptoExchangePackage.SAVING_ORDER: {
				SavingOrder savingOrder = (SavingOrder)theEObject;
				T result = caseSavingOrder(savingOrder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CryptoExchangePackage.SUB_SYSTEM: {
				SubSystem subSystem = (SubSystem)theEObject;
				T result = caseSubSystem(subSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CryptoExchangePackage.TOKEN: {
				Token token = (Token)theEObject;
				T result = caseToken(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CryptoExchangePackage.TOKEN_BALANCE: {
				TokenBalance tokenBalance = (TokenBalance)theEObject;
				T result = caseTokenBalance(tokenBalance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CryptoExchangePackage.TOKEN_NETWORK: {
				TokenNetwork tokenNetwork = (TokenNetwork)theEObject;
				T result = caseTokenNetwork(tokenNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CryptoExchangePackage.TOKEN_PAIR: {
				TokenPair tokenPair = (TokenPair)theEObject;
				T result = caseTokenPair(tokenPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CryptoExchangePackage.TRANSFER_REQUEST: {
				TransferRequest transferRequest = (TransferRequest)theEObject;
				T result = caseTransferRequest(transferRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crypto Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crypto Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCryptoExchange(CryptoExchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrder(Order object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Saving Order</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Saving Order</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSavingOrder(SavingOrder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSystem(SubSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Balance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Balance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenBalance(TokenBalance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenNetwork(TokenNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTokenPair(TokenPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferRequest(TransferRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CryptoExchangeSwitch
