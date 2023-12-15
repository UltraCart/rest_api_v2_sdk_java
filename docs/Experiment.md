
# Experiment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerId** | **String** | Contained ID where the experiment element was located |  [optional]
**durationDays** | **Integer** | Duration in days |  [optional]
**endDts** | **String** | End date/time |  [optional]
**equalWeighting** | **Boolean** | Whether or not traffic is equally weighted or shifts over time during the experiment |  [optional]
**experimentType** | **String** | The type of experiment |  [optional]
**id** | **String** | Experiment id |  [optional]
**name** | **String** | Experiment name |  [optional]
**notes** | **String** | Notes about the experiment |  [optional]
**objective** | **String** | Objective that is being optimized |  [optional]
**objectiveParameter** | **String** | Objective parameter (such as event name) that is being optimized |  [optional]
**openaiCurrentIteration** | **Integer** | The current iteration of the OpenAI related experiment |  [optional]
**openaiElementType** | [**OpenaiElementTypeEnum**](#OpenaiElementTypeEnum) | The type of OpenAI element being experimented on |  [optional]
**openaiModel** | **String** | The type of OpenAI model used |  [optional]
**openaiTotalIterations** | **Integer** | The total number of iterations to perform on the experiment |  [optional]
**optimizationType** | **String** | Type of optimization |  [optional]
**p95SessionsNeeded** | **Integer** | Estimated sessions needed to achieve P95 |  [optional]
**pValue** | [**BigDecimal**](BigDecimal.md) | Statistics p-value for the experiment |  [optional]
**sessionCount** | **Integer** | Total number of sessions in the experiment |  [optional]
**startDts** | **String** | Start date/time |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the experiment |  [optional]
**storefrontExperimentOid** | **Integer** | Storefront Experiment Oid |  [optional]
**storefrontOid** | **Integer** | Storefront oid |  [optional]
**uri** | **String** | URI the experiment was started on |  [optional]
**variations** | [**List&lt;ExperimentVariation&gt;**](ExperimentVariation.md) | Variations being tested in the experiment |  [optional]


<a name="OpenaiElementTypeEnum"></a>
## Enum: OpenaiElementTypeEnum
Name | Value
---- | -----
HEADLINE | &quot;headline&quot;
TEXT | &quot;text&quot;
TEXTBLOCK | &quot;textblock&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RUNNING | &quot;Running&quot;
ENDED | &quot;Ended&quot;
DELETED | &quot;Deleted&quot;



