

# ConversationPbxVoicemailMessage


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callSid** | **String** | Call SID |  [optional] |
|**duration** | **Integer** | Duration in seconds |  [optional] |
|**from** | **String** | From phone number in E.164 |  [optional] |
|**fromCallerId** | **String** | From caller id (if available) |  [optional] |
|**listened** | **Boolean** | True if the voicemail has been listened to in the user interface |  [optional] |
|**merchantId** | **String** | Merchant ID |  [optional] |
|**recordingSid** | **String** | Recording SID |  [optional] |
|**recordingSizeBytes** | **Integer** | Recording size in bytes |  [optional] |
|**recordingStatus** | [**RecordingStatusEnum**](#RecordingStatusEnum) | Recording Status |  [optional] |
|**recordingUrl** | **String** | Recording URL (expires in 4 hours) |  [optional] |
|**transcriptJson** | **String** | JSON version of the transcript |  [optional] |
|**transcriptText** | **String** | Formatted text of the transcript |  [optional] |
|**voicemailDts** | **String** | Voicemail date/time |  [optional] |



## Enum: RecordingStatusEnum

| Name | Value |
|---- | -----|
| COMPLETED | &quot;completed&quot; |



