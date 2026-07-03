

# ConversationEmbedPbxAuthResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**merchantId** | **String** | Merchant identifier the agent belongs to. |  [optional] |
|**pbxAdmin** | **Boolean** | True if this agent has PBX admin privileges. |  [optional] |
|**pbxJwt** | **String** | JWT used by the softphone widget to authenticate to the PBX WebSocket relay. |  [optional] |
|**pbxSupervisor** | **Boolean** | True if this agent has PBX supervisor privileges. |  [optional] |
|**pbxUser** | **Boolean** | True if this agent has baseline PBX access. |  [optional] |
|**pbxVoiceIdentity** | **String** | Voice identity string identifying this agent to the PBX (e.g., client:user_123). |  [optional] |



