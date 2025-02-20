
# CouponPercentOffItemWithItemsQuantityPurchase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discountPercent** | [**BigDecimal**](BigDecimal.md) | The percentage of subtotal discount |  [optional]
**itemTags** | **List&lt;String&gt;** | An optional list of item tags which will receive a discount if one of the required purchased items is purchased. |  [optional]
**items** | **List&lt;String&gt;** | A list of items which will receive a discount if one of the required purchase items is purchased. |  [optional]
**limit** | **Integer** | The (optional) maximum quantity of discounted items. |  [optional]
**requiredPurchaseItems** | **List&lt;String&gt;** | Required items (at least one from the list) that must be purchased for coupon to be valid |  [optional]
**requiredPurchaseItemsTags** | **List&lt;String&gt;** | Required item tags (at least one from the list) that must be purchase for coupon to be valid. |  [optional]
**requiredPurchaseQuantity** | **Integer** | The quantity of items that must be purchased for the discount to be applied. |  [optional]



