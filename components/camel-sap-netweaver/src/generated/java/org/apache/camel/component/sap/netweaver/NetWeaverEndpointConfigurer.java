/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sap.netweaver;

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
public class NetWeaverEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("url", java.lang.String.class);
        map.put("flatternMap", boolean.class);
        map.put("json", boolean.class);
        map.put("jsonAsMap", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("password", java.lang.String.class);
        map.put("username", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(NetWeaverEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        NetWeaverEndpoint target = (NetWeaverEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "flatternmap":
        case "flatternMap": target.setFlatternMap(property(camelContext, boolean.class, value)); return true;
        case "json": target.setJson(property(camelContext, boolean.class, value)); return true;
        case "jsonasmap":
        case "jsonAsMap": target.setJsonAsMap(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
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
        case "flatternmap":
        case "flatternMap": return boolean.class;
        case "json": return boolean.class;
        case "jsonasmap":
        case "jsonAsMap": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "password": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        NetWeaverEndpoint target = (NetWeaverEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "flatternmap":
        case "flatternMap": return target.isFlatternMap();
        case "json": return target.isJson();
        case "jsonasmap":
        case "jsonAsMap": return target.isJsonAsMap();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "password": return target.getPassword();
        case "synchronous": return target.isSynchronous();
        case "username": return target.getUsername();
        default: return null;
        }
    }
}

