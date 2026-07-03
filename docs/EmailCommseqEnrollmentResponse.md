

# EmailCommseqEnrollmentResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alreadyEnrolled** | **Boolean** | True if the customer was already enrolled and therefore not enrolled again |  [optional] |
|**enrolled** | **Boolean** | True if the customer was newly enrolled into the sequence |  [optional] |
|**error** | [**Error**](Error.md) |  |  [optional] |
|**espCustomerUuid** | **String** | The resolved ESP customer UUID for the enrolled email |  [optional] |
|**metadata** | [**ResponseMetadata**](ResponseMetadata.md) |  |  [optional] |
|**success** | **Boolean** | Indicates if API call was successful |  [optional] |
|**warning** | [**Warning**](Warning.md) |  |  [optional] |



