
# ItemShippingMethod

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cost** | [**BigDecimal**](BigDecimal.md) | Cost |  [optional]
**eachAdditionalItemMarkup** | [**BigDecimal**](BigDecimal.md) | Each additional item markup |  [optional]
**filterToIfAvailable** | **Boolean** | Filter to this method if available |  [optional]
**firstItemMarkup** | [**BigDecimal**](BigDecimal.md) | First item markup |  [optional]
**fixedShippingCost** | [**BigDecimal**](BigDecimal.md) | Fixed shipping cost |  [optional]
**flatFeeMarkup** | [**BigDecimal**](BigDecimal.md) | Flat fee markup |  [optional]
**freeShipping** | **Boolean** | Free shipping |  [optional]
**perItemFeeMarkup** | [**BigDecimal**](BigDecimal.md) | Per item fee markup |  [optional]
**percentageMarkup** | [**BigDecimal**](BigDecimal.md) | Percentage markup |  [optional]
**percentageOfItemMarkup** | [**BigDecimal**](BigDecimal.md) | Percentage of item markup |  [optional]
**relaxRestrictionsOnUpsell** | **Boolean** | Relax restrictions on upsell |  [optional]
**shippingMethod** | **String** | Shipping method name |  [optional]
**shippingMethodOid** | **Integer** | Shipping method object identifier |  [optional]
**shippingMethodValidity** | [**ShippingMethodValidityEnum**](#ShippingMethodValidityEnum) | Shipping method validity |  [optional]
**shipsSeparately** | **Boolean** | Ships separately |  [optional]
**signatureRequired** | **Boolean** | Signature required |  [optional]


<a name="ShippingMethodValidityEnum"></a>
## Enum: ShippingMethodValidityEnum
Name | Value
---- | -----
INVALID_FOR | &quot;invalid for&quot;
VALID_FOR | &quot;valid for&quot;
VALID_ONLY_FOR | &quot;valid only for&quot;



