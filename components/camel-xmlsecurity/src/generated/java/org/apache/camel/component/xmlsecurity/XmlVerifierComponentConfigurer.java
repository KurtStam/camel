/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xmlsecurity;

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
public class XmlVerifierComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("baseUri", java.lang.String.class);
        map.put("clearHeaders", java.lang.Boolean.class);
        map.put("cryptoContextProperties", java.util.Map.class);
        map.put("disallowDoctypeDecl", java.lang.Boolean.class);
        map.put("keySelector", javax.xml.crypto.KeySelector.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("omitXmlDeclaration", java.lang.Boolean.class);
        map.put("outputNodeSearch", java.lang.Object.class);
        map.put("outputNodeSearchType", java.lang.String.class);
        map.put("outputXmlEncoding", java.lang.String.class);
        map.put("removeSignatureElements", java.lang.Boolean.class);
        map.put("schemaResourceUri", java.lang.String.class);
        map.put("secureValidation", java.lang.Boolean.class);
        map.put("validationFailedHandler", org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class);
        map.put("xmlSignature2Message", org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class);
        map.put("xmlSignatureChecker", org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("uriDereferencer", javax.xml.crypto.URIDereferencer.class);
        map.put("verifierConfiguration", org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(XmlVerifierComponentConfigurer::clearBootstrapConfigurers);
    }

    private org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration getOrCreateVerifierConfiguration(XmlVerifierComponent target) {
        if (target.getVerifierConfiguration() == null) {
            target.setVerifierConfiguration(new org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration());
        }
        return target.getVerifierConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XmlVerifierComponent target = (XmlVerifierComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "baseuri":
        case "baseUri": getOrCreateVerifierConfiguration(target).setBaseUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clearheaders":
        case "clearHeaders": getOrCreateVerifierConfiguration(target).setClearHeaders(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "cryptocontextproperties":
        case "cryptoContextProperties": getOrCreateVerifierConfiguration(target).setCryptoContextProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": getOrCreateVerifierConfiguration(target).setDisallowDoctypeDecl(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "keyselector":
        case "keySelector": getOrCreateVerifierConfiguration(target).setKeySelector(property(camelContext, javax.xml.crypto.KeySelector.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "omitxmldeclaration":
        case "omitXmlDeclaration": getOrCreateVerifierConfiguration(target).setOmitXmlDeclaration(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "outputnodesearch":
        case "outputNodeSearch": getOrCreateVerifierConfiguration(target).setOutputNodeSearch(property(camelContext, java.lang.Object.class, value)); return true;
        case "outputnodesearchtype":
        case "outputNodeSearchType": getOrCreateVerifierConfiguration(target).setOutputNodeSearchType(property(camelContext, java.lang.String.class, value)); return true;
        case "outputxmlencoding":
        case "outputXmlEncoding": getOrCreateVerifierConfiguration(target).setOutputXmlEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "removesignatureelements":
        case "removeSignatureElements": getOrCreateVerifierConfiguration(target).setRemoveSignatureElements(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "schemaresourceuri":
        case "schemaResourceUri": getOrCreateVerifierConfiguration(target).setSchemaResourceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "securevalidation":
        case "secureValidation": getOrCreateVerifierConfiguration(target).setSecureValidation(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "uridereferencer":
        case "uriDereferencer": getOrCreateVerifierConfiguration(target).setUriDereferencer(property(camelContext, javax.xml.crypto.URIDereferencer.class, value)); return true;
        case "validationfailedhandler":
        case "validationFailedHandler": getOrCreateVerifierConfiguration(target).setValidationFailedHandler(property(camelContext, org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class, value)); return true;
        case "verifierconfiguration":
        case "verifierConfiguration": target.setVerifierConfiguration(property(camelContext, org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration.class, value)); return true;
        case "xmlsignature2message":
        case "xmlSignature2Message": getOrCreateVerifierConfiguration(target).setXmlSignature2Message(property(camelContext, org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class, value)); return true;
        case "xmlsignaturechecker":
        case "xmlSignatureChecker": getOrCreateVerifierConfiguration(target).setXmlSignatureChecker(property(camelContext, org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class, value)); return true;
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
        case "baseuri":
        case "baseUri": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "clearheaders":
        case "clearHeaders": return java.lang.Boolean.class;
        case "cryptocontextproperties":
        case "cryptoContextProperties": return java.util.Map.class;
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": return java.lang.Boolean.class;
        case "keyselector":
        case "keySelector": return javax.xml.crypto.KeySelector.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "omitxmldeclaration":
        case "omitXmlDeclaration": return java.lang.Boolean.class;
        case "outputnodesearch":
        case "outputNodeSearch": return java.lang.Object.class;
        case "outputnodesearchtype":
        case "outputNodeSearchType": return java.lang.String.class;
        case "outputxmlencoding":
        case "outputXmlEncoding": return java.lang.String.class;
        case "removesignatureelements":
        case "removeSignatureElements": return java.lang.Boolean.class;
        case "schemaresourceuri":
        case "schemaResourceUri": return java.lang.String.class;
        case "securevalidation":
        case "secureValidation": return java.lang.Boolean.class;
        case "uridereferencer":
        case "uriDereferencer": return javax.xml.crypto.URIDereferencer.class;
        case "validationfailedhandler":
        case "validationFailedHandler": return org.apache.camel.component.xmlsecurity.api.ValidationFailedHandler.class;
        case "verifierconfiguration":
        case "verifierConfiguration": return org.apache.camel.component.xmlsecurity.processor.XmlVerifierConfiguration.class;
        case "xmlsignature2message":
        case "xmlSignature2Message": return org.apache.camel.component.xmlsecurity.api.XmlSignature2Message.class;
        case "xmlsignaturechecker":
        case "xmlSignatureChecker": return org.apache.camel.component.xmlsecurity.api.XmlSignatureChecker.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        XmlVerifierComponent target = (XmlVerifierComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "baseuri":
        case "baseUri": return getOrCreateVerifierConfiguration(target).getBaseUri();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clearheaders":
        case "clearHeaders": return getOrCreateVerifierConfiguration(target).getClearHeaders();
        case "cryptocontextproperties":
        case "cryptoContextProperties": return getOrCreateVerifierConfiguration(target).getCryptoContextProperties();
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": return getOrCreateVerifierConfiguration(target).getDisallowDoctypeDecl();
        case "keyselector":
        case "keySelector": return getOrCreateVerifierConfiguration(target).getKeySelector();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "omitxmldeclaration":
        case "omitXmlDeclaration": return getOrCreateVerifierConfiguration(target).getOmitXmlDeclaration();
        case "outputnodesearch":
        case "outputNodeSearch": return getOrCreateVerifierConfiguration(target).getOutputNodeSearch();
        case "outputnodesearchtype":
        case "outputNodeSearchType": return getOrCreateVerifierConfiguration(target).getOutputNodeSearchType();
        case "outputxmlencoding":
        case "outputXmlEncoding": return getOrCreateVerifierConfiguration(target).getOutputXmlEncoding();
        case "removesignatureelements":
        case "removeSignatureElements": return getOrCreateVerifierConfiguration(target).getRemoveSignatureElements();
        case "schemaresourceuri":
        case "schemaResourceUri": return getOrCreateVerifierConfiguration(target).getSchemaResourceUri();
        case "securevalidation":
        case "secureValidation": return getOrCreateVerifierConfiguration(target).getSecureValidation();
        case "uridereferencer":
        case "uriDereferencer": return getOrCreateVerifierConfiguration(target).getUriDereferencer();
        case "validationfailedhandler":
        case "validationFailedHandler": return getOrCreateVerifierConfiguration(target).getValidationFailedHandler();
        case "verifierconfiguration":
        case "verifierConfiguration": return target.getVerifierConfiguration();
        case "xmlsignature2message":
        case "xmlSignature2Message": return getOrCreateVerifierConfiguration(target).getXmlSignature2Message();
        case "xmlsignaturechecker":
        case "xmlSignatureChecker": return getOrCreateVerifierConfiguration(target).getXmlSignatureChecker();
        default: return null;
        }
    }
}

