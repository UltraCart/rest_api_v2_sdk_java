# IntegrationLogApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIntegrationLog**](IntegrationLogApi.md#getIntegrationLog) | **GET** /integration_log/query/{pk}/{sk} | Retrieve an integration log
[**getIntegrationLogFile**](IntegrationLogApi.md#getIntegrationLogFile) | **GET** /integration_log/query/{pk}/{sk}/{uuid} | Retrieve an integration log file
[**getIntegrationLogFilePdf**](IntegrationLogApi.md#getIntegrationLogFilePdf) | **GET** /integration_log/query/{pk}/{sk}/{uuid}/pdf | Retrieve an integration log file converted to PDF
[**getIntegrationLogSummariesQuery**](IntegrationLogApi.md#getIntegrationLogSummariesQuery) | **POST** /integration_log/summary/query | Retrieve integration log summaries
[**getIntegrationLogsQuery**](IntegrationLogApi.md#getIntegrationLogsQuery) | **POST** /integration_log/query | Retrieve integration logs


<a name="getIntegrationLog"></a>
# **getIntegrationLog**
> IntegrationLogResponse getIntegrationLog(pk, sk)

Retrieve an integration log

Retrieve an integration logs from the account based identifiers 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.IntegrationLogApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
IntegrationLogApi apiInstance = new IntegrationLogApi(apiKey);

String pk = "pk_example"; // String | 
String sk = "sk_example"; // String | 
try {
    IntegrationLogResponse result = apiInstance.getIntegrationLog(pk, sk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationLogApi#getIntegrationLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **String**|  |
 **sk** | **String**|  |

### Return type

[**IntegrationLogResponse**](IntegrationLogResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIntegrationLogFile"></a>
# **getIntegrationLogFile**
> File getIntegrationLogFile(pk, sk, uuid)

Retrieve an integration log file

Retrieve an integration log file from the account based identifiers 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.IntegrationLogApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
IntegrationLogApi apiInstance = new IntegrationLogApi(apiKey);

String pk = "pk_example"; // String | 
String sk = "sk_example"; // String | 
String uuid = "uuid_example"; // String | 
try {
    File result = apiInstance.getIntegrationLogFile(pk, sk, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationLogApi#getIntegrationLogFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **String**|  |
 **sk** | **String**|  |
 **uuid** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="getIntegrationLogFilePdf"></a>
# **getIntegrationLogFilePdf**
> File getIntegrationLogFilePdf(pk, sk, uuid)

Retrieve an integration log file converted to PDF

Retrieve an integration log file from the account based identifiers 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.IntegrationLogApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
IntegrationLogApi apiInstance = new IntegrationLogApi(apiKey);

String pk = "pk_example"; // String | 
String sk = "sk_example"; // String | 
String uuid = "uuid_example"; // String | 
try {
    File result = apiInstance.getIntegrationLogFilePdf(pk, sk, uuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationLogApi#getIntegrationLogFilePdf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pk** | **String**|  |
 **sk** | **String**|  |
 **uuid** | **String**|  |

### Return type

[**File**](File.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="getIntegrationLogSummariesQuery"></a>
# **getIntegrationLogSummariesQuery**
> IntegrationLogSummaryQueryResponse getIntegrationLogSummariesQuery(integrationLogSummariesQuery)

Retrieve integration log summaries

Retrieves a set of integration log summaries from the account based on a query object. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.IntegrationLogApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
IntegrationLogApi apiInstance = new IntegrationLogApi(apiKey);

IntegrationLogSummaryQueryRequest integrationLogSummariesQuery = new IntegrationLogSummaryQueryRequest(); // IntegrationLogSummaryQueryRequest | Integration log summaries query
try {
    IntegrationLogSummaryQueryResponse result = apiInstance.getIntegrationLogSummariesQuery(integrationLogSummariesQuery);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationLogApi#getIntegrationLogSummariesQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogSummariesQuery** | [**IntegrationLogSummaryQueryRequest**](IntegrationLogSummaryQueryRequest.md)| Integration log summaries query |

### Return type

[**IntegrationLogSummaryQueryResponse**](IntegrationLogSummaryQueryResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIntegrationLogsQuery"></a>
# **getIntegrationLogsQuery**
> IntegrationLogQueryResponse getIntegrationLogsQuery(integrationLogQuery, limit, offset, sort)

Retrieve integration logs

Retrieves a set of integration logs from the account based on a query object. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.IntegrationLogApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
IntegrationLogApi apiInstance = new IntegrationLogApi(apiKey);

IntegrationLogQueryRequest integrationLogQuery = new IntegrationLogQueryRequest(); // IntegrationLogQueryRequest | Integration log query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Default 100, Max 500)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
try {
    IntegrationLogQueryResponse result = apiInstance.getIntegrationLogsQuery(integrationLogQuery, limit, offset, sort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationLogApi#getIntegrationLogsQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **integrationLogQuery** | [**IntegrationLogQueryRequest**](IntegrationLogQueryRequest.md)| Integration log query |
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Default 100, Max 500) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]

### Return type

[**IntegrationLogQueryResponse**](IntegrationLogQueryResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

