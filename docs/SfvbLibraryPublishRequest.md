

# SfvbLibraryPublishRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**releaseNotes** | **String** | What changed in this revision, at most 4000 characters.  Publish only. |  [optional] |
|**visibility** | [**VisibilityEnum**](#VisibilityEnum) | On publish, shared or public.  On unpublish, shared or private.  Public needs the library publisher property on the account. |  [optional] |



## Enum: VisibilityEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;private&quot; |
| SHARED | &quot;shared&quot; |
| PUBLIC | &quot;public&quot; |



