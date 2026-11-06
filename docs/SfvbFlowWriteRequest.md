

# SfvbFlowWriteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowMultipleConcurrentEnrollments** | **Boolean** | True when a customer may be in this flow more than once at a time. |  [optional] |
|**endOnceCustomerPurchases** | **Boolean** | True to end the flow for a customer once they buy from one of its emails. |  [optional] |
|**endOnceCustomerPurchasesAnywhere** | **Boolean** | True to end the flow for a customer once they buy from any source. |  [optional] |
|**folderUuid** | **String** | File it in this flow folder.  An empty value takes it out of its folder. |  [optional] |
|**name** | **String** | The flow name, 1 to 250 characters.  Required to create. |  [optional] |
|**reentryDelayDays** | **Integer** | Days before a customer may enter again, 1 to 1095.  Only with after_days. |  [optional] |
|**reentryPolicy** | [**ReentryPolicyEnum**](#ReentryPolicyEnum) | Whether a customer may enter again, anytime, after_days or never. |  [optional] |
|**sendingDomainUuid** | **String** | The sending domain uuid.  Defaults to the storefront&#39;s marketing sending domain. |  [optional] |
|**sendingName** | **String** | The from name.  Defaults to the storefront&#39;s marketing setting. |  [optional] |
|**sendingUser** | **String** | The part of the from address before the at sign.  Defaults to the storefront&#39;s marketing setting. |  [optional] |
|**triggerParameter** | **String** | The list or segment uuid for a list or segment trigger.  Cleared when the trigger changes to one that takes none. |  [optional] |
|**triggerType** | **String** | What enrolls a customer, such as cart abandoned.  Required to create.  On a change, only while the flow is off. |  [optional] |



## Enum: ReentryPolicyEnum

| Name | Value |
|---- | -----|
| ANYTIME | &quot;anytime&quot; |
| AFTER_DAYS | &quot;after_days&quot; |
| NEVER | &quot;never&quot; |



