

# SfvbAffiliateNetwork


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliateNetworkOid** | **Integer** | The network&#39;s oid.  Smart Attribution names it as a platform&#39;s integration_id. |  [optional] |
|**approvalNeeded** | **Boolean** | On a dry run, whether the real write needs an approved affiliate_network.change request. |  [optional] |
|**assignToAffiliateOid** | **Integer** | The account&#39;s own affiliate that orders from this network are assigned to.  Null when none. |  [optional] |
|**changes** | [**List&lt;SfvbTrackingChange&gt;**](SfvbTrackingChange.md) | On a write, what changed, or what would change on a dry run.  conversion_pixel shows its size and hash, not its content. |  [optional] |
|**commission** | **BigDecimal** | A fixed commission amount, in the account&#39;s currency.  Null when not set. |  [optional] |
|**conversionPixel** | **String** | HTML for custom, or the postback URL for server_to_server, with the admin&#39;s order tokens.  Only on a read of one network and on a write.  Empty when not set. |  [optional] |
|**conversionPixelSha256** | **String** | The SHA-256 of conversion_pixel as UTF-8. |  [optional] |
|**conversionPixelSizeBytes** | **Integer** | The size of conversion_pixel in UTF-8 bytes. |  [optional] |
|**conversionType** | [**ConversionTypeEnum**](#ConversionTypeEnum) | custom prints conversion_pixel into the receipt page.  commission_junction fires the account&#39;s Commission Junction setup instead and does not use conversion_pixel.  server_to_server has UltraCart&#39;s server request conversion_pixel as an https URL after the order.  A value stored by the admin that is none of these is shown as stored. |  [optional] |
|**cookieLifetimeDays** | **Integer** | How long the visit is remembered, in days, 1 to 3650. |  [optional] |
|**dryRun** | **Boolean** | On a write, true when nothing was saved. |  [optional] |
|**firePercentage** | **BigDecimal** | The share of this network&#39;s orders whose pixel fires, from 0 to 100. |  [optional] |
|**hashSha256** | **String** | The hash of the network as stored.  Send it as If-Match on an update or delete. |  [optional] |
|**ifNotFired** | [**IfNotFiredEnum**](#IfNotFiredEnum) | What UltraCart&#39;s own affiliate system does with an order whose pixel did not fire.  process handles it as usual, skip leaves it out, assign credits if_not_fired_affiliate_oid. |  [optional] |
|**ifNotFiredAffiliateOid** | **Integer** | For if_not_fired assign, the account&#39;s own affiliate to credit. |  [optional] |
|**networkName** | **String** | The network&#39;s name, up to 50 characters. |  [optional] |
|**parameterName** | **String** | The URL parameter that marks a visit from this network, up to 50 characters.  Compared without case. |  [optional] |
|**parameterValue** | **String** | The parameter&#39;s value for this network, up to 100 characters.  Compared without case. |  [optional] |
|**recordFireInCustomField** | **Integer** | The order custom field, 1 to 10, that records whether the pixel fired. |  [optional] |
|**recordNameInCustomField** | **Integer** | The order custom field, 1 to 10, that records the network&#39;s name. |  [optional] |
|**removeEmptyPixelParameters** | **Boolean** | For server_to_server only, true to drop query parameters that are empty after the tokens are filled in. |  [optional] |
|**stompPreviousCookie** | **Boolean** | True to replace another network&#39;s cookie.  False keeps the first network&#39;s. |  [optional] |



## Enum: ConversionTypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;custom&quot; |
| COMMISSION_JUNCTION | &quot;commission_junction&quot; |
| SERVER_TO_SERVER | &quot;server_to_server&quot; |



## Enum: IfNotFiredEnum

| Name | Value |
|---- | -----|
| PROCESS | &quot;process&quot; |
| SKIP | &quot;skip&quot; |
| ASSIGN | &quot;assign&quot; |



