
# WorkflowTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignedToGroup** | **String** | Assigned to group |  [optional]
**assignedToGroupId** | **Integer** | Assigned to group ID |  [optional]
**assignedToUser** | **String** | Assigned to user |  [optional]
**assignedToUserId** | **Integer** | Assigned to user ID |  [optional]
**attachments** | [**List&lt;WorkflowAttachment&gt;**](WorkflowAttachment.md) | Attachments to the Workflow Task |  [optional]
**createdBy** | [**WorkflowUser**](WorkflowUser.md) |  |  [optional]
**createdDts** | **String** | Date/time that the workflow task was created |  [optional]
**delayUntilDts** | **String** | Date/time that the workflow task should delay until |  [optional]
**dueDts** | **String** | Date/time that the workflow task is due |  [optional]
**histories** | [**List&lt;WorkflowTaskHistory&gt;**](WorkflowTaskHistory.md) | Array of history records for the task |  [optional]
**lastUpdateDts** | **String** | Date/time that the workflow task was last updated |  [optional]
**merchantId** | **String** | Merchant ID |  [optional]
**notes** | [**List&lt;WorkflowNote&gt;**](WorkflowNote.md) | Notes on the Workflow Task |  [optional]
**objectEmail** | **String** | Object is associated with customer email |  [optional]
**objectId** | **String** | Object ID |  [optional]
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | Object Type |  [optional]
**objectUrl** | **String** | Object URL |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | Priority |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the workflow task |  [optional]
**taskDetails** | **String** | Task Details |  [optional]
**taskName** | **String** | Task Name |  [optional]
**workflowTaskUuid** | **String** | Workflow Task UUID |  [optional]


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



