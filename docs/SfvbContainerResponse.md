

# SfvbContainerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cjson** | **String** | The container JSON.  Runtime state is stripped on the way out. |  [optional] |
|**containerName** | **String** | Container name. |  [optional] |
|**hashSha256** | **String** | SHA-256 of the cjson.  Send back as If-Match when writing. |  [optional] |
|**lastModified** | **String** | When the container was last modified, in the store&#39;s own record of it.  Present for email, postcardfront and postcardback.  Absent for upsell and item, because those tables carry no modification timestamp at all - for those two, read created_dts on the current entry of container_versions, which records when this API last wrote the container.  Note that a postcard keeps one timestamp for both of its sides, so writing the front moves the value the back reports. |  [optional] |
|**ownerObjectId** | **String** | Identifier of the owning object within its store. |  [optional] |
|**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) | Where this container lives. |  [optional] |



## Enum: OwnerTypeEnum

| Name | Value |
|---- | -----|
| THEME | &quot;theme&quot; |
| PAGE | &quot;page&quot; |
| ITEM | &quot;item&quot; |
| UPSELL | &quot;upsell&quot; |
| EMAIL | &quot;email&quot; |
| POSTCARD | &quot;postcard&quot; |



