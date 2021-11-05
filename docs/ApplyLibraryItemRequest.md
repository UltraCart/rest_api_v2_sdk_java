
# ApplyLibraryItemRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailUuid** | **String** | Normal emails are applied to an existing email object, so when requesting a library item to be applied to an email, supply the email uuid.  This is only for normal emails.  Transactional emails do not have a uuid. |  [optional]
**libraryItemOid** | **Integer** | Library item oid that you wish to apply to the given StoreFront |  [optional]
**postcardUuid** | **String** | The postcard uuid you wish to apply to a given StoreFront. |  [optional]
**storefrontOid** | **Integer** | StoreFront oid where content originates necessary for tracking down relative assets |  [optional]



