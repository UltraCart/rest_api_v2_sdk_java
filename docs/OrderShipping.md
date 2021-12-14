
# OrderShipping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address1** | **String** | Address line 1 |  [optional]
**address2** | **String** | Address line 2 |  [optional]
**city** | **String** | City |  [optional]
**company** | **String** | Company |  [optional]
**countryCode** | **String** | ISO-3166 two letter country code |  [optional]
**dayPhone** | **String** | Day time phone |  [optional]
**dayPhoneE164** | **String** | Day time phone (E164 format) |  [optional]
**deliveryDate** | **String** | Date the customer is requesting delivery on.  Typically used for perishable product delivery. |  [optional]
**eveningPhone** | **String** | Evening phone |  [optional]
**eveningPhoneE164** | **String** | Evening phone (E164 format) |  [optional]
**firstName** | **String** | First name |  [optional]
**lastName** | **String** | Last name |  [optional]
**leastCostRoute** | **Boolean** | If true, instructs UltraCart to apply the cheapest shipping method to this order.  Used only for channel partner order inserts. |  [optional]
**leastCostRouteShippingMethods** | **List&lt;String&gt;** | List of shipping methods to consider if least_code_route is true. Used only for channel parter order inserts. |  [optional]
**liftGate** | **Boolean** | Lift gate requested (LTL shipping methods only) |  [optional]
**postalCode** | **String** | Postal code |  [optional]
**rma** | **String** | RMA number |  [optional]
**shipOnDate** | **String** | Date the customer is requesting that the order ship on.  Typically used for perishable product delivery. |  [optional]
**shipToResidential** | **Boolean** | True if the shipping address is residential.  Effects the methods that are available to the customer as well as the price of the shipping method. |  [optional]
**shipping3rdPartyAccountNumber** | **String** | Shipping 3rd party account number |  [optional]
**shippingDate** | **String** | Date/time the order shipped on.  This date is set once the first shipment is sent to the customer. |  [optional]
**shippingDepartmentStatus** | **String** | Shipping department status |  [optional]
**shippingMethod** | **String** | Shipping method |  [optional]
**shippingMethodAccountingCode** | **String** | Shipping method accounting code |  [optional]
**specialInstructions** | **String** | Special instructions from the customer regarding shipping |  [optional]
**stateRegion** | **String** | State |  [optional]
**title** | **String** | Title |  [optional]
**trackingNumberDetails** | [**List&lt;OrderTrackingNumberDetails&gt;**](OrderTrackingNumberDetails.md) | Tracking number details |  [optional]
**trackingNumbers** | **List&lt;String&gt;** | Tracking numbers |  [optional]
**weight** | [**Weight**](Weight.md) |  |  [optional]



