/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twitter.search;

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
public class TwitterSearchEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("keywords", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("sendEmptyMessageWhenIdle", boolean.class);
        map.put("type", org.apache.camel.component.twitter.data.EndpointType.class);
        map.put("distanceMetric", java.lang.String.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("extendedMode", boolean.class);
        map.put("latitude", java.lang.Double.class);
        map.put("locations", java.lang.String.class);
        map.put("longitude", java.lang.Double.class);
        map.put("pollStrategy", org.apache.camel.spi.PollingConsumerPollStrategy.class);
        map.put("radius", java.lang.Double.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("count", java.lang.Integer.class);
        map.put("filterOld", boolean.class);
        map.put("lang", java.lang.String.class);
        map.put("numberOfPages", java.lang.Integer.class);
        map.put("sinceId", long.class);
        map.put("userIds", java.lang.String.class);
        map.put("httpProxyHost", java.lang.String.class);
        map.put("httpProxyPassword", java.lang.String.class);
        map.put("httpProxyPort", java.lang.Integer.class);
        map.put("httpProxyUser", java.lang.String.class);
        map.put("backoffErrorThreshold", int.class);
        map.put("backoffIdleThreshold", int.class);
        map.put("backoffMultiplier", int.class);
        map.put("delay", long.class);
        map.put("greedy", boolean.class);
        map.put("initialDelay", long.class);
        map.put("repeatCount", long.class);
        map.put("runLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("scheduledExecutorService", java.util.concurrent.ScheduledExecutorService.class);
        map.put("scheduler", java.lang.Object.class);
        map.put("schedulerProperties", java.util.Map.class);
        map.put("startScheduler", boolean.class);
        map.put("timeUnit", java.util.concurrent.TimeUnit.class);
        map.put("useFixedDelay", boolean.class);
        map.put("accessToken", java.lang.String.class);
        map.put("accessTokenSecret", java.lang.String.class);
        map.put("consumerKey", java.lang.String.class);
        map.put("consumerSecret", java.lang.String.class);
        map.put("sortById", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(TwitterSearchEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TwitterSearchEndpoint target = (TwitterSearchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.getProperties().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "accesstokensecret":
        case "accessTokenSecret": target.getProperties().setAccessTokenSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerkey":
        case "consumerKey": target.getProperties().setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "consumersecret":
        case "consumerSecret": target.getProperties().setConsumerSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "count": target.getProperties().setCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "distancemetric":
        case "distanceMetric": target.getProperties().setDistanceMetric(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "extendedmode":
        case "extendedMode": target.getProperties().setExtendedMode(property(camelContext, boolean.class, value)); return true;
        case "filterold":
        case "filterOld": target.getProperties().setFilterOld(property(camelContext, boolean.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": target.getProperties().setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": target.getProperties().setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": target.getProperties().setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyuser":
        case "httpProxyUser": target.getProperties().setHttpProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "lang": target.getProperties().setLang(property(camelContext, java.lang.String.class, value)); return true;
        case "latitude": target.getProperties().setLatitude(property(camelContext, java.lang.Double.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "locations": target.getProperties().setLocations(property(camelContext, java.lang.String.class, value)); return true;
        case "longitude": target.getProperties().setLongitude(property(camelContext, java.lang.Double.class, value)); return true;
        case "numberofpages":
        case "numberOfPages": target.getProperties().setNumberOfPages(property(camelContext, java.lang.Integer.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "radius": target.getProperties().setRadius(property(camelContext, java.lang.Double.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.Object.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "sinceid":
        case "sinceId": target.getProperties().setSinceId(property(camelContext, long.class, value)); return true;
        case "sortbyid":
        case "sortById": target.getProperties().setSortById(property(camelContext, boolean.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "type": target.getProperties().setType(property(camelContext, org.apache.camel.component.twitter.data.EndpointType.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "userids":
        case "userIds": target.getProperties().setUserIds(property(camelContext, java.lang.String.class, value)); return true;
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
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "accesstokensecret":
        case "accessTokenSecret": return java.lang.String.class;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return int.class;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return int.class;
        case "backoffmultiplier":
        case "backoffMultiplier": return int.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "consumerkey":
        case "consumerKey": return java.lang.String.class;
        case "consumersecret":
        case "consumerSecret": return java.lang.String.class;
        case "count": return java.lang.Integer.class;
        case "delay": return long.class;
        case "distancemetric":
        case "distanceMetric": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "extendedmode":
        case "extendedMode": return boolean.class;
        case "filterold":
        case "filterOld": return boolean.class;
        case "greedy": return boolean.class;
        case "httpproxyhost":
        case "httpProxyHost": return java.lang.String.class;
        case "httpproxypassword":
        case "httpProxyPassword": return java.lang.String.class;
        case "httpproxyport":
        case "httpProxyPort": return java.lang.Integer.class;
        case "httpproxyuser":
        case "httpProxyUser": return java.lang.String.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "lang": return java.lang.String.class;
        case "latitude": return java.lang.Double.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "locations": return java.lang.String.class;
        case "longitude": return java.lang.Double.class;
        case "numberofpages":
        case "numberOfPages": return java.lang.Integer.class;
        case "pollstrategy":
        case "pollStrategy": return org.apache.camel.spi.PollingConsumerPollStrategy.class;
        case "radius": return java.lang.Double.class;
        case "repeatcount":
        case "repeatCount": return long.class;
        case "runlogginglevel":
        case "runLoggingLevel": return org.apache.camel.LoggingLevel.class;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return java.util.concurrent.ScheduledExecutorService.class;
        case "scheduler": return java.lang.Object.class;
        case "schedulerproperties":
        case "schedulerProperties": return java.util.Map.class;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return boolean.class;
        case "sinceid":
        case "sinceId": return long.class;
        case "sortbyid":
        case "sortById": return boolean.class;
        case "startscheduler":
        case "startScheduler": return boolean.class;
        case "synchronous": return boolean.class;
        case "timeunit":
        case "timeUnit": return java.util.concurrent.TimeUnit.class;
        case "type": return org.apache.camel.component.twitter.data.EndpointType.class;
        case "usefixeddelay":
        case "useFixedDelay": return boolean.class;
        case "userids":
        case "userIds": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        TwitterSearchEndpoint target = (TwitterSearchEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getProperties().getAccessToken();
        case "accesstokensecret":
        case "accessTokenSecret": return target.getProperties().getAccessTokenSecret();
        case "backofferrorthreshold":
        case "backoffErrorThreshold": return target.getBackoffErrorThreshold();
        case "backoffidlethreshold":
        case "backoffIdleThreshold": return target.getBackoffIdleThreshold();
        case "backoffmultiplier":
        case "backoffMultiplier": return target.getBackoffMultiplier();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumerkey":
        case "consumerKey": return target.getProperties().getConsumerKey();
        case "consumersecret":
        case "consumerSecret": return target.getProperties().getConsumerSecret();
        case "count": return target.getProperties().getCount();
        case "delay": return target.getDelay();
        case "distancemetric":
        case "distanceMetric": return target.getProperties().getDistanceMetric();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "extendedmode":
        case "extendedMode": return target.getProperties().isExtendedMode();
        case "filterold":
        case "filterOld": return target.getProperties().isFilterOld();
        case "greedy": return target.isGreedy();
        case "httpproxyhost":
        case "httpProxyHost": return target.getProperties().getHttpProxyHost();
        case "httpproxypassword":
        case "httpProxyPassword": return target.getProperties().getHttpProxyPassword();
        case "httpproxyport":
        case "httpProxyPort": return target.getProperties().getHttpProxyPort();
        case "httpproxyuser":
        case "httpProxyUser": return target.getProperties().getHttpProxyUser();
        case "initialdelay":
        case "initialDelay": return target.getInitialDelay();
        case "lang": return target.getProperties().getLang();
        case "latitude": return target.getProperties().getLatitude();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "locations": return target.getProperties().getLocations();
        case "longitude": return target.getProperties().getLongitude();
        case "numberofpages":
        case "numberOfPages": return target.getProperties().getNumberOfPages();
        case "pollstrategy":
        case "pollStrategy": return target.getPollStrategy();
        case "radius": return target.getProperties().getRadius();
        case "repeatcount":
        case "repeatCount": return target.getRepeatCount();
        case "runlogginglevel":
        case "runLoggingLevel": return target.getRunLoggingLevel();
        case "scheduledexecutorservice":
        case "scheduledExecutorService": return target.getScheduledExecutorService();
        case "scheduler": return target.getScheduler();
        case "schedulerproperties":
        case "schedulerProperties": return target.getSchedulerProperties();
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": return target.isSendEmptyMessageWhenIdle();
        case "sinceid":
        case "sinceId": return target.getProperties().getSinceId();
        case "sortbyid":
        case "sortById": return target.getProperties().isSortById();
        case "startscheduler":
        case "startScheduler": return target.isStartScheduler();
        case "synchronous": return target.isSynchronous();
        case "timeunit":
        case "timeUnit": return target.getTimeUnit();
        case "type": return target.getProperties().getType();
        case "usefixeddelay":
        case "useFixedDelay": return target.isUseFixedDelay();
        case "userids":
        case "userIds": return target.getProperties().getUserIds();
        default: return null;
        }
    }
}

