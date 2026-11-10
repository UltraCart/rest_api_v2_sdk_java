

# SfvbItemDefaultPageResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentDefaultOid** | **Integer** | The default page&#39;s oid now, or null. |  [optional] |
|**currentDefaultPath** | **String** | The default page now, or null. |  [optional] |
|**currentSha256** | **String** | Hash of the item&#39;s pages and default on this storefront.  Send it back on the apply. |  [optional] |
|**index** | **Integer** | The row&#39;s position in the request, from 0. |  [optional] |
|**merchantItemId** | **String** | The item&#39;s id, when found. |  [optional] |
|**merchantItemOid** | **Integer** | The item&#39;s oid, when found. |  [optional] |
|**message** | **String** | Why the row is refused, stale or failed. |  [optional] |
|**previousDefaultOid** | **Integer** | Apply only - the previous default page&#39;s oid. |  [optional] |
|**previousDefaultPath** | **String** | Apply only - the default page before the change, to undo it. |  [optional] |
|**status** | **String** | ready, already_default, target_not_found, target_not_on_host, target_not_assigned, target_hidden, item_not_found, invalid, stale, updated or failed. |  [optional] |
|**targetOid** | **Integer** | The page&#39;s oid. |  [optional] |
|**targetPath** | **String** | The page the row makes the default. |  [optional] |



