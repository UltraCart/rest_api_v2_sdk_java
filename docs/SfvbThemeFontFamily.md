

# SfvbThemeFontFamily


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**family** | **String** | Family name, for example Montserrat. |  [optional] |
|**kitId** | **String** | Typekit kit identifier.  Only meaningful when type is typekit. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Where the font comes from.  native means a font installed on the shopper&#39;s machine, generic means a CSS keyword such as serif or sans-serif and belongs last in the stack. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GOOGLE | &quot;google&quot; |
| TYPEKIT | &quot;typekit&quot; |
| NATIVE | &quot;native&quot; |
| GENERIC | &quot;generic&quot; |



