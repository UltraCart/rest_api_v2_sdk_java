

# ConversationVirtualAgentCapabilityCustomCollection


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aiDescription** | **String** | Merchant authored description of what is in this collection, which is what the agent sees when deciding whether to search it |  [optional] |
|**aiEnabled** | **Boolean** | True if this collection has been enabled for AI access in its own configuration.  A collection that is not enabled cannot be searched even if it is selected here. |  [optional] |
|**collectionName** | **String** | Merchant assigned name of the collection |  [optional] |
|**errorMessage** | **String** | Error from the last build, if it failed.  A collection with an error will return nothing to the agent, so this is worth surfacing next to the selection. |  [optional] |
|**lastUpdateDts** | **String** | Date/time the collection was last rebuilt from the merchant&#39;s BigQuery query |  [optional] |
|**recordCount** | **Integer** | Number of records loaded on the last build |  [optional] |
|**typesenseCustomCollectionOid** | **Integer** | The identifier to place in custom_collection_oids to grant the agent access to this collection |  [optional] |



