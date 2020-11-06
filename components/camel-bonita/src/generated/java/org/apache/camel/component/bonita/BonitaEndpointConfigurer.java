/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.bonita;

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
public class BonitaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("operation", org.apache.camel.component.bonita.util.BonitaOperation.class);
        map.put("hostname", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("port", java.lang.String.class);
        map.put("processName", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("password", java.lang.String.class);
        map.put("username", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(BonitaEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BonitaEndpoint target = (BonitaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "hostname": target.getConfiguration().setHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, java.lang.String.class, value)); return true;
        case "processname":
        case "processName": target.getConfiguration().setProcessName(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
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
        case "hostname": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "port": return java.lang.String.class;
        case "processname":
        case "processName": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BonitaEndpoint target = (BonitaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "hostname": return target.getConfiguration().getHostname();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return target.getConfiguration().getPassword();
        case "port": return target.getConfiguration().getPort();
        case "processname":
        case "processName": return target.getConfiguration().getProcessName();
        case "synchronous": return target.isSynchronous();
        case "username": return target.getConfiguration().getUsername();
        default: return null;
        }
    }
}

