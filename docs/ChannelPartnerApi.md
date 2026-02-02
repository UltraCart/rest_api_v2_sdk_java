# ChannelPartnerApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelOrderByChannelPartnerOrderId**](ChannelPartnerApi.md#cancelOrderByChannelPartnerOrderId) | **DELETE** /channel_partner/cancel/by_channel_partner_order_id/{order_id} | Cancel channel partner order by channel partner order id |
| [**cancelOrderByUltraCartOrderId**](ChannelPartnerApi.md#cancelOrderByUltraCartOrderId) | **DELETE** /channel_partner/cancel/by_ultracart_order_id/{order_id} | Cancel channel partner order by UltraCart order id |
| [**deleteChannelPartnerShipToPreference**](ChannelPartnerApi.md#deleteChannelPartnerShipToPreference) | **DELETE** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences/{channel_partner_ship_to_preference_oid} | Delete a ship to preference record for the channel partner. |
| [**estimateShippingForChannelPartnerOrder**](ChannelPartnerApi.md#estimateShippingForChannelPartnerOrder) | **POST** /channel_partner/estimate_shipping | Estimate shipping for channel partner order |
| [**estimateTaxForChannelPartnerOrder**](ChannelPartnerApi.md#estimateTaxForChannelPartnerOrder) | **POST** /channel_partner/estimate_tax | Estimate tax for channel partner order |
| [**getChannelPartnerOrder**](ChannelPartnerApi.md#getChannelPartnerOrder) | **GET** /channel_partner/orders/{order_id} | Retrieve a channel partner order |
| [**getChannelPartnerOrderByChannelPartnerOrderId**](ChannelPartnerApi.md#getChannelPartnerOrderByChannelPartnerOrderId) | **GET** /channel_partner/orders/by_channel_partner_order_id/{order_id} | Retrieve a channel partner order by the channel partner order id |
| [**getChannelPartnerReasonCodes**](ChannelPartnerApi.md#getChannelPartnerReasonCodes) | **GET** /channel_partner/channel_partners/{channel_partner_oid}/reason_codes | Retrieve reject and refund reason codes. |
| [**getChannelPartnerShipToPreference**](ChannelPartnerApi.md#getChannelPartnerShipToPreference) | **GET** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences/{channel_partner_ship_to_preference_oid} | Retrieve the ship to preference associated with the channel partner and the specific id. |
| [**getChannelPartnerShipToPreferences**](ChannelPartnerApi.md#getChannelPartnerShipToPreferences) | **GET** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences | Retrieve the ship to preferences associated with the channel partner. |
| [**getChannelPartners**](ChannelPartnerApi.md#getChannelPartners) | **GET** /channel_partner/channel_partners | Retrieve the channel partners configured on the account. |
| [**importChannelPartnerOrder**](ChannelPartnerApi.md#importChannelPartnerOrder) | **POST** /channel_partner/import | Insert channel partner order |
| [**insertChannelPartnerShipToPreference**](ChannelPartnerApi.md#insertChannelPartnerShipToPreference) | **POST** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences | Insert a ship to preference record for the channel partner. |
| [**refundChannelPartnerOrder**](ChannelPartnerApi.md#refundChannelPartnerOrder) | **PUT** /channel_partner/orders/{order_id}/refund | Refund a channel partner order |
| [**updateChannelPartnerShipToPreference**](ChannelPartnerApi.md#updateChannelPartnerShipToPreference) | **PUT** /channel_partner/channel_partners/{channel_partner_oid}/ship_to_preferences/{channel_partner_ship_to_preference_oid} | Update a ship to preference record for the channel partner. |


<a name="cancelOrderByChannelPartnerOrderId"></a>
# **cancelOrderByChannelPartnerOrderId**
> ChannelPartnerCancelResponse cancelOrderByChannelPartnerOrderId(orderId)

Cancel channel partner order by channel partner order id

Cancel channel partner order by channel partner order id 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.ChannelPartnerCancelResponse;

import java.util.List;

public class CancelOrderByChannelPartnerOrderId {
    /*
    cancelOrderByChannelPartnerOrderId takes a channel partner order id, which is the external order id, and attempts
    to 'cancel' the order.  UltraCart doesn't have a cancel order state, so this needs some explanation of what happens.

    Here is the logic of the cancel process:
    If the Order stage is [this] then do [that]:
        'Completed Order'       -> Error: "Order has already been completed."
        'Rejected'              -> Error: "Order has already been rejected."
        'Accounts Receivable'   -> Success: order is rejected.
        'Preordered'            -> Success: order is rejected.
        'Quote Sent'            -> Success: order is rejected.
        'Quote Requested'       -> Success: order is rejected.

    The remaining stages are Fraud Review and Shipping Department.  Orders in these stages have already completed payment.
    From this point, complex logic determines if the order has already shipped, or is queued to ship in a way that cannot be canceled.
    Here is the logic for those stages, but the gist of it all is this:  If you receive any of the errors below, the order has progressed past a point where it can be canceled.
    SHIPPING LOGIC:
    Iterate through each item and consider it's shipping status:
        Item has already been transmitted to fulfillment center (contains a transmitted dts) -> Error: "The order has already had an item that has been transmitted to the distribution center."
        Does item DC (distribution center) have a transmission mechanism configured?
            YES -> Does the transmission have schedules? If NO -> Error: "The distribution center does not have any schedules so it would be an immediate transmission."
            NO -> Error: "Cant tell if we can cancel because the DC doesnt have a transport configured."

    If the above logic completes without errors, the following conditions must be met:
    Order has DC activity records.  If NO -> Error: "There is no activity in the DC queue when there should be."
    There must be at least 5 minutes before the next DC transmission. If NO -> Error: "Activity record is not at least 5 minutes away so we need to bail."

    At this point, the order will be canceled with the following activity:
    1) Distribution Center activity is cleared
    2) The order is refunded.  If the order is less than 24 hours old, a void is attempted instead.


    Other Possible Errors:
    System errors -> "Internal error.  Please contact UltraCart Support."
    Order does not exist -> "Invalid order ID specified."
    During refunding, original transaction could not be found -> "Unable to find original transaction on the order."
    During refunding, original transaction was found, but transaction id could not be found -> "Unable to locate original transaction reference number."
    During refunding, PayPal was used by no longer configured -> "PayPal is no longer configured on your account to refund against."
    Gateway does not support refunds -> [GatewayName] does not support refunds at this time.
    */
    public static void execute() {
        System.out.println("--- CancelOrderByChannelPartnerOrderId ---");

        try {
            // Create channel partner API instance using API key
            ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

            String channelPartnerOrderId = "BLAH-BLAH-123";
            ChannelPartnerCancelResponse cancelResult = channelPartnerApi.cancelOrderByChannelPartnerOrderId(channelPartnerOrderId);

            if (!cancelResult.getSuccess()) {
                List<String> errors = cancelResult.getCancelErrors();
                for (String error : errors) {
                    System.out.println(error);
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex); // Dumps all exception information
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The channel partner order id to delete. | |

### Return type

[**ChannelPartnerCancelResponse**](ChannelPartnerCancelResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="cancelOrderByUltraCartOrderId"></a>
# **cancelOrderByUltraCartOrderId**
> ChannelPartnerCancelResponse cancelOrderByUltraCartOrderId(orderId)

Cancel channel partner order by UltraCart order id

Cancel channel partner order by UltraCart order id 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.ChannelPartnerCancelResponse;

import java.util.List;

public class CancelOrderByUltraCartOrderId {
    /*
    cancelOrderByUltraCartOrderId takes an UltraCart order id and attempts to 'cancel' the order.
    UltraCart doesn't have a cancel order state, so this needs some explanation of what happens.

    Here is the logic of the cancel process:
    If the Order stage is [this] then do [that]:
        'Completed Order'       -> Error: "Order has already been completed."
        'Rejected'              -> Error: "Order has already been rejected."
        'Accounts Receivable'   -> Success: order is rejected.
        'Preordered'            -> Success: order is rejected.
        'Quote Sent'            -> Success: order is rejected.
        'Quote Requested'       -> Success: order is rejected.

    The remaining stages are Fraud Review and Shipping Department.  Orders in these stages have already completed payment.
    From this point, complex logic determines if the order has already shipped, or is queued to ship in a way that cannot be canceled.
    Here is the logic for those stages, but the gist of it all is this:  If you receive any of the errors below, the order has progressed past a point where it can be canceled.
    SHIPPING LOGIC:
    Iterate through each item and consider it's shipping status:
        Item has already been transmitted to fulfillment center (contains a transmitted dts) -> Error: "The order has already had an item that has been transmitted to the distribution center."
        Does item DC (distribution center) have a transmission mechanism configured?
            YES -> Does the transmission have schedules? If NO -> Error: "The distribution center does not have any schedules so it would be an immediate transmission."
            NO -> Error: "Cant tell if we can cancel because the DC doesnt have a transport configured."

    If the above logic completes without errors, the following conditions must be met:
    Order has DC activity records.  If NO -> Error: "There is no activity in the DC queue when there should be."
    There must be at least 5 minutes before the next DC transmission. If NO -> Error: "Activity record is not at least 5 minutes away so we need to bail."

    At this point, the order will be canceled with the following activity:
    1) Distribution Center activity is cleared
    2) The order is refunded.  If the order is less than 24 hours old, a void is attempted instead.


    Other Possible Errors:
    System errors -> "Internal error.  Please contact UltraCart Support."
    Order does not exist -> "Invalid order ID specified."
    During refunding, original transaction could not be found -> "Unable to find original transaction on the order."
    During refunding, original transaction was found, but transaction id could not be found -> "Unable to locate original transaction reference number."
    During refunding, PayPal was used by no longer configured -> "PayPal is no longer configured on your account to refund against."
    Gateway does not support refunds -> [GatewayName] does not support refunds at this time.
    */
    public static void execute() {
        System.out.println("--- CancelOrderByUltraCartOrderId ---");

        try {
            // Create channel partner API instance using API key
            ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

            String ultracartOrderId = "DEMO-12345678980";
            ChannelPartnerCancelResponse cancelResult = channelPartnerApi.cancelOrderByUltraCartOrderId(ultracartOrderId);

            if (!cancelResult.getSuccess()) {
                List<String> errors = cancelResult.getCancelErrors();
                for (String error : errors) {
                    System.out.println(error);
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex);  // Dumps all exception information
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The UltraCart order id to delete. | |

### Return type

[**ChannelPartnerCancelResponse**](ChannelPartnerCancelResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="deleteChannelPartnerShipToPreference"></a>
# **deleteChannelPartnerShipToPreference**
> deleteChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShipToPreferenceOid)

Delete a ship to preference record for the channel partner.

Delete a ship to preference record for the channel partner. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;

public class DeleteChannelPartnerShipToPreference {
  /*
   Deletes a ChannelPartnerShiptoPreference.  These preferences are used by EDI channel partners to automatically
   apply return policies and add additional free items to EDI orders based on the EDI code that is present.

   Success will return a status code 204 (No content)

   Possible Errors:
   Attempting to interact with a channel partner other than the one tied to your API Key:
      "Invalid channel_partner_oid specified.  Your REST API key may only interact with channel_partner_oid: 12345"
   Supply a bad preference oid: "Invalid channel_partner_ship_to_preference_oid specified."
  */
  public static void execute() {
    System.out.println("--- DeleteChannelPartnerShipToPreference ---");

    try {
      // Create channel partner API instance using API key
      ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

      int channelPartnerShiptoPreferenceOid = 67890; // you will usually get this by calling getChannelPartnerShipToPreferences()
      int channelPartnerOid = 12345;

      channelPartnerApi.deleteChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShiptoPreferenceOid);
      System.out.println("Channel partner ship to preference deleted successfully");
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
      ex.printStackTrace();
    }
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOid** | **Integer**|  | |
| **channelPartnerShipToPreferenceOid** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="estimateShippingForChannelPartnerOrder"></a>
# **estimateShippingForChannelPartnerOrder**
> ChannelPartnerEstimateShippingResponse estimateShippingForChannelPartnerOrder(channelPartnerOrder)

Estimate shipping for channel partner order

Estimate shipping for order from a channel partner. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EstimateShippingForChannelPartnerOrder {
  /*
   This is a helper function for call centers to calculate the shipping cost on an order.  In a typical flow, the call center
   will collect all the shipping information and items being purchased into a ChannelPartnerOrder object.
   They will then call this method, passing in the order object.  The response will contain the shipping estimates
   that the call center can present to the customer.  Once the customer selects a particulate estimate,
   they can then plug that cost into their call center application and complete the order.

   Possible Errors:
   Using an API key that is not tied to a channel partner: "This API Key does not have permission to interact with channel partner orders.  Please review your Channel Partner configuration."
   Order has invalid channel partner code: "Invalid channel partner code"
   Order has no items: "null order.items passed." or "order.items array contains a null entry."
   Order has no channel partner order id: "order.channelPartnerOrderId must be specified."
   Order channel partner order id is a duplicate:  "order.channelPartnerOrderId [XYZ] already used."
   Channel Partner is inactive: "partner is inactive."
  */
  public static void execute() {
    System.out.println("--- EstimateShippingForChannelPartnerOrder ---");

    try {
      // Create channel partner API instance using API key
      ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

      ChannelPartnerOrder order = new ChannelPartnerOrder();
      order.setChannelPartnerOrderId("widget-1245-abc-1");

      ArrayList<String> coupons = new ArrayList<String>();
      coupons.add("10OFF");
      order.setCoupons(coupons);

      // DeliveryDate will impact shipping estimates if there is a delivery deadline.
      // order.setDeliveryDate(Instant.now().plus(14, java.time.temporal.ChronoUnit.DAYS).toString());

      ArrayList<ChannelPartnerOrderItem> items = new ArrayList<ChannelPartnerOrderItem>();
      ChannelPartnerOrderItem item = new ChannelPartnerOrderItem();
      // item.setArbitraryUnitCost(new java.math.BigDecimal("9.99"));
      // item.setAutoOrderLastRebillDts(Instant.now().minus(30, java.time.temporal.ChronoUnit.DAYS).toString());
      // item.setAutoOrderSchedule("Weekly");
      item.setMerchantItemId("shirt");

      ArrayList<ChannelPartnerOrderItemOption> options = new ArrayList<ChannelPartnerOrderItemOption>();
      ChannelPartnerOrderItemOption sizeOption = new ChannelPartnerOrderItemOption();
      sizeOption.setName("Size");
      sizeOption.setValue("Small");
      options.add(sizeOption);

      ChannelPartnerOrderItemOption colorOption = new ChannelPartnerOrderItemOption();
      colorOption.setName("Color");
      colorOption.setValue("Orange");
      options.add(colorOption);

      item.setOptions(options);
      item.setQuantity(BigDecimal.valueOf(1));
      item.setUpsell(false);
      items.add(item);
      order.setItems(items);

      // order.setShipOnDate(Instant.now().plus(7, java.time.temporal.ChronoUnit.DAYS).toString());
      order.setShipToResidential(true);
      order.setShiptoAddress1("55 Main Street");
      order.setShiptoAddress2("Suite 202");
      order.setShiptoCity("Duluth");
      order.setShiptoCompany("Widgets Inc");
      order.setShiptoCountryCode("US");
      order.setShiptoDayPhone("6785552323");
      order.setShiptoEveningPhone("7703334444");
      order.setShiptoFirstName("Sally");
      order.setShiptoLastName("McGonkyDee");
      order.setShiptoPostalCode("30097");
      order.setShiptoStateRegion("GA");
      order.setShiptoTitle("Director");

      ChannelPartnerEstimateShippingResponse apiResponse = channelPartnerApi.estimateShippingForChannelPartnerOrder(order);
      List<ChannelPartnerShippingEstimate> estimates = apiResponse.getEstimates();

      // TODO: Apply one estimate shipping method (name) and cost to your channel partner order.

      // Display shipping estimates
      for (ChannelPartnerShippingEstimate estimate : estimates) {
        System.out.println(estimate);
      }

      System.out.println("Retrieved " + estimates.size() + " shipping estimates");
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
      ex.printStackTrace();
    }
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOrder** | [**ChannelPartnerOrder**](ChannelPartnerOrder.md)| Order needing shipping estimate | |

### Return type

[**ChannelPartnerEstimateShippingResponse**](ChannelPartnerEstimateShippingResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="estimateTaxForChannelPartnerOrder"></a>
# **estimateTaxForChannelPartnerOrder**
> ChannelPartnerEstimateTaxResponse estimateTaxForChannelPartnerOrder(channelPartnerOrder)

Estimate tax for channel partner order

Estimate tax for order from a channel partner. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.ChannelPartnerEstimateTaxResponse;
import com.ultracart.admin.v2.models.ChannelPartnerOrder;
import com.ultracart.admin.v2.models.ChannelPartnerOrderItem;
import com.ultracart.admin.v2.models.ChannelPartnerOrderItemOption;

import java.math.BigDecimal;
import java.util.ArrayList;

public class EstimateTaxForChannelPartnerOrder {
  /*
   This is a helper function for call centers to calculate the tax on an order.  In a typical flow, the call center
   will collect all the shipping information and items being purchased into a ChannelPartnerOrder object.
   They will then call this method, passing in the order object.  The response will contain the tax that should be
   collected.  They can then plug that tax into their call center application and complete the order.

   Possible Errors:
   Using an API key that is not tied to a channel partner: "This API Key does not have permission to interact with channel partner orders.  Please review your Channel Partner configuration."
   Order has invalid channel partner code: "Invalid channel partner code"
   Order has no items: "null order.items passed." or "order.items array contains a null entry."
   Order has no channel partner order id: "order.channelPartnerOrderId must be specified."
   Order channel partner order id is a duplicate:  "order.channelPartnerOrderId [XYZ] already used."
   Channel Partner is inactive: "partner is inactive."
  */
  public static void execute() {
    System.out.println("--- EstimateTaxForChannelPartnerOrder ---");

    try {
      // Create channel partner API instance using API key
      ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

      ChannelPartnerOrder order = new ChannelPartnerOrder();
      order.setChannelPartnerOrderId("widget-1245-abc-1");

      ArrayList<String> coupons = new ArrayList<String>();
      coupons.add("10OFF");
      order.setCoupons(coupons);

      // DeliveryDate will impact shipping estimates if there is a delivery deadline.
      // order.setDeliveryDate(Instant.now().plus(14, java.time.temporal.ChronoUnit.DAYS).toString());

      ArrayList<ChannelPartnerOrderItem> items = new ArrayList<ChannelPartnerOrderItem>();
      ChannelPartnerOrderItem item = new ChannelPartnerOrderItem();
      // item.setArbitraryUnitCost(new BigDecimal("9.99"));
      // item.setAutoOrderLastRebillDts(Instant.now().minus(30, java.time.temporal.ChronoUnit.DAYS).toString());
      // item.setAutoOrderSchedule("Weekly");
      item.setMerchantItemId("shirt");

      ArrayList<ChannelPartnerOrderItemOption> options = new ArrayList<ChannelPartnerOrderItemOption>();
      ChannelPartnerOrderItemOption sizeOption = new ChannelPartnerOrderItemOption();
      sizeOption.setName("Size");
      sizeOption.setValue("Small");
      options.add(sizeOption);

      ChannelPartnerOrderItemOption colorOption = new ChannelPartnerOrderItemOption();
      colorOption.setName("Color");
      colorOption.setValue("Orange");
      options.add(colorOption);

      item.setOptions(options);
      item.setQuantity(BigDecimal.valueOf(1));
      item.setUpsell(false);
      items.add(item);
      order.setItems(items);

      // order.setShipOnDate(Instant.now().plus(7, java.time.temporal.ChronoUnit.DAYS).toString());
      order.setShipToResidential(true);
      order.setShiptoAddress1("55 Main Street");
      order.setShiptoAddress2("Suite 202");
      order.setShiptoCity("Duluth");
      order.setShiptoCompany("Widgets Inc");
      order.setShiptoCountryCode("US");
      order.setShiptoDayPhone("6785552323");
      order.setShiptoEveningPhone("7703334444");
      order.setShiptoFirstName("Sally");
      order.setShiptoLastName("McGonkyDee");
      order.setShiptoPostalCode("30097");
      order.setShiptoStateRegion("GA");
      order.setShiptoTitle("Director");

      ChannelPartnerEstimateTaxResponse apiResponse = channelPartnerApi.estimateTaxForChannelPartnerOrder(order);
      BigDecimal arbitraryTax = apiResponse.getArbitraryTax();
      // TODO: Apply this tax to your channel partner order.

      System.out.println("Estimated tax: " + arbitraryTax);
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
      ex.printStackTrace();
    }
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOrder** | [**ChannelPartnerOrder**](ChannelPartnerOrder.md)| Order needing tax estimate | |

### Return type

[**ChannelPartnerEstimateTaxResponse**](ChannelPartnerEstimateTaxResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getChannelPartnerOrder"></a>
# **getChannelPartnerOrder**
> OrderResponse getChannelPartnerOrder(orderId, expand)

Retrieve a channel partner order

Retrieves a single order using the specified order id.  Only orders belonging to this channel partner may be retrieved. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.Order;
import com.ultracart.admin.v2.models.OrderResponse;

public class GetChannelPartnerOrder {
    /*
     * ChannelPartnerApi.getChannelPartnerOrder() retrieves a single order for a given order_id.  It is identical to the
     * OrderApi.getOrder() call, but allows for a restricted permission set.  The channel partner api assumes
     * a tie to a Channel Partner and only allows retrieval of orders created by that Channel Partner.
     */
    public static void execute() {
        System.out.println("--- GetChannelPartnerOrder ---");

        try {
            // Create channel partner API instance using API key
            ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

            // The expansion variable instructs UltraCart how much information to return.  The order object is large and
            // while it's easily manageable for a single order, when querying thousands of orders, is useful to reduce
            // payload size.
            // see www.ultracart.com/api/ for all the expansion fields available (this list below may become stale)
            /*
            Possible Order Expansions:
            affiliate           affiliate.ledger                    auto_order
            billing             channel_partner                     checkout
            coupon              customer_profile                    digital_order
            edi                 fraud_score                         gift
            gift_certificate    internal                            item
            linked_shipment     marketing                           payment
            payment.transaction quote                               salesforce
            shipping            shipping.tracking_number_details    summary
            taxes
            */

            // A channel partner will almost always query an order for the purpose of turning around and submitting it to a refund call.
            // As such, the expansion most likely needed is listed below.
            String expansion = "item,summary,shipping";

            // This order MUST be an order associated with this channel partner or you will receive a 400 Bad Request.
            String orderId = "DEMO-0009110366";
            OrderResponse apiResponse = channelPartnerApi.getChannelPartnerOrder(orderId, expansion);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            Order order = apiResponse.getOrder();
            System.out.println(order);
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See OrderApi.getOrder documentation for examples | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getChannelPartnerOrderByChannelPartnerOrderId"></a>
# **getChannelPartnerOrderByChannelPartnerOrderId**
> OrderResponse getChannelPartnerOrderByChannelPartnerOrderId(orderId, expand)

Retrieve a channel partner order by the channel partner order id

Retrieves a single order using the channel partner order id, not the ultracart order id.  Only orders belonging to this channel partner may be retrieved. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.Order;
import com.ultracart.admin.v2.models.OrderResponse;

public class GetChannelPartnerOrderByChannelPartnerOrderId {
    /*
     * ChannelPartnerApi.getChannelPartnerOrderByChannelPartnerOrderId() retrieves a single order for a given
     * channel partner order_id.  This might be useful for call centers which only have their order ids and not UltraCart's.
     * It is identical to the OrderApi.getOrder() call in functionality and result,
     * but allows for a restricted permission set.  The channel partner api assumes a tie to a Channel Partner and
     * only allows retrieval of orders created by that Channel Partner.
     */
    public static void execute() {
        System.out.println("--- GetChannelPartnerOrderByChannelPartnerOrderId ---");

        try {
            // Create channel partner API instance using API key
            ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

            // The expansion variable instructs UltraCart how much information to return.  The order object is large and
            // while it's easily manageable for a single order, when querying thousands of orders, is useful to reduce
            // payload size.
            // see www.ultracart.com/api/ for all the expansion fields available (this list below may become stale)
            /*
            Possible Order Expansions:
            affiliate           affiliate.ledger                    auto_order
            billing             channel_partner                     checkout
            coupon              customer_profile                    digital_order
            edi                 fraud_score                         gift
            gift_certificate    internal                            item
            linked_shipment     marketing                           payment
            payment.transaction quote                               salesforce
            shipping            shipping.tracking_number_details    summary
            taxes
            */

            // A channel partner will almost always query an order for the purpose of turning around and submitting it to a refund call.
            // As such, the expansion most likely needed is listed below.
            String expansion = "item,summary,shipping";

            // This order MUST be an order associated with this channel partner or you will receive a 400 Bad Request.
            String channelPartnerOrderId = "MY-CALL-CENTER-BLAH-BLAH";
            OrderResponse apiResponse = channelPartnerApi.getChannelPartnerOrderByChannelPartnerOrderId(channelPartnerOrderId, expansion);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            Order order = apiResponse.getOrder();
            System.out.println(order);
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The channel partner order id to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See OrderApi.getOrder documentation for examples | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getChannelPartnerReasonCodes"></a>
# **getChannelPartnerReasonCodes**
> ChanelPartnerReasonCodesResponse getChannelPartnerReasonCodes(channelPartnerOid)

Retrieve reject and refund reason codes.

Retrieve reject and refund reason codes. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.ChanelPartnerReasonCodesResponse;
import com.ultracart.admin.v2.models.OrderReason;

import java.util.List;

public class GetChannelPartnerReasonCodes {
    /*
     * ChannelPartnerApi.getChannelPartnerOrder() retrieves a single order for a given order_id.  It is identical to the
     * OrderApi.getOrder() call, but allows for a restricted permission set.  The channel partner api assumes
     * a tie to a Channel Partner and only allows retrieval of orders created by that Channel Partner.
     */
    public static void execute() {
        System.out.println("--- GetChannelPartnerReasonCodes ---");

        try {
            // Create channel partner API instance using API key
            ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

            ChanelPartnerReasonCodesResponse apiResponse = channelPartnerApi.getChannelPartnerReasonCodes(18413);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            List<OrderReason> refundReasons = apiResponse.getItemLevelRefundReasons();
            for (OrderReason refundReason : refundReasons) {
                System.out.println(refundReason);
            }

        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOid** | **Integer**|  | |

### Return type

[**ChanelPartnerReasonCodesResponse**](ChanelPartnerReasonCodesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getChannelPartnerShipToPreference"></a>
# **getChannelPartnerShipToPreference**
> ChannelPartnerShipToPreferenceResponse getChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShipToPreferenceOid)

Retrieve the ship to preference associated with the channel partner and the specific id.

Retrieve the ship to preference associated with the channel partner and the specific id. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.ChannelPartnerShipToPreference;
import com.ultracart.admin.v2.models.ChannelPartnerShipToPreferenceResponse;

public class GetChannelPartnerShipToPreference {
    /*
     Retrieves a shipto preference for a channel partner.
     These preferences are used by EDI channel partners to automatically
     apply return policies and add additional free items to EDI orders based on the EDI code that is present.

     Possible Errors:
     Attempting to interact with a channel partner other than the one tied to your API Key:
        "Invalid channel_partner_oid specified.  Your REST API key may only interact with channel_partner_oid: 12345"
     Supplying a bad channel partner oid: "Invalid channel_partner_oid specified."
     Supplying a bad channel partner shipto preference oid: "Invalid channel_partner_ship_to_preference_oid specified."
    */
    public static void execute() {
        System.out.println("--- GetChannelPartnerShipToPreference ---");

        try {
            // Create channel partner API instance using API key
            ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

            int channelPartnerOid = 12345;
            int channelPartnerShiptoPreferenceOid = 67890;

            ChannelPartnerShipToPreferenceResponse apiResponse = channelPartnerApi.getChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShiptoPreferenceOid);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            ChannelPartnerShipToPreference preference = apiResponse.getShipToPreference();
            System.out.println(preference);
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOid** | **Integer**|  | |
| **channelPartnerShipToPreferenceOid** | **Integer**|  | |

### Return type

[**ChannelPartnerShipToPreferenceResponse**](ChannelPartnerShipToPreferenceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getChannelPartnerShipToPreferences"></a>
# **getChannelPartnerShipToPreferences**
> ChannelPartnerShipToPreferencesResponse getChannelPartnerShipToPreferences(channelPartnerOid)

Retrieve the ship to preferences associated with the channel partner.

Retrieve the ship to preferences associated with the channel partner. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.ChannelPartnerShipToPreference;
import com.ultracart.admin.v2.models.ChannelPartnerShipToPreferencesResponse;

import java.util.List;

public class GetChannelPartnerShipToPreferences {
  /*
   Retrieves all shipto preferences for a channel partner.
   These preferences are used by EDI channel partners to automatically
   apply return policies and add additional free items to EDI orders based on the EDI code that is present.

   Possible Errors:
   Attempting to interact with a channel partner other than the one tied to your API Key:
      "Invalid channel_partner_oid specified.  Your REST API key may only interact with channel_partner_oid: 12345"
   Supplying a bad channel partner oid: "Invalid channel_partner_oid specified."
  */
  public static void execute() {
    System.out.println("--- GetChannelPartnerShipToPreferences ---");

    try {
      // Create channel partner API instance using API key
      ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

      int channelPartnerOid = 12345;
      ChannelPartnerShipToPreferencesResponse apiResponse = channelPartnerApi.getChannelPartnerShipToPreferences(channelPartnerOid);

      if (apiResponse.getError() != null) {
        System.err.println(apiResponse.getError().getDeveloperMessage());
        System.err.println(apiResponse.getError().getUserMessage());
        System.exit(1);
      }

      List<ChannelPartnerShipToPreference> preferences = apiResponse.getShipToPreferences();

      for (ChannelPartnerShipToPreference preference : preferences) {
        System.out.println(preference);
      }

      System.out.println("Retrieved " + preferences.size() + " ship to preferences");
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
      ex.printStackTrace();
    }
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOid** | **Integer**|  | |

### Return type

[**ChannelPartnerShipToPreferencesResponse**](ChannelPartnerShipToPreferencesResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getChannelPartners"></a>
# **getChannelPartners**
> ChannelPartnersResponse getChannelPartners()

Retrieve the channel partners configured on the account.

Retrieve the channel partners configured on the account. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.ChannelPartner;
import com.ultracart.admin.v2.models.ChannelPartnersResponse;

import java.util.List;

public class GetChannelPartners {
  /*
      Retrieves a list of all channel partners configured for this merchant.  If the API KEY used is tied to a specific
      Channel Partner, then the results will contain only that Channel Partner.
   */
  public static void execute() {
    System.out.println("--- GetChannelPartners ---");

    try {
      // Create channel partner API instance using API key
      ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);
      ChannelPartnersResponse apiResponse = channelPartnerApi.getChannelPartners();

      if (apiResponse.getError() != null) {
        System.err.println(apiResponse.getError().getDeveloperMessage());
        System.err.println(apiResponse.getError().getUserMessage());
        System.exit(1);
      }

      List<ChannelPartner> channelPartners = apiResponse.getChannelPartners();

      for (ChannelPartner channelPartner : channelPartners) {
        System.out.println(channelPartner);
      }

      System.out.println("Retrieved " + channelPartners.size() + " channel partners");
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
      ex.printStackTrace();
    }
  }
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ChannelPartnersResponse**](ChannelPartnersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="importChannelPartnerOrder"></a>
# **importChannelPartnerOrder**
> ChannelPartnerImportResponse importChannelPartnerOrder(channelPartnerOrder)

Insert channel partner order

Insert order from a channel partner. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;

public class ImportChannelPartnerOrder {
  /*
      To run channel partner examples, you will need:
      1) An API Key: https://secure.ultracart.com/merchant/configuration/apiManagementApp.do
      2) That API Key must be assigned to a channel partner: https://secure.ultracart.com/merchant/configuration/customChannelPartnerListLoad.do

      The spreadsheet import docs will serve you well here.  They describe many fields
      https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377246/Channel+Partner+API+-+Spreadsheet+Import
  */
  public static void execute() {
    System.out.println("--- ImportChannelPartnerOrder ---");

    try {
      // Create channel partner API instance using API key
      ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

      // NOTICE:
      // The real difficulty with using this API is the hosted fields requirement for credit card information.
      // You will need to incorporate UltraCart hosted fields in your Customer Service UI and capture credit card
      // information through the hosted fields and then provide the tokens here.  You CANNOT provide raw credit
      // card information via this interface.
      // The two fields in this API are hostedFieldsCardToken and hostedFieldsCvvToken
      // Within this sdk_samples github project, review the /hosted_fields/hosted_fields.html file for an example

      // There are TWO examples.  The first is an order that still needs the credit card charged.  This example uses
      // the hosted fields to collect payment information and pass it to UltraCart for processing.  The second example
      // already has payment processed and just passes in the authorization information.

      // ---------------------------------------------
      // ---------------------------------------------
      // Example 1 - Order needs payment processing
      // ---------------------------------------------
      // ---------------------------------------------

      ChannelPartnerOrder order = new ChannelPartnerOrder();

      // order.setAdvertisingSource("Friend"); // https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377001/Advertising+Sources
      // order.setAffiliateId(856234); // https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377727/Affiliates
      // order.setAffiliateSubId(1234); // https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1376754/Allowing+Affiliates+to+use+Sub-IDs
      // order.setArbitraryShippingHandlingTotal(new java.math.BigDecimal("9.99"));
      // order.setArbitraryTax(new java.math.BigDecimal("2.50"));
      // order.setArbitraryTaxRate(new java.math.BigDecimal("7.0"));
      // order.setArbitraryTaxableSubtotal(new java.math.BigDecimal("69.99"));

      order.setAssociateWithCustomerProfileIfPresent(true);
      order.setAutoApprovePurchaseOrder(true);
      order.setBilltoAddress1("11460 Johns Creek Parkway");
      order.setBilltoAddress2("Suite 101");
      order.setBilltoCity("Duluth");
      order.setBilltoCompany("Widgets Inc");
      order.setBilltoCountryCode("US");
      order.setBilltoDayPhone("6784153823");
      order.setBilltoEveningPhone("6784154019");
      order.setBilltoFirstName("John");
      order.setBilltoLastName("Smith");
      order.setBilltoPostalCode("30097");
      order.setBilltoStateRegion("GA");
      order.setBilltoTitle("Sir");
      order.setCcEmail("orders@widgets.com");
      order.setChannelPartnerOrderId("widget-1245-abc");
      order.setConsiderRecurring(false);

      ArrayList<String> coupons = new ArrayList<String>();
      coupons.add("10OFF");
      coupons.add("BUY1GET1");
      order.setCoupons(coupons);

      // order.setCreditCardAuthorizationAmount(new java.math.BigDecimal("69.99"));
      // order.setCreditCardAuthorizationDts(Instant.now().toString()); // this will usually not be 'now'. it will be the actual auth date
      // order.setCreditCardAuthorizationNumber("1234");

      order.setCreditCardExpirationMonth(5);
      order.setCreditCardExpirationYear(2032);
      order.setCreditCardType("VISA"); // see the hosted fields below for the card number and cvv tokens
      order.setCustomField1("Whatever");
      order.setCustomField2("You");
      order.setCustomField3("Want");
      order.setCustomField4("Can");
      order.setCustomField5("Go");
      order.setCustomField6("In");
      order.setCustomField7("CustomFields");
      order.setDeliveryDate(Instant.now().toString());
      order.setEmail("ceo@widgets.com");
      order.setGift(false);

      order.setGiftEmail("sally@aol.com");
      order.setGiftMessage("Congratulations on your promotion!");

      order.setHostedFieldsCardToken("7C97B0AAA26AB10180B4B29F00380101");
      order.setHostedFieldsCvvToken("C684AB4336787F0180B4B51971380101");

      // order.setInsuranceApplicationId(insuranceApplicationId); // these are used by only a handful of specialized merchants
      // order.setInsuranceClaimId(insuranceClaimId); // these are used by only a handful of specialized merchants

      order.setIpAddress("34.125.95.217");

      // -- Items start ---
      ChannelPartnerOrderItem item = new ChannelPartnerOrderItem();
      // item.setArbitraryUnitCost(new java.math.BigDecimal("9.99"));
      // item.setAutoOrderLastRebillDts(Instant.now().toString());
      // item.setAutoOrderSchedule("Weekly");

      item.setMerchantItemId("shirt");
      item.setQuantity(BigDecimal.valueOf(1));
      item.setUpsell(false);

      ChannelPartnerOrderItemOption itemOption1 = new ChannelPartnerOrderItemOption();
      itemOption1.setName("Size");
      itemOption1.setValue("Small");

      ChannelPartnerOrderItemOption itemOption2 = new ChannelPartnerOrderItemOption();
      itemOption2.setName("Color");
      itemOption2.setValue("Orange");

      ArrayList<ChannelPartnerOrderItemOption> options = new ArrayList<ChannelPartnerOrderItemOption>();
      options.add(itemOption1);
      options.add(itemOption2);
      item.setOptions(options);

      ArrayList<ChannelPartnerOrderItem> items = new ArrayList<ChannelPartnerOrderItem>();
      items.add(item);
      order.setItems(items);
      // -- Items End ---

      order.setLeastCostRoute(true); // Give me the lowest cost shipping
      ArrayList<String> shippingMethods = new ArrayList<String>();
      shippingMethods.add("FedEx: Ground");
      shippingMethods.add("UPS: Ground");
      shippingMethods.add("USPS: Priority");
      order.setLeastCostRouteShippingMethods(shippingMethods);
      order.setMailingListOptIn(true); // Yes, I confirmed with the customer personally they wish to be on my mailing lists.
      order.setNoRealtimePaymentProcessing(false);
      order.setPaymentMethod(ChannelPartnerOrder.PaymentMethodEnum.CREDIT_CARD);
      // order.setPurchaseOrderNumber("PO-12345");
      order.setRotatingTransactionGatewayCode("MyStripe"); // We wish this to be charged against our Stripe gateway
      order.setScreenBrandingThemeCode("SF1986"); // Theme codes predated StoreFronts. Each StoreFront still has a theme code under the hood. We need that here. See this screen to find your code: https://secure.ultracart.com/merchant/configuration/customerServiceLoad.do
      order.setShipOnDate(Instant.now().toString());
      order.setShipToResidential(true);
      // order.setShippingMethod("FedEx: Ground"); // We're using LeastCostRoute, so we do not supply this value
      order.setShiptoAddress1("55 Main Street");
      order.setShiptoAddress2("Suite 202");
      order.setShiptoCity("Duluth");
      order.setShiptoCompany("Widgets Inc");
      order.setShiptoCountryCode("US");
      order.setShiptoDayPhone("6785552323");
      order.setShiptoEveningPhone("7703334444");
      order.setShiptoFirstName("Sally");
      order.setShiptoLastName("McGonkyDee");
      order.setShiptoPostalCode("30097");
      order.setShiptoStateRegion("GA");
      order.setShiptoTitle("Director");
      order.setSkipPaymentProcessing(false);
      order.setSpecialInstructions("Please wrap this in bubble wrap because my FedEx delivery guy is abusive to packages");
      order.setStoreCompleted(false); // this will bypass everything, including shipping. useful only for importing old orders long completed
      order.setStorefrontHostName("store.mysite.com");
      order.setStoreIfPaymentDeclines(false); // if payment fails, this can send it to Accounts Receivable. Do not want that. Fail if payment fails.
      order.setTaxCounty("Gwinnett");
      order.setTaxExempt(false);

      ChannelPartnerOrderTransaction orderTransaction = new ChannelPartnerOrderTransaction();
      orderTransaction.setSuccessful(false); // we haven't charged the card yet, so this is false.
      orderTransaction.setDetails(new ArrayList<ChannelPartnerOrderTransactionDetail>()); // we haven't charged the card yet, so this is empty.
      order.setTransaction(orderTransaction);
      order.setTreatWarningsAsErrors(true);

      ChannelPartnerImportResponse apiResponse = channelPartnerApi.importChannelPartnerOrder(order);

      // ---------------------------------------------
      // ---------------------------------------------
      // Example 2 - Order already processed
      // ---------------------------------------------
      // ---------------------------------------------

      ChannelPartnerOrder processedOrder = new ChannelPartnerOrder();

      // processedOrder.setAdvertisingSource("Friend"); // https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377001/Advertising+Sources
      // processedOrder.setAffiliateId(856234); // https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377727/Affiliates
      // processedOrder.setAffiliateSubId(1234); // https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1376754/Allowing+Affiliates+to+use+Sub-IDs
      // processedOrder.setArbitraryShippingHandlingTotal(new java.math.BigDecimal("9.99"));
      // processedOrder.setArbitraryTax(new java.math.BigDecimal("2.50"));
      // processedOrder.setArbitraryTaxRate(new java.math.BigDecimal("7.0"));
      // processedOrder.setArbitraryTaxableSubtotal(new java.math.BigDecimal("69.99"));

      processedOrder.setAssociateWithCustomerProfileIfPresent(true);
      processedOrder.setAutoApprovePurchaseOrder(true);
      processedOrder.setBilltoAddress1("11460 Johns Creek Parkway");
      processedOrder.setBilltoAddress2("Suite 101");
      processedOrder.setBilltoCity("Duluth");
      processedOrder.setBilltoCompany("Widgets Inc");
      processedOrder.setBilltoCountryCode("US");
      processedOrder.setBilltoDayPhone("6784153823");
      processedOrder.setBilltoEveningPhone("6784154019");
      processedOrder.setBilltoFirstName("John");
      processedOrder.setBilltoLastName("Smith");
      processedOrder.setBilltoPostalCode("30097");
      processedOrder.setBilltoStateRegion("GA");
      processedOrder.setBilltoTitle("Sir");
      processedOrder.setCcEmail("orders@widgets.com");
      processedOrder.setChannelPartnerOrderId("widget-1245-abc");
      processedOrder.setConsiderRecurring(false);

      ArrayList<String> processedCoupons = new ArrayList<String>();
      processedCoupons.add("10OFF");
      processedCoupons.add("BUY1GET1");
      processedOrder.setCoupons(processedCoupons);

      // processedOrder.setCreditCardAuthorizationAmount(new java.math.BigDecimal("69.99"));
      // processedOrder.setCreditCardAuthorizationDts(Instant.now().toString()); // this will usually not be 'now'. it will be the actual auth date
      // processedOrder.setCreditCardAuthorizationNumber("1234");

      processedOrder.setCreditCardExpirationMonth(5);
      processedOrder.setCreditCardExpirationYear(2032);
      processedOrder.setCreditCardType("VISA"); // see the hosted fields below for the card number and cvv tokens
      processedOrder.setCustomField1("Whatever");
      processedOrder.setCustomField2("You");
      processedOrder.setCustomField3("Want");
      processedOrder.setCustomField4("Can");
      processedOrder.setCustomField5("Go");
      processedOrder.setCustomField6("In");
      processedOrder.setCustomField7("CustomFields");
      processedOrder.setDeliveryDate(Instant.now().toString());
      processedOrder.setEmail("ceo@widgets.com");
      processedOrder.setGift(false);

      processedOrder.setGiftEmail("sally@aol.com");
      processedOrder.setGiftMessage("Congratulations on your promotion!");

      // processedOrder.setInsuranceApplicationId(insuranceApplicationId); // these are used by only a handful of specialized merchants
      // processedOrder.setInsuranceClaimId(insuranceClaimId); // these are used by only a handful of specialized merchants

      processedOrder.setIpAddress("34.125.95.217");

      // -- Items start ---
      ChannelPartnerOrderItem processedItem = new ChannelPartnerOrderItem();
      // processedItem.setArbitraryUnitCost(new java.math.BigDecimal("9.99"));
      // processedItem.setAutoOrderLastRebillDts(Instant.now().toString());
      // processedItem.setAutoOrderSchedule("Weekly");

      processedItem.setMerchantItemId("shirt");
      processedItem.setQuantity(BigDecimal.valueOf(1));
      processedItem.setUpsell(false);

      ChannelPartnerOrderItemOption processedItemOption1 = new ChannelPartnerOrderItemOption();
      processedItemOption1.setName("Size");
      processedItemOption1.setValue("Small");

      ChannelPartnerOrderItemOption processedItemOption2 = new ChannelPartnerOrderItemOption();
      processedItemOption2.setName("Color");
      processedItemOption2.setValue("Orange");

      ArrayList<ChannelPartnerOrderItemOption> processedOptions = new ArrayList<ChannelPartnerOrderItemOption>();
      processedOptions.add(processedItemOption1);
      processedOptions.add(processedItemOption2);
      processedItem.setOptions(processedOptions);

      ArrayList<ChannelPartnerOrderItem> processedItems = new ArrayList<ChannelPartnerOrderItem>();
      processedItems.add(processedItem);
      processedOrder.setItems(processedItems);
      // -- Items End ---

      // We don't use least cost routing here. We've already completed the order and should know what shipping method
      // the customer was charged for. So that is set in the processedOrder.ShippingMethod property.
      // processedOrder.setLeastCostRoute(true); // Give me the lowest cost shipping
      // ArrayList<String> processedShippingMethods = new ArrayList<String>();
      // processedShippingMethods.add("FedEx: Ground");
      // processedShippingMethods.add("UPS: Ground");
      // processedShippingMethods.add("USPS: Priority");
      // processedOrder.setLeastCostRouteShippingMethods(processedShippingMethods);
      processedOrder.setMailingListOptIn(true); // Yes, I confirmed with the customer personally they wish to be on my mailing lists.
      processedOrder.setNoRealtimePaymentProcessing(true); // nothing to charge, payment was already collected
      processedOrder.setPaymentMethod(ChannelPartnerOrder.PaymentMethodEnum.CREDIT_CARD);
      // processedOrder.setPurchaseOrderNumber("PO-12345");
      processedOrder.setRotatingTransactionGatewayCode("MyStripe"); // We wish this to be charged against our Stripe gateway
      processedOrder.setScreenBrandingThemeCode("SF1986"); // Theme codes predated StoreFronts. Each StoreFront still has a theme code under the hood. We need that here. See this screen to find your code: https://secure.ultracart.com/merchant/configuration/customerServiceLoad.do
      processedOrder.setShipOnDate(Instant.now().toString());
      processedOrder.setShipToResidential(true);
      processedOrder.setShippingMethod("FedEx: Ground");
      processedOrder.setShiptoAddress1("55 Main Street");
      processedOrder.setShiptoAddress2("Suite 202");
      processedOrder.setShiptoCity("Duluth");
      processedOrder.setShiptoCompany("Widgets Inc");
      processedOrder.setShiptoCountryCode("US");
      processedOrder.setShiptoDayPhone("6785552323");
      processedOrder.setShiptoEveningPhone("7703334444");
      processedOrder.setShiptoFirstName("Sally");
      processedOrder.setShiptoLastName("McGonkyDee");
      processedOrder.setShiptoPostalCode("30097");
      processedOrder.setShiptoStateRegion("GA");
      processedOrder.setShiptoTitle("Director");
      processedOrder.setSkipPaymentProcessing(true); // bypass payment
      processedOrder.setSpecialInstructions("Please wrap this in bubble wrap because my FedEx delivery guy is abusive to packages");
      processedOrder.setStoreCompleted(true); // this is an old order or an order handled completely outside UltraCart, so do not do anything to it. Just store it.
      processedOrder.setStorefrontHostName("store.mysite.com");
      processedOrder.setStoreIfPaymentDeclines(false); // if payment fails, this can send it to Accounts Receivable. Do not want that. Fail if payment fails.
      processedOrder.setTaxCounty("Gwinnett");
      processedOrder.setTaxExempt(false);

      ChannelPartnerOrderTransaction processedOrderTransaction = new ChannelPartnerOrderTransaction();
      processedOrderTransaction.setSuccessful(true); // transaction was successful

      ArrayList<ChannelPartnerOrderTransactionDetail> details = new ArrayList<ChannelPartnerOrderTransactionDetail>();
      ChannelPartnerOrderTransactionDetail td1 = new ChannelPartnerOrderTransactionDetail(); // 'td' is short for transaction detail
      td1.setName("AVS Code");
      td1.setValue("X");
      details.add(td1);

      ChannelPartnerOrderTransactionDetail td2 = new ChannelPartnerOrderTransactionDetail();
      td2.setName("Authorization Code");
      td2.setValue("123456");
      details.add(td2);

      ChannelPartnerOrderTransactionDetail td3 = new ChannelPartnerOrderTransactionDetail();
      td3.setName("CVV Code");
      td3.setValue("M");
      details.add(td3);

      ChannelPartnerOrderTransactionDetail td4 = new ChannelPartnerOrderTransactionDetail();
      td4.setName("Response Code");
      td4.setValue("Authorized");
      details.add(td4);

      ChannelPartnerOrderTransactionDetail td5 = new ChannelPartnerOrderTransactionDetail();
      td5.setName("Reason Code");
      td5.setValue("1");
      details.add(td5);

      ChannelPartnerOrderTransactionDetail td6 = new ChannelPartnerOrderTransactionDetail();
      td6.setName("Response Subcode");
      td6.setValue("1");
      details.add(td6);

      ChannelPartnerOrderTransactionDetail td7 = new ChannelPartnerOrderTransactionDetail();
      td7.setName("Transaction ID");
      td7.setValue("1234567890");
      details.add(td7);

      processedOrderTransaction.setDetails(details);
      processedOrder.setTransaction(processedOrderTransaction);
      processedOrder.setTreatWarningsAsErrors(true);

      ChannelPartnerImportResponse processedApiResponse = channelPartnerApi.importChannelPartnerOrder(processedOrder);

      System.out.println("Orders imported successfully");
    } catch (Exception ex) {
      System.out.println("Error: " + ex.getMessage());
      ex.printStackTrace();
    }
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOrder** | [**ChannelPartnerOrder**](ChannelPartnerOrder.md)| Order to insert | |

### Return type

[**ChannelPartnerImportResponse**](ChannelPartnerImportResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="insertChannelPartnerShipToPreference"></a>
# **insertChannelPartnerShipToPreference**
> ChannelPartnerShipToPreferenceResponse insertChannelPartnerShipToPreference(channelPartnerOid, shipToPreference)

Insert a ship to preference record for the channel partner.

Insert a ship to preference record for the channel partner. 

### Example

```java
package channel_partner;

import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.ChannelPartnerShipToPreference;
import com.ultracart.admin.v2.models.ChannelPartnerShipToPreferenceResponse;

import java.util.ArrayList;

public class InsertChannelPartnerShipToPreference {
    /*
     Inserts a channel partner shipto preference for a channel partner.
     These preferences are used by EDI channel partners to automatically
     apply return policies and add additional free items to EDI orders based on the EDI code that is present.

     Possible Errors:
     Attempting to interact with a channel partner other than the one tied to your API Key:
        "Invalid channel_partner_oid specified.  Your REST API key may only interact with channel_partner_oid: 12345"
     Supplying a bad channel partner oid: "Invalid channel_partner_oid specified."
    */
    public static void execute() {
        System.out.println("--- InsertChannelPartnerShipToPreference ---");

        try {
            // Create channel partner API instance using API key
            ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

            int channelPartnerOid = 12345;

            ChannelPartnerShipToPreference preference = new ChannelPartnerShipToPreference();
            preference.setChannelPartnerOid(channelPartnerOid);
            preference.setShipToEdiCode("EDI_CODE_HERE");
            preference.setReturnPolicy("This is some return policy text that will be printed on the packing slip.");

            ArrayList<String> additionalKitComponentItemIds = new ArrayList<String>();
            additionalKitComponentItemIds.add("ITEM_ID1");
            additionalKitComponentItemIds.add("ITEM_ID2");
            additionalKitComponentItemIds.add("ITEM_ID3");
            preference.setAdditionalKitComponentItemIds(additionalKitComponentItemIds);

            preference.setDescription("This is a merchant friendly description to help me remember what the above setting are.");

            ChannelPartnerShipToPreferenceResponse apiResponse = channelPartnerApi.insertChannelPartnerShipToPreference(channelPartnerOid, preference);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            ChannelPartnerShipToPreference insertedPreference = apiResponse.getShipToPreference();

            // This should equal what you submitted.
            System.out.println(insertedPreference);
            System.out.println("Ship to preference inserted successfully");
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOid** | **Integer**|  | |
| **shipToPreference** | [**ChannelPartnerShipToPreference**](ChannelPartnerShipToPreference.md)| Ship to preference to create | |

### Return type

[**ChannelPartnerShipToPreferenceResponse**](ChannelPartnerShipToPreferenceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="refundChannelPartnerOrder"></a>
# **refundChannelPartnerOrder**
> OrderResponse refundChannelPartnerOrder(orderId, order, rejectAfterRefund, skipCustomerNotification, autoOrderCancel, manualRefund, reverseAffiliateTransactions, issueStoreCredit, autoOrderCancelReason, expand)

Refund a channel partner order

Perform a refund operation on a channel partner order and then update the order if successful.  All of the object properties ending in _refunded should be the TOTAL amount that should end up being refunded.  UltraCart will calculate the actual amount to refund based upon the prior refunds. 

### Example

```java
package channel_partner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.Order;
import com.ultracart.admin.v2.models.OrderItem;
import com.ultracart.admin.v2.models.OrderResponse;

import java.util.List;

public class RefundChannelPartnerOrder {
    /**
     * IMPORTANT: Do NOT construct the refunded order. This method does a refund but also update the entire object, so start with an order query.
     * ALWAYS start with an order retrieved from the system.
     * 1. Call getChannelPartnerOrder or getChannelPartnerOrderByChannelPartnerOrderId to retrieve the order being refunded
     * 2. For a full refund, reverse the following:
     *    A. Set the refunded qty and refunded amount for each item.
     *    B. Set the refunded tax (if any)
     *    C. Set the refunded shipping
     * NOTE: refund amounts are positive numbers. If any item total cost is $20.00, a full refunded amount would also be positive $20.00
     * See the ChannelPartnerApi.getChannelPartnerOrder() sample for details on that method.
     */
    public static void execute() {
        try {
            // Create channel partner API instance
            ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);

            // For a comment on this expansion, see getChannelPartnerOrder sample.
            String expansion = "item,summary,shipping";

            // This order MUST be an order associated with this channel partner, or you will receive a 400 Bad Request.
            String orderId = "DEMO-0009106820";
            OrderResponse apiResponse = channelPartnerApi.getChannelPartnerOrder(orderId, expansion);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            Order order = apiResponse.getOrder();

            // RefundReason may be required, but is optional by default.
            // RefundReason may be a set list, or may be freeform. This is configured on the backend (secure.ultracart.com)
            // by Navigating to Home -> Configuration -> Order Management -> Refund/Reject Reasons
            // Warning: If this is a 2nd refund after an initial partial refund, be sure you account for the units and amount already refunded.
            order.setRefundReason("Damage Product");
            order.getSummary().setTaxRefunded(order.getSummary().getTax());
            order.getSummary().setShippingHandlingRefunded(order.getSummary().getShippingHandlingTotal());

            List<OrderItem> items = order.getItems();
            for (OrderItem item : items) {
                // Item level refund reasons are optional, but may be required. See the above breadcrumb trail for refund reason config.
                item.setRefundReason("DifferentItem");
                item.setQuantityRefunded(item.getQuantity());
                item.setTotalRefunded(item.getTotalCostWithDiscount());
            }

            boolean rejectAfterRefund = false;
            boolean skipCustomerNotifications = true;
            boolean autoOrderCancel = false; // If this was an auto order, and they wanted to cancel it, set this flag to true.
            // Set manualRefund to true if the actual refund happened outside the system, and you just want a record of it.
            // If UltraCart did not process this refund, manualRefund should be true.
            boolean manualRefund = false;
            boolean reverseAffiliateTransactions = true; // For a full refund, the affiliate should not get credit, or should they?
            boolean issueStoreCredit = false; // If true, the customer would receive store credit instead of a return on their credit card.
            String autoOrderCancelReason = null;

            apiResponse = channelPartnerApi.refundChannelPartnerOrder(
                orderId,
                order,
                rejectAfterRefund,
                skipCustomerNotifications,
                autoOrderCancel,
                manualRefund,
                reverseAffiliateTransactions,
                issueStoreCredit,
                autoOrderCancelReason,
                expansion);

            Error error = apiResponse.getError();
            Order updatedOrder = apiResponse.getOrder();
            // Verify the updated order contains all the desired refunds. Verify that refunded total is equal to total.

            // Note: The error 'Request to refund an invalid amount.' means you requested a total refund amount less than or equal to zero.
            ObjectMapper mapper = new ObjectMapper();
            System.out.println("Error:");
            System.out.println(error != null ? mapper.writerWithDefaultPrettyPrinter().writeValueAsString(error) : "null");
            System.out.println("\n\n--------------------\n\n");
            System.out.println("Updated Order:");
            System.out.println(updatedOrder != null ? mapper.writerWithDefaultPrettyPrinter().writeValueAsString(updatedOrder) : "null");
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to refund. | |
| **order** | [**Order**](Order.md)| Order to refund | |
| **rejectAfterRefund** | **Boolean**| Reject order after refund | [optional] [default to false] |
| **skipCustomerNotification** | **Boolean**| Skip customer email notification | [optional] [default to false] |
| **autoOrderCancel** | **Boolean**| Cancel associated auto orders | [optional] [default to false] |
| **manualRefund** | **Boolean**| Consider a manual refund done externally | [optional] [default to false] |
| **reverseAffiliateTransactions** | **Boolean**| Reverse affiliate transactions | [optional] [default to true] |
| **issueStoreCredit** | **Boolean**| Issue a store credit instead of refunding the original payment method, loyalty must be configured on merchant account | [optional] [default to false] |
| **autoOrderCancelReason** | **String**| Reason for auto orders cancellation | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See OrderApi.refundOrder documentation for examples | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="updateChannelPartnerShipToPreference"></a>
# **updateChannelPartnerShipToPreference**
> ChannelPartnerShipToPreferenceResponse updateChannelPartnerShipToPreference(channelPartnerOid, channelPartnerShipToPreferenceOid, shipToPreference)

Update a ship to preference record for the channel partner.

Update a ship to preference record for the channel partner. 

### Example

```java
package channel_partner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ultracart.admin.v2.ChannelPartnerApi;
import com.ultracart.admin.v2.models.ChannelPartnerShipToPreference;
import com.ultracart.admin.v2.models.ChannelPartnerShipToPreferenceResponse;

import java.util.ArrayList;

public class UpdateChannelPartnerShipToPreference {
    /**
     * Updates a channel partner shipto preference for a channel partner.
     * These preferences are used by EDI channel partners to automatically
     * apply return policies and add additional free items to EDI orders based on the EDI code that is present.
     *
     * Possible Errors:
     * Attempting to interact with a channel partner other than the one tied to your API Key:
     *    "Invalid channel_partner_oid specified.  Your REST API key may only interact with channel_partner_oid: 12345"
     * Supplying a bad channel partner oid: "Invalid channel_partner_oid specified."
     */
    public static void execute() {
        try {
            ChannelPartnerApi channelPartnerApi = new ChannelPartnerApi(common.Constants.CHANNEL_PARTNER_API_KEY);
            int channelPartnerOid = 12345;
            int channelPartnerShipToPreferenceOid = 67890;

            ChannelPartnerShipToPreferenceResponse apiResponse = channelPartnerApi.getChannelPartnerShipToPreference(
                channelPartnerOid,
                channelPartnerShipToPreferenceOid);

            ChannelPartnerShipToPreference preference = apiResponse.getShipToPreference();

            // Update some fields.
            preference.setShipToEdiCode("EDI_CODE_HERE");
            preference.setReturnPolicy("This is some return policy text that will be printed on the packing slip.");

            ArrayList<String> additionalKitComponentItemIds = new ArrayList<String>();
            additionalKitComponentItemIds.add("ITEM_ID1");
            additionalKitComponentItemIds.add("ITEM_ID2");
            additionalKitComponentItemIds.add("ITEM_ID3");
            preference.setAdditionalKitComponentItemIds(additionalKitComponentItemIds);

            preference.setDescription("This is a merchant friendly description to help me remember what the above setting are.");

            apiResponse = channelPartnerApi.updateChannelPartnerShipToPreference(
                channelPartnerOid,
                channelPartnerShipToPreferenceOid,
                preference);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            ChannelPartnerShipToPreference updatedPreference = apiResponse.getShipToPreference();

            // This should equal what you submitted.
            ObjectMapper mapper = new ObjectMapper();
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(updatedPreference));
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **channelPartnerOid** | **Integer**|  | |
| **channelPartnerShipToPreferenceOid** | **Integer**|  | |
| **shipToPreference** | [**ChannelPartnerShipToPreference**](ChannelPartnerShipToPreference.md)| Ship to preference to create | |

### Return type

[**ChannelPartnerShipToPreferenceResponse**](ChannelPartnerShipToPreferenceResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

