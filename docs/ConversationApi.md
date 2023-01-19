# ConversationApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteConversationCannedMessage**](ConversationApi.md#deleteConversationCannedMessage) | **DELETE** /conversation/canned_messages/{conversation_canned_message_oid} | Delete a conversation canned message |
| [**deleteDepartment**](ConversationApi.md#deleteDepartment) | **DELETE** /conversation/departments/{conversation_department_oid} | Delete a conversation department |
| [**deleteEngagement**](ConversationApi.md#deleteEngagement) | **DELETE** /conversation/engagements/{conversation_engagement_oid} | Delete a conversation engagement |
| [**getAgentKeepAlive**](ConversationApi.md#getAgentKeepAlive) | **GET** /conversation/agent/keepalive | Agent keep alive |
| [**getAgentWebsocketAuthorization**](ConversationApi.md#getAgentWebsocketAuthorization) | **PUT** /conversation/agent/auth | Get agent websocket authorization |
| [**getConversation**](ConversationApi.md#getConversation) | **GET** /conversation/conversations/{conversation_uuid} | Retrieve a conversation |
| [**getConversationCannedMessages**](ConversationApi.md#getConversationCannedMessages) | **GET** /conversation/canned_messages | Retrieve a list of canned messages ordered by short_code |
| [**getConversationContext**](ConversationApi.md#getConversationContext) | **PUT** /conversation/conversations/{conversation_uuid}/context | Get a webchat conversation context |
| [**getConversationDepartmentMemberList**](ConversationApi.md#getConversationDepartmentMemberList) | **GET** /conversation/department_members | Retrieve a list of possible department members |
| [**getConversationDepartments**](ConversationApi.md#getConversationDepartments) | **GET** /conversation/departments | Retrieve a list of departments ordered by name |
| [**getConversationEngagements**](ConversationApi.md#getConversationEngagements) | **GET** /conversation/engagements | Retrieve a list of engagements ordered by name |
| [**getConversationMessages**](ConversationApi.md#getConversationMessages) | **GET** /conversation/conversations/{conversation_uuid}/messages/{since} | Retrieve conversation messages |
| [**getConversationMultimediaUploadUrl**](ConversationApi.md#getConversationMultimediaUploadUrl) | **GET** /conversation/upload_url/{extension} | Get a presigned conersation multimedia upload URL |
| [**getConversationPermissions**](ConversationApi.md#getConversationPermissions) | **GET** /conversation/permissions | Retrieve conversation permissions |
| [**getConversationWebchatQueueStatuses**](ConversationApi.md#getConversationWebchatQueueStatuses) | **GET** /conversation/conversations/queues/statuses | Retrieve a conversation webchat queue statuses |
| [**getConversations**](ConversationApi.md#getConversations) | **GET** /conversation/conversations | Retrieve a list of conversation summaries newest to oldest |
| [**getConversationsAutocomplete**](ConversationApi.md#getConversationsAutocomplete) | **POST** /conversation/conversations/autocomplete | Retrieve a list of matching terms for a search field |
| [**getConversationsSearch**](ConversationApi.md#getConversationsSearch) | **POST** /conversation/conversations/search | Search conversations |
| [**insertConversationCannedMessage**](ConversationApi.md#insertConversationCannedMessage) | **POST** /conversation/canned_messages | Insert a canned message |
| [**insertConversationDepartment**](ConversationApi.md#insertConversationDepartment) | **POST** /conversation/departments | Insert a department |
| [**insertConversationEngagement**](ConversationApi.md#insertConversationEngagement) | **POST** /conversation/engagements | Insert a engagement |
| [**joinConversation**](ConversationApi.md#joinConversation) | **PUT** /conversation/conversations/{conversation_uuid}/join | Join a conversation |
| [**leaveConversation**](ConversationApi.md#leaveConversation) | **DELETE** /conversation/conversations/{conversation_uuid}/leave | Leave a conversation |
| [**markReadConversation**](ConversationApi.md#markReadConversation) | **PUT** /conversation/conversations/{conversation_uuid}/markread | Mark a conversation as read |
| [**searchConversationCannedMessages**](ConversationApi.md#searchConversationCannedMessages) | **POST** /conversation/canned_messages/search | Search for canned messages by short_code |
| [**startConversation**](ConversationApi.md#startConversation) | **PUT** /conversation/conversations | Start a conversation |
| [**updateConversationCannedMessage**](ConversationApi.md#updateConversationCannedMessage) | **PUT** /conversation/canned_messages/{conversation_canned_message_oid} | Update a canned message |
| [**updateConversationDepartment**](ConversationApi.md#updateConversationDepartment) | **PUT** /conversation/departments/{conversation_department_oid} | Update a department |
| [**updateConversationEngagement**](ConversationApi.md#updateConversationEngagement) | **PUT** /conversation/engagements/{conversation_engagement_oid} | Update a engagement |
| [**updateConversationWebchatQueueStatus**](ConversationApi.md#updateConversationWebchatQueueStatus) | **PUT** /conversation/conversations/queues/{queue_name}/status | Update status within the queue |


<a name="deleteConversationCannedMessage"></a>
# **deleteConversationCannedMessage**
> deleteConversationCannedMessage(conversationCannedMessageOid)

Delete a conversation canned message

Delete a conversation canned message 

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
try {
    apiInstance.deleteConversationCannedMessage(conversationCannedMessageOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteConversationCannedMessage");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationCannedMessageOid** | **Integer**|  | |

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

<a name="deleteDepartment"></a>
# **deleteDepartment**
> deleteDepartment(conversationDepartmentOid)

Delete a conversation department

Delete a conversation department 

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

Integer conversationDepartmentOid = 56; // Integer | 
try {
    apiInstance.deleteDepartment(conversationDepartmentOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteDepartment");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationDepartmentOid** | **Integer**|  | |

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

<a name="deleteEngagement"></a>
# **deleteEngagement**
> deleteEngagement(conversationEngagementOid)

Delete a conversation engagement

Delete a conversation engagement 

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

Integer conversationEngagementOid = 56; // Integer | 
try {
    apiInstance.deleteEngagement(conversationEngagementOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#deleteEngagement");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationEngagementOid** | **Integer**|  | |

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

<a name="getConversationDepartmentMemberList"></a>
# **getConversationDepartmentMemberList**
> ConversationDepartmentMembersResponse getConversationDepartmentMemberList()

Retrieve a list of possible department members

Retrieve a list of possible department members 

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
    ConversationDepartmentMembersResponse result = apiInstance.getConversationDepartmentMemberList();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationDepartmentMemberList");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationDepartmentMembersResponse**](ConversationDepartmentMembersResponse.md)

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

<a name="getConversationDepartments"></a>
# **getConversationDepartments**
> ConversationDepartmentsResponse getConversationDepartments()

Retrieve a list of departments ordered by name

Retrieve a list of departments ordered by name 

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
    ConversationDepartmentsResponse result = apiInstance.getConversationDepartments();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationDepartments");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationDepartmentsResponse**](ConversationDepartmentsResponse.md)

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

<a name="getConversationEngagements"></a>
# **getConversationEngagements**
> ConversationEngagementsResponse getConversationEngagements()

Retrieve a list of engagements ordered by name

Retrieve a list of engagements ordered by name 

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
    ConversationEngagementsResponse result = apiInstance.getConversationEngagements();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationEngagements");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationEngagementsResponse**](ConversationEngagementsResponse.md)

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

<a name="getConversationPermissions"></a>
# **getConversationPermissions**
> ConversationPermissionsResponse getConversationPermissions()

Retrieve conversation permissions

Retrieve conversation permissions 

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
    ConversationPermissionsResponse result = apiInstance.getConversationPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationPermissions");
    e.printStackTrace();
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ConversationPermissionsResponse**](ConversationPermissionsResponse.md)

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

<a name="getConversationsAutocomplete"></a>
# **getConversationsAutocomplete**
> ConversationAutocompleteResponse getConversationsAutocomplete(autocompleteRequest)

Retrieve a list of matching terms for a search field

Retrieve a list of matching terms for a search field 

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

ConversationAutocompleteRequest autocompleteRequest = new ConversationAutocompleteRequest(); // ConversationAutocompleteRequest | Autocomplete Request
try {
    ConversationAutocompleteResponse result = apiInstance.getConversationsAutocomplete(autocompleteRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationsAutocomplete");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autocompleteRequest** | [**ConversationAutocompleteRequest**](ConversationAutocompleteRequest.md)| Autocomplete Request | |

### Return type

[**ConversationAutocompleteResponse**](ConversationAutocompleteResponse.md)

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

<a name="getConversationsSearch"></a>
# **getConversationsSearch**
> ConversationSearchResponse getConversationsSearch(searchRequest)

Search conversations

Search conversations 

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

ConversationSearchRequest searchRequest = new ConversationSearchRequest(); // ConversationSearchRequest | Search Request
try {
    ConversationSearchResponse result = apiInstance.getConversationsSearch(searchRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#getConversationsSearch");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchRequest** | [**ConversationSearchRequest**](ConversationSearchRequest.md)| Search Request | |

### Return type

[**ConversationSearchResponse**](ConversationSearchResponse.md)

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

<a name="insertConversationDepartment"></a>
# **insertConversationDepartment**
> ConversationDepartmentResponse insertConversationDepartment(department)

Insert a department

Insert a department 

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

ConversationDepartment department = new ConversationDepartment(); // ConversationDepartment | Department
try {
    ConversationDepartmentResponse result = apiInstance.insertConversationDepartment(department);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertConversationDepartment");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **department** | [**ConversationDepartment**](ConversationDepartment.md)| Department | |

### Return type

[**ConversationDepartmentResponse**](ConversationDepartmentResponse.md)

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

<a name="insertConversationEngagement"></a>
# **insertConversationEngagement**
> ConversationEngagementResponse insertConversationEngagement(engagement)

Insert a engagement

Insert a engagement 

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

ConversationEngagement engagement = new ConversationEngagement(); // ConversationEngagement | Engagement
try {
    ConversationEngagementResponse result = apiInstance.insertConversationEngagement(engagement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#insertConversationEngagement");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **engagement** | [**ConversationEngagement**](ConversationEngagement.md)| Engagement | |

### Return type

[**ConversationEngagementResponse**](ConversationEngagementResponse.md)

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
> joinConversation(conversationUuid, joinRequest)

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
ConversationJoinRequest joinRequest = new ConversationJoinRequest(); // ConversationJoinRequest | Join request
try {
    apiInstance.joinConversation(conversationUuidjoinRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#joinConversation");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationUuid** | **String**|  | |
| **joinRequest** | [**ConversationJoinRequest**](ConversationJoinRequest.md)| Join request | [optional] |

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

<a name="updateConversationDepartment"></a>
# **updateConversationDepartment**
> ConversationDepartmentResponse updateConversationDepartment(conversationDepartmentOid, department)

Update a department

Update a department 

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

Integer conversationDepartmentOid = 56; // Integer | 
ConversationDepartment department = new ConversationDepartment(); // ConversationDepartment | Department
try {
    ConversationDepartmentResponse result = apiInstance.updateConversationDepartment(conversationDepartmentOiddepartment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateConversationDepartment");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationDepartmentOid** | **Integer**|  | |
| **department** | [**ConversationDepartment**](ConversationDepartment.md)| Department | |

### Return type

[**ConversationDepartmentResponse**](ConversationDepartmentResponse.md)

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

<a name="updateConversationEngagement"></a>
# **updateConversationEngagement**
> ConversationEngagementResponse updateConversationEngagement(conversationEngagementOid, engagement)

Update a engagement

Update a engagement 

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

Integer conversationEngagementOid = 56; // Integer | 
ConversationEngagement engagement = new ConversationEngagement(); // ConversationEngagement | Engagement
try {
    ConversationEngagementResponse result = apiInstance.updateConversationEngagement(conversationEngagementOidengagement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConversationApi#updateConversationEngagement");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversationEngagementOid** | **Integer**|  | |
| **engagement** | [**ConversationEngagement**](ConversationEngagement.md)| Engagement | |

### Return type

[**ConversationEngagementResponse**](ConversationEngagementResponse.md)

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

