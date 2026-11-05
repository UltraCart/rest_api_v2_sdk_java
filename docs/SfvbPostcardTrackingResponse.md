

# SfvbPostcardTrackingResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cards** | [**List&lt;SfvbPostcardCard&gt;**](SfvbPostcardCard.md) | This page of cards. |  [optional] |
|**customerData** | **String** | masked, or shown when show_customer_data was sent. |  [optional] |
|**notes** | **List&lt;String&gt;** | What to keep in mind, such as how to handle customer data that is shown. |  [optional] |
|**page** | **Integer** | The page number, from 1. |  [optional] |
|**pageCost** | **BigDecimal** | The total cost of the cards on this page. |  [optional] |
|**pageSize** | **Integer** | Cards per page. |  [optional] |
|**postcardUuid** | **String** | The postcard. |  [optional] |
|**totalCards** | **Integer** | How many cards have been mailed for this postcard. |  [optional] |
|**totalPages** | **Integer** | How many pages there are. |  [optional] |



