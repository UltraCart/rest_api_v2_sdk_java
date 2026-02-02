
# ConversationAgentProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ai** | **Boolean** | AI powered chat bot |  [optional]
**aiCapabilities** | [**ConversationVirtualAgentCapabilities**](ConversationVirtualAgentCapabilities.md) |  |  [optional]
**aiChatInstructions** | **String** | Additional instructions for this AI when handle web chats |  [optional]
**aiPersona** | **String** | Persona of this AI agent |  [optional]
**aiSmsInstructions** | **String** | Additional instructions for this AI when handle SMS messages |  [optional]
**aiTicketInstructions** | **String** | Additional instructions for this AI when handling ticket draft replies |  [optional]
**aiVoiceInstructions** | **String** | Additional voice instructions for this AI when handling voice calls |  [optional]
**aiVoicePersonality** | [**AiVoicePersonalityEnum**](#AiVoicePersonalityEnum) | Which AI voice personality to use when handling the call. |  [optional]
**chatLimit** | **Integer** | The number of engagement chats that can be pushed on them at any given time. |  [optional]
**defaultLanguageIsoCode** | **String** | The default language the agent is chatting in |  [optional]
**defaultStatus** | [**DefaultStatusEnum**](#DefaultStatusEnum) | Default status when the agent loads conversations app. |  [optional]
**displayName** | **String** | An alternate name that the agent wants to use in chat. |  [optional]
**name** | **String** | Their actual user name for profile settings display as placeholder test |  [optional]
**profileImageUploadKey** | **String** | An upload key used to update the profile image. |  [optional]
**profileImageUrl** | **String** | Their current profile image URL |  [optional]
**userId** | **Integer** | User ID associated with the agent.  Populated by getAgentProfiles call only. |  [optional]
**zohodeskClassifications** | **List&lt;String&gt;** | Restrict this agent to drafting replies only to tickets with these classifications |  [optional]
**zohodeskDepartments** | **List&lt;String&gt;** | Restrict this agent to drafting replies only to these department ids |  [optional]


<a name="AiVoicePersonalityEnum"></a>
## Enum: AiVoicePersonalityEnum
Name | Value
---- | -----
ARA | &quot;Ara&quot;
REX | &quot;Rex&quot;
SAL | &quot;Sal&quot;
EVE | &quot;Eve&quot;
LEO | &quot;Leo&quot;


<a name="DefaultStatusEnum"></a>
## Enum: DefaultStatusEnum
Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
BUSY | &quot;busy&quot;
UNAVAILABLE | &quot;unavailable&quot;



