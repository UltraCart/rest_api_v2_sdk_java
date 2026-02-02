
# OrderAffiliateLedger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignedByUser** | **String** | UltraCart user name that assigned this commission if manually assigned |  [optional]
**itemId** | **String** | Item ID that this ledger record is associated with |  [optional]
**tierNumber** | **Integer** | Tier number of this affiliate in the commission calculation |  [optional]
**transactionAmount** | [**BigDecimal**](BigDecimal.md) | Amount of the transaction |  [optional]
**transactionAmountPaid** | [**BigDecimal**](BigDecimal.md) | The amount that has been paid so far on the transaction |  [optional]
**transactionDts** | **String** | The date/time that the affiliate ledger was generated for the transaction |  [optional]
**transactionMemo** | **String** | Details of the transaction suitable for display to the affiliate |  [optional]
**transactionPercentage** | [**BigDecimal**](BigDecimal.md) | The percentage earned on the transaction |  [optional]
**transactionState** | [**TransactionStateEnum**](#TransactionStateEnum) | The state of the transaction |  [optional]


<a name="TransactionStateEnum"></a>
## Enum: TransactionStateEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
POSTED | &quot;Posted&quot;
APPROVED | &quot;Approved&quot;
PAID | &quot;Paid&quot;
REJECTED | &quot;Rejected&quot;
PARTIALLY_PAID | &quot;Partially Paid&quot;



