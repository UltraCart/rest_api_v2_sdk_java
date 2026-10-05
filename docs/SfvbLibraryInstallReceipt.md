

# SfvbLibraryInstallReceipt


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cjson** | **String** | The fragment, with its file paths rewritten to where they were installed.  Ready to place. |  [optional] |
|**conflicts** | [**List&lt;SfvbLibraryInstallConflict&gt;**](SfvbLibraryInstallConflict.md) | Paths that already held a different file.  With on_conflict fail these refuse the install. |  [optional] |
|**contentManifest** | [**SfvbLibraryContentManifest**](SfvbLibraryContentManifest.md) |  |  [optional] |
|**filesSkipped** | **List&lt;String&gt;** | Paths not written, because an identical or chosen existing file was kept, or the file could not be fetched. |  [optional] |
|**filesWritten** | **List&lt;String&gt;** | Storefront paths this install wrote. |  [optional] |
|**libraryOid** | **Integer** | The entry. |  [optional] |
|**revisionNumber** | **Integer** | The revision installed. |  [optional] |
|**unresolvedParameters** | **List&lt;String&gt;** | Required parameters with no default.  Replace them in the cjson before placing it. |  [optional] |



