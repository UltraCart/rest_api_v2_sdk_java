# ItemApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteItem**](ItemApi.md#deleteItem) | **DELETE** /item/items/{merchant_item_oid} | Delete an item
[**getItem**](ItemApi.md#getItem) | **GET** /item/items/{merchant_item_oid} | Retrieve an item
[**getItemByMerchantItemId**](ItemApi.md#getItemByMerchantItemId) | **GET** /item/items/merchant_item_id/{merchant_item_id} | Retrieve an item by item id
[**getItems**](ItemApi.md#getItems) | **GET** /item/items | Retrieve items
[**getPricingTiers**](ItemApi.md#getPricingTiers) | **GET** /item/pricing_tiers | Retrieve pricing tiers
[**insertItem**](ItemApi.md#insertItem) | **POST** /item/items | Create an item
[**updateItem**](ItemApi.md#updateItem) | **PUT** /item/items/{merchant_item_oid} | Update an item
[**updateItems**](ItemApi.md#updateItems) | **PUT** /item/items/batch | Update multiple items
[**uploadTemporaryMultimedia**](ItemApi.md#uploadTemporaryMultimedia) | **POST** /item/temp_multimedia | Upload an image to the temporary multimedia.


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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: ultraCartOauth
OAuth ultraCartOauth = (OAuth) defaultClient.getAuthentication("ultraCartOauth");
ultraCartOauth.setAccessToken("YOUR ACCESS TOKEN");

// Configure API key authorization: ultraCartSimpleApiKey
ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
ultraCartSimpleApiKey.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ultraCartSimpleApiKey.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
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

