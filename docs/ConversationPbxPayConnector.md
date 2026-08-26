

# ConversationPbxPayConnector


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the connector |  [optional] |
|**environment** | [**EnvironmentEnum**](#EnvironmentEnum) | Environment the connector points at.  Only live connectors are returned.  Sandbox and unconfigured connectors are ignored. |  [optional] |
|**friendlyName** | **String** | Friendly name of the connector as shown in the Twilio console |  [optional] |
|**merchantId** | **String** | Merchant Id |  [optional] |
|**processor** | [**ProcessorEnum**](#ProcessorEnum) | Payment processor behind this connector |  [optional] |
|**processorAccountId** | **String** | The processor account this connector is bound to (Stripe connected account id or Braintree merchant id).  A payment captured with this connector can only be charged within this account. |  [optional] |
|**sid** | **String** | Twilio installed add-on SID for this connector |  [optional] |
|**uniqueName** | **String** | Unique name of the connector.  This is the value used for the paymentConnector attribute of the Twilio Pay verb. |  [optional] |



## Enum: EnvironmentEnum

| Name | Value |
|---- | -----|
| LIVE | &quot;live&quot; |



## Enum: ProcessorEnum

| Name | Value |
|---- | -----|
| STRIPE | &quot;stripe&quot; |
| BRAINTREE | &quot;braintree&quot; |
| GENERIC | &quot;generic&quot; |
| UNKNOWN | &quot;unknown&quot; |



