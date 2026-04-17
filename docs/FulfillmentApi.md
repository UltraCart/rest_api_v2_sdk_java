# FulfillmentApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**acknowledgeOrders**](FulfillmentApi.md#acknowledgeOrders) | **PUT** /fulfillment/distribution_centers/{distribution_center_code}/acknowledgements | Acknowledge receipt of orders. |
| [**generatePackingSlip**](FulfillmentApi.md#generatePackingSlip) | **GET** /fulfillment/distribution_centers/{distribution_center_code}/orders/{order_id} | Generate a packing slip for this order for the given distribution center. |
| [**getDistributionCenterOrders**](FulfillmentApi.md#getDistributionCenterOrders) | **GET** /fulfillment/distribution_centers/{distribution_center_code}/orders | Retrieve orders queued up for this distribution center. |
| [**getDistributionCenters**](FulfillmentApi.md#getDistributionCenters) | **GET** /fulfillment/distribution_centers | Retrieve distribution centers |
| [**shipOrders**](FulfillmentApi.md#shipOrders) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/shipments | Mark orders as shipped |
| [**updateInventory**](FulfillmentApi.md#updateInventory) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/inventory | Update inventory |


<a name="acknowledgeOrders"></a>
# **acknowledgeOrders**
> acknowledgeOrders(distributionCenterCode, orderIds)

Acknowledge receipt of orders.

Acknowledge receipt of orders so that they are removed from the fulfillment queue.  This method must be called after receiving and order (via webhook) or retrieving (via retrieve orders method). 

### Example

```java
package fulfillment;

import com.ultracart.admin.v2.FulfillmentApi;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class AcknowledgeOrders {
    /**
     * acknowledgeOrders informs UltraCart that you (the fulfillment center) have received an order and have queued it for
     * shipping.  This method is NOT used to notify an order has shipped, only that it is going to be shipped at some
     * point in the future.
     * 
     * This method should be called by a fulfillment center after receiving an order either by 1) getDistributionCenterOrders
     * or 2) webhook.  Webhooks are the most efficient means for receiving orders, but if your fulfillment center lacks
     * the ability to consume webhooks, polling by getDistributionCenterOrders is an alternate means.
     * 
     * This method is important for notifying UltraCart that a fulfillment center has the action on an order.  Until this
     * call is made, UltraCart will continue to notify a fulfillment center of an order either by 1) subsequent webhooks or
     * 2) continue to include an order in subsequent getDistributionCenterOrders.
     * 
     * You will need the distribution center (DC) code.  UltraCart allows for multiple DC and the code is a
     * unique short string you assign to a DC as an easy mnemonic.
     * 
     * For more information about UltraCart distribution centers, please see:
     * https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377114/Distribution+Center
     * 
     * If you do not know your DC code, query a list of all DC and print them out.
     * $result = $fulfillment_api->getDistributionCenters();
     * print_r($result);
     * 
     * A successful call will receive back a status code 204 (No Content).
     * 
     * Possible Errors:
     * More than 100 order ids provided -> "order_ids can not contain more than 100 records at a time"
     */
    public static void execute() {
        String distributionCenterCode = "RAMI";
        FulfillmentApi fulfillmentApi = new FulfillmentApi(Constants.API_KEY);

        List<String> orderIds = new ArrayList<>();
        orderIds.add("DEMO-12345");
        orderIds.add("DEMO-12346");
        orderIds.add("DEMO-12347");
        orderIds.add("DEMO-12348");
        orderIds.add("DEMO-12349");

        try {
            // limit is 100 acknowledgements at a time.
            fulfillmentApi.acknowledgeOrders(distributionCenterCode, orderIds);
            System.out.println("done");
        } catch (ApiException e) {
            // update inventory failed. examine the reason.
            System.out.println("Exception when calling FulfillmentApi->acknowledgeOrders: " + e.getMessage());
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |
| **orderIds** | [**List&lt;String&gt;**](String.md)| Orders to acknowledge receipt of (limit 100) | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="generatePackingSlip"></a>
# **generatePackingSlip**
> OrderPackingSlipResponse generatePackingSlip(distributionCenterCode, orderId)

Generate a packing slip for this order for the given distribution center.

The packing slip PDF that is returned is base 64 encoded 

### Example

```java
package fulfillment;

import java.util.Base64;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import com.ultracart.admin.v2.FulfillmentApi;
import com.ultracart.admin.v2.models.OrderPackingSlipResponse;
import com.ultracart.admin.v2.util.ApiException;

import common.Constants;

public class GeneratePackingSlip {
    /**
     * generatePackingSlip accepts a distribution center code and order_id and returns back a base64 encoded byte array pdf.
     * Both the dc code and order_id are needed because an order may have multiple items shipping via different DCs.
     *
     * You will need the distribution center (DC) code. UltraCart allows for multiple DC and the code is a
     * unique short string you assign to a DC as an easy mnemonic.
     *
     * For more information about UltraCart distribution centers, please see:
     * https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377114/Distribution+Center
     *
     * If you do not know your DC code, query a list of all DC and print them out.
     * $result = $fulfillment_api->getDistributionCenters();
     * print_r($result);
     */
    public static void execute() {
        FulfillmentApi fulfillmentApi = new FulfillmentApi(Constants.API_KEY);

        String distributionCenterCode = "RAMI";
        String orderId = "DEMO-12345";

        try {
            // limit is 500 inventory updates at a time. batch them if you're going large.
            OrderPackingSlipResponse apiResponse = fulfillmentApi.generatePackingSlip(distributionCenterCode, orderId);
            String base64Pdf = apiResponse.getPdfBase64();
            byte[] decodedPdf = Base64.getDecoder().decode(base64Pdf);
            Files.write(Paths.get("packing_slip.pdf"), decodedPdf);

            System.out.println("done");
        } catch (ApiException | IOException e) {
            // update inventory failed. examine the reason.
            System.out.println("Exception when calling FulfillmentApi->generatePackingSlip: " + e.getMessage());
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |
| **orderId** | **String**| Order ID | |

### Return type

[**OrderPackingSlipResponse**](OrderPackingSlipResponse.md)

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

<a name="getDistributionCenterOrders"></a>
# **getDistributionCenterOrders**
> OrdersResponse getDistributionCenterOrders(distributionCenterCode)

Retrieve orders queued up for this distribution center.

Retrieves up to 100 orders that are queued up in this distribution center.  You must acknowledge them before additional new orders will be returned.  There is NO record chunking.  You&#39;ll get the same 100 records again and again until you acknowledge orders.  The orders that are returned contain only items for this distribution center and are by default completely expanded with billing, channel_partner, checkout, coupons, customer_profile, edi, gift, gift_certificate, internal, items, payment, shipping, summary, taxes. 

### Example

```java
package fulfillment;

import java.util.List;
import java.util.ArrayList;
import com.ultracart.admin.v2.FulfillmentApi;
import com.ultracart.admin.v2.models.Order;
import com.ultracart.admin.v2.models.OrdersResponse;
import com.ultracart.admin.v2.util.ApiException;

import common.Constants;

public class GetDistributionCenterOrders {
    /*
        getDistributionCenterOrders accepts a distribution center code and returns back up to 100 orders that need shipping.
        There is NO pagination with this method call. Once you receive the orders, you should insert them into your
        system, and acknowledge them via the acknowledgeOrders call. After you acknowledge the orders, subsequent calls
        to getDistributionCenterOrders will return another batch of 100 orders.

        The orders that are returned contain only items for THIS distribution center and are by default completely expanded
        with billing, channel_partner, checkout, coupons, customer_profile, edi, gift, gift_certificate, internal,
        items, payment, shipping, summary, taxes

        You will need the distribution center (DC) code. UltraCart allows for multiple DC and the code is a
        unique short string you assign to a DC as an easy mnemonic.

        For more information about UltraCart distribution centers, please see:
        https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377114/Distribution+Center

        If you do not know your DC code, query a list of all DC and print them out.
        DistributionCentersResponse result = fulfillmentApi.getDistributionCenters();
        System.out.println(result);
    */

    public static void execute() {
        FulfillmentApi fulfillmentApi = new FulfillmentApi(Constants.API_KEY);

        try {
            List<String> acknowledgedOrders = new ArrayList<>();
            String distributionCenterCode = "RAMI";
            OrdersResponse result = fulfillmentApi.getDistributionCenterOrders(distributionCenterCode);
            List<Order> orders = result.getOrders();
            
            for (Order order : orders) {
                System.out.println(order);
                // TODO: do something useful with this order, like adding it to your shipping queue.
                acknowledgedOrders.add(order.getOrderId());
            }

            // TODO: once you've securely and completely received it into your system, acknowledge the order.
            fulfillmentApi.acknowledgeOrders(distributionCenterCode, acknowledgedOrders);

            // After acknowledging orders, you should call getDistributionCenterOrders again until you receive zero orders to ship.

            System.out.println("done");
        } catch (Exception e) {
            // update inventory failed. examine the reason.
            System.out.println("Exception when calling FulfillmentApi.getDistributionCenterOrders: " + e.getMessage());
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |

### Return type

[**OrdersResponse**](OrdersResponse.md)

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

<a name="getDistributionCenters"></a>
# **getDistributionCenters**
> DistributionCentersResponse getDistributionCenters()

Retrieve distribution centers

Retrieves the distribution centers that this user has access to. 

### Example

```java
package fulfillment;

import com.ultracart.admin.v2.FulfillmentApi;
import com.ultracart.admin.v2.models.DistributionCenter;
import com.ultracart.admin.v2.models.DistributionCentersResponse;
import common.Constants;

public class GetDistributionCenters {
    /*
        This method returns back a list of all distribution centers configured for a merchant.

        You will need the distribution center (DC) code for most operations.
        UltraCart allows for multiple DC and the code is a unique short string you assign to a DC as an easy mnemonic.
        This method call is an easy way to determine what a DC code is for a particular distribution center.

        For more information about UltraCart distribution centers, please see:
        https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377114/Distribution+Center
    */

  public static void execute() {
    FulfillmentApi fulfillmentApi = new FulfillmentApi(Constants.API_KEY);

    try {
      DistributionCentersResponse result = fulfillmentApi.getDistributionCenters();
      for (DistributionCenter dc : result.getDistributionCenters()) {
        System.out.println(dc.toString());
      }

      System.out.println("done");
    } catch (Exception e) {
      // update inventory failed. examine the reason.
      System.out.println("Exception when calling FulfillmentApi.getDistributionCenters: " + e.getMessage());
      System.exit(1);
    }
  }
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**DistributionCentersResponse**](DistributionCentersResponse.md)

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

<a name="shipOrders"></a>
# **shipOrders**
> shipOrders(distributionCenterCode, shipments)

Mark orders as shipped

Store the tracking information and mark the order shipped for this distribution center. 

### Example

```java
package fulfillment;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

import com.ultracart.admin.v2.FulfillmentApi;
import com.ultracart.admin.v2.models.FulfillmentShipment;
import com.ultracart.admin.v2.util.ApiException;

import common.Constants;

public class ShipOrders {
    /*
        shipOrders informs UltraCart that you (the fulfillment center) have shipped an order and allows you to provide
        UltraCart with tracking information.

        You will need the distribution center (DC) code.  UltraCart allows for multiple DC and the code is a
        unique short string you assign to a DC as an easy mnemonic.

        For more information about UltraCart distribution centers, please see:
        https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377114/Distribution+Center

        If you do not know your DC code, query a list of all DC and print them out.
        DistributionCentersResponse result = fulfillmentApi.getDistributionCenters();
        System.out.println(result);

        A successful call will receive back a status code 204 (No Content).

        Possible Errors:
        More than 100 order ids provided -> "shipments can not contain more than 100 records at a time"
    */

    public static void execute() {
        String distributionCenterCode = "RAMI";
        FulfillmentApi fulfillmentApi = new FulfillmentApi(Constants.API_KEY);

        FulfillmentShipment shipment = new FulfillmentShipment();
        shipment.setOrderId("DEMO-12345");
        
        List<String> trackingNumbers = new ArrayList<>();
        trackingNumbers.add("UPS-1234567890");
        trackingNumbers.add("USPS-BLAH-BLAH-BLAH");
        shipment.setTrackingNumbers(trackingNumbers); // this order had two boxes.
        
        shipment.setShippingCost(new BigDecimal("16.99")); // the actual cost to ship this order
        shipment.setFulfillmentFee(new BigDecimal("8.99")); // this fulfillment center is kinda pricey.
        shipment.setPackageCost(new BigDecimal("11.99")); // 11.99?  we use only the finest packaging.

        List<FulfillmentShipment> shipments = new ArrayList<>();
        shipments.add(shipment); // up to 100 shipments per call

        try {
            // limit is 100 shipments updates at a time.
            fulfillmentApi.shipOrders(distributionCenterCode, shipments);
            System.out.println("done");
        } catch (Exception e) {
            // update inventory failed.  examine the reason.
            System.out.println("Exception when calling FulfillmentApi.shipOrders: " + e.getMessage());
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |
| **shipments** | [**List&lt;FulfillmentShipment&gt;**](FulfillmentShipment.md)| Orders to mark shipped | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="updateInventory"></a>
# **updateInventory**
> updateInventory(distributionCenterCode, inventories)

Update inventory

Update the inventory for items associated with this distribution center 

### Example

```java
package fulfillment;

import com.ultracart.admin.v2.FulfillmentApi;
import com.ultracart.admin.v2.models.FulfillmentInventory;
import common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UpdateInventory {
    /*
        updateInventory is a simple means of updating UltraCart inventory for one or more items (500 max per call)
        You will need the distribution center (DC) code.  UltraCart allows for multiple DC and the code is a
        unique short string you assign to a DC as an easy mnemonic.

        For more information about UltraCart distribution centers, please see:
        https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377114/Distribution+Center

        If you do not know your DC code, query a list of all DC and print them out.
        DistributionCentersResponse result = fulfillmentApi.getDistributionCenters();
        System.out.println(result);

        Possible Errors:
        More than 500 items provided -> "inventories can not contain more than 500 records at a time"
    */

    public static void execute() {
        String distributionCenterCode = "RAMI";
        FulfillmentApi fulfillmentApi = new FulfillmentApi(Constants.API_KEY);

        String sku = "9780982021361";
        BigDecimal quantity = BigDecimal.valueOf(9);
        FulfillmentInventory firstInventory = new FulfillmentInventory();
        firstInventory.setItemId(sku);
        firstInventory.setQuantity(quantity);
        
        List<FulfillmentInventory> inventoryUpdates = new ArrayList<>();
        inventoryUpdates.add(firstInventory); // for this example, we're only updating one item.

        System.out.println(inventoryUpdates);

        try {
            // limit is 500 inventory updates at a time.  batch them if you're going large.
            fulfillmentApi.updateInventory(distributionCenterCode, inventoryUpdates);
            System.out.println("done");
        } catch (Exception e) {
            // update inventory failed.  examine the reason.
            System.out.println("Exception when calling FulfillmentApi.updateInventory: " + e.getMessage());
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **distributionCenterCode** | **String**| Distribution center code | |
| **inventories** | [**List&lt;FulfillmentInventory&gt;**](FulfillmentInventory.md)| Inventory updates (limit 500) | |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

