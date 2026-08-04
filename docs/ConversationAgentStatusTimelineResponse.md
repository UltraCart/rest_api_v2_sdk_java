

# ConversationAgentStatusTimelineResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callEvents** | [**List&lt;ConversationAgentCallEvent&gt;**](ConversationAgentCallEvent.md) | PBX call records for the agent on the requested day |  [optional] |
|**chatEvents** | [**List&lt;ConversationAgentChatEvent&gt;**](ConversationAgentChatEvent.md) | Chat conversations for the agent on the requested day |  [optional] |
|**error** | [**Error**](Error.md) |  |  [optional] |
|**metadata** | [**ResponseMetadata**](ResponseMetadata.md) |  |  [optional] |
|**statusEvents** | [**List&lt;ConversationAgentStatusEvent&gt;**](ConversationAgentStatusEvent.md) | Status transitions for the agent on the requested day |  [optional] |
|**success** | **Boolean** | Indicates if API call was successful |  [optional] |
|**summary** | [**TimelineSummary**](TimelineSummary.md) |  |  [optional] |
|**warning** | [**Warning**](Warning.md) |  |  [optional] |



