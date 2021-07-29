
# TransactionGatewaysRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultCreditCardTransactionType** | [**DefaultCreditCardTransactionTypeEnum**](#DefaultCreditCardTransactionTypeEnum) | The default transaction type for this merchant account |  [optional]
**gateways** | [**List&lt;TransactionGateway&gt;**](TransactionGateway.md) |  |  [optional]
**themeCreditCardTransactionTypes** | [**List&lt;PaymentsThemeTransactionType&gt;**](PaymentsThemeTransactionType.md) | A list of the storefronts and themes for this merchant account and what type of transaction should be attempted |  [optional]


<a name="DefaultCreditCardTransactionTypeEnum"></a>
## Enum: DefaultCreditCardTransactionTypeEnum
Name | Value
---- | -----
AND_CAPTURE | &quot;auth and capture&quot;
THEN_CAPTURE | &quot;auth then capture&quot;
ONLY | &quot;auth only&quot;



