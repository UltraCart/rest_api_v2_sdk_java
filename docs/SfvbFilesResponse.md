

# SfvbFilesResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**files** | [**List&lt;SfvbFileEntry&gt;**](SfvbFileEntry.md) | Directories first, then files, each sorted by name. |  [optional] |
|**fsDirectoryOid** | **Integer** | Oid of the directory that was listed. |  [optional] |
|**omittedCount** | **Integer** | Number of entries omitted when truncated is true. |  [optional] |
|**parentFsDirectoryOid** | **Integer** | Oid of the parent directory, or zero at the root. |  [optional] |
|**path** | **String** | Path that was listed. |  [optional] |
|**truncated** | **Boolean** | True when the listing was capped.  Never truncated silently. |  [optional] |



