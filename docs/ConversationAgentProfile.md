

# ConversationAgentProfile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ai** | **Boolean** | AI powered chat bot |  [optional] |
|**aiChatInstructions** | **String** | Additional instructions for this AI when handle web chats |  [optional] |
|**aiPersona** | **String** | Persona of this AI agent |  [optional] |
|**aiSmsInstructions** | **String** | Additional instructions for this AI when handle SMS messages |  [optional] |
|**chatLimit** | **Integer** | The number of engagement chats that can be pushed on them at any given time. |  [optional] |
|**defaultLanguageIsoCode** | **String** | The default language the agent is chatting in |  [optional] |
|**defaultStatus** | [**DefaultStatusEnum**](#DefaultStatusEnum) | Default status when the agent loads conversations app. |  [optional] |
|**displayName** | **String** | An alternate name that the agent wants to use in chat. |  [optional] |
|**name** | **String** | Their actual user name for profile settings display as placeholder test |  [optional] |
|**profileImageUploadKey** | **String** | An upload key used to update the profile image. |  [optional] |
|**profileImageUrl** | **String** | Their current profile image URL |  [optional] |
|**userId** | **Integer** | User ID associated with the agent.  Populated by getAgentProfiles call only. |  [optional] |



## Enum: DefaultStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| BUSY | &quot;busy&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



