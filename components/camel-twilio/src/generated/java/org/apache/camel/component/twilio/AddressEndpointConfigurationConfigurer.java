/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.twilio.AddressEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AddressEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.twilio.internal.TwilioApiName.class);
        map.put("City", java.lang.String.class);
        map.put("CustomerName", java.lang.String.class);
        map.put("IsoCountry", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("PathAccountSid", java.lang.String.class);
        map.put("PathSid", java.lang.String.class);
        map.put("PostalCode", java.lang.String.class);
        map.put("Region", java.lang.String.class);
        map.put("Street", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.twilio.AddressEndpointConfiguration target = (org.apache.camel.component.twilio.AddressEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.twilio.internal.TwilioApiName.class, value)); return true;
        case "city":
        case "City": target.setCity(property(camelContext, java.lang.String.class, value)); return true;
        case "customername":
        case "CustomerName": target.setCustomerName(property(camelContext, java.lang.String.class, value)); return true;
        case "isocountry":
        case "IsoCountry": target.setIsoCountry(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "pathaccountsid":
        case "PathAccountSid": target.setPathAccountSid(property(camelContext, java.lang.String.class, value)); return true;
        case "pathsid":
        case "PathSid": target.setPathSid(property(camelContext, java.lang.String.class, value)); return true;
        case "postalcode":
        case "PostalCode": target.setPostalCode(property(camelContext, java.lang.String.class, value)); return true;
        case "region":
        case "Region": target.setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "street":
        case "Street": target.setStreet(property(camelContext, java.lang.String.class, value)); return true;
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
        case "city":
        case "City": return java.lang.String.class;
        case "customername":
        case "CustomerName": return java.lang.String.class;
        case "isocountry":
        case "IsoCountry": return java.lang.String.class;
        case "methodname":
        case "MethodName": return java.lang.String.class;
        case "pathaccountsid":
        case "PathAccountSid": return java.lang.String.class;
        case "pathsid":
        case "PathSid": return java.lang.String.class;
        case "postalcode":
        case "PostalCode": return java.lang.String.class;
        case "region":
        case "Region": return java.lang.String.class;
        case "street":
        case "Street": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.twilio.AddressEndpointConfiguration target = (org.apache.camel.component.twilio.AddressEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "city":
        case "City": return target.getCity();
        case "customername":
        case "CustomerName": return target.getCustomerName();
        case "isocountry":
        case "IsoCountry": return target.getIsoCountry();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "pathaccountsid":
        case "PathAccountSid": return target.getPathAccountSid();
        case "pathsid":
        case "PathSid": return target.getPathSid();
        case "postalcode":
        case "PostalCode": return target.getPostalCode();
        case "region":
        case "Region": return target.getRegion();
        case "street":
        case "Street": return target.getStreet();
        default: return null;
        }
    }
}

