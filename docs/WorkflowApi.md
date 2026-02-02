# WorkflowApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorkflowAgentWebsocketAuthorization**](WorkflowApi.md#getWorkflowAgentWebsocketAuthorization) | **PUT** /workflow/agent/auth | Get agent websocket authorization
[**getWorkflowAssignmentGroups**](WorkflowApi.md#getWorkflowAssignmentGroups) | **GET** /workflow/assignment_groups | Retrieve a list of groups that workflow tasks can be assigned to
[**getWorkflowAssignmentUsers**](WorkflowApi.md#getWorkflowAssignmentUsers) | **GET** /workflow/assignment_users | Retrieve a list of users that workflow tasks can be assigned to
[**getWorkflowMe**](WorkflowApi.md#getWorkflowMe) | **GET** /workflow/me | Retrieve a user object for myself
[**getWorkflowTask**](WorkflowApi.md#getWorkflowTask) | **GET** /workflow/tasks/{task_uuid} | Retrieve a workflow task
[**getWorkflowTaskAttachmentUploadUrl**](WorkflowApi.md#getWorkflowTaskAttachmentUploadUrl) | **GET** /workflow/tasks/attachments/{extension} | Get a presigned workflow task attachment upload URL
[**getWorkflowTaskByObjectType**](WorkflowApi.md#getWorkflowTaskByObjectType) | **GET** /workflow/tasks/by/{object_type}/{object_id} | Retrieve a workflow task by object type and id
[**getWorkflowTaskOpenCount**](WorkflowApi.md#getWorkflowTaskOpenCount) | **GET** /workflow/tasks/open_count | Retrieve workflow task open count
[**getWorkflowTaskTags**](WorkflowApi.md#getWorkflowTaskTags) | **GET** /workflow/tasks/tags | Get a list of existing workflow task tags
[**getWorkflowTasks**](WorkflowApi.md#getWorkflowTasks) | **POST** /workflow/tasks/search | Search workflow tasks
[**insertWorkflowTask**](WorkflowApi.md#insertWorkflowTask) | **POST** /workflow/tasks | Insert a workflow task
[**updateWorkflowTask**](WorkflowApi.md#updateWorkflowTask) | **PUT** /workflow/tasks/{task_uuid} | Update a workflow task


<a name="getWorkflowAgentWebsocketAuthorization"></a>
# **getWorkflowAgentWebsocketAuthorization**
> WorkflowAgentAuthResponse getWorkflowAgentWebsocketAuthorization()

Get agent websocket authorization

Retrieve a JWT to authorize an agent to make a websocket connection. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

try {
    WorkflowAgentAuthResponse result = apiInstance.getWorkflowAgentWebsocketAuthorization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowAgentWebsocketAuthorization");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkflowAgentAuthResponse**](WorkflowAgentAuthResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowAssignmentGroups"></a>
# **getWorkflowAssignmentGroups**
> WorkflowGroupsResponse getWorkflowAssignmentGroups(limit, offset)

Retrieve a list of groups that workflow tasks can be assigned to

Retrieve a list of groups that workflow tasks can be assigned to 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
try {
    WorkflowGroupsResponse result = apiInstance.getWorkflowAssignmentGroups(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowAssignmentGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]

### Return type

[**WorkflowGroupsResponse**](WorkflowGroupsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowAssignmentUsers"></a>
# **getWorkflowAssignmentUsers**
> WorkflowUsersResponse getWorkflowAssignmentUsers(limit, offset)

Retrieve a list of users that workflow tasks can be assigned to

Retrieve a list of users that workflow tasks can be assigned to 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Max 200)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
try {
    WorkflowUsersResponse result = apiInstance.getWorkflowAssignmentUsers(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowAssignmentUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]

### Return type

[**WorkflowUsersResponse**](WorkflowUsersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowMe"></a>
# **getWorkflowMe**
> WorkflowUserResponse getWorkflowMe()

Retrieve a user object for myself

Retrieve a user object for myself 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

try {
    WorkflowUserResponse result = apiInstance.getWorkflowMe();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowMe");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkflowUserResponse**](WorkflowUserResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowTask"></a>
# **getWorkflowTask**
> WorkflowTaskResponse getWorkflowTask(taskUuid)

Retrieve a workflow task

Retrieve a workflow task 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

String taskUuid = "taskUuid_example"; // String | 
try {
    WorkflowTaskResponse result = apiInstance.getWorkflowTask(taskUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskUuid** | **String**|  |

### Return type

[**WorkflowTaskResponse**](WorkflowTaskResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowTaskAttachmentUploadUrl"></a>
# **getWorkflowTaskAttachmentUploadUrl**
> WorkflowAttachmentUploadUrlResponse getWorkflowTaskAttachmentUploadUrl(extension)

Get a presigned workflow task attachment upload URL

Get a presigned workflow task attachment upload URL 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

String extension = "extension_example"; // String | 
try {
    WorkflowAttachmentUploadUrlResponse result = apiInstance.getWorkflowTaskAttachmentUploadUrl(extension);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowTaskAttachmentUploadUrl");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **extension** | **String**|  |

### Return type

[**WorkflowAttachmentUploadUrlResponse**](WorkflowAttachmentUploadUrlResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowTaskByObjectType"></a>
# **getWorkflowTaskByObjectType**
> WorkflowTasksResponse getWorkflowTaskByObjectType(objectType, objectId)

Retrieve a workflow task by object type and id

Retrieve a workflow task by object type and id 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

String objectType = "objectType_example"; // String | 
String objectId = "objectId_example"; // String | 
try {
    WorkflowTasksResponse result = apiInstance.getWorkflowTaskByObjectType(objectType, objectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowTaskByObjectType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **objectType** | **String**|  |
 **objectId** | **String**|  |

### Return type

[**WorkflowTasksResponse**](WorkflowTasksResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowTaskOpenCount"></a>
# **getWorkflowTaskOpenCount**
> WorkflowTaskOpenCountResponse getWorkflowTaskOpenCount()

Retrieve workflow task open count

Retrieve workflow task open count 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

try {
    WorkflowTaskOpenCountResponse result = apiInstance.getWorkflowTaskOpenCount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowTaskOpenCount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkflowTaskOpenCountResponse**](WorkflowTaskOpenCountResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowTaskTags"></a>
# **getWorkflowTaskTags**
> WorkflowTaskTagsResponse getWorkflowTaskTags()

Get a list of existing workflow task tags

Retrieves a unique list of all the existing workflow task tags. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

try {
    WorkflowTaskTagsResponse result = apiInstance.getWorkflowTaskTags();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowTaskTags");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WorkflowTaskTagsResponse**](WorkflowTaskTagsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWorkflowTasks"></a>
# **getWorkflowTasks**
> WorkflowTasksResponse getWorkflowTasks(workflowTasksQuery, limit, offset, sort)

Search workflow tasks

Retrieves a set of workflow tasks from the account based on a query object. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

WorkflowTasksRequest workflowTasksQuery = new WorkflowTasksRequest(); // WorkflowTasksRequest | Workflow tasks query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Default 100, Max 500)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
try {
    WorkflowTasksResponse result = apiInstance.getWorkflowTasks(workflowTasksQuery, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#getWorkflowTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowTasksQuery** | [**WorkflowTasksRequest**](WorkflowTasksRequest.md)| Workflow tasks query |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Default 100, Max 500) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]

### Return type

[**WorkflowTasksResponse**](WorkflowTasksResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertWorkflowTask"></a>
# **insertWorkflowTask**
> WorkflowTaskResponse insertWorkflowTask(workflowTask)

Insert a workflow task

Insert a workflow task 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

WorkflowTask workflowTask = new WorkflowTask(); // WorkflowTask | workflow task
try {
    WorkflowTaskResponse result = apiInstance.insertWorkflowTask(workflowTask);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#insertWorkflowTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowTask** | [**WorkflowTask**](WorkflowTask.md)| workflow task |

### Return type

[**WorkflowTaskResponse**](WorkflowTaskResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWorkflowTask"></a>
# **updateWorkflowTask**
> WorkflowTaskResponse updateWorkflowTask(taskUuid, workflowTask)

Update a workflow task

Update a workflow task 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.WorkflowApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
WorkflowApi apiInstance = new WorkflowApi(apiKey);

String taskUuid = "taskUuid_example"; // String | 
WorkflowTask workflowTask = new WorkflowTask(); // WorkflowTask | Workflow task
try {
    WorkflowTaskResponse result = apiInstance.updateWorkflowTask(taskUuid, workflowTask);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkflowApi#updateWorkflowTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskUuid** | **String**|  |
 **workflowTask** | [**WorkflowTask**](WorkflowTask.md)| Workflow task |

### Return type

[**WorkflowTaskResponse**](WorkflowTaskResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

