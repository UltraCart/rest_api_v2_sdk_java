# ConversationApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAgentKeepAlive**](ConversationApi.md#getAgentKeepAlive) | **GET** /conversation/agent/keepalive | Agent keep alive |
| [**getAgentWebsocketAuthorization**](ConversationApi.md#getAgentWebsocketAuthorization) | **PUT** /conversation/agent/auth | Get agent websocket authorization |
| [**getConversation**](ConversationApi.md#getConversation) | **GET** /conversation/conversations/{conversation_uuid} | Retrieve a conversation |
| [**getConversationCannedMessages**](ConversationApi.md#getConversationCannedMessages) | **GET** /conversation/canned_messages | Retrieve a list of canned messages ordered by short_code |
| [**getConversationContext**](ConversationApi.md#getConversationContext) | **PUT** /conversation/conversations/{conversation_uuid}/context | Get a webchat conversation context |
| [**getConversationMessages**](ConversationApi.md#getConversationMessages) | **GET** /conversation/conversations/{conversation_uuid}/messages/{since} | Retrieve conversation messages |
| [**getConversationMultimediaUploadUrl**](ConversationApi.md#getConversationMultimediaUploadUrl) | **GET** /conversation/upload_url/{extension} | Get a presigned conersation multimedia upload URL |
| [**getConversationWebchatQueueStatuses**](ConversationApi.md#getConversationWebchatQueueStatuses) | **GET** /conversation/conversations/queues/statuses | Retrieve a conversation webchat queue statuses |
| [**getConversations**](ConversationApi.md#getConversations) | **GET** /conversation/conversations | Retrieve a list of conversation summaries newest to oldest |
| [**insertConversationCannedMessage**](ConversationApi.md#insertConversationCannedMessage) | **POST** /conversation/canned_messages | Insert a canned message |
| [**joinConversation**](ConversationApi.md#joinConversation) | **PUT** /conversation/conversations/{conversation_uuid}/join | Join a conversation |
| [**leaveConversation**](ConversationApi.md#leaveConversation) | **DELETE** /conversation/conversations/{conversation_uuid}/leave | Leave a conversation |
| [**markReadConversation**](ConversationApi.md#markReadConversation) | **PUT** /conversation/conversations/{conversation_uuid}/markread | Mark a conversation as read |
| [**searchConversationCannedMessages**](ConversationApi.md#searchConversationCannedMessages) | **POST** /conversation/canned_messages/search | Search for canned messages by short_code |
| [**startConversation**](ConversationApi.md#startConversation) | **PUT** /conversation/conversations | Start a conversation |
| [**updateConversationCannedMessage**](ConversationApi.md#updateConversationCannedMessage) | **PUT** /conversation/canned_messages/{conversation_canned_message_oid} | Update a canned message |
| [**updateConversationWebchatQueueStatus**](ConversationApi.md#updateConversationWebchatQueueStatus) | **PUT** /conversation/conversations/queues/{queue_name}/status | Update status within the queue |


<a name="getAgentKeepAlive"></a>
# **getAgentKeepAlive**
> getAgentKeepAlive()

Agent keep alive

Called periodically by the conversation API to keep the session alive. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    apiInstance.getAgentKeepAlive();
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentKeepAlive");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

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
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getAgentWebsocketAuthorization"></a>
# **getAgentWebsocketAuthorization**
> ConversationAgentAuthResponse getAgentWebsocketAuthorization()

Get agent websocket authorization

Retrieve a JWT to authorize an agent to make a websocket connection. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    ConversationAgentAuthResponse result = apiInstance.getAgentWebsocketAuthorization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getAgentWebsocketAuthorization");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationAgentAuthResponse**](ConversationAgentAuthResponse.md)

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

<a name="getConversation"></a>
# **getConversation**
> ConversationResponse getConversation(conversationUuid, limit)

Retrieve a conversation

Retrieve a conversation including the participants and messages 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String conversationUuid = "conversationUuid_example"; // String | 
Integer limit = 56; // Integer | 
try {
    ConversationResponse result = apiInstance.getConversation(conversationUuidlimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversation");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationUuid** | **String**|  | |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ConversationResponse**](ConversationResponse.md)

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

<a name="getConversationCannedMessages"></a>
# **getConversationCannedMessages**
> ConversationCannedMessagesResponse getConversationCannedMessages()

Retrieve a list of canned messages ordered by short_code

Retrieve a list of canned messages ordered by short_code 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    ConversationCannedMessagesResponse result = apiInstance.getConversationCannedMessages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationCannedMessages");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationCannedMessagesResponse**](ConversationCannedMessagesResponse.md)

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

<a name="getConversationContext"></a>
# **getConversationContext**
> ConversationWebchatContext getConversationContext(conversationUuid)

Get a webchat conversation context

Get a webchat conversation context 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String conversationUuid = "conversationUuid_example"; // String | 
try {
    ConversationWebchatContext result = apiInstance.getConversationContext(conversationUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationContext");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationUuid** | **String**|  | |

### Return type

[**ConversationWebchatContext**](ConversationWebchatContext.md)

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

<a name="getConversationMessages"></a>
# **getConversationMessages**
> ConversationMessagesResponse getConversationMessages(conversationUuid, since, limit)

Retrieve conversation messages

Retrieve conversation messages since a particular time 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String conversationUuid = "conversationUuid_example"; // String | 
Long since = 56L; // Long | 
Integer limit = 56; // Integer | 
try {
    ConversationMessagesResponse result = apiInstance.getConversationMessages(conversationUuidsincelimit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationMessages");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationUuid** | **String**|  | |
| **since** | **Long**|  | |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ConversationMessagesResponse**](ConversationMessagesResponse.md)

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

<a name="getConversationMultimediaUploadUrl"></a>
# **getConversationMultimediaUploadUrl**
> ConversationMultimediaUploadUrlResponse getConversationMultimediaUploadUrl(extension)

Get a presigned conersation multimedia upload URL

Get a presigned conersation multimedia upload URL 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String extension = "extension_example"; // String | 
try {
    ConversationMultimediaUploadUrlResponse result = apiInstance.getConversationMultimediaUploadUrl(extension);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationMultimediaUploadUrl");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **extension** | **String**|  | |

### Return type

[**ConversationMultimediaUploadUrlResponse**](ConversationMultimediaUploadUrlResponse.md)

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

<a name="getConversationWebchatQueueStatuses"></a>
# **getConversationWebchatQueueStatuses**
> ConversationWebchatQueueStatusesResponse getConversationWebchatQueueStatuses()

Retrieve a conversation webchat queue statuses

Retrieve a conversation webchat queue statuses including agent status and queue entries 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

try {
    ConversationWebchatQueueStatusesResponse result = apiInstance.getConversationWebchatQueueStatuses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationWebchatQueueStatuses");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationWebchatQueueStatusesResponse**](ConversationWebchatQueueStatusesResponse.md)

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

<a name="getConversations"></a>
# **getConversations**
> ConversationsResponse getConversations(medium, before, limit, offset)

Retrieve a list of conversation summaries newest to oldest

Retrieve a list of conversation summaries that are ordered newest to oldest, include the most recent message and whether its been read. 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String medium = "medium_example"; // String | 
String before = "before_example"; // String | 
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
try {
    ConversationsResponse result = apiInstance.getConversations(mediumbeforelimitoffset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversations");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **medium** | **String**|  | [optional] |
| **before** | **String**|  | [optional] |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |

### Return type

[**ConversationsResponse**](ConversationsResponse.md)

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

<a name="insertConversationCannedMessage"></a>
# **insertConversationCannedMessage**
> ConversationCannedMessageResponse insertConversationCannedMessage(cannedMessage)

Insert a canned message

Insert a canned message 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

ConversationCannedMessage cannedMessage = new ConversationCannedMessage(); // ConversationCannedMessage | Canned message
try {
    ConversationCannedMessageResponse result = apiInstance.insertConversationCannedMessage(cannedMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertConversationCannedMessage");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cannedMessage** | [**ConversationCannedMessage**](ConversationCannedMessage.md)| Canned message | |

### Return type

[**ConversationCannedMessageResponse**](ConversationCannedMessageResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="joinConversation"></a>
# **joinConversation**
> joinConversation(conversationUuid)

Join a conversation

Join a conversation 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String conversationUuid = "conversationUuid_example"; // String | 
try {
    apiInstance.joinConversation(conversationUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#joinConversation");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationUuid** | **String**|  | |

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
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="leaveConversation"></a>
# **leaveConversation**
> leaveConversation(conversationUuid)

Leave a conversation

Leave a conversation 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String conversationUuid = "conversationUuid_example"; // String | 
try {
    apiInstance.leaveConversation(conversationUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#leaveConversation");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationUuid** | **String**|  | |

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
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="markReadConversation"></a>
# **markReadConversation**
> markReadConversation(conversationUuid)

Mark a conversation as read

Mark a conversation as read 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String conversationUuid = "conversationUuid_example"; // String | 
try {
    apiInstance.markReadConversation(conversationUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#markReadConversation");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationUuid** | **String**|  | |

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
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="searchConversationCannedMessages"></a>
# **searchConversationCannedMessages**
> ConversationCannedMessagesResponse searchConversationCannedMessages(searchRequest)

Search for canned messages by short_code

Search for canned messages by short_code 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

ConversationCannedMessagesSearch searchRequest = new ConversationCannedMessagesSearch(); // ConversationCannedMessagesSearch | Search request
try {
    ConversationCannedMessagesResponse result = apiInstance.searchConversationCannedMessages(searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#searchConversationCannedMessages");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchRequest** | [**ConversationCannedMessagesSearch**](ConversationCannedMessagesSearch.md)| Search request | |

### Return type

[**ConversationCannedMessagesResponse**](ConversationCannedMessagesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="startConversation"></a>
# **startConversation**
> ConversationStartResponse startConversation(startRequest)

Start a conversation

Start a new conversation 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

ConversationStartRequest startRequest = new ConversationStartRequest(); // ConversationStartRequest | Start request
try {
    ConversationStartResponse result = apiInstance.startConversation(startRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#startConversation");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startRequest** | [**ConversationStartRequest**](ConversationStartRequest.md)| Start request | |

### Return type

[**ConversationStartResponse**](ConversationStartResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="updateConversationCannedMessage"></a>
# **updateConversationCannedMessage**
> ConversationCannedMessageResponse updateConversationCannedMessage(conversationCannedMessageOid, cannedMessage)

Update a canned message

Update a canned message 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

Integer conversationCannedMessageOid = 56; // Integer | 
ConversationCannedMessage cannedMessage = new ConversationCannedMessage(); // ConversationCannedMessage | Canned message
try {
    ConversationCannedMessageResponse result = apiInstance.updateConversationCannedMessage(conversationCannedMessageOidcannedMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateConversationCannedMessage");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationCannedMessageOid** | **Integer**|  | |
| **cannedMessage** | [**ConversationCannedMessage**](ConversationCannedMessage.md)| Canned message | |

### Return type

[**ConversationCannedMessageResponse**](ConversationCannedMessageResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="updateConversationWebchatQueueStatus"></a>
# **updateConversationWebchatQueueStatus**
> updateConversationWebchatQueueStatus(queueName, statusRequest)

Update status within the queue

Update status within the queue 

### Example
```java
// This example is based on our samples_sdk project, but still contains auto-generated content from our sdk generators.
// As such, this might not be the best way to use this object.
// Please see https://github.com/UltraCart/sdk_samples for working examples.

// Import classes:
import com.ultracart.admin.v2.util.ApiClient;
import com.ultracart.admin.v2.util.ApiException;
import com.ultracart.admin.v2.util.Configuration;
import com.ultracart.admin.v2.util.auth.*;
import com.ultracart.admin.v2.ConversationApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
ConversationApi apiInstance = new ConversationApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String queueName = "queueName_example"; // String | 
ConversationWebchatQueueStatusUpdateRequest statusRequest = new ConversationWebchatQueueStatusUpdateRequest(); // ConversationWebchatQueueStatusUpdateRequest | Status request
try {
    apiInstance.updateConversationWebchatQueueStatus(queueNamestatusRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateConversationWebchatQueueStatus");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queueName** | **String**|  | |
| **statusRequest** | [**ConversationWebchatQueueStatusUpdateRequest**](ConversationWebchatQueueStatusUpdateRequest.md)| Status request | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

