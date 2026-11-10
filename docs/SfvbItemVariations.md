

# SfvbItemVariations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**axes** | [**List&lt;SfvbItemVariationAxis&gt;**](SfvbItemVariationAxis.md) | The axes in order.  Empty when the item has no variations. |  [optional] |
|**combinations** | [**List&lt;SfvbItemVariationCombination&gt;**](SfvbItemVariationCombination.md) | Every filled combination.  A combination not listed has no child, and shoppers see it as unavailable. |  [optional] |
|**description** | **String** | The parent item&#39;s description. |  [optional] |
|**hashSha256** | **String** | Hash of the variations.  Send it as If-Match on the update. |  [optional] |
|**merchantItemId** | **String** | The parent item&#39;s id. |  [optional] |
|**merchantItemOid** | **Integer** | The parent item&#39;s oid. |  [optional] |
|**unfilledCombinations** | **Integer** | How many combinations of the options have no child. |  [optional] |



