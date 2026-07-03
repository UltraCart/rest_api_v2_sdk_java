

# ConversationPbxCallAgent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agentExtension** | **String** | Agent&#39;s phone extension |  [optional] |
|**agentId** | **String** | Unique identifier for the agent |  [optional] |
|**agentName** | **String** | Display name of the agent |  [optional] |
|**agentUserId** | **String** | UltraCart user id for the agent (denormalized at index time so reporting endpoints can join on agent_user_id without translating from the agent_id login). |  [optional] |
|**answered** | **Boolean** | Whether the agent answered the call |  [optional] |
|**callSid** | **String** | Twilio call SID for the agent&#39;s call leg |  [optional] |
|**joinedAtDts** | **String** | Timestamp when the agent joined the call |  [optional] |
|**leftAtDts** | **String** | Timestamp when the agent left the call |  [optional] |
|**role** | **String** | Role of the agent in the call |  [optional] |
|**workerSid** | **String** | Twilio TaskRouter worker SID |  [optional] |



