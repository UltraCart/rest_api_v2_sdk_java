

# OrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountingCode** | **String** | QuickBooks code |  [optional] |
|**activationCodes** | **List&lt;String&gt;** | Activation codes assigned to this item |  [optional] |
|**actualCogs** | [**Currency**](Currency.md) |  |  [optional] |
|**arbitraryUnitCost** | [**Currency**](Currency.md) |  |  [optional] |
|**autoOrderLastRebillDts** | **String** | Date/time of the last rebill, used only during order insert to help project future rebills |  [optional] |
|**autoOrderSchedule** | **String** | Auto order schedule, used only during inserts supplying the recurring schedule |  [optional] |
|**barcode** | **String** | Barcode |  [optional] |
|**barcodeGtin12** | **String** | Barcode - GTIN 12 |  [optional] |
|**barcodeGtin14** | **String** | Barcode - GTIN 14 |  [optional] |
|**barcodeUpc11** | **String** | Barcode - UPC 11 |  [optional] |
|**barcodeUpc12** | **String** | Barcode - UPC 12 |  [optional] |
|**channelPartnerItemId** | **String** | Channel partner item id if this order came through a channel partner and the channel partner item id was mapped to an internal item id |  [optional] |
|**cogs** | **BigDecimal** | Cost of goods sold |  [optional] |
|**componentUnitValue** | **BigDecimal** | Value of the kit component item |  [optional] |
|**cost** | [**Currency**](Currency.md) |  |  [optional] |
|**countryCodeOfOrigin** | **String** | Country of origin (ISO-3166 two letter code) |  [optional] |
|**customsDescription** | **String** | Customs description |  [optional] |
|**description** | **String** | Description |  [optional] |
|**discount** | [**Currency**](Currency.md) |  |  [optional] |
|**discountQuantity** | **BigDecimal** | Discount quantity |  [optional] |
|**discountShippingWeight** | [**Weight**](Weight.md) |  |  [optional] |
|**distributionCenterCode** | **String** | Distribution center code responsible for shipping this item |  [optional] |
|**edi** | [**OrderItemEdi**](OrderItemEdi.md) |  |  [optional] |
|**excludeCoupon** | **Boolean** | True if this item is excluded from coupons |  [optional] |
|**freeShipping** | **Boolean** | True if the item receives free shipping |  [optional] |
|**hazmat** | **Boolean** | Hazardous materials indicator |  [optional] |
|**height** | [**Distance**](Distance.md) |  |  [optional] |
|**itemIndex** | **Integer** | Index of the item on the order (one based index) |  [optional] |
|**itemReferenceOid** | **Integer** | Item reference object identifier used to linked to auto order item record |  [optional] |
|**kit** | **Boolean** | True if this item is a kit |  [optional] |
|**kitComponent** | **Boolean** | True if this item is a kit component |  [optional] |
|**length** | [**Distance**](Distance.md) |  |  [optional] |
|**manufacturerSku** | **String** | Manufacturer SKU |  [optional] |
|**maxDaysTimeInTransit** | **Integer** | Maximum days that the item can be in transit before spoilage (perishable products) |  [optional] |
|**merchantItemId** | **String** | Item ID |  [optional] |
|**mixAndMatchGroupName** | **String** | Mix and match group name |  [optional] |
|**mixAndMatchGroupOid** | **Integer** | Mix and match group object identifier |  [optional] |
|**noShippingDiscount** | **Boolean** | True if this item is excluded from shipping discounts |  [optional] |
|**options** | [**List&lt;OrderItemOption&gt;**](OrderItemOption.md) | Options |  [optional] |
|**packedByUser** | **String** | Packed by user |  [optional] |
|**parentItemIndex** | **Integer** | If this item is a kit component, this is the item index of the parent item (kit) |  [optional] |
|**parentMerchantItemId** | **String** | If this item is a kit component, this is the item id of the parent item (kit) |  [optional] |
|**perishableClass** | **String** | Perishable class of the item |  [optional] |
|**pricingTierName** | **String** | Pricing tier that granted the particular price for this item if the customer profile had pricing tiers assigned |  [optional] |
|**properties** | [**List&lt;OrderItemProperty&gt;**](OrderItemProperty.md) | Properties |  [optional] |
|**quantity** | **BigDecimal** | Quantity |  [optional] |
|**quantityRefunded** | **BigDecimal** | Quantity refunded on this item (read only except refund operation) |  [optional] |
|**quickbooksClass** | **String** | QuickBooks class |  [optional] |
|**refundReason** | **String** | Refund reason code.  This can only be written during a refund operation otherwise this field is read only. |  [optional] |
|**returnReason** | **String** | Return reason code.  This can only be written during a refund operation otherwise this field is read only. |  [optional] |
|**shipSeparately** | **Boolean** | True if this item ships in a separate box |  [optional] |
|**shippedByUser** | **String** | Shipped by user |  [optional] |
|**shippedDts** | **String** | Date/time that this item was marked shipped |  [optional] |
|**shippingStatus** | **String** | Shipping status for this item.  This is the replacement for the old order level shipping status. |  [optional] |
|**specialProductType** | **String** | Special product type (USPS Media Mail) |  [optional] |
|**tags** | [**List&lt;OrderItemTag&gt;**](OrderItemTag.md) | Tags |  [optional] |
|**taxFree** | **Boolean** | True if the item is tax free |  [optional] |
|**taxProductType** | [**TaxProductTypeEnum**](#TaxProductTypeEnum) | Type of product for tax purposes (self or UltraCart Managed taxes) |  [optional] |
|**taxableCost** | [**Currency**](Currency.md) |  |  [optional] |
|**totalCostWithDiscount** | [**Currency**](Currency.md) |  |  [optional] |
|**totalRefunded** | [**Currency**](Currency.md) |  |  [optional] |
|**transmittedToDistributionCenterDts** | **String** | Date/time that this item was transmitted to the distribution center |  [optional] |
|**unitCostWithDiscount** | [**Currency**](Currency.md) |  |  [optional] |
|**upsell** | **Boolean** | True if this item was added to the order as part of an upsell |  [optional] |
|**weight** | [**Weight**](Weight.md) |  |  [optional] |
|**width** | [**Distance**](Distance.md) |  |  [optional] |



## Enum: TaxProductTypeEnum

| Name | Value |
|---- | -----|
| EMPTY | &quot;&quot; |
| DIGITAL | &quot;digital&quot; |
| PHYSICAL | &quot;physical&quot; |
| SERVICE | &quot;service&quot; |



