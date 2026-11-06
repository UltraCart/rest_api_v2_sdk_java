

# SfvbCommsStat


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bounced** | **Integer** | Permanent bounces. |  [optional] |
|**channel** | **String** | email, sms, postcard, branch or sequence, or step for a step type that records no counts of its own, with every count named in not_measured. |  [optional] |
|**clicked** | **Integer** | Clicks (for a postcard, scans of its QR code). |  [optional] |
|**conversions** | **Integer** | Conversions. |  [optional] |
|**customers** | **Integer** | Customers who reached it (a branch side), or started (a whole sequence). |  [optional] |
|**delivered** | **Integer** | Deliveries. |  [optional] |
|**finished** | **Integer** | Customers who finished the sequence. |  [optional] |
|**inProgress** | **Integer** | Customers in the sequence now. |  [optional] |
|**invalid** | **Integer** | Addresses the email validator refused. |  [optional] |
|**notMeasured** | **List&lt;String&gt;** | The counts this channel doesn&#39;t record, left out above. |  [optional] |
|**opened** | **Integer** | Opens. |  [optional] |
|**orders** | **Integer** | Orders attributed. |  [optional] |
|**profit** | **BigDecimal** | Profit attributed. |  [optional] |
|**returnedToSender** | **Integer** | Postcards returned to sender. |  [optional] |
|**revenue** | **BigDecimal** | Revenue attributed. |  [optional] |
|**sent** | **Integer** | Sends. |  [optional] |
|**skipped** | **Integer** | Customers skipped. |  [optional] |
|**spam** | **Integer** | Spam complaints. |  [optional] |
|**unsubscribed** | **Integer** | Unsubscribes. |  [optional] |



