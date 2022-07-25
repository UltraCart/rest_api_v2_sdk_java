

# ConversationWebsocketMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversationUuid** | **String** | Conversation UUID if the websocket message is tied to a specific conversation |  [optional] |
|**eventConversationClosed** | [**Conversation**](Conversation.md) |  |  [optional] |
|**eventNewConversation** | [**Conversation**](Conversation.md) |  |  [optional] |
|**eventNewMessage** | [**Conversation**](Conversation.md) |  |  [optional] |
|**eventQueuePosition** | [**ConversationEventQueuePosition**](ConversationEventQueuePosition.md) |  |  [optional] |
|**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of event |  [optional] |
|**eventUpdatedMessage** | [**ConversationMessage**](ConversationMessage.md) |  |  [optional] |
|**message** | [**ConversationMessage**](ConversationMessage.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of message |  [optional] |



## Enum: EventTypeEnum

| Name | Value |
|---- | -----|
| QUEUE_POSITION | &quot;queue position&quot; |
| WEBCHAT_START_CONVERSATION | &quot;webchat start conversation&quot; |
| CONVERSATION_CLOSED | &quot;conversation closed&quot; |
| NEW_CONVERSATION | &quot;new conversation&quot; |
| NEW_MESSAGE | &quot;new message&quot; |
| UPDATED_MESSAGE | &quot;updated message&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MESSAGE | &quot;message&quot; |
| EVENT | &quot;event&quot; |
| PING | &quot;ping&quot; |



