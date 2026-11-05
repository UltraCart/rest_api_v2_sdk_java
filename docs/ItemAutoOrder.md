

# ItemAutoOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authFutureAmount** | **BigDecimal** | Amount to try and authorize for the future rebill |  [optional] |
|**authTestAmount** | **BigDecimal** | Amount to try and test authorize |  [optional] |
|**autoOrderCancelChargeMinimumBalance** | **Boolean** | If true, the cost of the cancel item will be the remaining balance of the minimum rebill or lifetime value |  [optional] |
|**autoOrderCancelItemId** | **String** | Item id to attempt charging the customer for if they cancel |  [optional] |
|**autoOrderCancelItemOid** | **Integer** | Item object identifier to attempt charging the customer for if they cancel |  [optional] |
|**autoOrderCancelMinimumLifeTimeCount** | **Integer** | The minimum life time count that must be billed in order to not be charged the cancellation item. |  [optional] |
|**autoOrderCancelMinimumLifeTimeValue** | **BigDecimal** | The minimum life time value that must be paid in order to not be charged the cancellation item. |  [optional] |
|**autoOrderCancelMinimumRebillCount** | **Integer** | The minimum rebill count that must be billed in order to not be charged the cancellation item. |  [optional] |
|**autoOrderCancelMinimumRebillValue** | **BigDecimal** | The minimum rebill value that must be paid in order to not be charged the cancellation item. |  [optional] |
|**autoOrderDowngradeItems** | **List&lt;String&gt;** | List of downgrade items presented to customer service representatives |  [optional] |
|**autoOrderMyaccountFrequencyDayCounts** | **List&lt;Integer&gt;** | Day counts (1 to 365, at most 20) a customer may switch this auto-enrolled item to from MyAccount, for example [30, 60, 90].  Requires the advanced auto order settings to be enabled on the account.  Omit to leave unchanged; send an empty array to clear. |  [optional] |
|**autoOrderMyaccountFrequencyLastStepOnly** | **Boolean** | True if the MyAccount frequency change is only offered once the item is on its last auto order step.  If auto_order_myaccount_frequency_schedules or auto_order_myaccount_frequency_day_counts is sent without this property, it is set to false; if none of the three are sent, it is left unchanged. |  [optional] |
|**autoOrderMyaccountFrequencySchedules** | **List&lt;String&gt;** | Standard schedules a customer may switch this auto-enrolled item to from MyAccount.  Requires the advanced auto order settings to be enabled on the account.  Omit to leave unchanged; send an empty array to clear. |  [optional] |
|**autoOrderPaused** | **Boolean** | True if the rebill processing of this item is paused |  [optional] |
|**autoOrderProhibitExpiringCards** | **Integer** | Minimum number of months before expiration for the card.  Overrides the account level setting if higher.  Set to zero to disable. |  [optional] |
|**autoOrderSchedules** | **List&lt;String&gt;** | The user selectable schedules that are available |  [optional] |
|**autoOrderUpgradeItems** | **List&lt;String&gt;** | List of upgrade items presented to customer service representatives |  [optional] |
|**autoOrderUpsell** | **Boolean** | True if this item uses a fixed upsell step schedule |  [optional] |
|**autoOrderUpsellNoEasyCancel** | **Boolean** | Do not send the easy cancel email to the customer |  [optional] |
|**autoOrderUpsellOnePerCustomer** | **Boolean** | Limit the purchase of this item to one per customer |  [optional] |
|**autoOrderable** | **Boolean** | True if this item can be automatically ordered by the customer |  [optional] |
|**cancelOtherAutoOrders** | **Boolean** | True if other auto orders for this customer should be canceled when this item is ordered |  [optional] |
|**freeShippingAutoOrder** | **Boolean** | True if the customer should be given free shipping |  [optional] |
|**refundOtherAutoOrders** | **Boolean** | True if other auto orders for this customer should refunded if this item is refunded. |  [optional] |
|**steps** | [**List&lt;ItemAutoOrderStep&gt;**](ItemAutoOrderStep.md) | The rebill steps if this auto order is an upsell |  [optional] |



