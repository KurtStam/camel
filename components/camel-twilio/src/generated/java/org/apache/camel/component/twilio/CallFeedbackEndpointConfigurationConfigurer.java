/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.twilio.CallFeedbackEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CallFeedbackEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.twilio.internal.TwilioApiName.class);
        map.put("MethodName", java.lang.String.class);
        map.put("PathAccountSid", java.lang.String.class);
        map.put("PathCallSid", java.lang.String.class);
        map.put("QualityScore", java.lang.Integer.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.twilio.CallFeedbackEndpointConfiguration target = (org.apache.camel.component.twilio.CallFeedbackEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.twilio.internal.TwilioApiName.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "pathaccountsid":
        case "PathAccountSid": target.setPathAccountSid(property(camelContext, java.lang.String.class, value)); return true;
        case "pathcallsid":
        case "PathCallSid": target.setPathCallSid(property(camelContext, java.lang.String.class, value)); return true;
        case "qualityscore":
        case "QualityScore": target.setQualityScore(property(camelContext, java.lang.Integer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return org.apache.camel.component.twilio.internal.TwilioApiName.class;
        case "methodname":
        case "MethodName": return java.lang.String.class;
        case "pathaccountsid":
        case "PathAccountSid": return java.lang.String.class;
        case "pathcallsid":
        case "PathCallSid": return java.lang.String.class;
        case "qualityscore":
        case "QualityScore": return java.lang.Integer.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.twilio.CallFeedbackEndpointConfiguration target = (org.apache.camel.component.twilio.CallFeedbackEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "pathaccountsid":
        case "PathAccountSid": return target.getPathAccountSid();
        case "pathcallsid":
        case "PathCallSid": return target.getPathCallSid();
        case "qualityscore":
        case "QualityScore": return target.getQualityScore();
        default: return null;
        }
    }
}

