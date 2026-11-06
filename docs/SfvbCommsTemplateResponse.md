

# SfvbCommsTemplateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerCjson** | **String** | The template&#39;s body, as CJSON. |  [optional] |
|**emailTemplateVmPath** | **String** | The Velocity template it renders inside, as stored.  It is looked up in the storefront&#39;s active theme. |  [optional] |
|**notes** | **List&lt;String&gt;** | What isn&#39;t shown. |  [optional] |
|**template** | [**SfvbCommsTemplate**](SfvbCommsTemplate.md) |  |  [optional] |
|**templateExists** | **Boolean** | True when the file at template_path exists. |  [optional] |
|**templateNote** | **String** | Why there is no template file, or null when there is one. |  [optional] |
|**templatePath** | **String** | The theme file that template is, as a render finds it.  Read it with the files endpoints, whose read also reports valid and velocity_errors.  Null when it couldn&#39;t be worked out, with template_note saying why. |  [optional] |



