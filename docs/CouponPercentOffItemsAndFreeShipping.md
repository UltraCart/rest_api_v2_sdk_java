
# CouponPercentOffItemsAndFreeShipping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountPercent** | [**BigDecimal**](BigDecimal.md) | The percentage of subtotal discount |  [optional]
**excludedItemTags** | **List&lt;String&gt;** | A list of item tags which cannot be discounted. |  [optional]
**excludedItems** | **List&lt;String&gt;** | A list of items which cannot be discounted. |  [optional]
**itemTags** | **List&lt;String&gt;** | An optional list of item tags which will receive a discount.  If blank, discount applies to all items except excluded items. |  [optional]
**items** | **List&lt;String&gt;** | An optional list of items which will receive a discount.  If blank, discount applies to all items except excluded items. |  [optional]
**shippingMethods** | **List&lt;String&gt;** | One or more shipping methods that may be used with this coupon.  If not specified or empty, methods that are marked as qualifies for free shipping will be the only free methods |  [optional]



