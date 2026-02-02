

# Report


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  [optional] |
|**dataSources** | [**List&lt;ReportDataSource&gt;**](ReportDataSource.md) |  |  [optional] |
|**defaultDatasetId** | **String** |  |  [optional] |
|**defaultProjectId** | **String** |  |  [optional] |
|**filters** | [**List&lt;ReportFilter&gt;**](ReportFilter.md) |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**pages** | [**List&lt;ReportPage&gt;**](ReportPage.md) |  |  [optional] |
|**reportOid** | **Integer** | Object identifier for this report. |  [optional] |
|**securityLevel** | [**SecurityLevelEnum**](#SecurityLevelEnum) | Security level to execute report under |  [optional] |
|**settings** | **String** | A JSON representation of the settings for this report |  [optional] |



## Enum: SecurityLevelEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| LOW | &quot;low&quot; |
| MEDIUM | &quot;medium&quot; |
| HIGH | &quot;high&quot; |



