

# SfvbEmailRenderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**draft** | **Boolean** | True when an unsaved draft was rendered. |  [optional] |
|**html** | **String** | The HTML body. |  [optional] |
|**orderId** | **String** | The order the email rendered with, when it used one. |  [optional] |
|**orderSource** | **String** | Where that order came from.  test (the order given), dummy (made up) or none. |  [optional] |
|**previewText** | **String** | The preview text an inbox shows after the subject, when the email has one. |  [optional] |
|**subject** | **String** | The subject line. |  [optional] |
|**text** | **String** | The plain text body. |  [optional] |
|**validation** | [**SfvbValidationResponse**](SfvbValidationResponse.md) |  |  [optional] |
|**warnings** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Problems a real send would hit, such as a missing required footer token, and placeholders used in place of values a send creates. |  [optional] |



