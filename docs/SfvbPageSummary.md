

# SfvbPageSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**childCount** | **Integer** | Number of pages directly under this one. |  [optional] |
|**excludeFromSitemap** | **Boolean** | True when the page is left out of the sitemap and marked noindex. |  [optional] |
|**groupTemplate** | **String** | Template file that renders the page itself, a bare .vm name found anywhere in the active theme. |  [optional] |
|**itemCount** | **Integer** | Number of items assigned to the page.  The catalog stops counting at its per-page item ceiling. |  [optional] |
|**itemTemplate** | **String** | Template file that renders the item pages under this page. |  [optional] |
|**pageType** | **String** | S for a static page, D for a dynamic one. |  [optional] |
|**parentPath** | **String** | Path of the page this one sits under.  Empty for the root page. |  [optional] |
|**path** | **String** | The page path, beginning and ending with a slash.  The root page is /. |  [optional] |
|**root** | **Boolean** | True for the storefront&#39;s home page. |  [optional] |
|**sortOrder** | **Integer** | Position among its siblings when the parent sorts child pages by a custom order. |  [optional] |
|**title** | **String** | The page title. |  [optional] |
|**usesSelectors** | **Boolean** | True when the page&#39;s items or blog posts are chosen by selectors rather than assigned by hand. |  [optional] |
|**visible** | **Boolean** | False when the page is hidden.  A hidden page answers 404 to shoppers. |  [optional] |
|**visibleDts** | **String** | When set, the page stays hidden until this time (ISO 8601, UTC). |  [optional] |



