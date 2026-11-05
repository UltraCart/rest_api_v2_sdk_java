

# SfvbCommsTestPostcardRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address1** | **String** | The street address. |  [optional] |
|**address2** | **String** | The second address line. |  [optional] |
|**cartItemIds** | **List&lt;String&gt;** | Items for a cart flow&#39;s card. |  [optional] |
|**city** | **String** | The city. |  [optional] |
|**dryRun** | **Boolean** | Check everything, including that postcards are turned on, and show the cost, without mailing or using an approval. |  [optional] |
|**mailCard** | **Boolean** | Must be true.  Without it nothing is mailed; use the postcard proof to see the card. |  [optional] |
|**name** | **String** | The recipient&#39;s name. |  [optional] |
|**orderId** | **String** | A test order to render an order flow&#39;s card with.  A real customer&#39;s order is refused. |  [optional] |
|**postalCode** | **String** | The postal code. |  [optional] |
|**state** | **String** | The state. |  [optional] |



