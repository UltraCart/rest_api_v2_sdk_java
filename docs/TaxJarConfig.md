
# TaxJarConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | True if TaxJar is active for this merchant |  [optional]
**apiKey** | **String** | TaxJar API key |  [optional]
**estimateOnly** | **Boolean** | True if this TaxJar configuration is to estimate taxes only and not report placed orders to TaxJar |  [optional]
**sendOutsideNexus** | **Boolean** | Send orders outside your nexus TaxJar.  The default is to not transmit outside orders to TaxJar to reduce API calls.  However, this will prevent TaxJar from dynamically creating new Nexus when thresholds are exceeded for a state. |  [optional]
**sendTestOrders** | **Boolean** | Send test orders through to TaxJar.  The default is to not transmit test orders to TaxJar. |  [optional]
**skipChannelOrders** | **Boolean** | Do not send channel partner orders to TaxJar.  Set this to true if your channel partner reports tax on their own. |  [optional]
**useDistributionCenterFrom** | **Boolean** | Use distribution center from address |  [optional]



