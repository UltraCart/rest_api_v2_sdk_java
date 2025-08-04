# DatawarehouseApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCustomDashboard**](DatawarehouseApi.md#deleteCustomDashboard) | **DELETE** /datawarehouse/custom_dashboards/{custom_dashboard_oid} | Delete a custom dashboard |
| [**deleteCustomReport**](DatawarehouseApi.md#deleteCustomReport) | **DELETE** /datawarehouse/custom_reports/{custom_report_oid} | Delete a custom report |
| [**deleteReport**](DatawarehouseApi.md#deleteReport) | **DELETE** /datawarehouse/reports/{report_oid} | Delete a report |
| [**dryRunReportQueries**](DatawarehouseApi.md#dryRunReportQueries) | **PUT** /datawarehouse/reports/dryrun | Dry run the report queries |
| [**executeCustomReport**](DatawarehouseApi.md#executeCustomReport) | **PUT** /datawarehouse/custom_reports/{custom_report_oid}/execute | Execute a custom report |
| [**executeCustomReports**](DatawarehouseApi.md#executeCustomReports) | **PUT** /datawarehouse/custom_reports/execute | Execute a custom reports |
| [**executeReportQueries**](DatawarehouseApi.md#executeReportQueries) | **PUT** /datawarehouse/reports/execute | Execute the report queries |
| [**getCustomDashboard**](DatawarehouseApi.md#getCustomDashboard) | **GET** /datawarehouse/custom_dashboards/{custom_dashboard_oid} | Get a custom dashboard |
| [**getCustomDashboards**](DatawarehouseApi.md#getCustomDashboards) | **GET** /datawarehouse/custom_dashboards | Get custom dashboards |
| [**getCustomReport**](DatawarehouseApi.md#getCustomReport) | **GET** /datawarehouse/custom_reports/{custom_report_oid} | Get a custom report |
| [**getCustomReportAccountConfig**](DatawarehouseApi.md#getCustomReportAccountConfig) | **GET** /datawarehouse/custom_reports/account_config | Get custom report account configuration |
| [**getCustomReports**](DatawarehouseApi.md#getCustomReports) | **GET** /datawarehouse/custom_reports | Get custom reports |
| [**getReport**](DatawarehouseApi.md#getReport) | **GET** /datawarehouse/reports/{report_oid} | Get a report |
| [**getReportDataSet**](DatawarehouseApi.md#getReportDataSet) | **GET** /datawarehouse/reports/dataset/{dataset_uuid} | Get a report data set |
| [**getReportDataSetPage**](DatawarehouseApi.md#getReportDataSetPage) | **GET** /datawarehouse/reports/dataset/{dataset_uuid}/pages/{page_number} | Get a report data set page |
| [**getReportWebsocketAuthorization**](DatawarehouseApi.md#getReportWebsocketAuthorization) | **PUT** /datawarehouse/reports/auth | Get report websocket authorization |
| [**getReports**](DatawarehouseApi.md#getReports) | **GET** /datawarehouse/reports | Get list of reports available |
| [**insertCustomDashboard**](DatawarehouseApi.md#insertCustomDashboard) | **POST** /datawarehouse/custom_dashboards | Create a custom dashboard |
| [**insertCustomReport**](DatawarehouseApi.md#insertCustomReport) | **POST** /datawarehouse/custom_reports | Create a custom report |
| [**insertReport**](DatawarehouseApi.md#insertReport) | **POST** /datawarehouse/reports | Create a report |
| [**updateCustomDashboard**](DatawarehouseApi.md#updateCustomDashboard) | **PUT** /datawarehouse/custom_dashboards/{custom_dashboard_oid} | Update a custom dashboard |
| [**updateCustomReport**](DatawarehouseApi.md#updateCustomReport) | **PUT** /datawarehouse/custom_reports/{custom_report_oid} | Update a custom report |
| [**updateCustomReportAccountConfig**](DatawarehouseApi.md#updateCustomReportAccountConfig) | **PUT** /datawarehouse/custom_reports/account_config | Update custom report account config |
| [**updateReport**](DatawarehouseApi.md#updateReport) | **PUT** /datawarehouse/reports/{report_oid} | Update a report |


<a name="deleteCustomDashboard"></a>
# **deleteCustomDashboard**
> deleteCustomDashboard(customDashboardOid)

Delete a custom dashboard

Delete a custom dashboard on the UltraCart account. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customDashboardOid** | **Integer**| The dashboard oid to delete. | |

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

<a name="deleteCustomReport"></a>
# **deleteCustomReport**
> deleteCustomReport(customReportOid)

Delete a custom report

Delete a custom report on the UltraCart account. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customReportOid** | **Integer**| The report oid to delete. | |

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

<a name="deleteReport"></a>
# **deleteReport**
> deleteReport(reportOid)

Delete a report

Delete a report on the UltraCart account. 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportOid** | **Integer**| The report oid to delete. | |

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

<a name="dryRunReportQueries"></a>
# **dryRunReportQueries**
> ReportDryRunQueriesResponse dryRunReportQueries(queryRequest)

Dry run the report queries

Dry run the report queries 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queryRequest** | [**ReportDryRunQueriesRequest**](ReportDryRunQueriesRequest.md)| Dry run request | |

### Return type

[**ReportDryRunQueriesResponse**](ReportDryRunQueriesResponse.md)

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

<a name="executeCustomReport"></a>
# **executeCustomReport**
> CustomReportExecutionResponse executeCustomReport(customReportOid, executionRequest)

Execute a custom report

Execute a custom report on the UltraCart account. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customReportOid** | **Integer**| The report oid to execute. | |
| **executionRequest** | [**CustomReportExecutionRequest**](CustomReportExecutionRequest.md)| Request to execute custom report | |

### Return type

[**CustomReportExecutionResponse**](CustomReportExecutionResponse.md)

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

<a name="executeCustomReports"></a>
# **executeCustomReports**
> CustomReportsExecutionResponse executeCustomReports(executionRequest)

Execute a custom reports

Execute a custom reports on the UltraCart account. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **executionRequest** | [**CustomReportsExecutionRequest**](CustomReportsExecutionRequest.md)| Request to execute custom reports | |

### Return type

[**CustomReportsExecutionResponse**](CustomReportsExecutionResponse.md)

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

<a name="executeReportQueries"></a>
# **executeReportQueries**
> executeReportQueries(queryRequest)

Execute the report queries

Execute the report queries 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queryRequest** | [**ReportExecuteQueriesRequest**](ReportExecuteQueriesRequest.md)| Query request | |

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

<a name="getCustomDashboard"></a>
# **getCustomDashboard**
> CustomDashboardResponse getCustomDashboard(customDashboardOid)

Get a custom dashboard

Retrieve a custom dashboard 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customDashboardOid** | **Integer**|  | |

### Return type

[**CustomDashboardResponse**](CustomDashboardResponse.md)

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

<a name="getCustomDashboards"></a>
# **getCustomDashboards**
> CustomDashboardsResponse getCustomDashboards()

Get custom dashboards

Retrieve a custom dashboards 

### Example


(No example for this operation).


### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomDashboardsResponse**](CustomDashboardsResponse.md)

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

<a name="getCustomReport"></a>
# **getCustomReport**
> CustomReportResponse getCustomReport(customReportOid)

Get a custom report

Retrieve a custom report 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customReportOid** | **Integer**|  | |

### Return type

[**CustomReportResponse**](CustomReportResponse.md)

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

<a name="getCustomReportAccountConfig"></a>
# **getCustomReportAccountConfig**
> CustomReportAccountConfigResponse getCustomReportAccountConfig()

Get custom report account configuration

Retrieve a custom report account configuration 

### Example


(No example for this operation).


### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomReportAccountConfigResponse**](CustomReportAccountConfigResponse.md)

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

<a name="getCustomReports"></a>
# **getCustomReports**
> CustomReportsResponse getCustomReports()

Get custom reports

Retrieve a custom reports 

### Example


(No example for this operation).


### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomReportsResponse**](CustomReportsResponse.md)

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

<a name="getReport"></a>
# **getReport**
> ReportResponse getReport(reportOid)

Get a report

Retrieve a report 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportOid** | **Integer**|  | |

### Return type

[**ReportResponse**](ReportResponse.md)

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

<a name="getReportDataSet"></a>
# **getReportDataSet**
> ReportDataSetResponse getReportDataSet(datasetUuid)

Get a report data set

Retrieve a report data set 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetUuid** | **String**|  | |

### Return type

[**ReportDataSetResponse**](ReportDataSetResponse.md)

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

<a name="getReportDataSetPage"></a>
# **getReportDataSetPage**
> ReportDataSetPageResponse getReportDataSetPage(datasetUuid, pageNumber)

Get a report data set page

Retrieve a report data set page 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **datasetUuid** | **String**|  | |
| **pageNumber** | **Integer**|  | |

### Return type

[**ReportDataSetPageResponse**](ReportDataSetPageResponse.md)

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

<a name="getReportWebsocketAuthorization"></a>
# **getReportWebsocketAuthorization**
> ReportAuthResponse getReportWebsocketAuthorization()

Get report websocket authorization

Retrieve a JWT to authorize a report to make a websocket connection. 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportAuthResponse**](ReportAuthResponse.md)

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

<a name="getReports"></a>
# **getReports**
> ReportsResponse getReports()

Get list of reports available

Retrieve a list of reports available 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportsResponse**](ReportsResponse.md)

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

<a name="insertCustomDashboard"></a>
# **insertCustomDashboard**
> CustomDashboardResponse insertCustomDashboard(dashboard)

Create a custom dashboard

Create a new custom dashboard on the UltraCart account. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboard** | [**CustomDashboard**](CustomDashboard.md)| Dashboard to create | |

### Return type

[**CustomDashboardResponse**](CustomDashboardResponse.md)

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

<a name="insertCustomReport"></a>
# **insertCustomReport**
> CustomReportResponse insertCustomReport(report)

Create a custom report

Create a new custom report on the UltraCart account. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **report** | [**CustomReport**](CustomReport.md)| Report to create | |

### Return type

[**CustomReportResponse**](CustomReportResponse.md)

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

<a name="insertReport"></a>
# **insertReport**
> ReportResponse insertReport(report)

Create a report

Create a new report on the UltraCart account. 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **report** | [**Report**](Report.md)| Report to create | |

### Return type

[**ReportResponse**](ReportResponse.md)

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

<a name="updateCustomDashboard"></a>
# **updateCustomDashboard**
> CustomDashboardResponse updateCustomDashboard(customDashboardOid, dashboard)

Update a custom dashboard

Update a custom dashboard on the UltraCart account. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customDashboardOid** | **Integer**| The dashboard oid to custom update. | |
| **dashboard** | [**CustomDashboard**](CustomDashboard.md)| Dashboard to custom update | |

### Return type

[**CustomDashboardResponse**](CustomDashboardResponse.md)

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

<a name="updateCustomReport"></a>
# **updateCustomReport**
> CustomReportResponse updateCustomReport(customReportOid, report)

Update a custom report

Update a custom report on the UltraCart account. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customReportOid** | **Integer**| The report oid to custom update. | |
| **report** | [**CustomReport**](CustomReport.md)| Report to custom update | |

### Return type

[**CustomReportResponse**](CustomReportResponse.md)

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

<a name="updateCustomReportAccountConfig"></a>
# **updateCustomReportAccountConfig**
> CustomReportAccountConfigResponse updateCustomReportAccountConfig(accountConfig)

Update custom report account config

Update custom report account config. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountConfig** | [**CustomReportAccountConfig**](CustomReportAccountConfig.md)| Account config to update | |

### Return type

[**CustomReportAccountConfigResponse**](CustomReportAccountConfigResponse.md)

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

<a name="updateReport"></a>
# **updateReport**
> ReportResponse updateReport(reportOid, report)

Update a report

Update a report on the UltraCart account. 

### Example

```java
// (Internal API).  No sample for this method as a merchant will never need call it.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportOid** | **Integer**| The report oid to update. | |
| **report** | [**Report**](Report.md)| Report to update | |

### Return type

[**ReportResponse**](ReportResponse.md)

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

