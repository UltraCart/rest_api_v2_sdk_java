
# ConversationMcpServer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authMethod** | [**AuthMethodEnum**](#AuthMethodEnum) | Authorization Method |  [optional]
**basicPassword** | **String** | Basic password |  [optional]
**basicUserName** | **String** | Basic user name |  [optional]
**headerName** | **String** | Header name |  [optional]
**headerValue** | **String** | Header value |  [optional]
**mcpServerUuid** | **String** | UUID of the MCP server configuration |  [optional]
**priority** | **Integer** | Priority on which the MCP server tools are incorporated into the model.  Lower number comes first |  [optional]
**url** | **String** | URL to the MCP server (must be https) |  [optional]


<a name="AuthMethodEnum"></a>
## Enum: AuthMethodEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
HEADER | &quot;header&quot;
BASIC | &quot;basic&quot;



