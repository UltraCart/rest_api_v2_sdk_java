

# SfvbItemMultimedia


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The image code, which is what an itemimage element&#39;s itemImageCode refers to.  Empty for the default image. |  [optional] |
|**declared** | **Boolean** | True when a template declares this code.  A slot that is attached but not declared is an image nothing on the page is asking for. |  [optional] |
|**_default** | **Boolean** | True for the image an itemimage element with no code renders.  Default is per media type, so an item may have one default image and one default PDF at the same time. |  [optional] |
|**description** | **String** | Stored with the image and rendered as its alt text.  When it is empty the render falls back to the item&#39;s own description, so an empty value here is not an empty alt attribute. |  [optional] |
|**dimensions** | **String** | Width x height in pixels, when the storage measured the file. |  [optional] |
|**excludeFromGallery** | **Boolean** | True when the storage marks this image as kept out of the item gallery. |  [optional] |
|**filename** | **String** | The stored file&#39;s name.  Empty when the slot is declared and nothing is attached. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The media type the storage recorded. |  [optional] |
|**viewUrl** | **String** | Where the stored image is served.  Absent when nothing is attached to the slot. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;Image&quot; |
| VIDEO | &quot;Video&quot; |
| PDF | &quot;PDF&quot; |
| TEXT | &quot;Text&quot; |
| UNKNOWN | &quot;Unknown&quot; |



