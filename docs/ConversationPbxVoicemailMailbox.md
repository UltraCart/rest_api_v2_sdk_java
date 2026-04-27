

# ConversationPbxVoicemailMailbox


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contextMerchantId** | **String** | Optional child merchant ID this resource is assigned to. Null &#x3D; shared across the linked merchant group. |  [optional] |
|**conversationPbxVoicemailMailboxUuid** | **String** | Conversation Pbx Voicemail Mailbox UUID |  [optional] |
|**merchantId** | **String** | Merchant Id |  [optional] |
|**sendNoticesToChannel** | [**SendNoticesToChannelEnum**](#SendNoticesToChannelEnum) | Send notices to channel |  [optional] |
|**sendNoticesToEmail** | **String** | Send notices to email |  [optional] |
|**sendNoticesToZohoDeskDepartmentId** | **String** | Send notices to Zoho Desk department id |  [optional] |
|**userId** | **Integer** | User Id |  [optional] |
|**voicemailFollowupPlayAudioUuid** | **String** | Voicemail follow play audio UUID |  [optional] |
|**voicemailFollowupSay** | **String** | Voicemail followup say |  [optional] |
|**voicemailFollowupSayVoice** | [**VoicemailFollowupSayVoiceEnum**](#VoicemailFollowupSayVoiceEnum) | Voicemail followup say voice |  [optional] |
|**voicemailMailboxId** | **String** | Voicemail mailbox id |  [optional] |
|**voicemailMailboxType** | [**VoicemailMailboxTypeEnum**](#VoicemailMailboxTypeEnum) | Voicemail mailbox type |  [optional] |
|**voicemailPromptPlayAudioUuid** | **String** | Voicemail prompt play audio UUID |  [optional] |
|**voicemailPromptSay** | **String** | Voicemail prompt say |  [optional] |
|**voicemailPromptSayVoice** | [**VoicemailPromptSayVoiceEnum**](#VoicemailPromptSayVoiceEnum) | Voicemail prompt say voice |  [optional] |



## Enum: SendNoticesToChannelEnum

| Name | Value |
|---- | -----|
| NONE | &quot;none&quot; |
| EMAIL | &quot;email&quot; |
| ZOHO_DESK_TICKET | &quot;zoho_desk_ticket&quot; |
| ULTRACART_TASK | &quot;ultracart_task&quot; |



## Enum: VoicemailFollowupSayVoiceEnum

| Name | Value |
|---- | -----|
| MAN | &quot;man&quot; |
| WOMAN | &quot;woman&quot; |



## Enum: VoicemailMailboxTypeEnum

| Name | Value |
|---- | -----|
| AGENT | &quot;agent&quot; |
| SHARED | &quot;shared&quot; |



## Enum: VoicemailPromptSayVoiceEnum

| Name | Value |
|---- | -----|
| MAN | &quot;man&quot; |
| WOMAN | &quot;woman&quot; |



