

# Affiliate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptedDownlineRecruitingTerms** | **Boolean** | True if affiliate has agreed to the terms associated with recruiting downline affiliates |  [optional] |
|**address1** | **String** | Address 1 |  [optional] |
|**address2** | **String** | Address 2 |  [optional] |
|**affiliateCommissionGroupOid** | **Integer** | Commission group that this affiliate is assigned to |  [optional] |
|**affiliateOid** | **Integer** | Unique object identifier for this Affiliate |  [optional] |
|**allowDownlineRecruiting** | **Boolean** | True if affiliate is allowed to recruit downline affiliates |  [optional] |
|**allowGoogleAdwordsTracking** | **Boolean** | True if the affiliate is allowed to have their Google Adwords tracking pixel on the receipt |  [optional] |
|**allowYahooSearchMarketingTracking** | **Boolean** | True if the affiliate is allowed to have their Yahoo Search Marketing tracking pixel on the receipt |  [optional] |
|**analyticsInternalTracking** | **Boolean** | True if this is used for internal tracking and should not influence UltraCart Analytics |  [optional] |
|**attributes** | [**List&lt;AffiliateAttribute&gt;**](AffiliateAttribute.md) | Custom attributes about the affiliate that can be used in the catalog/StoreFront |  [optional] |
|**autoApplyCouponCode** | **String** | Coupon code to automatically apply when this affiliate sends traffic |  [optional] |
|**autoApplyCouponOid** | **Integer** | Coupon object id to automatically apply when this affiliate sends traffic |  [optional] |
|**autoApproveCommissions** | **Boolean** | True if this affiliates commissions are automatically approved |  [optional] |
|**checkPayableTo** | **String** | If the affiliate wants to be paid by check instead of PayPal, then this is the name to make the check out to |  [optional] |
|**city** | **String** | City |  [optional] |
|**companyName** | **String** | Company Name |  [optional] |
|**cookieTtl** | **Integer** | Number of days the affiliate tracking cookie lasts before expiring |  [optional] |
|**countryCode** | **String** | ISO-3166 two letter country code |  [optional] |
|**dob** | **String** | Date of birth |  [optional] |
|**email** | **String** | Email |  [optional] |
|**emailNotificationSchedule** | [**EmailNotificationScheduleEnum**](#EmailNotificationScheduleEnum) | Email notification of transactions |  [optional] |
|**fax** | **String** | Fax |  [optional] |
|**firstName** | **String** | First Name |  [optional] |
|**googleConversionId** | **String** | Google Adwords conversion id to use for the tracking pixel |  [optional] |
|**htmlPermitted** | **Boolean** | True if the affiliate is allowed to specify custom HTML to render on the receipt |  [optional] |
|**lastName** | **String** | Last Name |  [optional] |
|**lastTermsAcceptance** | **String** | Last date/time the affiliate program terms were agreed to |  [optional] |
|**marketingStrategy** | [**AffiliateMarketingStrategy**](AffiliateMarketingStrategy.md) |  |  [optional] |
|**memberType** | **Integer** | Member type object identifier the affiliate is assigned to within the program |  [optional] |
|**merchantId** | **String** | Merchant ID |  [optional] |
|**minimumPayout** | **BigDecimal** | Minimum balance that must accrue before the affiliate is paid |  [optional] |
|**password** | **String** | Password (can only be used to update) |  [optional] |
|**payCommissionsOnAutoOrders** | **Boolean** | True if commissions are paid on auto order (rebill) transactions |  [optional] |
|**payCommissionsOnRepeatOrdersByEmail** | **Boolean** | True if commissions are paid on repeat orders matched by customer email |  [optional] |
|**payViaPaypal** | **Boolean** | True if the affiliate is paid via PayPal |  [optional] |
|**paymentAdjustment** | **BigDecimal** | Fixed adjustment applied to the affiliate&#39;s commission payments |  [optional] |
|**paypalEmail** | **String** | Alternate email address to use for their PayPal payment if different than their primary email |  [optional] |
|**phone** | **String** | Phone |  [optional] |
|**postalCode** | **String** | Postal Code |  [optional] |
|**preventCookieStomping** | **Boolean** | True if cookie stomping of this affiliate is prevented |  [optional] |
|**preventSendingAllEmails** | **Boolean** | If true, affiliate will not receive any email notifications. |  [optional] |
|**refundServerToServerPostbackUrl** | **String** | Server to server postback URL notified of affiliate refunds |  [optional] |
|**removeCookieAfterPurchase** | **Boolean** | If true, affiliate cookies are removed after a purchase. |  [optional] |
|**salesforceAccountId** | **String** | Salesforce.com account id |  [optional] |
|**salesforceContactId** | **String** | Salesforce.com contact id |  [optional] |
|**serverToServerPostbackUrl** | **String** | Server to server postback URL notified of affiliate transactions |  [optional] |
|**shortCode** | **String** | Short code that can be used in place of the affiliate id within tracking links |  [optional] |
|**state** | **String** | State |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status |  [optional] |
|**taxId** | **String** | Tax ID (can only be used to update) |  [optional] |
|**terminatedForSpam** | **Boolean** | True if the affiliate has been terminated for spamming |  [optional] |
|**tierRelationships** | [**List&lt;AffiliateTierRelationship&gt;**](AffiliateTierRelationship.md) | Relationship with other affiliates that recruted this affiliate |  [optional] |
|**ysmAccountId** | **String** | Yahoo Search Marketing account id to use for the tracking pixel |  [optional] |



## Enum: EmailNotificationScheduleEnum

| Name | Value |
|---- | -----|
| NONE | &quot;None&quot; |
| EACH | &quot;Each&quot; |
| DAILY | &quot;Daily&quot; |
| WEEKLY | &quot;Weekly&quot; |
| MONTHLY | &quot;Monthly&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |



