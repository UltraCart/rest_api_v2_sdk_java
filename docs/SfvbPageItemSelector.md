

# SfvbPageItemSelector


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributeName** | **String** | attribute - the item attribute name.  Required with attribute_value. |  [optional] |
|**attributeValue** | **String** | attribute - the value to match. |  [optional] |
|**itemFolderOid** | **Integer** | item folder and item folder tree - the item folder, which must exist. |  [optional] |
|**manufacturerName** | **String** | manufacturer name - required. |  [optional] |
|**retailCostHigh** | **BigDecimal** | retail cost - the highest price. |  [optional] |
|**retailCostLow** | **BigDecimal** | retail cost - the lowest price.  At least one of low and high is required. |  [optional] |
|**saleItem** | **Boolean** | sale item - match items on sale. |  [optional] |
|**tag** | **String** | tag - the item tag to match.  Required. |  [optional] |
|**topSellerCount** | **Integer** | top seller - how many items, 1 to 250.  Required with top_seller_days. |  [optional] |
|**topSellerDays** | **Integer** | top seller - over how many days, 1 to 180. |  [optional] |
|**type** | **String** | One of retail cost, attribute, variation, not variation, manufacturer name, exploded diagram, sale item, item folder, item folder tree, top seller, new, pre-order, tag. |  [optional] |
|**variationName** | **String** | variation - the variation name.  Required with variation_value. |  [optional] |
|**variationValue** | **String** | variation - the variation value to match. |  [optional] |



