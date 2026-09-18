

# SfvbPageCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The page description, for templates that show one. |  [optional] |
|**excludeFromSitemap** | **Boolean** | Leave the page out of the sitemap and mark it noindex.  Usual for ad landing pages. |  [optional] |
|**groupTemplate** | **String** | Template that renders the page, a name from the template list.  When omitted the page inherits its parent&#39;s templates, or catalog_group.vm directly under the root. |  [optional] |
|**itemTemplate** | **String** | Template that renders the item pages under this page.  Inherited or defaulted like group_template. |  [optional] |
|**pageType** | **String** | S for a static page, D for a dynamic one.  Defaults to D, as in the admin. |  [optional] |
|**path** | **String** | Path of the new page, for example /lp/spring-sale/.  The parent page must already exist, and the last part may only contain letters, digits, hyphens and underscores. |  [optional] |
|**title** | **String** | The page title. |  [optional] |
|**visible** | **Boolean** | False creates the page hidden, so it answers 404 to shoppers until it is shown. |  [optional] |
|**visibleDts** | **String** | Keep the page hidden until this time (ISO 8601). |  [optional] |



