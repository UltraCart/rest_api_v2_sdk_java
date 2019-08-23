
# EmailCommseqStep

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**altChildEmailCommunicationSequenceSteps** | [**List&lt;EmailCommseqStep&gt;**](EmailCommseqStep.md) | Array of child steps for the alternate path |  [optional]
**childEmailCommunicationSequenceSteps** | [**List&lt;EmailCommseqStep&gt;**](EmailCommseqStep.md) | Array of child steps |  [optional]
**emailCommunicationSequenceStepUuid** | **String** | Email commseq step UUID |  [optional]
**filterProfileEquationJson** | **String** | Filter profile equation JSON |  [optional]
**stepConfigJson** | **String** | Arbitrary Configuration for a step |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of step |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BEGIN | &quot;begin&quot;
WAIT | &quot;wait&quot;
EMAIL | &quot;email&quot;
MERGE | &quot;merge&quot;
CONDITION | &quot;condition&quot;
END | &quot;end&quot;



