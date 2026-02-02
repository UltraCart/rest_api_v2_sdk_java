

# LibraryItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assets** | [**List&lt;LibraryItemAsset&gt;**](LibraryItemAsset.md) |  |  [optional] |
|**attributes** | [**List&lt;LibraryItemAttribute&gt;**](LibraryItemAttribute.md) |  |  [optional] |
|**categories** | **List&lt;String&gt;** |  |  [optional] |
|**content** | **String** |  |  [optional] |
|**contentType** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**industries** | **List&lt;String&gt;** |  |  [optional] |
|**libraryItemOid** | **Integer** |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**myPurchasedVersion** | **Integer** | If this is a public item and the merchant has already purchased it, this is their version.  If not yet purchased, this will be zero.  This value will only be populated during a searchPublicItems() call. |  [optional] |
|**originalObjectId** | **String** | This id points to the original object that was added to the library. For flows and campaigns, this is a uuid string.  For upsells, it is an oid integer.  For transactional_emails, it is an email name. |  [optional] |
|**price** | **BigDecimal** | The price of the published item.  Null for any private library items. |  [optional] |
|**priceFormatted** | **String** | The formatted price of the published item.  Null for any private library items. |  [optional] |
|**published** | **Boolean** | True if this library item is a published item (not source) |  [optional] |
|**publishedDts** | **Object** | The timestamp of the last published version |  [optional] |
|**publishedFromLibraryItemOid** | **Integer** | The source item used to publish this item.  This allows for comparisons between source and published |  [optional] |
|**publishedMeta** | [**LibraryItemPublishedMeta**](LibraryItemPublishedMeta.md) |  |  [optional] |
|**publishedVersion** | **Integer** | The source version when this item was published.  This allows for out-of-date alerts to be shown when there is a difference between source and published |  [optional] |
|**purchased** | **Boolean** | True if this library item has been purchased |  [optional] |
|**purchasedFromLibraryItemOid** | **Integer** | The published item that was purchased to make this item.  This allows for comparisons between published and purchased |  [optional] |
|**purchasedMeta** | [**LibraryItemPurchasedMeta**](LibraryItemPurchasedMeta.md) |  |  [optional] |
|**purchasedVersion** | **Integer** | The published version when this item was purchased.  This allows for out-of-date alerts to be shown when there is a difference between published and purchased |  [optional] |
|**rejected** | **Boolean** | Any published library reviewed by UltraCart staff for malicious or inappropriate content will have this flag set to true.  This is always false for non-published items |  [optional] |
|**rejectedReason** | **String** | Any rejected published item will have this field populated with the reason. |  [optional] |
|**releaseNotes** | **String** | Release notes specific to each published version and only appearing on public items. |  [optional] |
|**releaseVersion** | **Integer** | This counter records how many times a library item has been published.  This is used to show version history. |  [optional] |
|**reviewed** | **Boolean** | Any published library items must be reviewed by UltraCart staff for malicious content.  This flag shows the status of that review.  This is always false for non-published items |  [optional] |
|**reviewedDts** | **Object** | This is the timestamp for a published items formal review by UltraCart staff for malicious content. |  [optional] |
|**screenshots** | [**List&lt;LibraryItemScreenshot&gt;**](LibraryItemScreenshot.md) |  |  [optional] |
|**shareWithAccounts** | [**List&lt;LibraryItemAccount&gt;**](LibraryItemAccount.md) |  |  [optional] |
|**shareWithOtherEmails** | [**List&lt;LibraryItemEmail&gt;**](LibraryItemEmail.md) |  |  [optional] |
|**shared** | **Boolean** | True if this item is shared from another merchant account |  [optional] |
|**source** | **Boolean** | True if this library item has been published |  [optional] |
|**sourceToLibraryItemOid** | **Integer** | This oid points to the published library item, if there is one. |  [optional] |
|**sourceVersion** | **Integer** | The version of this item.  Increment every time the item is saved. |  [optional] |
|**style** | **String** |  |  [optional] |
|**timesPurchased** | **Integer** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**underReview** | **Boolean** | True if this library item was published but is awaiting review from UltraCart staff. |  [optional] |



