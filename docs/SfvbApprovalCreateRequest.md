

# SfvbApprovalCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | The gated action to approve. |  [optional] |
|**affiliateNetwork** | [**SfvbAffiliateNetworkRequest**](SfvbAffiliateNetworkRequest.md) |  |  [optional] |
|**commsListImport** | [**SfvbCommsProviderImportRequest**](SfvbCommsProviderImportRequest.md) |  |  [optional] |
|**commsSettings** | [**SfvbCommsSettingsUpdateRequest**](SfvbCommsSettingsUpdateRequest.md) |  |  [optional] |
|**content** | **String** | For a file.put_script write, the exact script to be written, at most 256 KB.  For tracking_html.put, the exact HTML the write will send, at most 256 KB.  UltraCart reviews it and keeps only its hash, so send the same bytes again on the write.  Leave it out for a revert, which names params.version. |  [optional] |
|**experimentStart** | [**SfvbExperimentStartRequest**](SfvbExperimentStartRequest.md) |  |  [optional] |
|**flowBackfill** | [**SfvbFlowBackfillRequest**](SfvbFlowBackfillRequest.md) |  |  [optional] |
|**itemAttributeRows** | [**List&lt;SfvbItemAttributeBatchRow&gt;**](SfvbItemAttributeBatchRow.md) | For item.attribute_batch, exactly the rows the batch will send - the dry run&#39;s change rows, each with merchant_item_oid and current_sha256.  UltraCart keeps only their hash. |  [optional] |
|**itemPricing** | [**SfvbItemPricingRequest**](SfvbItemPricingRequest.md) |  |  [optional] |
|**params** | [**SfvbApprovalParams**](SfvbApprovalParams.md) |  |  [optional] |
|**postcardTestMail** | [**SfvbCommsTestPostcardRequest**](SfvbCommsTestPostcardRequest.md) |  |  [optional] |
|**reason** | **String** | Why the agent wants to do this, in a sentence.  Shown to the person as unverified text, capped at 500 characters. |  [optional] |
|**redirectRows** | [**List&lt;SfvbRedirectDeleteRow&gt;**](SfvbRedirectDeleteRow.md) | For redirect.delete_batch, exactly the rows the batch delete will send, up to 5,000, each with its hash_sha256.  UltraCart keeps only their hash. |  [optional] |
|**segmentUpdate** | [**SfvbCommsSegmentWriteRequest**](SfvbCommsSegmentWriteRequest.md) |  |  [optional] |
|**siteSeo** | [**SfvbSiteSeoRequest**](SfvbSiteSeoRequest.md) |  |  [optional] |
|**smartAttribution** | [**SfvbSmartAttributionRequest**](SfvbSmartAttributionRequest.md) |  |  [optional] |
|**trackingProvider** | [**SfvbTrackingProviderRequest**](SfvbTrackingProviderRequest.md) |  |  [optional] |
|**transactionalEmail** | [**SfvbTransactionalEmailUpdateRequest**](SfvbTransactionalEmailUpdateRequest.md) |  |  [optional] |



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
| TWILIO_ACCOUNT_DELETE | &quot;twilio_account.delete&quot; |
| SENDING_DOMAIN_DELETE | &quot;sending_domain.delete&quot; |
| SEQUENCE_STEP_DELETE | &quot;sequence_step.delete&quot; |
| SEQUENCE_STEP_MOVE | &quot;sequence_step.move&quot; |
| SEQUENCE_STEP_ENABLE_POSTCARD | &quot;sequence_step.enable_postcard&quot; |
| SEGMENT_UPDATE | &quot;segment.update&quot; |
| SMART_ATTRIBUTION_CHANGE | &quot;smart_attribution.change&quot; |
| SMART_ATTRIBUTION_DELETE | &quot;smart_attribution.delete&quot; |
| TRACKING_PROVIDER_CHANGE | &quot;tracking_provider.change&quot; |
| TRACKING_HTML_PUT | &quot;tracking_html.put&quot; |
| AFFILIATE_NETWORK_CHANGE | &quot;affiliate_network.change&quot; |
| AFFILIATE_NETWORK_DELETE | &quot;affiliate_network.delete&quot; |
| SITE_SEO_CHANGE | &quot;site_seo.change&quot; |
| TRANSACTIONAL_EMAIL_UPDATE | &quot;transactional_email.update&quot; |
| COMMS_SETTINGS_UPDATE | &quot;comms_settings.update&quot; |
| COMMS_LIST_IMPORT | &quot;comms_list.import&quot; |
| POSTCARD_TEST_MAIL | &quot;postcard.test_mail&quot; |
| FLOW_BACKFILL | &quot;flow.backfill&quot; |



