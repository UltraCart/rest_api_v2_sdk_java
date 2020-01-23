
# ItemOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**costIfSpecified** | [**BigDecimal**](BigDecimal.md) | Cost if specified |  [optional]
**costPerLetter** | [**BigDecimal**](BigDecimal.md) | Cost per letter |  [optional]
**costPerLine** | [**BigDecimal**](BigDecimal.md) | Cost per line |  [optional]
**ignoreIfDefault** | **Boolean** | Ignore this option on the order if the default value is selected |  [optional]
**label** | **String** | Label |  [optional]
**labelTranslatedTextInstanceOid** | **Integer** | Label translated text instance ID |  [optional]
**name** | **String** | Name |  [optional]
**nameTranslatedTextInstanceOid** | **Integer** | Name translated text instance ID |  [optional]
**oneTimeFee** | **Boolean** | One time fee |  [optional]
**optionOid** | **Integer** | Option object identifier |  [optional]
**required** | **Boolean** | True if the customer is required to specify an answer |  [optional]
**systemOption** | **Boolean** | True if this is a system option |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of option |  [optional]
**values** | [**List&lt;ItemOptionValue&gt;**](ItemOptionValue.md) | Values |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DROPDOWN | &quot;dropdown&quot;
FILE_ATTACHMENT | &quot;file attachment&quot;
FIXED | &quot;fixed&quot;
HIDDEN | &quot;hidden&quot;
MULTILINE | &quot;multiline&quot;
RADIO | &quot;radio&quot;
SINGLE | &quot;single&quot;



