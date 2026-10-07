

# SfvbTestOrder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoOrder** | **Boolean** | True when the order started an auto order, for working on the subscription pages. |  [optional] |
|**created** | **String** | When the order was placed, ISO-8601 in UTC. |  [optional] |
|**currencyCode** | **String** | The currency of the total. |  [optional] |
|**digitalItems** | **Boolean** | True when the order has digital downloads, for working on the digital download page. |  [optional] |
|**itemCount** | **Integer** | How many item lines the order has. |  [optional] |
|**orderId** | **String** | The order id.  Pass it as a render&#39;s context_order_id. |  [optional] |
|**paymentMethod** | **String** | How the order was paid, such as Credit Card or PayPal. |  [optional] |
|**stage** | **String** | The order&#39;s current stage code, such as CO (completed), SD (shipping department) or AR (accounts receivable). |  [optional] |
|**total** | **String** | The order total as a decimal string. |  [optional] |



