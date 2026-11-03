

# SfvbTrackingProvider


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adminPath** | **String** | Where the provider is in the admin. |  [optional] |
|**changes** | [**List&lt;SfvbTrackingChange&gt;**](SfvbTrackingChange.md) | On a write, each setting it changed, or would change on a dry run.  Secrets read only set or cleared. |  [optional] |
|**configured** | **Boolean** | True when the provider is on, which means one of its identifying fields is set. |  [optional] |
|**consent** | [**SfvbTrackingProviderConsent**](SfvbTrackingProviderConsent.md) |  |  [optional] |
|**consentSupported** | **Boolean** | True when the provider can be held back until the shopper consents. |  [optional] |
|**cost** | **String** | For google_tag_manager, what turning on Google Tag Gateway costs. |  [optional] |
|**dryRun** | **Boolean** | On a write, true when nothing was saved. |  [optional] |
|**events** | [**List&lt;SfvbTrackingProviderEvent&gt;**](SfvbTrackingProviderEvent.md) | For a provider with standard events, each one and whether it is sent. |  [optional] |
|**fields** | [**List&lt;SfvbTrackingProviderField&gt;**](SfvbTrackingProviderField.md) | Every field, in the order the admin shows them. |  [optional] |
|**group** | **String** | google or other, the admin tab it is on. |  [optional] |
|**hashSha256** | **String** | The hash of the stored settings.  A secret counts by its mask and length only.  Send it as If-Match when changing or clearing the provider. |  [optional] |
|**key** | **String** | The provider key, such as facebook or google_analytics. |  [optional] |
|**name** | **String** | The name the admin shows. |  [optional] |
|**notes** | **List&lt;String&gt;** | Anything the write left for a person to do, such as disconnecting an OAuth connection in the admin. |  [optional] |
|**oauth** | [**SfvbTrackingProviderOauth**](SfvbTrackingProviderOauth.md) |  |  [optional] |
|**wholesaleTiers** | [**List&lt;SfvbTrackingWholesaleTier&gt;**](SfvbTrackingWholesaleTier.md) | For google_analytics, the account number per wholesale pricing tier. |  [optional] |



