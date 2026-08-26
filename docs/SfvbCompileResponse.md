

# SfvbCompileResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerId** | **String** | Container id the document compiled under. |  [optional] |
|**directives** | **List&lt;String&gt;** | Velocity directives the compiled output declares. |  [optional] |
|**success** | **Boolean** | True when compilation produced output. |  [optional] |
|**usedElements** | **List&lt;String&gt;** | Element types used, sorted. |  [optional] |
|**validation** | [**SfvbValidationResponse**](SfvbValidationResponse.md) |  |  [optional] |
|**velocity** | **String** | The compiled Velocity.  This is the body only; the cache wrapper a stored .cjson gets is not included. |  [optional] |



