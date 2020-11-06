/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.cw;

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
public class Cw2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("amazonCwClient", software.amazon.awssdk.services.cloudwatch.CloudWatchClient.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("configuration", org.apache.camel.component.aws2.cw.Cw2Configuration.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("name", java.lang.String.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        map.put("region", java.lang.String.class);
        map.put("timestamp", java.time.Instant.class);
        map.put("trustAllCertificates", boolean.class);
        map.put("unit", java.lang.String.class);
        map.put("value", java.lang.Double.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("accessKey", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(Cw2ComponentConfigurer::clearBootstrapConfigurers);
    }

    private org.apache.camel.component.aws2.cw.Cw2Configuration getOrCreateConfiguration(Cw2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.cw.Cw2Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Cw2Component target = (Cw2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazoncwclient":
        case "amazonCwClient": getOrCreateConfiguration(target).setAmazonCwClient(property(camelContext, software.amazon.awssdk.services.cloudwatch.CloudWatchClient.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.cw.Cw2Configuration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "name": getOrCreateConfiguration(target).setName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "timestamp": getOrCreateConfiguration(target).setTimestamp(property(camelContext, java.time.Instant.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": getOrCreateConfiguration(target).setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        case "unit": getOrCreateConfiguration(target).setUnit(property(camelContext, java.lang.String.class, value)); return true;
        case "value": getOrCreateConfiguration(target).setValue(property(camelContext, java.lang.Double.class, value)); return true;
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
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazoncwclient":
        case "amazonCwClient": return software.amazon.awssdk.services.cloudwatch.CloudWatchClient.class;
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "configuration": return org.apache.camel.component.aws2.cw.Cw2Configuration.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "name": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "timestamp": return java.time.Instant.class;
        case "trustallcertificates":
        case "trustAllCertificates": return boolean.class;
        case "unit": return java.lang.String.class;
        case "value": return java.lang.Double.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Cw2Component target = (Cw2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazoncwclient":
        case "amazonCwClient": return getOrCreateConfiguration(target).getAmazonCwClient();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "configuration": return target.getConfiguration();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "name": return getOrCreateConfiguration(target).getName();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "timestamp": return getOrCreateConfiguration(target).getTimestamp();
        case "trustallcertificates":
        case "trustAllCertificates": return getOrCreateConfiguration(target).isTrustAllCertificates();
        case "unit": return getOrCreateConfiguration(target).getUnit();
        case "value": return getOrCreateConfiguration(target).getValue();
        default: return null;
        }
    }
}

