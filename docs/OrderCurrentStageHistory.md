

# OrderCurrentStageHistory


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**afterStage** | [**AfterStageEnum**](#AfterStageEnum) | New stage that the order is in. |  [optional] |
|**beforeStage** | [**BeforeStageEnum**](#BeforeStageEnum) | Previous stage that the order was in. |  [optional] |
|**transitionDts** | **String** | Date/time that the stage transitioned |  [optional] |



## Enum: AfterStageEnum

| Name | Value |
|---- | -----|
| ACCOUNTS_RECEIVABLE | &quot;Accounts Receivable&quot; |
| PENDING_CLEARANCE | &quot;Pending Clearance&quot; |
| FRAUD_REVIEW | &quot;Fraud Review&quot; |
| REJECTED | &quot;Rejected&quot; |
| SHIPPING_DEPARTMENT | &quot;Shipping Department&quot; |
| COMPLETED_ORDER | &quot;Completed Order&quot; |
| QUOTE_REQUEST | &quot;Quote Request&quot; |
| QUOTE_SENT | &quot;Quote Sent&quot; |
| LEAST_COST_ROUTING | &quot;Least Cost Routing&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| PRE_ORDERED | &quot;Pre-ordered&quot; |
| ADVANCED_ORDER_ROUTING | &quot;Advanced Order Routing&quot; |
| HOLD | &quot;Hold&quot; |



## Enum: BeforeStageEnum

| Name | Value |
|---- | -----|
| ACCOUNTS_RECEIVABLE | &quot;Accounts Receivable&quot; |
| PENDING_CLEARANCE | &quot;Pending Clearance&quot; |
| FRAUD_REVIEW | &quot;Fraud Review&quot; |
| REJECTED | &quot;Rejected&quot; |
| SHIPPING_DEPARTMENT | &quot;Shipping Department&quot; |
| COMPLETED_ORDER | &quot;Completed Order&quot; |
| QUOTE_REQUEST | &quot;Quote Request&quot; |
| QUOTE_SENT | &quot;Quote Sent&quot; |
| LEAST_COST_ROUTING | &quot;Least Cost Routing&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| PRE_ORDERED | &quot;Pre-ordered&quot; |
| ADVANCED_ORDER_ROUTING | &quot;Advanced Order Routing&quot; |
| HOLD | &quot;Hold&quot; |



