

# SfvbApproval


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | **String** | The gated action. |  [optional] |
|**approvalId** | **String** | Send this as the Approval-Id header on the gated call once status is approved. |  [optional] |
|**approvalUrl** | **String** | The page where the person approves or denies.  Show it to them.  Never open or fill it in yourself. |  [optional] |
|**createdAt** | **String** | When the request was made, ISO 8601 UTC. |  [optional] |
|**description** | **String** | The sentence the person reads before approving.  Written by the server, not the agent. |  [optional] |
|**expiresAt** | **String** | When this approval stops being usable, ISO 8601 UTC.  For a pending request, when it lapses undecided.  For an approved one, when it must have been used by. |  [optional] |
|**expiresInSeconds** | **Integer** | Seconds until expires_at.  Zero once passed. |  [optional] |
|**freshCodeRequired** | **Boolean** | True when the person must enter a new 2FA code for this request even inside an approval session. |  [optional] |
|**intervalSeconds** | **Integer** | Poll no more often than this. |  [optional] |
|**outcome** | [**OutcomeEnum**](#OutcomeEnum) | Once used, succeeded or failed.  Used with no outcome means the result is unknown.  Check the target and never send the call again with this approval. |  [optional] |
|**outcomeCode** | **String** | The error code the gated call failed with. |  [optional] |
|**outcomeHttpStatus** | **Integer** | The HTTP status the gated call answered with. |  [optional] |
|**params** | [**SfvbApprovalParams**](SfvbApprovalParams.md) |  |  [optional] |
|**reason** | **String** | The reason the agent sent, as stored and shown (cleaned and capped). |  [optional] |
|**review** | [**SfvbApprovalReview**](SfvbApprovalReview.md) |  |  [optional] |
|**scope** | **String** | Where the action applies.  The storefront host name, or account for account-wide actions. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | reviewing, pending, approved, denied, cancelled, expired, used or refused.  Only approved may be sent with the gated call.  A script write starts as reviewing while UltraCart reviews it; keep polling, and show approval_url only once it is pending.  refused means the review refused the script; outcome_code and review say why. |  [optional] |
|**storefrontOid** | **Integer** | The storefront the action runs on.  Absent for account-wide actions. |  [optional] |
|**usedAt** | **String** | When the gated call used this approval, ISO 8601 UTC. |  [optional] |
|**userCode** | **String** | Short matching code.  Print it next to approval_url so the person can check the page shows the same code. |  [optional] |



## Enum: OutcomeEnum

| Name | Value |
|---- | -----|
| SUCCEEDED | &quot;succeeded&quot; |
| FAILED | &quot;failed&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| REVIEWING | &quot;reviewing&quot; |
| PENDING | &quot;pending&quot; |
| APPROVED | &quot;approved&quot; |
| DENIED | &quot;denied&quot; |
| CANCELLED | &quot;cancelled&quot; |
| EXPIRED | &quot;expired&quot; |
| USED | &quot;used&quot; |
| REFUSED | &quot;refused&quot; |



