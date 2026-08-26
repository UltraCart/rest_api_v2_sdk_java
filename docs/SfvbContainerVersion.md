

# SfvbContainerVersion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cjson** | **String** | The CJSON this version held.  Populated only when reading a single version, and null when the operation is create.  Listings omit it because container CJSON is large. |  [optional] |
|**comment** | **String** | Comment recorded with the write that replaced this version. |  [optional] |
|**containerHistoryOid** | **Integer** | History record oid.  Pass to the revert operation on the owning container. |  [optional] |
|**containerName** | **String** | Container name, where the owner has more than one container. |  [optional] |
|**createdDts** | **String** | When this snapshot was taken. |  [optional] |
|**current** | **Boolean** | True for the value currently stored. |  [optional] |
|**editedBy** | **String** | Login of whoever caused this snapshot. |  [optional] |
|**hashSha256** | **String** | SHA-256 of this version&#39;s CJSON. |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | What the container was before the write this entry precedes.  create means it did not exist, so reverting to this entry removes it again; update means it held the cjson recorded here. |  [optional] |
|**ownerObjectId** | **String** | Owner object identifier. |  [optional] |
|**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) | Owner type. |  [optional] |
|**size** | **Integer** | Size of this version&#39;s CJSON in bytes. |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;create&quot; |
| UPDATE | &quot;update&quot; |



## Enum: OwnerTypeEnum

| Name | Value |
|---- | -----|
| ITEM | &quot;item&quot; |
| UPSELL | &quot;upsell&quot; |
| EMAIL | &quot;email&quot; |
| POSTCARDFRONT | &quot;postcardfront&quot; |
| POSTCARDBACK | &quot;postcardback&quot; |



