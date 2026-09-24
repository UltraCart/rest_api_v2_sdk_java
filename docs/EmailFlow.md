

# EmailFlow


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowMultipleConcurrentEnrollments** | **Boolean** | True if a customer may be enrolled in this flow multiple times |  [optional] |
|**backPopulating** | **Boolean** | True if the flow is currently performing a back population. |  [optional] |
|**clickRateFormatted** | **String** | Click rate of emails, formatted |  [optional] |
|**createdDts** | **String** | Created date |  [optional] |
|**deleted** | **Boolean** | True if this campaign was deleted |  [optional] |
|**emailCommunicationSequenceUuid** | **String** | Email communication sequence UUID |  [optional] |
|**emailFlowUuid** | **String** | Email flow UUID |  [optional] |
|**endOnceCustomerPurchases** | **Boolean** | True if the customer should end the flow once they purchase from an email on this flow |  [optional] |
|**endOnceCustomerPurchasesAnywhere** | **Boolean** | True if the customer should end the flow once they purchase from any source |  [optional] |
|**enrolledCustomers** | **Integer** | Number of enrolled customers. |  [optional] |
|**espDomainUser** | **String** | Username of sending email |  [optional] |
|**espDomainUuid** | **String** | UUID of sending domain |  [optional] |
|**espFlowFolderUuid** | **String** | Flow folder UUID.  Null for uncategorized |  [optional] |
|**espFriendlyName** | **String** | Friendly name of the sending email |  [optional] |
|**filterProfileEquationJson** | **String** | File profile equation json |  [optional] |
|**libraryItemOid** | **Integer** | If this item was ever added to the Code Library, this is the oid for that library item, or 0 if never added before.  This value is used to determine if a library item should be inserted or updated. |  [optional] |
|**maximumEnrolled** | **Boolean** | The number of maximum customers for the plan are currently enrolled in this flow. |  [optional] |
|**merchantId** | **String** | Merchant ID |  [optional] |
|**name** | **String** | Name of email flow |  [optional] |
|**openRateFormatted** | **String** | Open rate of emails, formatted |  [optional] |
|**reentryDelayDays** | **Integer** | Number of days after the last enrollment before a customer may enter this flow again.  Only used when reentry_policy is after_days.  Maximum 1095. |  [optional] |
|**reentryPolicy** | [**ReentryPolicyEnum**](#ReentryPolicyEnum) | Whether a customer may enter this flow again after a previous enrollment.  anytime (default), after_days (see reentry_delay_days), or never.  Enrollment history is kept for 3 years, so never means not within 3 years of the last enrollment. |  [optional] |
|**revenueFormatted** | **String** | Revenue, formatted |  [optional] |
|**revenuePerCustomerFormatted** | **String** | Revenue per customer, formatted |  [optional] |
|**screenshotLargeFullUrl** | **String** | URL to a large full length screenshot |  [optional] |
|**smsEspTwilioUuid** | **String** | Twilio Account UUID.  Null for none |  [optional] |
|**smsPhoneNumber** | **String** | Twilio SMS Phone Number.  Null for none |  [optional] |
|**status** | **String** | Status of the campaign of draft, archived, active, and inactive |  [optional] |
|**statusDts** | **String** | Timestamp when the last status change happened |  [optional] |
|**storefrontOid** | **Integer** | Storefront oid |  [optional] |
|**triggerParameter** | **String** | Trigger parameter |  [optional] |
|**triggerParameterName** | **String** | Trigger parameter name |  [optional] |
|**triggerType** | **String** | Trigger type |  [optional] |



## Enum: ReentryPolicyEnum

| Name | Value |
|---- | -----|
| ANYTIME | &quot;anytime&quot; |
| AFTER_DAYS | &quot;after_days&quot; |
| NEVER | &quot;never&quot; |



