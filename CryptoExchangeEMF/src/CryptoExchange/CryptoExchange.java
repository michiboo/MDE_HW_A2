/**
 */
package CryptoExchange;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crypto Exchange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.CryptoExchange#getIP <em>IP</em>}</li>
 *   <li>{@link CryptoExchange.CryptoExchange#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link CryptoExchange.CryptoExchange#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link CryptoExchange.CryptoExchange#getTokens <em>Tokens</em>}</li>
 *   <li>{@link CryptoExchange.CryptoExchange#getTokenNetworks <em>Token Networks</em>}</li>
 * </ul>
 *
 * @see CryptoExchange.CryptoExchangePackage#getCryptoExchange()
 * @model
 * @generated
 */
public interface CryptoExchange extends EObject {
	/**
	 * Returns the value of the '<em><b>IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IP</em>' attribute.
	 * @see #setIP(String)
	 * @see CryptoExchange.CryptoExchangePackage#getCryptoExchange_IP()
	 * @model
	 * @generated
	 */
	String getIP();

	/**
	 * Sets the value of the '{@link CryptoExchange.CryptoExchange#getIP <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP</em>' attribute.
	 * @see #getIP()
	 * @generated
	 */
	void setIP(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see CryptoExchange.CryptoExchangePackage#getCryptoExchange_DomainName()
	 * @model
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link CryptoExchange.CryptoExchange#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Sub System</b></em>' containment reference list.
	 * The list contents are of type {@link CryptoExchange.SubSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub System</em>' containment reference list.
	 * @see CryptoExchange.CryptoExchangePackage#getCryptoExchange_SubSystem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SubSystem> getSubSystem();

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link CryptoExchange.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see CryptoExchange.CryptoExchangePackage#getCryptoExchange_Tokens()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * Returns the value of the '<em><b>Token Networks</b></em>' containment reference list.
	 * The list contents are of type {@link CryptoExchange.TokenNetwork}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Networks</em>' containment reference list.
	 * @see CryptoExchange.CryptoExchangePackage#getCryptoExchange_TokenNetworks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TokenNetwork> getTokenNetworks();

} // CryptoExchange
