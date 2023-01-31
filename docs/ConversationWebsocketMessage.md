
# ConversationWebsocketMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationUuid** | **String** | Conversation UUID if the websocket message is tied to a specific conversation |  [optional]
**eventAddCoupon** | [**ConversationEventAddCoupon**](ConversationEventAddCoupon.md) |  |  [optional]
**eventAddItem** | [**ConversationEventAddItem**](ConversationEventAddItem.md) |  |  [optional]
**eventConversationClosed** | [**ConversationSummary**](ConversationSummary.md) |  |  [optional]
**eventEngageCustomer** | [**ConversationWebchatQueueStatusQueueEntry**](ConversationWebchatQueueStatusQueueEntry.md) |  |  [optional]
**eventNewConversation** | [**ConversationSummary**](ConversationSummary.md) |  |  [optional]
**eventNewMessage** | [**ConversationSummary**](ConversationSummary.md) |  |  [optional]
**eventParticipantJoin** | [**ConversationSummary**](ConversationSummary.md) |  |  [optional]
**eventParticipantJoinParticipant** | [**ConversationParticipant**](ConversationParticipant.md) |  |  [optional]
**eventParticipantLeft** | [**ConversationSummary**](ConversationSummary.md) |  |  [optional]
**eventParticipantLeftParticipant** | [**ConversationParticipant**](ConversationParticipant.md) |  |  [optional]
**eventParticipantUpdate** | [**ConversationSummary**](ConversationSummary.md) |  |  [optional]
**eventQueuePosition** | [**ConversationEventQueuePosition**](ConversationEventQueuePosition.md) |  |  [optional]
**eventQueueStatusUpdate** | [**ConversationWebchatQueueStatus**](ConversationWebchatQueueStatus.md) |  |  [optional]
**eventReadMessage** | [**ConversationEventReadMessage**](ConversationEventReadMessage.md) |  |  [optional]
**eventRrweb** | [**ConversationEventRRWeb**](ConversationEventRRWeb.md) |  |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of event |  [optional]
**eventTyping** | [**ConversationEventTyping**](ConversationEventTyping.md) |  |  [optional]
**eventUpdatedMessage** | [**ConversationMessage**](ConversationMessage.md) |  |  [optional]
**eventWebchatContext** | [**ConversationEventWebchatContext**](ConversationEventWebchatContext.md) |  |  [optional]
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
RRWEB | &quot;rrweb&quot;
PARTICIPANT_UPDATE | &quot;participant update&quot;
PARTICIPANT_JOIN | &quot;participant join&quot;
PARTICIPANT_LEFT | &quot;participant left&quot;
READ_MESSAGE | &quot;read message&quot;
TYPING | &quot;typing&quot;
ADD_COUPON | &quot;add coupon&quot;
ADD_ITEM | &quot;add item&quot;
WEBCHAT_CONTEXT | &quot;webchat context&quot;
ENGAGE_CUSTOMER | &quot;engage customer&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
MESSAGE | &quot;message&quot;
EVENT | &quot;event&quot;
PING | &quot;ping&quot;
CHECK_QUEUE_POSITION | &quot;check queue position&quot;



