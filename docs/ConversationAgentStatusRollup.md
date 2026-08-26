

# ConversationAgentStatusRollup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentName** | **String** | Agent display name |  [optional] |
|**agentUserId** | **String** | Agent user id |  [optional] |
|**availabilityPct** | **Object** |  |  [optional] |
|**availableSeconds** | **Long** | Seconds spent Available (incl. Busy per OVERVIEW reporting convention) |  [optional] |
|**callsTaken** | **Integer** | Calls handled by the agent on this day (PBX channel only) |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | Channel |  [optional] |
|**chatsHandled** | **Integer** | Chats handled by the agent on this day (chat channel only) |  [optional] |
|**rollupDate** | **String** | Day this rollup covers (YYYY-MM-DD) |  [optional] |
|**statusBreakdown** | **Object** | Per-status duration breakdown in seconds (status name -&gt; seconds) |  [optional] |
|**totalTrackedSeconds** | **Long** | Total seconds tracked across all statuses for the day |  [optional] |
|**unavailableSeconds** | **Long** | Seconds spent Unavailable |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| PBX | &quot;pbx&quot; |
| CHAT | &quot;chat&quot; |



