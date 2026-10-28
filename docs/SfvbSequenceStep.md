

# SfvbSequenceStep


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**branches** | [**List&lt;SfvbSequenceBranch&gt;**](SfvbSequenceBranch.md) | Its two sides, for a condition, split or InboxGeek step.  Absent for every other type. |  [optional] |
|**configError** | **Boolean** | True when the step&#39;s settings could not be read. |  [optional] |
|**configJson** | **String** | The step&#39;s settings as the admin stores them.  A webhook&#39;s header and parameter values are masked. |  [optional] |
|**configMerchantNotes** | **String** | A note stored inside the step&#39;s settings, when there is one. |  [optional] |
|**disabled** | **Boolean** | True when the step is switched off in its settings. |  [optional] |
|**emailUuids** | **List&lt;String&gt;** | The emails it sends.  One for an email step, one per variant for an experiment. |  [optional] |
|**filterProfileEquationJson** | **String** | The step&#39;s audience filter as stored, when it has one. |  [optional] |
|**hashSha256** | **String** | The hash of the step&#39;s type, stored settings and audience filter.  Send it back as If-Match when changing the step. |  [optional] |
|**itemIds** | **List&lt;String&gt;** | The items it names, for a cart or rate limiter step. |  [optional] |
|**label** | **String** | The type as the admin names it, such as Time Delay.  The type itself for one it doesn&#39;t know. |  [optional] |
|**listUuids** | **List&lt;String&gt;** | The lists it subscribes or unsubscribes, for a list step. |  [optional] |
|**merchantNotes** | **String** | The note stored on the step. |  [optional] |
|**name** | **String** | The step&#39;s own display name from its settings, when it has one. |  [optional] |
|**numberWaiting** | **Integer** | How many customers are waiting on this step now.  Only when waiting counts were asked for. |  [optional] |
|**postcardUuid** | **String** | The postcard it sends, for a postcard step. |  [optional] |
|**stepUuid** | **String** | The step uuid. |  [optional] |
|**type** | **String** | The step type, such as email, wait, condition or webhook. |  [optional] |
|**unreachable** | **Boolean** | True for a step no branch leads to.  Listed at the end so nothing is hidden. |  [optional] |



