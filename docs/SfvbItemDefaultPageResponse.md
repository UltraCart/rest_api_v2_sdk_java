

# SfvbItemDefaultPageResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alreadyDefault** | **Integer** | Rows whose page is already the default. |  [optional] |
|**dryRun** | **Boolean** | True when nothing was saved. |  [optional] |
|**failed** | **Integer** | Rows whose change didn&#39;t save (apply). |  [optional] |
|**itemCount** | **Integer** | Distinct items in the request. |  [optional] |
|**ready** | **Integer** | Rows that would change (dry run). |  [optional] |
|**refused** | **Integer** | Rows refused - not found, not assigned, hidden, another storefront or invalid. |  [optional] |
|**rows** | [**List&lt;SfvbItemDefaultPageResult&gt;**](SfvbItemDefaultPageResult.md) | Every row, in request order. |  [optional] |
|**rowsSha256** | **String** | Hash of the ready rows.  Request item.default_page with exactly those rows, then apply them with this. |  [optional] |
|**stale** | **Integer** | Rows that changed since they were read. |  [optional] |
|**updated** | **Integer** | Rows changed (apply). |  [optional] |



