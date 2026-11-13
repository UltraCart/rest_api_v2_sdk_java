

# SfvbSearchFacetsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changedFacets** | **List&lt;String&gt;** | After a change, the facets it changed. |  [optional] |
|**costPricePoints** | **List&lt;Integer&gt;** | The Cost facet price breaks, smallest first. |  [optional] |
|**dryRun** | **Boolean** | True when nothing was saved. |  [optional] |
|**facets** | [**List&lt;SfvbSearchFacet&gt;**](SfvbSearchFacet.md) | Every facet the storefront can offer, in the fixed order shoppers see them. |  [optional] |
|**hashSha256** | **String** | Hash of the facets and price points.  Send it as If-Match on a change. |  [optional] |
|**pricePointsChanged** | **Boolean** | After a change, true when the price points changed. |  [optional] |
|**rebuild** | **String** | After a change, the search index rebuild it started.  none, quick (minutes, small catalogs), slow (the regular rebuild cycle) or failed (the change is saved but the rebuild could not be started; save again or contact support). |  [optional] |



