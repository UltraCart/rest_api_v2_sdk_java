
# PaymentsConfigurationTestMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankAccountNumber** | **String** | Bank account number |  [optional]
**bankRoutingNumber** | **String** | Bank routing number |  [optional]
**creditCardNumber** | **String** | Credit card number |  [optional]
**creditCardNumberExisting** | **String** | The existing credit card number |  [optional]
**description** | **String** | Description |  [optional]
**paymentAction** | [**PaymentActionEnum**](#PaymentActionEnum) | Payment action |  [optional]
**paymentMethod** | **String** | Payment method |  [optional]
**paymentMethodTestOid** | **Integer** | Payment method test oid |  [optional]
**skipAffiliateTransaction** | **Boolean** | Skip affiliate transaction |  [optional]
**skipConversionPixels** | **Boolean** | If true, skips recording any conversion pixels to avoid sending test orders to your analysis sites |  [optional]
**skipFraudFilter** | **Boolean** | Skip fraud filter |  [optional]


<a name="PaymentActionEnum"></a>
## Enum: PaymentActionEnum
Name | Value
---- | -----
SKIP_PAYMENT | &quot;skip payment&quot;
SKIP_PMT_REJ | &quot;skip pmt rej&quot;
SKIP_PMT_CO | &quot;skip pmt co&quot;
HOLD_IN_AR | &quot;hold in ar&quot;



