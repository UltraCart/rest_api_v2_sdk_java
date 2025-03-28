

# Coupon


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**affiliateOid** | **Integer** | Associates an order with an affiliate when this value is set. |  [optional] |
|**allowMultipleOneTimeCodes** | **Boolean** | True if multiple one time codes for this coupon can be used on a cart at the same time. |  [optional] |
|**amountOffItems** | [**CouponAmountOffItems**](CouponAmountOffItems.md) |  |  [optional] |
|**amountOffShipping** | [**CouponAmountOffShipping**](CouponAmountOffShipping.md) |  |  [optional] |
|**amountOffShippingWithItemsPurchase** | [**CouponAmountOffShippingWithItemsPurchase**](CouponAmountOffShippingWithItemsPurchase.md) |  |  [optional] |
|**amountOffSubtotal** | [**CouponAmountOffSubtotal**](CouponAmountOffSubtotal.md) |  |  [optional] |
|**amountOffSubtotalAndFreeShipping** | [**CouponAmountOffSubtotalFreeShippingWithPurchase**](CouponAmountOffSubtotalFreeShippingWithPurchase.md) |  |  [optional] |
|**amountOffSubtotalAndShipping** | [**CouponAmountOffSubtotalAndShipping**](CouponAmountOffSubtotalAndShipping.md) |  |  [optional] |
|**amountOffSubtotalWithBlockPurchase** | [**CouponAmountOffSubtotalWithBlockPurchase**](CouponAmountOffSubtotalWithBlockPurchase.md) |  |  [optional] |
|**amountOffSubtotalWithItemsPurchase** | [**CouponAmountOffSubtotalWithItemsPurchase**](CouponAmountOffSubtotalWithItemsPurchase.md) |  |  [optional] |
|**amountOffSubtotalWithPurchase** | [**CouponAmountOffSubtotalWithPurchase**](CouponAmountOffSubtotalWithPurchase.md) |  |  [optional] |
|**amountShippingWithSubtotal** | [**CouponAmountShippingWithSubtotal**](CouponAmountShippingWithSubtotal.md) |  |  [optional] |
|**automaticallyApplyCouponCodes** | [**CouponAutomaticallyApplyCouponCodes**](CouponAutomaticallyApplyCouponCodes.md) |  |  [optional] |
|**buyOneGetOne** | [**CouponBuyOneGetOneLimit**](CouponBuyOneGetOneLimit.md) |  |  [optional] |
|**calculatedDescription** | **String** | Calculated description displayed to the customer if no description is specified. |  [optional] |
|**canBeUsedWithOtherCoupons** | **Boolean** | True if this coupon can be used with other coupons in a single order. |  [optional] |
|**couponOid** | **Integer** | Coupon oid. |  [optional] |
|**couponType** | **String** | Coupon type. |  [optional] |
|**description** | **String** | Description of the coupon up to 50 characters. |  [optional] |
|**discountItemWithItemPurchase** | [**CouponDiscountItemWithItemPurchase**](CouponDiscountItemWithItemPurchase.md) |  |  [optional] |
|**discountItems** | [**CouponDiscountItems**](CouponDiscountItems.md) |  |  [optional] |
|**expirationDts** | **String** | Date/time when coupon expires |  [optional] |
|**freeItemAndShippingWithSubtotal** | [**CouponFreeItemAndShippingWithSubtotal**](CouponFreeItemAndShippingWithSubtotal.md) |  |  [optional] |
|**freeItemWithItemPurchase** | [**CouponFreeItemWithItemPurchase**](CouponFreeItemWithItemPurchase.md) |  |  [optional] |
|**freeItemWithItemPurchaseAndFreeShipping** | [**CouponFreeItemWithItemPurchaseAndFreeShipping**](CouponFreeItemWithItemPurchaseAndFreeShipping.md) |  |  [optional] |
|**freeItemWithSubtotal** | [**CouponFreeItemWithSubtotal**](CouponFreeItemWithSubtotal.md) |  |  [optional] |
|**freeItemsWithItemPurchase** | [**CouponFreeItemsWithItemPurchase**](CouponFreeItemsWithItemPurchase.md) |  |  [optional] |
|**freeItemsWithMixmatchPurchase** | [**CouponFreeItemsWithMixMatchPurchase**](CouponFreeItemsWithMixMatchPurchase.md) |  |  [optional] |
|**freeShipping** | [**CouponFreeShipping**](CouponFreeShipping.md) |  |  [optional] |
|**freeShippingSpecificItems** | [**CouponFreeShippingSpecificItems**](CouponFreeShippingSpecificItems.md) |  |  [optional] |
|**freeShippingWithItemsPurchase** | [**CouponFreeShippingWithItemsPurchase**](CouponFreeShippingWithItemsPurchase.md) |  |  [optional] |
|**freeShippingWithSubtotal** | [**CouponFreeShippingWithSubtotal**](CouponFreeShippingWithSubtotal.md) |  |  [optional] |
|**hideFromCustomer** | **Boolean** | Hide coupon from customer during checkout.  Often used when coupons are automatic discounting mechanisms. |  [optional] |
|**merchantCode** | **String** | Merchant code of coupon up to 20 characters. |  [optional] |
|**merchantNotes** | **String** | Internal notes about this coupon.  These are not visible to customer. |  [optional] |
|**moreLoyaltyCashback** | [**CouponMoreLoyaltyCashback**](CouponMoreLoyaltyCashback.md) |  |  [optional] |
|**moreLoyaltyPoints** | [**CouponMoreLoyaltyPoints**](CouponMoreLoyaltyPoints.md) |  |  [optional] |
|**multipleAmountsOffItems** | [**CouponMultipleAmountsOffItems**](CouponMultipleAmountsOffItems.md) |  |  [optional] |
|**noDiscount** | [**CouponNoDiscount**](CouponNoDiscount.md) |  |  [optional] |
|**percentMoreLoyaltyCashback** | [**CouponPercentMoreLoyaltyCashback**](CouponPercentMoreLoyaltyCashback.md) |  |  [optional] |
|**percentMoreLoyaltyPoints** | [**CouponPercentMoreLoyaltyPoints**](CouponPercentMoreLoyaltyPoints.md) |  |  [optional] |
|**percentOffItemWithItemsQuantityPurchase** | [**CouponPercentOffItemWithItemsQuantityPurchase**](CouponPercentOffItemWithItemsQuantityPurchase.md) |  |  [optional] |
|**percentOffItems** | [**CouponPercentOffItems**](CouponPercentOffItems.md) |  |  [optional] |
|**percentOffItemsAndFreeShipping** | [**CouponPercentOffItemsAndFreeShipping**](CouponPercentOffItemsAndFreeShipping.md) |  |  [optional] |
|**percentOffItemsWithItemsPurchase** | [**CouponPercentOffItemsWithItemsPurchase**](CouponPercentOffItemsWithItemsPurchase.md) |  |  [optional] |
|**percentOffMsrpItems** | [**CouponPercentOffMsrpItems**](CouponPercentOffMsrpItems.md) |  |  [optional] |
|**percentOffRetailPriceItems** | [**CouponPercentOffRetailPriceItems**](CouponPercentOffRetailPriceItems.md) |  |  [optional] |
|**percentOffShipping** | [**CouponPercentOffShipping**](CouponPercentOffShipping.md) |  |  [optional] |
|**percentOffSubtotal** | [**CouponPercentOffSubtotal**](CouponPercentOffSubtotal.md) |  |  [optional] |
|**percentOffSubtotalAndFreeShipping** | [**CouponPercentOffSubtotalAndFreeShipping**](CouponPercentOffSubtotalAndFreeShipping.md) |  |  [optional] |
|**percentOffSubtotalLimit** | [**CouponPercentOffSubtotalLimit**](CouponPercentOffSubtotalLimit.md) |  |  [optional] |
|**percentOffSubtotalWithItemsPurchase** | [**CouponPercentOffSubtotalWithItemsPurchase**](CouponPercentOffSubtotalWithItemsPurchase.md) |  |  [optional] |
|**percentOffSubtotalWithSubtotal** | [**CouponPercentOffSubtotalWithSubtotal**](CouponPercentOffSubtotalWithSubtotal.md) |  |  [optional] |
|**quickbooksCode** | **String** | Quickbooks accounting code. |  [optional] |
|**restrictByPostalCodes** | **List&lt;String&gt;** | Optional list of postal codes which restrict a coupon to within these postal codes. |  [optional] |
|**restrictByScreenBrandingThemeCodes** | [**List&lt;CouponRestriction&gt;**](CouponRestriction.md) | Optional list of legacy screen branding theme codes to limit coupon use to only those themes. |  [optional] |
|**restrictByStorefronts** | [**List&lt;CouponRestriction&gt;**](CouponRestriction.md) | Optional list of storefronts to limit coupon use to only those storefronts. |  [optional] |
|**skipOnRebill** | **Boolean** | Skip this coupon when it is on a rebill of an auto order. |  [optional] |
|**startDts** | **String** | Date/time when coupon is valid |  [optional] |
|**superCoupon** | **Boolean** | If true, this coupon can be used with ANY other coupon regardless of the other coupons configuration |  [optional] |
|**tieredAmountOffItems** | [**CouponTieredAmountOffItems**](CouponTieredAmountOffItems.md) |  |  [optional] |
|**tieredAmountOffSubtotal** | [**CouponTieredAmountOffSubtotal**](CouponTieredAmountOffSubtotal.md) |  |  [optional] |
|**tieredPercentOffItems** | [**CouponTieredPercentOffItems**](CouponTieredPercentOffItems.md) |  |  [optional] |
|**tieredPercentOffShipping** | [**CouponTieredPercentOffShipping**](CouponTieredPercentOffShipping.md) |  |  [optional] |
|**tieredPercentOffSubtotal** | [**CouponTieredPercentOffSubtotal**](CouponTieredPercentOffSubtotal.md) |  |  [optional] |
|**tieredPercentOffSubtotalBasedOnMsrp** | [**CouponTieredPercentOffSubtotalBasedOnMSRP**](CouponTieredPercentOffSubtotalBasedOnMSRP.md) |  |  [optional] |
|**usableBy** | [**UsableByEnum**](#UsableByEnum) | Who may use this coupon. |  [optional] |



## Enum: UsableByEnum

| Name | Value |
|---- | -----|
| ANYONE | &quot;Anyone&quot; |
| UNIQUECODE | &quot;UniqueCode&quot; |
| ONCEPERCUSTOMER | &quot;OncePerCustomer&quot; |
| ONCEPERNEWCUSTOMER | &quot;OncePerNewCustomer&quot; |
| ONCEPERNEWCUSTOMERFORITEM | &quot;OncePerNewCustomerForItem&quot; |



