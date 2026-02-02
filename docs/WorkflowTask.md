
# WorkflowTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assignedToGroup** | **String** | Assigned to group |  [optional]
**assignedToGroupId** | **Integer** | Assigned to group ID |  [optional]
**assignedToUser** | **String** | Assigned to user |  [optional]
**assignedToUserId** | **Integer** | Assigned to user ID |  [optional]
**assignedToUserOrGroup** | **String** | Assigned to user or group (used for sorting) |  [optional]
**attachments** | [**List&lt;WorkflowAttachment&gt;**](WorkflowAttachment.md) | Attachments to the Workflow Task |  [optional]
**createdBy** | [**WorkflowUser**](WorkflowUser.md) |  |  [optional]
**createdDts** | **String** | Date/time that the workflow task was created |  [optional]
**delayUntilDts** | **String** | Date/time that the workflow task should delay until |  [optional]
**dependantWorkflowTaskUuid** | **String** | Dependant Workflow Task UUID (must be completed before this task can be completed) |  [optional]
**dueDts** | **String** | Date/time that the workflow task is due |  [optional]
**expirationDts** | **String** | Date/time that the workflow task will expire and be closed.  This is set by system generated tasks. |  [optional]
**globalTaskNumber** | **Integer** | Global task number |  [optional]
**histories** | [**List&lt;WorkflowTaskHistory&gt;**](WorkflowTaskHistory.md) | Array of history records for the task |  [optional]
**lastUpdateDts** | **String** | Date/time that the workflow task was last updated |  [optional]
**merchantId** | **String** | Merchant ID |  [optional]
**notes** | [**List&lt;WorkflowNote&gt;**](WorkflowNote.md) | Notes on the Workflow Task |  [optional]
**objectEmail** | **String** | Object is associated with customer email |  [optional]
**objectId** | **String** | Object ID |  [optional]
**objectTaskNumber** | **Integer** | Object specific task number |  [optional]
**objectType** | [**ObjectTypeEnum**](#ObjectTypeEnum) | Object Type |  [optional]
**objectUrl** | **String** | Object URL |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | Priority |  [optional]
**properties** | [**List&lt;Property&gt;**](Property.md) | Properties |  [optional]
**relatedWorkflowTaskUuid** | **String** | Related Workflow Task UUID |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the workflow task |  [optional]
**systemTaskType** | [**SystemTaskTypeEnum**](#SystemTaskTypeEnum) | Constant for the type of system generated task |  [optional]
**tags** | **List&lt;String&gt;** | Tags |  [optional]
**taskContext** | **String** | User friendly string of the task context |  [optional]
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
STOREFRONT | &quot;storefront&quot;


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
CLOSED_SYSTEM | &quot;closed - system&quot;
CLOSED_CUSTOMER | &quot;closed - customer&quot;
CLOSED_EXPIRATION | &quot;closed - expiration&quot;


<a name="SystemTaskTypeEnum"></a>
## Enum: SystemTaskTypeEnum
Name | Value
---- | -----
ORDER_ACCOUNTS_RECEIVABLE | &quot;order_accounts_receivable&quot;
ORDER_FRAUD_REVIEW | &quot;order_fraud_review&quot;
AUTO_ORDER_CARD_UPDATE_ISSUE | &quot;auto_order_card_update_issue&quot;
AUTO_ORDER_CANCELED_PAYMENT | &quot;auto_order_canceled_payment&quot;
ITEM_LOW_STOCK | &quot;item_low_stock&quot;
ITEM_OUT_OF_STOCK | &quot;item_out_of_stock&quot;



