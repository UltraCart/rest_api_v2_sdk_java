

# SfvbCodeLibraryEmailResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | **Boolean** | On a save, true when this request made the item and false when an earlier save with the same uuid had, in which case nothing changed.  Absent on a read. |  [optional] |
|**email** | [**SfvbCodeLibraryEmailDetail**](SfvbCodeLibraryEmailDetail.md) |  |  [optional] |
|**filesSkipped** | [**List&lt;SfvbCodeLibraryFileSkipped&gt;**](SfvbCodeLibraryFileSkipped.md) | On a save, the files the body names that the item does not carry, each with the reason.  Absent on a read. |  [optional] |
|**notes** | **List&lt;String&gt;** | Plain sentences about the save, for example executable elements or absolute file URLs in the body. |  [optional] |



