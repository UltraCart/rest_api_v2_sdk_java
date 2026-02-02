
# CouponFreeItemWithItemPurchaseAndFreeShipping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List&lt;String&gt;** | A list of free items which will receive a discount if one of the required purchase items is purchased. |  [optional]
**limit** | **Integer** | The (optional) maximum quantity of discounted items.  Free shipping will apply to all units of the free item ids though. |  [optional]
**matchRequiredPurchaseItemToFreeItem** | **Boolean** | If true then the free item is matched 1:1 with the free item in the list. |  [optional]
**requiredPurchaseItems** | **List&lt;String&gt;** | Required items (at least one from the list) that must be purchased for coupon to be valid |  [optional]
**shippingMethods** | **List&lt;String&gt;** | One or more shipping methods that may be used with this coupon.  If not specified or empty, methods that are marked as qualifies for free shipping will be the only free methods |  [optional]



