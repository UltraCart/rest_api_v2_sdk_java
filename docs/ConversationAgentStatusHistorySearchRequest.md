

# ConversationAgentStatusHistorySearchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentUserId** | **String** | Optional agent_user_id filter |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | Optional channel filter |  [optional] |
|**dateEnd** | **String** | Date range end (ISO 8601 or YYYY-MM-DD) |  [optional] |
|**dateStart** | **String** | Date range start (ISO 8601 or YYYY-MM-DD) |  [optional] |
|**status** | **String** | Optional new_status filter |  [optional] |
|**trigger** | [**TriggerEnum**](#TriggerEnum) | Optional trigger filter |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| PBX | &quot;pbx&quot; |
| CHAT | &quot;chat&quot; |



## Enum: TriggerEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;manual&quot; |
| SYSTEM | &quot;system&quot; |
| AUTO_DISCONNECT | &quot;auto_disconnect&quot; |



