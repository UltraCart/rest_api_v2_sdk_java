

# DistributionCenter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address1** | **String** | Address line 1 of the distribution center |  [optional] |
|**address2** | **String** | Address line 2 of the distribution center |  [optional] |
|**city** | **String** | City of the distribution center |  [optional] |
|**code** | **String** | Unique code for this distribution center |  [optional] |
|**countryCode** | **String** | Country code of the distribution center |  [optional] |
|**defaultCenter** | **Boolean** | True if this is the default distribution center on the account |  [optional] |
|**defaultHandlesAllItems** | **Boolean** | True if this distribution center handles all new items by default |  [optional] |
|**distributionCenterOid** | **Integer** | Distribution center object identifier |  [optional] |
|**duns** | **String** | DUNS number assigned to this distribution center (EDI) |  [optional] |
|**estimateFromDistributionCenterOid** | **Integer** | Estimate shipments for this distribution center as if they came from the other distribution center |  [optional] |
|**ftpPassword** | **String** | Password associated with the virtual FTP |  [optional] |
|**holdBeforeShipmentMinutes** | **Integer** | The number of minutes to hold a shipment |  [optional] |
|**holdBeforeTransmission** | **Boolean** | True if the shipment should be held before transmission and require a manual release |  [optional] |
|**holdAutoOrderBeforeShipmentMinutes** | **Integer** |  |  [optional] |
|**latitude** | **BigDecimal** | Latitude where the distribution center is located |  [optional] |
|**longitude** | **BigDecimal** | Longitude where the distribution center is located |  [optional] |
|**name** | **String** | Name of this distribution center |  [optional] |
|**noCustomerDirectShipments** | **Boolean** | True if this distribution center does not handle customer direct shipments |  [optional] |
|**noSplitShipment** | **Boolean** | True if this distribution center is not allowed to participate in a split shipment. |  [optional] |
|**pickupCutoffTimeFriday** | **String** | The time (EST) after which pickups will not be available on Friday |  [optional] |
|**pickupCutoffTimeMonday** | **String** | The time (EST) after which pickups will not be available on Monday |  [optional] |
|**pickupCutoffTimeSaturday** | **String** | The time (EST) after which pickups will not be available on Saturday |  [optional] |
|**pickupCutoffTimeSunday** | **String** | The time (EST) after which pickups will not be available on Sunday |  [optional] |
|**pickupCutoffTimeThursday** | **String** | The time (EST) after which pickups will not be available on Thursday |  [optional] |
|**pickupCutoffTimeTuesday** | **String** | The time (EST) after which pickups will not be available on Tuesday |  [optional] |
|**pickupCutoffTimeWednesday** | **String** | The time (EST) after which pickups will not be available on Wednesday |  [optional] |
|**pickupStartTimeFriday** | **String** | The time (EST) after which pickups are available on Friday |  [optional] |
|**pickupStartTimeMonday** | **String** | The time (EST) after which pickups are available on Monday |  [optional] |
|**pickupStartTimeSaturday** | **String** | The time (EST) after which pickups are available on Saturday |  [optional] |
|**pickupStartTimeSunday** | **String** | The time (EST) after which pickups are available on Sunday |  [optional] |
|**pickupStartTimeThursday** | **String** | The time (EST) after which pickups are available on Thursday |  [optional] |
|**pickupStartTimeTuesday** | **String** | The time (EST) after which pickups are available on Tuesday |  [optional] |
|**pickupStartTimeWednesday** | **String** | The time (EST) after which pickups are available on Wednesday |  [optional] |
|**pickupTz** | **String** | The IANA timezone for all pickup times |  [optional] |
|**postalCode** | **String** | Postal code of the distribution center |  [optional] |
|**processDays** | **Integer** | The number of processing days required before an order ships |  [optional] |
|**processInventoryStartTime** | **String** | The time (EST) after which inventory updates will be processed |  [optional] |
|**processInventoryStopTime** | **String** | The time (EST) before which inventory updates will be processed |  [optional] |
|**requireAsn** | **Boolean** | True if ASNs are required for this distribution center (EDI) |  [optional] |
|**sendKitInsteadOfComponents** | **Boolean** | True if we should send the kit instead of the components |  [optional] |
|**shipmentCutoffTimeFriday** | **String** | The time (EST) after which shipments will not be processed on Friday |  [optional] |
|**shipmentCutoffTimeMonday** | **String** | The time (EST) after which shipments will not be processed on Monday |  [optional] |
|**shipmentCutoffTimeSaturday** | **String** | The time (EST) after which shipments will not be processed on Saturday |  [optional] |
|**shipmentCutoffTimeSunday** | **String** | The time (EST) after which shipments will not be processed on Sunday |  [optional] |
|**shipmentCutoffTimeThursday** | **String** | The time (EST) after which shipments will not be processed on Thursday |  [optional] |
|**shipmentCutoffTimeTuesday** | **String** | The time (EST) after which shipments will not be processed on Tuesday |  [optional] |
|**shipmentCutoffTimeWednesday** | **String** | The time (EST) after which shipments will not be processed on Wednesday |  [optional] |
|**state** | **String** | State of the distribution center |  [optional] |
|**transmitBlankCosts** | **Boolean** | True if monetary amounts should be zeroed before transmission |  [optional] |
|**transport** | **String** | Transport mechanism for this distribution center |  [optional] |



