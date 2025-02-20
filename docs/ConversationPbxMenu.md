
# ConversationPbxMenu

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowDirectExtensions** | **Boolean** | If true, the customer is allowed to input direct extensions within this menu |  [optional]
**conversationPbxMenuUuid** | **String** | Conversation Pbx Menu UUID |  [optional]
**defaultAction** | **String** | The default action for this menu |  [optional]
**defaultActionTarget** | **String** | The default action target for this menu |  [optional]
**mappings** | [**List&lt;ConversationPbxMenuMapping&gt;**](ConversationPbxMenuMapping.md) | Action mappings for this menu |  [optional]
**merchantId** | **String** | Merchant Id |  [optional]
**name** | **String** | Menu name |  [optional]
**playAudioUuid** | **String** | An optional audio clip that plays when a customer enters this menu |  [optional]
**say** | **String** | An optional saying that plays when a customer enters this menu |  [optional]
**sayVoice** | [**SayVoiceEnum**](#SayVoiceEnum) | say voice |  [optional]
**timeout** | **Integer** | The idle seconds before this menu times out |  [optional]


<a name="SayVoiceEnum"></a>
## Enum: SayVoiceEnum
Name | Value
---- | -----
MAN | &quot;man&quot;
WOMAN | &quot;woman&quot;



