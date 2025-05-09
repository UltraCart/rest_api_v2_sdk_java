

# ConversationMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**authorConversationParticipantArn** | **String** |  |  [optional] |
|**authorConversationParticipantName** | **String** |  |  [optional] |
|**body** | **String** |  |  [optional] |
|**clientMessageId** | **String** |  |  [optional] |
|**conversationMessageUuid** | **String** |  |  [optional] |
|**delayUntilDts** | **String** | Delay message transmission until date/time |  [optional] |
|**languageIsoCode** | **String** |  |  [optional] |
|**mediaUrls** | **List&lt;String&gt;** |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**messageDts** | **String** | Message date/time |  [optional] |
|**messageEpoch** | **Long** | Message epoch milliseconds |  [optional] |
|**translations** | [**List&lt;ConversationMessageTranslation&gt;**](ConversationMessageTranslation.md) |  |  [optional] |
|**transportStatuses** | [**List&lt;ConversationMessageTransportStatus&gt;**](ConversationMessageTransportStatus.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Message type |  [optional] |
|**uploadKeys** | **List&lt;String&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MESSAGE | &quot;message&quot; |
| NOTICE | &quot;notice&quot; |
| ENGAGEMENT_PROMPT | &quot;engagement prompt&quot; |



