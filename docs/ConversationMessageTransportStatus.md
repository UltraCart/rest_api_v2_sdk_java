
# ConversationMessageTransportStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversationParticipantArn** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the message transport |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACCEPTED | &quot;accepted&quot;
SCHEDULED | &quot;scheduled&quot;
QUEUED | &quot;queued&quot;
SENDING | &quot;sending&quot;
SENT | &quot;sent&quot;
READ | &quot;read&quot;
TWILIO_CREDENTIALS_MISSING | &quot;TWILIO_CREDENTIALS_MISSING&quot;
SENT_TO_TWILIO | &quot;SENT_TO_TWILIO&quot;
TWILIO_ERROR | &quot;TWILIO_ERROR&quot;
SENT_TO_PINPOINT | &quot;SENT_TO_PINPOINT&quot;
PINPOINT_ERROR | &quot;PINPOINT_ERROR&quot;



