

# AutoOrderRebillResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoOrder** | [**AutoOrder**](AutoOrder.md) |  |  [optional] |
|**error** | [**Error**](Error.md) |  |  [optional] |
|**failureReason** | **String** | Why the rebill attempt did not succeed |  [optional] |
|**metadata** | [**ResponseMetadata**](ResponseMetadata.md) |  |  [optional] |
|**rebillAttempted** | **Boolean** | True if a rebill was attempted during this call |  [optional] |
|**rebillOrderId** | **String** | The order id created by a successful rebill |  [optional] |
|**rebillSuccess** | **Boolean** | True if the rebill attempt produced an order |  [optional] |
|**success** | **Boolean** | Indicates if API call was successful |  [optional] |
|**warning** | [**Warning**](Warning.md) |  |  [optional] |



