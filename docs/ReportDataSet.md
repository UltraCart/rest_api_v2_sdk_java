
# ReportDataSet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSetQueryUuid** | **String** | A unique identifier assigned to the data set query that is returned. |  [optional]
**dataSetUuid** | **String** | A unique identifier assigned to the data set that is returned. |  [optional]
**destinationTableId** | **String** | The BigQuery destination table id that contains the result. |  [optional]
**errorMessage** | **String** | Error message if the query failed. |  [optional]
**executedSql** | **String** |  |  [optional]
**forObjectId** | **String** | An identifier that can be used to help match up the returned data set |  [optional]
**forObjectType** | [**ForObjectTypeEnum**](#ForObjectTypeEnum) | The type of object this data set is for |  [optional]
**initialPages** | [**List&lt;ReportDataSetPage&gt;**](ReportDataSetPage.md) | Initial pages returned in the dataset |  [optional]
**maxResults** | **Long** | The total number of results |  [optional]
**merchantId** | **String** | Merchant that owns this data set |  [optional]
**pageCount** | **Integer** | The total number of pages in the result set |  [optional]
**pageSize** | **Integer** | The size of the pages |  [optional]
**requestDts** | **String** | Date/Time of the client submitted the request.  Can be used to resolve out of order query completion results |  [optional]
**schema** | [**List&lt;ReportDataSetSchema&gt;**](ReportDataSetSchema.md) | The schema associated with the data set. |  [optional]
**securityLevel** | **String** | Security level this dataset was read from. |  [optional]
**timezone** | **String** |  |  [optional]
**userData** | **String** | Any other data that needs to be returned with the response to help the UI |  [optional]


<a name="ForObjectTypeEnum"></a>
## Enum: ForObjectTypeEnum
Name | Value
---- | -----
SCHEMA | &quot;schema&quot;
FILTER | &quot;filter&quot;
VISUALIZATION | &quot;visualization&quot;



