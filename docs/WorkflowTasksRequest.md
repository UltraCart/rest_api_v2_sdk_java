
# WorkflowTasksRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignedToGroupId** | **Integer** | Assigned to group ID |  [optional]
**assignedToMe** | **Boolean** | Tasks are assigned to me either by direct user id or a group that the user is a member of |  [optional]
**assignedToUserId** | **Integer** | Assigned to user ID |  [optional]
**createdBy** | [**WorkflowUser**](WorkflowUser.md) |  |  [optional]
**createdDtsBegin** | **String** | Date/time that the workflow task was created |  [optional]
**createdDtsEnd** | **String** | Date/time that the workflow task was created |  [optional]
**delayUntilDtsBegin** | **String** | Date/time that the workflow task should delay until |  [optional]
**delayUntilDtsEnd** | **String** | Date/time that the workflow task should delay until |  [optional]
**dueDtsBegin** | **String** | Date/time that the workflow task is due |  [optional]
**dueDtsEnd** | **String** | Date/time that the workflow task is due |  [optional]
**lastUpdateDtsBegin** | **String** | Date/time that the workflow task was last updated |  [optional]
**lastUpdateDtsEnd** | **String** | Date/time that the workflow task was last updated |  [optional]
**objectEmail** | **String** | Object is associated with customer email |  [optional]
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | Object Type |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | Priority |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the workflow task |  [optional]
**unassigned** | **Boolean** | Tasks that are unassigned to a user or group |  [optional]


<a name="ObjectTypeEnum"></a>
## Enum: ObjectTypeEnum
Name | Value
---- | -----
ORDER | &quot;order&quot;
AUTO_ORDER | &quot;auto order&quot;
ITEM | &quot;item&quot;
CUSTOMER_PROFILE | &quot;customer profile&quot;


<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
_1_LOW | &quot;1 - low&quot;
_2_MEDIUM | &quot;2 - medium&quot;
_3_HIGH | &quot;3 - high&quot;
_4_CRITICAL | &quot;4 - critical&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
DELAYED | &quot;delayed&quot;
AWAITING_CUSTOMER_FEEDBACK | &quot;awaiting customer feedback&quot;



