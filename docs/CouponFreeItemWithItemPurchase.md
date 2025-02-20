
# CouponFreeItemWithItemPurchase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemTags** | **List&lt;String&gt;** | An optional list of item tags which will receive a discount of one of the required purchased items is purchased. |  [optional]
**items** | **List&lt;String&gt;** | A list of free items which will receive a discount if one of the required purchase items is purchased. |  [optional]
**limit** | **Integer** | The (optional) maximum quantity of discounted items. |  [optional]
**matchRequiredPurchaseItemToFreeItem** | **Boolean** | If true then the free item is matched 1:1 with the free item in the list. |  [optional]
**requiredPurchaseItems** | **List&lt;String&gt;** | Required items (at least one from the list) that must be purchased for coupon to be valid |  [optional]
**requiredPurchaseItemsTags** | **List&lt;String&gt;** | An optional list of item tags which are required to be purchased. |  [optional]



