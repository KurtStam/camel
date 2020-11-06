
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.calendar;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.calendar.Calendar.Acl}.
 */
@ApiParams(apiName = "acl", 
           description = "The acl collection of methods",
           apiMethods = {@ApiMethod(methodName = "delete", description="Deletes an access control rule", signatures={"com.google.api.services.calendar.Calendar$Acl$Delete delete(String calendarId, String ruleId)"}), @ApiMethod(methodName = "get", description="Returns an access control rule", signatures={"com.google.api.services.calendar.Calendar$Acl$Get get(String calendarId, String ruleId)"}), @ApiMethod(methodName = "insert", description="Creates an access control rule", signatures={"com.google.api.services.calendar.Calendar$Acl$Insert insert(String calendarId, com.google.api.services.calendar.model.AclRule content)"}), @ApiMethod(methodName = "list", description="Returns the rules in the access control list for the calendar", signatures={"com.google.api.services.calendar.Calendar$Acl$List list(String calendarId)"}), @ApiMethod(methodName = "patch", description="Updates an access control rule", signatures={"com.google.api.services.calendar.Calendar$Acl$Patch patch(String calendarId, String ruleId, com.google.api.services.calendar.model.AclRule content)"}), @ApiMethod(methodName = "update", description="Updates an access control rule", signatures={"com.google.api.services.calendar.Calendar$Acl$Update update(String calendarId, String ruleId, com.google.api.services.calendar.model.AclRule content)"}), @ApiMethod(methodName = "watch", description="Watch for changes to ACL resources", signatures={"com.google.api.services.calendar.Calendar$Acl$Watch watch(String calendarId, com.google.api.services.calendar.model.Channel content)"})}, aliases = {})
@UriParams
@Configurer(api = true)
public final class CalendarAclEndpointConfiguration extends GoogleCalendarConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "get", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "insert", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "list", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "patch", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "update", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword."), @ApiMethod(methodName = "watch", description="Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the primary keyword.")})
    private String calendarId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "insert", description="The com.google.api.services.calendar.model.AclRule"), @ApiMethod(methodName = "patch", description="The com.google.api.services.calendar.model.AclRule"), @ApiMethod(methodName = "update", description="The com.google.api.services.calendar.model.AclRule")})
    private com.google.api.services.calendar.model.AclRule content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "watch", description="The com.google.api.services.calendar.model.Channel")})
    private com.google.api.services.calendar.model.Channel contentChannel;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="ACL rule identifier"), @ApiMethod(methodName = "get", description="ACL rule identifier"), @ApiMethod(methodName = "patch", description="ACL rule identifier"), @ApiMethod(methodName = "update", description="ACL rule identifier")})
    private String ruleId;

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public com.google.api.services.calendar.model.AclRule getContent() {
        return content;
    }

    public void setContent(com.google.api.services.calendar.model.AclRule content) {
        this.content = content;
    }

    public com.google.api.services.calendar.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.calendar.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }
}
