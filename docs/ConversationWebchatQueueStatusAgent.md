

# ConversationWebchatQueueStatusAgent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentStatus** | [**AgentStatusEnum**](#AgentStatusEnum) | Status of the agent |  [optional] |
|**agentUserId** | **String** | Agent user id (populated by Java so the dispatch-scheduler Lambda can read it directly without parsing conversation_participant_arn) |  [optional] |
|**conversationParticipantArn** | **String** |  |  [optional] |
|**conversationParticipantName** | **String** |  |  [optional] |
|**customStatusName** | **String** | Active custom status display name for this agent (denormalized) |  [optional] |
|**customStatusUuid** | **String** | Active custom status uuid for this agent (null when on a system status) |  [optional] |
|**lastChatDts** | **String** | Date/time that this agent took their last chat |  [optional] |
|**nextRoundRobin** | **Boolean** |  |  [optional] |
|**profileImageUrl** | **String** | Profile image URL |  [optional] |



## Enum: AgentStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| BUSY | &quot;busy&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



