

# SfvbContainerResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cjson** | **String** | The container JSON.  Runtime state is stripped on the way out. |  [optional] |
|**containerName** | **String** | Container name. |  [optional] |
|**hashSha256** | **String** | SHA-256 of the cjson.  Send back as If-Match when writing. |  [optional] |
|**lastModified** | **String** | When the container was last modified, in the store&#39;s own record of it.  Every owner type reports this.  It is absent only when the container has never been written since the store began recording it, so treat an absent value as unknown rather than as never modified.  Two behaviours worth knowing.  A postcard keeps one timestamp for both of its sides, so writing the front moves the value the back reports.  An upsell container that is rewritten with byte identical content keeps its original date rather than moving to now, because the timestamp tracks changes to the container and not writes to the offer. |  [optional] |
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



