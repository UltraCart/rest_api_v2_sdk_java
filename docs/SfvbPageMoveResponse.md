

# SfvbPageMoveResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dryRun** | **Boolean** | True when nothing was moved. |  [optional] |
|**newPath** | **String** | The page&#39;s path after the move. |  [optional] |
|**page** | [**SfvbPageResponse**](SfvbPageResponse.md) |  |  [optional] |
|**pagesMoved** | **Integer** | How many pages moved, the page itself included. |  [optional] |
|**path** | **String** | The page&#39;s path before the move. |  [optional] |
|**redirect** | [**SfvbRedirect**](SfvbRedirect.md) |  |  [optional] |
|**redirectSource** | **String** | The pattern the old addresses redirect from, when a redirect was asked for. |  [optional] |
|**warnings** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Findings that did not block the move, such as a redirect chain. |  [optional] |



