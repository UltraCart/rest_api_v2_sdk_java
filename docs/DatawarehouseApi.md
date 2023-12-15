# DatawarehouseApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteReport**](DatawarehouseApi.md#deleteReport) | **DELETE** /datawarehouse/reports/{report_oid} | Delete a report
[**dryRunReportQueries**](DatawarehouseApi.md#dryRunReportQueries) | **PUT** /datawarehouse/reports/dryrun | Dry run the report queries
[**executeReportQueries**](DatawarehouseApi.md#executeReportQueries) | **PUT** /datawarehouse/reports/execute | Execute the report queries
[**getReport**](DatawarehouseApi.md#getReport) | **GET** /datawarehouse/reports/{report_oid} | Get a report
[**getReportDataSet**](DatawarehouseApi.md#getReportDataSet) | **GET** /datawarehouse/reports/dataset/{dataset_uuid} | Get a report data set
[**getReportDataSetPage**](DatawarehouseApi.md#getReportDataSetPage) | **GET** /datawarehouse/reports/dataset/{dataset_uuid}/pages/{page_number} | Get a report data set page
[**getReportWebsocketAuthorization**](DatawarehouseApi.md#getReportWebsocketAuthorization) | **PUT** /datawarehouse/reports/auth | Get report websocket authorization
[**getReports**](DatawarehouseApi.md#getReports) | **GET** /datawarehouse/reports | Get list of reports available
[**insertReport**](DatawarehouseApi.md#insertReport) | **POST** /datawarehouse/reports | Create a report
[**updateReport**](DatawarehouseApi.md#updateReport) | **PUT** /datawarehouse/reports/{report_oid} | Update a report


<a name="deleteReport"></a>
# **deleteReport**
> deleteReport(reportOid)

Delete a report

Delete a report on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

Integer reportOid = 56; // Integer | The report oid to delete.
try {
    apiInstance.deleteReport(reportOid);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#deleteReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportOid** | **Integer**| The report oid to delete. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dryRunReportQueries"></a>
# **dryRunReportQueries**
> ReportDryRunQueriesResponse dryRunReportQueries(queryRequest)

Dry run the report queries

Dry run the report queries 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

ReportDryRunQueriesRequest queryRequest = new ReportDryRunQueriesRequest(); // ReportDryRunQueriesRequest | Dry run request
try {
    ReportDryRunQueriesResponse result = apiInstance.dryRunReportQueries(queryRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#dryRunReportQueries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | [**ReportDryRunQueriesRequest**](ReportDryRunQueriesRequest.md)| Dry run request |

### Return type

[**ReportDryRunQueriesResponse**](ReportDryRunQueriesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="executeReportQueries"></a>
# **executeReportQueries**
> executeReportQueries(queryRequest)

Execute the report queries

Execute the report queries 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

ReportExecuteQueriesRequest queryRequest = new ReportExecuteQueriesRequest(); // ReportExecuteQueriesRequest | Query request
try {
    apiInstance.executeReportQueries(queryRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#executeReportQueries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **queryRequest** | [**ReportExecuteQueriesRequest**](ReportExecuteQueriesRequest.md)| Query request |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReport"></a>
# **getReport**
> ReportResponse getReport(reportOid)

Get a report

Retrieve a report 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

Integer reportOid = 56; // Integer | 
try {
    ReportResponse result = apiInstance.getReport(reportOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportOid** | **Integer**|  |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportDataSet"></a>
# **getReportDataSet**
> ReportDataSetResponse getReportDataSet(datasetUuid)

Get a report data set

Retrieve a report data set 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

String datasetUuid = "datasetUuid_example"; // String | 
try {
    ReportDataSetResponse result = apiInstance.getReportDataSet(datasetUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getReportDataSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetUuid** | **String**|  |

### Return type

[**ReportDataSetResponse**](ReportDataSetResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportDataSetPage"></a>
# **getReportDataSetPage**
> ReportDataSetPageResponse getReportDataSetPage(datasetUuid, pageNumber)

Get a report data set page

Retrieve a report data set page 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

String datasetUuid = "datasetUuid_example"; // String | 
Integer pageNumber = 56; // Integer | 
try {
    ReportDataSetPageResponse result = apiInstance.getReportDataSetPage(datasetUuid, pageNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getReportDataSetPage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasetUuid** | **String**|  |
 **pageNumber** | **Integer**|  |

### Return type

[**ReportDataSetPageResponse**](ReportDataSetPageResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportWebsocketAuthorization"></a>
# **getReportWebsocketAuthorization**
> ReportAuthResponse getReportWebsocketAuthorization()

Get report websocket authorization

Retrieve a JWT to authorize a report to make a websocket connection. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

try {
    ReportAuthResponse result = apiInstance.getReportWebsocketAuthorization();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getReportWebsocketAuthorization");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportAuthResponse**](ReportAuthResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReports"></a>
# **getReports**
> ReportsResponse getReports()

Get list of reports available

Retrieve a list of reports available 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

try {
    ReportsResponse result = apiInstance.getReports();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getReports");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportsResponse**](ReportsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertReport"></a>
# **insertReport**
> ReportResponse insertReport(report)

Create a report

Create a new report on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

Report report = new Report(); // Report | Report to create
try {
    ReportResponse result = apiInstance.insertReport(report);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#insertReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report** | [**Report**](Report.md)| Report to create |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateReport"></a>
# **updateReport**
> ReportResponse updateReport(report, reportOid)

Update a report

Update a report on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.DatawarehouseApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
DatawarehouseApi apiInstance = new DatawarehouseApi(apiKey);

Report report = new Report(); // Report | Report to update
Integer reportOid = 56; // Integer | The report oid to update.
try {
    ReportResponse result = apiInstance.updateReport(report, reportOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#updateReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report** | [**Report**](Report.md)| Report to update |
 **reportOid** | **Integer**| The report oid to update. |

### Return type

[**ReportResponse**](ReportResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

