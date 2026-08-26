

# SfvbVersionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerManagerVersion** | **String** | Container manager version used to compile for this merchant. |  [optional] |
|**containerVersionsRetained** | **Integer** | Versions kept per non-file container before the oldest are pruned.  Beyond this, history is gone - not merely paginated. |  [optional] |
|**elementCount** | **Integer** | Number of element types this version recognizes. |  [optional] |
|**maxCjsonBytes** | **Integer** | Largest CJSON document that will be parsed, in bytes. |  [optional] |
|**maxPreviewSessionBytes** | **Integer** | Largest payload one preview session may hold, in bytes. |  [optional] |
|**maxSearchResults** | **Integer** | Hard ceiling on file search results per page. |  [optional] |
|**maxTemplateBytes** | **Integer** | Largest template file that can be written, in bytes. |  [optional] |
|**maxWidgetIdsPerRequest** | **Integer** | Most widget ids that can be reserved in one call. |  [optional] |
|**previewSessionTtlSeconds** | **Integer** | Seconds a preview session survives before expiring. |  [optional] |
|**release** | [**ReleaseEnum**](#ReleaseEnum) | Release channel selected for this merchant. |  [optional] |



## Enum: ReleaseEnum

| Name | Value |
|---- | -----|
| GA | &quot;ga&quot; |
| BETA | &quot;beta&quot; |
| ALPHA | &quot;alpha&quot; |



