

# ConversationPbxQueue


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aiPriority** | [**AiPriorityEnum**](#AiPriorityEnum) | AI Agent Priority compared to human agents |  [optional] |
|**aiTimeoutSeconds** | **Integer** | AI timeout seconds |  [optional] |
|**announceQueuePosition** | **Boolean** | If true, the customer is told their queue position upon entering the queue |  [optional] |
|**automaticCoachAgentUuid** | **String** | AI Agent UUID to automatically engage to provide coaching |  [optional] |
|**conversationPbxQueueUuid** | **String** | Conversation Pbx Queue unique identifier |  [optional] |
|**conversationVoicemailMailboxUuid** | **String** | The voicemail mailbox associated with this queue |  [optional] |
|**holdConversationPbxAudioUuid** | **String** | The audio to play while holding in a queue |  [optional] |
|**maxHoldSeconds** | **Integer** | The maximum number of seconds for a customer to hold in a queue |  [optional] |
|**members** | [**ConversationPbxQueueMembers**](ConversationPbxQueueMembers.md) |  |  [optional] |
|**merchantId** | **String** | Merchant Id |  [optional] |
|**name** | **String** | Name of queue |  [optional] |
|**noAgentAvailablePlayAudioUuid** | **String** | When no agent is available after the max_hold_seconds, say this |  [optional] |
|**noAgentAvailableSay** | **String** | When no agent is available after the max_hold_seconds, say this |  [optional] |
|**noAgentAvailableSayVoice** | **String** | The type of voice used to say text when no agent is available |  [optional] |
|**playAudioUuid** | **String** | Audio played when customer enters a queue |  [optional] |
|**recordCall** | **Boolean** | If true, any calls in this queue are recorded |  [optional] |
|**say** | **String** | Say text when a customer enters queue |  [optional] |
|**sayVoice** | **String** | The type of voice to use when say text is spoken |  [optional] |
|**twilioTaskrouterWorkflowSid** | **String** | Twilio taskrouter workflow sid |  [optional] |
|**twilioWorkspaceQueueSid** | **String** | Twilio workspace queue sid |  [optional] |
|**voicemail** | **Boolean** | If true, this queue has a voicemail associated with it |  [optional] |
|**waitCriticalSeconds** | **Integer** | Wait time in seconds before critical |  [optional] |
|**waitWarningSeconds** | **Integer** | Wait time in seconds before warning |  [optional] |
|**wrapUpSeconds** | **Integer** | Wrap up time in seconds |  [optional] |



## Enum: AiPriorityEnum

| Name | Value |
|---- | -----|
| NEUTRAL | &quot;neutral&quot; |
| FIRST | &quot;first&quot; |
| BACKUP | &quot;backup&quot; |



