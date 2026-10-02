

# SfvbRecordingSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**costPerThousand** | **BigDecimal** | What 1,000 recorded sessions cost after the trial, in US dollars. |  [optional] |
|**enabled** | **Boolean** | True when real shoppers&#39; sessions on this storefront are being recorded. |  [optional] |
|**retentionInterval** | **String** | How long recordings are kept, such as 1 year. |  [optional] |
|**sessionsCurrentBillingPeriod** | **Integer** | Sessions recorded so far in the current billing period. |  [optional] |
|**sessionsLastBillingPeriod** | **Integer** | Sessions recorded in the previous billing period. |  [optional] |
|**sessionsTrialBillingPeriod** | **Integer** | Sessions recorded during the free trial. |  [optional] |
|**trialExpiration** | **String** | When the free trial ends, as an ISO-8601 time.  Absent until the trial has started. |  [optional] |
|**trialExpired** | **Boolean** | True when the free trial is over and recorded sessions are billed. |  [optional] |
|**trialStarted** | **Boolean** | True once recording has been turned on at least once, which starts a 14 day free trial. |  [optional] |



