

# ConversationPbxCallTranscriptSegment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentId** | **String** | Agent ID if speaker is an agent |  [optional] |
|**channel** | **String** | Audio channel identifier (e.g. ch_0, ch_1) |  [optional] |
|**confidence** | **BigDecimal** | Transcription confidence score (0-1) |  [optional] |
|**endTime** | **BigDecimal** | End time in seconds from beginning of recording |  [optional] |
|**speaker** | [**SpeakerEnum**](#SpeakerEnum) | Speaker role |  [optional] |
|**startTime** | **BigDecimal** | Start time in seconds from beginning of recording |  [optional] |
|**text** | **String** | Transcribed text for this segment |  [optional] |



## Enum: SpeakerEnum

| Name | Value |
|---- | -----|
| CUSTOMER | &quot;customer&quot; |
| _AGENT | &quot; agent&quot; |



