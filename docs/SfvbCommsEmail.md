

# SfvbCommsEmail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**containerLastModifiedDts** | **String** | When the email container was last changed (ISO 8601, UTC). |  [optional] |
|**deleted** | **Boolean** | True when the email was deleted. |  [optional] |
|**emailUuid** | **String** | The email uuid.  Use it with the email container (owner type email) and with the email render endpoint. |  [optional] |
|**pendingReview** | **Boolean** | True while a change waits for review. |  [optional] |
|**previewText** | **String** | The preview text an inbox shows after the subject. |  [optional] |
|**rejected** | **Boolean** | True when review rejected the email.  Don&#39;t edit it without the merchant. |  [optional] |
|**requiresReview** | **Boolean** | True when a change to this email must be reviewed before it sends. |  [optional] |
|**stepUuid** | **String** | The step that sends this email. |  [optional] |
|**subject** | **String** | The subject line. |  [optional] |
|**transactional** | **Boolean** | True for a transactional email, which skips the marketing footer rules. |  [optional] |
|**variantName** | **String** | For an email in an experiment step, the variant name.  Absent otherwise. |  [optional] |
|**variantPercentage** | **BigDecimal** | For an email in an experiment step, the share of customers it is sent to. |  [optional] |
|**variantWinner** | **Boolean** | For an email in an experiment step, true when the experiment chose it as the winner. |  [optional] |
|**version** | **Integer** | The email version. |  [optional] |



