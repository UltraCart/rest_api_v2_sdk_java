
# Experiment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerId** | **String** | Contained ID where the experiment element was located |  [optional]
**durationDays** | **Integer** | Duration in days |  [optional]
**endDts** | **String** | End date/time |  [optional]
**equalWeighting** | **Boolean** | Whether or not traffic is equally weighted or shifts over time during the experiment |  [optional]
**id** | **String** | Experiment id |  [optional]
**name** | **String** | Experiment name |  [optional]
**notes** | **String** | Notes about the experiment |  [optional]
**objective** | **String** | Objective that is being optimized |  [optional]
**optimizationType** | **String** | Type of optimization |  [optional]
**sessionCount** | **Integer** | Total number of sessions in the experiment |  [optional]
**startDts** | **String** | Start date/time |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the experiment |  [optional]
**storefrontExperimentOid** | **Integer** | Storefront Experiment Oid |  [optional]
**storefrontOid** | **Integer** | Storefront oid |  [optional]
**uri** | **String** | URI the experiment was started on |  [optional]
**variations** | [**List&lt;ExperimentVariation&gt;**](ExperimentVariation.md) | Variations being tested in the experiment |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RUNNING | &quot;Running&quot;
ENDED | &quot;Ended&quot;
DELETED | &quot;Deleted&quot;



