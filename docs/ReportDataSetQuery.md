

# ReportDataSetQuery


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**comparisonResults** | **Boolean** | True if a date range filter is provided with comparison date ranges and two results should be returned for the query. |  [optional] |
|**dataSetQueryUuid** | **String** | A unique identifier assigned to the data set query that is returned. |  [optional] |
|**dataSource** | [**ReportDataSource**](ReportDataSource.md) |  |  [optional] |
|**dimensions** | [**List&lt;ReportPageVisualizationDimension&gt;**](ReportPageVisualizationDimension.md) |  |  [optional] |
|**filter** | [**ReportFilter**](ReportFilter.md) |  |  [optional] |
|**forObjectId** | **String** | An identifier that can be used to help match up the returned data set |  [optional] |
|**forObjectType** | [**ForObjectTypeEnum**](#ForObjectTypeEnum) | The type of object this data set is for |  [optional] |
|**metrics** | [**List&lt;ReportPageVisualizationMetric&gt;**](ReportPageVisualizationMetric.md) |  |  [optional] |
|**orderByColumns** | [**List&lt;ReportDataSetQueryOrderByColumn&gt;**](ReportDataSetQueryOrderByColumn.md) | The columns to order by in the final result.  If not specified the dimensions will be used |  [optional] |
|**pageSize** | **Integer** | Result set page size.  The default value is 200 records.  Max is 10000. |  [optional] |
|**selectedFilters** | [**List&lt;ReportFilter&gt;**](ReportFilter.md) |  |  [optional] |
|**skipCache** | **Boolean** | True if the 15 minute cache should be skipped. |  [optional] |
|**userData** | **String** | Any other data that needs to be returned with the response to help the UI |  [optional] |



## Enum: ForObjectTypeEnum

| Name | Value |
|---- | -----|
| SCHEMA | &quot;schema&quot; |
| FILTER | &quot;filter&quot; |
| VISUALIZATION | &quot;visualization&quot; |



