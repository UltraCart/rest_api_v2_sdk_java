# DatawarehouseApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCustomDashboard**](DatawarehouseApi.md#deleteCustomDashboard) | **DELETE** /datawarehouse/custom_dashboards/{custom_dashboard_oid} | Delete a custom dashboard
[**deleteCustomDashboardSchedule**](DatawarehouseApi.md#deleteCustomDashboardSchedule) | **DELETE** /datawarehouse/custom_dashboards/{custom_dashboard_oid}/schedules/{custom_dashboard_schedule_oid} | Delete a custom dashboard schedule
[**deleteCustomReport**](DatawarehouseApi.md#deleteCustomReport) | **DELETE** /datawarehouse/custom_reports/{custom_report_oid} | Delete a custom report
[**deleteReport**](DatawarehouseApi.md#deleteReport) | **DELETE** /datawarehouse/reports/{report_oid} | Delete a report
[**dryRunReportQueries**](DatawarehouseApi.md#dryRunReportQueries) | **PUT** /datawarehouse/reports/dryrun | Dry run the report queries
[**executeCustomReport**](DatawarehouseApi.md#executeCustomReport) | **PUT** /datawarehouse/custom_reports/{custom_report_oid}/execute | Execute a custom report
[**executeCustomReports**](DatawarehouseApi.md#executeCustomReports) | **PUT** /datawarehouse/custom_reports/execute | Execute a custom reports
[**executeReportQueries**](DatawarehouseApi.md#executeReportQueries) | **PUT** /datawarehouse/reports/execute | Execute the report queries
[**getCustomDashboard**](DatawarehouseApi.md#getCustomDashboard) | **GET** /datawarehouse/custom_dashboards/{custom_dashboard_oid} | Get a custom dashboard
[**getCustomDashboardSchedules**](DatawarehouseApi.md#getCustomDashboardSchedules) | **GET** /datawarehouse/custom_dashboards/{custom_dashboard_oid}/schedules | Get custom dashboards
[**getCustomDashboards**](DatawarehouseApi.md#getCustomDashboards) | **GET** /datawarehouse/custom_dashboards | Get custom dashboards
[**getCustomReport**](DatawarehouseApi.md#getCustomReport) | **GET** /datawarehouse/custom_reports/{custom_report_oid} | Get a custom report
[**getCustomReportAccountConfig**](DatawarehouseApi.md#getCustomReportAccountConfig) | **GET** /datawarehouse/custom_reports/account_config | Get custom report account configuration
[**getCustomReports**](DatawarehouseApi.md#getCustomReports) | **GET** /datawarehouse/custom_reports | Get custom reports
[**getReport**](DatawarehouseApi.md#getReport) | **GET** /datawarehouse/reports/{report_oid} | Get a report
[**getReportDataSet**](DatawarehouseApi.md#getReportDataSet) | **GET** /datawarehouse/reports/dataset/{dataset_uuid} | Get a report data set
[**getReportDataSetPage**](DatawarehouseApi.md#getReportDataSetPage) | **GET** /datawarehouse/reports/dataset/{dataset_uuid}/pages/{page_number} | Get a report data set page
[**getReportWebsocketAuthorization**](DatawarehouseApi.md#getReportWebsocketAuthorization) | **PUT** /datawarehouse/reports/auth | Get report websocket authorization
[**getReports**](DatawarehouseApi.md#getReports) | **GET** /datawarehouse/reports | Get list of reports available
[**insertCustomDashboard**](DatawarehouseApi.md#insertCustomDashboard) | **POST** /datawarehouse/custom_dashboards | Create a custom dashboard
[**insertCustomDashboardSchedule**](DatawarehouseApi.md#insertCustomDashboardSchedule) | **POST** /datawarehouse/custom_dashboards/{custom_dashboard_oid}/schedules | Create a custom dashboard schedule
[**insertCustomReport**](DatawarehouseApi.md#insertCustomReport) | **POST** /datawarehouse/custom_reports | Create a custom report
[**insertReport**](DatawarehouseApi.md#insertReport) | **POST** /datawarehouse/reports | Create a report
[**updateCustomDashboard**](DatawarehouseApi.md#updateCustomDashboard) | **PUT** /datawarehouse/custom_dashboards/{custom_dashboard_oid} | Update a custom dashboard
[**updateCustomDashboardSchedule**](DatawarehouseApi.md#updateCustomDashboardSchedule) | **PUT** /datawarehouse/custom_dashboards/{custom_dashboard_oid}/schedules/{custom_dashboard_schedule_oid} | Update a custom dashboard schedule
[**updateCustomReport**](DatawarehouseApi.md#updateCustomReport) | **PUT** /datawarehouse/custom_reports/{custom_report_oid} | Update a custom report
[**updateCustomReportAccountConfig**](DatawarehouseApi.md#updateCustomReportAccountConfig) | **PUT** /datawarehouse/custom_reports/account_config | Update custom report account config
[**updateReport**](DatawarehouseApi.md#updateReport) | **PUT** /datawarehouse/reports/{report_oid} | Update a report


<a name="deleteCustomDashboard"></a>
# **deleteCustomDashboard**
> deleteCustomDashboard(customDashboardOid)

Delete a custom dashboard

Delete a custom dashboard on the UltraCart account. 

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

Integer customDashboardOid = 56; // Integer | The dashboard oid to delete.
try {
    apiInstance.deleteCustomDashboard(customDashboardOid);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#deleteCustomDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customDashboardOid** | **Integer**| The dashboard oid to delete. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCustomDashboardSchedule"></a>
# **deleteCustomDashboardSchedule**
> deleteCustomDashboardSchedule(customDashboardScheduleOid, customDashboardOid)

Delete a custom dashboard schedule

delete a custom dashboard schedule on the UltraCart account. 

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

Integer customDashboardScheduleOid = 56; // Integer | The dashboard schedule oid to delete.
Integer customDashboardOid = 56; // Integer | The dashboard oid that owns the schedule.
try {
    apiInstance.deleteCustomDashboardSchedule(customDashboardScheduleOid, customDashboardOid);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#deleteCustomDashboardSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customDashboardScheduleOid** | **Integer**| The dashboard schedule oid to delete. |
 **customDashboardOid** | **Integer**| The dashboard oid that owns the schedule. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="deleteCustomReport"></a>
# **deleteCustomReport**
> deleteCustomReport(customReportOid)

Delete a custom report

Delete a custom report on the UltraCart account. 

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

Integer customReportOid = 56; // Integer | The report oid to delete.
try {
    apiInstance.deleteCustomReport(customReportOid);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#deleteCustomReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customReportOid** | **Integer**| The report oid to delete. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

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

<a name="executeCustomReport"></a>
# **executeCustomReport**
> CustomReportExecutionResponse executeCustomReport(executionRequest, customReportOid)

Execute a custom report

Execute a custom report on the UltraCart account. 

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

CustomReportExecutionRequest executionRequest = new CustomReportExecutionRequest(); // CustomReportExecutionRequest | Request to execute custom report
Integer customReportOid = 56; // Integer | The report oid to execute.
try {
    CustomReportExecutionResponse result = apiInstance.executeCustomReport(executionRequest, customReportOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#executeCustomReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionRequest** | [**CustomReportExecutionRequest**](CustomReportExecutionRequest.md)| Request to execute custom report |
 **customReportOid** | **Integer**| The report oid to execute. |

### Return type

[**CustomReportExecutionResponse**](CustomReportExecutionResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="executeCustomReports"></a>
# **executeCustomReports**
> CustomReportsExecutionResponse executeCustomReports(executionRequest)

Execute a custom reports

Execute a custom reports on the UltraCart account. 

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

CustomReportsExecutionRequest executionRequest = new CustomReportsExecutionRequest(); // CustomReportsExecutionRequest | Request to execute custom reports
try {
    CustomReportsExecutionResponse result = apiInstance.executeCustomReports(executionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#executeCustomReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **executionRequest** | [**CustomReportsExecutionRequest**](CustomReportsExecutionRequest.md)| Request to execute custom reports |

### Return type

[**CustomReportsExecutionResponse**](CustomReportsExecutionResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
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

<a name="getCustomDashboard"></a>
# **getCustomDashboard**
> CustomDashboardResponse getCustomDashboard(customDashboardOid)

Get a custom dashboard

Retrieve a custom dashboard 

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

Integer customDashboardOid = 56; // Integer | 
try {
    CustomDashboardResponse result = apiInstance.getCustomDashboard(customDashboardOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getCustomDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customDashboardOid** | **Integer**|  |

### Return type

[**CustomDashboardResponse**](CustomDashboardResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomDashboardSchedules"></a>
# **getCustomDashboardSchedules**
> CustomDashboardSchedulesResponse getCustomDashboardSchedules(customDashboardOid)

Get custom dashboards

Retrieve a custom dashboards 

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

Integer customDashboardOid = 56; // Integer | 
try {
    CustomDashboardSchedulesResponse result = apiInstance.getCustomDashboardSchedules(customDashboardOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getCustomDashboardSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customDashboardOid** | **Integer**|  |

### Return type

[**CustomDashboardSchedulesResponse**](CustomDashboardSchedulesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomDashboards"></a>
# **getCustomDashboards**
> CustomDashboardsResponse getCustomDashboards()

Get custom dashboards

Retrieve a custom dashboards 

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
    CustomDashboardsResponse result = apiInstance.getCustomDashboards();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getCustomDashboards");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomDashboardsResponse**](CustomDashboardsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomReport"></a>
# **getCustomReport**
> CustomReportResponse getCustomReport(customReportOid)

Get a custom report

Retrieve a custom report 

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

Integer customReportOid = 56; // Integer | 
try {
    CustomReportResponse result = apiInstance.getCustomReport(customReportOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getCustomReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customReportOid** | **Integer**|  |

### Return type

[**CustomReportResponse**](CustomReportResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomReportAccountConfig"></a>
# **getCustomReportAccountConfig**
> CustomReportAccountConfigResponse getCustomReportAccountConfig()

Get custom report account configuration

Retrieve a custom report account configuration 

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
    CustomReportAccountConfigResponse result = apiInstance.getCustomReportAccountConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getCustomReportAccountConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomReportAccountConfigResponse**](CustomReportAccountConfigResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCustomReports"></a>
# **getCustomReports**
> CustomReportsResponse getCustomReports()

Get custom reports

Retrieve a custom reports 

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
    CustomReportsResponse result = apiInstance.getCustomReports();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#getCustomReports");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomReportsResponse**](CustomReportsResponse.md)

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

<a name="insertCustomDashboard"></a>
# **insertCustomDashboard**
> CustomDashboardResponse insertCustomDashboard(dashboard)

Create a custom dashboard

Create a new custom dashboard on the UltraCart account. 

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

CustomDashboard dashboard = new CustomDashboard(); // CustomDashboard | Dashboard to create
try {
    CustomDashboardResponse result = apiInstance.insertCustomDashboard(dashboard);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#insertCustomDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboard** | [**CustomDashboard**](CustomDashboard.md)| Dashboard to create |

### Return type

[**CustomDashboardResponse**](CustomDashboardResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="insertCustomDashboardSchedule"></a>
# **insertCustomDashboardSchedule**
> CustomDashboardScheduleResponse insertCustomDashboardSchedule(customDashboardOid, dashboardSchedule)

Create a custom dashboard schedule

Create a new custom dashboard schedule on the UltraCart account. 

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

Integer customDashboardOid = 56; // Integer | 
CustomDashboardSchedule dashboardSchedule = new CustomDashboardSchedule(); // CustomDashboardSchedule | Dashboard schedule to create
try {
    CustomDashboardScheduleResponse result = apiInstance.insertCustomDashboardSchedule(customDashboardOid, dashboardSchedule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#insertCustomDashboardSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customDashboardOid** | **Integer**|  |
 **dashboardSchedule** | [**CustomDashboardSchedule**](CustomDashboardSchedule.md)| Dashboard schedule to create |

### Return type

[**CustomDashboardScheduleResponse**](CustomDashboardScheduleResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="insertCustomReport"></a>
# **insertCustomReport**
> CustomReportResponse insertCustomReport(report)

Create a custom report

Create a new custom report on the UltraCart account. 

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

CustomReport report = new CustomReport(); // CustomReport | Report to create
try {
    CustomReportResponse result = apiInstance.insertCustomReport(report);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#insertCustomReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report** | [**CustomReport**](CustomReport.md)| Report to create |

### Return type

[**CustomReportResponse**](CustomReportResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
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

<a name="updateCustomDashboard"></a>
# **updateCustomDashboard**
> CustomDashboardResponse updateCustomDashboard(dashboard, customDashboardOid)

Update a custom dashboard

Update a custom dashboard on the UltraCart account. 

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

CustomDashboard dashboard = new CustomDashboard(); // CustomDashboard | Dashboard to custom update
Integer customDashboardOid = 56; // Integer | The dashboard oid to custom update.
try {
    CustomDashboardResponse result = apiInstance.updateCustomDashboard(dashboard, customDashboardOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#updateCustomDashboard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboard** | [**CustomDashboard**](CustomDashboard.md)| Dashboard to custom update |
 **customDashboardOid** | **Integer**| The dashboard oid to custom update. |

### Return type

[**CustomDashboardResponse**](CustomDashboardResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateCustomDashboardSchedule"></a>
# **updateCustomDashboardSchedule**
> CustomDashboardResponse updateCustomDashboardSchedule(dashboardSchedule, customDashboardScheduleOid, customDashboardOid)

Update a custom dashboard schedule

Update a custom dashboard schedule on the UltraCart account. 

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

CustomDashboardSchedule dashboardSchedule = new CustomDashboardSchedule(); // CustomDashboardSchedule | Dashboard schedule to update
Integer customDashboardScheduleOid = 56; // Integer | The dashboard schedule oid to update.
Integer customDashboardOid = 56; // Integer | The dashboard oid to update.
try {
    CustomDashboardResponse result = apiInstance.updateCustomDashboardSchedule(dashboardSchedule, customDashboardScheduleOid, customDashboardOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#updateCustomDashboardSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dashboardSchedule** | [**CustomDashboardSchedule**](CustomDashboardSchedule.md)| Dashboard schedule to update |
 **customDashboardScheduleOid** | **Integer**| The dashboard schedule oid to update. |
 **customDashboardOid** | **Integer**| The dashboard oid to update. |

### Return type

[**CustomDashboardResponse**](CustomDashboardResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateCustomReport"></a>
# **updateCustomReport**
> CustomReportResponse updateCustomReport(report, customReportOid)

Update a custom report

Update a custom report on the UltraCart account. 

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

CustomReport report = new CustomReport(); // CustomReport | Report to custom update
Integer customReportOid = 56; // Integer | The report oid to custom update.
try {
    CustomReportResponse result = apiInstance.updateCustomReport(report, customReportOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#updateCustomReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report** | [**CustomReport**](CustomReport.md)| Report to custom update |
 **customReportOid** | **Integer**| The report oid to custom update. |

### Return type

[**CustomReportResponse**](CustomReportResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateCustomReportAccountConfig"></a>
# **updateCustomReportAccountConfig**
> CustomReportAccountConfigResponse updateCustomReportAccountConfig(accountConfig)

Update custom report account config

Update custom report account config. 

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

CustomReportAccountConfig accountConfig = new CustomReportAccountConfig(); // CustomReportAccountConfig | Account config to update
try {
    CustomReportAccountConfigResponse result = apiInstance.updateCustomReportAccountConfig(accountConfig);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DatawarehouseApi#updateCustomReportAccountConfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountConfig** | [**CustomReportAccountConfig**](CustomReportAccountConfig.md)| Account config to update |

### Return type

[**CustomReportAccountConfigResponse**](CustomReportAccountConfigResponse.md)

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

