
# GiftCertificate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activated** | **Boolean** | True if this gift certificate is activated and ready to apply to purchases. |  [optional]
**code** | **String** | The code used by the customer to purchase against this gift certificate. |  [optional]
**deleted** | **Boolean** | True if this gift certificate was deleted. |  [optional]
**email** | **String** | Email of the customer associated with this gift certificate. |  [optional]
**expirationDts** | **String** | Expiration date time. |  [optional]
**giftCertificateOid** | **Integer** | Gift certificate oid. |  [optional]
**ledgerEntries** | [**List&lt;GiftCertificateLedgerEntry&gt;**](GiftCertificateLedgerEntry.md) | A list of all ledger activity for this gift certificate. |  [optional]
**merchantId** | **String** | Merchant Id |  [optional]
**merchantNote** | **String** | A list of all ledger activity for this gift certificate. |  [optional]
**originalBalance** | [**BigDecimal**](BigDecimal.md) | Original balance of the gift certificate. |  [optional]
**referenceOrderId** | **String** | The order used to purchase this gift certificate.  This value is ONLY set during checkout when a certificate is purchased, not when it is used.  Any usage is recorded in the ledger |  [optional]
**remainingBalance** | [**BigDecimal**](BigDecimal.md) | The remaining balance on the gift certificate.  This is never set directly, but calculated from the ledger.  To change the remaining balance, add a ledger entry. |  [optional]



