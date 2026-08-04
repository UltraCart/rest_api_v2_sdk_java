

# ConversationAgentStatusHeatmapResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agents** | **List&lt;String&gt;** | Y-axis labels (one per agent) |  [optional] |
|**data** | **List&lt;Object&gt;** | Sparse cells. Each row is [agent_index, hour, value]; empty cells are omitted. |  [optional] |
|**error** | [**Error**](Error.md) |  |  [optional] |
|**hours** | **List&lt;Integer&gt;** | X-axis values (hours of day, 0-23) |  [optional] |
|**metadata** | [**ResponseMetadata**](ResponseMetadata.md) |  |  [optional] |
|**success** | **Boolean** | Indicates if API call was successful |  [optional] |
|**warning** | [**Warning**](Warning.md) |  |  [optional] |



