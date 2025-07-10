# ItemApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDigitalItem**](ItemApi.md#deleteDigitalItem) | **DELETE** /item/digital_library/{digital_item_oid} | Delete a digital item, which is a file within the digital library, not an actual merchant item |
| [**deleteItem**](ItemApi.md#deleteItem) | **DELETE** /item/items/{merchant_item_oid} | Delete an item |
| [**deleteReview**](ItemApi.md#deleteReview) | **DELETE** /item/items/{merchant_item_oid}/reviews/{review_oid} | Delete a review |
| [**getDigitalItem**](ItemApi.md#getDigitalItem) | **GET** /item/digital_library/{digital_item_oid} | Retrieve a digital item from the digital library, which are digital files that may be attached to normal items |
| [**getDigitalItems**](ItemApi.md#getDigitalItems) | **GET** /item/digital_library | Retrieve digital items from the digital library which are digital files that may be attached to normal items |
| [**getDigitalItemsByExternalId**](ItemApi.md#getDigitalItemsByExternalId) | **GET** /item/digital_library/by_external/{external_id} | Retrieves digital items from the digital library (which are digital files that may be attached to normal items) that having a matching external id |
| [**getInventorySnapshot**](ItemApi.md#getInventorySnapshot) | **GET** /item/items/inventory_snapshot | Retrieve a list of item inventories.  This method may be called once every 15 minutes.  More than that will result in a 429 response. |
| [**getItem**](ItemApi.md#getItem) | **GET** /item/items/{merchant_item_oid} | Retrieve an item |
| [**getItemByMerchantItemId**](ItemApi.md#getItemByMerchantItemId) | **GET** /item/items/merchant_item_id/{merchant_item_id} | Retrieve an item by item id |
| [**getItems**](ItemApi.md#getItems) | **GET** /item/items | Retrieve items |
| [**getPricingTiers**](ItemApi.md#getPricingTiers) | **GET** /item/pricing_tiers | Retrieve pricing tiers |
| [**getReview**](ItemApi.md#getReview) | **GET** /item/items/{merchant_item_oid}/reviews/{review_oid} | Get a review |
| [**getReviews**](ItemApi.md#getReviews) | **GET** /item/items/{merchant_item_oid}/reviews | Get reviews for an item |
| [**getUnassociatedDigitalItems**](ItemApi.md#getUnassociatedDigitalItems) | **GET** /item/digital_library/unassociated | Retrieve digital items from the digital library (which are digital files that may be attached to normal items) not yet associated with actual items |
| [**insertDigitalItem**](ItemApi.md#insertDigitalItem) | **POST** /item/digital_library | Create a file within the digital library |
| [**insertItem**](ItemApi.md#insertItem) | **POST** /item/items | Create an item |
| [**insertReview**](ItemApi.md#insertReview) | **POST** /item/items/{merchant_item_oid}/reviews | Insert a review |
| [**insertUpdateItemContentAttribute**](ItemApi.md#insertUpdateItemContentAttribute) | **POST** /item/items/{merchant_item_oid}/content/attributes | Upsert an item content attribute |
| [**updateDigitalItem**](ItemApi.md#updateDigitalItem) | **PUT** /item/digital_library/{digital_item_oid} | Updates a file within the digital library |
| [**updateItem**](ItemApi.md#updateItem) | **PUT** /item/items/{merchant_item_oid} | Update an item |
| [**updateItems**](ItemApi.md#updateItems) | **PUT** /item/items/batch | Update multiple items |
| [**updateReview**](ItemApi.md#updateReview) | **PUT** /item/items/{merchant_item_oid}/reviews/{review_oid} | Update a review |
| [**uploadTemporaryMultimedia**](ItemApi.md#uploadTemporaryMultimedia) | **POST** /item/temp_multimedia | Upload an image to the temporary multimedia. |


<a name="deleteDigitalItem"></a>
# **deleteDigitalItem**
> deleteDigitalItem(digitalItemOid)

Delete a digital item, which is a file within the digital library, not an actual merchant item

Delete a digital item on the UltraCart account. 

### Example

```java
package item;

public class DeleteDigitalItem {
   public static void execute() {
       try {
           int digitalItemOid = ItemFunctions.insertSampleDigitalItem(null);
           ItemFunctions.deleteSampleDigitalItem(digitalItemOid);

       } catch (Exception e) {
           System.err.println("An Exception occurred. Please review the following error:");
           e.printStackTrace();
           System.exit(1);
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **digitalItemOid** | **Integer**| The digital item oid to delete. | |

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

<a name="deleteItem"></a>
# **deleteItem**
> deleteItem(merchantItemOid)

Delete an item

Delete an item on the UltraCart account. 

### Example

```java
package item;

public class DeleteItem {
  public static void execute() {
    try {
      int itemOid = ItemFunctions.insertSampleItemAndGetOid();
      ItemFunctions.deleteSampleItemByOid(itemOid);

    } catch (Exception e) {
      System.err.println("An Exception occurred. Please review the following error:");
      e.printStackTrace();
      System.exit(1);
    }
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantItemOid** | **Integer**| The item oid to delete. | |

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

<a name="deleteReview"></a>
# **deleteReview**
> deleteReview(reviewOid, merchantItemOid)

Delete a review

Delete an item review. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class DeleteReview {
   /**
    * Deletes a specific user review for an item. Used by merchants who cache reviews
    * on a separate site and wish to remove a particular review.
    *
    */
   public static void execute() throws ApiException {
       ItemApi itemApi = new ItemApi(Constants.API_KEY);
       int merchantItemOid = 123456;
       int reviewOid = 987654;
       itemApi.deleteReview(reviewOid, merchantItemOid);
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reviewOid** | **Integer**| The review oid to delete. | |
| **merchantItemOid** | **Integer**| The item oid the review is associated with. | |

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

<a name="getDigitalItem"></a>
# **getDigitalItem**
> ItemDigitalItemResponse getDigitalItem(digitalItemOid)

Retrieve a digital item from the digital library, which are digital files that may be attached to normal items

Retrieves a digital item (file information) from the account.  Be aware that these are not normal items that can be added to a shopping cart. Rather, they are digital files that may be associated with normal items. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;

public class GetDigitalItem {
   /**
    * Digital Items are not normal items sold on site. They are digital files added to
    * a library and attached to normal items as accessories or main items.
    * See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1376485/Digital+Items
    */
   public static void execute() {
       try {
           int digitalItemOid = ItemFunctions.insertSampleDigitalItem(null);
           ItemApi itemApi = new ItemApi(Constants.API_KEY);
           ItemDigitalItemResponse apiResponse = itemApi.getDigitalItem(digitalItemOid);
           ItemDigitalItem digitalItem = apiResponse.getDigitalItem();

           System.out.println("The following item was retrieved via GetDigitalItem():");
           System.out.println(digitalItem);

           ItemFunctions.deleteSampleDigitalItem(digitalItemOid);

       } catch (Exception e) {
           System.err.println("An Exception occurred. Please review the following error:");
           e.printStackTrace();
           System.exit(1);
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **digitalItemOid** | **Integer**| The digital item oid to retrieve. | |

### Return type

[**ItemDigitalItemResponse**](ItemDigitalItemResponse.md)

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

<a name="getDigitalItems"></a>
# **getDigitalItems**
> ItemDigitalItemsResponse getDigitalItems(limit, offset, since, sort, expand, placeholders)

Retrieve digital items from the digital library which are digital files that may be attached to normal items

Retrieves a group of digital items (file information) from the account.  If no parameters are specified, all digital items will be returned.  Be aware that these are not normal items that can be added to a shopping cart. Rather, they are digital files that may be associated with normal items.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;
import java.util.List;

public class GetDigitalItems {
   public static void execute() {
       try {
           /*
            * Please Note!
            * Digital Items are not normal items you sell on your site. They are digital files that you may add to
            * a library and then attach to a normal item as an accessory or the main item itself.
            * See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1376485/Digital+Items
            */

           int digitalItemOid = ItemFunctions.insertSampleDigitalItem(null);
           ItemApi itemApi = new ItemApi(Constants.API_KEY);

           int limit = 100;
           int offset = 0;
           String since = null; // digital items do not use since. leave as null.
           String sort = null; // if null, use default of original_filename
           String expand = null; // digital items have no expansion. leave as null. this value is ignored
           Boolean placeholders = null; // digital items have no placeholders. leave as null.

           ItemDigitalItemsResponse apiResponse = itemApi.getDigitalItems(limit, offset, since, sort, expand, placeholders);
           List<ItemDigitalItem> digitalItems = apiResponse.getDigitalItems();

           System.out.println("The following items were retrieved via GetDigitalItems():");
           for (ItemDigitalItem digitalItem : digitalItems) {
               System.out.println(digitalItem);
           }
       } catch (Exception e) {
           System.out.println("An Exception occurred. Please review the following error:");
           e.printStackTrace();
           System.exit(1);
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Default 100, Max 2000) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **since** | **String**| Fetch items that have been created/modified since this date/time. | [optional] |
| **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**ItemDigitalItemsResponse**](ItemDigitalItemsResponse.md)

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

<a name="getDigitalItemsByExternalId"></a>
# **getDigitalItemsByExternalId**
> ItemDigitalItemsResponse getDigitalItemsByExternalId(externalId)

Retrieves digital items from the digital library (which are digital files that may be attached to normal items) that having a matching external id

Retrieves digital items from the digital library (which are digital files that may be attached to normal items) that having a matching external id.  Be aware that these are not normal items that can be added to a shopping cart. Rather, they are digital files that may be associated with normal items. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;
import java.util.List;
import java.util.UUID;

public class GetDigitalItemsByExternalId {
   public static void execute() {
       try {
           /*
            * Please Note!
            * Digital Items are not normal items you sell on your site. They are digital files that you may add to
            * a library and then attach to a normal item as an accessory or the main item itself.
            * See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1376485/Digital+Items
            */

           String externalId = UUID.randomUUID().toString().replace("-", "");
           System.out.println("My external id is " + externalId);
           int digitalItemOid = ItemFunctions.insertSampleDigitalItem(externalId);
           ItemApi itemApi = new ItemApi(Constants.API_KEY);
           ItemDigitalItemsResponse apiResponse = itemApi.getDigitalItemsByExternalId(externalId);
           List<ItemDigitalItem> digitalItems = apiResponse.getDigitalItems();

           System.out.println("The following item was retrieved via GetDigitalItem():");
           System.out.println(digitalItems);

           ItemFunctions.deleteSampleDigitalItem(digitalItemOid);
       } catch (Exception e) {
           System.out.println("An Exception occurred. Please review the following error:");
           e.printStackTrace();
           System.exit(1);
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **externalId** | **String**| The external id to match against. | |

### Return type

[**ItemDigitalItemsResponse**](ItemDigitalItemsResponse.md)

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

<a name="getInventorySnapshot"></a>
# **getInventorySnapshot**
> ItemInventorySnapshotResponse getInventorySnapshot()

Retrieve a list of item inventories.  This method may be called once every 15 minutes.  More than that will result in a 429 response.

Retrieve a list of item inventories.  This method may be called once every 15 minutes.  More than that will result in a 429 response. 

### Example


(No example for this operation).


### Parameters
This endpoint does not need any parameter.

### Return type

[**ItemInventorySnapshotResponse**](ItemInventorySnapshotResponse.md)

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

<a name="getItem"></a>
# **getItem**
> ItemResponse getItem(merchantItemOid, expand, placeholders)

Retrieve an item

Retrieves a single item using the specified item oid. 

### Example

```java
package item;

import com.ultracart.admin.v2.CustomerApi;
import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.List;

public class GetItem {
   public static void execute() {
       try {
           ItemApi itemApi = new ItemApi(Constants.API_KEY);
           int itemOid = ItemFunctions.insertSampleItemAndGetOid();
           CustomerApi customerApi = new CustomerApi(Constants.API_KEY);

           String itemId = itemApi.getItem(itemOid, null, false).getItem().getMerchantItemId();
           
           ItemResponse apiResponse = itemApi.getItemByMerchantItemId(itemId, null, false);
           Item item = apiResponse.getItem();

           int merchantItemOid = item.getMerchantItemOid();

           String expand = "reviews,reviews.individual_reviews";
           apiResponse = itemApi.getItem(merchantItemOid, expand, false);
           item = apiResponse.getItem();

           ItemReviews itemReviews = item.getReviews();
           List<ItemReview> individualReviews = itemReviews.getIndividualReviews();
           
           for (ItemReview individualReview : individualReviews) {
               String ratingName1 = individualReview.getRatingName1();
               BigDecimal ratingScore1 = individualReview.getRatingScore1();

               CustomerResponse customerResponse = customerApi.getCustomer(individualReview.getCustomerProfileOid(), "reviewer");
               Customer customer = customerResponse.getCustomer();
               CustomerReviewer reviewer = customer.getReviewer();
           }

           System.out.println("The following item was retrieved via getItem():");
           System.out.println(item.toString());

           ItemFunctions.deleteSampleItemByOid(itemOid);
       } catch (ApiException e) {
           System.out.println("An ApiException occurred. Please review the following error:");
           e.printStackTrace();
           System.exit(1);
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantItemOid** | **Integer**| The item oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**ItemResponse**](ItemResponse.md)

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

<a name="getItemByMerchantItemId"></a>
# **getItemByMerchantItemId**
> ItemResponse getItemByMerchantItemId(merchantItemId, expand, placeholders)

Retrieve an item by item id

Retrieves a single item using the specified item id. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.Item;
import com.ultracart.admin.v2.models.ItemResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class GetItemByMerchantItemId {
  public static void execute() {
    // Of the two getItem methods, you'll probably always use getItemByMerchantItemId instead of this one.
    // Most item work is done with the item id, not the item oid. The latter is only meaningful as a primary
    // key in the UltraCart databases. But here is an example of using getItem(). We take the long route here
    // of retrieving the item using getItemByMerchantItemId to obtain the oid rather than hard-coding it. We do this
    // because these samples are used in our quality control system and run repeatedly.

    try {
      String itemId = ItemFunctions.insertSampleItem();
      ItemApi itemApi = new ItemApi(Constants.API_KEY);

      // The real devil in the getItem calls is the expansion, making sure you return everything you need without
      // returning everything since these objects are extremely large.
      // These are the possible expansion values.
           /*
               accounting
               amember
               auto_order
               auto_order.steps
               ccbill
               channel_partner_mappings
               chargeback
               checkout
               content
               content.assignments
               content.attributes
               content.multimedia
               content.multimedia.thumbnails
               digital_delivery
               ebay
               email_notifications
               enrollment123
               gift_certificate
               google_product_search
               kit_definition
               identifiers
               instant_payment_notifications
               internal
               options
               payment_processing
               physical
               pricing
               pricing.tiers
               realtime_pricing
               related
               reporting
               restriction
               reviews
               salesforce
               shipping
               shipping.cases
               shipping.destination_markups
               shipping.destination_restrictions
               shipping.distribution_centers
               shipping.methods
               shipping.package_requirements
               tax
               third_party_email_marketing
               variations
               wishlist_member
           */
      String expand = "kit_definition,options,shipping,tax,variations"; // just some random ones. contact us if you're unsure
      ItemResponse apiResponse = itemApi.getItemByMerchantItemId(itemId, expand, false);
      Item item = apiResponse.getItem();

      System.out.println("The following item was retrieved via getItemByMerchantItemId():");
      System.out.println(item.toString());

      ItemFunctions.deleteSampleItem(itemId);
    } catch (ApiException e) {
      System.out.println("An ApiException occurred. Please review the following error:");
      e.printStackTrace();
      System.exit(1);
    }
  }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantItemId** | **String**| The item id to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**ItemResponse**](ItemResponse.md)

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

<a name="getItems"></a>
# **getItems**
> ItemsResponse getItems(parentCategoryId, parentCategoryPath, limit, offset, since, sort, expand, placeholders)

Retrieve items

Retrieves a group of items from the account.  If no parameters are specified, all items will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.Item;
import com.ultracart.admin.v2.models.ItemsResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class GetItems {
   public static void execute() {
       /*
        * This example illustrates how to retrieve items. When dealing with items, please note that categories are
        * essentially folders to organize and store items. They are only used for that purpose and play no role in
        * the checkout process or in the storefront display of items. So you may organize your items as best serves
        * you. We're often asked why was use the word 'category' instead of 'folder'. We started down the road of
        * item management 27 years ago with the word 'category', and it's too much trouble to change. So items are
        * managed by categories, not folders. But they are folders. :)
        * The call takes two possible parameters:
        * 1) parentCategoryId: This is a number which uniquely identifies a category in our system. Not easy to determine.
        * 2) parentCategoryPath: This is the folder path you wish to retrieve, starting with a forward slash "/"
        * If you provide neither of these values, all items are returned.
        */

       ItemApi itemApi = new ItemApi(Constants.API_KEY);
       List<Item> items = new ArrayList<>();
       
       int iteration = 1;
       int offset = 0;
       int limit = 200;
       boolean moreRecordsToFetch = true;
       
       try {
           while (moreRecordsToFetch) {
               System.out.println("executing iteration " + iteration);
               
               List<Item> chunkOfItems = getItemChunk(itemApi, offset, limit);
               items.addAll(chunkOfItems);
               offset += limit;
               moreRecordsToFetch = chunkOfItems.size() == limit;
               iteration++;
           }
       } catch (ApiException e) {
           System.out.println("ApiException occurred on iteration " + iteration);
           e.printStackTrace();
           System.exit(1);
       }
       
       for (Item item : items) {
           System.out.println(item.toString());
       }
   }
   
   private static List<Item> getItemChunk(ItemApi itemApi, int offset, int limit) throws ApiException {
       // The real devil in the getItem calls is the expansion, making sure you return everything you need without
       // returning everything since these objects are extremely large.
       // These are the possible expansion values.
       /*
       accounting                      amember                     auto_order                      auto_order.steps
       ccbill                          channel_partner_mappings    chargeback                      checkout
       content                         content.assignments         content.attributes              content.multimedia
       content.multimedia.thumbnails   digital_delivery            ebay                            email_notifications
       enrollment123                   gift_certificate            google_product_search           kit_definition
       identifiers                     instant_payment_notifications   internal                    options
       payment_processing              physical                    pricing                         pricing.tiers
       realtime_pricing                related                     reporting                       restriction
       reviews                         salesforce                  shipping                        shipping.cases
       tax                             third_party_email_marketing variations                      wishlist_member
       shipping.destination_markups
       shipping.destination_restrictions
       shipping.distribution_centers
       shipping.methods
       shipping.package_requirements
       */
       String expand = "kit_definition,options,shipping,tax,variations"; // just some random ones. contact us if you're unsure
       
       Integer parentCategoryId = null;
       String parentCategoryPath = null;
       String since = null;
       String sort = null;
       
       ItemsResponse apiResponse = itemApi.getItems(parentCategoryId, parentCategoryPath, limit, offset, since,
           sort, expand, false);
       
       if (apiResponse.getItems() != null) {
           return apiResponse.getItems();
       }
       
       return new ArrayList<>();
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **parentCategoryId** | **Integer**| The parent category object id to retrieve items for.  Unspecified means all items on the account.  0 &#x3D; root | [optional] |
| **parentCategoryPath** | **String**| The parent category path to retrieve items for.  Unspecified means all items on the account.  / &#x3D; root | [optional] |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Default 100, Max 2000) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **since** | **String**| Fetch items that have been created/modified since this date/time. | [optional] |
| **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**ItemsResponse**](ItemsResponse.md)

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

<a name="getPricingTiers"></a>
# **getPricingTiers**
> PricingTiersResponse getPricingTiers(expand)

Retrieve pricing tiers

Retrieves the pricing tiers 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;

public class GetPricingTiers {
    /// <summary>
    /// Execute method containing all business logic
    /// </summary>
    public static void execute() {
        ItemApi itemApi = new ItemApi(Constants.API_KEY);

        try {
            /*
             * Possible expansion values for PricingTier object:
             * approval_notification
             * signup_notification
             */

            String expand = "approval_notification,signup_notification";
            PricingTiersResponse apiResponse = itemApi.getPricingTiers(expand);

            // Display pricing tiers
            for (PricingTier pricingTier : apiResponse.getPricingTiers()) {
                System.out.println(pricingTier);
            }

        } catch (Exception e) {
            System.out.println("Exception occurred.");
            System.out.println(e);
            System.exit(1);
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**PricingTiersResponse**](PricingTiersResponse.md)

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

<a name="getReview"></a>
# **getReview**
> ItemReviewResponse getReview(reviewOid, merchantItemOid)

Get a review

Retrieve an item review. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class GetReview {
   /// <summary>
   /// Execute method containing all business logic
   /// </summary>
   public static void execute() throws ApiException {
       /*
        * Retrieves a specific user review for an item. This would most likely be used by a merchant who has cached all
        * reviews on a separate site and then wishes to update a particular review. It's always best to "get" the object,
        * make changes to it, then call the update instead of trying to recreate the object from scratch.
        *
        * The merchant_item_oid is a unique identifier used by UltraCart. If you do not know your item's oid, call
        * ItemApi.GetItemByMerchantItemId() to retrieve the item, and then it's oid item.MerchantItemOid
        *
        * The review_oid is a unique identifier used by UltraCart. If you do not know a review's oid, call
        * ItemApi.GetReviews() to get all reviews where you can then grab the oid from an item.
        */

       ItemApi itemApi = new ItemApi(Constants.API_KEY);
       int merchantItemOid = 123456;
       int reviewOid = 987654;
       ItemReviewResponse apiResponse = itemApi.getReview(reviewOid, merchantItemOid);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.exit(1);
       }

       ItemReview review = apiResponse.getReview();

       System.out.println("<html lang=\"en\"><body><pre>");
       System.out.println(review.toString());
       System.out.println("</pre></body></html>");
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reviewOid** | **Integer**| The review oid to retrieve. | |
| **merchantItemOid** | **Integer**| The item oid the review is associated with. | |

### Return type

[**ItemReviewResponse**](ItemReviewResponse.md)

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

<a name="getReviews"></a>
# **getReviews**
> ItemReviewsResponse getReviews(merchantItemOid)

Get reviews for an item

Retrieve item reviews. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;
import java.util.List;

public class GetReviews {
   /// <summary>
   /// Execute method containing all business logic
   /// </summary>
   public static void execute() throws ApiException {
       /*
        * Retrieves all user reviews for an item.
        *
        * The merchant_item_oid is a unique identifier used by UltraCart. If you do not know your item's oid, call
        * ItemApi.GetItemByMerchantItemId() to retrieve the item, and then it's oid item.MerchantItemOid
        */

       ItemApi itemApi = new ItemApi(Constants.API_KEY);
       int merchantItemOid = 123456;
       ItemReviewsResponse apiResponse = itemApi.getReviews(merchantItemOid);

       if (apiResponse.getError() != null) {
           System.err.println(apiResponse.getError().getDeveloperMessage());
           System.err.println(apiResponse.getError().getUserMessage());
           System.exit(1);
       }

       List<ItemReview> reviews = apiResponse.getReviews();

       for (ItemReview review : reviews) {
           System.out.println(review.toString());
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantItemOid** | **Integer**| The item oid the review is associated with. | |

### Return type

[**ItemReviewsResponse**](ItemReviewsResponse.md)

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

<a name="getUnassociatedDigitalItems"></a>
# **getUnassociatedDigitalItems**
> ItemDigitalItemsResponse getUnassociatedDigitalItems(limit, offset, since, sort, expand, placeholders)

Retrieve digital items from the digital library (which are digital files that may be attached to normal items) not yet associated with actual items

Retrieves a group of digital items (file information) from the account that are not yet associated with any actual items.  If no parameters are specified, all digital items will be returned.  Be aware that these are not normal items that can be added to a shopping cart. Rather, they are digital files that may be associated with normal items.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;
import java.util.List;

public class GetUnassociatedDigitalItems {
   /// <summary>
   /// Execute method containing all business logic
   /// </summary>
   public static void execute() {
       try {
           /*
            * Please Note!
            * Digital Items are not normal items you sell on your site. They are digital files that you may add to
            * a library and then attach to a normal item as an accessory or the main item itself.
            * See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1376485/Digital+Items
            *
            * Retrieves a group of digital items (file information) from the account that are not yet associated with any
            * actual items. If no parameters are specified, all digital items will be returned. Be aware that these are
            * not normal items that can be added to a shopping cart. Rather, they are digital files that may be associated
            * with normal items. You will need to make multiple API calls in order to retrieve the entire result set since
            * this API performs result set pagination.
            *
            * Default sort order: original_filename
            * Possible sort orders: original_filename, description, file_size
            */

           int digitalItemOid = ItemFunctions.insertSampleDigitalItem(null); // create an item that will be unassociated.
           ItemApi itemApi = new ItemApi(Constants.API_KEY);

           int limit = 100;
           int offset = 0;
           String since = null; // digital items do not use since. leave as null.
           String sort = null; // if null, use default of original_filename
           String expand = null; // digital items have no expansion. leave as null. this value is ignored
           Boolean placeholders = null; // digital items have no placeholders. leave as null.

           ItemDigitalItemsResponse apiResponse = itemApi.getUnassociatedDigitalItems(limit, offset, since, sort, expand, placeholders);
           List<ItemDigitalItem> digitalItems = apiResponse.getDigitalItems(); // assuming this succeeded

           System.out.println("The following items were retrieved via GetUnassociatedDigitalItems():");
           for (ItemDigitalItem digitalItem : digitalItems) {
               System.out.println(digitalItem.toString());
           }
       }
       catch (Exception e) {
           System.out.println("An Exception occurred. Please review the following error:");
           System.out.println(e.toString()); // <-- change_me: handle gracefully
           System.exit(1);
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Default 100, Max 2000) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **since** | **String**| Fetch items that have been created/modified since this date/time. | [optional] |
| **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**ItemDigitalItemsResponse**](ItemDigitalItemsResponse.md)

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

<a name="insertDigitalItem"></a>
# **insertDigitalItem**
> ItemDigitalItemResponse insertDigitalItem(digitalItem)

Create a file within the digital library

Create a file within the digital library.  This does not create an item, but makes this digital file available and selectable as part (or all) of an item. 

### Example

```java
package item;

public class InsertDigitalItem {
   /// <summary>
   /// Execute method containing all business logic
   /// </summary>
   public static void execute() {
       try {
           int digitalItemOid = ItemFunctions.insertSampleDigitalItem(null);
           ItemFunctions.deleteSampleDigitalItem(digitalItemOid);
       }
       catch (Exception e) {
           System.out.println("An Exception occurred. Please review the following error:");
           System.out.println(e.toString()); // <-- change_me: handle gracefully
           System.exit(1);
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **digitalItem** | [**ItemDigitalItem**](ItemDigitalItem.md)| Digital item to create | |

### Return type

[**ItemDigitalItemResponse**](ItemDigitalItemResponse.md)

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

<a name="insertItem"></a>
# **insertItem**
> ItemResponse insertItem(item, expand, placeholders)

Create an item

Create a new item on the UltraCart account. 

### Example

```java
package item;

public class InsertItem {
   public static void execute() {
       try {
           String itemId = ItemFunctions.insertSampleItem();
           ItemFunctions.deleteSampleItem(itemId);
       }
       catch (Exception e) {
           System.out.println("An Exception occurred. Please review the following error:");
           System.out.println(e.toString()); // handle gracefully
           System.exit(1);
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **item** | [**Item**](Item.md)| Item to create | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**ItemResponse**](ItemResponse.md)

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

<a name="insertReview"></a>
# **insertReview**
> ItemReviewResponse insertReview(merchantItemOid, review)

Insert a review

Insert a item review. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import common.Constants;
import java.math.BigDecimal;

/// <summary>
/// Sample code for inserting a product review
/// </summary>
public class InsertReview {
   public static void execute() {
       try {
           // To insert a review, you'll need an item's OID (Object Identifier) first. So for this example, we create
           // a sample item first, then retrieve it by item id to fetch the item oid.

           System.out.println("<pre>");
           String itemId = ItemFunctions.insertSampleItem();
           System.out.println("</pre>");
           ItemApi itemApi = new ItemApi(Constants.API_KEY);

           String expand = "reviews"; // expand string is 'reviews' because we'll need to update the sample item's review template below.
           // list of expansions for item object: https://www.ultracart.com/api/#resource_item.html

           ItemResponse itemResponse = itemApi.getItemByMerchantItemId(itemId, expand, null);
           Item item = itemResponse.getItem();
           int itemOid = item.getMerchantItemOid();

           // The target item must have a review template associated before you may attach a review.
           // You may create a review template here:
           // https://secure.ultracart.com/merchant/item/review/reviewTemplateListLoad.do
           // We're using a review template from our development system and it will not work for you.
           // Once you have a review template, update your item either via our gui or the rest api.
           // GUI: secure.ultracart.com -> Home -> Items -> <your item> -> Edit -> Review tab
           // Since we're using a sample item we just created above (line 17), we'll update via the rest api.
           // The rest api requires the review template oid, which is found on the template screen (url on line 25 above)

           int reviewTemplateOid = 402;
           ItemReviews reviews = new ItemReviews();
           reviews.setReviewTemplateOid(reviewTemplateOid);
           item.setReviews(reviews);
           item = itemApi.updateItem(itemOid, item, expand, null).getItem();

           // You will need to know what your product review looks like.
           ItemReview review = new ItemReview();
           review.setTitle("Best Product Ever!");
           review.setReview("I loved this product. I bought it for my wife and she was so happy she cried. blah blah blah");
           review.setReviewedNickname("Bob420");
           review.setFeatured(true); // featured? sure. why not? this is a great review.
           review.setRatingName1("Durability");
           review.setRatingName2("Price");
           review.setRatingName3("Performance");
           review.setRatingName4("Appearance");
           review.setRatingScore1(new BigDecimal("4.5"));
           review.setRatingScore2(new BigDecimal("3.5"));
           review.setRatingScore3(new BigDecimal("2.5"));
           review.setRatingScore4(new BigDecimal("1.5"));
           review.setOverall(new BigDecimal("5.0")); // hooray!
           review.setReviewerLocation("Southside Chicago");
           review.setStatus(ItemReview.StatusEnum.APPROVED);
           // insert the review and update our local variable to see how the review looks now.
           review = itemApi.insertReview(itemOid, review).getReview();

           System.out.println("<br>This is my review object:<br><pre>");
           System.out.println(review.toString());
           System.out.println("</pre>");

           // This will clean up the sample item, but you may wish to review the item in the backend or on your website first.
           // ItemFunctions.deleteSampleItem(itemId);
       }
       catch (Exception e) {
           System.out.println("An Exception occurred. Please review the following error:");
           System.out.println(e.toString()); // handle gracefully
           System.exit(1);
       }
   }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantItemOid** | **Integer**| The item oid the review is associated with. | |
| **review** | [**ItemReview**](ItemReview.md)| Review to insert | |

### Return type

[**ItemReviewResponse**](ItemReviewResponse.md)

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

<a name="insertUpdateItemContentAttribute"></a>
# **insertUpdateItemContentAttribute**
> insertUpdateItemContentAttribute(merchantItemOid, itemAttribute)

Upsert an item content attribute

Update an item content attribute, creating it new if it does not yet exist. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class InsertUpdateItemContentAttribute {
    public static void execute() throws ApiException {
        /*
            While UltraCart provides a means for updating item content, it is StoreFront specific. This method allows for
            item-wide update of content, such as SEO fields. The content attribute has three fields:
            1) name
            2) value
            3) type: boolean,color,definitionlist,html,integer,mailinglist,multiline,rgba,simplelist,string,videolist

            The SEO content has the following names:
            Item Meta Title = "storefrontSEOTitle"
            Item Meta Description = "storefrontSEODescription"
            Item Meta Keywords = "storefrontSEOKeywords"

            The merchant_item_oid is a unique identifier used by UltraCart. If you do not know your item's oid, call
            ItemApi.GetItemByMerchantItemId() to retrieve the item, and then it's oid item.MerchantItemOid

            Success will return back a status code of 204 (No Content)
        */

        ItemApi itemApi = new ItemApi(Constants.API_KEY);
        int merchantItemOid = 12345;

        ItemContentAttribute attribute = new ItemContentAttribute();
        attribute.setName("storefrontSEOKeywords");
        attribute.setValue("dog,cat,fish");
        attribute.setType("string");

        itemApi.insertUpdateItemContentAttribute(merchantItemOid, attribute);
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantItemOid** | **Integer**| The item oid to modify. | |
| **itemAttribute** | [**ItemContentAttribute**](ItemContentAttribute.md)| Item content attribute to upsert | |

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

<a name="updateDigitalItem"></a>
# **updateDigitalItem**
> ItemDigitalItemResponse updateDigitalItem(digitalItemOid, digitalItem)

Updates a file within the digital library

Updates a file within the digital library.  This does not update an item, but updates a digital file available and selectable as part (or all) of an item. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.ItemDigitalItem;
import com.ultracart.admin.v2.models.ItemDigitalItemResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class UpdateDigitalItem {
   public static void execute() {
       try {
           int digitalItemOid = ItemFunctions.insertSampleDigitalItem(null);

           ItemApi itemApi = new ItemApi(Constants.API_KEY);
           ItemDigitalItemResponse apiResponse = itemApi.getDigitalItem(digitalItemOid);
           ItemDigitalItem digitalItem = apiResponse.getDigitalItem();

           digitalItem.setDescription("I have updated the description to this sentence.");
           digitalItem.setClickWrapAgreement("You hereby agree that the earth is round.  No debate.");

           itemApi.updateDigitalItem(digitalItemOid, digitalItem);

           ItemFunctions.deleteSampleDigitalItem(digitalItemOid);
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
| **digitalItemOid** | **Integer**| The digital item oid to update. | |
| **digitalItem** | [**ItemDigitalItem**](ItemDigitalItem.md)| Digital item to update | |

### Return type

[**ItemDigitalItemResponse**](ItemDigitalItemResponse.md)

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

<a name="updateItem"></a>
# **updateItem**
> ItemResponse updateItem(merchantItemOid, item, expand, placeholders)

Update an item

Update a new item on the UltraCart account. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.Item;
import com.ultracart.admin.v2.models.ItemPricing;
import com.ultracart.admin.v2.models.ItemResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;

public class UpdateItem {
   public static void execute() {
       try {
           String itemId = ItemFunctions.insertSampleItem();

           ItemApi itemApi = new ItemApi(Constants.API_KEY);

           // See one of the getItem or getItems samples for possible expansion values
           // See also: https://www.ultracart.com/api/#resource_item.html
           String expand = "pricing";
           ItemResponse apiResponse = itemApi.getItemByMerchantItemId(itemId, expand, false);
           Item item = apiResponse.getItem();
           BigDecimal originalPrice = item.getPricing().getCost();

           // update the price of the item.
           ItemPricing itemPricing = item.getPricing();
           itemPricing.setCost(BigDecimal.valueOf(12.99));

           apiResponse = itemApi.updateItem(item.getMerchantItemOid(), item, expand, false);
           Item updatedItem = apiResponse.getItem();

           // ensure the price was updated.
           System.out.println("Original Price: " + originalPrice);
           System.out.println("Updated Price: " + updatedItem.getPricing().getCost());

           ItemFunctions.deleteSampleItem(itemId);
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
| **merchantItemOid** | **Integer**| The item oid to update. | |
| **item** | [**Item**](Item.md)| Item to update | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**ItemResponse**](ItemResponse.md)

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

<a name="updateItems"></a>
# **updateItems**
> ItemsResponse updateItems(itemsRequest, expand, placeholders, async)

Update multiple items

Update multiple item on the UltraCart account. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.Item;
import com.ultracart.admin.v2.models.ItemResponse;
import com.ultracart.admin.v2.models.ItemsRequest;
import com.ultracart.admin.v2.models.ItemsResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.Arrays;

public class UpdateItems {
   public static void execute() {
       try {
           String itemId1 = ItemFunctions.insertSampleItem();
           String itemId2 = ItemFunctions.insertSampleItem();

           ItemApi itemApi = new ItemApi(Constants.API_KEY);

           // See one of the getItem or getItems samples for possible expansion values 
           // See also: https://www.ultracart.com/api/#resource_item.html
           String expand = "pricing";
           ItemResponse apiResponse = itemApi.getItemByMerchantItemId(itemId1, expand, false);
           Item item1 = apiResponse.getItem();
           apiResponse = itemApi.getItemByMerchantItemId(itemId2, expand, false);
           Item item2 = apiResponse.getItem();

           // update the price of the item.
           item1.getPricing().setCost(BigDecimal.valueOf(12.99));
           item2.getPricing().setCost(BigDecimal.valueOf(14.99));

           ItemsRequest updateItemsRequest = new ItemsRequest();
           updateItemsRequest.setItems(Arrays.asList(item1, item2));
           ItemsResponse updateItemsResponse = itemApi.updateItems(updateItemsRequest, expand, false, false);

           ItemFunctions.deleteSampleItem(itemId1);
           ItemFunctions.deleteSampleItem(itemId2);
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
| **itemsRequest** | [**ItemsRequest**](ItemsRequest.md)| Items to update (synchronous maximum 20 / asynchronous maximum 100) | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |
| **async** | **Boolean**| True if the operation should be run async.  No result returned | [optional] |

### Return type

[**ItemsResponse**](ItemsResponse.md)

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

<a name="updateReview"></a>
# **updateReview**
> ItemReviewResponse updateReview(reviewOid, merchantItemOid, review)

Update a review

Update an item review. 

### Example

```java
package item;

import com.ultracart.admin.v2.ItemApi;
import com.ultracart.admin.v2.models.ItemReview;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;

public class UpdateReview {
   public static void execute() {
       try {
           // To update a review, you'll need an item's OID (Object Identifier) and the review oid first.

           int merchantItemOid = 99998888; // if you don't know your oid, call GetItemByMerchantItemId() to get your item, then get the oid.
           int reviewOid = 123456; // this is the particular oid you wish to update.

           ItemApi itemApi = new ItemApi(Constants.API_KEY); // convenience function for getting an api handle.
           ItemReview review = itemApi.getReview(merchantItemOid, reviewOid).getReview();

           // You will need to know what your product review looks like.
           review.setTitle("Best Product Ever!");
           review.setReview("I loved this product.  I bought it for my wife and she was so happy she cried.  blah blah blah");
           review.setReviewedNickname("Bob420");
           review.setFeatured(true); // featured? sure. why not? this is a great review.
           review.setRatingName1("Durability");
           review.setRatingName2("Price");
           review.setRatingName3("Performance");
           review.setRatingName4("Appearance");
           review.setRatingScore1(BigDecimal.valueOf(4.5));
           review.setRatingScore2(BigDecimal.valueOf(3.5));
           review.setRatingScore3(BigDecimal.valueOf(2.5));
           review.setRatingScore4(BigDecimal.valueOf(1.5));
           review.setOverall(BigDecimal.valueOf(5.0)); // hooray!
           review.setReviewerLocation("Southside Chicago");
           review.setStatus(ItemReview.StatusEnum.APPROVED);
           // insert the review and update our local variable to see how the review looks now.
           review = itemApi.updateReview(reviewOid, merchantItemOid, review).getReview();

           System.out.println("This is my review object:");
           System.out.println(review);

           // This will clean up the sample item, but you may wish to review the item in the backend or on your website first.
           // DeleteSampleItem(itemId);
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
| **reviewOid** | **Integer**| The review oid to update. | |
| **merchantItemOid** | **Integer**| The item oid the review is associated with. | |
| **review** | [**ItemReview**](ItemReview.md)| Review to update | |

### Return type

[**ItemReviewResponse**](ItemReviewResponse.md)

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

<a name="uploadTemporaryMultimedia"></a>
# **uploadTemporaryMultimedia**
> TempMultimediaResponse uploadTemporaryMultimedia(_file)

Upload an image to the temporary multimedia.

Uploads an image and returns back meta information about the image as well as the identifier needed for the item update. 

### Example

```java
// This method is used internally by UltraCart.
// We don't envision a scenario where a merchant would ever need to call this.
// As such, we're not providing a sample for it.  If you can think of a use for this
// method, contact us, and we'll help you work through it.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **_file** | **File**| File to upload | |

### Return type

[**TempMultimediaResponse**](TempMultimediaResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
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

