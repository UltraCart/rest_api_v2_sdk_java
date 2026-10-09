

# SfvbItemPricingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clearMsrp** | **Boolean** | True to remove the MSRP.  Not with msrp. |  [optional] |
|**clearSale** | **Boolean** | True to remove the sale.  Not with sale_cost. |  [optional] |
|**cost** | **BigDecimal** | The new price, 0 or more. |  [optional] |
|**msrp** | **BigDecimal** | The manufacturer suggested retail price, more than 0 (or 0 when the price is 0). |  [optional] |
|**saleCost** | **BigDecimal** | The sale price, 0 or more.  Sent with sale_start and sale_end, all three or none. |  [optional] |
|**saleEnd** | **String** | When the sale ends, ISO 8601 with an offset, after sale_start.  Required with sale_cost. |  [optional] |
|**saleStart** | **String** | When the sale starts, ISO 8601 with an offset.  Required with sale_cost. |  [optional] |
|**volumeDiscounts** | [**List&lt;SfvbItemVolumeDiscount&gt;**](SfvbItemVolumeDiscount.md) | Replaces the retail quantity breaks.  An empty list removes them all.  Up to 20, each quantity 2 or more and named once. |  [optional] |



