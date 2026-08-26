

# SfvbValidationResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errors** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Problems that will prevent a write. |  [optional] |
|**usedElements** | **List&lt;String&gt;** | Element types found in the document, sorted. |  [optional] |
|**valid** | **Boolean** | True when there are no errors.  Warnings do not affect this flag. |  [optional] |
|**warnings** | [**List&lt;SfvbErrorDetail&gt;**](SfvbErrorDetail.md) | Quality problems that will not prevent a write but should be addressed. |  [optional] |



