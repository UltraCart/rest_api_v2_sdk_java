# WebhookApi

All URIs are relative to *https://secure.ultracart.com/rest/admin/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookWebhooksGet**](WebhookApi.md#webhookWebhooksGet) | **GET** /webhook/webhooks | Retrieve webhooks
[**webhookWebhooksPost**](WebhookApi.md#webhookWebhooksPost) | **POST** /webhook/webhooks | Add a webhook
[**webhookWebhooksWebhookOidDelete**](WebhookApi.md#webhookWebhooksWebhookOidDelete) | **DELETE** /webhook/webhooks/{webhookOid} | Delete a webhook
[**webhookWebhooksWebhookOidLogsGet**](WebhookApi.md#webhookWebhooksWebhookOidLogsGet) | **GET** /webhook/webhooks/{webhookOid}/logs | Retrieve the log summaries
[**webhookWebhooksWebhookOidLogsRequestIdGet**](WebhookApi.md#webhookWebhooksWebhookOidLogsRequestIdGet) | **GET** /webhook/webhooks/{webhookOid}/logs/{requestId} | Retrieve an individual log
[**webhookWebhooksWebhookOidPut**](WebhookApi.md#webhookWebhooksWebhookOidPut) | **PUT** /webhook/webhooks/{webhookOid} | Update a webhook
[**webhookWebhooksWebhookOidReflowEventNamePost**](WebhookApi.md#webhookWebhooksWebhookOidReflowEventNamePost) | **POST** /webhook/webhooks/{webhookOid}/reflow/{eventName} | Resend events to the webhook endpoint.
[**webhookWebhooksWebhookOidSamplesGet**](WebhookApi.md#webhookWebhooksWebhookOidSamplesGet) | **GET** /webhook/webhooks/{webhookOid}/samples | Retrieve a sample notification.
[**webhookWebhooksWebhookOidValidatePost**](WebhookApi.md#webhookWebhooksWebhookOidValidatePost) | **POST** /webhook/webhooks/{webhookOid}/validate | Send test message to an endpoint.


<a name="webhookWebhooksGet"></a>
# **webhookWebhooksGet**
> WebhooksResponse webhookWebhooksGet()

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
try {
    WebhooksResponse result = apiInstance.webhookWebhooksGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WebhooksResponse**](WebhooksResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhookWebhooksPost"></a>
# **webhookWebhooksPost**
> WebhooksResponse webhookWebhooksPost(webhook)

Add a webhook

Adds a new webhook on the account 

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
try {
    WebhooksResponse result = apiInstance.webhookWebhooksPost(webhook);
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

### Return type

[**WebhooksResponse**](WebhooksResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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
> WebhookLogSummariesResponse webhookWebhooksWebhookOidLogsGet(webhookOid)

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
try {
    WebhookLogSummariesResponse result = apiInstance.webhookWebhooksWebhookOidLogsGet(webhookOid);
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
> WebhooksResponse webhookWebhooksWebhookOidPut(webhook, webhookOid)

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
try {
    WebhooksResponse result = apiInstance.webhookWebhooksWebhookOidPut(webhook, webhookOid);
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

### Return type

[**WebhooksResponse**](WebhooksResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhookWebhooksWebhookOidSamplesGet"></a>
# **webhookWebhooksWebhookOidSamplesGet**
> WebhookSampleRequestResponse webhookWebhooksWebhookOidSamplesGet(webhookOid)

Retrieve a sample notification.

Retrieves a sample notification for the webhook.  This provides as example of what the notifications that can be delivered will look like. 

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
Integer webhookOid = 56; // Integer | The webhook oid to retrieve samples for.
try {
    WebhookSampleRequestResponse result = apiInstance.webhookWebhooksWebhookOidSamplesGet(webhookOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksWebhookOidSamplesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **webhookOid** | **Integer**| The webhook oid to retrieve samples for. |

### Return type

[**WebhookSampleRequestResponse**](WebhookSampleRequestResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="webhookWebhooksWebhookOidValidatePost"></a>
# **webhookWebhooksWebhookOidValidatePost**
> WebhookLogResponse webhookWebhooksWebhookOidValidatePost(samples, webhookOid)

Send test message to an endpoint.

Performs a test of the webhook endpoint given the specified sample request and returns the log associated with the response. 

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
WebhookSampleRequest samples = new WebhookSampleRequest(); // WebhookSampleRequest | Samples to send in the test
Integer webhookOid = 56; // Integer | The webhook oid that is being tested.
try {
    WebhookLogResponse result = apiInstance.webhookWebhooksWebhookOidValidatePost(samples, webhookOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookWebhooksWebhookOidValidatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **samples** | [**WebhookSampleRequest**](WebhookSampleRequest.md)| Samples to send in the test |
 **webhookOid** | **Integer**| The webhook oid that is being tested. |

### Return type

[**WebhookLogResponse**](WebhookLogResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

