
# PointOfSaleReader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceType** | **String** | The device type of the reader. |  [optional]
**label** | **String** | The label of the reader. |  [optional]
**merchantId** | **String** | The merchant id that owns this point of sale reader. |  [optional]
**paymentProvider** | [**PaymentProviderEnum**](#PaymentProviderEnum) | The payment provider for the card reader. |  [optional]
**posReaderId** | **Integer** | Object identifier of the point of sale reader. |  [optional]
**posRegisterOid** | **Integer** | Object identifier of the point of sale register this reader is assigned to. |  [optional]
**serialNumber** | **String** | The serial number of the reader. |  [optional]
**stripeAccountId** | **String** | If the payment provider is Stripe, this is the Stripe account id |  [optional]
**stripeReaderId** | **String** | If the payment provide is Stripe, this is the Stripe terminal reader id |  [optional]


<a name="PaymentProviderEnum"></a>
## Enum: PaymentProviderEnum
Name | Value
---- | -----
STRIPE | &quot;stripe&quot;



