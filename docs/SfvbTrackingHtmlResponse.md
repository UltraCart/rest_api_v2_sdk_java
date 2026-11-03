

# SfvbTrackingHtmlResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**maxBytes** | **Integer** | The largest HTML the API writes to a slot, in UTF-8 bytes.  The admin allows larger, but UltraCart&#39;s review must read the whole of it. |  [optional] |
|**slots** | [**List&lt;SfvbTrackingHtml&gt;**](SfvbTrackingHtml.md) | tracking and conversion, each with its size and hash_sha256.  Read one slot for its content. |  [optional] |
|**storefrontOid** | **Integer** | The storefront. |  [optional] |



