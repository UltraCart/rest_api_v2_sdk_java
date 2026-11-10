

# SfvbItemVariationsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalNeeded** | **Boolean** | True when the change needs an approved item.variations request. |  [optional] |
|**axes** | [**List&lt;SfvbItemVariationAxis&gt;**](SfvbItemVariationAxis.md) | The axes in order. |  [optional] |
|**changes** | [**List&lt;SfvbItemVariationChangeResult&gt;**](SfvbItemVariationChangeResult.md) | What each change did, or would do on a dry run. |  [optional] |
|**combinations** | [**List&lt;SfvbItemVariationCombination&gt;**](SfvbItemVariationCombination.md) | Every filled combination. |  [optional] |
|**description** | **String** | The parent item&#39;s description. |  [optional] |
|**dryRun** | **Boolean** | True when nothing was saved. |  [optional] |
|**hashSha256** | **String** | Hash of the variations as returned. |  [optional] |
|**merchantItemId** | **String** | The parent item&#39;s id. |  [optional] |
|**merchantItemOid** | **Integer** | The parent item&#39;s oid. |  [optional] |
|**unfilledCombinations** | **Integer** | How many combinations of the options have no child. |  [optional] |
|**warnings** | **List&lt;String&gt;** | Things worth knowing, such as combinations left unfilled. |  [optional] |



