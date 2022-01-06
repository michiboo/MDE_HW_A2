/**
 */
package CryptoExchange.impl;

import CryptoExchange.CryptoExchange;
import CryptoExchange.CryptoExchangePackage;
import CryptoExchange.SubSystem;
import CryptoExchange.Token;
import CryptoExchange.TokenNetwork;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crypto Exchange</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.impl.CryptoExchangeImpl#getIP <em>IP</em>}</li>
 *   <li>{@link CryptoExchange.impl.CryptoExchangeImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link CryptoExchange.impl.CryptoExchangeImpl#getSubSystem <em>Sub System</em>}</li>
 *   <li>{@link CryptoExchange.impl.CryptoExchangeImpl#getTokens <em>Tokens</em>}</li>
 *   <li>{@link CryptoExchange.impl.CryptoExchangeImpl#getTokenNetworks <em>Token Networks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CryptoExchangeImpl extends MinimalEObjectImpl.Container implements CryptoExchange {
	/**
	 * The default value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIP() <em>IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIP()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubSystem() <em>Sub System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<SubSystem> subSystem;

	/**
	 * The cached value of the '{@link #getTokens() <em>Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> tokens;

	/**
	 * The cached value of the '{@link #getTokenNetworks() <em>Token Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<TokenNetwork> tokenNetworks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CryptoExchangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoExchangePackage.Literals.CRYPTO_EXCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIP() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIP(String newIP) {
		String oldIP = ip;
		ip = newIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackage.CRYPTO_EXCHANGE__IP, oldIP, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoExchangePackage.CRYPTO_EXCHANGE__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubSystem> getSubSystem() {
		if (subSystem == null) {
			subSystem = new EObjectContainmentEList<SubSystem>(SubSystem.class, this, CryptoExchangePackage.CRYPTO_EXCHANGE__SUB_SYSTEM);
		}
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getTokens() {
		if (tokens == null) {
			tokens = new EObjectContainmentEList<Token>(Token.class, this, CryptoExchangePackage.CRYPTO_EXCHANGE__TOKENS);
		}
		return tokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TokenNetwork> getTokenNetworks() {
		if (tokenNetworks == null) {
			tokenNetworks = new EObjectContainmentEList<TokenNetwork>(TokenNetwork.class, this, CryptoExchangePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS);
		}
		return tokenNetworks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CryptoExchangePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				return ((InternalEList<?>)getSubSystem()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKENS:
				return ((InternalEList<?>)getTokens()).basicRemove(otherEnd, msgs);
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				return ((InternalEList<?>)getTokenNetworks()).basicRemove(otherEnd, msgs);
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
			case CryptoExchangePackage.CRYPTO_EXCHANGE__IP:
				return getIP();
			case CryptoExchangePackage.CRYPTO_EXCHANGE__DOMAIN_NAME:
				return getDomainName();
			case CryptoExchangePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				return getSubSystem();
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKENS:
				return getTokens();
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				return getTokenNetworks();
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
			case CryptoExchangePackage.CRYPTO_EXCHANGE__IP:
				setIP((String)newValue);
				return;
			case CryptoExchangePackage.CRYPTO_EXCHANGE__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case CryptoExchangePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				getSubSystem().clear();
				getSubSystem().addAll((Collection<? extends SubSystem>)newValue);
				return;
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKENS:
				getTokens().clear();
				getTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				getTokenNetworks().clear();
				getTokenNetworks().addAll((Collection<? extends TokenNetwork>)newValue);
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
			case CryptoExchangePackage.CRYPTO_EXCHANGE__IP:
				setIP(IP_EDEFAULT);
				return;
			case CryptoExchangePackage.CRYPTO_EXCHANGE__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case CryptoExchangePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				getSubSystem().clear();
				return;
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKENS:
				getTokens().clear();
				return;
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				getTokenNetworks().clear();
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
			case CryptoExchangePackage.CRYPTO_EXCHANGE__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case CryptoExchangePackage.CRYPTO_EXCHANGE__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case CryptoExchangePackage.CRYPTO_EXCHANGE__SUB_SYSTEM:
				return subSystem != null && !subSystem.isEmpty();
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKENS:
				return tokens != null && !tokens.isEmpty();
			case CryptoExchangePackage.CRYPTO_EXCHANGE__TOKEN_NETWORKS:
				return tokenNetworks != null && !tokenNetworks.isEmpty();
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
		result.append(" (IP: ");
		result.append(ip);
		result.append(", DomainName: ");
		result.append(domainName);
		result.append(')');
		return result.toString();
	}

} //CryptoExchangeImpl
