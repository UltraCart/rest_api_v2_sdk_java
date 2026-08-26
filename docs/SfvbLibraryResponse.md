

# SfvbLibraryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**facets** | [**List&lt;SfvbLibraryFacet&gt;**](SfvbLibraryFacet.md) | Available narrowing dimensions.  Send a chosen option back as facet_{name}&#x3D;{option}. |  [optional] |
|**firstResultNumber** | **Integer** | 1-indexed position of the first result on this page. |  [optional] |
|**lastResultNumber** | **Integer** | 1-indexed position of the last result on this page. |  [optional] |
|**results** | [**List&lt;SfvbLibraryEntry&gt;**](SfvbLibraryEntry.md) | Matching library entries, without their CJSON.  Fetch a single entry to get the fragment itself. |  [optional] |
|**totalPages** | **Integer** | Total pages available. |  [optional] |
|**totalResults** | **Integer** | Total matches across all pages. |  [optional] |



