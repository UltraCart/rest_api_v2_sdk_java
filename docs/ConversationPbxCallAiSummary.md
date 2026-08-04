

# ConversationPbxCallAiSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionItems** | **List&lt;String&gt;** | Action items identified during the call |  [optional] |
|**callCategory** | **String** | Category of the call (e.g. support, sales, billing) |  [optional] |
|**completionTokens** | **Integer** | Number of output tokens used to generate the summary |  [optional] |
|**cost** | **BigDecimal** | Cost of generating the summary in the specified currency |  [optional] |
|**costCurrency** | **String** | Currency code for the summary cost (always USD) |  [optional] |
|**generatedAtDts** | **String** | Timestamp when the summary was generated |  [optional] |
|**keyTopics** | **List&lt;String&gt;** | Key topics discussed during the call |  [optional] |
|**model** | **String** | AI model used to generate the summary (e.g. grok-4.1-fast) |  [optional] |
|**promptTokens** | **Integer** | Number of input tokens used to generate the summary |  [optional] |
|**sentiment** | [**SentimentEnum**](#SentimentEnum) | Overall sentiment of the call |  [optional] |
|**summary** | **String** | 2-3 sentence synopsis of the call |  [optional] |



## Enum: SentimentEnum

| Name | Value |
|---- | -----|
| POSITIVE | &quot;positive&quot; |
| NEUTRAL | &quot;neutral&quot; |
| NEGATIVE | &quot;negative&quot; |



