

# SfvbFlow


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**communicationSequenceUuid** | **String** | The communication sequence the steps belong to. |  [optional] |
|**createdDts** | **String** | When the flow was created (ISO 8601, UTC). |  [optional] |
|**deleted** | **Boolean** | True when the flow was deleted. |  [optional] |
|**emails** | [**List&lt;SfvbCommsEmail&gt;**](SfvbCommsEmail.md) | Its emails, in step order. |  [optional] |
|**flowUuid** | **String** | The flow uuid. |  [optional] |
|**live** | **Boolean** | True when the emails and postcards reach customers now, so a change to one shows at once.  False only in a status that sends nothing. |  [optional] |
|**name** | **String** | The flow name. |  [optional] |
|**postcards** | [**List&lt;SfvbCommsPostcard&gt;**](SfvbCommsPostcard.md) | Its postcards, in step order. |  [optional] |
|**status** | **String** | The status, such as draft, active, paused, draining or inactive. |  [optional] |
|**statusDts** | **String** | When the status last changed (ISO 8601, UTC). |  [optional] |
|**triggerParameterName** | **String** | The name of the trigger parameter, when the trigger takes one. |  [optional] |
|**triggerType** | **String** | What starts the flow, such as cart abandon or an order. |  [optional] |



