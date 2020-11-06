/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.nsq;

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
public class NsqEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("topic", java.lang.String.class);
        map.put("servers", java.lang.String.class);
        map.put("userAgent", java.lang.String.class);
        map.put("autoFinish", java.lang.Boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("channel", java.lang.String.class);
        map.put("customNSQLookup", com.github.brainlag.nsq.lookup.NSQLookup.class);
        map.put("lookupInterval", long.class);
        map.put("lookupServerPort", int.class);
        map.put("messageTimeout", long.class);
        map.put("poolSize", int.class);
        map.put("requeueInterval", long.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("port", int.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("secure", boolean.class);
        map.put("sslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(NsqEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        NsqEndpoint target = (NsqEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autofinish":
        case "autoFinish": target.getConfiguration().setAutoFinish(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "channel": target.getConfiguration().setChannel(property(camelContext, java.lang.String.class, value)); return true;
        case "customnsqlookup":
        case "customNSQLookup": target.getConfiguration().setCustomNSQLookup(property(camelContext, com.github.brainlag.nsq.lookup.NSQLookup.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lookupinterval":
        case "lookupInterval": target.getConfiguration().setLookupInterval(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "lookupserverport":
        case "lookupServerPort": target.getConfiguration().setLookupServerPort(property(camelContext, int.class, value)); return true;
        case "messagetimeout":
        case "messageTimeout": target.getConfiguration().setMessageTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "poolsize":
        case "poolSize": target.getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "port": target.getConfiguration().setPort(property(camelContext, int.class, value)); return true;
        case "requeueinterval":
        case "requeueInterval": target.getConfiguration().setRequeueInterval(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "secure": target.getConfiguration().setSecure(property(camelContext, boolean.class, value)); return true;
        case "servers": target.getConfiguration().setServers(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "useragent":
        case "userAgent": target.getConfiguration().setUserAgent(property(camelContext, java.lang.String.class, value)); return true;
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
        case "autofinish":
        case "autoFinish": return java.lang.Boolean.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "channel": return java.lang.String.class;
        case "customnsqlookup":
        case "customNSQLookup": return com.github.brainlag.nsq.lookup.NSQLookup.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "lookupinterval":
        case "lookupInterval": return long.class;
        case "lookupserverport":
        case "lookupServerPort": return int.class;
        case "messagetimeout":
        case "messageTimeout": return long.class;
        case "poolsize":
        case "poolSize": return int.class;
        case "port": return int.class;
        case "requeueinterval":
        case "requeueInterval": return long.class;
        case "secure": return boolean.class;
        case "servers": return java.lang.String.class;
        case "sslcontextparameters":
        case "sslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "synchronous": return boolean.class;
        case "useragent":
        case "userAgent": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        NsqEndpoint target = (NsqEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "autofinish":
        case "autoFinish": return target.getConfiguration().getAutoFinish();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "channel": return target.getConfiguration().getChannel();
        case "customnsqlookup":
        case "customNSQLookup": return target.getConfiguration().getCustomNSQLookup();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lookupinterval":
        case "lookupInterval": return target.getConfiguration().getLookupInterval();
        case "lookupserverport":
        case "lookupServerPort": return target.getConfiguration().getLookupServerPort();
        case "messagetimeout":
        case "messageTimeout": return target.getConfiguration().getMessageTimeout();
        case "poolsize":
        case "poolSize": return target.getConfiguration().getPoolSize();
        case "port": return target.getConfiguration().getPort();
        case "requeueinterval":
        case "requeueInterval": return target.getConfiguration().getRequeueInterval();
        case "secure": return target.getConfiguration().isSecure();
        case "servers": return target.getConfiguration().getServers();
        case "sslcontextparameters":
        case "sslContextParameters": return target.getConfiguration().getSslContextParameters();
        case "synchronous": return target.isSynchronous();
        case "useragent":
        case "userAgent": return target.getConfiguration().getUserAgent();
        default: return null;
        }
    }
}

