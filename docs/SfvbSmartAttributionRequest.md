

# SfvbSmartAttributionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assistPercent** | **BigDecimal** | 0 to 1, at most 4 decimals. |  [optional] |
|**attributionModel** | **String** | position_based, linear, time_decay or custom. |  [optional] |
|**closerPercent** | **BigDecimal** | 0 to 1, at most 4 decimals. |  [optional] |
|**lookbackDays** | **Integer** | 7 to 365. |  [optional] |
|**mode** | **String** | disabled, report_only or active.  Making it active, or any change while it is active, needs an approval. |  [optional] |
|**originatorPercent** | **BigDecimal** | 0 to 1, at most 4 decimals.  The three global percentages must total exactly 1, so send all three to change the split. |  [optional] |
|**platforms** | [**List&lt;SfvbSmartAttributionPlatform&gt;**](SfvbSmartAttributionPlatform.md) | When sent, replaces the whole platform list.  Up to 100, each name and id once.  Left out, the list is unchanged. |  [optional] |



