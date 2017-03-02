
# ItemEbay

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | True if the item is active for listing |  [optional]
**categoryId** | **Integer** | e-Bay category ID |  [optional]
**categorySpecifics** | [**List&lt;ItemEbayCategorySpecific&gt;**](ItemEbayCategorySpecific.md) | Answers to category specific questions |  [optional]
**conditionDescription** | **String** | Description of the condition (e-Bay constant) |  [optional]
**conditionId** | **Integer** | Numerical ID of the condition (e-Bay constant) |  [optional]
**consecutiveFailures** | **Integer** | Number of consecutive failures trying to list this item |  [optional]
**customCategory1** | **Long** | e-Bay Store category 1 |  [optional]
**customCategory2** | **Long** | e-Bay Store category 2 |  [optional]
**dispatchTimeMax** | **Integer** | Maximum number of days it will take to ship the item |  [optional]
**domestic1AdditionalCost** | [**BigDecimal**](BigDecimal.md) | Domestic 1 method additional item cost |  [optional]
**domestic1FirstCost** | [**BigDecimal**](BigDecimal.md) | Domestic 1 method first item cost |  [optional]
**domestic2AdditionalCost** | [**BigDecimal**](BigDecimal.md) | Domestic 2 method additional item cost |  [optional]
**domestic2FirstCost** | [**BigDecimal**](BigDecimal.md) | Domestic 2 method first item cost |  [optional]
**domestic3AdditionalCost** | [**BigDecimal**](BigDecimal.md) | Domestic 3 method additional item cost |  [optional]
**domestic3FirstCost** | [**BigDecimal**](BigDecimal.md) | Domestic 3 method first item cost |  [optional]
**domestic4AdditionalCost** | [**BigDecimal**](BigDecimal.md) | Domestic 4 method additional item cost |  [optional]
**domestic4FirstCost** | [**BigDecimal**](BigDecimal.md) | Domestic 4 method first item cost |  [optional]
**ebayAuctionId** | **String** | If listed, this is the e-Bay auction id |  [optional]
**ebaySpecificInventory** | **Integer** | e-Bay specific inventory |  [optional]
**ebayTemplateName** | **String** | The template name to use hwen rendering the e-Bay listing |  [optional]
**ebayTemplateOid** | **Integer** | The template object identifier to use when rendering the e-Bay listing |  [optional]
**endTime** | **String** | Date/time of the auction end |  [optional]
**freeShipping** | **Boolean** | True if item receives free shipping |  [optional]
**freeShippingMethod** | **String** | The method that is free for free shipping |  [optional]
**international1AdditionalCost** | [**BigDecimal**](BigDecimal.md) | International 1 method additional item cost |  [optional]
**international1FirstCost** | [**BigDecimal**](BigDecimal.md) | International 1 method first item cost |  [optional]
**international2AdditionalCost** | [**BigDecimal**](BigDecimal.md) | International 2 method additional item cost |  [optional]
**international2FirstCost** | [**BigDecimal**](BigDecimal.md) | International 2 method first item cost |  [optional]
**international3AdditionalCost** | [**BigDecimal**](BigDecimal.md) | International 3 method additional item cost |  [optional]
**international3FirstCost** | [**BigDecimal**](BigDecimal.md) | International 3 method first item cost |  [optional]
**international4AdditionalCost** | [**BigDecimal**](BigDecimal.md) | International 4 method additional item cost |  [optional]
**international4FirstCost** | [**BigDecimal**](BigDecimal.md) | International 4 method first item cost |  [optional]
**lastStatusDts** | **String** | Date/time of the last status check |  [optional]
**listedDispatchTimeMax** | **Integer** | Current listing dispatch time maximum |  [optional]
**listedEbayTemplateOid** | **Integer** | The template object identifier used for the listing |  [optional]
**listingDts** | **String** | Date/time of the listing |  [optional]
**listingDuration** | **String** | The duration of the listing |  [optional]
**listingPrice** | [**BigDecimal**](BigDecimal.md) | Price to list the item at |  [optional]
**listingPriceOverride** | [**BigDecimal**](BigDecimal.md) | The price to list the item at if different than the regular UltraCart item price |  [optional]
**listingType** | [**ListingTypeEnum**](#ListingTypeEnum) | The type of e-Bay listing |  [optional]
**marketplaceAnalysis** | [**ItemEbayMarketPlaceAnalysis**](ItemEbayMarketPlaceAnalysis.md) |  |  [optional]
**marketplaceAnalysisPerform** | **Boolean** | True if marketplace analysis should be performed |  [optional]
**marketplaceFinalValueFeePercentage** | [**BigDecimal**](BigDecimal.md) | Marketplace FVF percentage |  [optional]
**marketplaceLastCheckDts** | **String** | Date/time of the marketplace analysis last check |  [optional]
**marketplaceLowest** | **Boolean** | True if we are the lowest offer in the marketplace |  [optional]
**marketplaceMapViolation** | **Boolean** | True if another seller is violating MAP |  [optional]
**marketplaceMultiplier** | [**BigDecimal**](BigDecimal.md) | Marketplace multiplier |  [optional]
**marketplaceOtherPrice** | [**BigDecimal**](BigDecimal.md) | Marketplace other price |  [optional]
**marketplaceOtherSeller** | **String** | Marketplace other seller |  [optional]
**marketplaceOtherShipping** | [**BigDecimal**](BigDecimal.md) | Marketplace other shipping |  [optional]
**marketplaceOtherTotal** | [**BigDecimal**](BigDecimal.md) | Marketplace other total |  [optional]
**marketplaceOurAdditionalProfitPotential** | [**BigDecimal**](BigDecimal.md) | Marketplace our additional profit potential |  [optional]
**marketplaceOurPrice** | [**BigDecimal**](BigDecimal.md) | Marketplace our price |  [optional]
**marketplaceOurProfit** | [**BigDecimal**](BigDecimal.md) | Marketplace our profit |  [optional]
**marketplaceOurShipping** | [**BigDecimal**](BigDecimal.md) | Marketplace our shipping |  [optional]
**marketplaceOurTotal** | [**BigDecimal**](BigDecimal.md) | Marketplace our total |  [optional]
**marketplaceOverhead** | [**BigDecimal**](BigDecimal.md) | Marketplace overhead |  [optional]
**marketplaceProfitable** | **Boolean** | True if our listing is profitable to sell |  [optional]
**nextAttemptDts** | **String** | Date/time for the next attempt to list |  [optional]
**nextListingDuration** | **String** | The next listing duration to use when the current listing ends. |  [optional]
**noPromotionalShipping** | **Boolean** | True if the item should not qualify for promotional shipping |  [optional]
**packagingHandlingCosts** | [**BigDecimal**](BigDecimal.md) | Packaging and handling costs |  [optional]
**previousEbayAuctionId** | **String** | Previous e-Bay auction id |  [optional]
**quantity** | **Integer** | Quantity available of the item |  [optional]
**reservePrice** | [**BigDecimal**](BigDecimal.md) | Reserve price |  [optional]
**sendDimensionsAndWeight** | **String** | How to send the item dimensions and weights to e-Bay |  [optional]
**startTime** | **String** | Date/time of the auction start |  [optional]
**status** | **String** | Status of the item&#39;s listing |  [optional]
**targetDispatchTimeMax** | **Integer** | Typical number of days it will take to ship the item |  [optional]


<a name="ListingTypeEnum"></a>
## Enum: ListingTypeEnum
Name | Value
---- | -----
 | &quot;&quot;
AUCTION | &quot;Auction&quot;
FIXED | &quot;Fixed&quot;
STORE | &quot;Store&quot;



