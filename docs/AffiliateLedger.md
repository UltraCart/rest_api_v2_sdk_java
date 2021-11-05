
# AffiliateLedger

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affiliateClickOid** | **Integer** | Unique object identifier for the click associated with this ledger entry |  [optional]
**affiliateLedgerOid** | **Integer** | Affiliate ledger object ID associated with this ledger |  [optional]
**affiliateLinkOid** | **Integer** | Unique object identifier for the link that this click is associated with |  [optional]
**affiliateOid** | **Integer** | Affiliate object ID associated with this transaction |  [optional]
**assignedByUser** | **String** | User that assigned the transaction if it was done manually |  [optional]
**click** | [**AffiliateClick**](AffiliateClick.md) |  |  [optional]
**itemId** | **String** | Item ID associated with this transaction |  [optional]
**link** | [**AffiliateLink**](AffiliateLink.md) |  |  [optional]
**order** | [**Order**](Order.md) |  |  [optional]
**orderId** | **String** | Order ID associated with this transaction |  [optional]
**originalTransactionDts** | **String** | Date/time of the original transaction for reversals |  [optional]
**subId** | **String** | Sub ID associated with transaction (from the click) |  [optional]
**tierNumber** | **Integer** | Tier number that this transaction earned |  [optional]
**transactionAmount** | [**BigDecimal**](BigDecimal.md) | Transaction amount |  [optional]
**transactionAmountPaid** | [**BigDecimal**](BigDecimal.md) | Amount of the transaction that has been paid out. |  [optional]
**transactionDts** | **String** | Date/time that the transaction was made |  [optional]
**transactionMemo** | **String** | Memo explaining the transaction |  [optional]
**transactionPercentage** | [**BigDecimal**](BigDecimal.md) | Percentage associated with this transaction |  [optional]
**transactionState** | [**TransactionStateEnum**](#TransactionStateEnum) | Transaction state |  [optional]


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



