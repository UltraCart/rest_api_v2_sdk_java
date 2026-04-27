

# AdjustInternalCertificateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adjustmentAmount** | **BigDecimal** | The adjustment amount |  [optional] |
|**description** | **String** | Description of this adjustment, 50 characters max |  [optional] |
|**entryDts** | **String** | Optional timestamp for the adjustment, defaults to current time |  [optional] |
|**expirationDays** | **Integer** | Optional expiration days from the entry_dts when these adjustment becomes worthless |  [optional] |
|**orderId** | **String** | Optional order id if this adjustment is related to a particular order |  [optional] |
|**vestingDays** | **Integer** | Optional days required for this adjustment to vest |  [optional] |



