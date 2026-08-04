

# CustomerEmailSuppressionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clearBounce** | **Boolean** | Clear bounce suppression for this address.  Bounce has no per-customer flag; it exists only on the suppression tables. |  [optional] |
|**clearGlobalUnsubscribe** | **Boolean** | Clear the global unsubscribe flag.  No-op if it is already clear. |  [optional] |
|**clearSpamComplaint** | **Boolean** | Clear the spam complaint flag.  Requires a reason.  No-op if it is already clear. |  [optional] |
|**consentSource** | [**ConsentSourceEnum**](#ConsentSourceEnum) | How the customer communicated consent. |  [optional] |
|**reason** | **String** | Justification for the clear.  Required when clearing a spam complaint.  Retained on the audit record. |  [optional] |



## Enum: ConsentSourceEnum

| Name | Value |
|---- | -----|
| PHONE | &quot;phone&quot; |
| EMAIL | &quot;email&quot; |
| CHAT | &quot;chat&quot; |
| IN_PERSON | &quot;in_person&quot; |
| WRITTEN | &quot;written&quot; |
| OTHER | &quot;other&quot; |



