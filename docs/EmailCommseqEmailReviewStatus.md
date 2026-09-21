

# EmailCommseqEmailReviewStatus


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**decidedDts** | **String** | Date the review was approved or rejected |  [optional] |
|**espCommseqEmailReviewUuid** | **String** | Review UUID |  [optional] |
|**espCommseqEmailUuid** | **String** | Email communication sequence email UUID |  [optional] |
|**espCommseqUuid** | **String** | Email communication sequence UUID |  [optional] |
|**rejectionReason** | **String** | Why the email was rejected, and what to change. Only present when the state is rejected. |  [optional] |
|**requestedDts** | **String** | Date the review was requested |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | State of the review |  [optional] |
|**subject** | **String** | Subject of the email as it was reviewed |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| NOT_SUBMITTED | &quot;not_submitted&quot; |
| PENDING | &quot;pending&quot; |
| APPROVED | &quot;approved&quot; |
| REJECTED | &quot;rejected&quot; |



