
# ItemAutoOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authFutureAmount** | [**BigDecimal**](BigDecimal.md) | Amount to try and authorize for the future rebill |  [optional]
**authTestAmount** | [**BigDecimal**](BigDecimal.md) | Amount to try and test authorize |  [optional]
**autoOrderCancelItemId** | **String** | Item id to attempt charging the customer for if they cancel |  [optional]
**autoOrderCancelItemOid** | **Integer** | Item object identifier to attempt charging the customer for if they cancel |  [optional]
**autoOrderDowngradeItems** | **List&lt;String&gt;** | List of downgrade items presented to customer service representatives |  [optional]
**autoOrderPaused** | **Boolean** | True if the rebill processing of this item is paused |  [optional]
**autoOrderSchedules** | **List&lt;String&gt;** | The user selectable schedules that are available |  [optional]
**autoOrderUpgradeItems** | **List&lt;String&gt;** | List of upgrade items presented to customer service representatives |  [optional]
**autoOrderUpsell** | **Boolean** | True if this item uses a fixed upsell step schedule |  [optional]
**autoOrderUpsellNoEasyCancel** | **Boolean** | Do not send the easy cancel email to the customer |  [optional]
**autoOrderUpsellOnePerCustomer** | **Boolean** | Limit the purchase of this item to one per customer |  [optional]
**autoOrderable** | **Boolean** | True if this item can be automatically ordered by the customer |  [optional]
**cancelOtherAutoOrders** | **Boolean** | True if other auto orders for this customer should be canceled when this item is ordered |  [optional]
**freeShippingAutoOrder** | **Boolean** | True if the customer should be given free shipping |  [optional]
**refundOtherAutoOrders** | **Boolean** | True if other auto orders for this customer should refunded if this item is refunded. |  [optional]
**steps** | [**List&lt;ItemAutoOrderStep&gt;**](ItemAutoOrderStep.md) | The rebill steps if this auto order is an upsell |  [optional]



