

# AddLibraryItemRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;LibraryItemAttribute&gt;**](LibraryItemAttribute.md) | Attributes associated with the library item to contain additional configuration. |  [optional] |
|**cjson** | **String** | Cjson to be added to library |  [optional] |
|**contentType** | **String** | flow, campaign, cjson, email, transactional_email, postcard or upsell |  [optional] |
|**description** | **String** | description of library item |  [optional] |
|**emailName** | **String** | Required if content_type is transactional_email. This is the name of the email template (html, not text).  This name should have a .vm file extension.  An example is auto_order_cancel_html.vm |  [optional] |
|**emailPath** | **String** | Required if content_type is transactional_email. This is the full path to the email template stored in the file system.  This defines which StoreFront contains the desired email template.  An example is /themes/Elements/core/emails/auto_order_cancel_html.vm |  [optional] |
|**screenshots** | [**List&lt;LibraryItemScreenshot&gt;**](LibraryItemScreenshot.md) | Screenshot urls for display |  [optional] |
|**storefrontOid** | **Integer** | StoreFront oid where content originates necessary for tracking down relative assets |  [optional] |
|**title** | **String** | title of library item, usually the name of the flow or campaign, or description of cjson |  [optional] |
|**upsellOfferOid** | **Integer** | Required if content_type is upsell. This is object identifier of a StoreFront Upsell Offer. |  [optional] |
|**uuid** | **String** | UUID of communication flow, campaign, email, postcard, or null if this item is something else. transactional_email do not have a uuid because they are singleton objects within a storefront and easily identifiable by name |  [optional] |



