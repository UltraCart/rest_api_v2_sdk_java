
# PaymentsConfigurationCreditCardType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountingCode** | **String** | Optional field used for Quickbooks integrations to match this credit card with the corresponding payment type in Quickbooks |  [optional]
**cardTypeIcon** | **String** | Internally used icon information for this card type |  [optional]
**creditCard** | [**CreditCardEnum**](#CreditCardEnum) | Credit card type |  [optional]
**depositToAccount** | **String** | The name of the account to deposit funds |  [optional]
**enabled** | **Boolean** | If true, this card type will be accepted during checkout |  [optional]
**processingFee** | **String** | Optional additional fee applied to order for this card |  [optional]
**processingPercentage** | **String** | Optional additional fee applied to order for this card |  [optional]
**surchargeAccountingCode** | **String** | Optional field. If integrated with Quickbooks, this code will be used when informing Quickbooks about any surcharges applied to orders |  [optional]
**transactionFee** | **String** | An optional additional fee to charge the customer for using this card. |  [optional]
**transactionPercentage** | **String** | An optional transaction percentage to charge the customer for using this card |  [optional]


<a name="CreditCardEnum"></a>
## Enum: CreditCardEnum
Name | Value
---- | -----
AMEX | &quot;AMEX&quot;
VISA | &quot;Visa&quot;
DINERS_CLUB | &quot;Diners Club&quot;
DISCOVER | &quot;Discover&quot;
JCB | &quot;JCB&quot;
MASTERCARD | &quot;MasterCard&quot;


