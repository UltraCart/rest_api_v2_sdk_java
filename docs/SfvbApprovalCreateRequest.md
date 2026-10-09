

# SfvbApprovalCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | The gated action to approve. |  [optional] |
|**content** | **String** | For a file.put_script write, the exact script to be written, at most 256 KB.  UltraCart reviews it and keeps only its hash, so send the same bytes again on the write.  Leave it out for a revert, which names params.version. |  [optional] |
|**experimentStart** | [**SfvbExperimentStartRequest**](SfvbExperimentStartRequest.md) |  |  [optional] |
|**itemAttributeRows** | [**List&lt;SfvbItemAttributeBatchRow&gt;**](SfvbItemAttributeBatchRow.md) | For item.attribute_batch, exactly the rows the batch will send - the dry run&#39;s change rows, each with merchant_item_oid and current_sha256.  UltraCart keeps only their hash. |  [optional] |
|**itemPricing** | [**SfvbItemPricingRequest**](SfvbItemPricingRequest.md) |  |  [optional] |
|**params** | [**SfvbApprovalParams**](SfvbApprovalParams.md) |  |  [optional] |
|**reason** | **String** | Why the agent wants to do this, in a sentence.  Shown to the person as unverified text, capped at 500 characters. |  [optional] |
|**redirectRows** | [**List&lt;SfvbRedirectDeleteRow&gt;**](SfvbRedirectDeleteRow.md) | For redirect.delete_batch, exactly the rows the batch delete will send, up to 5,000, each with its hash_sha256.  UltraCart keeps only their hash. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| FILE_DELETE | &quot;file.delete&quot; |
| BLOG_POST_DELETE | &quot;blog_post.delete&quot; |
| FILE_PUT_SCRIPT | &quot;file.put_script&quot; |
| REDIRECT_DELETE_BATCH | &quot;redirect.delete_batch&quot; |
| EXPERIMENT_START | &quot;experiment.start&quot; |
| EXPERIMENT_END | &quot;experiment.end&quot; |
| UPSELL_ENABLE | &quot;upsell.enable&quot; |
| ITEM_ATTRIBUTE_BATCH | &quot;item.attribute_batch&quot; |
| ITEM_PRICING | &quot;item.pricing&quot; |



