

# SfvbItemPreorder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changed** | [**SfvbItemPreorderChange**](SfvbItemPreorderChange.md) |  |  [optional] |
|**eta** | **String** | The expected date, YYYY-MM-DD, or null when none is set. |  [optional] |
|**hashSha256** | **String** | The hash of preorder and eta.  Send it as If-Match, or as the row&#39;s hash_sha256, to change them. |  [optional] |
|**merchantItemId** | **String** | The item&#39;s merchant item id. |  [optional] |
|**merchantItemOid** | **Integer** | The item. |  [optional] |
|**preorder** | **Boolean** | True when the item is on pre-order.  Shoppers can order it while out of stock, and its orders go to the Pre-ordered stage. |  [optional] |
|**shoppersSee** | [**ShoppersSeeEnum**](#ShoppersSeeEnum) | What itempreorder shows.  preorder_with_eta when on pre-order with an ETA of today or later, preorder_no_eta when on pre-order with no ETA or a past one, nothing when not on pre-order. |  [optional] |
|**shoppersSeeText** | **String** | shoppers_see in words, such as on pre-order, ETA 2026-11-20. |  [optional] |
|**variationValues** | [**List&lt;SfvbItemPreorderOption&gt;**](SfvbItemPreorderOption.md) | For a variation listed under its parent, the option values that pick it, such as Size 2T. |  [optional] |
|**warnings** | **List&lt;String&gt;** | After a change, things worth knowing about the new values, such as an ETA in the past.  Never a refusal. |  [optional] |



## Enum: ShoppersSeeEnum

| Name | Value |
|---- | -----|
| PREORDER_WITH_ETA | &quot;preorder_with_eta&quot; |
| PREORDER_NO_ETA | &quot;preorder_no_eta&quot; |
| NOTHING | &quot;nothing&quot; |



