

# SfvbFlowBackfillRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | Count who would be enrolled and enroll nobody. |  [optional] |
|**flowUuid** | **String** | The flow.  Used by a flow.backfill approval request.  The backfill call takes it from the path. |  [optional] |
|**orderDaysOld** | **Integer** | For an order trigger, how many days of orders to enroll, 1 to 90 (default 5). |  [optional] |
|**relativeToEvent** | **Boolean** | For an order trigger, shorten the flow&#39;s first wait by each order&#39;s age. |  [optional] |



