

# SfvbItemDefaultPageRow


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentSha256** | **String** | The dry run&#39;s current_sha256 for the item.  Required on an apply. |  [optional] |
|**expectedCurrentPath** | **String** | Dry run only - the default page the row expects now.  A different default makes the row stale. |  [optional] |
|**merchantItemId** | **String** | The item&#39;s id.  Send this or merchant_item_oid. |  [optional] |
|**merchantItemOid** | **Integer** | The item&#39;s oid.  Required on an apply. |  [optional] |
|**pageOid** | **Integer** | The page to make the default, by oid.  Required on an apply. |  [optional] |
|**pagePath** | **String** | The page to make the default, by path.  Send this or page_oid. |  [optional] |



