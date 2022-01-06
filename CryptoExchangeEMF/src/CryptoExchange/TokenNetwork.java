/**
 */
package CryptoExchange;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.TokenNetwork#getChainID <em>Chain ID</em>}</li>
 *   <li>{@link CryptoExchange.TokenNetwork#getRPC <em>RPC</em>}</li>
 * </ul>
 *
 * @see CryptoExchange.CryptoExchangePackage#getTokenNetwork()
 * @model
 * @generated
 */
public interface TokenNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Chain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain ID</em>' attribute.
	 * @see #setChainID(int)
	 * @see CryptoExchange.CryptoExchangePackage#getTokenNetwork_ChainID()
	 * @model
	 * @generated
	 */
	int getChainID();

	/**
	 * Sets the value of the '{@link CryptoExchange.TokenNetwork#getChainID <em>Chain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chain ID</em>' attribute.
	 * @see #getChainID()
	 * @generated
	 */
	void setChainID(int value);

	/**
	 * Returns the value of the '<em><b>RPC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RPC</em>' attribute.
	 * @see #setRPC(String)
	 * @see CryptoExchange.CryptoExchangePackage#getTokenNetwork_RPC()
	 * @model
	 * @generated
	 */
	String getRPC();

	/**
	 * Sets the value of the '{@link CryptoExchange.TokenNetwork#getRPC <em>RPC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPC</em>' attribute.
	 * @see #getRPC()
	 * @generated
	 */
	void setRPC(String value);

} // TokenNetwork
