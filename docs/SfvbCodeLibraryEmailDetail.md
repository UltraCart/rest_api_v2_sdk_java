

# SfvbCodeLibraryEmailDetail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerCjson** | **String** | The item&#39;s body as stored.  Starting a new email from it gives its elements new ids. |  [optional] |
|**description** | **String** | The item&#39;s description. |  [optional] |
|**files** | [**List&lt;SfvbCodeLibraryFile&gt;**](SfvbCodeLibraryFile.md) | The image files the item carries, without their contents. |  [optional] |
|**libraryItemOid** | **Integer** | The item, to send as library_item_oid on the step insert. |  [optional] |
|**previewText** | **String** | The preview text a new email takes from the item, or null when it has none. |  [optional] |
|**source** | **String** | owned (this account&#39;s own), shared (shared with this account) or public (published and approved by UltraCart). |  [optional] |
|**subject** | **String** | The subject a new email takes from the item, or null when it has none. |  [optional] |
|**title** | **String** | The item&#39;s title. |  [optional] |



