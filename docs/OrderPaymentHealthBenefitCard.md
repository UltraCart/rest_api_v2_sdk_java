
# OrderPaymentHealthBenefitCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**healthBenefitCardExpirationMonth** | **Integer** | Health benefit card expiration month (1-12) |  [optional]
**healthBenefitCardExpirationYear** | **Integer** | Health benefit card expiration year (Four digit year) |  [optional]
**healthBenefitCardNumber** | **String** | Health benefit card number (masked to last 4) |  [optional]
**healthBenefitCardNumberToken** | **String** | Health benefit card number token from hosted fields used to update the health benefit card number |  [optional]
**healthBenefitCardNumberTruncated** | **Boolean** | True if the health benefit card has been truncated |  [optional]
**healthBenefitCardVerificationNumberToken** | **String** | Health benefit card verification number token from hosted fields, only for import/insert of new orders, completely ignored for updates, and always null/empty for queries |  [optional]



