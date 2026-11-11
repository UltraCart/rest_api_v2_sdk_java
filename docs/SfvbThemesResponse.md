

# SfvbThemesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activeThemeOid** | **Integer** | Oid of the active theme, repeated here so a caller does not have to scan the list. |  [optional] |
|**themeCount** | **Integer** | How many themes the storefront holds now.  When it equals theme_limit, delete an inactive theme in the admin before duplicating. |  [optional] |
|**themeLimit** | **Integer** | Most themes a storefront can hold, active and inactive together.  A duplicate or install at the limit is refused with sfvb.theme_limit_reached. |  [optional] |
|**themes** | [**List&lt;SfvbTheme&gt;**](SfvbTheme.md) | Themes belonging to the storefront.  Exactly one is flagged active. |  [optional] |



