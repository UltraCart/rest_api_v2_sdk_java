

# ConversationAgentCallEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callUuid** | **String** | Call UUID |  [optional] |
|**direction** | [**DirectionEnum**](#DirectionEnum) | Direction |  [optional] |
|**disposition** | **String** | Call disposition (e.g. &#39;answered&#39;, &#39;missed&#39;) |  [optional] |
|**durationSeconds** | **Integer** | Total call duration in seconds |  [optional] |
|**endDts** | **String** | Call ended |  [optional] |
|**phoneNumber** | **String** | Counterparty phone number |  [optional] |
|**startDts** | **String** | Call started |  [optional] |



## Enum: DirectionEnum

| Name | Value |
|---- | -----|
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |



