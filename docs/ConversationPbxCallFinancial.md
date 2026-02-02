

# ConversationPbxCallFinancial


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aiAgentBilledMinutes** | **BigDecimal** | Total AI agent billed minutes for this call |  [optional] |
|**aiAgentCost** | **BigDecimal** | Total AI agent cost for this call |  [optional] |
|**aiAgentCostCurrency** | **String** | Currency for AI agent cost |  [optional] |
|**callCurrency** | **String** | Currency for call price (default USD) |  [optional] |
|**callPrice** | **BigDecimal** | Twilio call cost |  [optional] |
|**callPriceEstimated** | **Boolean** | True if call price is a fallback-rate estimate, false if Twilio-confirmed |  [optional] |
|**transcriptionCost** | **BigDecimal** | AWS Transcribe transcription cost |  [optional] |



