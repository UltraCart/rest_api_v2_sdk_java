

# SfvbItemPricing


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cost** | **BigDecimal** | The price. |  [optional] |
|**currencyCode** | **String** | The currency every amount is in.  Read only here. |  [optional] |
|**hashSha256** | **String** | The hash of the pricing above.  Send it as If-Match to change it. |  [optional] |
|**merchantItemId** | **String** | The item&#39;s merchant item id. |  [optional] |
|**merchantItemOid** | **Integer** | The item. |  [optional] |
|**msrp** | **BigDecimal** | The manufacturer suggested retail price, when set. |  [optional] |
|**saleActive** | **Boolean** | Whether the sale price applies right now. |  [optional] |
|**saleCost** | **BigDecimal** | The sale price, when a sale is set. |  [optional] |
|**saleEnd** | **String** | When the sale ends, ISO 8601. |  [optional] |
|**saleStart** | **String** | When the sale starts, ISO 8601. |  [optional] |
|**volumeDiscounts** | [**List&lt;SfvbItemVolumeDiscount&gt;**](SfvbItemVolumeDiscount.md) | Retail quantity breaks, lowest quantity first.  Wholesale pricing tiers are not shown or changed here. |  [optional] |



