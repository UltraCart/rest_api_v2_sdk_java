
# CartCustomerProfileCreditCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardExpirationMonth** | **Integer** | Card expiration month (1-12) |  [optional]
**cardExpirationYear** | **Integer** | Card expiration year (four digit) |  [optional]
**cardNumber** | **String** | Card number (masked last 4 digits) |  [optional]
**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type |  [optional]
**customerProfileCreditCardId** | **Integer** | Unique identifier for this stored card |  [optional]
**lastUsedDate** | **String** | Last used |  [optional]


<a name="CardTypeEnum"></a>
## Enum: CardTypeEnum
Name | Value
---- | -----
AMEX | &quot;AMEX&quot;
DINERS_CLUB | &quot;Diners Club&quot;
DISCOVER | &quot;Discover&quot;
MASTERCARD | &quot;MasterCard&quot;
JCB | &quot;JCB&quot;
VISA | &quot;VISA&quot;



