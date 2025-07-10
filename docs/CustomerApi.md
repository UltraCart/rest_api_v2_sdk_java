# CustomerApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomerStoreCredit**](CustomerApi.md#addCustomerStoreCredit) | **POST** /customer/customers/{customer_profile_oid}/store_credit | Adds store credit to a customer |
| [**adjustInternalCertificate**](CustomerApi.md#adjustInternalCertificate) | **POST** /customer/customers/{customer_profile_oid}/adjust_cashback_balance | Updates the cashback balance for a customer by updating the internal gift certificate used, creating the gift certificate if needed. |
| [**deleteCustomer**](CustomerApi.md#deleteCustomer) | **DELETE** /customer/customers/{customer_profile_oid} | Delete a customer |
| [**deleteWishListItem**](CustomerApi.md#deleteWishListItem) | **DELETE** /customer/customers/{customer_profile_oid}/wishlist/{customer_wishlist_item_oid} | Delete a customer wishlist item |
| [**getCustomer**](CustomerApi.md#getCustomer) | **GET** /customer/customers/{customer_profile_oid} | Retrieve a customer |
| [**getCustomerByEmail**](CustomerApi.md#getCustomerByEmail) | **GET** /customer/customers/by_email/{email} | Retrieve a customer by Email |
| [**getCustomerEditorValues**](CustomerApi.md#getCustomerEditorValues) | **GET** /customer/editor_values | Retrieve values needed for a customer profile editor |
| [**getCustomerEmailLists**](CustomerApi.md#getCustomerEmailLists) | **GET** /customer/email_lists | Retrieve all email lists across all storefronts |
| [**getCustomerStoreCredit**](CustomerApi.md#getCustomerStoreCredit) | **GET** /customer/customers/{customer_profile_oid}/store_credit | Retrieve the customer store credit accumulated through loyalty programs |
| [**getCustomerWishList**](CustomerApi.md#getCustomerWishList) | **GET** /customer/customers/{customer_profile_oid}/wishlist | Retrieve wishlist items for customer |
| [**getCustomerWishListItem**](CustomerApi.md#getCustomerWishListItem) | **GET** /customer/customers/{customer_profile_oid}/wishlist/{customer_wishlist_item_oid} | Retrieve wishlist item for customer |
| [**getCustomers**](CustomerApi.md#getCustomers) | **GET** /customer/customers | Retrieve customers |
| [**getCustomersByQuery**](CustomerApi.md#getCustomersByQuery) | **POST** /customer/customers/query | Retrieve customers by query |
| [**getCustomersForDataTables**](CustomerApi.md#getCustomersForDataTables) | **POST** /customer/customers/dataTables | Retrieve customers for DataTables plugin |
| [**getEmailVerificationToken**](CustomerApi.md#getEmailVerificationToken) | **POST** /customer/customers/email_verify/get_token | Create a token that can be used to verify a customer email address |
| [**getMagicLink**](CustomerApi.md#getMagicLink) | **PUT** /customer/customers/{customer_profile_oid}/magic_link/{storefront_host_name} | getMagicLink |
| [**insertCustomer**](CustomerApi.md#insertCustomer) | **POST** /customer/customers | Insert a customer |
| [**insertWishListItem**](CustomerApi.md#insertWishListItem) | **POST** /customer/customers/{customer_profile_oid}/wishlist | Insert a customer wishlist item |
| [**mergeCustomer**](CustomerApi.md#mergeCustomer) | **PUT** /customer/customers/{customer_profile_oid}/merge | Merge customer into this customer |
| [**searchCustomerProfileValues**](CustomerApi.md#searchCustomerProfileValues) | **POST** /customer/search | Searches for all matching values (using POST) |
| [**updateCustomer**](CustomerApi.md#updateCustomer) | **PUT** /customer/customers/{customer_profile_oid} | Update a customer |
| [**updateCustomerEmailLists**](CustomerApi.md#updateCustomerEmailLists) | **POST** /customer/customers/{customer_profile_oid}/email_lists | Update email list subscriptions for a customer |
| [**updateWishListItem**](CustomerApi.md#updateWishListItem) | **PUT** /customer/customers/{customer_profile_oid}/wishlist/{customer_wishlist_item_oid} | Update a customer wishlist item |
| [**validateEmailVerificationToken**](CustomerApi.md#validateEmailVerificationToken) | **POST** /customer/customers/email_verify/validate_token | Validate a token that can be used to verify a customer email address |


<a name="addCustomerStoreCredit"></a>
# **addCustomerStoreCredit**
> BaseResponse addCustomerStoreCredit(customerProfileOid, storeCreditRequest)

Adds store credit to a customer

Adds store credit to a customer 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.BaseResponse;
import com.ultracart.admin.v2.models.Customer;
import com.ultracart.admin.v2.models.CustomerStoreCreditAddRequest;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;

public class AddCustomerStoreCredit {
    /**
     * Adds store credit to a customer's account.
     *
     * This method requires a customer profile oid. This is a unique number used by UltraCart to identify a customer.
     * If you do not know a customer's oid, call getCustomerByEmail() to retrieve the customer and their oid.
     *
     * Possible Errors:
     * Missing store credit -> "store_credit_request.amount is missing and is required."
     * Zero or negative store credit -> "store_credit_request.amount must be a positive amount."
     */
    public static void execute() {
        CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

        try {
            String email = "test@ultracart.com";
            Customer customer = customerApi.getCustomerByEmail(email, null).getCustomer();
            int customerOid = customer.getCustomerProfileOid();

            CustomerStoreCreditAddRequest storeCreditRequest = new CustomerStoreCreditAddRequest();
            storeCreditRequest.setAmount(BigDecimal.valueOf(20.00));
            storeCreditRequest.setDescription("Customer is super cool and I wanted to give them store credit.");
            storeCreditRequest.setExpirationDays(365); // or leave null for no expiration
            storeCreditRequest.setVestingDays(45); // customer has to wait 45 days to use it.

            BaseResponse apiResponse = customerApi.addCustomerStoreCredit(customerOid, storeCreditRequest);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            System.out.println(apiResponse.getSuccess());

        } catch (ApiException e) {
            System.err.println("API Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer oid to credit. | |
| **storeCreditRequest** | [**CustomerStoreCreditAddRequest**](CustomerStoreCreditAddRequest.md)| Store credit to add | |

### Return type

[**BaseResponse**](BaseResponse.md)

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

<a name="adjustInternalCertificate"></a>
# **adjustInternalCertificate**
> AdjustInternalCertificateResponse adjustInternalCertificate(customerProfileOid, adjustInternalCertificateRequest)

Updates the cashback balance for a customer by updating the internal gift certificate used, creating the gift certificate if needed.

Updates the cashback balance for a customer by updating the internal gift certificate used, creating the gift certificate if needed. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.AdjustInternalCertificateRequest;
import com.ultracart.admin.v2.models.AdjustInternalCertificateResponse;
import com.ultracart.admin.v2.models.Customer;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;

public class AdjustInternalCertificate {
    /**
     * Adjusts the cashback balance of a customer. This method's name is adjustInternalCertificate, which
     * is a poor choice of naming, but results from an underlying implementation of using an internal gift certificate
     * to track cashback balance. Sorry for the confusion.
     *
     * This method requires a customer profile oid. This is a unique number used by UltraCart to identify a customer.
     * If you do not know a customer's oid, call getCustomerByEmail() to retrieve the customer and their oid.
     *
     * Possible Errors:
     * Missing adjustment amount -> "adjust_internal_certificate_request.adjustment_amount is required and was missing"
     */
    public static void execute() {
        CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

        try {
            String email = "test@ultracart.com";
            Customer customer = customerApi.getCustomerByEmail(email, null).getCustomer();
            int customerOid = customer.getCustomerProfileOid();

            AdjustInternalCertificateRequest adjustRequest = new AdjustInternalCertificateRequest();
            adjustRequest.setDescription("Adjusting customer cashback balance because they called and complained about product.");
            adjustRequest.setExpirationDays(365); // expires in 365 days
            adjustRequest.setVestingDays(45); // customer has to wait 45 days to use it.
            adjustRequest.setAdjustmentAmount(new BigDecimal("59")); // add 59 to their balance.
            adjustRequest.setOrderId("DEMO-12345"); // or leave null. this ties the adjustment to a particular order.
            adjustRequest.setEntryDts(null); // use current time.

            AdjustInternalCertificateResponse apiResponse = customerApi.adjustInternalCertificate(customerOid, adjustRequest);

            if (apiResponse.getError() != null) {
                System.err.println(apiResponse.getError().getDeveloperMessage());
                System.err.println(apiResponse.getError().getUserMessage());
                System.exit(1);
            }

            System.out.println("Success: " + apiResponse.getSuccess());
            System.out.println("Adjustment Amount: " + apiResponse.getAdjustmentAmount());
            System.out.println("Balance Amount: " + apiResponse.getBalanceAmount());

            System.out.println(apiResponse);

        } catch (ApiException e) {
            System.err.println("API Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer profile oid | |
| **adjustInternalCertificateRequest** | [**AdjustInternalCertificateRequest**](AdjustInternalCertificateRequest.md)| adjustInternalCertificateRequest | |

### Return type

[**AdjustInternalCertificateResponse**](AdjustInternalCertificateResponse.md)

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

<a name="deleteCustomer"></a>
# **deleteCustomer**
> deleteCustomer(customerProfileOid)

Delete a customer

Delete a customer on the UltraCart account. 

### Example

```java
package customer;

import com.ultracart.admin.v2.util.ApiException;

public class DeleteCustomer {
    public static void execute() {
        try {
            int customerOid = CustomerFunctions.insertSampleCustomer();
            CustomerFunctions.deleteSampleCustomer(customerOid);
        } catch (ApiException ex) {
            System.err.println("An Exception occurred. Please review the following error:");
            System.err.println(ex);
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer_profile_oid to delete. | |

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

<a name="deleteWishListItem"></a>
# **deleteWishListItem**
> CustomerWishListItem deleteWishListItem(customerProfileOid, customerWishlistItemOid)

Delete a customer wishlist item

Delete a customer wishlist item 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.CustomerWishListItem;
import com.ultracart.admin.v2.models.CustomerWishListItemsResponse;
import com.ultracart.admin.v2.util.ApiException;
import item.ItemFunctions;
import common.Constants;

public class DeleteWishListItem {
    /**
     * The wishlist methods allow management of a customer's wishlist.
     * This includes:
     *     DeleteWishListItem
     *     GetCustomerWishList
     *     GetCustomerWishListItem
     *     InsertWishListItem
     *     UpdateWishListItem
     * These methods provide a standard CRUD interface. The example below uses all of them.
     *
     * You'll need merchant_item_oids to insert wishlist items. If you don't know the oids,
     * call ItemApi.GetItemByMerchantItemId() to retrieve the item, then get item.MerchantItemOid
     *
     * Note: Priority of wishlist item, 3 being low priority and 5 is high priority.
     */
    public static void execute() {
        try {
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            // create a few items first.
            int firstItemOid = ItemFunctions.insertSampleItemAndGetOid();
            int secondItemOid = ItemFunctions.insertSampleItemAndGetOid();

            // create a customer
            int customerOid = CustomerFunctions.insertSampleCustomer();

            // TODO: If you don't know the customer oid, use GetCustomerByEmail() to retrieve the customer.

            // add some wish list items.
            CustomerWishListItem addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(firstItemOid);
            addWishItem.setComments("I really want this for my birthday");
            addWishItem.setPriority(3); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem firstCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(secondItemOid);
            addWishItem.setComments("Christmas Idea!");
            addWishItem.setPriority(5); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem secondCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            // retrieve one wishlist item again
            CustomerWishListItem firstCreatedWishItemCopy = customerApi.getCustomerWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid()).getWishlistItem();

            // retrieve all wishlist items
            CustomerWishListItemsResponse allWishListItems = customerApi.getCustomerWishList(customerOid);

            // update an item.
            secondCreatedWishItem.setPriority(4);
            CustomerWishListItem updatedSecondWishItem = customerApi.updateWishListItem(customerOid, secondCreatedWishItem.getCustomerWishlistItemOid(), secondCreatedWishItem);

            // delete a wish list item
            customerApi.deleteWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid());

            // Clean up
            CustomerFunctions.deleteSampleCustomer(customerOid);
            ItemFunctions.deleteSampleItemByOid(firstItemOid);
            ItemFunctions.deleteSampleItemByOid(secondItemOid);
        } catch (ApiException ex) {
            System.err.println("An Exception occurred. Please review the following error:");
            System.err.println(ex);
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer oid for this wishlist. | |
| **customerWishlistItemOid** | **Integer**| The wishlist oid for this wishlist item to delete. | |

### Return type

[**CustomerWishListItem**](CustomerWishListItem.md)

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

<a name="getCustomer"></a>
# **getCustomer**
> CustomerResponse getCustomer(customerProfileOid, expand)

Retrieve a customer

Retrieves a single customer using the specified customer profile oid. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.Customer;
import com.ultracart.admin.v2.models.CustomerResponse;
import common.Constants;

public class GetCustomer {
    /**
     * Of the two GetCustomer methods, you'll probably always use GetCustomerByEmail instead of this one.
     * Most customer logic revolves around the email, not the customer oid. The latter is only meaningful as a primary
     * key in the UltraCart databases. But here is an example of using GetCustomer().
     */
    public static void Execute() {
        try {
            String email = CustomerFunctions.createRandomEmail();
            int customerOid = CustomerFunctions.insertSampleCustomer(email);
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            // the _expand variable is set to return just the address fields.
            // see CustomerFunctions for a list of expansions, or consult the source: https://www.ultracart.com/api/
            CustomerResponse apiResponse = customerApi.getCustomer(customerOid, "billing,shipping");
            Customer customer = apiResponse.getCustomer(); // assuming this succeeded

            System.out.println(customer);

            CustomerFunctions.deleteSampleCustomer(customerOid);
        }
        catch (Exception ex) {
            System.err.println("An Exception occurred. Please review the following error:");
            System.err.println(ex); // <-- change_me: handle gracefully
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CustomerResponse**](CustomerResponse.md)

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

<a name="getCustomerByEmail"></a>
# **getCustomerByEmail**
> CustomerResponse getCustomerByEmail(email, expand)

Retrieve a customer by Email

Retrieves a single customer using the specified customer email address. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.Customer;
import com.ultracart.admin.v2.models.CustomerResponse;
import common.Constants;

public class GetCustomerByEmail {
    /**
     * Of the two GetCustomer methods, you'll probably always use this one over GetCustomer.
     * Most customer logic revolves around the email, not the customer oid. The latter is only meaningful as a primary
     * key in the UltraCart databases. But our sample functions return back the oid, so we'll ignore that and just
     * use the email that we create.
     */
    public static void Execute() {
        try {
            String email = CustomerFunctions.createRandomEmail();
            int customerOid = CustomerFunctions.insertSampleCustomer(email);
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            // the _expand variable is set to return just the address fields.
            // see CustomerFunctions for a list of expansions, or consult the source: https://www.ultracart.com/api/
            CustomerResponse apiResponse = customerApi.getCustomerByEmail(email, "billing,shipping");
            Customer customer = apiResponse.getCustomer(); // assuming this succeeded

            System.out.println(customer);

            CustomerFunctions.deleteSampleCustomer(customerOid);
        }
        catch (Exception ex) {
            System.err.println("An Exception occurred. Please review the following error:");
            System.err.println(ex); // <-- change_me: handle gracefully
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**| The email address of the customer to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CustomerResponse**](CustomerResponse.md)

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

<a name="getCustomerEditorValues"></a>
# **getCustomerEditorValues**
> CustomerEditorValues getCustomerEditorValues()

Retrieve values needed for a customer profile editor

Retrieve values needed for a customer profile editor. 

### Example

```java
// This is an internal method used by our Customer management screen.  It returns back all the static data needed
// for our dropdown lists, such as lists of state and countries.  You can call it if you like, but the data won't be
// of much use.
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**CustomerEditorValues**](CustomerEditorValues.md)

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

<a name="getCustomerEmailLists"></a>
# **getCustomerEmailLists**
> EmailListsResponse getCustomerEmailLists()

Retrieve all email lists across all storefronts

Retrieve all email lists across all storefronts 

### Example

```java
// This is an internal method used by our Email workflow engines.  It returns back all the email lists a customer
// is currently subscribed to.  It's geared towards our UI needs, so the data returned may appear cryptic.
//  We're not including a sample for it because we don't envision it being valuable to a merchant.
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**EmailListsResponse**](EmailListsResponse.md)

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

<a name="getCustomerStoreCredit"></a>
# **getCustomerStoreCredit**
> CustomerStoreCreditResponse getCustomerStoreCredit(customerProfileOid)

Retrieve the customer store credit accumulated through loyalty programs

Retrieve the customer store credit accumulated through loyalty programs 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.CustomerStoreCredit;
import com.ultracart.admin.v2.models.CustomerStoreCreditAddRequest;
import com.ultracart.admin.v2.models.CustomerStoreCreditResponse;
import common.Constants;

import java.math.BigDecimal;

public class GetCustomerStoreCredit {
    /*
        getCustomerStoreCredit returns back the store credit for a customer, which includes:
        total - lifetime credit
        available - currently available store credit
        vesting - amount of store credit vesting
        expiring - amount of store credit expiring within 30 days
        pastLedgers - transaction history
        futureLedgers - future transactions including expiring entries
     */
    public static void Execute() {
        try {
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            // create a customer
            int customerOid = CustomerFunctions.insertSampleCustomer();

            // add some store credit.
            CustomerStoreCreditAddRequest addRequest = new CustomerStoreCreditAddRequest();
            addRequest.setDescription("First credit add");
            addRequest.setVestingDays(10);
            addRequest.setExpirationDays(20); // that's not a lot of time!
            addRequest.setAmount(BigDecimal.valueOf(20));
            customerApi.addCustomerStoreCredit(customerOid, addRequest);

            // add more store credit.
            addRequest = new CustomerStoreCreditAddRequest();
            addRequest.setDescription("Second credit add");
            addRequest.setVestingDays(0); // immediately available.
            addRequest.setExpirationDays(90);
            addRequest.setAmount(BigDecimal.valueOf(40));
            customerApi.addCustomerStoreCredit(customerOid, addRequest);

            CustomerStoreCreditResponse apiResponse = customerApi.getCustomerStoreCredit(customerOid);
            CustomerStoreCredit storeCredit = apiResponse.getCustomerStoreCredit();

            System.out.println(storeCredit); // <-- There's a lot of information inside this object.

            // clean up this sample.
            CustomerFunctions.deleteSampleCustomer(customerOid);
        }
        catch (Exception e) {
            System.out.println("An Exception occurred. Please review the following error:");
            System.out.println(e); // <-- change_me: handle gracefully
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer oid to retrieve. | |

### Return type

[**CustomerStoreCreditResponse**](CustomerStoreCreditResponse.md)

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

<a name="getCustomerWishList"></a>
# **getCustomerWishList**
> CustomerWishListItemsResponse getCustomerWishList(customerProfileOid)

Retrieve wishlist items for customer

Retrieve wishlist items for customer. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.CustomerWishListItem;
import com.ultracart.admin.v2.models.CustomerWishListItemsResponse;
import com.ultracart.admin.v2.util.ApiException;
import item.ItemFunctions;
import common.Constants;

public class GetCustomerWishList {
    /**
     * The wishlist methods allow management of a customer's wishlist.
     * This includes:
     *     DeleteWishListItem
     *     GetCustomerWishList
     *     GetCustomerWishListItem
     *     InsertWishListItem
     *     UpdateWishListItem
     * These methods provide a standard CRUD interface. The example below uses all of them.
     *
     * You'll need merchant_item_oids to insert wishlist items. If you don't know the oids,
     * call ItemApi.GetItemByMerchantItemId() to retrieve the item, then get item.MerchantItemOid
     *
     * Note: Priority of wishlist item, 3 being low priority and 5 is high priority.
     */
    public static void execute() {
        try {
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            // create a few items first.
            int firstItemOid = ItemFunctions.insertSampleItemAndGetOid();
            int secondItemOid = ItemFunctions.insertSampleItemAndGetOid();

            // create a customer
            int customerOid = CustomerFunctions.insertSampleCustomer();

            // TODO: If you don't know the customer oid, use GetCustomerByEmail() to retrieve the customer.

            // add some wish list items.
            CustomerWishListItem addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(firstItemOid);
            addWishItem.setComments("I really want this for my birthday");
            addWishItem.setPriority(3); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem firstCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(secondItemOid);
            addWishItem.setComments("Christmas Idea!");
            addWishItem.setPriority(5); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem secondCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            // retrieve one wishlist item again
            CustomerWishListItem firstCreatedWishItemCopy = customerApi.getCustomerWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid()).getWishlistItem();

            // retrieve all wishlist items
            CustomerWishListItemsResponse allWishListItems = customerApi.getCustomerWishList(customerOid);

            // update an item.
            secondCreatedWishItem.setPriority(4);
            CustomerWishListItem updatedSecondWishItem = customerApi.updateWishListItem(customerOid, secondCreatedWishItem.getCustomerWishlistItemOid(), secondCreatedWishItem);

            // delete a wish list item
            customerApi.deleteWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid());

            // Clean up
            CustomerFunctions.deleteSampleCustomer(customerOid);
            ItemFunctions.deleteSampleItemByOid(firstItemOid);
            ItemFunctions.deleteSampleItemByOid(secondItemOid);
        } catch (ApiException ex) {
            System.err.println("An Exception occurred. Please review the following error:");
            System.err.println(ex);
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer oid for this wishlist. | |

### Return type

[**CustomerWishListItemsResponse**](CustomerWishListItemsResponse.md)

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

<a name="getCustomerWishListItem"></a>
# **getCustomerWishListItem**
> CustomerWishListItemResponse getCustomerWishListItem(customerProfileOid, customerWishlistItemOid)

Retrieve wishlist item for customer

Retrieve wishlist item for customer. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.CustomerWishListItem;
import com.ultracart.admin.v2.models.CustomerWishListItemsResponse;
import com.ultracart.admin.v2.util.ApiException;
import item.ItemFunctions;
import common.Constants;

public class GetCustomerWishListItem {
    /**
     * The wishlist methods allow management of a customer's wishlist.
     * This includes:
     *     DeleteWishListItem
     *     GetCustomerWishList
     *     GetCustomerWishListItem
     *     InsertWishListItem
     *     UpdateWishListItem
     * These methods provide a standard CRUD interface. The example below uses all of them.
     *
     * You'll need merchant_item_oids to insert wishlist items. If you don't know the oids,
     * call ItemApi.GetItemByMerchantItemId() to retrieve the item, then get item.MerchantItemOid
     *
     * Note: Priority of wishlist item, 3 being low priority and 5 is high priority.
     */
    public static void execute() {
        try {
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            // create a few items first.
            int firstItemOid = ItemFunctions.insertSampleItemAndGetOid();
            int secondItemOid = ItemFunctions.insertSampleItemAndGetOid();

            // create a customer
            int customerOid = CustomerFunctions.insertSampleCustomer();

            // TODO: If you don't know the customer oid, use GetCustomerByEmail() to retrieve the customer.

            // add some wish list items.
            CustomerWishListItem addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(firstItemOid);
            addWishItem.setComments("I really want this for my birthday");
            addWishItem.setPriority(3); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem firstCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(secondItemOid);
            addWishItem.setComments("Christmas Idea!");
            addWishItem.setPriority(5); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem secondCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            // retrieve one wishlist item again
            CustomerWishListItem firstCreatedWishItemCopy = customerApi.getCustomerWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid()).getWishlistItem();

            // retrieve all wishlist items
            CustomerWishListItemsResponse allWishListItems = customerApi.getCustomerWishList(customerOid);

            // update an item.
            secondCreatedWishItem.setPriority(4);
            CustomerWishListItem updatedSecondWishItem = customerApi.updateWishListItem(customerOid, secondCreatedWishItem.getCustomerWishlistItemOid(), secondCreatedWishItem);

            // delete a wish list item
            customerApi.deleteWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid());

            // Clean up
            CustomerFunctions.deleteSampleCustomer(customerOid);
            ItemFunctions.deleteSampleItemByOid(firstItemOid);
            ItemFunctions.deleteSampleItemByOid(secondItemOid);
        } catch (ApiException ex) {
            System.err.println("An Exception occurred. Please review the following error:");
            System.err.println(ex);
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer oid for this wishlist. | |
| **customerWishlistItemOid** | **Integer**| The wishlist oid for this wishlist item. | |

### Return type

[**CustomerWishListItemResponse**](CustomerWishListItemResponse.md)

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

<a name="getCustomers"></a>
# **getCustomers**
> CustomersResponse getCustomers(email, qbClass, quickbooksCode, lastModifiedDtsStart, lastModifiedDtsEnd, signupDtsStart, signupDtsEnd, billingFirstName, billingLastName, billingCompany, billingCity, billingState, billingPostalCode, billingCountryCode, billingDayPhone, billingEveningPhone, shippingFirstName, shippingLastName, shippingCompany, shippingCity, shippingState, shippingPostalCode, shippingCountryCode, shippingDayPhone, shippingEveningPhone, pricingTierOid, pricingTierName, limit, offset, since, sort, expand)

Retrieve customers

Retrieves customers from the account.  If no parameters are specified, all customers will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.Customer;
import com.ultracart.admin.v2.models.CustomersResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class GetCustomers {
    /**
     * This example illustrates how to retrieve customers. It uses the pagination logic necessary to query all customers.
     * This method was the first GetCustomers and has parameters for all the search terms. It's an ogre. Using
     * GetCustomersByQuery is much easier to use.
     */
    public static List<Customer> getCustomerChunk(CustomerApi customerApi, int offset, int limit) throws ApiException {
        // The real devil in the GetCustomers calls is the expansion, making sure you return everything you need without
        // returning everything since these objects are extremely large. The customer object can be truly large with
        // all the order history. These are the possible expansion values.
        /*
            attachments     billing     cards           cc_emails       loyalty     orders_summary          pricing_tiers
            privacy         properties  quotes_summary  reviewer        shipping    software_entitlements   tags
            tax_codes     
         */
        String expand = "shipping,billing"; // just the address fields. contact us if you're unsure
        
        // TODO: Seriously, use GetCustomersByQuery -- it's so much better than this old method.
        String email = null;
        String qbClass = null;
        String quickbooksCode = null;
        String lastModifiedDtsStart = null;
        String lastModifiedDtsEnd = null;
        String signupDtsStart = null;
        String signupDtsEnd = null;
        String billingFirstName = null;
        String billingLastName = null;
        String billingCompany = null;
        String billingCity = null;
        String billingState = null;
        String billingPostalCode = null;
        String billingCountryCode = null;
        String billingDayPhone = null;
        String billingEveningPhone = null;
        String shippingFirstName = null;
        String shippingLastName = null;
        String shippingCompany = null;
        String shippingCity = null;
        String shippingState = null;
        String shippingPostalCode = null;
        String shippingCountryCode = null;
        String shippingDayPhone = null;
        String shippingEveningPhone = null;
        Integer pricingTierOid = null;
        String pricingTierName = null;
        String since = null;
        String sort = null;
        
        CustomersResponse apiResponse = customerApi.getCustomers(
            email, qbClass, quickbooksCode, lastModifiedDtsStart, lastModifiedDtsEnd, signupDtsStart, signupDtsEnd,
            billingFirstName, billingLastName, billingCompany, billingCity, billingState, billingPostalCode,
            billingCountryCode, billingDayPhone, billingEveningPhone, shippingFirstName, shippingLastName,
            shippingCompany, shippingCity, shippingState, shippingPostalCode, shippingCountryCode,
            shippingDayPhone, shippingEveningPhone, pricingTierOid, pricingTierName, limit, offset, since, sort, expand);

        if (apiResponse.getCustomers() != null) {
            return apiResponse.getCustomers();
        }
        return new ArrayList<>();
    }

    public static void Execute() {
        try {
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);
            List<Customer> customers = new ArrayList<>();

            int iteration = 1;
            int offset = 0;
            int limit = 200;
            boolean moreRecordsToFetch = true;

            while (moreRecordsToFetch) {
                System.out.println("Executing iteration " + iteration);

                List<Customer> chunkOfCustomers = getCustomerChunk(customerApi, offset, limit);
                customers.addAll(chunkOfCustomers);
                offset = offset + limit;
                moreRecordsToFetch = chunkOfCustomers.size() == limit;
                iteration++;
            }

            // This will be verbose...
            System.out.println(customers);
        }
        catch (Exception ex) {
            System.err.println("Exception occurred: " + ex.getMessage());
            System.err.println(ex);
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**| Email | [optional] |
| **qbClass** | **String**| Quickbooks class | [optional] |
| **quickbooksCode** | **String**| Quickbooks code | [optional] |
| **lastModifiedDtsStart** | **String**| Last modified date start | [optional] |
| **lastModifiedDtsEnd** | **String**| Last modified date end | [optional] |
| **signupDtsStart** | **String**| Signup date start | [optional] |
| **signupDtsEnd** | **String**| Signup date end | [optional] |
| **billingFirstName** | **String**| Billing first name | [optional] |
| **billingLastName** | **String**| Billing last name | [optional] |
| **billingCompany** | **String**| Billing company | [optional] |
| **billingCity** | **String**| Billing city | [optional] |
| **billingState** | **String**| Billing state | [optional] |
| **billingPostalCode** | **String**| Billing postal code | [optional] |
| **billingCountryCode** | **String**| Billing country code | [optional] |
| **billingDayPhone** | **String**| Billing day phone | [optional] |
| **billingEveningPhone** | **String**| Billing evening phone | [optional] |
| **shippingFirstName** | **String**| Shipping first name | [optional] |
| **shippingLastName** | **String**| Shipping last name | [optional] |
| **shippingCompany** | **String**| Shipping company | [optional] |
| **shippingCity** | **String**| Shipping city | [optional] |
| **shippingState** | **String**| Shipping state | [optional] |
| **shippingPostalCode** | **String**| Shipping postal code | [optional] |
| **shippingCountryCode** | **String**| Shipping country code | [optional] |
| **shippingDayPhone** | **String**| Shipping day phone | [optional] |
| **shippingEveningPhone** | **String**| Shipping evening phone | [optional] |
| **pricingTierOid** | **Integer**| Pricing tier oid | [optional] |
| **pricingTierName** | **String**| Pricing tier name | [optional] |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **since** | **String**| Fetch customers that have been created/modified since this date/time. | [optional] |
| **sort** | **String**| The sort order of the customers.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CustomersResponse**](CustomersResponse.md)

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

<a name="getCustomersByQuery"></a>
# **getCustomersByQuery**
> CustomersResponse getCustomersByQuery(customerQuery, limit, offset, since, sort, expand)

Retrieve customers by query

Retrieves customers from the account.  If no parameters are specified, all customers will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.Customer;
import com.ultracart.admin.v2.models.CustomerQuery;
import com.ultracart.admin.v2.models.CustomersResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class GetCustomersByQuery {
    /*
     * This example illustrates how to retrieve customers. It uses the pagination logic necessary to query all customers.
     */
    public static void Execute() {
        // pulling all records could take a long time.
        CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

        List<Customer> customers = new ArrayList<>();

        int iteration = 1;
        int offset = 0;
        int limit = 200;
        boolean moreRecordsToFetch = true;

        try {
            while (moreRecordsToFetch) {
                System.out.println("executing iteration " + iteration);

                List<Customer> chunkOfCustomers = getCustomerChunk(customerApi, offset, limit);
                customers.addAll(chunkOfCustomers);
                offset = offset + limit;
                moreRecordsToFetch = chunkOfCustomers.size() == limit;
                iteration++;
            }
        }
        catch (Exception e) {
            System.out.println("Exception occurred on iteration " + iteration);
            System.out.println(e);
            System.exit(1);
        }

        // this will be verbose...
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    /**
     * Retrieves a chunk of customers based on specified parameters
     *
     * @param customerApi The customer API client
     * @param offset Starting position for retrieval
     * @param limit Maximum number of records to retrieve
     * @return List of customers
     */
    private static List<Customer> getCustomerChunk(CustomerApi customerApi, int offset, int limit) throws ApiException {
        // The real devil in the getCustomers calls is the expansion, making sure you return everything you need without
        // returning everything since these objects are extremely large. The customer object can be truly large with
        // all the order history. These are the possible expansion values.
        /*
            attachments     billing     cards           cc_emails       loyalty     orders_summary          pricing_tiers
            privacy         properties  quotes_summary  reviewer        shipping    software_entitlements   tags
            tax_codes
        */
        String expand = "shipping,billing"; // just the address fields. contact us if you're unsure

        // TODO: This is just showing all the possibilities. In reality, you'll just assign the filters you need.
        CustomerQuery query = new CustomerQuery();
        //query.setEmail(null);
        //query.setQbClass(null);
        //query.setQuickbooksCode(null);
        //query.setLastModifiedDtsStart(null);
        //query.setLastModifiedDtsEnd(null);
        //query.setSignupDtsStart(null);
        //query.setSignupDtsEnd(null);
        //query.setBillingFirstName(null);
        //query.setBillingLastName(null);
        //query.setBillingCompany(null);
        //query.setBillingCity(null);
        //query.setBillingState(null);
        //query.setBillingPostalCode(null);
        //query.setBillingCountryCode(null);
        //query.setBillingDayPhone(null);
        //query.setBillingEveningPhone(null);
        //query.setShippingFirstName(null);
        //query.setShippingLastName(null);
        //query.setShippingCompany(null);
        //query.setShippingCity(null);
        //query.setShippingState(null);
        //query.setShippingPostalCode(null);
        //query.setShippingCountryCode(null);
        //query.setShippingDayPhone(null);
        //query.setShippingEveningPhone(null);
        //query.setPricingTierOid(null);
        //query.setPricingTierName(null);

        String since = null;
        String sort = "email";

        CustomersResponse apiResponse = customerApi.getCustomersByQuery(query, offset, limit, since, sort, expand);

        if (apiResponse.getCustomers() != null) {
            return apiResponse.getCustomers();
        }
        return new ArrayList<>();
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerQuery** | [**CustomerQuery**](CustomerQuery.md)| Customer query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **since** | **String**| Fetch customers that have been created/modified since this date/time. | [optional] |
| **sort** | **String**| The sort order of the customers.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CustomersResponse**](CustomersResponse.md)

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

<a name="getCustomersForDataTables"></a>
# **getCustomersForDataTables**
> DataTablesServerSideResponse getCustomersForDataTables(expand)

Retrieve customers for DataTables plugin

Retrieves customers from the account.  If no searches are specified, all customers will be returned. 

### Example

```java
// This is an internal method used by our Customer management screen.  It won't be of much use to you, so we're
// not including a sample.  getCustomer, getCustomerByEmail, getCustomers and getCustomersByQuery are more useful
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**DataTablesServerSideResponse**](DataTablesServerSideResponse.md)

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

<a name="getEmailVerificationToken"></a>
# **getEmailVerificationToken**
> EmailVerifyTokenResponse getEmailVerificationToken(tokenRequest)

Create a token that can be used to verify a customer email address

Create a token that can be used to verify a customer email address.  The implementation of how a customer interacts with this token is left to the merchant. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.EmailVerifyTokenRequest;
import com.ultracart.admin.v2.models.EmailVerifyTokenResponse;
import com.ultracart.admin.v2.models.EmailVerifyTokenValidateRequest;
import com.ultracart.admin.v2.models.EmailVerifyTokenValidateResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

/*
    GetEmailVerificationToken and ValidateEmailVerificationToken are tandem functions that allow a merchant to verify
    a customer's email address. GetEmailVerificationToken returns back a token that the merchant can use however
    they wish to present to a customer. Usually this will be emailed to the customer within instructions to enter
    it back into a website. Once the customer enters the token back into a site (along with their email),
    ValidateEmailVerificationToken will validate the token.

    Notice that GetEmailVerificationToken requires both the email and password.
 */
public class GetEmailVerificationToken {
    public static void execute() {
        CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

        String email = "test@ultracart.com";
        String password = "squirrel";

        EmailVerifyTokenRequest tokenRequest = new EmailVerifyTokenRequest();
        tokenRequest.email(email);
        tokenRequest.password(password);

        try {
            EmailVerifyTokenResponse tokenResponse = customerApi.getEmailVerificationToken(tokenRequest);
            String token = tokenResponse.getToken();

            // TODO - email the token to the customer, have them enter it back into another page...
            // TODO - verify the token with the following call

            EmailVerifyTokenValidateRequest verifyRequest = new EmailVerifyTokenValidateRequest();
            verifyRequest.token(token);
            EmailVerifyTokenValidateResponse verifyResponse = customerApi.validateEmailVerificationToken(verifyRequest);

            System.out.println("Was the correct token provided? " + verifyResponse.getSuccess());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tokenRequest** | [**EmailVerifyTokenRequest**](EmailVerifyTokenRequest.md)| Token request | |

### Return type

[**EmailVerifyTokenResponse**](EmailVerifyTokenResponse.md)

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

<a name="getMagicLink"></a>
# **getMagicLink**
> CustomerMagicLinkResponse getMagicLink(customerProfileOid, storefrontHostName)

getMagicLink

Retrieves a magic link to allow a merchant to login as a customer.  This method is a PUT call intentionally. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.CustomerMagicLinkResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class GetMagicLink {
    public static void Execute() {
        /*
            getMagicLink returns back a url whereby a merchant can log into their website as the customer.
            This may be useful to "see what the customer is seeing" and is the only method to do so since
            the customer's passwords are encrypted.  Note: A merchant may also do this using the UltraCart
            backend site within the Customer Management section.
         */

        try {
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            // create a customer
            int customerOid = CustomerFunctions.insertSampleCustomer();
            String storefront = "www.website.com";  // required.  many merchants have dozens of storefronts. which one?

            CustomerMagicLinkResponse apiResponse = customerApi.getMagicLink(customerOid, storefront);
            String url = apiResponse.getUrl();

            System.out.println("<html><body><script>window.location.href = " +
                URLEncoder.encode(url, StandardCharsets.UTF_8.toString()) + ";</script></body></html>");

            // clean up this sample. - don't do this or the above magic link won't work.  But you'll want to clean up this
            // sample customer manually using the backend.
            // CustomerFunctions.deleteSampleCustomer(customerOid);

        } catch (ApiException e) {
            System.out.println("An ApiException occurred.  Please review the following error:");
            System.out.println(e); // <-- change_me: handle gracefully
            System.exit(1);
        } catch (UnsupportedEncodingException e) {
          throw new RuntimeException(e);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer_profile_oid of the customer. | |
| **storefrontHostName** | **String**| The storefront to log into. | |

### Return type

[**CustomerMagicLinkResponse**](CustomerMagicLinkResponse.md)

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

<a name="insertCustomer"></a>
# **insertCustomer**
> CustomerResponse insertCustomer(customer, expand)

Insert a customer

Insert a customer on the UltraCart account. 

### Example

```java
package customer;

import com.ultracart.admin.v2.util.ApiException;

public class InsertCustomer {
    public static void execute() {
        try {
            int customerOid = CustomerFunctions.insertSampleCustomer();
            CustomerFunctions.deleteSampleCustomer(customerOid);
        } catch (ApiException e) {
            System.err.println("An ApiException occurred. Please review the following error:");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customer** | [**Customer**](Customer.md)| Customer to insert | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CustomerResponse**](CustomerResponse.md)

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

<a name="insertWishListItem"></a>
# **insertWishListItem**
> CustomerWishListItem insertWishListItem(customerProfileOid, wishlistItem)

Insert a customer wishlist item

Insert a customer wishlist item 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.CustomerWishListItem;
import com.ultracart.admin.v2.models.CustomerWishListItemsResponse;
import com.ultracart.admin.v2.util.ApiException;
import item.ItemFunctions;
import common.Constants;

public class InsertWishListItem {
    /**
     * The wishlist methods allow management of a customer's wishlist.
     * This includes:
     *     DeleteWishListItem
     *     GetCustomerWishList
     *     GetCustomerWishListItem
     *     InsertWishListItem
     *     UpdateWishListItem
     * These methods provide a standard CRUD interface. The example below uses all of them.
     *
     * You'll need merchant_item_oids to insert wishlist items. If you don't know the oids,
     * call ItemApi.GetItemByMerchantItemId() to retrieve the item, then get item.MerchantItemOid
     *
     * Note: Priority of wishlist item, 3 being low priority and 5 is high priority.
     */
    public static void execute() {
        try {
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            // create a few items first.
            int firstItemOid = ItemFunctions.insertSampleItemAndGetOid();
            int secondItemOid = ItemFunctions.insertSampleItemAndGetOid();

            // create a customer
            int customerOid = CustomerFunctions.insertSampleCustomer();

            // TODO: If you don't know the customer oid, use GetCustomerByEmail() to retrieve the customer.

            // add some wish list items.
            CustomerWishListItem addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(firstItemOid);
            addWishItem.setComments("I really want this for my birthday");
            addWishItem.setPriority(3); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem firstCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(secondItemOid);
            addWishItem.setComments("Christmas Idea!");
            addWishItem.setPriority(5); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem secondCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            // retrieve one wishlist item again
            CustomerWishListItem firstCreatedWishItemCopy = customerApi.getCustomerWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid()).getWishlistItem();

            // retrieve all wishlist items
            CustomerWishListItemsResponse allWishListItems = customerApi.getCustomerWishList(customerOid);

            // update an item.
            secondCreatedWishItem.setPriority(4);
            CustomerWishListItem updatedSecondWishItem = customerApi.updateWishListItem(customerOid, secondCreatedWishItem.getCustomerWishlistItemOid(), secondCreatedWishItem);

            // delete a wish list item
            customerApi.deleteWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid());

            // Clean up
            CustomerFunctions.deleteSampleCustomer(customerOid);
            ItemFunctions.deleteSampleItemByOid(firstItemOid);
            ItemFunctions.deleteSampleItemByOid(secondItemOid);
        } catch (ApiException ex) {
            System.err.println("An Exception occurred. Please review the following error:");
            System.err.println(ex);
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer oid for this wishlist. | |
| **wishlistItem** | [**CustomerWishListItem**](CustomerWishListItem.md)| Wishlist item to insert | |

### Return type

[**CustomerWishListItem**](CustomerWishListItem.md)

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

<a name="mergeCustomer"></a>
# **mergeCustomer**
> mergeCustomer(customerProfileOid, customer, expand)

Merge customer into this customer

Merge customer into this customer. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.CustomerMergeRequest;
import com.ultracart.admin.v2.util.ApiException;

import common.Constants;

public class MergeCustomer {
    public static void Execute() {
        /*
            The merge function was requested by UltraCart merchants that sell software and manage activation keys.  Frequently,
            customers would purchase their software using one email address, and then accidentally re-subscribe using a
            different email address (for example, they purchased subsequent years using PayPal which was tied to their spouse's
            email).  However it happened, the customer now how software licenses spread across multiple emails and therefore
            multiple customer profiles.

            merge combine the customer profiles, merging order history and software entitlements.  Still, it may be used to
            combine any two customer profiles for any reason.

            Success returns back a status code 204 (No Content)
         */

        try {
            // first customer
            int firstCustomerOid = CustomerFunctions.insertSampleCustomer();

            String secondEmail = CustomerFunctions.createRandomEmail();
            int secondCustomerOid = CustomerFunctions.insertSampleCustomer(secondEmail);

            CustomerMergeRequest mergeRequest = new CustomerMergeRequest();
            // Supply either the email or the customer oid.  Only need one.
            mergeRequest.setEmail(secondEmail);
            // mergeRequest.setCustomerProfileOid(customerOid);

            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);
            customerApi.mergeCustomer(firstCustomerOid, mergeRequest, null);

            // clean up this sample.
            CustomerFunctions.deleteSampleCustomer(firstCustomerOid);
            // Notice: No need to delete the second sample.  The merge call deletes it.
        }
        catch (ApiException e) {
            System.out.println("An ApiException occurred.  Please review the following error:");
            System.out.println(e); // <-- change_me: handle gracefully
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer_profile_oid to update. | |
| **customer** | [**CustomerMergeRequest**](CustomerMergeRequest.md)| Customer to merge into this profile. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="searchCustomerProfileValues"></a>
# **searchCustomerProfileValues**
> LookupResponse searchCustomerProfileValues(lookupRequest)

Searches for all matching values (using POST)

### Example

```java
// This is an internal method used by our Customer management screen.  It only searches customer tags and is geared
// towards our UI needs, so it's inflexible.  We're not including a sample for it because we don't envision it
// being valuable to a merchant.
// getCustomersByQuery is the merchant's search method.  It is completely full-featured and easy to use.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lookupRequest** | [**LookupRequest**](LookupRequest.md)| LookupRequest | |

### Return type

[**LookupResponse**](LookupResponse.md)

### Authorization

[ultraCartBrowserApiKey](../README.md#ultraCartBrowserApiKey), [ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

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

<a name="updateCustomer"></a>
# **updateCustomer**
> CustomerResponse updateCustomer(customerProfileOid, customer, expand)

Update a customer

Update a customer on the UltraCart account. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.Customer;
import com.ultracart.admin.v2.models.CustomerResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class UpdateCustomer {
    public static void execute() {
        try {
            int customerOid = CustomerFunctions.insertSampleCustomer();

            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);
            // just want address fields.  see https://www.ultracart.com/api/#resource_customer.html for all expansion values
            String expand = "billing,shipping";
            Customer customer = customerApi.getCustomer(customerOid, expand).getCustomer();
            
            // TODO: do some edits to the customer.  Here we will change some billing fields.
            customer.getBilling().get(0).address2("Apartment 101");

            // notice expand is passed to update as well since it returns back an updated customer object.
            // we use the same expansion, so we get back the same fields and can do comparisons.
            CustomerResponse apiResponse = customerApi.updateCustomer(customerOid, customer, expand);

            // verify the update
            System.out.println(apiResponse.getCustomer());

            CustomerFunctions.deleteSampleCustomer(customerOid);
        } catch (ApiException e) {
            System.err.println("An ApiException occurred. Please review the following error:");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer_profile_oid to update. | |
| **customer** | [**Customer**](Customer.md)| Customer to update | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CustomerResponse**](CustomerResponse.md)

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

<a name="updateCustomerEmailLists"></a>
# **updateCustomerEmailLists**
> CustomerEmailListChanges updateCustomerEmailLists(customerProfileOid, listChanges)

Update email list subscriptions for a customer

Update email list subscriptions for a customer 

### Example

```java
// This is an internal method used by our Email workflow engines.  It allows for updating the email lists a customer
// is currently subscribed to.  It's geared towards our UI needs, so its usage may appear cryptic.
//  We're not including a sample for it because we don't envision it being valuable to a merchant.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer profile oid | |
| **listChanges** | [**CustomerEmailListChanges**](CustomerEmailListChanges.md)| List changes | |

### Return type

[**CustomerEmailListChanges**](CustomerEmailListChanges.md)

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

<a name="updateWishListItem"></a>
# **updateWishListItem**
> CustomerWishListItem updateWishListItem(customerProfileOid, customerWishlistItemOid, wishlistItem)

Update a customer wishlist item

Update a customer wishlist item 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.CustomerWishListItem;
import com.ultracart.admin.v2.models.CustomerWishListItemsResponse;
import com.ultracart.admin.v2.util.ApiException;
import item.ItemFunctions;
import common.Constants;

public class UpdateWishListItem {
    /**
     * The wishlist methods allow management of a customer's wishlist.
     * This includes:
     *     DeleteWishListItem
     *     GetCustomerWishList
     *     GetCustomerWishListItem
     *     InsertWishListItem
     *     UpdateWishListItem
     * These methods provide a standard CRUD interface. The example below uses all of them.
     *
     * You'll need merchant_item_oids to insert wishlist items. If you don't know the oids,
     * call ItemApi.GetItemByMerchantItemId() to retrieve the item, then get item.MerchantItemOid
     *
     * Note: Priority of wishlist item, 3 being low priority and 5 is high priority.
     */
    public static void execute() {
        try {
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            // create a few items first.
            int firstItemOid = ItemFunctions.insertSampleItemAndGetOid();
            int secondItemOid = ItemFunctions.insertSampleItemAndGetOid();

            // create a customer
            int customerOid = CustomerFunctions.insertSampleCustomer();

            // TODO: If you don't know the customer oid, use GetCustomerByEmail() to retrieve the customer.

            // add some wish list items.
            CustomerWishListItem addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(firstItemOid);
            addWishItem.setComments("I really want this for my birthday");
            addWishItem.setPriority(3); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem firstCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            addWishItem = new CustomerWishListItem();
            addWishItem.setCustomerProfileOid(customerOid);
            addWishItem.setMerchantItemOid(secondItemOid);
            addWishItem.setComments("Christmas Idea!");
            addWishItem.setPriority(5); // Priority of wishlist item, 3 being low priority and 5 is high priority.
            CustomerWishListItem secondCreatedWishItem = customerApi.insertWishListItem(customerOid, addWishItem);

            // retrieve one wishlist item again
            CustomerWishListItem firstCreatedWishItemCopy = customerApi.getCustomerWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid()).getWishlistItem();

            // retrieve all wishlist items
            CustomerWishListItemsResponse allWishListItems = customerApi.getCustomerWishList(customerOid);

            // update an item.
            secondCreatedWishItem.setPriority(4);
            CustomerWishListItem updatedSecondWishItem = customerApi.updateWishListItem(customerOid, secondCreatedWishItem.getCustomerWishlistItemOid(), secondCreatedWishItem);

            // delete a wish list item
            customerApi.deleteWishListItem(customerOid, firstCreatedWishItem.getCustomerWishlistItemOid());

            // Clean up
            CustomerFunctions.deleteSampleCustomer(customerOid);
            ItemFunctions.deleteSampleItemByOid(firstItemOid);
            ItemFunctions.deleteSampleItemByOid(secondItemOid);
        } catch (ApiException ex) {
            System.err.println("An Exception occurred. Please review the following error:");
            System.err.println(ex);
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerProfileOid** | **Integer**| The customer oid for this wishlist. | |
| **customerWishlistItemOid** | **Integer**| The wishlist oid for this wishlist item. | |
| **wishlistItem** | [**CustomerWishListItem**](CustomerWishListItem.md)| Wishlist item to update | |

### Return type

[**CustomerWishListItem**](CustomerWishListItem.md)

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

<a name="validateEmailVerificationToken"></a>
# **validateEmailVerificationToken**
> EmailVerifyTokenValidateResponse validateEmailVerificationToken(validationRequest)

Validate a token that can be used to verify a customer email address

Validate a token that can be used to verify a customer email address.  The implementation of how a customer interacts with this token is left to the merchant. 

### Example

```java
package customer;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class ValidateEmailVerificationToken {
    public static void execute() {
        /*
            GetEmailVerificationToken and ValidateEmailVerificationToken are tandem functions that allow a merchant to verify
            a customer's email address. GetEmailVerificationToken returns back a token that the merchant can use however
            they wish to present to a customer. Usually this will be emailed to the customer within instructions to enter
            it back into a website.  Once the customer enters the token back into a site (along with their email),
            ValidateEmailVerificationToken will validate the token.

            Notice that GetEmailVerificationToken requires both the email and password.
         */
        try {
            CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

            String email = "test@ultracart.com";
            String password = "squirrel";

            EmailVerifyTokenRequest tokenRequest = new EmailVerifyTokenRequest();
            tokenRequest.email(email);
            tokenRequest.password(password);

            EmailVerifyTokenResponse tokenResponse = customerApi.getEmailVerificationToken(tokenRequest);
            String token = tokenResponse.getToken();

            // TODO - email the token to the customer, have them enter it back into another page...
            // TODO - verify the token with the following call

            EmailVerifyTokenValidateRequest verifyRequest = new EmailVerifyTokenValidateRequest();
            verifyRequest.token(token);
            EmailVerifyTokenValidateResponse verifyResponse = customerApi.validateEmailVerificationToken(verifyRequest);

            System.out.println("Was the correct token provided? " + verifyResponse.getSuccess());
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **validationRequest** | [**EmailVerifyTokenValidateRequest**](EmailVerifyTokenValidateRequest.md)| Token validation request | |

### Return type

[**EmailVerifyTokenValidateResponse**](EmailVerifyTokenValidateResponse.md)

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

