

# SfvbApprovalCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | The gated action to approve. |  [optional] |
|**params** | [**SfvbApprovalParams**](SfvbApprovalParams.md) |  |  [optional] |
|**reason** | **String** | Why the agent wants to do this, in a sentence.  Shown to the person as unverified text, capped at 500 characters. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| FILE_DELETE | &quot;file.delete&quot; |
| BLOG_POST_DELETE | &quot;blog_post.delete&quot; |



