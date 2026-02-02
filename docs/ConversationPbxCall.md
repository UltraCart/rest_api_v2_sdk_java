

# ConversationPbxCall


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountSid** | **String** | Twilio account SID |  [optional] |
|**agents** | [**List&lt;ConversationPbxCallAgent&gt;**](ConversationPbxCallAgent.md) | List of agents who participated in this call |  [optional] |
|**aiAgentEngagements** | [**List&lt;ConversationPbxCallAiEngagement&gt;**](ConversationPbxCallAiEngagement.md) | List of AI agent engagements during the call |  [optional] |
|**callSid** | **String** | Twilio call SID for the primary (customer) call leg |  [optional] |
|**callUuid** | **String** | Unique identifier for this call record |  [optional] |
|**caller** | [**ConversationPbxCallCaller**](ConversationPbxCallCaller.md) |  |  [optional] |
|**conferenceSid** | **String** | Twilio conference SID if this call used conferencing |  [optional] |
|**createdAtDts** | **String** | Timestamp when the call record was created |  [optional] |
|**customerName** | **String** | Customer name associated with this call |  [optional] |
|**customerProfileOid** | **String** | UltraCart customer profile OID if the caller was matched to a customer |  [optional] |
|**disposition** | **String** | Call disposition describing how the call ended |  [optional] |
|**email** | **String** | Email address of the caller if known |  [optional] |
|**financial** | [**ConversationPbxCallFinancial**](ConversationPbxCallFinancial.md) |  |  [optional] |
|**holds** | [**List&lt;ConversationPbxCallHold&gt;**](ConversationPbxCallHold.md) | List of hold events during the call |  [optional] |
|**merchantId** | **String** | Merchant identifier |  [optional] |
|**recordingSids** | **List&lt;String&gt;** | List of all Twilio recording SIDs associated with this call |  [optional] |
|**recordings** | [**List&lt;ConversationPbxCallRecording&gt;**](ConversationPbxCallRecording.md) | List of recordings made during the call |  [optional] |
|**routing** | [**ConversationPbxCallRouting**](ConversationPbxCallRouting.md) |  |  [optional] |
|**status** | **String** | Final status of the call |  [optional] |
|**timeline** | [**ConversationPbxCallTimeline**](ConversationPbxCallTimeline.md) |  |  [optional] |
|**transfers** | [**List&lt;ConversationPbxCallTransfer&gt;**](ConversationPbxCallTransfer.md) | List of transfer events during the call |  [optional] |
|**updatedAtDts** | **String** | Timestamp when the call record was last updated |  [optional] |



