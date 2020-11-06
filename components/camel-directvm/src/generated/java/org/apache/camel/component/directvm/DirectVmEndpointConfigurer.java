/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.directvm;

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
public class DirectVmEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("name", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("block", boolean.class);
        map.put("failIfNoConsumers", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("timeout", long.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("propagateProperties", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(DirectVmEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DirectVmEndpoint target = (DirectVmEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "block": target.setBlock(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "failifnoconsumers":
        case "failIfNoConsumers": target.setFailIfNoConsumers(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "propagateproperties":
        case "propagateProperties": target.setPropagateProperties(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
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
        case "block": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "failifnoconsumers":
        case "failIfNoConsumers": return boolean.class;
        case "headerfilterstrategy":
        case "headerFilterStrategy": return org.apache.camel.spi.HeaderFilterStrategy.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "propagateproperties":
        case "propagateProperties": return boolean.class;
        case "synchronous": return boolean.class;
        case "timeout": return long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DirectVmEndpoint target = (DirectVmEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "block": return target.isBlock();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "failifnoconsumers":
        case "failIfNoConsumers": return target.isFailIfNoConsumers();
        case "headerfilterstrategy":
        case "headerFilterStrategy": return target.getHeaderFilterStrategy();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "propagateproperties":
        case "propagateProperties": return target.isPropagateProperties();
        case "synchronous": return target.isSynchronous();
        case "timeout": return target.getTimeout();
        default: return null;
        }
    }
}

