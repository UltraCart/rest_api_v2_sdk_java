

# CartUpsellAfter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**finalizeAfterDts** | **String** | The date/time after which the cart will finalize into an order. |  [optional] |
|**finalizeAfterMinutes** | **Integer** | The amount of inactivity in minutes after which the cart should be finalized into an order.  This will calculate the finalize_after_dts field. |  [optional] |
|**upsellPathCode** | **String** | Upsell path code (this is for legacy upsells only) |  [optional] |
|**upsellPathName** | **String** | Upsell path name to start on (StoreFront Upsells).  Will only be respected on a handoff API call. |  [optional] |
|**upsellPathVariation** | **String** | Upsell path variation to start on (StoreFront Upsells).   Will only be respected on a handoff API call. |  [optional] |



