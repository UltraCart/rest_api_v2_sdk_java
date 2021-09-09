
# OrderQuery

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ccEmail** | **String** | CC Email |  [optional]
**channelPartnerCode** | **String** | The code of the channel partner |  [optional]
**channelPartnerOrderId** | **String** | The order ID assigned by the channel partner for this order |  [optional]
**city** | **String** | City |  [optional]
**company** | **String** | Company |  [optional]
**countryCode** | **String** | ISO-3166 two letter country code |  [optional]
**creationDateBegin** | **String** | Date/time that the order was created |  [optional]
**creationDateEnd** | **String** | Date/time that the order was created |  [optional]
**currentStage** | [**CurrentStageEnum**](#CurrentStageEnum) | Current stage that the order is in. |  [optional]
**customField1** | **String** | Custom field 1 |  [optional]
**customField2** | **String** | Custom field 2 |  [optional]
**customField3** | **String** | Custom field 3 |  [optional]
**customField4** | **String** | Custom field 4 |  [optional]
**customField5** | **String** | Custom field 5 |  [optional]
**customField6** | **String** | Custom field 6 |  [optional]
**customField7** | **String** | Custom field 7 |  [optional]
**customerProfileOid** | **Integer** | The customer profile to find associated orders for |  [optional]
**email** | **String** | Email |  [optional]
**firstName** | **String** | First name |  [optional]
**itemId** | **String** | Item ID |  [optional]
**lastName** | **String** | Last name |  [optional]
**orderId** | **String** | Order ID |  [optional]
**paymentDateBegin** | **String** | Date/time that the order was successfully processed |  [optional]
**paymentDateEnd** | **String** | Date/time that the order was successfully processed |  [optional]
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | Payment method |  [optional]
**phone** | **String** | Phone |  [optional]
**postalCode** | **String** | Postal code |  [optional]
**purchaseOrderNumber** | **String** | Purchase order number |  [optional]
**refundDateBegin** | **String** | Date/time that the order was refunded |  [optional]
**refundDateEnd** | **String** | Date/time that the order was refunded |  [optional]
**rma** | **String** | RMA number |  [optional]
**screenBrandingThemeCode** | **String** | Screen branding theme code associated with the order (legacy checkout) |  [optional]
**shipmentDateBegin** | **String** | Date/time that the order was shipped |  [optional]
**shipmentDateEnd** | **String** | Date/time that the order was shipped |  [optional]
**shippedOnDateBegin** | **String** | Date/time that the order should ship on |  [optional]
**shippedOnDateEnd** | **String** | Date/time that the order should ship on |  [optional]
**stateRegion** | **String** | State for United States otherwise region or province for other countries |  [optional]
**storefrontHostName** | **String** | StoreFront host name associated with the order |  [optional]
**total** | [**BigDecimal**](BigDecimal.md) | Total |  [optional]


<a name="CurrentStageEnum"></a>
## Enum: CurrentStageEnum
Name | Value
---- | -----
ACCOUNTS_RECEIVABLE | &quot;Accounts Receivable&quot;
PENDING_CLEARANCE | &quot;Pending Clearance&quot;
FRAUD_REVIEW | &quot;Fraud Review&quot;
REJECTED | &quot;Rejected&quot;
SHIPPING_DEPARTMENT | &quot;Shipping Department&quot;
COMPLETED_ORDER | &quot;Completed Order&quot;
QUOTE_REQUEST | &quot;Quote Request&quot;
QUOTE_SENT | &quot;Quote Sent&quot;
LEAST_COST_ROUTING | &quot;Least Cost Routing&quot;
UNKNOWN | &quot;Unknown&quot;


<a name="PaymentMethodEnum"></a>
## Enum: PaymentMethodEnum
Name | Value
---- | -----
AFFIRM | &quot;Affirm&quot;
AMAZON | &quot;Amazon&quot;
AMAZON_SC | &quot;Amazon SC&quot;
CASH | &quot;Cash&quot;
CHECK | &quot;Check&quot;
COD | &quot;COD&quot;
CREDIT_CARD | &quot;Credit Card&quot;
ECHECK | &quot;eCheck&quot;
GOOGLE_SHOPPING | &quot;Google Shopping&quot;
LOANHERO | &quot;LoanHero&quot;
MONEY_ORDER | &quot;Money Order&quot;
PAYPAL | &quot;PayPal&quot;
PURCHASE_ORDER | &quot;Purchase Order&quot;
QUOTE_REQUEST | &quot;Quote Request&quot;
UNKNOWN | &quot;Unknown&quot;
WIRE_TRANSFER | &quot;Wire Transfer&quot;



