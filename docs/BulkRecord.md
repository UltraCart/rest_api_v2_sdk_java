

# BulkRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | On an upsert success, whether the record was inserted or updated |  [optional] |
|**errorCode** | **String** | Error code on a failed record |  [optional] |
|**errorMessage** | **String** | Human-readable detail on a failed record |  [optional] |
|**lineNumber** | **Long** | Original NDJSON line number |  [optional] |
|**merchantRecordId** | **String** | The merchant-supplied dedupe key for this record |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Per-record verdict |  [optional] |
|**ucId** | **String** | UltraCart-side id created on success or matched on duplicate |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| INSERTED | &quot;inserted&quot; |
| UPDATED | &quot;updated&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESS | &quot;success&quot; |
| FAILED | &quot;failed&quot; |
| DUPLICATE | &quot;duplicate&quot; |



