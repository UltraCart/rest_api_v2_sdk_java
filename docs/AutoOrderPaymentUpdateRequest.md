

# AutoOrderPaymentUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attemptRebill** | **Boolean** | Attempt to rebill the auto order immediately after the payment information is updated.  Defaults to false. |  [optional] |
|**cardExpirationMonth** | **Integer** | Card expiration month (1-12) |  [optional] |
|**cardExpirationYear** | **Integer** | Card expiration year (four digit) |  [optional] |
|**cardNumberToken** | **String** | Hosted field token for the credit card number.  Tokens are valid for two hours. |  [optional] |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Credit card type.  Optional.  When the hosted field token carries the card type, the token wins. |  [optional] |
|**cardVerificationNumberToken** | **String** | Hosted field token for the card verification number (CVV).  Required when the order has a vaulted card that must be re-vaulted. |  [optional] |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| AMEX | &quot;AMEX&quot; |
| DINERS_CLUB | &quot;Diners Club&quot; |
| DISCOVER | &quot;Discover&quot; |
| JCB | &quot;JCB&quot; |
| MASTERCARD | &quot;MasterCard&quot; |
| VISA | &quot;VISA&quot; |



