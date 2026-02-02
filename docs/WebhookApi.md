# WebhookApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWebhook**](WebhookApi.md#deleteWebhook) | **DELETE** /webhook/webhooks/{webhookOid} | Delete a webhook |
| [**deleteWebhookByUrl**](WebhookApi.md#deleteWebhookByUrl) | **DELETE** /webhook/webhooks | Delete a webhook by URL |
| [**getWebhookLog**](WebhookApi.md#getWebhookLog) | **GET** /webhook/webhooks/{webhookOid}/logs/{requestId} | Retrieve an individual log |
| [**getWebhookLogSummaries**](WebhookApi.md#getWebhookLogSummaries) | **GET** /webhook/webhooks/{webhookOid}/logs | Retrieve the log summaries |
| [**getWebhooks**](WebhookApi.md#getWebhooks) | **GET** /webhook/webhooks | Retrieve webhooks |
| [**insertWebhook**](WebhookApi.md#insertWebhook) | **POST** /webhook/webhooks | Add a webhook |
| [**resendEvent**](WebhookApi.md#resendEvent) | **POST** /webhook/webhooks/{webhookOid}/reflow/{eventName} | Resend events to the webhook endpoint. |
| [**updateWebhook**](WebhookApi.md#updateWebhook) | **PUT** /webhook/webhooks/{webhookOid} | Update a webhook |


<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(webhookOid)

Delete a webhook

Delete a webhook on the UltraCart account. 

### Example

```java
package webhook;

import com.ultracart.admin.v2.WebhookApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class DeleteWebhook {
   public static void execute() throws ApiException {
       /*
        * Deletes a webhook
        *
        * You will need the webhook_oid to call this method. Call getWebhooks() if you don't know your oid.
        * Returns status code 204 (No Content) on success
        */

       WebhookApi webhookApi = new WebhookApi(Constants.API_KEY);
       int webhookOid = 123456789; // call getWebhooks if you don't know this.
       webhookApi.deleteWebhook(webhookOid);
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookOid** | **Integer**| The webhook oid to delete. | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="deleteWebhookByUrl"></a>
# **deleteWebhookByUrl**
> WebhookResponse deleteWebhookByUrl(webhook)

Delete a webhook by URL

Delete a webhook based upon the URL on the webhook_url matching an existing webhook. 

### Example

```java
package webhook;

import com.ultracart.admin.v2.WebhookApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class DeleteWebhookByUrl {
   public static void execute() throws ApiException {
       /*
        * This method can be confusing due to its payload. The method does indeed delete a webhook by url, but you need to
        * pass a webhook object in as the payload. However, only the url is used. UltraCart does this to avoid any confusion
        * with the rest url versus the webhook url.
        *
        * To use:
        * Get your webhook url.
        * Create a Webhook object.
        * Set the Webhook url property.
        * Pass the webhook to deleteWebhookByUrl()
        *
        * Returns status code 204 (No Content) on success
        */

       WebhookApi webhookApi = new WebhookApi(Constants.API_KEY);

       String webhookUrl = "https://www.mywebiste.com/page/to/call/when/this/webhook/fires.php";
       Webhook webhook = new Webhook();
       webhook.setWebhookUrl(webhookUrl);

       webhookApi.deleteWebhookByUrl(webhook);
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhook** | [**Webhook**](Webhook.md)| Webhook to delete | |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getWebhookLog"></a>
# **getWebhookLog**
> WebhookLogResponse getWebhookLog(webhookOid, requestId)

Retrieve an individual log

Retrieves an individual log for a webhook given the webhook oid the request id. 

### Example

```java
package webhook;

import com.ultracart.admin.v2.WebhookApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class GetWebhookLog {
   public static void execute() throws ApiException {
       /*
        * getWebhookLog() provides a detail log of a webhook event. It is used in tandem with getWebhookLogSummaries to audit
        * webhook events. This method call will require the webhook_oid and the request_id. The webhook_oid can be discerned
        * from the results of getWebhooks() and the request_id can be found from getWebhookLogSummaries(). see those examples
        * if needed.
        */

       WebhookApi webhookApi = new WebhookApi(Constants.API_KEY);

       int webhookOid = 123456789; // call getWebhooks if you don't know this.
       String requestId = "987654321";  // call getWebhookLogSummaries if you don't know this.

       WebhookLogResponse apiResponse = webhookApi.getWebhookLog(webhookOid, requestId);
       WebhookLog webhookLog = apiResponse.getWebhookLog();

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.exit(1);
       }

       System.out.println(webhookLog.toString());
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookOid** | **Integer**| The webhook oid that owns the log. | |
| **requestId** | **String**| The request id associated with the log to view. | |

### Return type

[**WebhookLogResponse**](WebhookLogResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getWebhookLogSummaries"></a>
# **getWebhookLogSummaries**
> WebhookLogSummariesResponse getWebhookLogSummaries(webhookOid, limit, offset, since)

Retrieve the log summaries

Retrieves the log summary information for a given webhook.  This is useful for displaying all the various logs that can be viewed. 

### Example

```java
package webhook;

import com.ultracart.admin.v2.WebhookApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class GetWebhookLogSummaries {
   /*
    * This example illustrates how to retrieve webhook log summaries.
    */

   /**
    * Gets a chunk of webhook log summaries
    * @param webhookApi The webhook API instance
    * @param offset Offset for pagination
    * @param limit Maximum number of records to return
    * @return Array of webhook log summaries
    * @throws ApiException Thrown when API call fails
    */
   private static List<WebhookLogSummary> getSummaryChunk(WebhookApi webhookApi, int offset, int limit) throws ApiException {
       int webhookOid = 123456789; // if you don't know this, use getWebhooks to find your webhook, then get its oid.
       String since = Instant.now().minus(10, ChronoUnit.DAYS).toString(); // get the last 10 days
       // Pay attention to whether limit or offset comes first in the method signature. UltraCart is not consistent with their ordering.
       WebhookLogSummariesResponse apiResponse = webhookApi.getWebhookLogSummaries(webhookOid, limit, offset, since);

       if (apiResponse.getWebhookLogSummaries() != null) {
           return apiResponse.getWebhookLogSummaries();
       }
       return new ArrayList<WebhookLogSummary>();
   }

   public static void execute() {
       WebhookApi webhookApi = new WebhookApi(Constants.API_KEY);
       
       List<WebhookLogSummary> summaries = new ArrayList<WebhookLogSummary>();

       int iteration = 1;
       int offset = 0;
       int limit = 200;
       boolean moreRecordsToFetch = true;

       try {
           while (moreRecordsToFetch) {
               System.out.println("executing iteration " + iteration);

               List<WebhookLogSummary> chunkOfSummaries = getSummaryChunk(webhookApi, offset, limit);
               summaries.addAll(chunkOfSummaries);
               offset = offset + limit;
               moreRecordsToFetch = chunkOfSummaries.size() == limit;
               iteration++;
           }
       } catch (ApiException e) {
           System.out.println("ApiException occurred on iteration " + iteration);
           System.out.println(e.toString());
           System.exit(1);
       }

       // this will be verbose...
       for (WebhookLogSummary summary : summaries) {
           System.out.println(summary.toString());
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookOid** | **Integer**| The webhook oid to retrieve log summaries for. | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **since** | **String**| Fetch log summaries that have been delivered since this date/time. | [optional] |

### Return type

[**WebhookLogSummariesResponse**](WebhookLogSummariesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getWebhooks"></a>
# **getWebhooks**
> WebhooksResponse getWebhooks(limit, offset, sort, placeholders)

Retrieve webhooks

Retrieves the webhooks associated with this application. 

### Example

```java
package webhook;

import com.ultracart.admin.v2.WebhookApi;
import com.ultracart.admin.v2.models.Webhook;
import com.ultracart.admin.v2.models.WebhooksResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class GetWebhooks {
  /*
   * This example illustrates how to retrieve all webhooks.
   */

  /**
   * Gets a chunk of webhooks
   *
   * @param webhookApi The webhook API instance
   * @param offset     Offset for pagination
   * @param limit      Maximum number of records to return
   * @return List of webhooks
   * @throws ApiException Thrown when API call fails
   */
  private static List<Webhook> getWebhookChunk(WebhookApi webhookApi, int offset, int limit) throws ApiException {
    String sort = null; // default sorting is webhook_url, disabled, and those are also the two choices for sorting.
    Boolean placeholders = null;  // useful for UI displays, but not needed here.
    // Pay attention to whether limit or offset comes first in the method signature. UltraCart is not consistent with their ordering.
    WebhooksResponse apiResponse = webhookApi.getWebhooks(limit, offset, sort, placeholders);

    if (apiResponse.getWebhooks() != null) {
      return apiResponse.getWebhooks();
    }
    return new ArrayList<>();
  }

  public static void execute() {
    WebhookApi webhookApi = new WebhookApi(Constants.API_KEY);

    List<Webhook> webhooks = new ArrayList<>();

    int iteration = 1;
    int offset = 0;
    int limit = 200;
    boolean moreRecordsToFetch = true;

    try {
      while (moreRecordsToFetch) {
        System.out.println("executing iteration " + iteration);

        List<Webhook> chunkOfWebhooks = getWebhookChunk(webhookApi, offset, limit);
        webhooks.addAll(chunkOfWebhooks);
        offset = offset + limit;
        moreRecordsToFetch = chunkOfWebhooks.size() == limit;
        iteration++;
      }
    } catch (ApiException e) {
      System.out.println("ApiException occurred on iteration " + iteration);
      System.out.println(e.toString());
      System.exit(1);
    }

    // this will be verbose...
    for (Webhook webhook : webhooks) {
      System.out.println(webhook.toString());
    }
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| The maximum number of records to return on this one API call. | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the webhooks.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**WebhooksResponse**](WebhooksResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="insertWebhook"></a>
# **insertWebhook**
> WebhookResponse insertWebhook(webhook, placeholders)

Add a webhook

Adds a new webhook on the account.  If you add a new webhook with the authentication_type set to basic, but do not specify the basic_username and basic_password, UltraCart will automatically generate random ones and return them.  This allows your application to have simpler logic on the setup of a secure webhook. 

### Example

```java
package webhook;

import com.ultracart.admin.v2.WebhookApi;
import com.ultracart.admin.v2.models.Webhook;
import com.ultracart.admin.v2.models.WebhookEventCategory;
import com.ultracart.admin.v2.models.WebhookEventSubscription;
import com.ultracart.admin.v2.models.WebhookResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class InsertWebhook {
    public static void execute() {
        /*
         * Adds a new webhook on the account.  If you add a new webhook with the authentication_type set to basic, but
         * do not specify the basic_username and basic_password, UltraCart will automatically generate random ones and
         * return them.  This allows your application to have simpler logic on the setup of a secure webhook.
         * 
         * Event Category      Event Name                      Description
         * [Full event list from original comment preserved]
         * 
         * Note: Each event uses the same expansions as the event category.  To see a list of possible expansion values,
         * visit www.ultracart.com/api/. Order Expansions (https://www.ultracart.com/api/#resource_order.html) are listed
         * below because most webhooks are for order events.
         * Order Expansion:
         * [Expansion list from original comment preserved]
         * 
         * Note: The WebhookEventSubscription.event_ruler field is processed with the AWS Event Ruler library to filter down
         * events to just what you want.  If you wish to employ a ruler filter, see https://github.com/aws/event-ruler
         * for syntax examples.  You'll need to apply the aws syntax against the UltraCart object models.  Contact UltraCart
         * support if you need assistance creating the proper ruler expression.
         * 
         * Possible Errors:
         */

        WebhookApi webhookApi = new WebhookApi(Constants.API_KEY);

        Webhook webhook = new Webhook();
        webhook.setWebhookUrl("https://www.mywebiste.com/page/to/call/when/this/webhook/fires.php");  // Must be HTTPS if customer related information is being delivered.
        webhook.setAuthenticationType(Webhook.AuthenticationTypeEnum.BASIC);  // "basic","none","api user","aws iam"
        webhook.setBasicUsername("george");
        webhook.setBasicPassword("LlamaLlamaRedPajama");
        webhook.setMaximumEvents(10);
        webhook.setMaximumSize(5242880); // 5 MB is pretty chunky.
        webhook.setApiVersion(Webhook.ApiVersionEnum._2017_03_01); // this is our only API version so far.
        webhook.setCompressEvents(true); // compress events with gzip, then base64 encode them as a string.

        WebhookEventSubscription eventSub1 = new WebhookEventSubscription();
        eventSub1.setEventName("order_create");
        eventSub1.setEventDescription("when an order is placed");
        eventSub1.setExpansion("shipping,billing,item,coupon,summary"); // whatever you need.
        eventSub1.setEventRuler(null); // no filtering.  we want all objects.
        eventSub1.setComments("Merchant specific comment, for example: Bobby needs this webhook for the Accounting department.");

        WebhookEventSubscription eventSub2 = new WebhookEventSubscription();
        eventSub2.setEventName("order_update");
        eventSub2.setEventDescription("when an order is modified");
        eventSub2.setExpansion("shipping,billing,item,coupon,summary"); // whatever you need.
        eventSub2.setEventRuler(null); // no filtering.  we want all objects.
        eventSub2.setComments("Merchant specific comment, for example: Bobby needs this webhook for the Accounting department.");

        WebhookEventSubscription eventSub3 = new WebhookEventSubscription();
        eventSub3.setEventName("order_delete");
        eventSub3.setEventDescription("when an order is modified");
        eventSub3.setExpansion(""); // don't need any expansion on delete.  only need to know the order_id
        eventSub3.setEventRuler(null); // no filtering.  we want all objects.
        eventSub3.setComments("Merchant specific comment, for example: Bobby needs this webhook for the Accounting department.");

        WebhookEventCategory eventCategory1 = new WebhookEventCategory();
        eventCategory1.setEventCategory("order");
        List<WebhookEventSubscription> events = new ArrayList<>();
        events.add(eventSub1);
        events.add(eventSub2);
        events.add(eventSub3);
        eventCategory1.setEvents(events);

        // apiResponse.getWebhook() will return the newly created webhook.
        try {
            WebhookResponse apiResponse = webhookApi.insertWebhook(webhook, false);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            Webhook createdWebhook = apiResponse.getWebhook();
            // TODO - store the webhook oid in case you ever need to make changes.

            // This should equal what you submitted, plus contain much new information
            System.out.println(createdWebhook.toString());
        } catch (ApiException e) {
            System.err.println("API Exception occurred: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhook** | [**Webhook**](Webhook.md)| Webhook to create | |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="resendEvent"></a>
# **resendEvent**
> WebhookReflowResponse resendEvent(webhookOid, eventName)

Resend events to the webhook endpoint.

This method will resend events to the webhook endpoint.  This method can be used for example to send all the existing items on an account to a webhook. 

### Example

```java
package webhook;

import com.ultracart.admin.v2.WebhookApi;
import com.ultracart.admin.v2.models.WebhookReflowResponse;
import com.ultracart.admin.v2.models.WebhookReflow;
import com.ultracart.admin.v2.util.ApiException;

import common.Constants;

public class ResendEvent {
    public static void execute() {
        /*
         * resentEvent is used to reflow an event.  It will resend ALL events in history.  So it is essentially a way to
         * get all objects from an event.  Currently, there are only two events available for reflow: "item_update", and "order_create".
         * These two events provide the means to have a webhook receive all items or orders.  This method is usually called
         * at the beginning of a webhook's life to prepopulate a merchant's database with all items or orders.
         *
         * You will need the webhook_oid to call this method.  Call getWebhooks() if you don't know your oid.
         */

        WebhookApi webhookApi = new WebhookApi(Constants.API_KEY);

        int webhookOid = 123456789; // call getWebhooks if you don't know this.
        String eventName = "item_update"; // or "order_create", but for this sample, we want all items.

        try {
            WebhookReflowResponse apiResponse = webhookApi.resendEvent(webhookOid, eventName);
            WebhookReflow reflow = apiResponse.getReflow();
            boolean success = reflow.getQueued();

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            System.out.println(apiResponse.toString());
        } catch (ApiException e) {
            System.err.println("API Exception occurred: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookOid** | **Integer**| The webhook oid that is receiving the reflowed events. | |
| **eventName** | **String**| The event to reflow. | |

### Return type

[**WebhookReflowResponse**](WebhookReflowResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="updateWebhook"></a>
# **updateWebhook**
> WebhookResponse updateWebhook(webhookOid, webhook, placeholders)

Update a webhook

Update a webhook on the account 

### Example

```java
package webhook;

import com.ultracart.admin.v2.WebhookApi;
import com.ultracart.admin.v2.models.Webhook;
import com.ultracart.admin.v2.models.WebhookResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.List;

public class UpdateWebhook {
    public static void execute() {
        /*
         * Updates a webhook on the account.  See insertWebhook.php for a complete example with field usage.
         * For this example, we are just updating the basic password.
         */

        WebhookApi webhookApi = new WebhookApi(Constants.API_KEY);

        // you should have stored this when you created the webhook.  If you don't know it, call getWebhooks and iterate through
        // them to find you target webhook (add useful comments to each webhook really helps in this endeavor) and get the
        // webhook oid from that.  You'll want to call getWebhooks any way to get the object for updating. It is HIGHLY
        // recommended to get the object from UltraCart for updating rather than constructing it yourself to avoid accidentally
        // deleting a part of the object during the update.
        int webhookOid = 123456789;

        try {
            Webhook webhookToUpdate = null;
            List<Webhook> webhooks = webhookApi.getWebhooks(100, 0, null, null).getWebhooks();
            for (Webhook webhook : webhooks) {
                if (webhook.getWebhookOid() == webhookOid) {
                    webhookToUpdate = webhook;
                    break;
                }
            }

            if (webhookToUpdate == null) {
                System.err.println("Webhook not found with OID: " + webhookOid);
                System.exit(1);
                return;
            }

            webhookToUpdate.setBasicPassword("new password here");
            WebhookResponse apiResponse = webhookApi.updateWebhook(webhookOid, webhookToUpdate, false);
            Webhook updatedWebhook = apiResponse.getWebhook();

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            System.out.println(updatedWebhook.toString());
        } catch (ApiException e) {
            System.err.println("API Exception occurred: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookOid** | **Integer**| The webhook oid to update. | |
| **webhook** | [**Webhook**](Webhook.md)| Webhook to update | |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

