

# ConversationAgentStatusSummaryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agents** | [**List&lt;AgentSummary&gt;**](AgentSummary.md) | Per-agent enriched summary (status totals + activity metrics) |  [optional] |
|**avgAvailablePct** | **Object** |  |  [optional] |
|**error** | [**Error**](Error.md) |  |  [optional] |
|**metadata** | [**ResponseMetadata**](ResponseMetadata.md) |  |  [optional] |
|**statusBreakdown** | **Object** | Total seconds-in-status across all agents, keyed by status name |  [optional] |
|**success** | **Boolean** | Indicates if API call was successful |  [optional] |
|**totalAgents** | **Integer** | Distinct agents with at least one transition in the range |  [optional] |
|**warning** | [**Warning**](Warning.md) |  |  [optional] |



