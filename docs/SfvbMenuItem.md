

# SfvbMenuItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogGroupOid** | **Integer** | The catalog group page_path resolved to.  Returned for reference and ignored on a write - send page_path, which is the identifier the rest of this API uses. |  [optional] |
|**description** | **String** | The link text, and the only field every type needs.  Required. |  [optional] |
|**items** | [**List&lt;SfvbMenuItem&gt;**](SfvbMenuItem.md) | This entry&#39;s sub menu, in the order it renders.  Omit or send an empty array for a leaf. |  [optional] |
|**merchantItemId** | **String** | The item an item entry opens, by merchant item id rather than by oid. |  [optional] |
|**openInNewWindow** | **Boolean** | True to open the link in a new window or tab. |  [optional] |
|**pagePath** | **String** | The page a page entry opens, normalized to begin and end with a slash.  This is the same path the pages endpoints take.  Sent on a write and returned on a read. |  [optional] |
|**socialPageType** | [**SocialPageTypeEnum**](#SocialPageTypeEnum) | Which social network a social entry opens.  The URL comes from the storefront&#39;s social settings. |  [optional] |
|**systemPageType** | [**SystemPageTypeEnum**](#SystemPageTypeEnum) | Which built in page a system page entry opens.  The storefront resolves the URL, so these keep working when the checkout or account paths change. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | What the entry points at, which decides which one of the other fields is required.  custom needs url, item needs merchant_item_id, page needs page_path, social needs social_page_type, and system page needs system_page_type.  The legacy spelling group is accepted and stored as page. |  [optional] |
|**url** | **String** | Where a custom entry goes.  Any URL the storefront can link to, absolute or site relative. |  [optional] |



## Enum: SocialPageTypeEnum

| Name | Value |
|---- | -----|
| TWITTER | &quot;Twitter&quot; |
| FACEBOOK | &quot;Facebook&quot; |
| INSTAGRAM | &quot;Instagram&quot; |
| LINKEDIN | &quot;LinkedIn&quot; |
| PINTEREST | &quot;Pinterest&quot; |
| TUMBLR | &quot;Tumblr&quot; |
| YOUTUBE | &quot;YouTube&quot; |



## Enum: SystemPageTypeEnum

| Name | Value |
|---- | -----|
| ACCESS_ACCOUNT | &quot;Access Account&quot; |
| ACCOUNT_LOGIN | &quot;Account Login&quot; |
| ACCOUNT_LOGOUT | &quot;Account Logout&quot; |
| AFFILIATE_LOGIN | &quot;Affiliate Login&quot; |
| AFFILIATE_SIGNUP | &quot;Affiliate Signup&quot; |
| CHANGE_PASSWORD | &quot;Change Password&quot; |
| MY_ACCOUNT_MAIN_PAGE | &quot;My Account Main Page&quot; |
| MY_ACCOUNT_ORDERS | &quot;My Account Orders&quot; |
| MY_ACCOUNT_REVIEWS | &quot;My Account Reviews&quot; |
| MY_ACCOUNT_SETTINGS | &quot;My Account Settings&quot; |
| MY_ACCOUNT_LOYALTY | &quot;My Account Loyalty&quot; |
| SEARCH | &quot;Search&quot; |
| SINGLE_PAGE_CHECKOUT | &quot;Single Page Checkout&quot; |
| VIEW_CART | &quot;View Cart&quot; |
| WHOLESALE_SIGNUP | &quot;Wholesale Signup&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CUSTOM | &quot;custom&quot; |
| ITEM | &quot;item&quot; |
| PAGE | &quot;page&quot; |
| SOCIAL | &quot;social&quot; |
| SYSTEM_PAGE | &quot;system page&quot; |



