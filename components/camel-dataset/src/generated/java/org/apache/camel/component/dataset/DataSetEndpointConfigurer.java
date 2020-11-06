/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dataset;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.mock.MockEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DataSetEndpointConfigurer extends MockEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("name", org.apache.camel.component.dataset.DataSet.class);
        map.put("dataSetIndex", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("initialDelay", long.class);
        map.put("minRate", int.class);
        map.put("preloadSize", long.class);
        map.put("produceDelay", long.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("assertPeriod", long.class);
        map.put("consumeDelay", long.class);
        map.put("expectedCount", int.class);
        map.put("failFast", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("reportGroup", int.class);
        map.put("resultMinimumWaitTime", long.class);
        map.put("resultWaitTime", long.class);
        map.put("retainFirst", int.class);
        map.put("retainLast", int.class);
        map.put("sleepForEmptyTest", long.class);
        map.put("copyOnExchange", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(DataSetEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DataSetEndpoint target = (DataSetEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumedelay":
        case "consumeDelay": target.setConsumeDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "datasetindex":
        case "dataSetIndex": target.setDataSetIndex(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "minrate":
        case "minRate": target.setMinRate(property(camelContext, int.class, value)); return true;
        case "preloadsize":
        case "preloadSize": target.setPreloadSize(property(camelContext, long.class, value)); return true;
        case "producedelay":
        case "produceDelay": target.setProduceDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
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
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "consumedelay":
        case "consumeDelay": return long.class;
        case "datasetindex":
        case "dataSetIndex": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "minrate":
        case "minRate": return int.class;
        case "preloadsize":
        case "preloadSize": return long.class;
        case "producedelay":
        case "produceDelay": return long.class;
        default: return super.getOptionType(name, ignoreCase);
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DataSetEndpoint target = (DataSetEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumedelay":
        case "consumeDelay": return target.getConsumeDelay();
        case "datasetindex":
        case "dataSetIndex": return target.getDataSetIndex();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "minrate":
        case "minRate": return target.getMinRate();
        case "preloadsize":
        case "preloadSize": return target.getPreloadSize();
        case "producedelay":
        case "produceDelay": return target.getProduceDelay();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

