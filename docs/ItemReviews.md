
# ItemReviews

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasApprovedReview** | **Boolean** | True if the item has an approved review |  [optional]
**hasReview** | **Boolean** | True if the item has a review |  [optional]
**individualReviews** | [**List&lt;ItemReview&gt;**](ItemReview.md) |  |  [optional]
**reviewCount** | **Integer** | Number of approved reviews |  [optional]
**reviewOverall** | [**BigDecimal**](BigDecimal.md) | Overall score of reviews |  [optional]
**reviewTemplateName** | **String** | Review template name |  [optional]
**reviewTemplateOid** | **Integer** | Review template object identifier |  [optional]
**reviewable** | **Boolean** | True if the item is reviewable |  [optional]
**shareReviewsWithMerchantItemId** | **String** | Share reviews with item id.  To set, use the share_reviews_with_merchant_item_oid field. |  [optional]
**shareReviewsWithMerchantItemOid** | **Integer** | Share reviews with item oid.  To null out this field, set teh value to zero. |  [optional]



