
# OrderInternal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exportedToAccounting** | **Boolean** | True if the order has been exported to QuickBooks. If QuickBooks is not configured, then this will already be true |  [optional]
**merchantNotes** | **String** | Merchant notes.  Full notes in non-transactional mode.  Just used to write a new merchant note when transaction merchant notes enabled. |  [optional]
**placedByUser** | **String** | If placed via the BEOE, this is the user that placed the order |  [optional]
**refundByUser** | **String** | User that issued the refund |  [optional]
**salesRepCode** | **String** | Sales rep code associated with the order |  [optional]
**transactionalMerchantNotes** | [**List&lt;OrderTransactionalMerchantNote&gt;**](OrderTransactionalMerchantNote.md) | Transactional merchant notes |  [optional]



