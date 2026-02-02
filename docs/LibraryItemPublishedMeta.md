

# LibraryItemPublishedMeta


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**countOfVersions** | **Integer** | The number of published versions a source item has, or zero if this item is not a source or is private |  [optional] |
|**libraryItemPublishedOid** | **Integer** | The oid pointing to the most recent published version, or zero if this is not a published source item. |  [optional] |
|**libraryItemReviewOid** | **Integer** | The oid pointing to the review data if this is a source library item and currently under review |  [optional] |
|**rejected** | **Boolean** | True if this is a source item and is under review and was rejected. |  [optional] |
|**rejectedReason** | **String** | The reason for rejection if this item is a source item, is under review, and was rejected.  For all other cases, this value will be null or missing. |  [optional] |
|**releaseVersion** | **Integer** | If this library item is a source item and it is published, this is the most recent release version number |  [optional] |
|**reviewVersion** | **Integer** | If this library item is a source item and has a published item currently under review, this is that version number |  [optional] |
|**underReview** | **Boolean** | True if this library item is a source item and is currently under review |  [optional] |



