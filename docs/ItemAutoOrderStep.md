
# ItemAutoOrderStep

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arbitraryScheduleDays** | **Integer** | If the schedule is arbitrary, then this is the number of days |  [optional]
**arbitraryUnitCost** | [**BigDecimal**](BigDecimal.md) | Arbitrary unit cost used to override the regular item cost |  [optional]
**arbitraryUnitCostSchedules** | [**List&lt;ItemAutoOrderStepArbitraryUnitCostSchedule&gt;**](ItemAutoOrderStepArbitraryUnitCostSchedule.md) | Arbitrary unit costs schedules for more advanced discounting by rebill attempt |  [optional]
**grandfatherPricing** | [**List&lt;ItemAutoOrderStepGrandfatherPricing&gt;**](ItemAutoOrderStepGrandfatherPricing.md) | Grand-father pricing configuration if the rebill schedule has changed over time |  [optional]
**managedBy** | **String** | Managed by (defaults to UltraCart) |  [optional]
**pauseDays** | **Integer** | Number of days to pause |  [optional]
**pauseUntilDate** | **String** | Wait for this step to happen until the specified date |  [optional]
**pauseUntilDayOfMonth** | **Integer** | Pause until a specific day of the month |  [optional]
**pauseUntilMinimumDelayDays** | **Integer** | Pause at least this many days between the last order and the calculated next day of month |  [optional]
**preshipmentNoticeDays** | **Integer** | If set, a pre-shipment notice is sent to the customer this many days in advance |  [optional]
**recurringMerchantItemId** | **String** | Item id to rebill |  [optional]
**recurringMerchantItemOid** | **Integer** | Item object identifier to rebill |  [optional]
**repeatCount** | **Integer** | Number of times to rebill.  Last step can be null for infinite |  [optional]
**schedule** | **String** | Frequency of the rebill |  [optional]
**subscribeEmailListName** | **String** | Email list name to subscribe the customer to when the rebill occurs (decommissioned email engine) |  [optional]
**subscribeEmailListOid** | **Integer** | Email list identifier to subscribe the customer to when this rebill occurs (decommissioned email engine) |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of step (item, kit only, loop or pause) |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ITEM | &quot;item&quot;
PAUSE | &quot;pause&quot;
LOOP | &quot;loop&quot;
KIT_ONLY | &quot;kit only&quot;
PAUSE_UNTIL | &quot;pause until&quot;



