/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mail;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MailEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MailEndpoint target = (MailEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "closefolder":
        case "closeFolder": target.getConfiguration().setCloseFolder(property(camelContext, boolean.class, value)); return true;
        case "copyto":
        case "copyTo": target.getConfiguration().setCopyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "delete": target.getConfiguration().setDelete(property(camelContext, boolean.class, value)); return true;
        case "disconnect": target.getConfiguration().setDisconnect(property(camelContext, boolean.class, value)); return true;
        case "handlefailedmessage":
        case "handleFailedMessage": target.getConfiguration().setHandleFailedMessage(property(camelContext, boolean.class, value)); return true;
        case "maxmessagesperpoll":
        case "maxMessagesPerPoll": target.setMaxMessagesPerPoll(property(camelContext, int.class, value)); return true;
        case "mimedecodeheaders":
        case "mimeDecodeHeaders": target.getConfiguration().setMimeDecodeHeaders(property(camelContext, boolean.class, value)); return true;
        case "moveto":
        case "moveTo": target.getConfiguration().setMoveTo(property(camelContext, java.lang.String.class, value)); return true;
        case "peek": target.getConfiguration().setPeek(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle":
        case "sendEmptyMessageWhenIdle": target.setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "skipfailedmessage":
        case "skipFailedMessage": target.getConfiguration().setSkipFailedMessage(property(camelContext, boolean.class, value)); return true;
        case "unseen": target.getConfiguration().setUnseen(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "fetchsize":
        case "fetchSize": target.getConfiguration().setFetchSize(property(camelContext, int.class, value)); return true;
        case "foldername":
        case "folderName": target.getConfiguration().setFolderName(property(camelContext, java.lang.String.class, value)); return true;
        case "mailuidgenerator":
        case "mailUidGenerator": target.setMailUidGenerator(property(camelContext, org.apache.camel.component.mail.MailUidGenerator.class, value)); return true;
        case "mapmailmessage":
        case "mapMailMessage": target.getConfiguration().setMapMailMessage(property(camelContext, boolean.class, value)); return true;
        case "pollstrategy":
        case "pollStrategy": target.setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "postprocessaction":
        case "postProcessAction": target.setPostProcessAction(property(camelContext, org.apache.camel.component.mail.MailBoxPostProcessAction.class, value)); return true;
        case "bcc": target.getConfiguration().setBcc(property(camelContext, java.lang.String.class, value)); return true;
        case "cc": target.getConfiguration().setCc(property(camelContext, java.lang.String.class, value)); return true;
        case "from": target.getConfiguration().setFrom(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "replyto":
        case "replyTo": target.getConfiguration().setReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "subject": target.getConfiguration().setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "to": target.getConfiguration().setTo(property(camelContext, java.lang.String.class, value)); return true;
        case "javamailsender":
        case "javaMailSender": target.getConfiguration().setJavaMailSender(property(camelContext, org.apache.camel.component.mail.JavaMailSender.class, value)); return true;
        case "additionaljavamailproperties":
        case "additionalJavaMailProperties": target.getConfiguration().setAdditionalJavaMailProperties(property(camelContext, java.util.Properties.class, value)); return true;
        case "alternativebodyheader":
        case "alternativeBodyHeader": target.getConfiguration().setAlternativeBodyHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "attachmentscontenttransferencodingresolver":
        case "attachmentsContentTransferEncodingResolver": target.getConfiguration().setAttachmentsContentTransferEncodingResolver(property(camelContext, org.apache.camel.component.mail.AttachmentsContentTransferEncodingResolver.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "binding": target.setBinding(property(camelContext, org.apache.camel.component.mail.MailBinding.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "contentType": target.getConfiguration().setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "contenttyperesolver":
        case "contentTypeResolver": target.setContentTypeResolver(property(camelContext, org.apache.camel.component.mail.ContentTypeResolver.class, value)); return true;
        case "debugmode":
        case "debugMode": target.getConfiguration().setDebugMode(property(camelContext, boolean.class, value)); return true;
        case "headerfilterstrategy":
        case "headerFilterStrategy": target.setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "ignoreunsupportedcharset":
        case "ignoreUnsupportedCharset": target.getConfiguration().setIgnoreUnsupportedCharset(property(camelContext, boolean.class, value)); return true;
        case "ignoreurischeme":
        case "ignoreUriScheme": target.getConfiguration().setIgnoreUriScheme(property(camelContext, boolean.class, value)); return true;
        case "javamailproperties":
        case "javaMailProperties": target.getConfiguration().setJavaMailProperties(property(camelContext, java.util.Properties.class, value)); return true;
        case "session": target.getConfiguration().setSession(property(camelContext, javax.mail.Session.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "useinlineattachments":
        case "useInlineAttachments": target.getConfiguration().setUseInlineAttachments(property(camelContext, boolean.class, value)); return true;
        case "idempotentrepository":
        case "idempotentRepository": target.setIdempotentRepository(property(camelContext, org.apache.camel.spi.IdempotentRepository.class, value)); return true;
        case "idempotentrepositoryremoveoncommit":
        case "idempotentRepositoryRemoveOnCommit": target.setIdempotentRepositoryRemoveOnCommit(property(camelContext, boolean.class, value)); return true;
        case "searchterm":
        case "searchTerm": target.setSearchTerm(property(camelContext, javax.mail.search.SearchTerm.class, value)); return true;
        case "backofferrorthreshold":
        case "backoffErrorThreshold": target.setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold":
        case "backoffIdleThreshold": target.setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier":
        case "backoffMultiplier": target.setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": target.setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": target.setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount":
        case "repeatCount": target.setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel":
        case "runLoggingLevel": target.setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice":
        case "scheduledExecutorService": target.setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": target.setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties":
        case "schedulerProperties": target.setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler":
        case "startScheduler": target.setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit":
        case "timeUnit": target.setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay":
        case "useFixedDelay": target.setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "sortterm":
        case "sortTerm": target.setSortTerm(property(camelContext, com.sun.mail.imap.SortTerm[].class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": target.getConfiguration().setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}
