

# SfvbApprovalReview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apis** | **List&lt;String&gt;** | Browser features the script uses that matter for safety, such as network calls, cookies, storage and dynamic code. |  [optional] |
|**domains** | **List&lt;String&gt;** | Every host the script names, found by UltraCart&#39;s scanner rather than the AI. |  [optional] |
|**findings** | [**List&lt;SfvbApprovalReviewFinding&gt;**](SfvbApprovalReviewFinding.md) | What the reviewers flagged, each with the line and the quoted code. |  [optional] |
|**newDomains** | **List&lt;String&gt;** | Hosts the current version of the file does not name. |  [optional] |
|**promptVersion** | **String** | Version of the review policy that produced this. |  [optional] |
|**reviewedAt** | **String** | When the review ran, ISO 8601 UTC. |  [optional] |
|**signals** | **List&lt;String&gt;** | Obfuscation, card field and credential signals the scanner found.  Credentials are named by kind, never by value. |  [optional] |
|**sizeBytes** | **Integer** | Size of the reviewed script in bytes. |  [optional] |
|**summary** | **String** | What the script does, in plain words, as the reviewers read it. |  [optional] |
|**verdict** | [**VerdictEnum**](#VerdictEnum) | approve when both reviewers found nothing, human when the person should look closely.  On a refused request, block when both reviewers found a clear violation, error when the review could not finish. |  [optional] |



## Enum: VerdictEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;approve&quot; |
| HUMAN | &quot;human&quot; |
| BLOCK | &quot;block&quot; |
| ERROR | &quot;error&quot; |



