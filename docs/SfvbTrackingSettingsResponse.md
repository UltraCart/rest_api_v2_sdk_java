

# SfvbTrackingSettingsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**advanced** | [**SfvbTrackingAdvanced**](SfvbTrackingAdvanced.md) |  |  [optional] |
|**changes** | [**List&lt;SfvbTrackingChange&gt;**](SfvbTrackingChange.md) | On a write, each setting it changed, or would change on a dry run.  Empty when nothing changed.  Absent on a read. |  [optional] |
|**currencies** | **List&lt;String&gt;** | The currency codes default_currency accepts. |  [optional] |
|**dryRun** | **Boolean** | On a write, true when nothing was saved.  Absent on a read. |  [optional] |
|**privacy** | [**SfvbTrackingPrivacy**](SfvbTrackingPrivacy.md) |  |  [optional] |
|**storefrontOid** | **Integer** | The storefront these settings belong to. |  [optional] |



