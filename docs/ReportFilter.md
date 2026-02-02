
# ReportFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connections** | [**List&lt;ReportFilterConnection&gt;**](ReportFilterConnection.md) | How this filter connects to the data sources and columns |  [optional]
**name** | **String** |  |  [optional]
**timezone** | **String** | The timezone that the date range is querying on. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of filter |  [optional]
**uuid** | **String** | Unique UUID assigned to the filter.  Assists when returning values that the filter can use. |  [optional]
**values** | **List&lt;String&gt;** | The selected values for the filter.  When used, some type conversion will need to occur. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DATE_RANGE | &quot;date range&quot;
DATE_COMPARISON | &quot;date comparison&quot;
SINGLE_VALUE | &quot;single value&quot;
MULTIPLE_VALUES | &quot;multiple values&quot;



