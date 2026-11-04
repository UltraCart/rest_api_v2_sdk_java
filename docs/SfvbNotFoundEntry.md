

# SfvbNotFoundEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**botHits** | **Integer** | Bot hits since bot counting began on this entry.  Empty when not yet counted. |  [optional] |
|**botShare** | **Object** | bot_hits divided by counted_hits, 0 to 1.  Empty when not yet counted. |  [optional] |
|**countedHits** | **Integer** | Hits since bot counting began, the base for bot_share. |  [optional] |
|**firstSeenDts** | **String** | First hit, ISO 8601. |  [optional] |
|**fixed** | **Boolean** | True when the entry is marked fixed or mapped.  The next hit on the path clears it. |  [optional] |
|**hits** | **Integer** | Every recorded hit, bots included. |  [optional] |
|**ignored** | **Boolean** | True when the entry is ignored and no longer counts. |  [optional] |
|**lastSeenDts** | **String** | Latest hit, ISO 8601. |  [optional] |
|**notFoundId** | **String** | The entry&#39;s id. |  [optional] |
|**path** | **String** | The path, without its query string.  Token-like segments show as {token} unless asked for. |  [optional] |
|**redirectedTo** | **String** | Where a redirect rule now sends this path, when one does. |  [optional] |
|**referrerHosts** | **List&lt;String&gt;** | Hosts of the pages that linked to it. |  [optional] |



