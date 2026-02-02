
# ConversationPbxCallTranscript

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fullTranscriptS3Key** | **String** | S3 key for the full transcript text file |  [optional]
**jobName** | **String** | AWS Transcribe job name |  [optional]
**languageCode** | **String** | Language code for transcription |  [optional]
**provider** | **String** | Transcription service provider |  [optional]
**segments** | [**List&lt;ConversationPbxCallTranscriptSegment&gt;**](ConversationPbxCallTranscriptSegment.md) | Transcript segments with speaker labels and timestamps |  [optional]
**status** | **String** | Status of the transcription |  [optional]
**transcriptJsonS3Key** | **String** | S3 key for the detailed transcript JSON with speaker diarization |  [optional]



