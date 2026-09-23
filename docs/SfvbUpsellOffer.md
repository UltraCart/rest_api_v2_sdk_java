

# SfvbUpsellOffer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Whether the offer is switched on.  Setting it true, or changing an offer that is active overall, needs the sfvb_publish scope. |  [optional] |
|**activeOverall** | **Boolean** | Read only.  Whether the offer is active once its date window and daily pricing are taken into account.  This is the one that says whether shoppers are actually seeing it. |  [optional] |
|**addAccessoryItemIds** | **List&lt;String&gt;** | Accessory items added when the offer is accepted. |  [optional] |
|**adjustTriggerItemOption** | **String** | Option on the trigger item to adjust when the offer is accepted.  Omitted or null for none. |  [optional] |
|**allowUpsellItemInCartAlready** | **Boolean** | Whether to show the offer when the upsell item is already in the cart. |  [optional] |
|**arbitraryUnitCost** | **BigDecimal** | Price per unit when the offer is accepted.  Omitted or null to charge the item&#39;s own price. |  [optional] |
|**arbitraryUnitCostFriday** | **BigDecimal** | Price on Fridays, overriding arbitrary_unit_cost. |  [optional] |
|**arbitraryUnitCostMonday** | **BigDecimal** | Price on Mondays, overriding arbitrary_unit_cost.  Omitted or null for no override. |  [optional] |
|**arbitraryUnitCostSaturday** | **BigDecimal** | Price on Saturdays, overriding arbitrary_unit_cost. |  [optional] |
|**arbitraryUnitCostSunday** | **BigDecimal** | Price on Sundays, overriding arbitrary_unit_cost. |  [optional] |
|**arbitraryUnitCostThursday** | **BigDecimal** | Price on Thursdays, overriding arbitrary_unit_cost. |  [optional] |
|**arbitraryUnitCostTuesday** | **BigDecimal** | Price on Tuesdays, overriding arbitrary_unit_cost. |  [optional] |
|**arbitraryUnitCostWednesday** | **BigDecimal** | Price on Wednesdays, overriding arbitrary_unit_cost. |  [optional] |
|**cjsonSize** | **Integer** | Read only.  Size of the offer&#39;s container JSON in bytes.  A large value here alongside a low element count is the signature of a hand pasted HTML dump. |  [optional] |
|**endDate** | **String** | Last day the offer runs, as YYYY-MM-DD, inclusive.  Omitted or null for no end. |  [optional] |
|**everflowAdvertiserEventId** | **String** | Everflow advertiser event id recorded when the offer is accepted.  Omitted or null for none. |  [optional] |
|**firstTimeItem** | **Boolean** | Show only to shoppers who have not bought the upsell item before. |  [optional] |
|**firstTimeStore** | **Boolean** | Show only to shoppers buying from this store for the first time. |  [optional] |
|**freeShipping** | **Boolean** | Whether the upsell item ships free. |  [optional] |
|**hasContainer** | **Boolean** | Read only.  Whether a container has been authored for this offer. |  [optional] |
|**hasEverflowConfigured** | **Boolean** | Read only.  Whether the merchant has Everflow set up. |  [optional] |
|**hasLoyaltyConfigured** | **Boolean** | Read only.  Whether the merchant has loyalty set up, so the loyalty tier lists apply. |  [optional] |
|**hasTowerdataConfigured** | **Boolean** | Read only.  Whether the merchant has TowerData set up, so the age and gender lists apply. |  [optional] |
|**hashSha256** | **String** | Read only.  Hash of the offer&#39;s writable fields.  Send it in If-Match on an update. |  [optional] |
|**itemLogicSuppression** | [**SfvbUpsellItemLogic**](SfvbUpsellItemLogic.md) |  |  [optional] |
|**itemLogicTrigger** | [**SfvbUpsellItemLogic**](SfvbUpsellItemLogic.md) |  |  [optional] |
|**lockShipping** | **Boolean** | Whether the shipping method is locked once the offer is accepted. |  [optional] |
|**maxQuantity** | **Integer** | Most units a shopper can take.  Omitted or null for no limit. |  [optional] |
|**migrateAccessoryItemIdsFrom** | **List&lt;String&gt;** | Accessory items to migrate from, paired by position with migrate_accessory_item_ids_to. |  [optional] |
|**migrateAccessoryItemIdsTo** | **List&lt;String&gt;** | Accessory items to migrate to, paired by position with migrate_accessory_item_ids_from. |  [optional] |
|**name** | **String** | Offer name, at most 50 characters. |  [optional] |
|**offsiteContentUrl** | **String** | URL of offsite content shown instead of the container.  Omitted or null for none. |  [optional] |
|**outOfStockUpsellItemIds** | **List&lt;String&gt;** | Read only.  Upsell items that are out of stock now, so the offer would not be shown. |  [optional] |
|**pathName** | **String** | Read only.  Name of the upsell path this offer was last served on.  Written by checkout traffic, so it is empty until shoppers have seen the offer and can be stale.  Use referenced_by_path_oids for the configured answer. |  [optional] |
|**recordAsRegularItem** | **Boolean** | Whether the accepted item is recorded as a regular item rather than an upsell. |  [optional] |
|**referencedByPathOids** | **List&lt;Integer&gt;** | Read only.  The storefront&#39;s upsell paths whose steps use this offer, as an offer or a downsell. |  [optional] |
|**removableOnConfirmation** | **Boolean** | Whether the shopper can remove the accepted item on the confirmation step. |  [optional] |
|**removeAccessoryItemIds** | **List&lt;String&gt;** | Accessory items removed when the offer is accepted. |  [optional] |
|**removeTriggerItem** | **Boolean** | Whether accepting the offer removes the item that triggered it (a swap rather than an add). |  [optional] |
|**skipPreviousCustomers** | **Boolean** | Do not show to previous customers. |  [optional] |
|**startDate** | **String** | First day the offer runs, as YYYY-MM-DD.  Omitted or null for no start. |  [optional] |
|**stats** | [**SfvbUpsellStats**](SfvbUpsellStats.md) |  |  [optional] |
|**storefrontOid** | **Integer** | Read only.  Storefront oid. |  [optional] |
|**suppressLarge** | **Boolean** | Do not show on large screens. |  [optional] |
|**suppressMedium** | **Boolean** | Do not show on medium screens. |  [optional] |
|**suppressSmall** | **Boolean** | Do not show on small screens. |  [optional] |
|**suppressionCountryCodes** | **List&lt;String&gt;** | Shipping countries that stop the offer from showing. |  [optional] |
|**suppressionLoyaltyTierOids** | **List&lt;Integer&gt;** | Loyalty tiers that stop the offer from showing. |  [optional] |
|**suppressionPaymentMethods** | **List&lt;String&gt;** | Payment methods that stop the offer from showing. |  [optional] |
|**suppressionShippingMethods** | **List&lt;String&gt;** | Shipping methods that stop the offer from showing. |  [optional] |
|**suppressionStateCodes** | **List&lt;String&gt;** | Shipping states that stop the offer from showing. |  [optional] |
|**suppressionTags** | **List&lt;String&gt;** | Customer tags that stop the offer from showing. |  [optional] |
|**testOnly** | **Boolean** | Whether the offer is restricted to test traffic. |  [optional] |
|**triggerAges** | **List&lt;String&gt;** | TowerData age bands the offer is shown to.  18-20, 21-24, 25-34, 35-44, 45-54, 55-64, 65+ or Unknown. |  [optional] |
|**triggerCountryCodes** | **List&lt;String&gt;** | Shipping countries (ISO 3166 two letter codes) that trigger the offer. |  [optional] |
|**triggerGenders** | **List&lt;String&gt;** | TowerData genders the offer is shown to.  Male, Female or Unknown. |  [optional] |
|**triggerLoyaltyTierOids** | **List&lt;Integer&gt;** | Loyalty tiers that trigger the offer.  Each must be one of the merchant&#39;s loyalty tiers. |  [optional] |
|**triggerPaymentMethods** | **List&lt;String&gt;** | Payment methods that trigger the offer.  Each must be one of the merchant&#39;s payment methods. |  [optional] |
|**triggerShippingMethods** | **List&lt;String&gt;** | Shipping methods that trigger the offer.  Each must be one of the merchant&#39;s shipping methods. |  [optional] |
|**triggerStateCodes** | **List&lt;String&gt;** | Shipping states that trigger the offer. |  [optional] |
|**triggerTags** | **List&lt;String&gt;** | Customer tags that trigger the offer. |  [optional] |
|**upsellItemIdJavascript** | **String** | JavaScript that chooses the upsell item at runtime.  Omitted or null for none. |  [optional] |
|**upsellItemIds** | **List&lt;String&gt;** | The items offered.  Every item id must exist on the merchant account. |  [optional] |
|**upsellOfferOid** | **Integer** | Read only.  Upsell offer oid. |  [optional] |



