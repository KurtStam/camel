/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.crypto;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DigitalSignatureEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("cryptoOperation", org.apache.camel.component.crypto.CryptoOperation.class);
        map.put("name", java.lang.String.class);
        map.put("algorithm", java.lang.String.class);
        map.put("alias", java.lang.String.class);
        map.put("certificateName", java.lang.String.class);
        map.put("keystore", java.security.KeyStore.class);
        map.put("keystoreName", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("privateKey", java.security.PrivateKey.class);
        map.put("privateKeyName", java.lang.String.class);
        map.put("provider", java.lang.String.class);
        map.put("publicKeyName", java.lang.String.class);
        map.put("secureRandomName", java.lang.String.class);
        map.put("signatureHeaderName", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("bufferSize", java.lang.Integer.class);
        map.put("certificate", java.security.cert.Certificate.class);
        map.put("clearHeaders", boolean.class);
        map.put("keyStoreParameters", org.apache.camel.support.jsse.KeyStoreParameters.class);
        map.put("publicKey", java.security.PublicKey.class);
        map.put("secureRandom", java.security.SecureRandom.class);
        map.put("synchronous", boolean.class);
        map.put("password", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(DigitalSignatureEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DigitalSignatureEndpoint target = (DigitalSignatureEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "algorithm": target.getConfiguration().setAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "alias": target.getConfiguration().setAlias(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "buffersize":
        case "bufferSize": target.getConfiguration().setBufferSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "certificate": target.getConfiguration().setCertificate(property(camelContext, java.security.cert.Certificate.class, value)); return true;
        case "certificatename":
        case "certificateName": target.getConfiguration().setCertificateName(property(camelContext, java.lang.String.class, value)); return true;
        case "clearheaders":
        case "clearHeaders": target.getConfiguration().setClearHeaders(property(camelContext, boolean.class, value)); return true;
        case "keystoreparameters":
        case "keyStoreParameters": target.getConfiguration().setKeyStoreParameters(property(camelContext, org.apache.camel.support.jsse.KeyStoreParameters.class, value)); return true;
        case "keystore": target.getConfiguration().setKeystore(property(camelContext, java.security.KeyStore.class, value)); return true;
        case "keystorename":
        case "keystoreName": target.getConfiguration().setKeystoreName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekey":
        case "privateKey": target.getConfiguration().setPrivateKey(property(camelContext, java.security.PrivateKey.class, value)); return true;
        case "privatekeyname":
        case "privateKeyName": target.getConfiguration().setPrivateKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "provider": target.getConfiguration().setProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "publickey":
        case "publicKey": target.getConfiguration().setPublicKey(property(camelContext, java.security.PublicKey.class, value)); return true;
        case "publickeyname":
        case "publicKeyName": target.getConfiguration().setPublicKeyName(property(camelContext, java.lang.String.class, value)); return true;
        case "securerandom":
        case "secureRandom": target.getConfiguration().setSecureRandom(property(camelContext, java.security.SecureRandom.class, value)); return true;
        case "securerandomname":
        case "secureRandomName": target.getConfiguration().setSecureRandomName(property(camelContext, java.lang.String.class, value)); return true;
        case "signatureheadername":
        case "signatureHeaderName": target.getConfiguration().setSignatureHeaderName(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "algorithm": return java.lang.String.class;
        case "alias": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "buffersize":
        case "bufferSize": return java.lang.Integer.class;
        case "certificate": return java.security.cert.Certificate.class;
        case "certificatename":
        case "certificateName": return java.lang.String.class;
        case "clearheaders":
        case "clearHeaders": return boolean.class;
        case "keystoreparameters":
        case "keyStoreParameters": return org.apache.camel.support.jsse.KeyStoreParameters.class;
        case "keystore": return java.security.KeyStore.class;
        case "keystorename":
        case "keystoreName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "privatekey":
        case "privateKey": return java.security.PrivateKey.class;
        case "privatekeyname":
        case "privateKeyName": return java.lang.String.class;
        case "provider": return java.lang.String.class;
        case "publickey":
        case "publicKey": return java.security.PublicKey.class;
        case "publickeyname":
        case "publicKeyName": return java.lang.String.class;
        case "securerandom":
        case "secureRandom": return java.security.SecureRandom.class;
        case "securerandomname":
        case "secureRandomName": return java.lang.String.class;
        case "signatureheadername":
        case "signatureHeaderName": return java.lang.String.class;
        case "synchronous": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DigitalSignatureEndpoint target = (DigitalSignatureEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "algorithm": return target.getConfiguration().getAlgorithm();
        case "alias": return target.getConfiguration().getAlias();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "buffersize":
        case "bufferSize": return target.getConfiguration().getBufferSize();
        case "certificate": return target.getConfiguration().getCertificate();
        case "certificatename":
        case "certificateName": return target.getConfiguration().getCertificateName();
        case "clearheaders":
        case "clearHeaders": return target.getConfiguration().isClearHeaders();
        case "keystoreparameters":
        case "keyStoreParameters": return target.getConfiguration().getKeyStoreParameters();
        case "keystore": return target.getConfiguration().getKeystore();
        case "keystorename":
        case "keystoreName": return target.getConfiguration().getKeystoreName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return target.getConfiguration().getPassword();
        case "privatekey":
        case "privateKey": return target.getConfiguration().getPrivateKey();
        case "privatekeyname":
        case "privateKeyName": return target.getConfiguration().getPrivateKeyName();
        case "provider": return target.getConfiguration().getProvider();
        case "publickey":
        case "publicKey": return target.getConfiguration().getPublicKey();
        case "publickeyname":
        case "publicKeyName": return target.getConfiguration().getPublicKeyName();
        case "securerandom":
        case "secureRandom": return target.getConfiguration().getSecureRandom();
        case "securerandomname":
        case "secureRandomName": return target.getConfiguration().getSecureRandomName();
        case "signatureheadername":
        case "signatureHeaderName": return target.getConfiguration().getSignatureHeaderName();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

