

# CouponDiscountItemWithItemPurchase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currencyCode** | **String** | The ISO-4217 three letter currency code the customer is viewing prices in |  [optional] |
|**discountItem** | **String** | The item that will be sold at the discount_price when required_purchase_item is purchased. |  [optional] |
|**discountItemTags** | **List&lt;String&gt;** | An optional list of item tags which will receive a discount of one of the required purchased items is purchased. |  [optional] |
|**discountPrice** | **BigDecimal** | The price (unit cost) of the discounted item |  [optional] |
|**limit** | **Integer** | The (optional) maximum quantity of discounted items. |  [optional] |
|**requiredPurchaseItem** | **String** | The item that must be purchased for the discount to be applied to the discount item. |  [optional] |
|**requiredPurchaseItemsTags** | **List&lt;String&gt;** | An optional list of item tags which are required to be purchased. |  [optional] |



