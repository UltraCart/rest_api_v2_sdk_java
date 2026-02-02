

# OrderPaymentCreditCard


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cardAuthTicket** | **String** | Card authorization ticket |  [optional] |
|**cardAuthorizationAmount** | **BigDecimal** | Card authorization amount |  [optional] |
|**cardAuthorizationDts** | **String** | Card authorization date/time |  [optional] |
|**cardAuthorizationReferenceNumber** | **String** | Card authorization reference number |  [optional] |
|**cardExpirationMonth** | **Integer** | Card expiration month (1-12) |  [optional] |
|**cardExpirationYear** | **Integer** | Card expiration year (Four digit year) |  [optional] |
|**cardNumber** | **String** | Card number (masked to last 4) |  [optional] |
|**cardNumberToken** | **String** | Card number token from hosted fields used to update the card number |  [optional] |
|**cardNumberTruncated** | **Boolean** | True if the card has been truncated |  [optional] |
|**cardType** | [**CardTypeEnum**](#CardTypeEnum) | Card type |  [optional] |
|**cardVerificationNumberToken** | **String** | Card verification number token from hosted fields, only for import/insert of new orders, completely ignored for updates, and always null/empty for queries |  [optional] |
|**dualVaulted** | [**OrderPaymentCreditCardDualVaulted**](OrderPaymentCreditCardDualVaulted.md) |  |  [optional] |



## Enum: CardTypeEnum

| Name | Value |
|---- | -----|
| AMEX | &quot;AMEX&quot; |
| DINERS_CLUB | &quot;Diners Club&quot; |
| DISCOVER | &quot;Discover&quot; |
| JCB | &quot;JCB&quot; |
| MASTERCARD | &quot;MasterCard&quot; |
| VISA | &quot;VISA&quot; |



