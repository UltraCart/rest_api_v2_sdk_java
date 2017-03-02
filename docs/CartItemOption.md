
# CartItemOption

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**costIfSpecified** | [**Currency**](Currency.md) |  |  [optional]
**costPerLetter** | [**Currency**](Currency.md) |  |  [optional]
**costPerLine** | [**Currency**](Currency.md) |  |  [optional]
**ignoreIfDefault** | **Boolean** | True if the default answer is ignored |  [optional]
**label** | **String** | Display label for the option |  [optional]
**name** | **String** | Name of the option |  [optional]
**oneTimeFee** | **Boolean** | Charge the fee a single time instead of multiplying by the quantity |  [optional]
**optionOid** | **Integer** | Unique identifier for the option |  [optional]
**required** | **Boolean** | True if the customer is required to select a value |  [optional]
**selectedValue** | **String** | The value of the option specified by the customer |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of option |  [optional]
**values** | [**List&lt;CartItemOptionValue&gt;**](CartItemOptionValue.md) | Values that the customer can select from for radio or select type options |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SINGLE | &quot;single&quot;
MULTILINE | &quot;multiline&quot;
DROPDOWN | &quot;dropdown&quot;
HIDDEN | &quot;hidden&quot;
RADIO | &quot;radio&quot;
FIXED | &quot;fixed&quot;



