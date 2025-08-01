

# Item


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accounting** | [**ItemAccounting**](ItemAccounting.md) |  |  [optional] |
|**amember** | [**ItemAmember**](ItemAmember.md) |  |  [optional] |
|**autoOrder** | [**ItemAutoOrder**](ItemAutoOrder.md) |  |  [optional] |
|**ccbill** | [**ItemCCBill**](ItemCCBill.md) |  |  [optional] |
|**channelPartnerItemMappings** | [**List&lt;ItemChannelPartnerMapping&gt;**](ItemChannelPartnerMapping.md) | Channel Partner Item Mapping |  [optional] |
|**chargeback** | [**ItemChargeback**](ItemChargeback.md) |  |  [optional] |
|**checkout** | [**ItemCheckout**](ItemCheckout.md) |  |  [optional] |
|**content** | [**ItemContent**](ItemContent.md) |  |  [optional] |
|**creationDts** | **String** | Date/time of creation |  [optional] |
|**description** | **String** | Description of the item up to 500 characters. |  [optional] |
|**descriptionTranslatedTextInstanceOid** | **Integer** | Description translated text instance id |  [optional] |
|**digitalDelivery** | [**ItemDigitalDelivery**](ItemDigitalDelivery.md) |  |  [optional] |
|**ebay** | [**ItemEbay**](ItemEbay.md) |  |  [optional] |
|**emailNotifications** | [**ItemEmailNotifications**](ItemEmailNotifications.md) |  |  [optional] |
|**enrollment123** | [**ItemEnrollment123**](ItemEnrollment123.md) |  |  [optional] |
|**fulfillmentAddons** | [**List&lt;ItemFulfillmentAddon&gt;**](ItemFulfillmentAddon.md) | Fulfillment Add-ons |  [optional] |
|**giftCertificate** | [**ItemGiftCertificate**](ItemGiftCertificate.md) |  |  [optional] |
|**googleProductSearch** | [**ItemGoogleProductSearch**](ItemGoogleProductSearch.md) |  |  [optional] |
|**identifiers** | [**ItemIdentifiers**](ItemIdentifiers.md) |  |  [optional] |
|**inactive** | **Boolean** | True if this item is inactive and can not be purchased |  [optional] |
|**instantPaymentNotifications** | [**ItemInstantPaymentNotifications**](ItemInstantPaymentNotifications.md) |  |  [optional] |
|**internal** | [**ItemInternal**](ItemInternal.md) |  |  [optional] |
|**kit** | **Boolean** | True if this item is a kit |  [optional] |
|**kitComponentOnly** | **Boolean** | True if this item can only be usd as a kit component |  [optional] |
|**kitDefinition** | [**ItemKitDefinition**](ItemKitDefinition.md) |  |  [optional] |
|**lastModifiedDts** | **String** | Date/time of last modification |  [optional] |
|**merchantId** | **String** | UltraCart merchant ID owning item |  [optional] |
|**merchantItemId** | **String** | Unique item id assigned to this item |  [optional] |
|**merchantItemOid** | **Integer** | Unique object identifier for this item |  [optional] |
|**options** | [**List&lt;ItemOption&gt;**](ItemOption.md) | Options |  [optional] |
|**parentCategoryId** | **Integer** | Parent category of the item.  Zero indicates the root folder. |  [optional] |
|**parentCategoryPath** | **String** | Parent category path.  / indicates the root folder.  This is the folder structure within item management. |  [optional] |
|**paymentProcessing** | [**ItemPaymentProcessing**](ItemPaymentProcessing.md) |  |  [optional] |
|**physical** | [**ItemPhysical**](ItemPhysical.md) |  |  [optional] |
|**pricing** | [**ItemPricing**](ItemPricing.md) |  |  [optional] |
|**properties** | [**List&lt;ItemProperty&gt;**](ItemProperty.md) | Properties |  [optional] |
|**realtimePricing** | [**ItemRealtimePricing**](ItemRealtimePricing.md) |  |  [optional] |
|**recommendReplenishmentDays** | **Integer** | Number of days to recommend replenishment after.  Null is not configured.  Set to zero to disable. |  [optional] |
|**related** | [**ItemRelated**](ItemRelated.md) |  |  [optional] |
|**reporting** | [**ItemReporting**](ItemReporting.md) |  |  [optional] |
|**restriction** | [**ItemRestriction**](ItemRestriction.md) |  |  [optional] |
|**revguard** | [**ItemRevguard**](ItemRevguard.md) |  |  [optional] |
|**reviews** | [**ItemReviews**](ItemReviews.md) |  |  [optional] |
|**salesforce** | [**ItemSalesforce**](ItemSalesforce.md) |  |  [optional] |
|**shipping** | [**ItemShipping**](ItemShipping.md) |  |  [optional] |
|**tags** | [**ItemTags**](ItemTags.md) |  |  [optional] |
|**tax** | [**ItemTax**](ItemTax.md) |  |  [optional] |
|**thirdPartyEmailMarketing** | [**List&lt;ItemThirdPartyEmailMarketing&gt;**](ItemThirdPartyEmailMarketing.md) | 3rd Party Email Marketing |  [optional] |
|**variantItems** | [**List&lt;ItemVariantItem&gt;**](ItemVariantItem.md) | Variant Items |  [optional] |
|**variations** | [**List&lt;ItemVariation&gt;**](ItemVariation.md) | Variations |  [optional] |
|**wishlistMember** | [**ItemWishlistMember**](ItemWishlistMember.md) |  |  [optional] |



