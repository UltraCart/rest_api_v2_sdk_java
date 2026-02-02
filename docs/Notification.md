
# Notification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canFilterByDistributionCenters** | **Boolean** | True if this notification can be filtered to only send for one or more distribution centers. |  [optional]
**canIncludeAffiliate** | **Boolean** | True if this notification can include an affiliate information. |  [optional]
**canIncludeOrder** | **Boolean** | True if this notification can include an order attachment. |  [optional]
**canIncludeOrderPlainText** | **Boolean** | True if this notification can include a plain text rendering of an order directly within an email.  Some desire this over an attachment |  [optional]
**distributionCenterFilters** | **List&lt;String&gt;** | If this notification supports it, this list of distribution center CODES will filter the notification to just those distribution centers. |  [optional]
**includeAffiliate** | **Boolean** | If true, and this notification supports it, affiliate information will be attached to all notifications of this type |  [optional]
**includeOrder** | **Boolean** | If true, and this notification supports it, the order will be attached to all notifications of this type |  [optional]
**includeOrderPlainText** | **Boolean** | If true, and this notification supports it, a plain text order will be directly inserted into all notifications of this type |  [optional]
**name** | **String** | The name of this notification. |  [optional]
**notificationGroup** | **String** | A group for this notification.  This name is only used for visual grouping within interfaces. |  [optional]
**selected** | **Boolean** | True if this user wishes to receive this email notification. |  [optional]



