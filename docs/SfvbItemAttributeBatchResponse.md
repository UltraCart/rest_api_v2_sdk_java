

# SfvbItemAttributeBatchResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**applied** | **Boolean** | True after an apply. |  [optional] |
|**change** | **Integer** | Rows that would change, from a dry run. |  [optional] |
|**error** | **Integer** | Rows on an item that could not be saved, after an apply. |  [optional] |
|**invalid** | **Integer** | Rows refused by the attribute checks. |  [optional] |
|**itemCount** | **Integer** | Distinct items with at least one row that would change, or did. |  [optional] |
|**notFound** | **Integer** | Rows naming an item that does not exist. |  [optional] |
|**planHash** | **String** | The hash of the rows answered as change, with their current_sha256.  Apply exactly those rows with this hash. |  [optional] |
|**rows** | [**List&lt;SfvbItemAttributeBatchRowResult&gt;**](SfvbItemAttributeBatchRowResult.md) | One result per row, in request order. |  [optional] |
|**stale** | **Integer** | Rows skipped because the value is not the one expected. |  [optional] |
|**total** | **Integer** | Rows checked. |  [optional] |
|**unchanged** | **Integer** | Rows whose value is already the new one. |  [optional] |
|**updated** | **Integer** | Rows written, after an apply. |  [optional] |



