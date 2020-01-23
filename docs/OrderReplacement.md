
# OrderReplacement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalMerchantNotesNewOrder** | **String** | Additional merchant notes to append to the new order |  [optional]
**additionalMerchantNotesOriginalOrder** | **String** | Additional merchant notes to append to the original order |  [optional]
**customField1** | **String** | Custom field 1 |  [optional]
**customField2** | **String** | Custom field 2 |  [optional]
**customField3** | **String** | Custom field 3 |  [optional]
**customField4** | **String** | Custom field 4 |  [optional]
**customField5** | **String** | Custom field 5 |  [optional]
**customField6** | **String** | Custom field 6 |  [optional]
**customField7** | **String** | Custom field 7 |  [optional]
**free** | **Boolean** | Set to true if this replacement shipment should be free for the customer. |  [optional]
**immediateCharge** | **Boolean** | Set to true if you want to immediately charge the payment on this order, otherwise it will go to Accounts Receivable. |  [optional]
**items** | [**List&lt;OrderReplacementItem&gt;**](OrderReplacementItem.md) | Items to include in the replacement order |  [optional]
**originalOrderId** | **String** | Original order id |  [optional]
**shippingMethod** | **String** | Shipping method to use.  If not specified or invalid then least cost shipping will take place. |  [optional]
**skipPayment** | **Boolean** | Set to true if you want to skip the payment as if it was successful. |  [optional]



