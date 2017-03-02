# WebhookApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookWebhooksGet**](WebhookApi.md#webhookWebhooksGet) | **GET** /webhook/webhooks | Retrieve webhooks
[**webhookWebhooksPost**](WebhookApi.md#webhookWebhooksPost) | **POST** /webhook/webhooks | Add a webhook
[**webhookWebhooksWebhookOidDelete**](WebhookApi.md#webhookWebhooksWebhookOidDelete) | **DELETE** /webhook/webhooks/{webhookOid} | Delete a webhook
[**webhookWebhooksWebhookOidLogsGet**](WebhookApi.md#webhookWebhooksWebhookOidLogsGet) | **GET** /webhook/webhooks/{webhookOid}/logs | Retrieve the log summaries
[**webhookWebhooksWebhookOidLogsRequestIdGet**](WebhookApi.md#webhookWebhooksWebhookOidLogsRequestIdGet) | **GET** /webhook/webhooks/{webhookOid}/logs/{requestId} | Retrieve an individual log
[**webhookWebhooksWebhookOidPut**](WebhookApi.md#webhookWebhooksWebhookOidPut) | **PUT** /webhook/webhooks/{webhookOid} | Update a webhook
[**webhookWebhooksWebhookOidReflowEventNamePost**](WebhookApi.md#webhookWebhooksWebhookOidReflowEventNamePost) | **POST** /webhook/webhooks/{webhookOid}/reflow/{eventName} | Resend events to the webhook endpoint.


<a name="webhookWebhooksGet"></a>
# **webhookWebhooksGet**
> WebhooksResponse webhookWebhooksGet(limit, offset, sort, placeholders)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

WebhookApi apiInstance = new WebhookApi();
Integer limit = 100; // Integer | The maximum number of records to return on this one API call.
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the webhooks.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    WebhooksResponse result = apiInstance.webhookWebhooksGet(limit, offset, sort, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksGet");
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

<a name="webhookWebhooksPost"></a>
# **webhookWebhooksPost**
> WebhookResponse webhookWebhooksPost(webhook, placeholders)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

WebhookApi apiInstance = new WebhookApi();
Webhook webhook = new Webhook(); // Webhook | Webhook to create
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    WebhookResponse result = apiInstance.webhookWebhooksPost(webhook, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksPost");
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

<a name="webhookWebhooksWebhookOidDelete"></a>
# **webhookWebhooksWebhookOidDelete**
> webhookWebhooksWebhookOidDelete(webhookOid)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

WebhookApi apiInstance = new WebhookApi();
Integer webhookOid = 56; // Integer | The webhook oid to delete.
try {
    apiInstance.webhookWebhooksWebhookOidDelete(webhookOid);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksWebhookOidDelete");
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

<a name="webhookWebhooksWebhookOidLogsGet"></a>
# **webhookWebhooksWebhookOidLogsGet**
> WebhookLogSummariesResponse webhookWebhooksWebhookOidLogsGet(webhookOid, limit, offset, since)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

WebhookApi apiInstance = new WebhookApi();
Integer webhookOid = 56; // Integer | The webhook oid to retrieve log summaries for.
Integer limit = 100; // Integer | The maximum number of records to return on this one API call.
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch log summaries that have been delivered since this date/time.
try {
    WebhookLogSummariesResponse result = apiInstance.webhookWebhooksWebhookOidLogsGet(webhookOid, limit, offset, since);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksWebhookOidLogsGet");
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

<a name="webhookWebhooksWebhookOidLogsRequestIdGet"></a>
# **webhookWebhooksWebhookOidLogsRequestIdGet**
> WebhookLogResponse webhookWebhooksWebhookOidLogsRequestIdGet(webhookOid, requestId)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

WebhookApi apiInstance = new WebhookApi();
Integer webhookOid = 56; // Integer | The webhook oid that owns the log.
String requestId = "requestId_example"; // String | The request id associated with the log to view.
try {
    WebhookLogResponse result = apiInstance.webhookWebhooksWebhookOidLogsRequestIdGet(webhookOid, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksWebhookOidLogsRequestIdGet");
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

<a name="webhookWebhooksWebhookOidPut"></a>
# **webhookWebhooksWebhookOidPut**
> WebhookResponse webhookWebhooksWebhookOidPut(webhook, webhookOid, placeholders)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

WebhookApi apiInstance = new WebhookApi();
Webhook webhook = new Webhook(); // Webhook | Webhook to update
Integer webhookOid = 56; // Integer | The webhook oid to update.
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    WebhookResponse result = apiInstance.webhookWebhooksWebhookOidPut(webhook, webhookOid, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksWebhookOidPut");
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

<a name="webhookWebhooksWebhookOidReflowEventNamePost"></a>
# **webhookWebhooksWebhookOidReflowEventNamePost**
> WebhookSampleRequestResponse webhookWebhooksWebhookOidReflowEventNamePost(webhookOid, eventName)

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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

WebhookApi apiInstance = new WebhookApi();
Integer webhookOid = 56; // Integer | The webhook oid that is receiving the reflowed events.
String eventName = "eventName_example"; // String | The event to reflow.
try {
    WebhookSampleRequestResponse result = apiInstance.webhookWebhooksWebhookOidReflowEventNamePost(webhookOid, eventName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksWebhookOidReflowEventNamePost");
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

