

# ConversationPbxCallRecording


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channels** | **Integer** | Number of audio channels in the recording (1 for mono, 2 for stereo/dual-channel) |  [optional] |
|**durationSeconds** | **Integer** | Duration of the recording in seconds |  [optional] |
|**isPrimary** | **Boolean** | Whether this is the primary recording for the call |  [optional] |
|**recordingS3Key** | **String** | S3 key for the recording audio file |  [optional] |
|**recordingSid** | **String** | Twilio recording SID |  [optional] |
|**recordingUrl** | **String** | URL to access the recording |  [optional] |
|**status** | **String** | Status of the recording |  [optional] |
|**transcript** | [**ConversationPbxCallTranscript**](ConversationPbxCallTranscript.md) |  |  [optional] |



