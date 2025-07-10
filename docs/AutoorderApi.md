# AutoOrderApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**consolidateAutoOrders**](AutoOrderApi.md#consolidateAutoOrders) | **PUT** /auto_order/auto_orders/{auto_order_oid}/consolidate | Consolidates multiple auto orders |
| [**establishAutoOrderByReferenceOrderId**](AutoOrderApi.md#establishAutoOrderByReferenceOrderId) | **POST** /auto_order/auto_orders/reference_order_id/{reference_order_id} | Establish an auto order by referencing a regular order id |
| [**getAutoOrder**](AutoOrderApi.md#getAutoOrder) | **GET** /auto_order/auto_orders/{auto_order_oid} | Retrieve an auto order by oid |
| [**getAutoOrderByCode**](AutoOrderApi.md#getAutoOrderByCode) | **GET** /auto_order/auto_orders/code/{auto_order_code} | Retrieve an auto order by code |
| [**getAutoOrderByReferenceOrderId**](AutoOrderApi.md#getAutoOrderByReferenceOrderId) | **GET** /auto_order/auto_orders/reference_order_id/{reference_order_id} | Retrieve an auto order by order id |
| [**getAutoOrders**](AutoOrderApi.md#getAutoOrders) | **GET** /auto_order/auto_orders | Retrieve auto orders |
| [**getAutoOrdersBatch**](AutoOrderApi.md#getAutoOrdersBatch) | **POST** /auto_order/auto_orders/batch | Retrieve auto order batch |
| [**getAutoOrdersByQuery**](AutoOrderApi.md#getAutoOrdersByQuery) | **POST** /auto_order/auto_orders/query | Retrieve auto orders by query |
| [**pauseAutoOrder**](AutoOrderApi.md#pauseAutoOrder) | **PUT** /auto_order/auto_orders/{auto_order_oid}/pause | Pause auto order |
| [**updateAutoOrder**](AutoOrderApi.md#updateAutoOrder) | **PUT** /auto_order/auto_orders/{auto_order_oid} | Update an auto order |
| [**updateAutoOrdersBatch**](AutoOrderApi.md#updateAutoOrdersBatch) | **PUT** /auto_order/auto_orders/batch | Update multiple auto orders |


<a name="consolidateAutoOrders"></a>
# **consolidateAutoOrders**
> AutoOrderResponse consolidateAutoOrders(autoOrderOid, autoOrderConsolidate, expand)

Consolidates multiple auto orders

Consolidates mutliple auto orders on the UltraCart account. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.AutoOrder;
import com.ultracart.admin.v2.models.AutoOrderConsolidate;
import com.ultracart.admin.v2.models.AutoOrderResponse;
import common.Constants;

import java.util.Arrays;

public class ConsolidateAutoOrders {
  /**
   * consolidateAutoOrders
   * an auto order with no items, the original_order is used for shipping, billing, and payment information.
   * Once you have your empty auto order, add items to it and call updateAutoOrder.
   */
  public static void execute() {
    System.out.println("--- " + ConsolidateAutoOrders.class.getSimpleName() + " ---");

    try {
      // Create auto order API instance using API key
      AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);

      String expand = "items,items.future_schedules,original_order,rebill_orders"; // see https://www.ultracart.com/api/#resource_auto_order.html for list

      int targetAutoOrderOid = 123456789; // set getAutoOrdersByQuery for retrieving auto orders where you can get their auto_order_oid.
      AutoOrderConsolidate consolidateRequest = new AutoOrderConsolidate();
      consolidateRequest.setSourceAutoOrderOids(Arrays.asList(23456789, 3456789)); // these are the autoorder_oids you wish to consolidate into the target.

      AutoOrderResponse apiResponse = autoOrderApi.consolidateAutoOrders(targetAutoOrderOid, consolidateRequest, expand);

      AutoOrder consolidatedAutoOrder = apiResponse.getAutoOrder();

      // TODO: make sure the consolidated order has all the items and history of all orders.
      System.out.println(consolidatedAutoOrder);
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
| **autoOrderOid** | **Integer**| The auto order oid to consolidate into. | |
| **autoOrderConsolidate** | [**AutoOrderConsolidate**](AutoOrderConsolidate.md)| Auto orders to consolidate | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

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

<a name="establishAutoOrderByReferenceOrderId"></a>
# **establishAutoOrderByReferenceOrderId**
> AutoOrderResponse establishAutoOrderByReferenceOrderId(referenceOrderId, expand)

Establish an auto order by referencing a regular order id

Establish an auto order by referencing a regular order id.  The result will be an auto order without any items.  You should add the items and perform an update call.  Orders must be less than 60 days old and use a credit card payment. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.AutoOrder;
import com.ultracart.admin.v2.models.AutoOrderItem;
import com.ultracart.admin.v2.models.AutoOrderResponse;
import common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EstablishAutoOrderByReferenceOrderId {
    /**
     *
     * This method takes a normal order id and creates an empty auto order from it.  While this might seem useless having
     * an auto order with no items, the original_order is used for shipping, billing, and payment information.
     * Once you have your empty auto order, add items to it and call updateAutoOrder.
     *
     */
    public static void execute() {
        System.out.println("--- " + EstablishAutoOrderByReferenceOrderId.class.getSimpleName() + " ---");

        try {
            // Create auto order API instance using API key
            AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);

            String expand = "items,items.future_schedules,original_order,rebill_orders"; // see https://www.ultracart.com/api/#resource_auto_order.html for list

            String originalOrderId = "DEMO-123457";
            AutoOrderResponse apiResponse = autoOrderApi.establishAutoOrderByReferenceOrderId(originalOrderId, expand);

            AutoOrder emptyAutoOrder = apiResponse.getAutoOrder();
            int autoOrderOid = emptyAutoOrder.getAutoOrderOid();

            List<AutoOrderItem> items = new ArrayList<>();
            AutoOrderItem item = new AutoOrderItem();
            item.setOriginalItemId("ITEM_ABC"); // This item should be configured with auto order features.
            item.setOriginalQuantity(BigDecimal.valueOf(1));
            item.setArbitraryUnitCost(BigDecimal.valueOf(59.99));
            // Valid Frequencies
            // "Weekly", "Biweekly", "Every...", "Every 10 Days", "Every 4 Weeks", "Every 6 Weeks", "Every 8 Weeks", "Every 24 Days", "Every 28 Days", "Monthly",
            // "Every 45 Days", "Every 2 Months", "Every 3 Months", "Every 4 Months", "Every 5 Months", "Every 6 Months", "Yearly"
            item.setFrequency(AutoOrderItem.FrequencyEnum.MONTHLY);
            items.add(item);
            emptyAutoOrder.setItems(items);

            String validateOriginalOrder = "No";
            AutoOrderResponse updateResponse = autoOrderApi.updateAutoOrder(autoOrderOid, emptyAutoOrder, validateOriginalOrder, expand);
            AutoOrder updatedAutoOrder = updateResponse.getAutoOrder();
            System.out.println(updatedAutoOrder);
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
| **referenceOrderId** | **String**| The order id to attach this auto order to | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

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

<a name="getAutoOrder"></a>
# **getAutoOrder**
> AutoOrderResponse getAutoOrder(autoOrderOid, expand)

Retrieve an auto order by oid

Retrieves a single auto order using the specified auto order oid. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;

public class GetAutoOrder {
    /**
     * retrieves an auto_order given the auto_order_oid;
     */
    public static void execute() {
        System.out.println("--- " + GetAutoOrder.class.getSimpleName() + " ---");
        
        try {
            // Create auto order API instance using API key
            AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);
            
            String expand = "items,items.future_schedules,original_order,rebill_orders"; // see https://www.ultracart.com/api/#resource_auto_order.html for list
            int autoOrderOid = 123456789; // If you don't know the oid, use getAutoOrdersByQuery for retrieving auto orders
            
            AutoOrderResponse apiResponse = autoOrderApi.getAutoOrder(autoOrderOid, expand);
            AutoOrder autoOrder = apiResponse.getAutoOrder();
            
            System.out.println(autoOrder);
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
| **autoOrderOid** | **Integer**| The auto order oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

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

<a name="getAutoOrderByCode"></a>
# **getAutoOrderByCode**
> AutoOrderResponse getAutoOrderByCode(autoOrderCode, expand)

Retrieve an auto order by code

Retrieves a single auto order using the specified reference (original) order id. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;

public class GetAutoOrderByCode {
    /**
     * This example illustrates how to query an auto order when you know the 'code'.  Each AutoOrder has a unique
     * identifier used by UltraCart called an OID (Object Identifier).  AutoOrders also have a unique code which
     * is (arguably) an easy way for customers to discuss a specific auto order with a merchant.
     * The codes look like this: "RT2A9CBSX9"
     *
     * It is doubtful that an UltraCart merchant will ever make use of this method.
     *
     * These are the possible expansion values for auto orders.  This list is taken from www.ultracart.com/api/
     * and may become stale. Please review the master website when in doubt.
     * items
     * items.future_schedules
     * items.sample_schedule
     * original_order
     * original_order.affiliate
     * original_order.affiliate.ledger
     * original_order.auto_order
     * original_order.billing
     * original_order.buysafe
     * original_order.channel_partner
     * original_order.checkout
     * original_order.coupon
     * original_order.customer_profile
     * original_order.digital_order
     * original_order.edi
     * original_order.fraud_score
     * original_order.gift
     * original_order.gift_certificate
     * original_order.internal
     * original_order.item
     * original_order.linked_shipment
     * original_order.marketing
     * original_order.payment
     * original_order.payment.transaction
     * original_order.quote
     * original_order.salesforce
     * original_order.shipping
     * original_order.summary
     * original_order.taxes
     * rebill_orders
     * rebill_orders.affiliate
     * rebill_orders.affiliate.ledger
     * rebill_orders.auto_order
     * rebill_orders.billing
     * rebill_orders.buysafe
     * rebill_orders.channel_partner
     * rebill_orders.checkout
     * rebill_orders.coupon
     * rebill_orders.customer_profile
     * rebill_orders.digital_order
     * rebill_orders.edi
     * rebill_orders.fraud_score
     * rebill_orders.gift
     * rebill_orders.gift_certificate
     * rebill_orders.internal
     * rebill_orders.item
     * rebill_orders.linked_shipment
     * rebill_orders.marketing
     * rebill_orders.payment
     * rebill_orders.payment.transaction
     * rebill_orders.quote
     * rebill_orders.salesforce
     * rebill_orders.shipping
     * rebill_orders.summary
     * rebill_orders.taxes
     */
    public static void execute() {
        System.out.println("--- " + GetAutoOrderByCode.class.getSimpleName() + " ---");
        
        try {
            // Create auto order API instance using API key
            AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);
            
            String expand = "items,items.future_schedules,original_order,rebill_orders"; // contact us if you're unsure what you need
            String code = "RT2A9CBSX9";
            AutoOrderResponse apiResponse = autoOrderApi.getAutoOrderByCode(code, expand);
            AutoOrder autoOrder = apiResponse.getAutoOrder();
            
            // this will be verbose...
            System.out.println(autoOrder);
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
| **autoOrderCode** | **String**| The auto order oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

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

<a name="getAutoOrderByReferenceOrderId"></a>
# **getAutoOrderByReferenceOrderId**
> AutoOrderResponse getAutoOrderByReferenceOrderId(referenceOrderId, expand)

Retrieve an auto order by order id

Retrieves a single auto order using the specified reference (original) order id. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;

public class GetAutoOrderByReferenceOrderId {
    /**
     * This example illustrates how to query an auto order when you know the original order id.
     * These are the possible expansion values for auto orders.  This list is taken from www.ultracart.com/api/
     * and may become stale. Please review the master website when in doubt.
     * items
     * items.future_schedules
     * items.sample_schedule
     * original_order
     * original_order.affiliate
     * original_order.affiliate.ledger
     * original_order.auto_order
     * original_order.billing
     * original_order.buysafe
     * original_order.channel_partner
     * original_order.checkout
     * original_order.coupon
     * original_order.customer_profile
     * original_order.digital_order
     * original_order.edi
     * original_order.fraud_score
     * original_order.gift
     * original_order.gift_certificate
     * original_order.internal
     * original_order.item
     * original_order.linked_shipment
     * original_order.marketing
     * original_order.payment
     * original_order.payment.transaction
     * original_order.quote
     * original_order.salesforce
     * original_order.shipping
     * original_order.summary
     * original_order.taxes
     * rebill_orders
     * rebill_orders.affiliate
     * rebill_orders.affiliate.ledger
     * rebill_orders.auto_order
     * rebill_orders.billing
     * rebill_orders.buysafe
     * rebill_orders.channel_partner
     * rebill_orders.checkout
     * rebill_orders.coupon
     * rebill_orders.customer_profile
     * rebill_orders.digital_order
     * rebill_orders.edi
     * rebill_orders.fraud_score
     * rebill_orders.gift
     * rebill_orders.gift_certificate
     * rebill_orders.internal
     * rebill_orders.item
     * rebill_orders.linked_shipment
     * rebill_orders.marketing
     * rebill_orders.payment
     * rebill_orders.payment.transaction
     * rebill_orders.quote
     * rebill_orders.salesforce
     * rebill_orders.shipping
     * rebill_orders.summary
     * rebill_orders.taxes
     */
    public static void execute() {
        System.out.println("--- " + GetAutoOrderByReferenceOrderId.class.getSimpleName() + " ---");

        try {
            // Create auto order API instance using API key
            AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);

            String expand =
                "items,items.future_schedules,original_order,rebill_orders"; // contact us if you're unsure what you need
            String originalOrderId = "DEMO-12345678";
            AutoOrderResponse apiResponse = autoOrderApi.getAutoOrderByReferenceOrderId(originalOrderId, expand);
            AutoOrder autoOrder = apiResponse.getAutoOrder();

            // this will be verbose...
            System.out.println(autoOrder);
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
| **referenceOrderId** | **String**| The auto order oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

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

<a name="getAutoOrders"></a>
# **getAutoOrders**
> AutoOrdersResponse getAutoOrders(autoOrderCode, originalOrderId, firstName, lastName, company, city, state, postalCode, countryCode, phone, email, originalOrderDateBegin, originalOrderDateEnd, nextShipmentDateBegin, nextShipmentDateEnd, cardType, itemId, status, limit, offset, since, sort, expand)

Retrieve auto orders

Retrieves auto orders from the account.  If no parameters are specified, all auto orders will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.AutoOrder;
import com.ultracart.admin.v2.models.AutoOrdersResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class GetAutoOrders {
    /**
    getAutoOrders provides a query service on AutoOrders (aka subscriptions or recurring orders) within the UltraCart
    system. It was the first query provided and the most cumbersome to use.  Please use getAutoOrdersByQuery for an
    easier query method.  If you have multiple auto_order_oids and need the corresponding objects, consider
    getAutoOrdersBatch() to reduce call count.
    */
    public static void execute() {
        System.out.println("--- " + GetAutoOrders.class.getSimpleName() + " ---");
        
        try {
            List<AutoOrder> autoOrders = new ArrayList<AutoOrder>();
            
            int iteration = 1;
            int offset = 0;
            int limit = 200;
            boolean moreRecordsToFetch = true;
            
            // Create auto order API instance using API key
            AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);
            
            while (moreRecordsToFetch) {
                System.out.println("executing iteration " + iteration);
                List<AutoOrder> chunkOfAutoOrders = getAutoOrderChunk(autoOrderApi, offset, limit);
                autoOrders.addAll(chunkOfAutoOrders);
                offset = offset + limit;
                moreRecordsToFetch = chunkOfAutoOrders.size() == limit;
                iteration++;
            }
            
            // Display the auto orders
            for (AutoOrder autoOrder : autoOrders) {
                System.out.println(autoOrder);
            }
            
            System.out.println("Total auto orders retrieved: " + autoOrders.size());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    /**
     * Returns a chunk of auto orders based on query parameters
     * @param autoOrderApi The auto order API instance
     * @param offset Pagination offset
     * @param limit Maximum number of records to return
     * @return List of matching auto orders
     */
    public static List<AutoOrder> getAutoOrderChunk(AutoOrderApi autoOrderApi, int offset, int limit) throws ApiException {
        String expand = "items,original_order,rebill_orders";
        // see www.ultracart.com/api/ for all the expansion fields available (this list below may become stale)
        /*
        Possible Order Expansions:

        add_ons                             items.sample_schedule	        original_order.buysafe	        original_order.payment.transaction
        items	                            original_order	                original_order.channel_partner	original_order.quote
        items.future_schedules	            original_order.affiliate	    original_order.checkout	        original_order.salesforce
        original_order.affiliate.ledger	    original_order.coupon	        original_order.shipping
        original_order.auto_order	        original_order.customer_profile	original_order.summary
        original_order.billing	            original_order.digital_order	original_order.taxes
        rebill_orders	                    original_order.edi	            rebill_orders.affiliate
        rebill_orders.affiliate.ledger	    original_order.fraud_score	    rebill_orders.auto_order
        rebill_orders.billing	            original_order.gift	            rebill_orders.buysafe
        rebill_orders.channel_partner	    original_order.gift_certificate	rebill_orders.checkout
        rebill_orders.coupon	            original_order.internal	        rebill_orders.customer_profile
        rebill_orders.digital_order	        original_order.item	            rebill_orders.edi
        rebill_orders.fraud_score	        original_order.linked_shipment	rebill_orders.gift
        rebill_orders.gift_certificate      original_order.marketing	    rebill_orders.internal
        rebill_orders.item	                original_order.payment	        rebill_orders.linked_shipment
        rebill_orders.marketing	            rebill_orders.payment	        rebill_orders.quote
        rebill_orders.payment.transaction	rebill_orders.salesforce	    rebill_orders.shipping
        rebill_orders.summary	            rebill_orders.taxes
        */
        
        String autoOrderCode = null;
        String originalOrderId = null;
        String firstName = null;
        String lastName = null;
        String company = null;
        String city = null;
        String state = null;
        String postalCode = null;
        String countryCode = null;
        String phone = null;
        String email = "test@ultracart.com"; // <-- for this example, we are only filtering on email address.
        String originalOrderDateBegin = null;
        String originalOrderDateEnd = null;
        String nextShipmentDateBegin = null;
        String nextShipmentDateEnd = null;
        String cardType = null;
        String itemId = null;
        String status = null;
        String since = null;
        String sort = null;
        
        // see all these parameters?  that is why you should use getAutoOrdersByQuery() instead of getAutoOrders()
        AutoOrdersResponse apiResponse = autoOrderApi.getAutoOrders(autoOrderCode, originalOrderId, firstName, lastName,
            company, city, state, postalCode, countryCode, phone, email, originalOrderDateBegin,
            originalOrderDateEnd, nextShipmentDateBegin, nextShipmentDateEnd, cardType, itemId, status,
            limit, offset, since, sort, expand);
            
        if (apiResponse.getAutoOrders() != null) {
            return apiResponse.getAutoOrders();
        }
        return new ArrayList<AutoOrder>();
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrderCode** | **String**| Auto order code | [optional] |
| **originalOrderId** | **String**| Original order id | [optional] |
| **firstName** | **String**| First name | [optional] |
| **lastName** | **String**| Last name | [optional] |
| **company** | **String**| Company | [optional] |
| **city** | **String**| City | [optional] |
| **state** | **String**| State | [optional] |
| **postalCode** | **String**| Postal code | [optional] |
| **countryCode** | **String**| Country code (ISO-3166 two letter) | [optional] |
| **phone** | **String**| Phone | [optional] |
| **email** | **String**| Email | [optional] |
| **originalOrderDateBegin** | **String**| Original order date begin | [optional] |
| **originalOrderDateEnd** | **String**| Original order date end | [optional] |
| **nextShipmentDateBegin** | **String**| Next shipment date begin | [optional] |
| **nextShipmentDateEnd** | **String**| Next shipment date end | [optional] |
| **cardType** | **String**| Card type | [optional] |
| **itemId** | **String**| Item ID | [optional] |
| **status** | **String**| Status | [optional] |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **since** | **String**| Fetch auto orders that have been created/modified since this date/time. | [optional] |
| **sort** | **String**| The sort order of the auto orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

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

<a name="getAutoOrdersBatch"></a>
# **getAutoOrdersBatch**
> AutoOrdersResponse getAutoOrdersBatch(autoOrderBatch, expand)

Retrieve auto order batch

Retrieves a group of auto orders from the account based on an array of auto order oids.  If more than 200 auto order ids are specified, the API call will fail with a bad request error. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.AutoOrder;
import com.ultracart.admin.v2.models.AutoOrderQueryBatch;
import com.ultracart.admin.v2.models.AutoOrdersResponse;
import common.Constants;

import java.util.Arrays;
import java.util.List;

public class GetAutoOrdersBatch {
    /**
     * This example illustrates how to retrieve auto orders when you have a list of auto_order_oid.
     * These are the possible expansion values for auto orders.  This list is taken from www.ultracart.com/api/
     * and may become stale. Please review the master website when in doubt.
     * items
     * items.future_schedules
     * items.sample_schedule
     * original_order
     * original_order.affiliate
     * original_order.affiliate.ledger
     * original_order.auto_order
     * original_order.billing
     * original_order.buysafe
     * original_order.channel_partner
     * original_order.checkout
     * original_order.coupon
     * original_order.customer_profile
     * original_order.digital_order
     * original_order.edi
     * original_order.fraud_score
     * original_order.gift
     * original_order.gift_certificate
     * original_order.internal
     * original_order.item
     * original_order.linked_shipment
     * original_order.marketing
     * original_order.payment
     * original_order.payment.transaction
     * original_order.quote
     * original_order.salesforce
     * original_order.shipping
     * original_order.summary
     * original_order.taxes
     * rebill_orders
     * rebill_orders.affiliate
     * rebill_orders.affiliate.ledger
     * rebill_orders.auto_order
     * rebill_orders.billing
     * rebill_orders.buysafe
     * rebill_orders.channel_partner
     * rebill_orders.checkout
     * rebill_orders.coupon
     * rebill_orders.customer_profile
     * rebill_orders.digital_order
     * rebill_orders.edi
     * rebill_orders.fraud_score
     * rebill_orders.gift
     * rebill_orders.gift_certificate
     * rebill_orders.internal
     * rebill_orders.item
     * rebill_orders.linked_shipment
     * rebill_orders.marketing
     * rebill_orders.payment
     * rebill_orders.payment.transaction
     * rebill_orders.quote
     * rebill_orders.salesforce
     * rebill_orders.shipping
     * rebill_orders.summary
     * rebill_orders.taxes*
     */
    public static void execute() {
        System.out.println("--- " + GetAutoOrdersBatch.class.getSimpleName() + " ---");

        try {
            // Create auto order API instance using API key
            AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);

            String expand =
                "items,items.future_schedules,original_order,rebill_orders"; // contact us if you're unsure what you need
            List<Integer> autoOrderOids = Arrays.asList(123456, 234567, 345678, 456789);

            AutoOrderQueryBatch batchRequest = new AutoOrderQueryBatch();
            batchRequest.setAutoOrderOids(autoOrderOids);

            AutoOrdersResponse apiResponse = autoOrderApi.getAutoOrdersBatch(batchRequest, expand);
            List<AutoOrder> autoOrders = apiResponse.getAutoOrders();

            // Display auto orders
            for (AutoOrder autoOrder : autoOrders) {
                System.out.println(autoOrder);
            }

            System.out.println("Retrieved " + autoOrders.size() + " auto orders");
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
| **autoOrderBatch** | [**AutoOrderQueryBatch**](AutoOrderQueryBatch.md)| Auto order batch | |
| **expand** | **String**| The object expansion to perform on the result. | [optional] |

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

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

<a name="getAutoOrdersByQuery"></a>
# **getAutoOrdersByQuery**
> AutoOrdersResponse getAutoOrdersByQuery(autoOrderQuery, limit, offset, sort, expand)

Retrieve auto orders by query

Retrieves a group of auto orders from the account based on a query object.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.AutoOrder;
import com.ultracart.admin.v2.models.AutoOrderQuery;
import com.ultracart.admin.v2.models.AutoOrdersResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class GetAutoOrdersByQuery {
  /**
   * This example illustrates how to retrieve auto orders and handle pagination.
   * <p>
   * These are the possible expansion values for auto orders.  This list is taken from www.ultracart.com/api/
   * and may become stale. Please review the master website when in doubt.
   * items
   * items.future_schedules
   * items.sample_schedule
   * original_order
   * original_order.affiliate
   * original_order.affiliate.ledger
   * original_order.auto_order
   * original_order.billing
   * original_order.buysafe
   * original_order.channel_partner
   * original_order.checkout
   * original_order.coupon
   * original_order.customer_profile
   * original_order.digital_order
   * original_order.edi
   * original_order.fraud_score
   * original_order.gift
   * original_order.gift_certificate
   * original_order.internal
   * original_order.item
   * original_order.linked_shipment
   * original_order.marketing
   * original_order.payment
   * original_order.payment.transaction
   * original_order.quote
   * original_order.salesforce
   * original_order.shipping
   * original_order.summary
   * original_order.taxes
   * rebill_orders
   * rebill_orders.affiliate
   * rebill_orders.affiliate.ledger
   * rebill_orders.auto_order
   * rebill_orders.billing
   * rebill_orders.buysafe
   * rebill_orders.channel_partner
   * rebill_orders.checkout
   * rebill_orders.coupon
   * rebill_orders.customer_profile
   * rebill_orders.digital_order
   * rebill_orders.edi
   * rebill_orders.fraud_score
   * rebill_orders.gift
   * rebill_orders.gift_certificate
   * rebill_orders.internal
   * rebill_orders.item
   * rebill_orders.linked_shipment
   * rebill_orders.marketing
   * rebill_orders.payment
   * rebill_orders.payment.transaction
   * rebill_orders.quote
   * rebill_orders.salesforce
   * rebill_orders.shipping
   * rebill_orders.summary
   * rebill_orders.taxes
   */
  public static void execute() {
    System.out.println("--- " + GetAutoOrdersByQuery.class.getSimpleName() + " ---");

    try {
      List<AutoOrder> autoOrders = new ArrayList<AutoOrder>();

      int iteration = 1;
      int offset = 0;
      int limit = 200;
      boolean moreRecordsToFetch = true;

      // Create auto order API instance using API key
      AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);

      while (moreRecordsToFetch) {
        System.out.println("executing iteration " + iteration);

        List<AutoOrder> chunkOfOrders = getAutoOrderChunk(autoOrderApi, offset, limit);
        autoOrders.addAll(chunkOfOrders);
        offset = offset + limit;
        moreRecordsToFetch = chunkOfOrders.size() == limit;
        iteration++;
      }

      // Display auto orders
      for (AutoOrder autoOrder : autoOrders) {
        System.out.println(autoOrder);
      }

      System.out.println("Retrieved " + autoOrders.size() + " auto orders");
    } catch (Exception ex) {
      System.out.println("ApiException occurred on iteration");
      System.out.println(ex);
      System.exit(1);
    }
  }

  /**
   * Returns a chunk of auto orders based on query parameters
   *
   * @param autoOrderApi The auto order API instance
   * @param offset       Pagination offset
   * @param limit        Maximum number of records to return
   * @return List of matching auto orders
   */
  public static List<AutoOrder> getAutoOrderChunk(AutoOrderApi autoOrderApi, int offset, int limit) throws ApiException {
    String expand =
        "items,items.future_schedules,original_order,rebill_orders"; // contact us if you're unsure what you need

        /*
         * These are the supported sorting fields:
        auto_order_code
        order_id
        shipping.company
        shipping.first_name
        shipping.last_name
        shipping.city
        shipping.state_region
        shipping.postal_code
        shipping.country_code
        billing.phone
        billing.email
        billing.cc_email
        billing.company
        billing.first_name
        billing.last_name
        billing.city
        billing.state
        billing.postal_code
        billing.country_code
        creation_dts
        payment.payment_dts
        checkout.screen_branding_theme_code
        next_shipment_dts
         */

    String sort = "next_shipment_dts";
    AutoOrderQuery query = new AutoOrderQuery();
    query.setEmail("support@ultracart.com");
    AutoOrdersResponse apiResponse = autoOrderApi.getAutoOrdersByQuery(query, limit, offset, sort, expand);

    if (apiResponse.getAutoOrders() != null) {
      return apiResponse.getAutoOrders();
    }

    return new ArrayList<AutoOrder>();
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrderQuery** | [**AutoOrderQuery**](AutoOrderQuery.md)| Auto order query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the auto orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result. | [optional] |

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

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

<a name="pauseAutoOrder"></a>
# **pauseAutoOrder**
> AutoOrderResponse pauseAutoOrder(autoOrderOid, autoOrder, expand)

Pause auto order

Completely pause an auto order 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

public class PauseAutoOrder {
    /*
     * This is a convenience method created for an UltraCart merchant to pause a large number of auto orders
     * due to an inventory shortage. This is not new functionality and can be accomplished with the normal updateAutoOrder
     * call. It does the following logic to an auto order:
     * for each item in the auto order:
     *    if the item is not paused, pause it, setPause(true)
     * save the changes by calling updateAutoOrder()
     *
     * Some warnings if you choose to use this method.
     * There are no convenience methods to unpause auto orders.
     * There are no convenience methods to query which auto orders are paused.
     * We do not recommend pausing auto orders and the merchant is on their own to manage auto order state if they
     * choose to begin pausing orders. Keep good track of what you're doing.
     *
     */
    public static void execute() {
        AutoOrderApi autoOrderApi = new AutoOrderApi(common.Constants.API_KEY);

        String expand = "items"; // see https://www.ultracart.com/api/#resource_auto_order.html for list
        int autoOrderOid = 123456789; // get an auto order and update it. There are many ways to retrieve an auto order.
        try {
            AutoOrderResponse getResponse = autoOrderApi.getAutoOrder(autoOrderOid, expand);
            AutoOrder autoOrder = getResponse.getAutoOrder();

            AutoOrderResponse pauseResponse = autoOrderApi.pauseAutoOrder(autoOrderOid, autoOrder, expand);
            AutoOrder pausedAutoOrder = pauseResponse.getAutoOrder();
            System.out.println(pausedAutoOrder);
        } catch (ApiException e) {
            System.err.println("Exception when calling AutoOrderApi#getAutoOrder");
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **autoOrderOid** | **Integer**| The auto order oid to pause. | |
| **autoOrder** | [**AutoOrder**](AutoOrder.md)| Auto order to pause | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

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

<a name="updateAutoOrder"></a>
# **updateAutoOrder**
> AutoOrderResponse updateAutoOrder(autoOrderOid, autoOrder, validateOriginalOrder, expand)

Update an auto order

Update an auto order on the UltraCart account. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;

public class UpdateAutoOrder {
    /**
     *
     * This method allows for updating an auto order.
     * Warning: Take great care editing auto orders.  They are complex.
     * Sometimes you must change the original_order to affect the auto_order.  If you have questions about what fields
     * to update to achieve your desired change, contact UltraCart support.  Better to ask and get it right than to
     * make a bad assumption and corrupt a thousand auto orders.  UltraCart support is ready to assist.
     *
     */
    public static void execute() {
        System.out.println("--- " + UpdateAutoOrder.class.getSimpleName() + " ---");
        
        try {
            // Create auto order API instance using API key
            AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);
            
            String expand = "items,items.future_schedules,original_order,rebill_orders"; // see https://www.ultracart.com/api/#resource_auto_order.html for list
            int autoOrderOid = 123456789; // get an auto order and update it. There are many ways to retrieve an auto order.
            AutoOrderResponse apiResponse = autoOrderApi.getAutoOrder(autoOrderOid, null);
            AutoOrder autoOrder = apiResponse.getAutoOrder();
            String validateOriginalOrder = "No";
            
            // for this example, the customer supplied the wrong postal code when ordering. So to change the postal code for
            // all subsequent auto orders, we change the original order.
            autoOrder.getOriginalOrder().getBilling().setPostalCode("44233");
            
            AutoOrderResponse updateResponse = autoOrderApi.updateAutoOrder(autoOrderOid, autoOrder, validateOriginalOrder, expand);
            AutoOrder updatedAutoOrder = updateResponse.getAutoOrder();
            System.out.println(updatedAutoOrder);
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
| **autoOrderOid** | **Integer**| The auto order oid to update. | |
| **autoOrder** | [**AutoOrder**](AutoOrder.md)| Auto order to update | |
| **validateOriginalOrder** | **String**| Validate original order before updating | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**AutoOrderResponse**](AutoOrderResponse.md)

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

<a name="updateAutoOrdersBatch"></a>
# **updateAutoOrdersBatch**
> AutoOrdersResponse updateAutoOrdersBatch(autoOrdersRequest, expand, placeholders, async)

Update multiple auto orders

Update multiple auto orders on the UltraCart account. 

### Example

```java
package auto_order;

import com.ultracart.admin.v2.AutoOrderApi;
import com.ultracart.admin.v2.models.AutoOrder;
import com.ultracart.admin.v2.models.AutoOrdersRequest;
import com.ultracart.admin.v2.models.AutoOrdersResponse;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class UpdateAutoOrdersBatch {
    /**
     *
     * This method allows for updating multiple auto orders.
     * Warning: Take great care editing auto orders.  They are complex.
     * Sometimes you must change the original_order to affect the auto_order.  If you have questions about what fields
     * to update to achieve your desired change, contact UltraCart support.  Better to ask and get it right than to
     * make a bad assumption and corrupt a thousand auto orders.  UltraCart support is ready to assist.
     *
     */
    public static void execute() {
        System.out.println("--- " + UpdateAutoOrdersBatch.class.getSimpleName() + " ---");
        
        try {
            // Create auto order API instance using API key
            AutoOrderApi autoOrderApi = new AutoOrderApi(Constants.API_KEY);
            
            // The _async parameter is what it seems.  True if async.
            // The max records allowed depends on the async flag.  Synch max is 20, Asynch max is 100.
            
            boolean async = true; // if true, success returns back a 204 No Content. False returns back the updated orders.
            String expand = null; // since we're async, nothing is returned, so we don't care about expansions.
            // If you are doing a synchronous operation, then set your expand appropriately. set getAutoOrders()
            // sample for expansion samples.
            boolean placeholders = false; // mostly used for UI, not needed for a pure scripting operation.
            
            List<AutoOrder> autoOrders = new ArrayList<AutoOrder>(); // TODO: This should be a list of auto orders that have been updated. See any getAutoOrders method for retrieval.
            AutoOrdersRequest autoOrdersRequest = new AutoOrdersRequest();
            autoOrdersRequest.setAutoOrders(autoOrders);
            
            AutoOrdersResponse apiResponse = autoOrderApi.updateAutoOrdersBatch(autoOrdersRequest, expand, placeholders, async);
            if (apiResponse != null) {
                // something went wrong if we have a response.
                System.out.println(apiResponse);
            }
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
| **autoOrdersRequest** | [**AutoOrdersRequest**](AutoOrdersRequest.md)| Auto orders to update (synchronous maximum 20 / asynchronous maximum 100) | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |
| **async** | **Boolean**| True if the operation should be run async.  No result returned | [optional] |

### Return type

[**AutoOrdersResponse**](AutoOrdersResponse.md)

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

