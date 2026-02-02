
# ReportDataSetPage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSetUuid** | **String** | A unique identifier assigned to the data set that is returned. |  [optional]
**merchantId** | **String** | Merchant that owns this data set |  [optional]
**nextPageToken** | **String** |  |  [optional]
**nextStartIndex** | **Integer** |  |  [optional]
**pageNumber** | **Integer** |  |  [optional]
**rowCount** | **Integer** |  |  [optional]
**rows** | [**List&lt;ReportDataSetRow&gt;**](ReportDataSetRow.md) | Rows returned for the data set |  [optional]
**rowsS3Url** | **String** | Signed S3 URL where the page rows can be downloaded from |  [optional]
**startIndex** | **Integer** | Zero based index of the starting row |  [optional]
**tableId** | **String** | The BigQuery destination table id that contains the result. |  [optional]



