

# SfvbCommsTwilioAccount


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountSid** | **String** | The Twilio account SID, AC followed by 32 hex digits.  It names the account, so it is also the target_id of a secret request for its auth token.  Required to create. |  [optional] |
|**aiTwimlAppSid** | **String** | The SID of the TwiML app UltraCart made for the AI agent.  Set by the server. |  [optional] |
|**apiKeyId** | **String** | The SID of the Twilio API key UltraCart made for this account.  Set by the server.  Its secret is never returned. |  [optional] |
|**apiKeyName** | **String** | The name of the Twilio API key UltraCart made for this account.  Set by the server. |  [optional] |
|**authToken** | **String** | The Twilio auth token.  A secret field.  Reads return a mask.  To set it, send a secret handle (sec_...) made for this account SID by POST secrets with sink twilio.account.auth_token.  Send the mask back, or leave it out, to keep it.  Required to create. |  [optional] |
|**espTwilioUuid** | **String** | UltraCart&#39;s id for the Twilio account.  Set by the server. |  [optional] |
|**inboundTwimlAppSid** | **String** | The SID of the TwiML app UltraCart made for inbound calls and SMS.  Set by the server. |  [optional] |
|**outboundTwimlAppSid** | **String** | The SID of the TwiML app UltraCart made for outbound calls.  Set by the server. |  [optional] |
|**phoneNumbers** | **List&lt;String&gt;** | The account&#39;s phone numbers UltraCart uses, in E.164 format.  Leave it out of an update to keep them; an update that sends it replaces them all. |  [optional] |
|**publicKeySid** | **String** | The SID of the voice encryption public key UltraCart registered with Twilio.  Set by the server.  The keys themselves are never returned. |  [optional] |
|**twilioWorkspaceSid** | **String** | The SID of the TaskRouter workspace the phone system uses, when it has one.  Set by the server. |  [optional] |



