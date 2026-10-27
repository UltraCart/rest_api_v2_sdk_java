

# SfvbCampaignWriteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endOnceCustomerPurchases** | **Boolean** | True to end the campaign for a customer once they buy from one of its emails. |  [optional] |
|**endOnceCustomerPurchasesAnywhere** | **Boolean** | True to end the campaign for a customer once they buy from any source. |  [optional] |
|**memberships** | [**List&lt;SfvbCampaignMembership&gt;**](SfvbCampaignMembership.md) | The lists and segments it sends to or leaves out.  Replaces the whole set.  An empty array clears it. |  [optional] |
|**name** | **String** | The campaign name, 1 to 250 characters.  Required to create. |  [optional] |
|**scheduledDts** | **String** | When to send once started (ISO 8601).  An empty string clears the schedule. |  [optional] |
|**sendingDomainUuid** | **String** | The sending domain uuid.  Defaults to the storefront&#39;s marketing sending domain. |  [optional] |
|**sendingName** | **String** | The from name.  Defaults to the storefront&#39;s marketing setting. |  [optional] |
|**sendingUser** | **String** | The part of the from address before the at sign.  Defaults to the storefront&#39;s marketing setting. |  [optional] |



