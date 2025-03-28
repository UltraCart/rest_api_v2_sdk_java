

# EmailCampaign


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clickRateFormatted** | **String** | Click rate of emails |  [optional] |
|**createdDts** | **String** | Created date |  [optional] |
|**deleted** | **Boolean** | True if this campaign was deleted |  [optional] |
|**emailCampaignUuid** | **String** | Email campaign UUID |  [optional] |
|**emailCommunicationSequenceUuid** | **String** | Email communication sequence UUID |  [optional] |
|**endOnceCustomerPurchases** | **Boolean** | True if the customer should end the flow once they purchase from this campaign |  [optional] |
|**endOnceCustomerPurchasesAnywhere** | **Boolean** | True if the customer should end the flow once they purchase from anywhere |  [optional] |
|**espCampaignFolderUuid** | **String** | Campaign folder UUID.  Null for uncategorized |  [optional] |
|**espDomainUser** | **String** | User of the sending address |  [optional] |
|**espDomainUuid** | **String** | UUID of the sending domain |  [optional] |
|**espFriendlyName** | **String** | Friendly name of the sending email |  [optional] |
|**libraryItemOid** | **Integer** | If this item was ever added to the Code Library, this is the oid for that library item, or 0 if never added before.  This value is used to determine if a library item should be inserted or updated. |  [optional] |
|**memberships** | [**List&lt;EmailListSegmentMembership&gt;**](EmailListSegmentMembership.md) | List and segment memberships |  [optional] |
|**merchantId** | **String** | Merchant ID |  [optional] |
|**name** | **String** | Name of email campaign |  [optional] |
|**openRateFormatted** | **String** | Open rate of emails |  [optional] |
|**preventSendingDueToSpam** | **Boolean** | True if this campaign is prevented from sending at this time due to spam complaints. |  [optional] |
|**revenueFormatted** | **String** | Revenue associated with campaign |  [optional] |
|**revenuePerCustomerFormatted** | **String** | Revenue per customer associated with campaign |  [optional] |
|**scheduledDts** | **String** | Scheduled date |  [optional] |
|**screenshotLargeFullUrl** | **String** | URL to a large full length screenshot |  [optional] |
|**smsEspTwilioUuid** | **String** | Twilio Account UUID.  Null for none |  [optional] |
|**smsPhoneNumber** | **String** | Twilio SMS Phone Number.  Null for none |  [optional] |
|**status** | **String** | Status of the campaign of draft, archived, and sent |  [optional] |
|**statusDts** | **String** | Timestamp when the last status change happened |  [optional] |
|**storefrontOid** | **Integer** | Storefront oid |  [optional] |



