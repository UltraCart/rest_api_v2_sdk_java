

# SfvbTrackingHtml


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalNeeded** | **Boolean** | On a dry run, whether the real write needs an approved tracking_html.put request. |  [optional] |
|**changed** | **Boolean** | On a write, whether the slot changed.  False when the content was already the same. |  [optional] |
|**content** | **String** | The HTML, with its Velocity tokens as stored.  Only on a read of one slot and on a write.  Null when empty. |  [optional] |
|**dryRun** | **Boolean** | On a write, true when nothing was saved. |  [optional] |
|**hashSha256** | **String** | The SHA-256 of the HTML as UTF-8, the hash of an empty string when empty.  Send it as If-Match on the write. |  [optional] |
|**label** | **String** | The slot&#39;s name in the admin. |  [optional] |
|**runsOn** | **String** | Where the storefront injects it, in words. |  [optional] |
|**set** | **Boolean** | True when the slot holds any HTML. |  [optional] |
|**sizeBytes** | **Integer** | The size of the HTML in UTF-8 bytes.  0 when empty. |  [optional] |
|**slot** | [**SlotEnum**](#SlotEnum) | tracking is injected into every page except the receipt.  conversion is injected into the receipt only. |  [optional] |



## Enum: SlotEnum

| Name | Value |
|---- | -----|
| TRACKING | &quot;tracking&quot; |
| CONVERSION | &quot;conversion&quot; |



