

# SfvbTemplateResolvePath


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**candidates** | [**List&lt;SfvbTemplateResolveCandidate&gt;**](SfvbTemplateResolveCandidate.md) | Every file of that name below this path, in the order the storefront searches. |  [optional] |
|**directoryFound** | **Boolean** | False when the theme has no such directory, so the storefront skips this path. |  [optional] |
|**match** | **String** | The candidate this path supplies, relative to the theme root, or null.  It is the first candidate that is not skipped. |  [optional] |
|**resourcePath** | **String** | The resource path, relative to the theme root.  / is the theme root itself. |  [optional] |



