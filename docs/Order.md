

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliates** | [**List&lt;OrderAffiliate&gt;**](OrderAffiliate.md) | Affiliates if any were associated with the order.  The first one in the array sent the order and each subsequent affiliate is the recruiter that earns a downline commission. |  [optional] |
|**autoOrder** | [**OrderAutoOrder**](OrderAutoOrder.md) |  |  [optional] |
|**billing** | [**OrderBilling**](OrderBilling.md) |  |  [optional] |
|**buysafe** | [**OrderBuysafe**](OrderBuysafe.md) |  |  [optional] |
|**channelPartner** | [**OrderChannelPartner**](OrderChannelPartner.md) |  |  [optional] |
|**checkout** | [**OrderCheckout**](OrderCheckout.md) |  |  [optional] |
|**coupons** | [**List&lt;OrderCoupon&gt;**](OrderCoupon.md) | Coupons |  [optional] |
|**creationDts** | **String** | Date/time that the order was created |  [optional] |
|**currencyCode** | **String** | Currency code that the customer used if different than the merchant&#39;s base currency code |  [optional] |
|**currentStage** | [**CurrentStageEnum**](#CurrentStageEnum) | Current stage that the order is in. |  [optional] |
|**currentStageHistories** | [**List&lt;OrderCurrentStageHistory&gt;**](OrderCurrentStageHistory.md) | History of the changes to the current_stage field |  [optional] |
|**customerProfile** | [**Customer**](Customer.md) |  |  [optional] |
|**digitalOrder** | [**OrderDigitalOrder**](OrderDigitalOrder.md) |  |  [optional] |
|**edi** | [**OrderEdi**](OrderEdi.md) |  |  [optional] |
|**exchangeRate** | **BigDecimal** | Exchange rate at the time the order was placed if currency code is different than the base currency |  [optional] |
|**fraudScore** | [**OrderFraudScore**](OrderFraudScore.md) |  |  [optional] |
|**gift** | [**OrderGift**](OrderGift.md) |  |  [optional] |
|**giftCertificate** | [**OrderGiftCertificate**](OrderGiftCertificate.md) |  |  [optional] |
|**internal** | [**OrderInternal**](OrderInternal.md) |  |  [optional] |
|**items** | [**List&lt;OrderItem&gt;**](OrderItem.md) | Items |  [optional] |
|**languageIsoCode** | **String** | Three letter ISO-639 language code used by the customer during the checkout if different than the default language |  [optional] |
|**linkedShipment** | [**OrderLinkedShipment**](OrderLinkedShipment.md) |  |  [optional] |
|**marketing** | [**OrderMarketing**](OrderMarketing.md) |  |  [optional] |
|**merchantId** | **String** | UltraCart merchant ID owning this order |  [optional] |
|**orderId** | **String** | Order ID |  [optional] |
|**payment** | [**OrderPayment**](OrderPayment.md) |  |  [optional] |
|**pointOfSale** | [**OrderPointOfSale**](OrderPointOfSale.md) |  |  [optional] |
|**properties** | [**List&lt;OrderProperty&gt;**](OrderProperty.md) | Properties, available only through update, not through insert due to the nature of how properties are handled internally |  [optional] |
|**quote** | [**OrderQuote**](OrderQuote.md) |  |  [optional] |
|**refundDts** | **String** | If the order was refunded, the date/time that the last refund occurred |  [optional] |
|**refundReason** | **String** | Refund reason code.  This can only be written during a refund operation otherwise this field is read only. |  [optional] |
|**rejectDts** | **String** | If the order was rejected, the date/time that the rejection occurred |  [optional] |
|**rejectReason** | **String** | Reject reason code.  This can only be written during a reject operation otherwise this field is read only. |  [optional] |
|**salesforce** | [**OrderSalesforce**](OrderSalesforce.md) |  |  [optional] |
|**shipping** | [**OrderShipping**](OrderShipping.md) |  |  [optional] |
|**summary** | [**OrderSummary**](OrderSummary.md) |  |  [optional] |
|**tags** | [**List&lt;OrderTag&gt;**](OrderTag.md) | tags, available only through update, not through insert due to the nature of how tags are handled internally |  [optional] |
|**taxes** | [**OrderTaxes**](OrderTaxes.md) |  |  [optional] |
|**utms** | [**List&lt;OrderUtm&gt;**](OrderUtm.md) | UTM clicks.  The zero index is the most recent (last) UTM click |  [optional] |



## Enum: CurrentStageEnum

| Name | Value |
|---- | -----|
| ACCOUNTS_RECEIVABLE | &quot;Accounts Receivable&quot; |
| PENDING_CLEARANCE | &quot;Pending Clearance&quot; |
| FRAUD_REVIEW | &quot;Fraud Review&quot; |
| REJECTED | &quot;Rejected&quot; |
| SHIPPING_DEPARTMENT | &quot;Shipping Department&quot; |
| COMPLETED_ORDER | &quot;Completed Order&quot; |
| QUOTE_REQUEST | &quot;Quote Request&quot; |
| QUOTE_SENT | &quot;Quote Sent&quot; |
| LEAST_COST_ROUTING | &quot;Least Cost Routing&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| PRE_ORDERED | &quot;Pre-ordered&quot; |
| ADVANCED_ORDER_ROUTING | &quot;Advanced Order Routing&quot; |
| HOLD | &quot;Hold&quot; |



