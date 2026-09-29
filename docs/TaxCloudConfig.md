

# TaxCloudConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiKey** | **String** | TaxCloud API key |  [optional] |
|**connectionId** | **String** | TaxCloud Connection ID (a UUID) identifying the TaxCloud connection to use; a test connection and a production connection have different IDs |  [optional] |
|**defaultTic** | **String** | Default TaxCloud TIC (Taxability Information Code), used for items that do not have their own TIC; blank lets TaxCloud apply its default (0, general goods) |  [optional] |
|**estimateOnly** | **Boolean** | True if this TaxCloud configuration is to estimate taxes only and not report placed orders to TaxCloud |  [optional] |
|**lastTestDts** | **String** | Date/time of the connection test to TaxCloud |  [optional] |
|**shippingTic** | **String** | TaxCloud TIC used to classify shipping/handling charges (11000 &#x3D; shipping and handling); blank means shipping is not taxed |  [optional] |
|**testResults** | **String** | Test results of the last connection test to TaxCloud |  [optional] |



