

# ConversationAgentStatusEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentIdentifier** | **String** | Agent identifier â€” voice_identity for PBX (e.g. &#39;client:login&#39;), participant_arn for chat, synthetic &#39;ai:&lt;user_id&gt;&#39; for AI flag events. Stable across an agent&#39;s events; participates in DDB pk and GSI1 sk. |  [optional] |
|**agentName** | **String** | Agent display name at the time of the event |  [optional] |
|**agentType** | [**AgentTypeEnum**](#AgentTypeEnum) | Agent type |  [optional] |
|**agentUserId** | **String** | Agent user id (links across channels) |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | Channel |  [optional] |
|**customStatusName** | **String** | Custom status name (when applicable) |  [optional] |
|**customStatusUuid** | **String** | Custom status uuid (when applicable) |  [optional] |
|**durationInPreviousSeconds** | **Long** | Time spent in the previous status, in seconds |  [optional] |
|**eventDts** | **String** | Event timestamp (ISO 8601) |  [optional] |
|**eventUuid** | **String** | Event UUID (natural key for ES + BQ) |  [optional] |
|**merchantId** | **String** | Merchant Id |  [optional] |
|**newRoutingEffect** | [**NewRoutingEffectEnum**](#NewRoutingEffectEnum) | Canonical new routing semantic |  [optional] |
|**newStatus** | **String** | Channel-native new status name |  [optional] |
|**parentMerchantId** | **String** | Parent merchant id (denormalized for ES routing parity) |  [optional] |
|**previousRoutingEffect** | [**PreviousRoutingEffectEnum**](#PreviousRoutingEffectEnum) | Canonical previous routing semantic |  [optional] |
|**previousStatus** | **String** | Channel-native previous status name |  [optional] |
|**trigger** | [**TriggerEnum**](#TriggerEnum) | What triggered the transition |  [optional] |



## Enum: AgentTypeEnum

| Name | Value |
|---- | -----|
| HUMAN | &quot;human&quot; |
| AI | &quot;ai&quot; |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| PBX | &quot;pbx&quot; |
| CHAT | &quot;chat&quot; |



## Enum: NewRoutingEffectEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| BUSY | &quot;busy&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



## Enum: PreviousRoutingEffectEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| BUSY | &quot;busy&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



## Enum: TriggerEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;manual&quot; |
| SYSTEM | &quot;system&quot; |
| AUTO_DISCONNECT | &quot;auto_disconnect&quot; |



