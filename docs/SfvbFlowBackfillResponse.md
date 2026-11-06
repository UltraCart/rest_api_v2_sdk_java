

# SfvbFlowBackfillResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**capped** | **Boolean** | True when the plan&#39;s customer limit stopped the count. |  [optional] |
|**customers** | **Integer** | How many different customers those are. |  [optional] |
|**dryRun** | **Boolean** | True when nothing was enrolled. |  [optional] |
|**enrollments** | **Integer** | How many enrollments the backfill makes (a purchased product trigger makes one per item). |  [optional] |
|**flowUuid** | **String** | The flow. |  [optional] |
|**notes** | **List&lt;String&gt;** | What happens next, in sentences. |  [optional] |
|**orderDaysOld** | **Integer** | The days of orders, for an order trigger. |  [optional] |
|**relativeToEvent** | **Boolean** | Whether the first wait is shortened by each order&#39;s age. |  [optional] |
|**segmentRebuildRequired** | **Boolean** | True when the segment needs a rebuild, so the count is from its last one. |  [optional] |
|**started** | **Boolean** | True when the backfill started in the background.  The signed-in user is emailed when it ends. |  [optional] |
|**triggerType** | **String** | The flow&#39;s trigger. |  [optional] |



