

# OrderAutoOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoOrderCode** | **String** | Unique code assigned to this auto order |  [optional] |
|**autoOrderOid** | **Integer** | Auto order object identifier |  [optional] |
|**cancelAfterNextXOrders** | **Integer** | Cancel this auto order after X additional rebills |  [optional] |
|**cancelDowngrade** | **Boolean** | True if the auto order was canceled because the customer purchased a downgrade item |  [optional] |
|**cancelReason** | **String** | The reason this auto order was canceled by either merchant or customer |  [optional] |
|**cancelUpgrade** | **Boolean** | True if the auto order was canceled because the customer purchased an upgrade item |  [optional] |
|**canceledByUser** | **String** | The user that canceled the auto order |  [optional] |
|**canceledDts** | **String** | The date/time that the auto order was canceled |  [optional] |
|**completed** | **Boolean** | True if the auto order ran successfully to completion |  [optional] |
|**creditCardAttempt** | **Integer** | The number of credit card attempts that have taken place |  [optional] |
|**disabledDts** | **String** | The date/time the auto order was disabled due to failed rebills |  [optional] |
|**enabled** | **Boolean** | True if this auto order is enabled |  [optional] |
|**failureReason** | **String** | The reason this auto order failed during the last rebill attempt |  [optional] |
|**items** | [**List&lt;AutoOrderItem&gt;**](AutoOrderItem.md) | The items that are setup to rebill |  [optional] |
|**nextAttempt** | **String** | The next time that the auto order will be attempted for processing |  [optional] |
|**originalOrderId** | **String** | The original order id that this auto order is associated with. |  [optional] |
|**overrideAffiliateId** | **Integer** | Override the affiliate id given credit for rebills of this auto order |  [optional] |
|**rebillOrders** | [**List&lt;Order&gt;**](Order.md) | Rebill orders that have taken place on this auto order |  [optional] |
|**rotatingTransactionGatewayCode** | **String** | The RTG code associated with this order for future rebills |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the auto order |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| CANCELED | &quot;canceled&quot; |
| DISABLED | &quot;disabled&quot; |



