

# SfvbApprovalParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliateNetworkOid** | **Integer** | The affiliate network, for affiliate_network.change and affiliate_network.delete.  0 or left out for affiliate_network.change of a network the create call will add. |  [optional] |
|**afterStepUuid** | **String** | For sequence_step.move, the step it moves after.  Or branch_step_uuid with side. |  [optional] |
|**attributeNames** | **List&lt;String&gt;** | For item.attribute_batch, the attributes the batch would change.  Set by the server. |  [optional] |
|**blogPostOid** | **Integer** | The blog post, for blog_post.delete. |  [optional] |
|**branchStepUuid** | **String** | For sequence_step.move, the condition, split or inboxgeek step it moves to the start of a side of. |  [optional] |
|**contentSha256** | **String** | For file.put_script and tracking_html.put, the SHA-256 of the exact bytes approved, and for affiliate_network.change the SHA-256 of the conversion pixel.  Set by the server, never by the caller.  The write must send bytes with this hash. |  [optional] |
|**domain** | **String** | For sending_domain.delete, the sending domain. |  [optional] |
|**espTwilioUuid** | **String** | For twilio_account.delete, the Twilio account&#39;s esp_twilio_uuid, as GET comms/twilio_account returns it. |  [optional] |
|**experimentOid** | **Integer** | For experiment.end, the experiment to end. |  [optional] |
|**itemCount** | **Integer** | For item.attribute_batch, how many items the batch would change when it was requested.  Set by the server. |  [optional] |
|**merchantItemOid** | **Integer** | For item.pricing, the item whose pricing changes. |  [optional] |
|**path** | **String** | The file path, for file.delete and file.put_script, or the page path for experiment.start of a page experiment.  Exactly as the gated call will send it. |  [optional] |
|**requestSha256** | **String** | For experiment.start of a url experiment, the hash of the checked experiment approved, for item.pricing, tracking_provider.change and affiliate_network.change the hash of the change, and for smart_attribution.change the hash of the configuration the change would store.  Set by the server.  The gated call must send the same. |  [optional] |
|**rowsSha256** | **String** | For redirect.delete_batch and item.attribute_batch, the plan_hash of the exact rows approved.  Set by the server.  The batch must send rows with this hash. |  [optional] |
|**ruleCount** | **Integer** | For redirect.delete_batch, how many rules the batch would delete when it was requested.  Set by the server. |  [optional] |
|**segmentUuid** | **String** | The segment whose rule changes, for segment.update. |  [optional] |
|**sequenceUuid** | **String** | The communication sequence, for sequence_step.delete, sequence_step.move and sequence_step.enable_postcard. |  [optional] |
|**side** | **String** | For sequence_step.move with branch_step_uuid, the side&#39;s label from the sequence read. |  [optional] |
|**slot** | **String** | For experiment.start of a page experiment, the page body name, which defaults to body.  For tracking_html.put, tracking or conversion. |  [optional] |
|**stepUuid** | **String** | The step to remove, for sequence_step.delete, to move, for sequence_step.move, or to turn on, for sequence_step.enable_postcard. |  [optional] |
|**trackingProvider** | **String** | The tracking provider key, for tracking_provider.change. |  [optional] |
|**upsellKind** | [**UpsellKindEnum**](#UpsellKindEnum) | For upsell.enable, what to switch on. |  [optional] |
|**upsellOid** | **Integer** | For upsell.enable, the oid of the offer or path to switch on. |  [optional] |
|**version** | **Integer** | For file.put_script, the history version a revert restores.  Leave it out, and send content instead, for a write. |  [optional] |
|**widgetId** | **String** | For experiment.start of a page experiment, the id of the experiment element. |  [optional] |
|**winnerVariationNumber** | **Integer** | For experiment.end, the winning variation.  Leave it out to end without a winner, and leave it out of the end call too. |  [optional] |



## Enum: UpsellKindEnum

| Name | Value |
|---- | -----|
| OFFER | &quot;offer&quot; |
| PATH | &quot;path&quot; |



