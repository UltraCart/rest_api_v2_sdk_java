

# TransactionEmail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | Actual template contents |  [optional] |
|**espDomainUuid** | **String** | The uuid of the sending domain |  [optional] |
|**espFriendlyName** | **String** | Friendly from that will appear in customer email clients. |  [optional] |
|**espUser** | **String** | The username of the sending email.  This is not the full email.  Only the username which is everything before the @ sign. |  [optional] |
|**fileExists** | **Boolean** | An internal identifier used to aid in retrieving templates from the filesystem. |  [optional] |
|**fileName** | **String** | File name |  [optional] |
|**group** | **String** | Group |  [optional] |
|**handlebarVariables** | **List&lt;String&gt;** | Handlebar Variables available for email template |  [optional] |
|**invalid** | **Boolean** | Invalid will be true if the template cannot compile |  [optional] |
|**lastModified** | **String** | Last modified timestamp |  [optional] |
|**libraryItemOid** | **Integer** | If this item was ever added to the Code Library, this is the oid for that library item, or 0 if never added before.  This value is used to determine if a library item should be inserted or updated. |  [optional] |
|**options** | [**List&lt;TransactionEmailOption&gt;**](TransactionEmailOption.md) | Options that help govern how and when this template is used |  [optional] |
|**path** | **String** | directory path where template is stored in file system |  [optional] |
|**size** | **String** | Size of file in friendly description |  [optional] |
|**storeFrontFsDirectoryOid** | **Integer** | Internal identifier used to store and retrieve template from filesystem |  [optional] |
|**storeFrontFsFileOid** | **Integer** | Internal identifier used to store and retrieve template from filesystem |  [optional] |
|**subject** | **String** | Subject |  [optional] |
|**syntaxErrors** | **String** | Any syntax errors contained within the tempalate |  [optional] |
|**templatePathRelativePath** | **String** | Internal value used to locate the template in the filesystem |  [optional] |
|**themeRelativePath** | **String** | Theme relative path in the filesystem. |  [optional] |



