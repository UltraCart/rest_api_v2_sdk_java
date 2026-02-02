
# ConversationPbxCallAiEngagement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentName** | **String** | Display name of the AI agent |  [optional]
**agentUuid** | **String** | UUID of the AI agent configuration used |  [optional]
**cost** | [**ConversationPbxCallAiCost**](ConversationPbxCallAiCost.md) |  |  [optional]
**endedAtDts** | **String** | Timestamp when the AI engagement ended |  [optional]
**engagementType** | [**EngagementTypeEnum**](#EngagementTypeEnum) | Type of AI engagement |  [optional]
**sessionUuid** | **String** | Unique identifier for this AI engagement session |  [optional]
**startedAtDts** | **String** | Timestamp when the AI engagement started |  [optional]
**status** | **String** | Status of the AI engagement |  [optional]
**toolCalls** | [**List&lt;ConversationPbxCallAiToolCall&gt;**](ConversationPbxCallAiToolCall.md) | List of tool calls made by the AI agent during this engagement |  [optional]
**whispers** | [**List&lt;ConversationPbxCallAiWhisper&gt;**](ConversationPbxCallAiWhisper.md) | List of coaching whispers sent during this engagement |  [optional]


<a name="EngagementTypeEnum"></a>
## Enum: EngagementTypeEnum
Name | Value
---- | -----
AGENT | &quot;ai_agent&quot;
COACH | &quot;ai_coach&quot;



