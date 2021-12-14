
# AccountsReceivableRetryConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | True if the retry should run daily.  False puts the retry service into an inactive state for this merchant. |  [optional]
**allowProcessLinkedAccounts** | **Boolean** | True if this account has linked accounts that it can process. |  [optional]
**cancelAutoOrder** | **Boolean** | If true also cancel the auto order if the order is rejected at the end |  [optional]
**currentServicePlan** | **String** | The current service plan that the account is on. |  [optional]
**dailyActivityList** | [**List&lt;AccountsReceivableRetryDayActivity&gt;**](AccountsReceivableRetryDayActivity.md) | A list of days and what actions should take place on those days after an order reaches accounts receivable |  [optional]
**managedByLinkedAccountMerchantId** | **Boolean** | If not null, this account is managed by the specified parent merchant id. |  [optional]
**merchantId** | **String** | UltraCart merchant ID |  [optional]
**notifyEmails** | **List&lt;String&gt;** | A list of email addresses to receive summary notifications from the retry service. |  [optional]
**notifyRejections** | **Boolean** | If true, email addresses are notified of rejections. |  [optional]
**notifySuccesses** | **Boolean** | If true, email addresses are notified of successful charges. |  [optional]
**processLinkedAccounts** | **Boolean** | If true, all linked accounts are also processed using the same rules. |  [optional]
**processingPercentage** | **String** | The percentage rate charged for the service. |  [optional]
**rejectAtEnd** | **Boolean** | If true, the order is rejected the day after the last configured activity day |  [optional]
**trialMode** | **Boolean** | True if the account is currently in trial mode.  Set to false to exit trial mode. |  [optional]
**trialModeExpirationDts** | **String** | The date when trial mode expires.  If this date is reached without exiting trial mode, the service will de-activate. |  [optional]



