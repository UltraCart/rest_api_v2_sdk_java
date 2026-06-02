

# ConversationAgentStatusHeatmapRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | [**ChannelEnum**](#ChannelEnum) | Optional channel filter |  [optional] |
|**dateEnd** | **String** | Range end (YYYY-MM-DD) |  [optional] |
|**dateStart** | **String** | Range start (YYYY-MM-DD) |  [optional] |
|**metric** | [**MetricEnum**](#MetricEnum) | Cell metric |  [optional] |



## Enum: ChannelEnum

| Name | Value |
|---- | -----|
| PBX | &quot;pbx&quot; |
| CHAT | &quot;chat&quot; |



## Enum: MetricEnum

| Name | Value |
|---- | -----|
| AVAILABILITY | &quot;availability&quot; |
| CALL_VOLUME | &quot;call_volume&quot; |
| CHAT_VOLUME | &quot;chat_volume&quot; |



