

# SfvbItemContainersResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemContainers** | [**List&lt;SfvbItemContainer&gt;**](SfvbItemContainer.md) | The containers on this page, ordered by merchant item id then container name. |  [optional] |
|**maxResults** | **Integer** | The cap that was applied. |  [optional] |
|**nextOffset** | **Integer** | Offset to send for the next page.  Zero when truncated is false.  Never truncates without giving a way to continue. |  [optional] |
|**offset** | **Integer** | Containers skipped to produce this page. |  [optional] |
|**resultCount** | **Integer** | Number of containers returned on this page. |  [optional] |
|**totalCount** | **Integer** | Total containers matching the filter.  With container_name supplied this is the answer to how many items carry that slot. |  [optional] |
|**truncated** | **Boolean** | True when containers exist beyond this page.  next_offset is populated when it is. |  [optional] |
|**truncationAdvice** | **String** | Advice for the caller when truncated is true. |  [optional] |



