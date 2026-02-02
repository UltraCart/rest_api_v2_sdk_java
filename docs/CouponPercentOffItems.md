
# CouponPercentOffItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountPercent** | [**BigDecimal**](BigDecimal.md) | The percentage of subtotal discount |  [optional]
**excludedItemTags** | **List&lt;String&gt;** | A list of item tags which cannot be discounted. |  [optional]
**excludedItems** | **List&lt;String&gt;** | A list of items which cannot be discounted. |  [optional]
**itemTags** | **List&lt;String&gt;** | An optional list of item tags which will receive a discount.  If blank, discount applies to all items except excluded items. |  [optional]
**items** | **List&lt;String&gt;** | An optional list of items which will receive a discount.  If blank, discount applies to all items except excluded items. |  [optional]
**limit** | **Integer** | The (optional) maximum quantity of discounted items. |  [optional]



