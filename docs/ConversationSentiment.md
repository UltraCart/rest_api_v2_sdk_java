
# ConversationSentiment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastDetectSentiment** | **String** | The last time the detect sentiment was run on this conversation |  [optional]
**mixed** | [**BigDecimal**](BigDecimal.md) | The mixed score |  [optional]
**negative** | [**BigDecimal**](BigDecimal.md) | The negative score |  [optional]
**neutral** | [**BigDecimal**](BigDecimal.md) | The neutral score |  [optional]
**positive** | [**BigDecimal**](BigDecimal.md) | The positive score |  [optional]
**sentiment** | [**SentimentEnum**](#SentimentEnum) | The overall sentiment |  [optional]


<a name="SentimentEnum"></a>
## Enum: SentimentEnum
Name | Value
---- | -----
POSITIVE | &quot;POSITIVE&quot;
NEUTRAL | &quot;NEUTRAL&quot;
NEGATIVE | &quot;NEGATIVE&quot;
MIXED | &quot;MIXED&quot;



