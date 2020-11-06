/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms2;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.sjms.SjmsComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Sjms2ComponentConfigurer extends SjmsComponentConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("connectionCount", java.lang.Integer.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("reconnectBackOff", long.class);
        map.put("reconnectOnError", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("connectionClientId", java.lang.String.class);
        map.put("connectionFactory", javax.jms.ConnectionFactory.class);
        map.put("connectionMaxWait", long.class);
        map.put("connectionResource", org.apache.camel.component.sjms.jms.ConnectionResource.class);
        map.put("connectionTestOnBorrow", boolean.class);
        map.put("destinationCreationStrategy", org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class);
        map.put("jmsKeyFormatStrategy", org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class);
        map.put("messageCreatedStrategy", org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class);
        map.put("timedTaskManager", org.apache.camel.component.sjms.taskmanager.TimedTaskManager.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("connectionPassword", java.lang.String.class);
        map.put("connectionUsername", java.lang.String.class);
        map.put("transactionCommitStrategy", org.apache.camel.component.sjms.TransactionCommitStrategy.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(Sjms2ComponentConfigurer::clearBootstrapConfigurers);
    }

}

