
# OrderAutoOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoOrderCode** | **String** | Unique code assigned to the auto order |  [optional]
**autoOrderOid** | **Integer** | Unique identifier assigned to the auto order |  [optional]
**originalOrderId** | **String** | Orignal order id that started this auto order sequence |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the auto order |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
CANCELED | &quot;canceled&quot;
DISABLED | &quot;disabled&quot;



