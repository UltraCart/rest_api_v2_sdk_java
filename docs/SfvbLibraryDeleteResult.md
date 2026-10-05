

# SfvbLibraryDeleteResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**libraryOid** | **Integer** | The entry. |  [optional] |
|**result** | [**ResultEnum**](#ResultEnum) | deleted when the entry was private and never published or installed, so it is gone.  retired when it had been published or installed, so it was kept for the storefronts that use it and taken out of search. |  [optional] |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| DELETED | &quot;deleted&quot; |
| RETIRED | &quot;retired&quot; |



