
# ReportExecuteQueriesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientUuid** | **String** | Unique UUID assigned to this client during the auth.  This will be used to locate the websocket connect id. |  [optional]
**connectionId** | **String** | The websocket connection id that should receive back notices of query completion. |  [optional]
**defaultDatasetId** | **String** |  |  [optional]
**defaultProjectId** | **String** |  |  [optional]
**merchantId** | **String** |  |  [optional]
**queries** | [**List&lt;ReportDataSetQuery&gt;**](ReportDataSetQuery.md) | An array of queries that we want the lambda function to execute. |  [optional]
**requestDts** | **String** | Date/Time of the client submitted the request.  Can be used to resolve out of order query completion results |  [optional]
**securityLevel** | [**SecurityLevelEnum**](#SecurityLevelEnum) | Security level to execute report under |  [optional]


<a name="SecurityLevelEnum"></a>
## Enum: SecurityLevelEnum
Name | Value
---- | -----
STANDARD | &quot;standard&quot;
LOW | &quot;low&quot;
MEDIUM | &quot;medium&quot;
HIGH | &quot;high&quot;



