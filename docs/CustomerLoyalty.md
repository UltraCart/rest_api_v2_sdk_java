

# CustomerLoyalty


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currentPoints** | **Integer** | Current points |  [optional] |
|**internalGiftCertificate** | [**GiftCertificate**](GiftCertificate.md) |  |  [optional] |
|**internalGiftCertificateBalance** | **String** | Loyalty Cashback / Store credit balance (internal gift certificate balance) |  [optional] |
|**internalGiftCertificateOid** | **Integer** | Internal gift certificate oid used to tracking loyalty cashback / store credit. |  [optional] |
|**ledgerEntries** | [**List&lt;CustomerLoyaltyLedger&gt;**](CustomerLoyaltyLedger.md) | Ledger entries |  [optional] |
|**loyaltyTierExpirationDts** | **String** | Loyalty tier expiration date (read only because of SDK addition) |  [optional] |
|**loyaltyTierName** | **String** | Loyalty tier name |  [optional] |
|**loyaltyTierOid** | **Integer** | Loyalty tier oid (set to zero to remove the tier) |  [optional] |
|**pendingPoints** | **Integer** | Pending Points |  [optional] |
|**redemptions** | [**List&lt;CustomerLoyaltyRedemption&gt;**](CustomerLoyaltyRedemption.md) | Redemptions |  [optional] |



