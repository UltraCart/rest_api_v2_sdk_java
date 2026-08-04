

# ConversationPbxCallAiToolCall


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**calledAtDts** | **String** | Timestamp when the tool was called |  [optional] |
|**completedAtDts** | **String** | Timestamp when the tool call completed |  [optional] |
|**durationMs** | **Integer** | Duration of the tool call in milliseconds |  [optional] |
|**errorMessage** | **String** | Error message if the tool call failed |  [optional] |
|**parameters** | **Object** | Parameters passed to the tool (structure varies by tool) |  [optional] |
|**result** | **Object** | Result returned by the tool (structure varies by tool) |  [optional] |
|**success** | **Boolean** | Whether the tool call succeeded |  [optional] |
|**toolCallUuid** | **String** | Unique identifier for this tool call |  [optional] |
|**toolName** | **String** | Name of the tool that was called |  [optional] |



