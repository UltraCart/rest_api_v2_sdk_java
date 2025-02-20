

# ReportDataSourceSchema


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | **String** | A JSON representation of the configuration for this visualization |  [optional] |
|**dimension** | **Boolean** | Whether or not this column can be used as a dimension within a visualization |  [optional] |
|**name** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the column.  Only supporting the allowed values.  Any other types will be ignored. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BIGNUMERIC | &quot;BIGNUMERIC&quot; |
| BOOL | &quot;BOOL&quot; |
| DATE | &quot;DATE&quot; |
| DATETIME | &quot;DATETIME&quot; |
| FLOAT64 | &quot;FLOAT64&quot; |
| INT64 | &quot;INT64&quot; |
| JSON | &quot;JSON&quot; |
| NUMERIC | &quot;NUMERIC&quot; |
| STRING | &quot;STRING&quot; |
| TIME | &quot;TIME&quot; |
| TIMESTAMP | &quot;TIMESTAMP&quot; |



