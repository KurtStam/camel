/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.lambda;

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
public class Lambda2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("function", java.lang.String.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("operation", org.apache.camel.component.aws2.lambda.Lambda2Operations.class);
        map.put("pojoRequest", boolean.class);
        map.put("region", java.lang.String.class);
        map.put("trustAllCertificates", boolean.class);
        map.put("awsLambdaClient", software.amazon.awssdk.services.lambda.LambdaClient.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        map.put("accessKey", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(Lambda2EndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Lambda2Endpoint target = (Lambda2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": target.getConfiguration().setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "awslambdaclient":
        case "awsLambdaClient": target.getConfiguration().setAwsLambdaClient(property(camelContext, software.amazon.awssdk.services.lambda.LambdaClient.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.lambda.Lambda2Operations.class, value)); return true;
        case "pojorequest":
        case "pojoRequest": target.getConfiguration().setPojoRequest(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": target.getConfiguration().setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
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
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "awslambdaclient":
        case "awsLambdaClient": return software.amazon.awssdk.services.lambda.LambdaClient.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return org.apache.camel.component.aws2.lambda.Lambda2Operations.class;
        case "pojorequest":
        case "pojoRequest": return boolean.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "trustallcertificates":
        case "trustAllCertificates": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Lambda2Endpoint target = (Lambda2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "autodiscoverclient":
        case "autoDiscoverClient": return target.getConfiguration().isAutoDiscoverClient();
        case "awslambdaclient":
        case "awsLambdaClient": return target.getConfiguration().getAwsLambdaClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getConfiguration().getOperation();
        case "pojorequest":
        case "pojoRequest": return target.getConfiguration().isPojoRequest();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "region": return target.getConfiguration().getRegion();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "synchronous": return target.isSynchronous();
        case "trustallcertificates":
        case "trustAllCertificates": return target.getConfiguration().isTrustAllCertificates();
        default: return null;
        }
    }
}

