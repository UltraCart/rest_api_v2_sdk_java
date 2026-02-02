
# ConversationWebchatQueueStatusAgent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentStatus** | [**AgentStatusEnum**](#AgentStatusEnum) | Status of the agent |  [optional]
**conversationParticipantArn** | **String** |  |  [optional]
**conversationParticipantName** | **String** |  |  [optional]
**lastChatDts** | **String** | Date/time that this agent took their last chat |  [optional]
**nextRoundRobin** | **Boolean** |  |  [optional]
**profileImageUrl** | **String** | Profile image URL |  [optional]


<a name="AgentStatusEnum"></a>
## Enum: AgentStatusEnum
Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
BUSY | &quot;busy&quot;
UNAVAILABLE | &quot;unavailable&quot;



