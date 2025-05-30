

# Conversation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**baseLanguageIsoCode** | **String** | The base language iso code for the StoreFront that everything is translated into |  [optional] |
|**closed** | **Boolean** |  |  [optional] |
|**conversationArn** | **String** |  |  [optional] |
|**conversationUuid** | **String** |  |  [optional] |
|**customerFirstMessageUnrespondedToDts** | **String** | Date/time of the first customer message that is unresponded to. |  [optional] |
|**lastConversationMessageBody** | **String** |  |  [optional] |
|**lastConversationParticipantArn** | **String** |  |  [optional] |
|**lastConversationParticipantName** | **String** |  |  [optional] |
|**lastInteractiveMessageDts** | **String** | Last interactive message date/time |  [optional] |
|**lastMessageDts** | **String** | Last message date/time |  [optional] |
|**medium** | [**MediumEnum**](#MediumEnum) | The communication medium of the customer. |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**messageCount** | **Integer** |  |  [optional] |
|**messages** | [**List&lt;ConversationMessage&gt;**](ConversationMessage.md) |  |  [optional] |
|**participants** | [**List&lt;ConversationParticipant&gt;**](ConversationParticipant.md) |  |  [optional] |
|**sentiment** | [**ConversationSentiment**](ConversationSentiment.md) |  |  [optional] |
|**startDts** | **String** | Start of the conversation date/time |  [optional] |
|**unreadMessages** | **Boolean** |  |  [optional] |
|**virtualAgent** | **Boolean** | True if a virtual agent answered the conversation |  [optional] |
|**virtualAgentCost** | **BigDecimal** | The cost of this conversation performed by the virtual agent |  [optional] |
|**visible** | **Boolean** |  |  [optional] |



## Enum: MediumEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| WEBSOCKET | &quot;websocket&quot; |



