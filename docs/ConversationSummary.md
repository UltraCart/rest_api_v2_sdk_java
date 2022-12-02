
# ConversationSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**closed** | **Boolean** |  |  [optional]
**conversationArn** | **String** |  |  [optional]
**conversationUuid** | **String** |  |  [optional]
**customerFirstMessageUnrespondedToDts** | **String** | Date/time of the first customer message that is unresponded to. |  [optional]
**lastConversationMessageBody** | **String** |  |  [optional]
**lastConversationParticipantArn** | **String** |  |  [optional]
**lastConversationParticipantName** | **String** |  |  [optional]
**lastInteractiveMessageDts** | **String** | Last interactive message date/time |  [optional]
**lastMessageDts** | **String** | Last message date/time |  [optional]
**medium** | [**MediumEnum**](#MediumEnum) | The communication medium of the customer. |  [optional]
**merchantId** | **String** |  |  [optional]
**messageCount** | **Integer** |  |  [optional]
**participants** | [**List&lt;ConversationParticipant&gt;**](ConversationParticipant.md) |  |  [optional]
**startDts** | **String** | Start of the conversation date/time |  [optional]
**unreadMessages** | **Boolean** |  |  [optional]
**visible** | **Boolean** |  |  [optional]


<a name="MediumEnum"></a>
## Enum: MediumEnum
Name | Value
---- | -----
SMS | &quot;sms&quot;
WEBSOCKET | &quot;websocket&quot;



