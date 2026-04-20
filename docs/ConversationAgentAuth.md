

# ConversationAgentAuth


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chatAdmin** | **Boolean** |  |  [optional] |
|**chatUser** | **Boolean** |  |  [optional] |
|**conversationParticipantArn** | **String** |  |  [optional] |
|**conversationParticipantName** | **String** |  |  [optional] |
|**customerProfile** | **Boolean** |  |  [optional] |
|**defaultPhoneNumber** | **String** | The default phone number this agent should use when making an outbound call. |  [optional] |
|**groupIds** | **List&lt;Integer&gt;** | UltraCart Groups this user belongs to |  [optional] |
|**jwt** | **String** |  |  [optional] |
|**merchantId** | **String** |  |  [optional] |
|**merchants** | [**List&lt;ConversationAgentAuthMerchant&gt;**](ConversationAgentAuthMerchant.md) | List of merchants in this linked merchant group |  [optional] |
|**parentMerchantId** | **String** | The parent merchant ID for PBX. For non-linked merchants, equals merchant_id. |  [optional] |
|**pbxAdmin** | **Boolean** |  |  [optional] |
|**pbxJwt** | **String** |  |  [optional] |
|**pbxSupervisor** | **Boolean** |  |  [optional] |
|**pbxUser** | **Boolean** |  |  [optional] |
|**pbxVoiceIdentity** | **String** |  |  [optional] |
|**pbxVoiceToken** | **String** |  |  [optional] |
|**pbxWorkerToken** | **String** |  |  [optional] |
|**pbxWorkerTokenV2** | **String** |  |  [optional] |
|**twilioAccounts** | [**List&lt;ConversationTwilioAccount&gt;**](ConversationTwilioAccount.md) |  |  [optional] |
|**userId** | **Integer** | UltraCart User ID |  [optional] |
|**websocketUrl** | **String** |  |  [optional] |



