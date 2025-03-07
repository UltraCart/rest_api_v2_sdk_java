

# ItemContentMultimedia


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cloudUrl** | **String** | URL where the image can be downloaded from the cloud |  [optional] |
|**cloudUrlExpiration** | **String** | Expiration date of the cloud URL |  [optional] |
|**code** | **String** | Code assigned to the file |  [optional] |
|**description** | **String** | Description |  [optional] |
|**excludeFromGallery** | **Boolean** | True to exclude from multimedia gallery |  [optional] |
|**fileName** | **String** | File name |  [optional] |
|**height** | **Integer** | Height of the image |  [optional] |
|**merchantItemMultimediaOid** | **Integer** | Item multimedia object identifier |  [optional] |
|**orphan** | **Boolean** | True if the multimedia is an orphan of the active StoreFront themes |  [optional] |
|**placeholder** | **Boolean** | True if the object is a place holder that can be populated |  [optional] |
|**tempMultimediaOid** | **Integer** | Temporary multimedia object identifier assigned if uploading new multimedia |  [optional] |
|**thumbnails** | [**List&lt;ItemContentMultimediaThumbnail&gt;**](ItemContentMultimediaThumbnail.md) | Thumbnails of this image |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of file |  [optional] |
|**url** | **String** | URL to download file (on new multimedia record this can be a URL for UltraCart to fetch) |  [optional] |
|**width** | **Integer** | Width of the image |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;Image&quot; |
| PDF | &quot;PDF&quot; |
| TEXT | &quot;Text&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| VIDEO | &quot;Video&quot; |



