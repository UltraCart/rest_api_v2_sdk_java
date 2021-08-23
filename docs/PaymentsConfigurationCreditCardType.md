
# PaymentsConfigurationCreditCardType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingCode** | **String** | Optional field used for Quickbooks integrations to match this credit card with the corresponding payment type in Quickbooks |  [optional]
**cardTypeIcon** | **String** | Internally used icon information for this card type |  [optional]
**creditCard** | [**CreditCardEnum**](#CreditCardEnum) | Credit card type |  [optional]
**depositToAccount** | **String** | The name of the account to deposit funds |  [optional]
**enabled** | **Boolean** | If true, this card type will be accepted during checkout |  [optional]
**processingFee** | [**BigDecimal**](BigDecimal.md) | Optional additional fee applied to order for this card |  [optional]
**processingPercentage** | [**BigDecimal**](BigDecimal.md) | Optional additional fee applied to order for this card |  [optional]
**restrictions** | [**PaymentsConfigurationRestrictions**](PaymentsConfigurationRestrictions.md) |  |  [optional]
**surchargeAccountingCode** | **String** | Optional field. If integrated with Quickbooks, this code will be used when informing Quickbooks about any surcharges applied to orders |  [optional]
**transactionFee** | [**BigDecimal**](BigDecimal.md) | An optional additional fee to charge the customer for using this card. |  [optional]
**transactionPercentage** | [**BigDecimal**](BigDecimal.md) | An optional transaction percentage to charge the customer for using this card |  [optional]


<a name="CreditCardEnum"></a>
## Enum: CreditCardEnum
Name | Value
---- | -----
AMEX | &quot;AMEX&quot;
DINERS_CLUB | &quot;Diners Club&quot;
DISCOVER | &quot;Discover&quot;
MASTERCARD | &quot;MasterCard&quot;
JCB | &quot;JCB&quot;
VISA | &quot;VISA&quot;



