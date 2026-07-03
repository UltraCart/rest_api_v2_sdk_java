

# CouponAmountOffItemsAndFreeShipping


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currencyCode** | **String** | The ISO-4217 three letter currency code the customer is viewing prices in |  [optional] |
|**discountAmount** | **BigDecimal** | The amount of discount |  [optional] |
|**itemTags** | **List&lt;String&gt;** | An optional list of item tags which will receive a discount. |  [optional] |
|**items** | **List&lt;String&gt;** | A list of items which are eligible for the discount amount. |  [optional] |
|**limit** | **Integer** | The limit of items which are eligible for the discount amount. |  [optional] |
|**shippingMethods** | **List&lt;String&gt;** | One or more shipping methods that may be used with this coupon.  If not specified or empty, methods that are marked as qualifies for free shipping will be the only free methods |  [optional] |



