# ItemApi

All URIs are relative to *https://localhost/rest/admin/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemItemsGet**](ItemApi.md#itemItemsGet) | **GET** /item/items | Retrieve items
[**itemItemsMerchantItemOidDelete**](ItemApi.md#itemItemsMerchantItemOidDelete) | **DELETE** /item/items/{merchant_item_oid} | Delete an item
[**itemItemsMerchantItemOidGet**](ItemApi.md#itemItemsMerchantItemOidGet) | **GET** /item/items/{merchant_item_oid} | Retrieve an item
[**itemItemsMerchantItemOidPut**](ItemApi.md#itemItemsMerchantItemOidPut) | **PUT** /item/items/{merchant_item_oid} | Update an item
[**itemItemsPost**](ItemApi.md#itemItemsPost) | **POST** /item/items | Create an item
[**itemTempMultimediaPost**](ItemApi.md#itemTempMultimediaPost) | **POST** /item/temp_multimedia | Upload an image to the temporary multimedia.


<a name="itemItemsGet"></a>
# **itemItemsGet**
> ItemsResponse itemItemsGet(parentCategoryId)

Retrieve items

Retrieves a group of items from the account.  If no parameters are specified, all items will be returned. 

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
Integer parentCategoryId = 56; // Integer | The parent category to retrieve items for.  Unspecified means all items on the account.  0 = root
try {
    ItemsResponse result = apiInstance.itemItemsGet(parentCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemItemsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentCategoryId** | **Integer**| The parent category to retrieve items for.  Unspecified means all items on the account.  0 &#x3D; root | [optional]

### Return type

[**ItemsResponse**](ItemsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="itemItemsMerchantItemOidDelete"></a>
# **itemItemsMerchantItemOidDelete**
> itemItemsMerchantItemOidDelete(merchantItemOid)

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
    apiInstance.itemItemsMerchantItemOidDelete(merchantItemOid);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemItemsMerchantItemOidDelete");
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

<a name="itemItemsMerchantItemOidGet"></a>
# **itemItemsMerchantItemOidGet**
> ItemResponse itemItemsMerchantItemOidGet(merchantItemOid)

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
try {
    ItemResponse result = apiInstance.itemItemsMerchantItemOidGet(merchantItemOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemItemsMerchantItemOidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantItemOid** | **Integer**| The item oid to retrieve. |

### Return type

[**ItemResponse**](ItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="itemItemsMerchantItemOidPut"></a>
# **itemItemsMerchantItemOidPut**
> ItemResponse itemItemsMerchantItemOidPut(item, merchantItemOid)

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
Item item = new Item(); // Item | Item to create
Integer merchantItemOid = 56; // Integer | The item oid to update.
try {
    ItemResponse result = apiInstance.itemItemsMerchantItemOidPut(item, merchantItemOid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemItemsMerchantItemOidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | [**Item**](Item.md)| Item to create |
 **merchantItemOid** | **Integer**| The item oid to update. |

### Return type

[**ItemResponse**](ItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="itemItemsPost"></a>
# **itemItemsPost**
> ItemResponse itemItemsPost(item)

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
try {
    ItemResponse result = apiInstance.itemItemsPost(item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemItemsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **item** | [**Item**](Item.md)| Item to create |

### Return type

[**ItemResponse**](ItemResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="itemTempMultimediaPost"></a>
# **itemTempMultimediaPost**
> TempMultimediaResponse itemTempMultimediaPost(file)

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
    TempMultimediaResponse result = apiInstance.itemTempMultimediaPost(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#itemTempMultimediaPost");
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

