

# SfvbSequence


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**communicationSequenceUuid** | **String** | The sequence uuid. |  [optional] |
|**live** | **Boolean** | True when its emails and postcards reach customers now. |  [optional] |
|**notes** | **List&lt;String&gt;** | Anything the read could not do, such as waiting counts that were unavailable. |  [optional] |
|**ownerName** | **String** | The campaign or flow name. |  [optional] |
|**ownerStatus** | **String** | The campaign or flow status. |  [optional] |
|**ownerType** | **String** | campaign or flow. |  [optional] |
|**ownerUuid** | **String** | The campaign or flow uuid. |  [optional] |
|**steps** | [**List&lt;SfvbSequenceStep&gt;**](SfvbSequenceStep.md) | The steps from the start, in order.  A branching step holds its sides in branches. |  [optional] |
|**waitingIncluded** | **Boolean** | True when number_waiting was filled in. |  [optional] |



