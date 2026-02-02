

# ApplyLibraryItemResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;LibraryItemAttribute&gt;**](LibraryItemAttribute.md) | Attributes from the library item |  [optional] |
|**cjson** | **String** | Cjson from library item, only populated if this library item was a cjson snippet or marketing email (not transactional) |  [optional] |
|**contentType** | **String** | flow, campaign, cjson, upsell, postcard, transactional_email or email |  [optional] |
|**emailTemplateVmPath** | **String** | If a marketing email was applied, this is the path to the template encapsulating the cjson.  This is needed for the UltraCart UI. |  [optional] |
|**error** | [**Error**](Error.md) |  |  [optional] |
|**metadata** | [**ResponseMetadata**](ResponseMetadata.md) |  |  [optional] |
|**storefrontOid** | **Integer** | StoreFront oid where content originates necessary for tracking down relative assets |  [optional] |
|**success** | **Boolean** | Indicates if API call was successful |  [optional] |
|**title** | **String** | title of library item, usually the name of the flow or campaign, or description of cjson |  [optional] |
|**uuid** | **String** | UUID of marketing email or communication flow/campaign if this library item was an email, campaign or flow |  [optional] |
|**warning** | [**Warning**](Warning.md) |  |  [optional] |



