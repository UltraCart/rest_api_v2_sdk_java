

# EmailPerformance


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeCustomers** | **Integer** | Active customers.  The value will be -1 if calculation is pending. |  [optional] |
|**actualCustomers** | **Integer** | Actual customers that they have regardless of active state.  The value will be -1 if calculation is pending. |  [optional] |
|**bounceCount** | **Integer** | Bounce count |  [optional] |
|**bouncePercentage** | **BigDecimal** | bounce percentage rate based upon our look back window.  This should be under five percent or the account will be paused for sending. |  [optional] |
|**bouncePercentageFormatted** | **String** | bounce percentage rate (formatted) based upon our look back window.  This should be under five percent or the account will be paused for sending. |  [optional] |
|**customerHistogram** | [**EmailPerformanceCustomerHistogram**](EmailPerformanceCustomerHistogram.md) |  |  [optional] |
|**dailyStats** | [**List&lt;EmailPerformanceDaily&gt;**](EmailPerformanceDaily.md) | Daily statistics used for charting |  [optional] |
|**deliveredCount** | **Integer** | Delivered count |  [optional] |
|**loyaltyProgramType** | [**LoyaltyProgramTypeEnum**](#LoyaltyProgramTypeEnum) | Loyalty Program Type |  [optional] |
|**maxActiveCustomers** | **Integer** | Maximum active customers allowed under their billing plan |  [optional] |
|**maxEmailsPerDay** | **Integer** | Max emails per day |  [optional] |
|**maxEmailsPerHour** | **Integer** | Max emails per hour |  [optional] |
|**maxEmailsPerMonth** | **Integer** | Max emails per month |  [optional] |
|**pausedForSpam** | **Boolean** | True if campaign/flow emails are paused due to spam complaints. |  [optional] |
|**revenue** | **BigDecimal** | Revenue |  [optional] |
|**sentEmailsPerDay** | **Integer** | Sent emails last 24 hours |  [optional] |
|**sentEmailsPerHour** | **Integer** | Sent emails last hour |  [optional] |
|**sentEmailsPerMonth** | **Integer** | Sent emails last 31 days |  [optional] |
|**sequenceSendCount** | **Integer** | Total sequence (campaign/flow) emails sent |  [optional] |
|**spamCount** | **Integer** | Spam complaints |  [optional] |
|**spamPercentage** | **BigDecimal** | Spam percentage rate based upon our look back window.  This should be under one half a percent or the account will be paused for sending. |  [optional] |
|**spamPercentageFormatted** | **String** | Spam percentage rate (formatted) based upon our look back window.  This should be under one half a percent or the account will be paused for sending. |  [optional] |
|**transactionalSendCount** | **Integer** | Total transactions emails sent |  [optional] |



## Enum: LoyaltyProgramTypeEnum

| Name | Value |
|---- | -----|
| DISABLED | &quot;disabled&quot; |
| POINTS | &quot;points&quot; |
| CASHBACK | &quot;cashback&quot; |



