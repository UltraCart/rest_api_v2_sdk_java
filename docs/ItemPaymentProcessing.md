

# ItemPaymentProcessing


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blockPrepaid** | **Boolean** | True if prepaid cards should be blocked from buying this item |  [optional] |
|**blockRefunds** | **Boolean** | True if this item should block any refund attempts, set to false otherwise, null value will not update the field |  [optional] |
|**creditCardTransactionType** | **String** | Credit card transaction type |  [optional] |
|**hsaFsaEligibility** | **String** | HSA/FSA eligibility. eligible_with_lmn means the customer needs a Letter of Medical Necessity. Kept in sync automatically when Truemed is configured. Empty string clears it, null value will not update the field |  [optional] |
|**noRealtimeCharge** | **Boolean** | True if no real-time charge should be performed on this item. |  [optional] |
|**paymentMethodValidity** | **List&lt;String&gt;** | Payment method validity |  [optional] |
|**rotatingTransactionGatewayCodes** | **List&lt;String&gt;** | Rotating transaction gateway codes |  [optional] |



