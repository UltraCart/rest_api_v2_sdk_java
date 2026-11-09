

# SfvbTrackingCheckPlanRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** | The host, exactly, or with a leading star and dot for any subdomain. |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | script, beacon or pixel. |  [optional] |
|**params** | **Object** | Query params that must be on the request.  A star means present with any value. |  [optional] |
|**pathPrefix** | **String** | The start of the path. |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| SCRIPT | &quot;script&quot; |
| BEACON | &quot;beacon&quot; |
| PIXEL | &quot;pixel&quot; |



