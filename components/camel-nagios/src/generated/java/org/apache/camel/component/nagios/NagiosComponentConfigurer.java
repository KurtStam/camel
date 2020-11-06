/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.nagios;

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
public class NagiosComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("connectionTimeout", int.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("timeout", int.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("configuration", org.apache.camel.component.nagios.NagiosConfiguration.class);
        map.put("encryption", com.googlecode.jsendnsca.encryption.Encryption.class);
        map.put("password", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(NagiosComponentConfigurer::clearBootstrapConfigurers);
    }

    private org.apache.camel.component.nagios.NagiosConfiguration getOrCreateConfiguration(NagiosComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.nagios.NagiosConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        NagiosComponent target = (NagiosComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.nagios.NagiosConfiguration.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": getOrCreateConfiguration(target).setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "encryption": getOrCreateConfiguration(target).setEncryption(property(camelContext, com.googlecode.jsendnsca.encryption.Encryption.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "timeout": getOrCreateConfiguration(target).setTimeout(property(camelContext, int.class, value)); return true;
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
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "configuration": return org.apache.camel.component.nagios.NagiosConfiguration.class;
        case "connectiontimeout":
        case "connectionTimeout": return int.class;
        case "encryption": return com.googlecode.jsendnsca.encryption.Encryption.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "timeout": return int.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        NagiosComponent target = (NagiosComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "configuration": return target.getConfiguration();
        case "connectiontimeout":
        case "connectionTimeout": return getOrCreateConfiguration(target).getConnectionTimeout();
        case "encryption": return getOrCreateConfiguration(target).getEncryption();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return getOrCreateConfiguration(target).getPassword();
        case "timeout": return getOrCreateConfiguration(target).getTimeout();
        default: return null;
        }
    }
}

