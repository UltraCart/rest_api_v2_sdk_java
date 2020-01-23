
# CartItemMultimedia

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Code assigned to the multimedia |  [optional]
**description** | **String** | Description |  [optional]
**excludeFromGallery** | **Boolean** | True if the image should be excluded from galleries |  [optional]
**imageHeight** | **Integer** | Image height |  [optional]
**imageWidth** | **Integer** | Image width |  [optional]
**isDefault** | **Boolean** | True if the multimedia is the default for this type |  [optional]
**thumbnails** | [**List&lt;CartItemMultimediaThumbnail&gt;**](CartItemMultimediaThumbnail.md) | Thumbnails of the images |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of multimedia |  [optional]
**url** | **String** | URL to view multimedia at |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
IMAGE | &quot;Image&quot;
PDF | &quot;PDF&quot;
TEXT | &quot;Text&quot;
UNKNOWN | &quot;Unknown&quot;
VIDEO | &quot;Video&quot;



