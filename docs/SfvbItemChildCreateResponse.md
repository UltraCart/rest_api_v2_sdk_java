

# SfvbItemChildCreateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**copiedCost** | **String** | The cost copied from the parent. |  [optional] |
|**copiedDimensions** | **String** | Length, width and height copied from the parent. |  [optional] |
|**copiedFolderId** | **Integer** | The parent&#39;s item folder the new item is filed in, 0 for the top. |  [optional] |
|**copiedWeight** | **String** | The weight copied from the parent. |  [optional] |
|**description** | **String** | The new item&#39;s description. |  [optional] |
|**dryRun** | **Boolean** | True when nothing was created. |  [optional] |
|**merchantItemId** | **String** | The new item&#39;s id. |  [optional] |
|**merchantItemOid** | **Integer** | The new item&#39;s oid.  Absent on a dry run. |  [optional] |
|**next** | **String** | What to do next. |  [optional] |
|**parent** | [**SfvbItemVariationChild**](SfvbItemVariationChild.md) |  |  [optional] |



