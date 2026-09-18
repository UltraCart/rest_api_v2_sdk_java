

# SfvbExperimentStartRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**durationDays** | **Integer** | url - 3 to 90.  A url experiment always ends by itself after this many days. |  [optional] |
|**equalWeighting** | **Boolean** | url - true keeps the split fixed.  false shifts traffic toward the leader as the experiment runs.  Defaults to true. |  [optional] |
|**name** | **String** | url - experiment name. |  [optional] |
|**notes** | **String** | url - notes, such as the hypothesis being tested. |  [optional] |
|**objective** | **String** | url - one of the objectives from the objective list. |  [optional] |
|**objectiveParameter** | **String** | url - the event name, when the objective is Events. |  [optional] |
|**optimizationType** | **String** | url - MAXIMUM or MINIMUM. |  [optional] |
|**path** | **String** | page - path of the page whose body holds the experiment element. |  [optional] |
|**slot** | **String** | page - the body file&#39;s name without .cjson.  Defaults to body. |  [optional] |
|**type** | **String** | page or url. |  [optional] |
|**variations** | [**List&lt;SfvbExperimentStartVariation&gt;**](SfvbExperimentStartVariation.md) | url - 2 to 5 pages.  The first is the control. |  [optional] |
|**widgetId** | **String** | page - id of the experiment element in that body. |  [optional] |



