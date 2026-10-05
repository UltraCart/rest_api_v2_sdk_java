

# SfvbLibraryInstallRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**acknowledgeExecutable** | **Boolean** | Must be true to install an entry whose content_manifest lists executable content.  Read the manifest first. |  [optional] |
|**onConflict** | [**OnConflictEnum**](#OnConflictEnum) | What to do when a file the entry installs already exists with different content.  fail refuses and writes nothing, skip keeps the existing file, overwrite replaces it. |  [optional] |
|**revisionNumber** | **Integer** | A published revision to install.  Defaults to the latest one, or the draft for the owner. |  [optional] |



## Enum: OnConflictEnum

| Name | Value |
|---- | -----|
| FAIL | &quot;fail&quot; |
| SKIP | &quot;skip&quot; |
| OVERWRITE | &quot;overwrite&quot; |



