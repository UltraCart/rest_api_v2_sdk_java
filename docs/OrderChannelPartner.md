
# OrderChannelPartner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoApprovePurchaseOrder** | **Boolean** | If true, any purchase order submitted is automatically approved |  [optional]
**channelPartnerCode** | **String** | The code of the channel partner |  [optional]
**channelPartnerData** | **String** | Additional data provided by the channel partner, read-only |  [optional]
**channelPartnerOid** | **Integer** | Channel partner object identifier, read-only and available on existing channel orders only. |  [optional]
**channelPartnerOrderId** | **String** | The order ID assigned by the channel partner for this order. |  [optional]
**ignoreInvalidShippingMethod** | **Boolean** | Set to true to ignore invalid shipping method being specified.  Only applicable on inserting orders. |  [optional]
**noRealtimePaymentProcessing** | **Boolean** | Indicates this order should be placed in Account Receivable for later payment processing |  [optional]
**skipPaymentProcessing** | **Boolean** | Indicates this order was already paid for via a channel purchase and no payment collection should be attempted |  [optional]
**storeCompleted** | **Boolean** | Instructs UltraCart to skip shipping department and mark this order as fully complete.  This flag defaults to true.  Set this flag to false to shipped product for this order. |  [optional]
**storeIfPaymentDeclines** | **Boolean** | If true, any failed payment will place the order in Accounts Receivable rather than rejecting it. |  [optional]
**treatWarningsAsErrors** | **Boolean** | Any warnings are raised as errors and halt the import of the order |  [optional]



