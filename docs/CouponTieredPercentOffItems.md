
# CouponTieredPercentOffItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemTags** | **List&lt;String&gt;** | An optional list of item tags which will receive a discount.  If blank, discount applies to all items except excluded items. |  [optional]
**items** | **List&lt;String&gt;** | A list of items of which at least one must be purchased for coupon to be valid. |  [optional]
**limit** | [**BigDecimal**](BigDecimal.md) | The (optional) maximum quantity of discounted items. |  [optional]
**tiers** | [**List&lt;CouponTierQuantityPercent&gt;**](CouponTierQuantityPercent.md) | A list of discount tiers. |  [optional]



