

# SfvbRenderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errors** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Why the render failed.  Always populated when success is false. |  [optional] |
|**html** | **String** | Rendered HTML. |  [optional] |
|**pendingTranslationCount** | **Integer** | Number of strings still awaiting translation in the requested language. |  [optional] |
|**success** | **Boolean** | True when HTML was produced. |  [optional] |
|**truncated** | **Boolean** | True when the HTML was cut short. |  [optional] |
|**warnings** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Quality warnings about the rendered node. |  [optional] |



