

# ChannelPartnerOrderItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arbitraryUnitCost** | **BigDecimal** | Arbitrary unit cost for this item that differs from the listed price |  [optional] |
|**autoOrderLastRebillDts** | **String** | Optional date/time of the last rebill if this item is part of an auto (recurring) order |  [optional] |
|**autoOrderSchedule** | [**AutoOrderScheduleEnum**](#AutoOrderScheduleEnum) | The frequency schedule for this item if this item is part of an auto (recurring) order |  [optional] |
|**merchantItemId** | **String** | Item ID |  [optional] |
|**options** | [**List&lt;ChannelPartnerOrderItemOption&gt;**](ChannelPartnerOrderItemOption.md) | Item options |  [optional] |
|**quantity** | **BigDecimal** | Quantity |  [optional] |
|**upsell** | **Boolean** | True if this item was an upsell item. |  [optional] |



## Enum: AutoOrderScheduleEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;Weekly&quot; |
| EVERY_10_DAYS | &quot;Every 10 Days&quot; |
| BIWEEKLY | &quot;Biweekly&quot; |
| EVERY_24_DAYS | &quot;Every 24 Days&quot; |
| EVERY_28_DAYS | &quot;Every 28 Days&quot; |
| MONTHLY | &quot;Monthly&quot; |
| EVERY_45_DAYS | &quot;Every 45 Days&quot; |
| EVERY_2_MONTHS | &quot;Every 2 Months&quot; |
| EVERY_3_MONTHS | &quot;Every 3 Months&quot; |
| EVERY_4_MONTHS | &quot;Every 4 Months&quot; |
| EVERY_6_MONTHS | &quot;Every 6 Months&quot; |
| YEARLY | &quot;Yearly&quot; |



