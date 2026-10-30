

# SfvbCommsSegmentDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdDts** | **String** | When it was created (ISO 8601, UTC). |  [optional] |
|**filterProfileEquationJson** | **String** | The rule, as JSON text in the admin editor&#39;s shape.  Every entry in groups must hold, and inside a group one function is enough. |  [optional] |
|**folderUuid** | **String** | The list and segment folder it is filed in, or absent. |  [optional] |
|**hashSha256** | **String** | Send as If-Match on an update.  Covers the name, the rule and the folder. |  [optional] |
|**memberCount** | **Integer** | How many customers it held at its last rebuild.  Out of date while rebuild_required is true. |  [optional] |
|**name** | **String** | The segment name. |  [optional] |
|**rebuildNightly** | **Boolean** | True when the rule has a date range, so the segment is also rebuilt every night. |  [optional] |
|**rebuildPercentage** | **BigDecimal** | How far the current rebuild has got, when one is running. |  [optional] |
|**rebuildRequired** | **Boolean** | True when the rule changed and the segment has not finished rebuilding. |  [optional] |
|**segmentUuid** | **String** | The segment uuid. |  [optional] |
|**usedBy** | [**List&lt;SfvbCommsSegmentUsedBy&gt;**](SfvbCommsSegmentUsedBy.md) | The campaigns that send to it and the flows it starts. |  [optional] |



