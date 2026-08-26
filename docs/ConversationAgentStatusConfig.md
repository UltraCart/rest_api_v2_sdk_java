

# ConversationAgentStatusConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** | Whether the status is active and selectable. DELETE soft-deactivates by setting this to false. |  [optional] |
|**channel** | [**ChannelEnum**](#ChannelEnum) | Channel this status applies to |  [optional] |
|**color** | **String** | Hex color for UI (e.g. &#39;#FF5733&#39;) |  [optional] |
|**conversationStatusUuid** | **String** | Conversation agent status unique identifier |  [optional] |
|**createdAt** | **String** | Created at |  [optional] |
|**icon** | **String** | Icon name |  [optional] |
|**merchantId** | **String** | Merchant Id |  [optional] |
|**name** | **String** | Display name shown to agents |  [optional] |
|**parentStatus** | **String** | Channel-native parent status |  [optional] |
|**routingEffect** | [**RoutingEffectEnum**](#RoutingEffectEnum) | Canonical routing semantic. Derived server-side from (channel, parent_status). |  [optional] |
|**sortOrder** | **Integer** | Sort order in lists; lower &#x3D; first |  [optional] |
|**twilioActivitySid** | **String** | Twilio TaskRouter Activity SID (PBX-only; null for chat-only statuses) |  [optional] |
|**updatedAt** | **String** | Updated at |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| PBX | &quot;pbx&quot; |
| CHAT | &quot;chat&quot; |
| BOTH | &quot;both&quot; |



## Enum: RoutingEffectEnum

| Name | Value |
|---- | -----|
| AVAILABLE | &quot;available&quot; |
| BUSY | &quot;busy&quot; |
| UNAVAILABLE | &quot;unavailable&quot; |



