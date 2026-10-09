

# SfvbItemRelated


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hashSha256** | **String** | The hash of the above.  Send it as If-Match to change them. |  [optional] |
|**merchantItemId** | **String** | The item&#39;s merchant item id. |  [optional] |
|**merchantItemOid** | **Integer** | The item. |  [optional] |
|**noSystemCalculatedRelatedItems** | **Boolean** | True when UltraCart does not calculate related items for this item. |  [optional] |
|**notRelatable** | **Boolean** | True when this item is never shown as related to another. |  [optional] |
|**relatedItems** | [**List&lt;SfvbItemRelatedItem&gt;**](SfvbItemRelatedItem.md) | In stored order - the merchant&#39;s own (user, addon, complementary) and UltraCart&#39;s calculated ones (system). |  [optional] |



