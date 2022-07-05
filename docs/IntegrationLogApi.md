# IntegrationLogApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIntegrationLog**](IntegrationLogApi.md#getIntegrationLog) | **GET** /integration_log/query/{pk}/{sk} | Retrieve an integration log |
| [**getIntegrationLogFile**](IntegrationLogApi.md#getIntegrationLogFile) | **GET** /integration_log/query/{pk}/{sk}/{uuid} | Retrieve an integration log file |
| [**getIntegrationLogFilePdf**](IntegrationLogApi.md#getIntegrationLogFilePdf) | **GET** /integration_log/query/{pk}/{sk}/{uuid}/pdf | Retrieve an integration log file converted to PDF |
| [**getIntegrationLogSummariesQuery**](IntegrationLogApi.md#getIntegrationLogSummariesQuery) | **POST** /integration_log/summary/query | Retrieve integration log summaries |
| [**getIntegrationLogsQuery**](IntegrationLogApi.md#getIntegrationLogsQuery) | **POST** /integration_log/query | Retrieve integration logs |


<a name="getIntegrationLog"></a>
# **getIntegrationLog**
> IntegrationLogResponse getIntegrationLog(pk, sk)

Retrieve an integration log

Retrieve an integration logs from the account based identifiers 

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
import com.ultracart.admin.v2.IntegrationLogApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
IntegrationLogApi apiInstance = new IntegrationLogApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String pk = "pk_example"; // String | 
String sk = "sk_example"; // String | 
try {
    IntegrationLogResponse result = apiInstance.getIntegrationLog(pksk);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationLogApi#getIntegrationLog");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pk** | **String**|  | |
| **sk** | **String**|  | |

### Return type

[**IntegrationLogResponse**](IntegrationLogResponse.md)

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

<a name="getIntegrationLogFile"></a>
# **getIntegrationLogFile**
> File getIntegrationLogFile(pk, sk, uuid)

Retrieve an integration log file

Retrieve an integration log file from the account based identifiers 

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
import com.ultracart.admin.v2.IntegrationLogApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
IntegrationLogApi apiInstance = new IntegrationLogApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String pk = "pk_example"; // String | 
String sk = "sk_example"; // String | 
String uuid = "uuid_example"; // String | 
try {
    File result = apiInstance.getIntegrationLogFile(pkskuuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationLogApi#getIntegrationLogFile");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pk** | **String**|  | |
| **sk** | **String**|  | |
| **uuid** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getIntegrationLogFilePdf"></a>
# **getIntegrationLogFilePdf**
> File getIntegrationLogFilePdf(pk, sk, uuid)

Retrieve an integration log file converted to PDF

Retrieve an integration log file from the account based identifiers 

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
import com.ultracart.admin.v2.IntegrationLogApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
IntegrationLogApi apiInstance = new IntegrationLogApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

String pk = "pk_example"; // String | 
String sk = "sk_example"; // String | 
String uuid = "uuid_example"; // String | 
try {
    File result = apiInstance.getIntegrationLogFilePdf(pkskuuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationLogApi#getIntegrationLogFilePdf");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pk** | **String**|  | |
| **sk** | **String**|  | |
| **uuid** | **String**|  | |

### Return type

[**File**](File.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getIntegrationLogSummariesQuery"></a>
# **getIntegrationLogSummariesQuery**
> IntegrationLogSummaryQueryResponse getIntegrationLogSummariesQuery(integrationLogSummariesQuery)

Retrieve integration log summaries

Retrieves a set of integration log summaries from the account based on a query object. 

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
import com.ultracart.admin.v2.IntegrationLogApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
IntegrationLogApi apiInstance = new IntegrationLogApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationLogSummariesQuery** | [**IntegrationLogSummaryQueryRequest**](IntegrationLogSummaryQueryRequest.md)| Integration log summaries query | |

### Return type

[**IntegrationLogSummaryQueryResponse**](IntegrationLogSummaryQueryResponse.md)

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

<a name="getIntegrationLogsQuery"></a>
# **getIntegrationLogsQuery**
> IntegrationLogQueryResponse getIntegrationLogsQuery(integrationLogQuery, limit, offset, sort)

Retrieve integration logs

Retrieves a set of integration logs from the account based on a query object. 

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
import com.ultracart.admin.v2.IntegrationLogApi;
import common.Constants; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/Constants.java
import common.JSON; // https://github.com/UltraCart/sdk_samples/blob/master/java/src/common/JSON.java

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
IntegrationLogApi apiInstance = new IntegrationLogApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

IntegrationLogQueryRequest integrationLogQuery = new IntegrationLogQueryRequest(); // IntegrationLogQueryRequest | Integration log query
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Default 100, Max 500)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String sort = "sort_example"; // String | The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
try {
    IntegrationLogQueryResponse result = apiInstance.getIntegrationLogsQuery(integrationLogQuerylimitoffsetsort);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IntegrationLogApi#getIntegrationLogsQuery");
    e.printStackTrace();
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **integrationLogQuery** | [**IntegrationLogQueryRequest**](IntegrationLogQueryRequest.md)| Integration log query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Default 100, Max 500) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |

### Return type

[**IntegrationLogQueryResponse**](IntegrationLogQueryResponse.md)

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

