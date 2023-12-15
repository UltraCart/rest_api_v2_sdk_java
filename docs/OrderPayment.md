
# OrderPayment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**check** | [**OrderPaymentCheck**](OrderPaymentCheck.md) |  |  [optional]
**creditCard** | [**OrderPaymentCreditCard**](OrderPaymentCreditCard.md) |  |  [optional]
**echeck** | [**OrderPaymentECheck**](OrderPaymentECheck.md) |  |  [optional]
**healthBenefitCard** | [**OrderPaymentHealthBenefitCard**](OrderPaymentHealthBenefitCard.md) |  |  [optional]
**holdForFraudReview** | **Boolean** | True if order has been held for fraud review |  [optional]
**insurance** | [**OrderPaymentInsurance**](OrderPaymentInsurance.md) |  |  [optional]
**paymentDts** | **String** | Date/time that the payment was successfully processed, for new orders, this field is only considered if channel_partner.skip_payment_processing is true |  [optional]
**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) | Payment method |  [optional]
**paymentMethodAccountingCode** | **String** | Payment method QuickBooks code |  [optional]
**paymentMethodDepositToAccount** | **String** | Payment method QuickBooks deposit account |  [optional]
**paymentStatus** | [**PaymentStatusEnum**](#PaymentStatusEnum) | Payment status |  [optional]
**purchaseOrder** | [**OrderPaymentPurchaseOrder**](OrderPaymentPurchaseOrder.md) |  |  [optional]
**rotatingTransactionGatewayCode** | **String** | Rotating transaction gateway code used to process this order |  [optional]
**surcharge** | [**Currency**](Currency.md) |  |  [optional]
**surchargeAccountingCode** | **String** | Surcharge accounting code |  [optional]
**surchargeTransactionFee** | [**BigDecimal**](BigDecimal.md) | Surcharge transaction fee |  [optional]
**surchargeTransactionPercentage** | [**BigDecimal**](BigDecimal.md) | Surcharge transaction percentage |  [optional]
**testOrder** | **Boolean** | True if this is a test order |  [optional]
**transactions** | [**List&lt;OrderPaymentTransaction&gt;**](OrderPaymentTransaction.md) | Transactions associated with processing this payment |  [optional]


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
EBAY | &quot;eBay&quot;
ECHECK | &quot;eCheck&quot;
GOOGLE_SHOPPING | &quot;Google Shopping&quot;
INSURANCE | &quot;Insurance&quot;
LOANHERO | &quot;LoanHero&quot;
MONEY_ORDER | &quot;Money Order&quot;
PAYPAL | &quot;PayPal&quot;
PURCHASE_ORDER | &quot;Purchase Order&quot;
QUOTE_REQUEST | &quot;Quote Request&quot;
UNKNOWN | &quot;Unknown&quot;
WIRE_TRANSFER | &quot;Wire Transfer&quot;
WALMART | &quot;Walmart&quot;
SHOP_COM | &quot;Shop.com&quot;
SEZZLE | &quot;Sezzle&quot;
VENMO | &quot;Venmo&quot;
APPLE_PAY | &quot;Apple Pay&quot;
GOOGLE_PAY | &quot;Google Pay&quot;
HEALTH_BENEFIT_CARD | &quot;Health Benefit Card&quot;


<a name="PaymentStatusEnum"></a>
## Enum: PaymentStatusEnum
Name | Value
---- | -----
UNPROCESSED | &quot;Unprocessed&quot;
AUTHORIZED | &quot;Authorized&quot;
CAPTURE_FAILED | &quot;Capture Failed&quot;
PROCESSED | &quot;Processed&quot;
DECLINED | &quot;Declined&quot;
VOIDED | &quot;Voided&quot;
REFUNDED | &quot;Refunded&quot;
SKIPPED | &quot;Skipped&quot;



