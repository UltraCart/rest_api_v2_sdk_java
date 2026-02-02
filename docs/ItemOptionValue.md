

# ItemOptionValue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalDimensionApplication** | [**AdditionalDimensionApplicationEnum**](#AdditionalDimensionApplicationEnum) | Additional dimensions application |  [optional] |
|**additionalItems** | [**List&lt;ItemOptionValueAdditionalItem&gt;**](ItemOptionValueAdditionalItem.md) | Additional items to add to the order if this value is selected |  [optional] |
|**costChange** | **BigDecimal** | Cost change |  [optional] |
|**defaultValue** | **Boolean** | True if default value |  [optional] |
|**digitalItems** | [**List&lt;ItemOptionValueDigitalItem&gt;**](ItemOptionValueDigitalItem.md) | Digital items to allow the customer to download if this option value is selected |  [optional] |
|**height** | [**Distance**](Distance.md) |  |  [optional] |
|**length** | [**Distance**](Distance.md) |  |  [optional] |
|**merchantItemMultimediaOid** | **Integer** | Multimedia object identifier associated with this option value |  [optional] |
|**optionValueOid** | **Integer** | Option value object identifier |  [optional] |
|**percentCostChange** | **BigDecimal** | Percentage cost change |  [optional] |
|**translatedTextInstanceOid** | **Integer** | Translated text instance id |  [optional] |
|**value** | **String** | Value |  [optional] |
|**weightChange** | [**Weight**](Weight.md) |  |  [optional] |
|**weightChangePercent** | **BigDecimal** | Percentage weight change |  [optional] |
|**width** | [**Distance**](Distance.md) |  |  [optional] |



## Enum: AdditionalDimensionApplicationEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| SET_ITEM_TO | &quot;set item to&quot; |
| ADD_ITEM | &quot;add item&quot; |



