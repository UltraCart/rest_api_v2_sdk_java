# ItemApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDigitalItem**](ItemApi.md#deleteDigitalItem) | **DELETE** /item/digital_library/{digital_item_oid} | Delete a digital item, which is a file within the digital library, not an actual merchant item
[**deleteItem**](ItemApi.md#deleteItem) | **DELETE** /item/items/{merchant_item_oid} | Delete an item
[**deleteReview**](ItemApi.md#deleteReview) | **DELETE** /item/items/{merchant_item_oid}/reviews/{review_oid} | Delete a review
[**getDigitalItem**](ItemApi.md#getDigitalItem) | **GET** /item/digital_library/{digital_item_oid} | Retrieve a digital item from the digital library, which are digital files that may be attached to normal items
[**getDigitalItems**](ItemApi.md#getDigitalItems) | **GET** /item/digital_library | Retrieve digital items from the digital library which are digital files that may be attached to normal items
[**getDigitalItemsByExternalId**](ItemApi.md#getDigitalItemsByExternalId) | **GET** /item/digital_library/by_external/{external_id} | Retrieves digital items from the digital library (which are digital files that may be attached to normal items) that having a matching external id
[**getInventorySnapshot**](ItemApi.md#getInventorySnapshot) | **GET** /item/items/inventory_snapshot | Retrieve a list of item inventories.  This method may be called once every 15 minutes.  More than that will result in a 429 response.
[**getItem**](ItemApi.md#getItem) | **GET** /item/items/{merchant_item_oid} | Retrieve an item
[**getItemByMerchantItemId**](ItemApi.md#getItemByMerchantItemId) | **GET** /item/items/merchant_item_id/{merchant_item_id} | Retrieve an item by item id
[**getItems**](ItemApi.md#getItems) | **GET** /item/items | Retrieve items
[**getPricingTiers**](ItemApi.md#getPricingTiers) | **GET** /item/pricing_tiers | Retrieve pricing tiers
[**getReview**](ItemApi.md#getReview) | **GET** /item/items/{merchant_item_oid}/reviews/{review_oid} | Get a review
[**getReviews**](ItemApi.md#getReviews) | **GET** /item/items/{merchant_item_oid}/reviews | Get reviews for an item
[**getUnassociatedDigitalItems**](ItemApi.md#getUnassociatedDigitalItems) | **GET** /item/digital_library/unassociated | Retrieve digital items from the digital library (which are digital files that may be attached to normal items) not yet associated with actual items
[**insertDigitalItem**](ItemApi.md#insertDigitalItem) | **POST** /item/digital_library | Create a file within the digital library
[**insertItem**](ItemApi.md#insertItem) | **POST** /item/items | Create an item
[**insertReview**](ItemApi.md#insertReview) | **POST** /item/items/{merchant_item_oid}/reviews | Insert a review
[**insertUpdateItemContentAttribute**](ItemApi.md#insertUpdateItemContentAttribute) | **POST** /item/items/{merchant_item_oid}/content/attributes | Upsert an item content attribute
[**updateDigitalItem**](ItemApi.md#updateDigitalItem) | **PUT** /item/digital_library/{digital_item_oid} | Updates a file within the digital library
[**updateItem**](ItemApi.md#updateItem) | **PUT** /item/items/{merchant_item_oid} | Update an item
[**updateItems**](ItemApi.md#updateItems) | **PUT** /item/items/batch | Update multiple items
[**updateReview**](ItemApi.md#updateReview) | **PUT** /item/items/{merchant_item_oid}/reviews/{review_oid} | Update a review
[**uploadTemporaryMultimedia**](ItemApi.md#uploadTemporaryMultimedia) | **POST** /item/temp_multimedia | Upload an image to the temporary multimedia.


<a name="deleteDigitalItem"></a>
# **deleteDigitalItem**
> deleteDigitalItem(digitalItemOid)

Delete a digital item, which is a file within the digital library, not an actual merchant item

Delete a digital item on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer digitalItemOid = 56; // Integer | The digital item oid to delete.
try {
    apiInstance.deleteDigitalItem(digitalItemOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#deleteDigitalItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **digitalItemOid** | **Integer**| The digital item oid to delete. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItem"></a>
# **deleteItem**
> deleteItem(merchantItemOid)

Delete an item

Delete an item on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer merchantItemOid = 56; // Integer | The item oid to delete.
try {
    apiInstance.deleteItem(merchantItemOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#deleteItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantItemOid** | **Integer**| The item oid to delete. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReview"></a>
# **deleteReview**
> deleteReview(reviewOid, merchantItemOid)

Delete a review

Delete an item review. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer reviewOid = 56; // Integer | The review oid to delete.
Integer merchantItemOid = 56; // Integer | The item oid the review is associated with.
try {
    apiInstance.deleteReview(reviewOid, merchantItemOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#deleteReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewOid** | **Integer**| The review oid to delete. |
 **merchantItemOid** | **Integer**| The item oid the review is associated with. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="getDigitalItem"></a>
# **getDigitalItem**
> ItemDigitalItemResponse getDigitalItem(digitalItemOid)

Retrieve a digital item from the digital library, which are digital files that may be attached to normal items

Retrieves a digital item (file information) from the account.  Be aware that these are not normal items that can be added to a shopping cart. Rather, they are digital files that may be associated with normal items. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer digitalItemOid = 56; // Integer | The digital item oid to retrieve.
try {
    ItemDigitalItemResponse result = apiInstance.getDigitalItem(digitalItemOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getDigitalItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **digitalItemOid** | **Integer**| The digital item oid to retrieve. |

### Return type

[**ItemDigitalItemResponse**](ItemDigitalItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDigitalItems"></a>
# **getDigitalItems**
> ItemDigitalItemsResponse getDigitalItems(limit, offset, since, sort, expand, placeholders)

Retrieve digital items from the digital library which are digital files that may be attached to normal items

Retrieves a group of digital items (file information) from the account.  If no parameters are specified, all digital items will be returned.  Be aware that these are not normal items that can be added to a shopping cart. Rather, they are digital files that may be associated with normal items.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Default 100, Max 2000)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch items that have been created/modified since this date/time.
String sort = "sort_example"; // String | The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    ItemDigitalItemsResponse result = apiInstance.getDigitalItems(limit, offset, since, sort, expand, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getDigitalItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Default 100, Max 2000) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch items that have been created/modified since this date/time. | [optional]
 **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**ItemDigitalItemsResponse**](ItemDigitalItemsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDigitalItemsByExternalId"></a>
# **getDigitalItemsByExternalId**
> ItemDigitalItemsResponse getDigitalItemsByExternalId(externalId)

Retrieves digital items from the digital library (which are digital files that may be attached to normal items) that having a matching external id

Retrieves digital items from the digital library (which are digital files that may be attached to normal items) that having a matching external id.  Be aware that these are not normal items that can be added to a shopping cart. Rather, they are digital files that may be associated with normal items. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

String externalId = "externalId_example"; // String | The external id to match against.
try {
    ItemDigitalItemsResponse result = apiInstance.getDigitalItemsByExternalId(externalId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getDigitalItemsByExternalId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **externalId** | **String**| The external id to match against. |

### Return type

[**ItemDigitalItemsResponse**](ItemDigitalItemsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInventorySnapshot"></a>
# **getInventorySnapshot**
> ItemInventorySnapshotResponse getInventorySnapshot()

Retrieve a list of item inventories.  This method may be called once every 15 minutes.  More than that will result in a 429 response.

Retrieve a list of item inventories.  This method may be called once every 15 minutes.  More than that will result in a 429 response. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

try {
    ItemInventorySnapshotResponse result = apiInstance.getInventorySnapshot();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getInventorySnapshot");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ItemInventorySnapshotResponse**](ItemInventorySnapshotResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getItem"></a>
# **getItem**
> ItemResponse getItem(merchantItemOid, expand, placeholders)

Retrieve an item

Retrieves a single item using the specified item oid. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer merchantItemOid = 56; // Integer | The item oid to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    ItemResponse result = apiInstance.getItem(merchantItemOid, expand, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantItemOid** | **Integer**| The item oid to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**ItemResponse**](ItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getItemByMerchantItemId"></a>
# **getItemByMerchantItemId**
> ItemResponse getItemByMerchantItemId(merchantItemId, expand, placeholders)

Retrieve an item by item id

Retrieves a single item using the specified item id. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

String merchantItemId = "merchantItemId_example"; // String | The item id to retrieve.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    ItemResponse result = apiInstance.getItemByMerchantItemId(merchantItemId, expand, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getItemByMerchantItemId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantItemId** | **String**| The item id to retrieve. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**ItemResponse**](ItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getItems"></a>
# **getItems**
> ItemsResponse getItems(parentCategoryId, parentCategoryPath, limit, offset, since, sort, expand, placeholders)

Retrieve items

Retrieves a group of items from the account.  If no parameters are specified, all items will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer parentCategoryId = 56; // Integer | The parent category object id to retrieve items for.  Unspecified means all items on the account.  0 = root
String parentCategoryPath = "parentCategoryPath_example"; // String | The parent category path to retrieve items for.  Unspecified means all items on the account.  / = root
Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Default 100, Max 2000)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch items that have been created/modified since this date/time.
String sort = "sort_example"; // String | The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    ItemsResponse result = apiInstance.getItems(parentCategoryId, parentCategoryPath, limit, offset, since, sort, expand, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentCategoryId** | **Integer**| The parent category object id to retrieve items for.  Unspecified means all items on the account.  0 &#x3D; root | [optional]
 **parentCategoryPath** | **String**| The parent category path to retrieve items for.  Unspecified means all items on the account.  / &#x3D; root | [optional]
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Default 100, Max 2000) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch items that have been created/modified since this date/time. | [optional]
 **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPricingTiers"></a>
# **getPricingTiers**
> PricingTiersResponse getPricingTiers(expand)

Retrieve pricing tiers

Retrieves the pricing tiers 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
try {
    PricingTiersResponse result = apiInstance.getPricingTiers(expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getPricingTiers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]

### Return type

[**PricingTiersResponse**](PricingTiersResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReview"></a>
# **getReview**
> ItemReviewResponse getReview(reviewOid, merchantItemOid)

Get a review

Retrieve an item review. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer reviewOid = 56; // Integer | The review oid to retrieve.
Integer merchantItemOid = 56; // Integer | The item oid the review is associated with.
try {
    ItemReviewResponse result = apiInstance.getReview(reviewOid, merchantItemOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reviewOid** | **Integer**| The review oid to retrieve. |
 **merchantItemOid** | **Integer**| The item oid the review is associated with. |

### Return type

[**ItemReviewResponse**](ItemReviewResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="getReviews"></a>
# **getReviews**
> ItemReviewsResponse getReviews(merchantItemOid)

Get reviews for an item

Retrieve item reviews. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer merchantItemOid = 56; // Integer | The item oid the review is associated with.
try {
    ItemReviewsResponse result = apiInstance.getReviews(merchantItemOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getReviews");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantItemOid** | **Integer**| The item oid the review is associated with. |

### Return type

[**ItemReviewsResponse**](ItemReviewsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="getUnassociatedDigitalItems"></a>
# **getUnassociatedDigitalItems**
> ItemDigitalItemsResponse getUnassociatedDigitalItems(limit, offset, since, sort, expand, placeholders)

Retrieve digital items from the digital library (which are digital files that may be attached to normal items) not yet associated with actual items

Retrieves a group of digital items (file information) from the account that are not yet associated with any actual items.  If no parameters are specified, all digital items will be returned.  Be aware that these are not normal items that can be added to a shopping cart. Rather, they are digital files that may be associated with normal items.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer limit = 100; // Integer | The maximum number of records to return on this one API call. (Default 100, Max 2000)
Integer offset = 0; // Integer | Pagination of the record set.  Offset is a zero based index.
String since = "since_example"; // String | Fetch items that have been created/modified since this date/time.
String sort = "sort_example"; // String | The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    ItemDigitalItemsResponse result = apiInstance.getUnassociatedDigitalItems(limit, offset, since, sort, expand, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getUnassociatedDigitalItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The maximum number of records to return on this one API call. (Default 100, Max 2000) | [optional] [default to 100]
 **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0]
 **since** | **String**| Fetch items that have been created/modified since this date/time. | [optional]
 **sort** | **String**| The sort order of the items.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional]
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**ItemDigitalItemsResponse**](ItemDigitalItemsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="insertDigitalItem"></a>
# **insertDigitalItem**
> ItemDigitalItemResponse insertDigitalItem(digitalItem)

Create a file within the digital library

Create a file within the digital library.  This does not create an item, but makes this digital file available and selectable as part (or all) of an item. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

ItemDigitalItem digitalItem = new ItemDigitalItem(); // ItemDigitalItem | Digital item to create
try {
    ItemDigitalItemResponse result = apiInstance.insertDigitalItem(digitalItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#insertDigitalItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **digitalItem** | [**ItemDigitalItem**](ItemDigitalItem.md)| Digital item to create |

### Return type

[**ItemDigitalItemResponse**](ItemDigitalItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="insertItem"></a>
# **insertItem**
> ItemResponse insertItem(item, expand, placeholders)

Create an item

Create a new item on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Item item = new Item(); // Item | Item to create
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    ItemResponse result = apiInstance.insertItem(item, expand, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#insertItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | [**Item**](Item.md)| Item to create |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**ItemResponse**](ItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="insertReview"></a>
# **insertReview**
> ItemReviewResponse insertReview(review, merchantItemOid)

Insert a review

Insert a item review. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

ItemReview review = new ItemReview(); // ItemReview | Review to insert
Integer merchantItemOid = 56; // Integer | The item oid the review is associated with.
try {
    ItemReviewResponse result = apiInstance.insertReview(review, merchantItemOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#insertReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **review** | [**ItemReview**](ItemReview.md)| Review to insert |
 **merchantItemOid** | **Integer**| The item oid the review is associated with. |

### Return type

[**ItemReviewResponse**](ItemReviewResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="insertUpdateItemContentAttribute"></a>
# **insertUpdateItemContentAttribute**
> insertUpdateItemContentAttribute(itemAttribute, merchantItemOid)

Upsert an item content attribute

Update an item content attribute, creating it new if it does not yet exist. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

ItemContentAttribute itemAttribute = new ItemContentAttribute(); // ItemContentAttribute | Item content attribute to upsert
Integer merchantItemOid = 56; // Integer | The item oid to modify.
try {
    apiInstance.insertUpdateItemContentAttribute(itemAttribute, merchantItemOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#insertUpdateItemContentAttribute");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemAttribute** | [**ItemContentAttribute**](ItemContentAttribute.md)| Item content attribute to upsert |
 **merchantItemOid** | **Integer**| The item oid to modify. |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateDigitalItem"></a>
# **updateDigitalItem**
> ItemDigitalItemResponse updateDigitalItem(digitalItemOid, digitalItem)

Updates a file within the digital library

Updates a file within the digital library.  This does not update an item, but updates a digital file available and selectable as part (or all) of an item. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Integer digitalItemOid = 56; // Integer | The digital item oid to update.
ItemDigitalItem digitalItem = new ItemDigitalItem(); // ItemDigitalItem | Digital item to update
try {
    ItemDigitalItemResponse result = apiInstance.updateDigitalItem(digitalItemOid, digitalItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#updateDigitalItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **digitalItemOid** | **Integer**| The digital item oid to update. |
 **digitalItem** | [**ItemDigitalItem**](ItemDigitalItem.md)| Digital item to update |

### Return type

[**ItemDigitalItemResponse**](ItemDigitalItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateItem"></a>
# **updateItem**
> ItemResponse updateItem(item, merchantItemOid, expand, placeholders)

Update an item

Update a new item on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

Item item = new Item(); // Item | Item to update
Integer merchantItemOid = 56; // Integer | The item oid to update.
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
try {
    ItemResponse result = apiInstance.updateItem(item, merchantItemOid, expand, placeholders);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#updateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | [**Item**](Item.md)| Item to update |
 **merchantItemOid** | **Integer**| The item oid to update. |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]

### Return type

[**ItemResponse**](ItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateItems"></a>
# **updateItems**
> ItemsResponse updateItems(itemsRequest, expand, placeholders, async)

Update multiple items

Update multiple item on the UltraCart account. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

ItemsRequest itemsRequest = new ItemsRequest(); // ItemsRequest | Items to update (synchronous maximum 20 / asynchronous maximum 100)
String expand = "expand_example"; // String | The object expansion to perform on the result.  See documentation for examples
Boolean placeholders = true; // Boolean | Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API.
Boolean async = true; // Boolean | True if the operation should be run async.  No result returned
try {
    ItemsResponse result = apiInstance.updateItems(itemsRequest, expand, placeholders, async);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#updateItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemsRequest** | [**ItemsRequest**](ItemsRequest.md)| Items to update (synchronous maximum 20 / asynchronous maximum 100) |
 **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional]
 **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional]
 **async** | **Boolean**| True if the operation should be run async.  No result returned | [optional]

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="updateReview"></a>
# **updateReview**
> ItemReviewResponse updateReview(review, reviewOid, merchantItemOid)

Update a review

Update an item review. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

ItemReview review = new ItemReview(); // ItemReview | Review to update
Integer reviewOid = 56; // Integer | The review oid to update.
Integer merchantItemOid = 56; // Integer | The item oid the review is associated with.
try {
    ItemReviewResponse result = apiInstance.updateReview(review, reviewOid, merchantItemOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#updateReview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **review** | [**ItemReview**](ItemReview.md)| Review to update |
 **reviewOid** | **Integer**| The review oid to update. |
 **merchantItemOid** | **Integer**| The item oid the review is associated with. |

### Return type

[**ItemReviewResponse**](ItemReviewResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json; charset=UTF-8
 - **Accept**: application/json

<a name="uploadTemporaryMultimedia"></a>
# **uploadTemporaryMultimedia**
> TempMultimediaResponse uploadTemporaryMultimedia(file)

Upload an image to the temporary multimedia.

Uploads an image and returns back meta information about the image as well as the identifier needed for the item update. 

### Example
```java
// Import classes:
//import com.ultracart.admin.v2.swagger.ApiClient;
//import com.ultracart.admin.v2.swagger.ApiException;
//import com.ultracart.admin.v2.swagger.Configuration;
//import com.ultracart.admin.v2.swagger.auth.*;
//import com.ultracart.admin.v2.ItemApi;

// Create a Simple Key: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/38688545/API+Simple+Key
final String apiKey = "109ee846ee69f50177018ab12f008a00748a25aa28dbdc0177018ab12f008a00";
ItemApi apiInstance = new ItemApi(apiKey);

File file = new File("/path/to/file.txt"); // File | File to upload
try {
    TempMultimediaResponse result = apiInstance.uploadTemporaryMultimedia(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#uploadTemporaryMultimedia");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| File to upload |

### Return type

[**TempMultimediaResponse**](TempMultimediaResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

