

# SfvbRedirectCheckResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errors** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Findings that block the rule. |  [optional] |
|**source** | **String** | The source as it matches, lower case without a trailing index.html. |  [optional] |
|**type** | **String** | exact or pattern. |  [optional] |
|**valid** | **Boolean** | True when nothing blocks the rule. |  [optional] |
|**warnings** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Findings that do not block it.  A chain carries the final target as its suggestion. |  [optional] |



