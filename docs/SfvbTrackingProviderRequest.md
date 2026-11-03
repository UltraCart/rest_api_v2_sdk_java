

# SfvbTrackingProviderRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acceptCost** | **Boolean** | True to accept the cost of turning on Google Tag Gateway.  Required to turn it on. |  [optional] |
|**consent** | [**SfvbTrackingProviderConsent**](SfvbTrackingProviderConsent.md) |  |  [optional] |
|**dryRun** | **Boolean** | True to check the change and report it without saving. |  [optional] |
|**events** | **Object** | Standard events by name, true to send. |  [optional] |
|**fields** | **Object** | Plain field values by key.  An empty string clears one.  Booleans are true or false.  Secrets go in secrets instead. |  [optional] |
|**secrets** | [**SfvbTrackingProviderSecrets**](SfvbTrackingProviderSecrets.md) |  |  [optional] |
|**unset** | **List&lt;String&gt;** | Plain field keys to clear. |  [optional] |
|**wholesaleTiers** | [**List&lt;SfvbTrackingWholesaleTier&gt;**](SfvbTrackingWholesaleTier.md) | For google_analytics, account numbers by pricing_tier_oid. |  [optional] |



