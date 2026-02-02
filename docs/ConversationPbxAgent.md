

# ConversationPbxAgent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ai** | **Boolean** | Flag to indicate if the agent is AI |  [optional] |
|**callRoutingPreference** | [**CallRoutingPreferenceEnum**](#CallRoutingPreferenceEnum) | The call routing preference |  [optional] |
|**cellphone** | **String** | Cellphone number of agent in E.164 format |  [optional] |
|**conversationPbxAgentUuid** | **String** | Conversation Pbx Agent unique identifier |  [optional] |
|**defaultPhoneNumberUuid** | **String** | The default phone number that this agent should dial out to the PSTN with. |  [optional] |
|**extension** | **Integer** | Extension |  [optional] |
|**fullName** | **String** | Full name |  [optional] |
|**hardwarePhoneUuids** | **List&lt;String&gt;** | Array of hardware phones UUIDs associated with this agent |  [optional] |
|**login** | **String** | Agent login |  [optional] |
|**merchantId** | **String** | Merchant Id |  [optional] |
|**personalConversationPbxVoicemailMailboxUuid** | **String** | Personal Conversation Pbx Voicemail Mailbox UUID |  [optional] |
|**preferredHardwarePhoneUuid** | **String** | The hardware phone that will be dialed on an incoming call if routing preference is hardware_phone |  [optional] |
|**recordOutgoingAutomatically** | **Boolean** | True if outgoing calls should be automatically recorded |  [optional] |
|**sharedConversationPbxVoicemailMailboxUuid** | **String** | Shared Conversation Pbx Voicemail Mailbox UUID |  [optional] |
|**twilioTaskrouterWorkerId** | **String** | Twilio taskrouter worker Id |  [optional] |
|**unavailablePlayAudioUuid** | **String** | Unavailable play audio UUID |  [optional] |
|**unavailableSay** | **String** | Unavailable say |  [optional] |
|**unavailableSayVoice** | **String** | Unavailable say voice |  [optional] |
|**userId** | **Integer** | User Id |  [optional] |
|**voicemail** | **Boolean** | True if this agent has voicemail configured |  [optional] |



## Enum: CallRoutingPreferenceEnum

| Name | Value |
|---- | -----|
| SOFTPHONE | &quot;softphone&quot; |
| HARDWARE_PHONE | &quot;hardware_phone&quot; |
| CELLPHONE | &quot;cellphone&quot; |



