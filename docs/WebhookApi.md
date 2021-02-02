# WebhookApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteWebhook**](WebhookApi.md#deleteWebhook) | **DELETE** /webhook/webhooks/{webhookOid} | Delete a webhook
[**deleteWebhookByUrl**](WebhookApi.md#deleteWebhookByUrl) | **DELETE** /webhook/webhooks | Delete a webhook by URL
[**getWebhookLog**](WebhookApi.md#getWebhookLog) | **GET** /webhook/webhooks/{webhookOid}/logs/{requestId} | Retrieve an individual log
[**getWebhookLogSummaries**](WebhookApi.md#getWebhookLogSummaries) | **GET** /webhook/webhooks/{webhookOid}/logs | Retrieve the log summaries
[**getWebhooks**](WebhookApi.md#getWebhooks) | **GET** /webhook/webhooks | Retrieve webhooks
[**insertWebhook**](WebhookApi.md#insertWebhook) | **POST** /webhook/webhooks | Add a webhook
[**resendEvent**](WebhookApi.md#resendEvent) | **POST** /webhook/webhooks/{webhookOid}/reflow/{eventName} | Resend events to the webhook endpoint.
[**updateWebhook**](WebhookApi.md#updateWebhook) | **PUT** /webhook/webhooks/{webhookOid} | Update a webhook


<a name="deleteWebhook"></a>
# **deleteWebhook**
> deleteWebhook(webhookOid)

Delete a webhook

Delete a webhook on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WebhookApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WebhookApi apiInstance = new WebhookApi(apiKey);

Integer webhookOid = 56; // Integer | The webhook oid to delete.
try {
    apiInstance.deleteWebhook(webhookOid);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#deleteWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOid** | **Integer**| The webhook oid to delete. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWebhookByUrl"></a>
# **deleteWebhookByUrl**
> WebhookResponse deleteWebhookByUrl(webhook)

Delete a webhook by URL

Delete a webhook based upon the URL on the webhook_url matching an existing webhook. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WebhookApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WebhookApi apiInstance = new WebhookApi(apiKey);

Webhook webhook = new Webhook(); // Webhook | Webhook to delete
try {
    WebhookResponse result = apiInstance.deleteWebhookByUrl(webhook);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#deleteWebhookByUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | [**Webhook**](Webhook.md)| Webhook to delete |

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="getWebhookLog"></a>
# **getWebhookLog**
> WebhookLogResponse getWebhookLog(webhookOid, requestId)

Retrieve an individual log

Retrieves an individual log for a webhook given the webhook oid the request id. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WebhookApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WebhookApi apiInstance = new WebhookApi(apiKey);

Integer webhookOid = 56; // Integer | The webhook oid that owns the log.
String requestId = "requestId_example"; // String | The request id associated with the log to view.
try {
    WebhookLogResponse result = apiInstance.getWebhookLog(webhookOid, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#getWebhookLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOid** | **Integer**| The webhook oid that owns the log. |
 **requestId** | **String**| The request id associated with the log to view. |

### Return type

[**WebhookLogResponse**](WebhookLogResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebhookLogSummaries"></a>
# **getWebhookLogSummaries**
> WebhookLogSummariesResponse getWebhookLogSummaries(webhookOid, limit, offset, since)

Retrieve the log summaries

Retrieves the log summary information for a given webhook.  This is useful for displaying all the various logs that can be viewed. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WebhookApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WebhookApi apiInstance = new WebhookApi(apiKey);

Integer webhookOid = 56; // Integer | The webhook oid to retrieve log summaries for.
Integer limit = 100; // Integer | The maximum number of records to return on this one API call.
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch log summaries that have been delivered since this date/time.
try {
    WebhookLogSummariesResponse result = apiInstance.getWebhookLogSummaries(webhookOid, limit, offset, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#getWebhookLogSummaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOid** | **Integer**| The webhook oid to retrieve log summaries for. |
 **limit** | **Integer**| The maximum number of records to return on this one API call. | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch log summaries that have been delivered since this date/time. | [optional]

### Return type

[**WebhookLogSummariesResponse**](WebhookLogSummariesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWebhooks"></a>
# **getWebhooks**
> WebhooksResponse getWebhooks(limit, offset, sort, placeholders)

Retrieve webhooks

Retrieves the webhooks associated with this application. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WebhookApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WebhookApi apiInstance = new WebhookApi(apiKey);

Integer limit = 100; // Integer | The maximum number of records to return on this one API call.
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the webhooks.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    WebhooksResponse result = apiInstance.getWebhooks(limit, offset, sort, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#getWebhooks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum number of records to return on this one API call. | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **sort** | **String**| The sort order of the webhooks.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**WebhooksResponse**](WebhooksResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertWebhook"></a>
# **insertWebhook**
> WebhookResponse insertWebhook(webhook, placeholders)

Add a webhook

Adds a new webhook on the account.  If you add a new webhook with the authentication_type set to basic, but do not specify the basic_username and basic_password, UltraCart will automatically generate random ones and return them.  This allows your application to have simpler logic on the setup of a secure webhook. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WebhookApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WebhookApi apiInstance = new WebhookApi(apiKey);

Webhook webhook = new Webhook(); // Webhook | Webhook to create
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    WebhookResponse result = apiInstance.insertWebhook(webhook, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#insertWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | [**Webhook**](Webhook.md)| Webhook to create |
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="resendEvent"></a>
# **resendEvent**
> WebhookSampleRequestResponse resendEvent(webhookOid, eventName)

Resend events to the webhook endpoint.

This method will resend events to the webhook endpoint.  This method can be used for example to send all the existing items on an account to a webhook. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WebhookApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WebhookApi apiInstance = new WebhookApi(apiKey);

Integer webhookOid = 56; // Integer | The webhook oid that is receiving the reflowed events.
String eventName = "eventName_example"; // String | The event to reflow.
try {
    WebhookSampleRequestResponse result = apiInstance.resendEvent(webhookOid, eventName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#resendEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOid** | **Integer**| The webhook oid that is receiving the reflowed events. |
 **eventName** | **String**| The event to reflow. |

### Return type

[**WebhookSampleRequestResponse**](WebhookSampleRequestResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateWebhook"></a>
# **updateWebhook**
> WebhookResponse updateWebhook(webhook, webhookOid, placeholders)

Update a webhook

Update a webhook on the account 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WebhookApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WebhookApi apiInstance = new WebhookApi(apiKey);

Webhook webhook = new Webhook(); // Webhook | Webhook to update
Integer webhookOid = 56; // Integer | The webhook oid to update.
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    WebhookResponse result = apiInstance.updateWebhook(webhook, webhookOid, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#updateWebhook");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhook** | [**Webhook**](Webhook.md)| Webhook to update |
 **webhookOid** | **Integer**| The webhook oid to update. |
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**WebhookResponse**](WebhookResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

