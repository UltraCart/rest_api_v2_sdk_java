
# ConversationWebsocketMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationUuid** | **String** | Conversation UUID if the websocket message is tied to a specific conversation |  [optional]
**eventConversationClosed** | [**ConversationSummary**](ConversationSummary.md) |  |  [optional]
**eventNewConversation** | [**ConversationSummary**](ConversationSummary.md) |  |  [optional]
**eventNewMessage** | [**ConversationSummary**](ConversationSummary.md) |  |  [optional]
**eventQueuePosition** | [**ConversationEventQueuePosition**](ConversationEventQueuePosition.md) |  |  [optional]
**eventQueueStatusUpdate** | [**ConversationWebchatQueueStatus**](ConversationWebchatQueueStatus.md) |  |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of event |  [optional]
**eventUpdatedMessage** | [**ConversationMessage**](ConversationMessage.md) |  |  [optional]
**message** | [**ConversationMessage**](ConversationMessage.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of message |  [optional]


<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
QUEUE_POSITION | &quot;queue position&quot;
WEBCHAT_START_CONVERSATION | &quot;webchat start conversation&quot;
CONVERSATION_CLOSED | &quot;conversation closed&quot;
NEW_CONVERSATION | &quot;new conversation&quot;
NEW_MESSAGE | &quot;new message&quot;
UPDATED_MESSAGE | &quot;updated message&quot;
QUEUE_STATUS_UPDATE | &quot;queue status update&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
MESSAGE | &quot;message&quot;
EVENT | &quot;event&quot;
PING | &quot;ping&quot;


