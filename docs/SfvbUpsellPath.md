

# SfvbUpsellPath


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Whether the path runs.  Setting it true, or changing a path that is active, needs the sfvb_publish scope. |  [optional] |
|**archived** | **Boolean** | Read only here.  Filed out of the default list.  Change it with the archive and unarchive calls. |  [optional] |
|**customerType** | **String** | Which customers the path runs for.  all (the default), new or existing. |  [optional] |
|**hashSha256** | **String** | Read only.  Hash of the path&#39;s writable fields.  Send it in If-Match on an update. |  [optional] |
|**itemLogicSuppression** | [**SfvbUpsellItemLogic**](SfvbUpsellItemLogic.md) |  |  [optional] |
|**itemLogicTrigger** | [**SfvbUpsellItemLogic**](SfvbUpsellItemLogic.md) |  |  [optional] |
|**location** | **String** | Where in checkout the path runs.  pre checkout or post checkout (the default). |  [optional] |
|**maximumOffers** | **Integer** | Most offers one shopper is shown on this path.  Omitted or null for no limit. |  [optional] |
|**name** | **String** | Path name, at most 100 characters. |  [optional] |
|**pathOrder** | **Integer** | Read only here.  Position among this storefront&#39;s paths, first to last.  Change it with the move call. |  [optional] |
|**pathType** | **String** | cascading (the default) or single. |  [optional] |
|**towerdataTrigger** | [**SfvbUpsellTowerData**](SfvbUpsellTowerData.md) |  |  [optional] |
|**triggerItemIds** | **List&lt;String&gt;** | Read only.  The legacy flat trigger list, derived from item_logic_trigger when its logic is contains_any and empty otherwise. |  [optional] |
|**triggerTags** | **List&lt;String&gt;** | Customer tags that trigger the path. |  [optional] |
|**upsellPathOid** | **Integer** | Read only.  Upsell path oid. |  [optional] |
|**variations** | [**List&lt;SfvbUpsellVariation&gt;**](SfvbUpsellVariation.md) | The variations shoppers are split between.  At least one. |  [optional] |



