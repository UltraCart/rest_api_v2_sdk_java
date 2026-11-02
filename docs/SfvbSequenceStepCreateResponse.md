

# SfvbSequenceStepCreateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**backContainerUuid** | **String** | A post_card step&#39;s back, the container with owner type postcardback and this owner id. |  [optional] |
|**emailUuid** | **String** | The new email&#39;s uuid.  Its body is the email container with this owner id. |  [optional] |
|**frontContainerUuid** | **String** | A post_card step&#39;s front, the container with owner type postcardfront and this owner id. |  [optional] |
|**libraryFilesKept** | **List&lt;String&gt;** | The library item&#39;s files whose path already held a file, which was kept, not replaced. |  [optional] |
|**libraryFilesSkipped** | **List&lt;String&gt;** | The library item&#39;s files that weren&#39;t written because they aren&#39;t a PNG, JPEG or GIF image whose bytes match its name.  Only those images are copied from a library item. |  [optional] |
|**libraryFilesWritten** | **List&lt;String&gt;** | Storefront file paths the library item&#39;s files were written to.  A file already at its path is kept as it is and listed in library_files_kept instead. |  [optional] |
|**libraryItemOid** | **Integer** | The code library email item the new email started from (#1589), when one was given. |  [optional] |
|**notes** | **List&lt;String&gt;** | What to do next, such as writing the body, and customers already waiting on the step before it. |  [optional] |
|**postcardUuid** | **String** | A post_card step&#39;s new postcard (#1644). |  [optional] |
|**requiresReview** | **Boolean** | True when the new email must pass content review before it sends. |  [optional] |
|**step** | [**SfvbSequenceStep**](SfvbSequenceStep.md) |  |  [optional] |



