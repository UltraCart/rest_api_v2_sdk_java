

# ConversationSentiment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lastDetectSentiment** | **String** | The last time the detect sentiment was run on this conversation |  [optional] |
|**mixed** | **BigDecimal** | The mixed score |  [optional] |
|**negative** | **BigDecimal** | The negative score |  [optional] |
|**neutral** | **BigDecimal** | The neutral score |  [optional] |
|**positive** | **BigDecimal** | The positive score |  [optional] |
|**sentiment** | [**SentimentEnum**](#SentimentEnum) | The overall sentiment |  [optional] |



## Enum: SentimentEnum

| Name | Value |
|---- | -----|
| POSITIVE | &quot;POSITIVE&quot; |
| NEUTRAL | &quot;NEUTRAL&quot; |
| NEGATIVE | &quot;NEGATIVE&quot; |
| MIXED | &quot;MIXED&quot; |



