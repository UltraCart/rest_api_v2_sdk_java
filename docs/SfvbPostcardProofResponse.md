

# SfvbPostcardProofResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backHtml** | **String** | The back as the send renders it, after the name tokens are filled. |  [optional] |
|**backImageUrl** | **String** | The back as the PNG image the print vendor prints from.  A public url. |  [optional] |
|**backThumbnailUrl** | **String** | The print vendor thumbnail of the back. |  [optional] |
|**frontHtml** | **String** | The front as the send renders it, after the name tokens are filled. |  [optional] |
|**frontImageUrl** | **String** | The front as the PNG image the print vendor prints from.  A public url. |  [optional] |
|**frontThumbnailUrl** | **String** | The print vendor thumbnail of the front. |  [optional] |
|**orderSource** | [**OrderSourceEnum**](#OrderSourceEnum) | Where the order came from.  test for the order_id given, dummy for a made up one, none for no order. |  [optional] |
|**postcardUuid** | **String** | The postcard the step mails. |  [optional] |
|**renderedPdfUrl** | **String** | The print vendor proof PDF of both sides. |  [optional] |
|**vendorRendered** | **Boolean** | True when the print vendor rendered the card, so the image and PDF urls are set. |  [optional] |
|**warnings** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Where the proof differs from a send, such as a placeholder coupon code or a sample address, and anything that would make a send skip the card. |  [optional] |



## Enum: OrderSourceEnum

| Name | Value |
|---- | -----|
| TEST | &quot;test&quot; |
| DUMMY | &quot;dummy&quot; |
| NONE | &quot;none&quot; |



