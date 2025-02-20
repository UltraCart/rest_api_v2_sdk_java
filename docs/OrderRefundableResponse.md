
# OrderRefundableResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**Error**](Error.md) |  |  [optional]
**itemLevelRefundReasonRequired** | **Boolean** | True if the item level refund reason is required |  [optional]
**itemLevelRefundReasons** | [**List&lt;OrderReason&gt;**](OrderReason.md) | Reason codes available at the item level. |  [optional]
**itemLevelReturnReasons** | [**List&lt;OrderReason&gt;**](OrderReason.md) | Return codes available at the item level. |  [optional]
**manualBecauseMultipleCharges** | **Boolean** | If true, this refund will have to be manually done because of additional charges with the virtual terminal were made |  [optional]
**metadata** | [**ResponseMetadata**](ResponseMetadata.md) |  |  [optional]
**orderLevelRefundReasonRequired** | **Boolean** | True if the order level refund reason is required |  [optional]
**orderLevelRefundReasons** | [**List&lt;OrderReason&gt;**](OrderReason.md) | Reason codes available at the order level. |  [optional]
**orderLevelRejectReasonRequired** | **Boolean** | True if the order level reject reason is required |  [optional]
**orderLevelRejectReasons** | [**List&lt;OrderReason&gt;**](OrderReason.md) | Reject codes available at the order level. |  [optional]
**refundable** | **Boolean** | Whether the order is refundable or not.  Null should be interpreted as false. |  [optional]
**success** | **Boolean** | Indicates if API call was successful |  [optional]
**warning** | [**Warning**](Warning.md) |  |  [optional]



