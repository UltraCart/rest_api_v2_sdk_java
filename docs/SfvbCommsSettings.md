

# SfvbCommsSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**hashSha256** | **String** | The hash of the settings.  Send it as If-Match to change them. |  [optional] |
|**machineOpenIgnore** | **Boolean** | True when opens by mail privacy proxies are ignored.  Account-wide; changed in the admin. |  [optional] |
|**marketingSender** | [**SfvbCommsSender**](SfvbCommsSender.md) |  |  [optional] |
|**postcardReturnAddress** | [**SfvbPostcardAddress**](SfvbPostcardAddress.md) |  |  [optional] |
|**postcardReturnAddressComplete** | **Boolean** | True when the name, street, city, state and postal code are all set.  Until then postcards fall back as the send code does. |  [optional] |
|**reviewsIoConfigured** | **Boolean** | True when a Reviews.io key is set for the account. |  [optional] |
|**smsPhoneNumber** | **String** | The default SMS number the admin offers for a new flow or campaign.  No send reads it.  An SMS step sends from its flow&#39;s or campaign&#39;s own number. |  [optional] |
|**smsTwilioUuid** | **String** | The Twilio account that holds sms_phone_number. |  [optional] |
|**transactionalSender** | [**SfvbCommsSender**](SfvbCommsSender.md) |  |  [optional] |



