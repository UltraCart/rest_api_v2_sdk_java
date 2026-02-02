
# AutoOrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arbitraryItemId** | **String** | Arbitrary item id that should be rebilled instead of the normal schedule |  [optional]
**arbitraryPercentageDiscount** | [**BigDecimal**](BigDecimal.md) | An arbitrary percentage discount to provide on future rebills |  [optional]
**arbitraryQuantity** | [**BigDecimal**](BigDecimal.md) | Arbitrary quantity to rebill |  [optional]
**arbitraryScheduleDays** | **Integer** | The number of days to rebill if the frequency is set to an arbitrary number of days |  [optional]
**arbitraryUnitCost** | [**BigDecimal**](BigDecimal.md) | Arbitrary unit cost that rebills of this item should occur at |  [optional]
**arbitraryUnitCostRemainingOrders** | **Integer** | The number of rebills to give the arbitrary unit cost on before reverting to normal pricing. |  [optional]
**autoOrderItemOid** | **Integer** | Primary key of AutoOrderItem |  [optional]
**calculatedNextShipmentDts** | **String** | Calculated Date/time that this item is scheduled to rebill.  Will be null if no more shipments are going to occur on this item |  [optional]
**firstOrderDts** | **String** | Date/time of the first order of this item.  Null if item added to auto order and has not been rebilled yet. |  [optional]
**frequency** | [**FrequencyEnum**](#FrequencyEnum) | Frequency of the rebill if not a fixed schedule |  [optional]
**futureSchedules** | [**List&lt;AutoOrderItemFutureSchedule&gt;**](AutoOrderItemFutureSchedule.md) | The future rebill schedule for this item up to the next ten rebills |  [optional]
**lastOrderDts** | **String** | Date/time of the last order of this item |  [optional]
**lifeTimeValue** | [**BigDecimal**](BigDecimal.md) | The life time value of this item including the original purchase |  [optional]
**nextItemId** | **String** | Calculated next item id |  [optional]
**nextPreshipmentNoticeDts** | **String** | The date/time of when the next pre-shipment notice should be sent |  [optional]
**nextShipmentDts** | **String** | Date/time that this item is scheduled to rebill |  [optional]
**noOrderAfterDts** | **String** | Date/time after which no additional rebills of this item should occur |  [optional]
**numberOfRebills** | **Integer** | The number of times this item has rebilled |  [optional]
**options** | [**List&lt;AutoOrderItemOption&gt;**](AutoOrderItemOption.md) | Options associated with this item |  [optional]
**originalItemId** | **String** | The original item id purchased.  This item controls scheduling.  If you wish to modify a schedule, for example, from monthly to yearly, change this item from your monthly item to your yearly item, and then change the next_shipment_dts to your desired date. |  [optional]
**originalQuantity** | [**BigDecimal**](BigDecimal.md) | The original quantity purchased |  [optional]
**paused** | **Boolean** | True if paused.  This field is an object instead of a primitive for backwards compatibility. |  [optional]
**paypalPayerId** | **String** | The PayPal Payer ID tied to this item |  [optional]
**paypalRecurringPaymentProfileId** | **String** | The PayPal Profile ID tied to this item |  [optional]
**preshipmentNoticeSent** | **Boolean** | True if the preshipment notice associated with the next rebill has been sent |  [optional]
**rebillValue** | [**BigDecimal**](BigDecimal.md) | The value of the rebills of this item |  [optional]
**remainingRepeatCount** | **Integer** | The number of rebills remaining before this item is complete |  [optional]
**simpleSchedule** | [**AutoOrderItemSimpleSchedule**](AutoOrderItemSimpleSchedule.md) |  |  [optional]


<a name="FrequencyEnum"></a>
## Enum: FrequencyEnum
Name | Value
---- | -----
WEEKLY | &quot;Weekly&quot;
BIWEEKLY | &quot;Biweekly&quot;
EVERY_ | &quot;Every...&quot;
EVERY_10_DAYS | &quot;Every 10 Days&quot;
EVERY_24_DAYS | &quot;Every 24 Days&quot;
EVERY_28_DAYS | &quot;Every 28 Days&quot;
MONTHLY | &quot;Monthly&quot;
EVERY_45_DAYS | &quot;Every 45 Days&quot;
EVERY_2_MONTHS | &quot;Every 2 Months&quot;
EVERY_3_MONTHS | &quot;Every 3 Months&quot;
EVERY_4_MONTHS | &quot;Every 4 Months&quot;
EVERY_5_MONTHS | &quot;Every 5 Months&quot;
EVERY_6_MONTHS | &quot;Every 6 Months&quot;
YEARLY | &quot;Yearly&quot;
EVERY_4_WEEKS | &quot;Every 4 Weeks&quot;
EVERY_6_WEEKS | &quot;Every 6 Weeks&quot;
EVERY_8_WEEKS | &quot;Every 8 Weeks&quot;



