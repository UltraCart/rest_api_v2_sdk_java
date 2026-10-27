

# SfvbFlow


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowMultipleConcurrentEnrollments** | **Boolean** | True when a customer may be in this flow more than once at a time. |  [optional] |
|**communicationSequenceUuid** | **String** | The communication sequence the steps belong to. |  [optional] |
|**createdDts** | **String** | When the flow was created (ISO 8601, UTC). |  [optional] |
|**deleted** | **Boolean** | True when the flow was deleted. |  [optional] |
|**emails** | [**List&lt;SfvbCommsEmail&gt;**](SfvbCommsEmail.md) | Its emails, in step order. |  [optional] |
|**endOnceCustomerPurchases** | **Boolean** | True when a customer leaves the flow once they buy from one of its emails. |  [optional] |
|**endOnceCustomerPurchasesAnywhere** | **Boolean** | True when a customer leaves the flow once they buy from any source. |  [optional] |
|**flowUuid** | **String** | The flow uuid. |  [optional] |
|**hashSha256** | **String** | Send this as If-Match when changing, archiving or turning the flow on or off. |  [optional] |
|**live** | **Boolean** | True when the emails and postcards reach customers now, so a change to one shows at once.  False only in a status that sends nothing. |  [optional] |
|**name** | **String** | The flow name. |  [optional] |
|**notes** | **List&lt;String&gt;** | What a write did beyond the fields it was asked to change, such as putting emails back to needing review or setting a scheduled campaign back to draft.  Only on a write. |  [optional] |
|**postcards** | [**List&lt;SfvbCommsPostcard&gt;**](SfvbCommsPostcard.md) | Its postcards, in step order. |  [optional] |
|**reentryDelayDays** | **Integer** | Days before a customer may enter again, with after_days. |  [optional] |
|**reentryPolicy** | **String** | Whether a customer may enter again, anytime, after_days or never. |  [optional] |
|**sendingDomainUuid** | **String** | The sending domain uuid.  Defaults to the storefront&#39;s marketing sending domain. |  [optional] |
|**sendingName** | **String** | The from name.  Defaults to the storefront&#39;s marketing setting. |  [optional] |
|**sendingUser** | **String** | The part of the from address before the at sign.  Defaults to the storefront&#39;s marketing setting. |  [optional] |
|**status** | **String** | The status, such as draft, active, paused, draining or inactive. |  [optional] |
|**statusDts** | **String** | When the status last changed (ISO 8601, UTC). |  [optional] |
|**triggerParameter** | **String** | The list or segment uuid, or other value, the trigger is limited to. |  [optional] |
|**triggerParameterName** | **String** | The name of the trigger parameter, when the trigger takes one. |  [optional] |
|**triggerType** | **String** | What starts the flow, such as cart abandon or an order. |  [optional] |



