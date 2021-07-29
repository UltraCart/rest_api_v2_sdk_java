
# PaymentsThemeTransactionType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | External human readable identifier for a theme |  [optional]
**creditCardTransactionType** | [**CreditCardTransactionTypeEnum**](#CreditCardTransactionTypeEnum) | The credit card transaction type for this theme |  [optional]
**screenBrandingThemeOid** | **Integer** | Internal identifier for a theme |  [optional]


<a name="CreditCardTransactionTypeEnum"></a>
## Enum: CreditCardTransactionTypeEnum
Name | Value
---- | -----
AND_CAPTURE | &quot;auth and capture&quot;
THEN_CAPTURE | &quot;auth then capture&quot;
ONLY | &quot;auth only&quot;



