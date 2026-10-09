

# SfvbItemAttributeBatchRowResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentPresent** | **Boolean** | Whether the item had the attribute before this batch. |  [optional] |
|**currentSha256** | **String** | The hash of the value before this batch.  Send it back with the row to apply. |  [optional] |
|**currentValue** | **String** | The value before this batch, for a backup.  Empty when the item has no such attribute. |  [optional] |
|**merchantItemId** | **String** | The item&#39;s merchant item id.  Absent when not_found. |  [optional] |
|**merchantItemOid** | **Integer** | The item.  Absent when not_found. |  [optional] |
|**message** | **String** | Why a row is invalid, stale or error. |  [optional] |
|**name** | **String** | The attribute name as sent. |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) | change or unchanged from a dry run, updated after an apply, stale (the value differs from expected_value or changed since the dry run), not_found, invalid, or error when the item could not be saved. |  [optional] |
|**row** | **Integer** | The row&#39;s position in the request, from 1. |  [optional] |
|**type** | **String** | The type the value is checked and stored as - the declaring template&#39;s, else the one sent. |  [optional] |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| CHANGE | &quot;change&quot; |
| UNCHANGED | &quot;unchanged&quot; |
| UPDATED | &quot;updated&quot; |
| STALE | &quot;stale&quot; |
| NOT_FOUND | &quot;not_found&quot; |
| INVALID | &quot;invalid&quot; |
| ERROR | &quot;error&quot; |



