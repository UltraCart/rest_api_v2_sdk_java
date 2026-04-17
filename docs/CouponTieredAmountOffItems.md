

# CouponTieredAmountOffItems


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemTags** | **List&lt;String&gt;** | An optional list of item tags which will receive a discount.  If blank, discount applies to all items except excluded items. |  [optional] |
|**items** | **List&lt;String&gt;** | The items being discounted by this coupon. |  [optional] |
|**limit** | **BigDecimal** | The maximum number of discounted items. |  [optional] |
|**tiers** | [**List&lt;CouponTierQuantityAmount&gt;**](CouponTierQuantityAmount.md) | A list of discount tiers. |  [optional] |



