
# ConversationMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorConversationParticipantArn** | **String** |  |  [optional]
**authorConversationParticipantName** | **String** |  |  [optional]
**body** | **String** |  |  [optional]
**clientMessageId** | **String** |  |  [optional]
**conversationMessageUuid** | **String** |  |  [optional]
**mediaUrls** | **List&lt;String&gt;** |  |  [optional]
**merchantId** | **String** |  |  [optional]
**messageDts** | **String** | Message date/time |  [optional]
**transportStatuses** | [**List&lt;ConversationMessageTransportStatus&gt;**](ConversationMessageTransportStatus.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Message type |  [optional]
**uploadKeys** | **List&lt;String&gt;** |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
MESSAGE | &quot;message&quot;
NOTICE | &quot;notice&quot;



