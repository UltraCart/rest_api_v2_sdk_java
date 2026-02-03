
# ConversationPbxCosAuditLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | Action taken |  [optional]
**agentLogin** | **String** | Login of the agent who attempted the call |  [optional]
**auditLogUuid** | **String** | Audit log entry unique identifier |  [optional]
**classOfServiceName** | **String** | Name of the class of service (denormalized for display) |  [optional]
**classOfServiceUuid** | **String** | UUID of the class of service that was evaluated |  [optional]
**destination** | **String** | Phone number the agent tried to dial |  [optional]
**merchantId** | **String** | Merchant Id |  [optional]
**ruleTriggered** | [**RuleTriggeredEnum**](#RuleTriggeredEnum) | Rule that triggered the action |  [optional]
**supervisorLogin** | **String** | Login of supervisor who approved/denied (null for timeouts and direct blocks) |  [optional]
**timestamp** | **String** | ISO 8601 timestamp of the event |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
BLOCKED | &quot;blocked&quot;
OVERRIDE_REQUESTED | &quot;override_requested&quot;
OVERRIDE_APPROVED | &quot;override_approved&quot;
OVERRIDE_DENIED | &quot;override_denied&quot;
OVERRIDE_TIMEOUT | &quot;override_timeout&quot;


<a name="RuleTriggeredEnum"></a>
## Enum: RuleTriggeredEnum
Name | Value
---- | -----
OUTBOUND_DISABLED | &quot;outbound_disabled&quot;
TIME_RANGE | &quot;time_range&quot;
COUNTRY_BLOCKED | &quot;country_blocked&quot;
PREMIUM_BLOCKED | &quot;premium_blocked&quot;



