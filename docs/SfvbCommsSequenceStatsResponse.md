

# SfvbCommsSequenceStatsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**communicationSequenceUuid** | **String** | The sequence. |  [optional] |
|**days** | **Integer** | The window, in days, for the step counts. |  [optional] |
|**notes** | **List&lt;String&gt;** | What the windows are and what a missing count means. |  [optional] |
|**overall** | [**SfvbCommsStat**](SfvbCommsStat.md) |  |  [optional] |
|**steps** | [**List&lt;SfvbCommsStepStat&gt;**](SfvbCommsStepStat.md) | Each email, SMS, postcard and branch step, in the stored order. |  [optional] |



