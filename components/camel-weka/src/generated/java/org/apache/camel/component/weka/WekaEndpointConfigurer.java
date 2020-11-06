/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.weka;

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
public class WekaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("command", org.apache.camel.component.weka.WekaConfiguration.Command.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("apply", java.lang.String.class);
        map.put("build", java.lang.String.class);
        map.put("dsname", java.lang.String.class);
        map.put("folds", int.class);
        map.put("loadFrom", java.lang.String.class);
        map.put("saveTo", java.lang.String.class);
        map.put("seed", int.class);
        map.put("xval", boolean.class);
        map.put("path", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(WekaEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WekaEndpoint target = (WekaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apply": target.getConfiguration().setApply(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "build": target.getConfiguration().setBuild(property(camelContext, java.lang.String.class, value)); return true;
        case "dsname": target.getConfiguration().setDsname(property(camelContext, java.lang.String.class, value)); return true;
        case "folds": target.getConfiguration().setFolds(property(camelContext, int.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "loadfrom":
        case "loadFrom": target.getConfiguration().setLoadFrom(property(camelContext, java.lang.String.class, value)); return true;
        case "path": target.getConfiguration().setPath(property(camelContext, java.lang.String.class, value)); return true;
        case "saveto":
        case "saveTo": target.getConfiguration().setSaveTo(property(camelContext, java.lang.String.class, value)); return true;
        case "seed": target.getConfiguration().setSeed(property(camelContext, int.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "xval": target.getConfiguration().setXval(property(camelContext, boolean.class, value)); return true;
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
        case "apply": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "build": return java.lang.String.class;
        case "dsname": return java.lang.String.class;
        case "folds": return int.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "loadfrom":
        case "loadFrom": return java.lang.String.class;
        case "path": return java.lang.String.class;
        case "saveto":
        case "saveTo": return java.lang.String.class;
        case "seed": return int.class;
        case "synchronous": return boolean.class;
        case "xval": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WekaEndpoint target = (WekaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apply": return target.getConfiguration().getApply();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "build": return target.getConfiguration().getBuild();
        case "dsname": return target.getConfiguration().getDsname();
        case "folds": return target.getConfiguration().getFolds();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "loadfrom":
        case "loadFrom": return target.getConfiguration().getLoadFrom();
        case "path": return target.getConfiguration().getPath();
        case "saveto":
        case "saveTo": return target.getConfiguration().getSaveTo();
        case "seed": return target.getConfiguration().getSeed();
        case "synchronous": return target.isSynchronous();
        case "xval": return target.getConfiguration().isXval();
        default: return null;
        }
    }
}

