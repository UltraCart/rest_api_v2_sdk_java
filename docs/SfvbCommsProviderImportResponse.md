

# SfvbCommsProviderImportResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | True when nothing was imported. |  [optional] |
|**lists** | [**List&lt;SfvbCommsProviderList&gt;**](SfvbCommsProviderList.md) | The lists imported, each into a new list of the same name. |  [optional] |
|**notes** | **List&lt;String&gt;** | What the import does. |  [optional] |
|**provider** | **String** | The provider. |  [optional] |
|**queued** | **Boolean** | True when the import was started.  It runs in the background and emails the signed-in user when done. |  [optional] |



