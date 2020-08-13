
# EmailCommseqStep

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**altChildEmailCommunicationSequenceSteps** | [**List&lt;EmailCommseqStep&gt;**](EmailCommseqStep.md) | Array of child steps for the alternate path |  [optional]
**childEmailCommunicationSequenceSteps** | [**List&lt;EmailCommseqStep&gt;**](EmailCommseqStep.md) | Array of child steps |  [optional]
**emailCommunicationSequenceStepUuid** | **String** | Email commseq step UUID |  [optional]
**emailPendingReview** | **Boolean** | True if the content of the email associated with this step is pending review by UltraCart |  [optional]
**emailRejected** | **Boolean** | True if the content of the email associated with this step was rejected during review by UltraCart |  [optional]
**emailRequiresReview** | **Boolean** | True if the content of the email associated with this step requires review by UltraCart |  [optional]
**filterProfileEquationJson** | **String** | Filter profile equation JSON |  [optional]
**merchantNotes** | **String** | Internal merchant notes |  [optional]
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



