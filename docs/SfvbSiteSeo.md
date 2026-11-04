

# SfvbSiteSeo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**approvalNeeded** | **Boolean** | On a change, true when it needs an approved site_seo.change request. |  [optional] |
|**canonical** | **Boolean** | True when pages output canonical links. |  [optional] |
|**changed** | **Boolean** | On a change, true when anything was saved, or would be on a dry run. |  [optional] |
|**changes** | [**List&lt;SfvbSiteSeoChange&gt;**](SfvbSiteSeoChange.md) | On a change, each switch it changed, or would change on a dry run. |  [optional] |
|**description** | **String** | The default meta description, the storefrontSEODescription site attribute. |  [optional] |
|**dryRun** | **Boolean** | True when nothing was saved because the request was a dry run. |  [optional] |
|**hashSha256** | **String** | The hash of the three switches.  Send it as If-Match on a change. |  [optional] |
|**keywords** | **String** | The default meta keywords, the storefrontSEOKeywords site attribute. |  [optional] |
|**notes** | **List&lt;String&gt;** | What a person should know about these settings. |  [optional] |
|**preventIndexing** | **Boolean** | True when every page tells search engines not to index it.  For a development store only. |  [optional] |
|**schemaOrg** | **Boolean** | True when pages output Schema.org structured data. |  [optional] |
|**storefrontOid** | **Integer** | The storefront. |  [optional] |



