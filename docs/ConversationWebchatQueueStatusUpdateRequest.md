

# ConversationWebchatQueueStatusUpdateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentStatus** | [**AgentStatusEnum**](#AgentStatusEnum) | Status of the agent |  [optional] |
|**customStatusName** | **String** | Custom status display name (denormalized so the queue panel can render without a config lookup) |  [optional] |
|**customStatusUuid** | **String** | Custom status uuid (when picking a custom status). Pair with custom_status_name. |  [optional] |



## Enum: AgentStatusEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| BUSY | &quot;busy&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



