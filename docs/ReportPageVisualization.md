

# ReportPageVisualization


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | **String** | A JSON representation of the configuration for this visualization |  [optional] |
|**dataSourceName** | **String** |  |  [optional] |
|**dataSourceUuid** | **String** | A unique identifier assigned to the data source. |  [optional] |
|**dimensions** | [**List&lt;ReportPageVisualizationDimension&gt;**](ReportPageVisualizationDimension.md) |  |  [optional] |
|**metrics** | [**List&lt;ReportPageVisualizationMetric&gt;**](ReportPageVisualizationMetric.md) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**showComparison** | **Boolean** | True if the visualization should show a comparison based upon the date range |  [optional] |
|**styles** | **String** | A JSON representation of the style configuration for this visualization |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of visualization |  [optional] |
|**visualizationUuid** | **String** | A UUID for the visualization |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| SCORE_CARD | &quot;score card&quot; |
| LINE_CHART | &quot;line chart&quot; |
| BAR_CHART | &quot;bar chart&quot; |
| TEXT | &quot;text&quot; |
| TABLE | &quot;table&quot; |
| GAUGE | &quot;gauge&quot; |
| PIE_CHART | &quot;pie chart&quot; |



