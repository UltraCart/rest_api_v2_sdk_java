

# SfvbStepDispatchLogsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**counts** | [**SfvbStepCounts**](SfvbStepCounts.md) |  |  [optional] |
|**entries** | [**List&lt;SfvbStepDispatchLog&gt;**](SfvbStepDispatchLog.md) | The entries in the window, newest first. |  [optional] |
|**nextOffset** | **Integer** | Send this as offset for the next page.  Absent on the last page. |  [optional] |
|**notes** | **List&lt;String&gt;** | What a person should know about reading these entries. |  [optional] |
|**sequenceUuid** | **String** | The communication sequence the step is in. |  [optional] |
|**since** | **String** | The start of the window read, as ISO 8601. |  [optional] |
|**stepType** | **String** | The step&#39;s type, such as email, sms or wait. |  [optional] |
|**stepUuid** | **String** | The step. |  [optional] |



