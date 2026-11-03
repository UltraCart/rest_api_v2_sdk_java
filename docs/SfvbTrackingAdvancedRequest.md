

# SfvbTrackingAdvancedRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**catalogUrl** | **String** | A path starting with / or an absolute http or https URL, up to 250 characters. |  [optional] |
|**continueShoppingUrl** | **String** | A path starting with / or an absolute http or https URL, up to 250 characters. |  [optional] |
|**conversionPixelOnlyIfPaid** | **Boolean** | True to run the receipt&#39;s conversion HTML only for orders whose payment succeeded. |  [optional] |
|**defaultCurrency** | **String** | A currency code from the read&#39;s currencies. |  [optional] |
|**dryRun** | **Boolean** | True to check the change and report it without saving. |  [optional] |
|**omitOrderData** | **Boolean** | True to leave the order data off the custom thank you URL. |  [optional] |
|**paymentPendingUrl** | **String** | A path starting with / or an absolute http or https URL, up to 500 characters. |  [optional] |
|**thankYouUrl** | **String** | A path starting with / or an absolute http or https URL, up to 500 characters. |  [optional] |
|**unset** | **List&lt;String&gt;** | Text settings to clear, by key.  continue_shopping_url, catalog_url, thank_you_url, payment_pending_url or default_currency.  Not with a value for the same key. |  [optional] |



