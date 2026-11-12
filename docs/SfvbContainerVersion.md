

# SfvbContainerVersion


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cjson** | **String** | The CJSON this version held.  Populated only when reading a single version, and null when the operation is create.  Listings omit it because container CJSON is large. |  [optional] |
|**comment** | **String** | Comment recorded with the write that replaced this version. |  [optional] |
|**containerHistoryOid** | **Integer** | History record oid.  Pass to the revert operation on the owning container.  Absent on the entry marked current, which holds the value stored right now, has no history row of its own, and so cannot be fetched or reverted to. |  [optional] |
|**containerName** | **String** | Container name, where the owner has more than one container. |  [optional] |
|**contentCreatedDts** | **String** | When this version&#39;s content was written, ISO 8601 UTC.  Same source and limits as content_edited_by. |  [optional] |
|**contentEditedBy** | **String** | Login of whoever wrote this version&#39;s content, taken from the write recorded on the next older entry.  Absent on a create entry and on the oldest entry kept, such as a template body that was in place before any history.  Saves made outside this API, in the admin visual builder, are not recorded, so after one this names the previous API write. |  [optional] |
|**createdDts** | **String** | When the write that replaced this version happened, ISO 8601 UTC.  On the current entry, when it was written. |  [optional] |
|**current** | **Boolean** | True for the value currently stored. |  [optional] |
|**editedBy** | **String** | Login of whoever made the write that replaced this version.  On the current entry, whoever wrote it.  See content_edited_by for who wrote a history entry&#39;s content. |  [optional] |
|**hashSha256** | **String** | SHA-256 of this version&#39;s CJSON. |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | What the container was before the write this entry precedes.  create means it did not exist, so reverting to this entry removes it again; update means it held the cjson recorded here; delete means it held the cjson recorded here and the write after it removed the container, so reverting to this entry puts that cjson back. |  [optional] |
|**ownerObjectId** | **String** | Owner object identifier. |  [optional] |
|**ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum) | Owner type. |  [optional] |
|**size** | **Integer** | Size of this version&#39;s CJSON in bytes. |  [optional] |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| CREATE | &quot;create&quot; |
| UPDATE | &quot;update&quot; |
| DELETE | &quot;delete&quot; |



## Enum: OwnerTypeEnum

| Name | Value |
|---- | -----|
| ITEM | &quot;item&quot; |
| UPSELL | &quot;upsell&quot; |
| EMAIL | &quot;email&quot; |
| POSTCARDFRONT | &quot;postcardfront&quot; |
| POSTCARDBACK | &quot;postcardback&quot; |



