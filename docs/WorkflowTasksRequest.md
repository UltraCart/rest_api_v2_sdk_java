

# WorkflowTasksRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignedToGroup** | **String** | Assigned to group |  [optional] |
|**assignedToGroupId** | **Integer** | Assigned to group ID |  [optional] |
|**assignedToMe** | **Boolean** | Tasks are assigned to me either by direct user id or a group that the user is a member of |  [optional] |
|**assignedToUser** | **String** | Assigned to user |  [optional] |
|**assignedToUserId** | **Integer** | Assigned to user ID |  [optional] |
|**createdBy** | [**WorkflowUser**](WorkflowUser.md) |  |  [optional] |
|**createdDtsBegin** | **String** | Date/time that the workflow task was created |  [optional] |
|**createdDtsEnd** | **String** | Date/time that the workflow task was created |  [optional] |
|**delayUntilDtsBegin** | **String** | Date/time that the workflow task should delay until |  [optional] |
|**delayUntilDtsEnd** | **String** | Date/time that the workflow task should delay until |  [optional] |
|**dueDtsBegin** | **String** | Date/time that the workflow task is due |  [optional] |
|**dueDtsEnd** | **String** | Date/time that the workflow task is due |  [optional] |
|**lastUpdateDtsBegin** | **String** | Date/time that the workflow task was last updated |  [optional] |
|**lastUpdateDtsEnd** | **String** | Date/time that the workflow task was last updated |  [optional] |
|**objectEmail** | **String** | Object is associated with customer email |  [optional] |
|**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | Object Type |  [optional] |
|**priority** | [**PriorityEnum**](#PriorityEnum) | Priority |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the workflow task |  [optional] |
|**tags** | **List&lt;String&gt;** | Tasks that are tagged with the specified tags |  [optional] |
|**unassigned** | **Boolean** | Tasks that are unassigned to a user or group |  [optional] |



## Enum: ObjectTypeEnum

| Name | Value |
|---- | -----|
| ORDER | &quot;order&quot; |
| AUTO_ORDER | &quot;auto order&quot; |
| ITEM | &quot;item&quot; |
| CUSTOMER_PROFILE | &quot;customer profile&quot; |



## Enum: PriorityEnum

| Name | Value |
|---- | -----|
| _1_LOW | &quot;1 - low&quot; |
| _2_MEDIUM | &quot;2 - medium&quot; |
| _3_HIGH | &quot;3 - high&quot; |
| _4_CRITICAL | &quot;4 - critical&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;open&quot; |
| CLOSED | &quot;closed&quot; |
| DELAYED | &quot;delayed&quot; |
| AWAITING_CUSTOMER_FEEDBACK | &quot;awaiting customer feedback&quot; |



