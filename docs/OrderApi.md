# OrderApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adjustOrderTotal**](OrderApi.md#adjustOrderTotal) | **POST** /order/orders/{order_id}/adjust_order_total/{desired_total} | Adjusts an order total |
| [**cancelOrder**](OrderApi.md#cancelOrder) | **POST** /order/orders/{order_id}/cancel | Cancel an order |
| [**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /order/orders/{order_id} | Delete an order |
| [**duplicateOrder**](OrderApi.md#duplicateOrder) | **POST** /order/orders/{order_id}/duplicate | Duplicate an order |
| [**format**](OrderApi.md#format) | **POST** /order/orders/{order_id}/format | Format order |
| [**generateInvoice**](OrderApi.md#generateInvoice) | **GET** /order/orders/{order_id}/invoice | Generate an invoice for this order. |
| [**generateOrderToken**](OrderApi.md#generateOrderToken) | **GET** /order/orders/token/{order_id} | Generate an order token for a given order id |
| [**generatePackingSlipAllDC**](OrderApi.md#generatePackingSlipAllDC) | **GET** /order/orders/{order_id}/packing_slip | Generate a packing slip for this order across all distribution centers. |
| [**generatePackingSlipSpecificDC**](OrderApi.md#generatePackingSlipSpecificDC) | **GET** /order/orders/{order_id}/packing_slip/{distribution_center_code} | Generate a packing slip for this order for the given distribution center. |
| [**getAccountsReceivableRetryConfig**](OrderApi.md#getAccountsReceivableRetryConfig) | **GET** /order/accountsReceivableRetryConfig | Retrieve A/R Retry Configuration |
| [**getAccountsReceivableRetryStats**](OrderApi.md#getAccountsReceivableRetryStats) | **GET** /order/accountsReceivableRetryConfig/stats | Retrieve A/R Retry Statistics |
| [**getOrder**](OrderApi.md#getOrder) | **GET** /order/orders/{order_id} | Retrieve an order |
| [**getOrderByToken**](OrderApi.md#getOrderByToken) | **POST** /order/orders/token | Retrieve an order using a token |
| [**getOrderEdiDocuments**](OrderApi.md#getOrderEdiDocuments) | **GET** /order/orders/{order_id}/edi | Retrieve EDI documents associated with this order. |
| [**getOrders**](OrderApi.md#getOrders) | **GET** /order/orders | Retrieve orders |
| [**getOrdersBatch**](OrderApi.md#getOrdersBatch) | **POST** /order/orders/batch | Retrieve order batch |
| [**getOrdersByQuery**](OrderApi.md#getOrdersByQuery) | **POST** /order/orders/query | Retrieve orders by query |
| [**insertOrder**](OrderApi.md#insertOrder) | **POST** /order/orders | Insert an order |
| [**isRefundableOrder**](OrderApi.md#isRefundableOrder) | **GET** /order/orders/{order_id}/refundable | Determine if an order can be refunded |
| [**processPayment**](OrderApi.md#processPayment) | **POST** /order/orders/{order_id}/process_payment | Process payment |
| [**refundOrder**](OrderApi.md#refundOrder) | **PUT** /order/orders/{order_id}/refund | Refund an order |
| [**refundOrderCompletely**](OrderApi.md#refundOrderCompletely) | **PUT** /order/orders/{order_id}/refund_completely | Refund an order completely |
| [**replacement**](OrderApi.md#replacement) | **POST** /order/orders/{order_id}/replacement | Replacement order |
| [**resendReceipt**](OrderApi.md#resendReceipt) | **POST** /order/orders/{order_id}/resend_receipt | Resend receipt |
| [**resendShipmentConfirmation**](OrderApi.md#resendShipmentConfirmation) | **POST** /order/orders/{order_id}/resend_shipment_confirmation | Resend shipment confirmation |
| [**updateAccountsReceivableRetryConfig**](OrderApi.md#updateAccountsReceivableRetryConfig) | **POST** /order/accountsReceivableRetryConfig | Update A/R Retry Configuration |
| [**updateOrder**](OrderApi.md#updateOrder) | **PUT** /order/orders/{order_id} | Update an order |
| [**validateOrder**](OrderApi.md#validateOrder) | **POST** /order/validate | Validate |


<a name="adjustOrderTotal"></a>
# **adjustOrderTotal**
> BaseResponse adjustOrderTotal(orderId, desiredTotal)

Adjusts an order total

Adjusts an order total.  Adjusts individual items appropriately and considers taxes.  Desired total should be provided in the same currency as the order and must be less than the current total and greater than zero.  This call will change the order total.  It returns true if the desired total is achieved.  If the goal seeking algorithm falls short (usually by pennies), this method returns back false.  View the merchant notes for the order for further details. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class AdjustOrderTotal {
   /**
    * OrderApi.adjustOrderTotal() takes a desired order total and performs goal-seeking to adjust all items and taxes
    * appropriately.  This method was created for merchants dealing with Medicare and Medicaid.  When selling their
    * medical devices, they would often run into limits approved by Medicare.  As such, they needed to adjust the
    * order total to match the approved amount.  This is a convenience method to adjust individual items and their
    * taxes to match the desired total.
    */
   public static void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(Constants.API_KEY);

       String orderId = "DEMO-0009104390";
       String desiredTotal = "21.99";
       BaseResponse apiResponse = orderApi.adjustOrderTotal(orderId, desiredTotal);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.out.println("Order could not be adjusted. See error log.");
           return;
       }

       if (apiResponse.getSuccess()) {
           System.out.println("Order was adjusted successfully. Use getOrder() to retrieve the order if needed.");
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to cancel. | |
| **desiredTotal** | **String**| The desired total with no formatting. example 123.45 | |

### Return type

[**BaseResponse**](BaseResponse.md)

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

<a name="cancelOrder"></a>
# **cancelOrder**
> BaseResponse cancelOrder(orderId, lockSelfShipOrders, skipRefundAndHold)

Cancel an order

Cancel an order on the UltraCart account.  If the success flag is false, then consult the error message for why it failed. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class CancelOrder {
   /**
    * OrderApi.cancelOrder() will do just that.  It will cancel an order by rejecting it.
    * However, the following restrictions apply:
    * 1) If the order is already completed, this call will fail.
    * 2) If the order has already been rejected, this call will fail.
    * 3) If the order has already been transmitted to a fulfillment center, this call will fail.
    * 4) If the order is queued for transmission to a distribution center, this call will fail.
    */
   public static void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(Constants.API_KEY);

       String orderId = "DEMO-0009104390";
       BaseResponse apiResponse = orderApi.cancelOrder(orderId, false, false);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.out.println("Order could not be canceled. See error log.");
           return;
       }

       if (apiResponse.getSuccess()) {
           System.out.println("Order was canceled successfully.");
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to cancel. | |
| **lockSelfShipOrders** | **Boolean**| Flag to prevent a order shipping during a refund process | [optional] |
| **skipRefundAndHold** | **Boolean**| Skip refund and move order to Held Orders department | [optional] |

### Return type

[**BaseResponse**](BaseResponse.md)

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

<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(orderId)

Delete an order

Delete an order on the UltraCart account. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class DeleteOrder {
   /**
    * OrderApi.deleteOrder() will do just that.  It will delete an order.
    * You might find it more useful to reject an order rather than delete it in order to leave an audit trail.
    * However, deleting test orders will be useful to keep your order history tidy.  Still, any order
    * may be deleted.
    */
   public static void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(Constants.API_KEY);

       String orderId = "DEMO-0008104390";
       orderApi.deleteOrder(orderId);
       System.out.println("Order was deleted successfully.");
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to delete. | |

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
| **204** | No Content |  -  |
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="duplicateOrder"></a>
# **duplicateOrder**
> OrderResponse duplicateOrder(orderId, expand)

Duplicate an order

Perform a duplicate of the specified order_id and return a new order located in Accounts Receivable. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;
import common.JSON;

import java.math.BigDecimal;
import java.util.ArrayList;

public class DuplicateOrder{

  public static void execute() throws Exception {

    // These are the steps for cloning an existing order and charging the customer for it.
    // 1. duplicateOrder
    // 2. updateOrder (if you wish to change any part of it)
    // 3. processPayment to charge the customer.
    //
    // As a reminder, if you wish to create a new order from scratch, use the CheckoutApi.
    // The OrderApi is for managing existing orders.

    OrderApi orderApi = new OrderApi(Constants.API_KEY, Constants.VERIFY_SSL_FLAG, Constants.DEBUG_MODE);

    String expansion = "items";
    // for this example, we're going to change the items after we duplicate the order, so
    // the only expansion properties we need are the items.
    // See: https://www.ultracart.com/api/  for a list of all expansions.

    // Step 1. Duplicate the order
    String orderIdToDuplicate = "DEMO-0009104436";
    OrderResponse apiResponse = orderApi.duplicateOrder(orderIdToDuplicate, expansion);
    Order newOrder = apiResponse.getOrder();

    // Step 2. Update the items.  I will create a new items array and assign it to the order to remove the old ones completely.
    ArrayList<OrderItem> orderItems = new ArrayList<>();
    
    OrderItem item = new OrderItem();
    
    item.setMerchantItemId("simple_teapot");
    item.setQuantity(BigDecimal.ONE);
    item.setDescription("A lovely teapot");
    item.setDistributionCenterCode("DFLT"); // where is this item shipping out of?

    Currency cost = new Currency();
    cost.setCurrencyCode("USD");
    cost.setValue(BigDecimal.valueOf(9.99));
    item.setCost(cost);

    Weight weight = new Weight();
    weight.setUom(Weight.UomEnum.OZ);
    weight.setValue(BigDecimal.valueOf(6));
    item.setWeight(weight);

    newOrder.setItems(orderItems);
    OrderResponse updateResponse = orderApi.updateOrder(newOrder.getOrderId(), newOrder, expansion);

    Order updatedOrder = updateResponse.getOrder();

    // Step 3. process the payment.
    // the request object below takes two optional arguments.
    // The first is an amount if you wish to bill for an amount different from the order.  We do not.
    // The second is card_verification_number_token, which is a token you can create by using our hosted fields to
    // upload a CVV value.  This will create a token you may use here.  However, most merchants using the duplicate
    // order method will be setting up an auto order for a customer.  Those will not make use of the CVV, so we're
    // not including it here.  That is why the request object below is does not have any values set.
    // For more info on hosted fields, see: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377775/UltraCart+Hosted+Credit+Card+Fields
    OrderProcessPaymentRequest request = new OrderProcessPaymentRequest();
    OrderProcessPaymentResponse paymentResponse = orderApi.processPayment(newOrder.getOrderId(), request);
    OrderPaymentTransaction transactionDetails = paymentResponse.getPaymentTransaction();
    
    System.out.println(JSON.toJSON(updatedOrder));
    System.out.println(JSON.toJSON(transactionDetails));

  }

}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to duplicate. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

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

<a name="format"></a>
# **format**
> OrderFormatResponse format(orderId, formatOptions)

Format order

Format the order for display at text or html 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class Format {
   public static void execute() throws ApiException {
       /*
        * format() returns back a text-formatted or html block for displaying an order. It is similar to what you would
        * see on a receipt page.
        */

       OrderApi orderApi = new OrderApi(Constants.API_KEY);

       OrderFormat formatOptions = new OrderFormat();
       formatOptions.setContext("receipt"); // unknown,receipt,shipment,refund,quote-request,quote
       formatOptions.setFormat(OrderFormat.FormatEnum.TABLE); // text,div,table,email
       formatOptions.setShowContactInfo(false);
       formatOptions.setShowPaymentInfo(false); // might not want to show this to just anyone.
       formatOptions.setShowMerchantNotes(false); // be careful showing these
       formatOptions.setEmailAsLink(true); // makes the email addresses web links
       // if you only wish to show the items for a particular distribution center,
       // this might be useful if you have Context='shipment' and you're displaying this order to a fulfillment center, etc
       // formatOptions.setFilterDistributionCenterOid(1234321);
       formatOptions.setLinkFileAttachments(true);
       formatOptions.setShowInternalInformation(true); // consider this carefully.
       formatOptions.setShowNonSensitivePaymentInfo(true); // what the customer usually sees
       formatOptions.setShowInMerchantCurrency(true);
       formatOptions.setHideBillToAddress(false);
       // formatOptions.setFilterToItemsInContainerOid(123454321); // you probably won't need this.
       // when an order displays on the secure.ultracart.com site, we link the email to our order search so you can quickly
       // search for all orders for that email. I doubt you would have use for that. But maybe.
       formatOptions.setDontLinkEmailToSearch(true);
       formatOptions.setTranslate(false); // if true, shows in customer's native language

       String orderId = "DEMO-0009104390";

       OrderFormatResponse apiResponse = orderApi.format(orderId, formatOptions);
       
       String formattedResult = apiResponse.getFormattedResult();
       System.out.println("<html lang=\"en\">");
       System.out.println("<head>");
       // you won't have css links for format=table
       for (String link : apiResponse.getCssLinks()) {
           System.out.println("<style type=\"text/css\">" + link + "</style>");
       }
       System.out.println("</head><body>");
       System.out.println(formattedResult);
       System.out.println("</body></html>");
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to format | |
| **formatOptions** | [**OrderFormat**](OrderFormat.md)| Format options | |

### Return type

[**OrderFormatResponse**](OrderFormatResponse.md)

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

<a name="generateInvoice"></a>
# **generateInvoice**
> OrderInvoiceResponse generateInvoice(orderId)

Generate an invoice for this order.

The invoice PDF that is returned is base 64 encoded 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.OrderInvoiceResponse;
import com.ultracart.admin.v2.util.ApiException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class GenerateInvoice {
   public void execute() throws IOException, ApiException {
       /*
           generateInvoice returns back a base64 encoded byte array of the given order's Invoice in PDF format.
       */

       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       String orderId = "DEMO-0009104976";
       OrderInvoiceResponse apiResponse = orderApi.generateInvoice(orderId);

       // the invoice will return as a base64 encoded
       // unpack, save off, email, whatever.
       String base64Pdf = apiResponse.getPdfBase64();

       byte[] decodedPdf = Base64.getDecoder().decode(base64Pdf);
       try (FileOutputStream fos = new FileOutputStream("invoice.pdf")) {
           fos.write(decodedPdf);
       }

       // If this is running as a web application, you could return the PDF to the browser
       // using something like this (this is Java Servlet-specific code):
       /*
       response.setContentType("application/pdf");
       response.setHeader("Content-Disposition", "inline; filename=\"invoice.pdf\"");
       response.setHeader("Cache-Control", "public, must-revalidate, max-age=0");
       response.setHeader("Pragma", "public");
       response.setHeader("Content-Length", String.valueOf(decodedPdf.length));
       response.getOutputStream().write(decodedPdf);
       response.getOutputStream().flush();
       */

       System.out.println("Invoice PDF saved to invoice.pdf");
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Order ID | |

### Return type

[**OrderInvoiceResponse**](OrderInvoiceResponse.md)

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

<a name="generateOrderToken"></a>
# **generateOrderToken**
> OrderTokenResponse generateOrderToken(orderId)

Generate an order token for a given order id

Retrieves a single order token for a given order id.  The token can be used with the getOrderByToken API. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

public class GenerateOrderToken {
   public void execute() throws ApiException {
       /*
        * This method generates a unique encrypted key for an Order.  This is useful if you wish to provide links for
        * customer orders without allowing someone to easily cycle through orders.  By requiring order tokens, you
        * control which orders are viewable with a public hyperlink.
        *
        * This method works in tandem with OrderApi.getOrderByToken()
        */

       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       String orderId = "DEMO-0009104436";
       OrderTokenResponse orderTokenResponse = orderApi.generateOrderToken(orderId);
       String orderToken = orderTokenResponse.getOrderToken();

       System.out.println("Order Token is: " + orderToken);

       /*
        * The token format will look something like this:
        * DEMO:UJZOGiIRLqgE3a10yp5wmEozLPNsGrDHNPiHfxsi0iAEcxgo9H74J/l6SR3X8g==
        */
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to generate a token for. | |

### Return type

[**OrderTokenResponse**](OrderTokenResponse.md)

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

<a name="generatePackingSlipAllDC"></a>
# **generatePackingSlipAllDC**
> OrderPackingSlipResponse generatePackingSlipAllDC(orderId)

Generate a packing slip for this order across all distribution centers.

The packing slip PDF that is returned is base 64 encoded 

### Example

```java
package order;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

public class GeneratePackingSlipAllDC {
   public void execute() throws IOException, ApiException {
       /*
        * OrderApi.generatePackingSlipAllDC() is a method that might be used by a fulfillment center or distribution
        * center to generate a packing slip to include with a shipment.  This method will return a packing slip for
        * an order for all distribution centers involved.
        *
        */

       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       String orderId = "DEMO-0009104390";

       OrderPackingSlipResponse apiResponse = orderApi.generatePackingSlipAllDC(orderId);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.exit(1);
       }

       // the packing slip will return as a base64 encoded
       // unpack, save off, email, whatever.
       String base64PackingSlip = apiResponse.getPdfBase64();

       System.out.println(base64PackingSlip);

       // Decode Base64 string into a byte array
       byte[] pdfBytes = Base64.getDecoder().decode(base64PackingSlip);

       // Save the byte array to a PDF file
       try (FileOutputStream fos = new FileOutputStream("packing_slip.pdf")) {
           fos.write(pdfBytes);
       }

       System.out.println("PDF file saved successfully as 'packing_slip.pdf'");
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
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

<a name="generatePackingSlipSpecificDC"></a>
# **generatePackingSlipSpecificDC**
> OrderPackingSlipResponse generatePackingSlipSpecificDC(distributionCenterCode, orderId)

Generate a packing slip for this order for the given distribution center.

The packing slip PDF that is returned is base 64 encoded 

### Example

```java
package order;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

public class GeneratePackingSlipSpecificDC {
   public void execute() throws IOException, ApiException {
       /*
        * OrderApi.generatePackingSlipSpecificDC() is a method that might be used by a fulfillment center or distribution
        * center to generate a packing slip to include with a shipment.  As such, this method allows for a packing slip
        * for a specific distribution center (DC) in the case that an order has multiple shipments from multiple DC.
        *
        * You must know the DC, which should not be a problem for any custom shipping application.
        * See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377114/Distribution+Center
        */

       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       String orderId = "DEMO-0009104390";
       String dc = "DFLT";

       OrderPackingSlipResponse apiResponse = orderApi.generatePackingSlipSpecificDC(dc, orderId);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.exit(1);
       }

       // the packing slip will return as a base64 encoded
       // unpack, save off, email, whatever.
       String base64PackingSlip = apiResponse.getPdfBase64();

       System.out.println(base64PackingSlip);

       // Decode Base64 string into a byte array
       byte[] pdfBytes = Base64.getDecoder().decode(base64PackingSlip);

       // Save the byte array to a PDF file
       try (FileOutputStream fos = new FileOutputStream("packing_slip.pdf")) {
           fos.write(pdfBytes);
       }

       System.out.println("PDF file saved successfully as 'packing_slip.pdf'");
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

<a name="getAccountsReceivableRetryConfig"></a>
# **getAccountsReceivableRetryConfig**
> AccountsReceivableRetryConfigResponse getAccountsReceivableRetryConfig()

Retrieve A/R Retry Configuration

Retrieve A/R Retry Configuration. This is primarily an internal API call.  It is doubtful you would ever need to use it. 

### Example

```java
// This is primarily an internal API call.  It is doubtful you would ever need to use it.
// We do not provide an example for this call.
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**AccountsReceivableRetryConfigResponse**](AccountsReceivableRetryConfigResponse.md)

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

<a name="getAccountsReceivableRetryStats"></a>
# **getAccountsReceivableRetryStats**
> AccountsReceivableRetryStatsResponse getAccountsReceivableRetryStats(from, to)

Retrieve A/R Retry Statistics

Retrieve A/R Retry Statistics. This is primarily an internal API call.  It is doubtful you would ever need to use it. 

### Example

```java
// This is primarily an internal API call.  It is doubtful you would ever need to use it.
// We do not provide an example for this call.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **from** | **String**|  | [optional] |
| **to** | **String**|  | [optional] |

### Return type

[**AccountsReceivableRetryStatsResponse**](AccountsReceivableRetryStatsResponse.md)

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

<a name="getOrder"></a>
# **getOrder**
> OrderResponse getOrder(orderId, expand)

Retrieve an order

Retrieves a single order using the specified order id. 

### Example

```java
package order;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

public class GetOrder {
   /*
    * OrderApi.getOrder() retrieves a single order for a given order_id.
    */
   public void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

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
       String expansion = "item,summary,billing,shipping,shipping.tracking_number_details";

       String orderId = "DEMO-0009104390";
       OrderResponse apiResponse = orderApi.getOrder(orderId, expansion);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.exit(1);
       }

       Order order = apiResponse.getOrder();
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
       System.out.println(gson.toJson(order));
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

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

<a name="getOrderByToken"></a>
# **getOrderByToken**
> OrderResponse getOrderByToken(orderByTokenQuery, expand)

Retrieve an order using a token

Retrieves a single order using the specified order token. 

### Example

```java
package order;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

public class GetOrderByToken {
   /*
    * OrderApi.getOrderByToken() was created for use within a custom thank-you page.  The built-in StoreFront
    * thank you page displays the customer receipt and allows for unlimited customization.  However, many
    * merchants wish to process the receipt page on their own servers to do custom processing.
    *
    * See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377199/Custom+Thank+You+Page+URL
    *
    * When setting up a custom thank-you url in the StoreFronts, you will provide a query parameter that will hold
    * this order token.  You many extract that from the Request.QueryString object, then turn around and call getOrderByToken
    * to get the order object.
    */
   public void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

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

       String expansion = "billing,checkout,coupon,customer_profile,item,payment,shipping,summary,taxes";

       // the token will be in a Request.QueryString parameter defined by you within your storefront.
       // StoreFront -> Privacy and Tracking -> Advanced -> CustomThankYouUrl
       // Example would be: www.mysite.com/receipt.jsp?OrderToken=[OrderToken]

       // Assuming this is a Java Servlet application and we're using request.getParameter
       // String orderToken = request.getParameter("OrderToken");
       String orderToken = "DEMO:UZBOGywSKKwD2a5wx5JwmkwyIPNsGrDHNPiHfxsi0iAEcxgo9H74J/l6SR3X8g=="; // this won't work for you...
       // to generate an order token manually for testing, set generateOrderToken.java
       // TODO (for you, the merchant): handle missing order token (perhaps this page somehow called by a search engine, etc).

       OrderByTokenQuery orderTokenQuery = new OrderByTokenQuery();
       orderTokenQuery.setOrderToken(orderToken);
       OrderResponse apiResponse = orderApi.getOrderByToken(orderTokenQuery, expansion);
       Order order = apiResponse.getOrder();

       Gson gson = new GsonBuilder().setPrettyPrinting().create();
       System.out.println(gson.toJson(order));
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderByTokenQuery** | [**OrderByTokenQuery**](OrderByTokenQuery.md)| Order by token query | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**OrderResponse**](OrderResponse.md)

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

<a name="getOrderEdiDocuments"></a>
# **getOrderEdiDocuments**
> OrderEdiDocumentsResponse getOrderEdiDocuments(orderId)

Retrieve EDI documents associated with this order.

Retrieve EDI documents associated with this order. 

### Example

```java
package order;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import java.util.List;

public class GetOrderEdiDocuments {
   /*
       getOrderEdiDocuments returns back all EDI documents associated with an order.

       Possible Errors:
       Order.channelPartnerOid is null -> "Order is not associated with an EDI channel partner."
    */
   public void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       String orderId = "DEMO-0009104976";
       OrderEdiDocumentsResponse response = orderApi.getOrderEdiDocuments(orderId);
       List<OrderEdiDocument> documents = response.getEdiDocuments();

       Gson gson = new GsonBuilder().setPrettyPrinting().create();
       for (OrderEdiDocument doc : documents) {
           System.out.println(gson.toJson(doc));
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to retrieve EDI documents for. | |

### Return type

[**OrderEdiDocumentsResponse**](OrderEdiDocumentsResponse.md)

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

<a name="getOrders"></a>
# **getOrders**
> OrdersResponse getOrders(orderId, paymentMethod, company, firstName, lastName, city, stateRegion, postalCode, countryCode, phone, email, ccEmail, total, screenBrandingThemeCode, storefrontHostName, creationDateBegin, creationDateEnd, paymentDateBegin, paymentDateEnd, shipmentDateBegin, shipmentDateEnd, rma, purchaseOrderNumber, itemId, currentStage, channelPartnerCode, channelPartnerOrderId, limit, offset, sort, expand)

Retrieve orders

Retrieves a group of orders from the account.  If no parameters are specified, the API call will fail with a bad request error.  Always specify some parameters to limit the scope of the orders returned to ones you are truly interested in.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package order;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GetOrders {
   /*
    * getOrders was the first order query provided by UltraCart. It still functions well, but it is extremely verbose
    * because the query call takes a variable for every possible filter. You are advised to get getOrdersByQuery().
    * It is easier to use and will result in less code. Still, we provide an example here to be thorough.
    *
    * For this email, we will query all orders for a particular email address. The getOrdersByQuery() example
    * illustrates using a date range to filter and select orders.
    */
   public void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       List<Order> orders = new ArrayList<>();

       int iteration = 1;
       int offset = 0;
       int limit = 200;
       boolean moreRecordsToFetch = true;

       while (moreRecordsToFetch) {
           System.out.println("executing iteration " + iteration + "<br>");
           List<Order> chunkOfOrders = getOrderChunk(orderApi, offset, limit);
           orders.addAll(chunkOfOrders);
           offset = offset + limit;
           moreRecordsToFetch = chunkOfOrders.size() == limit;
           iteration++;
       }

       // this could get verbose...
       Gson gson = new GsonBuilder().setPrettyPrinting().create();
       for (Order order : orders) {
           System.out.println(gson.toJson(order));
       }
       
       System.out.println("<html lang=\"en\"><body><pre>");
       System.out.println(orders);
       System.out.println("</pre></body></html>");
   }

   private List<Order> getOrderChunk(OrderApi orderApi, int offset, int limit) throws ApiException {
       String expansion = "item,summary,billing,shipping,shipping.tracking_number_details";
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

       String orderId = null;
       String paymentMethod = null;
       String company = null;
       String firstName = null;
       String lastName = null;
       String city = null;
       String stateRegion = null;
       String postalCode = null;
       String countryCode = null;
       String phone = null;
       String email = "support@ultracart.com"; // <-- this is the only filter we're using.
       String ccEmail = null;
       BigDecimal total = null;
       String screenBrandingThemeCode = null;
       String storefrontHostName = null;
       String creationDateBegin = null;
       String creationDateEnd = null;
       String paymentDateBegin = null;
       String paymentDateEnd = null;
       String shipmentDateBegin = null;
       String shipmentDateEnd = null;
       String rma = null;
       String purchaseOrderNumber = null;
       String itemId = null;
       String currentStage = null;
       String channelPartnerCode = null;
       String channelPartnerOrderId = null;
       String sort = null;

       // see all these parameters? that is why you should use getOrdersByQuery() instead of getOrders()
       OrdersResponse apiResponse = orderApi.getOrders(orderId, paymentMethod, company, firstName, lastName, city,
           stateRegion, postalCode, countryCode, phone, email, ccEmail, total, screenBrandingThemeCode,
           storefrontHostName, creationDateBegin, creationDateEnd, paymentDateBegin, paymentDateEnd,
           shipmentDateBegin, shipmentDateEnd, rma, purchaseOrderNumber, itemId, currentStage,
           channelPartnerCode, channelPartnerOrderId, limit, offset, sort, expansion);

       if (apiResponse.getOrders() != null) {
           return apiResponse.getOrders();
       }
       return new ArrayList<>();
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| Order Id | [optional] |
| **paymentMethod** | **String**| Payment Method | [optional] |
| **company** | **String**| Company | [optional] |
| **firstName** | **String**| First Name | [optional] |
| **lastName** | **String**| Last Name | [optional] |
| **city** | **String**| City | [optional] |
| **stateRegion** | **String**| State/Region | [optional] |
| **postalCode** | **String**| Postal Code | [optional] |
| **countryCode** | **String**| Country Code (ISO-3166 two letter) | [optional] |
| **phone** | **String**| Phone | [optional] |
| **email** | **String**| Email | [optional] |
| **ccEmail** | **String**| CC Email | [optional] |
| **total** | **BigDecimal**| Total | [optional] |
| **screenBrandingThemeCode** | **String**| Screen Branding Theme Code | [optional] |
| **storefrontHostName** | **String**| StoreFront Host Name | [optional] |
| **creationDateBegin** | **String**| Creation Date Begin | [optional] |
| **creationDateEnd** | **String**| Creation Date End | [optional] |
| **paymentDateBegin** | **String**| Payment Date Begin | [optional] |
| **paymentDateEnd** | **String**| Payment Date End | [optional] |
| **shipmentDateBegin** | **String**| Shipment Date Begin | [optional] |
| **shipmentDateEnd** | **String**| Shipment Date End | [optional] |
| **rma** | **String**| RMA | [optional] |
| **purchaseOrderNumber** | **String**| Purchase Order Number | [optional] |
| **itemId** | **String**| Item Id | [optional] |
| **currentStage** | **String**| Current Stage | [optional] |
| **channelPartnerCode** | **String**| Channel Partner Code | [optional] |
| **channelPartnerOrderId** | **String**| Channel Partner Order ID | [optional] |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result. | [optional] |

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

<a name="getOrdersBatch"></a>
# **getOrdersBatch**
> OrdersResponse getOrdersBatch(orderBatch, expand)

Retrieve order batch

Retrieves a group of orders from the account based on an array of order ids.  If more than 500 order ids are specified, the API call will fail with a bad request error. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class GetOrdersBatch {
    /*
     * This method is useful when you need to query a defined set of orders and would like to avoid querying them
     * one at a time.
     */
    public static void execute() throws ApiException {
        OrderApi orderApi = new OrderApi(Constants.API_KEY);

        String expansion = "item,summary,billing,shipping,shipping.tracking_number_details";
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

        OrderQueryBatch orderBatch = new OrderQueryBatch();
        List<String> orderIds = Arrays.asList("DEMO-0009104390", "DEMO-0009104391", "DEMO-0009104392");
        orderBatch.setOrderIds(orderIds);

        OrdersResponse apiResponse = orderApi.getOrdersBatch(orderBatch, expansion);

        if (apiResponse.getError() != null) {
            System.err.println(apiResponse.getError().getDeveloperMessage());
            System.err.println(apiResponse.getError().getUserMessage());
            System.exit(1);
        }

        List<Order> orders = apiResponse.getOrders();
        if (orders.isEmpty()) {
            System.err.println("There were no orders returned by this query.");
        }

        // do something with the orders. for this example, we're just accessing many properties as illustration.
        for (Order order : orders) {
            OrderSummary summary = order.getSummary();
            BigDecimal actualShippingCost = summary.getActualShipping() != null ? summary.getActualShipping().getLocalized() : BigDecimal.ZERO;

            Order.CurrentStageEnum currentStage = order.getCurrentStage();
            OrderShipping sAddr = order.getShipping();
            List<String> trackingNumbers = sAddr.getTrackingNumbers();
            for (String trackingNumber : trackingNumbers) {
                // do something with tracking number here.
            }

            // Here's how to access the shipping information. Do something with the variables.
            String sfname = order.getShipping().getFirstName();
            String slname = order.getShipping().getLastName();
            String saddress1 = order.getShipping().getAddress1();
            String saddress2 = order.getShipping().getAddress2();
            String scity = order.getShipping().getCity();
            String sregion = order.getShipping().getStateRegion();
            String sccode = order.getShipping().getCountryCode();
            String spcode = order.getShipping().getPostalCode();
            String sdayphone = order.getShipping().getDayPhone();
            String shippingMethod = order.getShipping().getShippingMethod();

            // Here's how to access the billing information. Do something with the variables.
            String billingAddress1 = order.getBilling().getAddress1();
            String billingAddress2 = order.getBilling().getAddress2();
            String billingCity = order.getBilling().getCity();
            String billingStateRegion = order.getBilling().getStateRegion();
            String billingCountryCode = order.getBilling().getCountryCode();
            String billingPostalCode = order.getBilling().getPostalCode();
            String email = order.getBilling().getEmail(); // email is located on the billing object.

            // here is how to access the items
            List<OrderItem> items = order.getItems();
            for (OrderItem item : items) {
                BigDecimal qty = item.getQuantity();
                String itemId = item.getMerchantItemId();
                String description = item.getDescription();
                BigDecimal cost = item.getCost().getLocalized();
                String costFormatted = item.getCost().getLocalizedFormatted(); // cost with symbols.
            }
        }

        // this could get verbose depending on the size of your batch ...
        for (Order order : orders) {
            System.out.println(order.toString());
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderBatch** | [**OrderQueryBatch**](OrderQueryBatch.md)| Order batch | |
| **expand** | **String**| The object expansion to perform on the result. | [optional] |

### Return type

[**OrdersResponse**](OrdersResponse.md)

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

<a name="getOrdersByQuery"></a>
# **getOrdersByQuery**
> OrdersResponse getOrdersByQuery(orderQuery, limit, offset, sort, expand)

Retrieve orders by query

Retrieves a group of orders from the account based on a query object.  If no parameters are specified, the API call will fail with a bad request error.  Always specify some parameters to limit the scope of the orders returned to ones you are truly interested in.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.Order;
import com.ultracart.admin.v2.models.OrderQuery;
import com.ultracart.admin.v2.models.OrdersResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class GetOrdersByQuery {
    /*
     * This example illustrates how to query the OrderQuery object to select a range of records. It uses a subroutine
     * to aggregate the records that span multiple API calls. This example illustrates a work-around to selecting
     * all rejected orders. Because the UltraCart SDK does not have a way to query orders based on whether they
     * were rejected, we can instead query based on the rejected_dts, which is null if the order is not rejected.
     * So we will simply use a large time frame to ensure we query all rejections.
     */
    public static void execute() throws ApiException {
        OrderApi orderApi = new OrderApi(Constants.API_KEY);

        List<Order> orders = new ArrayList<>();

        int iteration = 1;
        int offset = 0;
        int limit = 200;
        boolean moreRecordsToFetch = true;

        while (moreRecordsToFetch) {
            System.out.println("executing iteration " + iteration + "<br>");
            List<Order> chunkOfOrders = getOrderChunk(orderApi, offset, limit);
            orders.addAll(chunkOfOrders);
            offset = offset + limit;
            moreRecordsToFetch = chunkOfOrders.size() == limit;
            iteration++;
        }

        for (Order order : orders) {
            System.out.println(order.toString());
        }
    }

    private static List<Order> getOrderChunk(OrderApi orderApi, int offset, int limit) throws ApiException {
        String expansion = "item,summary,billing,shipping,shipping.tracking_number_details";
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

        OrderQuery query = new OrderQuery();
        // Uncomment the next two lines to retrieve a single order. But there are simpler methods to do that.
        // String orderId = "DEMO-0009104390";
        // orderQuery.setOrderId(orderId);

        String beginDts = Instant.now().toString();
        String endDts = Instant.now().minus(2000, ChronoUnit.DAYS).toString();
        System.err.println(beginDts);
        System.err.println(endDts);

        query.setRefundDateBegin(beginDts);
        query.setRefundDateEnd(endDts);

        OrdersResponse apiResponse = orderApi.getOrdersByQuery(query, limit, offset, null, expansion);
        if (apiResponse.getOrders() != null) {
            return apiResponse.getOrders();
        }
        return new ArrayList<>();
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderQuery** | [**OrderQuery**](OrderQuery.md)| Order query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the orders.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result. | [optional] |

### Return type

[**OrdersResponse**](OrdersResponse.md)

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

<a name="insertOrder"></a>
# **insertOrder**
> OrderResponse insertOrder(order, expand)

Insert an order

Inserts a new order on the UltraCart account.  This is probably NOT the method you want.  This is for channel orders.  For regular orders the customer is entering, use the CheckoutApi.  It has many, many more features, checks, and validations. 

### Example

```java
/*
 * Please do not use OrderApi.insertOrder()
 * This method was provided in the first release of our REST API.
 * It was replaced with our ChannelPartnerApi.importChannelPartnerOrder()
 *
 * Here are your options:
 * If you need to add regular orders that still require payment processing, use the CheckoutApi.
 *    The CheckoutApi has fantastic support for payment processing.
 *
 * If you need to add channel partner orders (eBay, Amazon, your call center, etc), use the ChannelPartnerApi.
 *    The ChannelPartnerApi has appropriate support for processing such orders.
 *
 * We support our entire API forever, so this method remains active.  But, we do not provide any samples for it.
 * You may use it, but we believe it will require extra time and effort and possibly much frustration.
 *
 * Reminder: The ONLY way to provide credit card numbers and cvv numbers to the UltraCart system is through
 * hosted fields.
 * See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377775/UltraCart+Hosted+Credit+Card+Fields
 * See: https://github.com/UltraCart/sdk_samples/blob/master/hosted_fields/hosted_fields.html
 */
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **order** | [**Order**](Order.md)| Order to insert | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

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

<a name="isRefundableOrder"></a>
# **isRefundableOrder**
> OrderRefundableResponse isRefundableOrder(orderId)

Determine if an order can be refunded

Determine if an order can be refunded based upon payment method and age 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class IsRefundableOrder {
    /*
        isRefundable queries the UltraCart system whether an order is refundable or not.
        In addition to a simple boolean response, UltraCart also returns back any reasons why
        an order is not refundable.
        Finally, the response also contains any refund or return reasons configured on the account in the event
        that this merchant account is configured to require a reason for a return or refund.
     */
    public static void execute() throws ApiException {
        OrderApi orderApi = new OrderApi(Constants.API_KEY);

        String orderId = "DEMO-0009104976";
        OrderRefundableResponse refundableResponse = orderApi.isRefundableOrder(orderId);
        System.out.println("Is Refundable: " + refundableResponse.getRefundable());

        // the response contains dropdown values and additional information.  It's much more than a true/false flag.
        System.out.println("API Response:");
        System.out.println(refundableResponse.toString());
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to check for refundable order. | |

### Return type

[**OrderRefundableResponse**](OrderRefundableResponse.md)

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

<a name="processPayment"></a>
# **processPayment**
> OrderProcessPaymentResponse processPayment(orderId, processPaymentRequest)

Process payment

Process payment on order 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProcessPayment {
    /*
     * OrderApi.processPayment() was designed to charge a customer for an order. It was created to work in tandem with
     * duplicateOrder(), which does not accomplish payment on its own. The use-case for this method is to
     * duplicate a customer's order and then charge them for it. duplicateOrder() does not charge the customer again,
     * which is why processPayment() exists.
     *
     * These are the steps for cloning an existing order and charging the customer for it.
     * 1. duplicateOrder
     * 2. updateOrder (if you wish to change any part of it)
     * 3. processPayment to charge the customer.
     *
     * As a reminder, if you wish to create a new order from scratch, use the CheckoutApi or ChannelPartnerApi.
     * The OrderApi is for managing existing orders.
     */
    public static void execute() throws ApiException {
        OrderApi orderApi = new OrderApi(Constants.API_KEY);

        String expansion = "items";   // for this example, we're going to change the items after we duplicate the order, so
                                     // the only expansion properties we need are the items.
                                     // See: https://www.ultracart.com/api/  for a list of all expansions.

        // Step 1. Duplicate the order
        String orderIdToDuplicate = "DEMO-0009104436";
        OrderResponse apiResponse = orderApi.duplicateOrder(orderIdToDuplicate, expansion);
        Order newOrder = apiResponse.getOrder();

        // Step 2. Update the items. I will create a new items list and assign it to the order to remove the old ones completely.
        List<OrderItem> items = new ArrayList<>();
        OrderItem item = new OrderItem();
        item.setMerchantItemId("simple_teapot");
        item.setQuantity(BigDecimal.valueOf(1.0));
        item.setDescription("A lovely teapot");
        item.setDistributionCenterCode("DFLT"); // where is this item shipping out of?

        Currency cost = new Currency();
        cost.setCurrencyCode("USD");
        cost.setValue(BigDecimal.valueOf(9.99));
        item.setCost(cost);

        Weight weight = new Weight();
        weight.setUom(Weight.UomEnum.OZ);
        weight.setValue(BigDecimal.valueOf(6.0));
        item.setWeight(weight);

        items.add(item);
        newOrder.setItems(items);
        OrderResponse updateResponse = orderApi.updateOrder(newOrder.getOrderId(), newOrder, expansion);

        Order updatedOrder = updateResponse.getOrder();

        // Step 3. process the payment.
        // the request object below takes two optional arguments.
        // The first is an amount if you wish to bill for an amount different from the order.
        // We do not bill differently in this example.
        // The second is card_verification_number_token, which is a token you can create by using our hosted fields to
        // upload a CVV value. This will create a token you may use here. However, most merchants using the duplicate
        // order method will be setting up an auto order for a customer. Those will not make use of the CVV, so we're
        // not including it here. That is why the request object below is does not have any values set.
        // For more info on hosted fields:
        // See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1377775/UltraCart+Hosted+Credit+Card+Fields
        // See: https://github.com/UltraCart/sdk_samples/blob/master/hosted_fields/hosted_fields.html

        OrderProcessPaymentRequest processPaymentRequest = new OrderProcessPaymentRequest();
        OrderProcessPaymentResponse paymentResponse = orderApi.processPayment(newOrder.getOrderId(), processPaymentRequest);
        OrderPaymentTransaction transactionDetails = paymentResponse.getPaymentTransaction(); // do whatever you wish with this.

        System.out.println("New Order (after updated items):");
        displayOrderInfo(updatedOrder);
        System.out.println("\nPayment Response:");
        displayPaymentResponse(paymentResponse);
    }

    private static void displayOrderInfo(Order order) {
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Total: " + order.getSummary().getTotal().getValue() + " " + 
                          order.getSummary().getTotal().getCurrencyCode());
        System.out.println("Items:");
        for (OrderItem item : order.getItems()) {
            System.out.println("  - " + item.getQuantity() + "x " + item.getDescription() + 
                             " (" + item.getMerchantItemId() + ")");
            System.out.println("    Cost: " + item.getCost().getValue() + " " + 
                             item.getCost().getCurrencyCode());
        }
    }

    private static void displayPaymentResponse(OrderProcessPaymentResponse response) {
        System.out.println("Successfully Processed: " + response.getSuccess());
        if (response.getPaymentTransaction() != null) {
            System.out.println("Transaction ID: " + response.getPaymentTransaction().getTransactionId());
            System.out.println("Transaction Timestamp: " + response.getPaymentTransaction().getTransactionTimestamp());
        }

        // here's the entire object:
        System.out.println(response.toString());

        if (response.getError() != null) {
            System.out.println("Error: " + response.getError().getUserMessage());
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to process payment on | |
| **processPaymentRequest** | [**OrderProcessPaymentRequest**](OrderProcessPaymentRequest.md)| Process payment parameters | |

### Return type

[**OrderProcessPaymentResponse**](OrderProcessPaymentResponse.md)

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

<a name="refundOrder"></a>
# **refundOrder**
> OrderResponse refundOrder(orderId, order, rejectAfterRefund, skipCustomerNotification, autoOrderCancel, manualRefund, reverseAffiliateTransactions, issueStoreCredit, autoOrderCancelReason, expand)

Refund an order

Perform a refund operation on an order and then update the order if successful.  All of the object properties ending in _refunded should be the TOTAL amount that should end up being refunded.  UltraCart will calculate the actual amount to refund based upon the prior refunds. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

/*
 * refundOrder() allows for both partial and complete refunds. Both are accomplished with the same steps.
 * 1) retrieve an order object using the SDK.
 * 2) input the refunded quantities for any or all items
 * 3) call refundOrder, passing in the modified object.
 * 4) To do a full refund, set all item refund quantities to their purchased quantities.
 *
 * This example will perform a full refund.
 */
public class RefundOrder {
    public static void execute() throws ApiException {
        OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

        // for the refund, I only need the items expanded to adjust their quantities.
        // See: https://www.ultracart.com/api/ for a list of all expansions.
        String expand = "items";

        // Step 1. Retrieve the order
        String orderId = "DEMO-0009104436";
        Order order = orderApi.getOrder(orderId, expand).getOrder();

        for (OrderItem item : order.getItems()) {
            item.setQuantityRefunded(item.getQuantity());
        }

        boolean rejectAfterRefund = false;
        boolean skipCustomerNotification = true;
        boolean cancelAssociatedAutoOrders = true; // does not matter for this sample. the order is not a recurring order.
        boolean considerManualRefundDoneExternally = false; // no, I want an actual refund done through my gateway
        boolean reverseAffiliateTransactions = true; // can't let my affiliates get money on a refunded order. bad business.
        boolean issueStoreCredit = false;
        String autoCancelReason = null;

        OrderResponse apiResponse = orderApi.refundOrder(
            orderId,
            order,
            rejectAfterRefund,
            skipCustomerNotification,
            cancelAssociatedAutoOrders,
            considerManualRefundDoneExternally,
            reverseAffiliateTransactions,
            issueStoreCredit,
            autoCancelReason,
            expand
        );

        Order refundedOrder = apiResponse.getOrder();

        // examine the subtotals and ensure everything was refunded correctly.
        System.out.println(refundedOrder.toString());
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
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

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

<a name="refundOrderCompletely"></a>
# **refundOrderCompletely**
> OrderResponse refundOrderCompletely(orderId, rejectAfterRefund, skipCustomerNotification, autoOrderCancel, manualRefund, reverseAffiliateTransactions, issueStoreCredit, autoOrderCancelReason, refundReason, rejectReason)

Refund an order completely

Perform a refund operation on an order and then update the order if successful. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to refund. | |
| **rejectAfterRefund** | **Boolean**| Reject order after refund | [optional] [default to false] |
| **skipCustomerNotification** | **Boolean**| Skip customer email notification | [optional] [default to false] |
| **autoOrderCancel** | **Boolean**| Cancel associated auto orders | [optional] [default to false] |
| **manualRefund** | **Boolean**| Consider a manual refund done externally | [optional] [default to false] |
| **reverseAffiliateTransactions** | **Boolean**| Reverse affiliate transactions | [optional] [default to true] |
| **issueStoreCredit** | **Boolean**| Issue a store credit instead of refunding the original payment method, loyalty must be configured on merchant account | [optional] [default to false] |
| **autoOrderCancelReason** | **String**| Reason for auto orders cancellation | [optional] |
| **refundReason** | **String**| Reason for refund | [optional] |
| **rejectReason** | **String**| Reason for reject | [optional] |

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

<a name="replacement"></a>
# **replacement**
> OrderReplacementResponse replacement(orderId, replacement)

Replacement order

Create a replacement order based upon a previous order 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.OrderReplacement;
import com.ultracart.admin.v2.models.OrderReplacementItem;
import com.ultracart.admin.v2.models.OrderReplacementResponse;
import com.ultracart.admin.v2.util.ApiException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
* The use-case for replacement() is to create another order for a customer to replace the items of the existing
* order. For example, a merchant is selling perishable goods and the goods arrive late, spoiled. replacement()
* helps to create another order to send more goods to the customer.
*
* You MUST supply the items you desire in the replacement order. This is done with the OrderReplacement.items field.
* All options are displayed below including whether to charge the customer for this replacement order or not.
*/
public class Replacement {
   public static void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       // Step 1. Replace the order
       String orderIdToReplace = "DEMO-0009104436";
       OrderReplacement replacementOptions = new OrderReplacement();
       replacementOptions.setOriginalOrderId(orderIdToReplace);

       List<OrderReplacementItem> items = new ArrayList<>();

       OrderReplacementItem item1 = new OrderReplacementItem();
       item1.setMerchantItemId("TSHIRT");
       item1.setQuantity(BigDecimal.valueOf(1));
       // item1.setArbitraryUnitCost(9.99);
       items.add(item1);

       OrderReplacementItem item2 = new OrderReplacementItem();
       item2.setMerchantItemId("BONE");
       item2.setQuantity(BigDecimal.valueOf(2));
       items.add(item2);

       replacementOptions.setItems(items);

       // replacementOptions.setShippingMethod("FedEx: Ground");
       replacementOptions.setImmediateCharge(true);
       replacementOptions.setSkipPayment(true);
       replacementOptions.setFree(true);
       replacementOptions.setCustomField1("Whatever");
       replacementOptions.setCustomField4("More Whatever");
       replacementOptions.setAdditionalMerchantNotesNewOrder("Replacement order for spoiled ice cream");
       replacementOptions.setAdditionalMerchantNotesOriginalOrder("This order was replaced.");

       OrderReplacementResponse apiResponse = orderApi.replacement(orderIdToReplace, replacementOptions);

       System.out.println("Replacement Order: " + apiResponse.getOrderId());
       System.out.println("Success flag: " + apiResponse.getSuccessful());
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to generate a replacement for. | |
| **replacement** | [**OrderReplacement**](OrderReplacement.md)| Replacement order details | |

### Return type

[**OrderReplacementResponse**](OrderReplacementResponse.md)

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

<a name="resendReceipt"></a>
# **resendReceipt**
> BaseResponse resendReceipt(orderId)

Resend receipt

Resend the receipt for an order on the UltraCart account. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

/*
* OrderApi.resendReceipt() will resend (email) a receipt to a customer.
*/
public class ResendReceipt {
   public static void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       String orderId = "DEMO-0009104436";

       BaseResponse apiResponse = orderApi.resendReceipt(orderId);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.out.println("Order receipt could not be resent. See error log.");
           return;
       }

       if (apiResponse.getSuccess()) {
           System.out.println("Receipt was resent.");
       } else {
           System.out.println("Failed to resend receipt.");
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to resend the receipt for. | |

### Return type

[**BaseResponse**](BaseResponse.md)

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

<a name="resendShipmentConfirmation"></a>
# **resendShipmentConfirmation**
> BaseResponse resendShipmentConfirmation(orderId)

Resend shipment confirmation

Resend shipment confirmation for an order on the UltraCart account. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

/*
* OrderApi.resendShipmentConfirmation() will resend (email) a shipment confirmation to a customer.
*/
public class ResendShipmentConfirmation {
   public static void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       String orderId = "DEMO-0009104436";

       BaseResponse apiResponse = orderApi.resendShipmentConfirmation(orderId);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.out.println("Order could not be adjusted. See error log.");
           return;
       }

       if (apiResponse.getSuccess()) {
           System.out.println("Shipment confirmation was resent.");
       } else {
           System.out.println("Failed to resend shipment confirmation.");
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to resend the shipment notification for. | |

### Return type

[**BaseResponse**](BaseResponse.md)

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

<a name="updateAccountsReceivableRetryConfig"></a>
# **updateAccountsReceivableRetryConfig**
> BaseResponse updateAccountsReceivableRetryConfig(retryConfig)

Update A/R Retry Configuration

Update A/R Retry Configuration.  This is primarily an internal API call.  It is doubtful you would ever need to use it. 

### Example

```java
// This is primarily an internal API call.  It is doubtful you would ever need to use it.
// We do not provide an example for this call.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **retryConfig** | [**AccountsReceivableRetryConfig**](AccountsReceivableRetryConfig.md)| AccountsReceivableRetryConfig object | |

### Return type

[**BaseResponse**](BaseResponse.md)

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

<a name="updateOrder"></a>
# **updateOrder**
> OrderResponse updateOrder(orderId, order, expand)

Update an order

Update a new order on the UltraCart account.  This is probably NOT the method you want.  It is rare to update a completed order.  This will not trigger charges, emails, or any other automation. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;

public class UpdateOrder {
   public static void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       String expansion = "checkout"; // see the getOrder sample for expansion discussion

       String orderId = "DEMO-0009104976";
       Order order = orderApi.getOrder(orderId, expansion).getOrder();

       System.out.println("Original Order follows:");
       System.out.println(order.toString());

       // TODO: do some updates to the order.
       // For example:
       // order.getBillingAddress().setFirstName("John");
       // order.getBillingAddress().setLastName("Smith");

       OrderResponse apiResponse = orderApi.updateOrder(orderId, order, expansion);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           return;
       }

       Order updatedOrder = apiResponse.getOrder();

       System.out.println("Updated Order follows:");
       System.out.println(updatedOrder.toString());
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **orderId** | **String**| The order id to update. | |
| **order** | [**Order**](Order.md)| Order to update | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

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

<a name="validateOrder"></a>
# **validateOrder**
> OrderValidationResponse validateOrder(validationRequest)

Validate

Validate the order for errors.  Specific checks can be passed to fine tune what is validated. Read and write permissions are required because the validate method may fix obvious address issues automatically which require update permission.This rest call makes use of the built-in translation of rest objects to UltraCart internal objects which also contains a multitude of validation checks that cannot be trapped.  Therefore any time this call is made, you should also trap api exceptions and examine their content because it may contain validation issues.  So check the response object and trap any exceptions. 

### Example

```java
package order;

import com.ultracart.admin.v2.OrderApi;
import com.ultracart.admin.v2.models.Order;
import com.ultracart.admin.v2.models.OrderValidationRequest;
import com.ultracart.admin.v2.models.OrderValidationResponse;
import com.ultracart.admin.v2.util.ApiException;

/*
   validateOrder may be used to check for any and all validation errors that may result from an insertOrder
   or updateOrder call. Because those method are built on our existing infrastructure, some validation
   errors may not bubble up to the rest api call and instead be returned as generic "something went wrong" errors.
   This call will return detail validation issues needing correction.

   Within the ValidationRequest, you may leave the 'checks' array null to check for everything, or pass
   an array of the specific checks you desire. Here is a list of the checks:

   "Billing Address Provided"
   "Billing Destination Restriction"
   "Billing Phone Numbers Provided"
   "Billing State Abbreviation Valid"
   "Billing Validate City State Zip"
   "Email provided if required"
   "Gift Message Length"
   "Item Quantity Valid"
   "Items Present"
   "Merchant Specific Item Relationships"
   "One per customer violations"
   "Referral Code Provided"
   "Shipping Address Provided"
   "Shipping Destination Restriction"
   "Shipping Method Ignore Invalid"
   "Shipping Method Provided"
   "Shipping State Abbreviation Valid"
   "Shipping Validate City State Zip"
   "Special Instructions Length"
*/
public class ValidateOrder {
   public static void execute() throws ApiException {
       OrderApi orderApi = new OrderApi(common.Constants.API_KEY);

       String expansion = "checkout"; // see the getOrder sample for expansion discussion

       String orderId = "DEMO-0009104976";
       Order order = orderApi.getOrder(orderId, expansion).getOrder();

       System.out.println(order.toString());

       // TODO: do some updates to the order.
       OrderValidationRequest validationRequest = new OrderValidationRequest();
       validationRequest.setOrder(order);
       validationRequest.setChecks(null); // leaving this null to perform all validations.

       OrderValidationResponse apiResponse = orderApi.validateOrder(validationRequest);

       System.out.println("Validation errors:");
       if (apiResponse.getErrors() != null) {
           for (String error : apiResponse.getErrors()) {
               System.out.println("- " + error);
           }
       } else {
           System.out.println("No validation errors found.");
       }

       System.out.println("\nValidation messages:");
       if (apiResponse.getMessages() != null) {
           for (String message : apiResponse.getMessages()) {
               System.out.println("- " + message);
           }
       } else {
           System.out.println("No validation messages found.");
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **validationRequest** | [**OrderValidationRequest**](OrderValidationRequest.md)| Validation request | |

### Return type

[**OrderValidationResponse**](OrderValidationResponse.md)

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

