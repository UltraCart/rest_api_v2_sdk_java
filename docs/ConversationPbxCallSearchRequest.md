
# ConversationPbxCallSearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentIds** | **List&lt;String&gt;** | Filter by agent IDs |  [optional]
**customerName** | **String** | Filter by customer name |  [optional]
**direction** | **String** | Filter by call direction (inbound/outbound) |  [optional]
**disposition** | **String** | Filter by call disposition |  [optional]
**endDate** | **String** | Filter calls created on or before this date (ISO 8601) |  [optional]
**hasAiEngagement** | **Boolean** | Filter to calls with AI agent engagement |  [optional]
**hasRecording** | **Boolean** | Filter to calls that have a recording |  [optional]
**hasTranscript** | **Boolean** | Filter to calls that have a transcript |  [optional]
**maxDurationSeconds** | **Integer** | Filter by maximum call duration in seconds |  [optional]
**minDurationSeconds** | **Integer** | Filter by minimum call duration in seconds |  [optional]
**phoneNumber** | **String** | Filter by phone number (partial match supported) |  [optional]
**queueUuids** | **List&lt;String&gt;** | Filter by queue UUIDs |  [optional]
**searchTerm** | **String** | Free text search term - smart-routed based on content (phone, email, UUID, or general text) |  [optional]
**startDate** | **String** | Filter calls created on or after this date (ISO 8601) |  [optional]
**statuses** | **List&lt;String&gt;** | Filter by call statuses |  [optional]
**transcriptSearch** | **String** | Search within transcript text |  [optional]



