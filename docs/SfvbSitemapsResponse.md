

# SfvbSitemapsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**host** | **String** | The host the sitemaps are built for. |  [optional] |
|**notes** | **List&lt;String&gt;** | What a person should know about these sitemaps, such as when they are rebuilt. |  [optional] |
|**preventIndexing** | **Boolean** | True when the storefront&#39;s Prevent Indexing setting is on.  The sitemaps are still served, but every page tells search engines not to index it. |  [optional] |
|**robotsTxt** | [**SfvbRobotsTxt**](SfvbRobotsTxt.md) |  |  [optional] |
|**sitemaps** | [**List&lt;SfvbSitemap&gt;**](SfvbSitemap.md) | The sitemaps that exist, sitemaps.org first.  Empty until the nightly build has run. |  [optional] |
|**storefrontOid** | **Integer** | The storefront. |  [optional] |



