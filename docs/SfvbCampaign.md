

# SfvbCampaign


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignUuid** | **String** | The campaign uuid. |  [optional] |
|**communicationSequenceUuid** | **String** | The communication sequence the steps belong to. |  [optional] |
|**createdDts** | **String** | When the campaign was created (ISO 8601, UTC). |  [optional] |
|**deleted** | **Boolean** | True when the campaign was deleted. |  [optional] |
|**emails** | [**List&lt;SfvbCommsEmail&gt;**](SfvbCommsEmail.md) | Its emails, in step order. |  [optional] |
|**endOnceCustomerPurchases** | **Boolean** | True when a customer leaves the campaign once they buy from one of its emails. |  [optional] |
|**endOnceCustomerPurchasesAnywhere** | **Boolean** | True when a customer leaves the campaign once they buy from any source. |  [optional] |
|**hashSha256** | **String** | Send this as If-Match when changing or archiving the campaign. |  [optional] |
|**live** | **Boolean** | True when the emails and postcards reach customers now, so a change to one shows at once.  False only in a status that sends nothing. |  [optional] |
|**memberships** | [**List&lt;SfvbCampaignMembership&gt;**](SfvbCampaignMembership.md) | The lists and segments it sends to or leaves out. |  [optional] |
|**name** | **String** | The campaign name. |  [optional] |
|**notes** | **List&lt;String&gt;** | What a write did beyond the fields it was asked to change, such as putting emails back to needing review or setting a scheduled campaign back to draft.  Only on a write. |  [optional] |
|**postcards** | [**List&lt;SfvbCommsPostcard&gt;**](SfvbCommsPostcard.md) | Its postcards, in step order. |  [optional] |
|**scheduledDts** | **String** | When the campaign is scheduled to send (ISO 8601, UTC), when it is. |  [optional] |
|**sendingDomainUuid** | **String** | The sending domain uuid.  Defaults to the storefront&#39;s marketing sending domain. |  [optional] |
|**sendingName** | **String** | The from name.  Defaults to the storefront&#39;s marketing setting. |  [optional] |
|**sendingUser** | **String** | The part of the from address before the at sign.  Defaults to the storefront&#39;s marketing setting. |  [optional] |
|**status** | **String** | The status, such as draft, scheduled, sending, sent or archived. |  [optional] |
|**statusDts** | **String** | When the status last changed (ISO 8601, UTC). |  [optional] |



