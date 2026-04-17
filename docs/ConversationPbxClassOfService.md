

# ConversationPbxClassOfService


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**allowedCountries** | **List&lt;String&gt;** | E.164 country calling codes (e.g. 1 for US/Canada, 44 for UK). Empty means domestic only. |  [optional] |
|**blockPremiumNumbers** | **Boolean** | Block calls to 900, 976, premium-rate, and shortcode destinations |  [optional] |
|**conversationPbxClassOfServiceUuid** | **String** | Class of Service unique identifier |  [optional] |
|**defaultFlag** | **Boolean** | If true, this CoS applies to all agents without an explicit cos_uuid. Only one per merchant. |  [optional] |
|**description** | **String** | Description of the class of service |  [optional] |
|**merchantId** | **String** | Merchant Id |  [optional] |
|**name** | **String** | Display name for the class of service |  [optional] |
|**outboundEnabled** | **Boolean** | Whether agents with this CoS can make outbound calls |  [optional] |
|**timeRangeUuid** | **String** | UUID of a time range. If set, outbound calls only permitted during those time windows. |  [optional] |



