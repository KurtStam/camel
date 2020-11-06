/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.amqp;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.jms.JmsEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class AMQPEndpointConfigurer extends JmsEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("destinationType", java.lang.String.class);
        map.put("destinationName", java.lang.String.class);
        map.put("clientId", java.lang.String.class);
        map.put("connectionFactory", javax.jms.ConnectionFactory.class);
        map.put("disableReplyTo", boolean.class);
        map.put("durableSubscriptionName", java.lang.String.class);
        map.put("jmsMessageType", org.apache.camel.component.jms.JmsMessageType.class);
        map.put("replyTo", java.lang.String.class);
        map.put("testConnectionOnStartup", boolean.class);
        map.put("acknowledgementModeName", java.lang.String.class);
        map.put("asyncConsumer", boolean.class);
        map.put("autoStartup", boolean.class);
        map.put("cacheLevel", int.class);
        map.put("cacheLevelName", java.lang.String.class);
        map.put("concurrentConsumers", int.class);
        map.put("maxConcurrentConsumers", int.class);
        map.put("replyToDeliveryPersistent", boolean.class);
        map.put("selector", java.lang.String.class);
        map.put("subscriptionDurable", boolean.class);
        map.put("subscriptionName", java.lang.String.class);
        map.put("subscriptionShared", boolean.class);
        map.put("acceptMessagesWhileStopping", boolean.class);
        map.put("allowReplyManagerQuickStop", boolean.class);
        map.put("consumerType", org.apache.camel.component.jms.ConsumerType.class);
        map.put("defaultTaskExecutorType", org.apache.camel.component.jms.DefaultTaskExecutorType.class);
        map.put("eagerLoadingOfProperties", boolean.class);
        map.put("eagerPoisonBody", java.lang.String.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("exposeListenerSession", boolean.class);
        map.put("replyToSameDestinationAllowed", boolean.class);
        map.put("taskExecutor", org.springframework.core.task.TaskExecutor.class);
        map.put("deliveryDelay", long.class);
        map.put("deliveryMode", java.lang.Integer.class);
        map.put("deliveryPersistent", boolean.class);
        map.put("explicitQosEnabled", java.lang.Boolean.class);
        map.put("formatDateHeadersToIso8601", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("preserveMessageQos", boolean.class);
        map.put("priority", int.class);
        map.put("replyToConcurrentConsumers", int.class);
        map.put("replyToMaxConcurrentConsumers", int.class);
        map.put("replyToOnTimeoutMaxConcurrentConsumers", int.class);
        map.put("replyToOverride", java.lang.String.class);
        map.put("replyToType", org.apache.camel.component.jms.ReplyToType.class);
        map.put("requestTimeout", long.class);
        map.put("timeToLive", long.class);
        map.put("allowAdditionalHeaders", java.lang.String.class);
        map.put("allowNullBody", boolean.class);
        map.put("alwaysCopyMessage", boolean.class);
        map.put("correlationProperty", java.lang.String.class);
        map.put("disableTimeToLive", boolean.class);
        map.put("forceSendOriginalMessage", boolean.class);
        map.put("includeSentJMSMessageID", boolean.class);
        map.put("replyToCacheLevelName", java.lang.String.class);
        map.put("replyToDestinationSelectorName", java.lang.String.class);
        map.put("streamMessageTypeEnabled", boolean.class);
        map.put("allowSerializedHeaders", boolean.class);
        map.put("artemisStreamingEnabled", boolean.class);
        map.put("asyncStartListener", boolean.class);
        map.put("asyncStopListener", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("destinationResolver", org.springframework.jms.support.destination.DestinationResolver.class);
        map.put("errorHandler", org.springframework.util.ErrorHandler.class);
        map.put("exceptionListener", javax.jms.ExceptionListener.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("idleConsumerLimit", int.class);
        map.put("idleTaskExecutionLimit", int.class);
        map.put("includeAllJMSXProperties", boolean.class);
        map.put("jmsKeyFormatStrategy", org.apache.camel.component.jms.JmsKeyFormatStrategy.class);
        map.put("mapJmsMessage", boolean.class);
        map.put("maxMessagesPerTask", int.class);
        map.put("messageConverter", org.springframework.jms.support.converter.MessageConverter.class);
        map.put("messageCreatedStrategy", org.apache.camel.component.jms.MessageCreatedStrategy.class);
        map.put("messageIdEnabled", boolean.class);
        map.put("messageListenerContainerFactory", org.apache.camel.component.jms.MessageListenerContainerFactory.class);
        map.put("messageTimestampEnabled", boolean.class);
        map.put("pubSubNoLocal", boolean.class);
        map.put("receiveTimeout", long.class);
        map.put("recoveryInterval", long.class);
        map.put("requestTimeoutCheckerInterval", long.class);
        map.put("synchronous", boolean.class);
        map.put("transferException", boolean.class);
        map.put("transferExchange", boolean.class);
        map.put("useMessageIDAsCorrelationID", boolean.class);
        map.put("waitForProvisionCorrelationToBeUpdatedCounter", int.class);
        map.put("waitForProvisionCorrelationToBeUpdatedThreadSleepingTime", long.class);
        map.put("errorHandlerLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("errorHandlerLogStackTrace", boolean.class);
        map.put("password", java.lang.String.class);
        map.put("username", java.lang.String.class);
        map.put("transacted", boolean.class);
        map.put("transactedInOut", boolean.class);
        map.put("lazyCreateTransactionManager", boolean.class);
        map.put("transactionManager", org.springframework.transaction.PlatformTransactionManager.class);
        map.put("transactionName", java.lang.String.class);
        map.put("transactionTimeout", int.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(AMQPEndpointConfigurer::clearBootstrapConfigurers);
    }

}

