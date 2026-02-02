

# CustomerStoreCredit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**available** | **BigDecimal** | Available store credit which is defined as unused and vested |  [optional] |
|**expiring** | **BigDecimal** | Amount of store credit expiring within 30 days |  [optional] |
|**futureLedgers** | [**List&lt;CustomerStoreCreditLedgerEntry&gt;**](CustomerStoreCreditLedgerEntry.md) | Array of future ledger entries including expiring entries |  [optional] |
|**pastLedgers** | [**List&lt;CustomerStoreCreditLedgerEntry&gt;**](CustomerStoreCreditLedgerEntry.md) | Array of past ledger entries including accrual, usage, and expiring entries |  [optional] |
|**total** | **BigDecimal** | Total lifetime store credit for this customer. |  [optional] |
|**vesting** | **BigDecimal** | Amount of store credit vesting |  [optional] |



