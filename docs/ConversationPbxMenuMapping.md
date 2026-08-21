

# ConversationPbxMenuMapping


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Action |  [optional] |
|**actionTarget** | **String** | Action target.  This is the UUID associated with the configuration object of that particular type. |  [optional] |
|**digits** | **Integer** | Digits |  [optional] |
|**smsFromNumber** | **String** | Optional phone number to send the text message from.  Must be a phone number configured on this merchant account and SMS enabled.  Defaults to the number the caller dialed.  Only used when the action is &#39;send text&#39;. |  [optional] |
|**speech** | **String** | Speech |  [optional] |
|**textMessage** | **String** | Text message body sent to the caller when the action is &#39;send text&#39;.  Ignored for all other actions. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| TIME_BASED | &quot;time based&quot; |
| MENU | &quot;menu&quot; |
| QUEUE | &quot;queue&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| AGENT | &quot;agent&quot; |
| SEND_TEXT | &quot;send text&quot; |



