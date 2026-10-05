

# SfvbLibraryAiReview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**findings** | [**List&lt;SfvbLibraryManifestFinding&gt;**](SfvbLibraryManifestFinding.md) | What the reviewers found.  detail is the category followed by the quoted evidence. |  [optional] |
|**promptVersion** | **String** | Version of the review policy that produced this verdict. |  [optional] |
|**reviewedDts** | **String** | When the review ran, ISO 8601. |  [optional] |
|**screenshotSha256** | **String** | The screenshot the review looked at, or absent when there was none. |  [optional] |
|**summary** | **String** | One or two sentences explaining the verdict. |  [optional] |
|**verdict** | [**VerdictEnum**](#VerdictEnum) | approve, block, human or error.  block refuses any publish.  human or error refuses a public publish and is recorded on a shared one. |  [optional] |



## Enum: VerdictEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;approve&quot; |
| BLOCK | &quot;block&quot; |
| HUMAN | &quot;human&quot; |
| ERROR | &quot;error&quot; |



