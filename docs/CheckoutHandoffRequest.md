
# CheckoutHandoffRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cart** | [**Cart**](Cart.md) |  |  [optional]
**errorParameterName** | **String** | If any error happen during the processing on the UltraCart side, the browser will be redirected to your error_return_url with the error passed in this parameter name. |  [optional]
**errorReturnUrl** | **String** | The URL to return the browser to if there are processing errors on the UltraCart side. |  [optional]
**operation** | [**OperationEnum**](#OperationEnum) | The type of handoff operation to perform |  [optional]
**paypalMaximumUpsellRevenue** | [**BigDecimal**](BigDecimal.md) | The maximum amount of revenue that you think the customer could add during a custom upsell after sequence on your checkout. |  [optional]
**paypalReturnUrl** | **String** | The URl to return the customers browser to after they have completed the PayPal process. |  [optional]
**secureHostName** | **String** | The desired secure host name to perform the handoff on.  This should match the desired StoreFront. |  [optional]
**ucacid** | **String** | The UltraCart Analytics cookie value.  Populate this if you&#39;re handing off from a different domain than the checkout. |  [optional]


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
CHECKOUT | &quot;checkout&quot;
PAYPAL | &quot;payPal&quot;
PAYPALCREDIT | &quot;payPalCredit&quot;
VIEW | &quot;view&quot;
AFFIRM | &quot;affirm&quot;
SEZZLE | &quot;sezzle&quot;



