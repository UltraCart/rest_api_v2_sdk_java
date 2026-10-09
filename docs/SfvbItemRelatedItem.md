

# SfvbItemRelatedItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantItemId** | **String** | The related item.  On a write, send this or merchant_item_oid. |  [optional] |
|**merchantItemOid** | **Integer** | The related item&#39;s oid. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | user (the default on a write), addon or complementary.  system marks one UltraCart calculated and other a kind this API does not change.  Both are read only and kept by a write. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| ADDON | &quot;addon&quot; |
| COMPLEMENTARY | &quot;complementary&quot; |
| SYSTEM | &quot;system&quot; |
| OTHER | &quot;other&quot; |



