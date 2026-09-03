# SfvbApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**compileSfvbCjson**](SfvbApi.md#compileSfvbCjson) | **POST** /sfvb/cjson/compile | Compile CJSON to Velocity |
| [**createSfvbPreviewSession**](SfvbApi.md#createSfvbPreviewSession) | **POST** /sfvb/storefronts/{storefront_oid}/preview_sessions | Create a preview session |
| [**deleteSfvbFile**](SfvbApi.md#deleteSfvbFile) | **DELETE** /sfvb/storefronts/{storefront_oid}/files | Delete a storefront file |
| [**deleteSfvbPreviewSession**](SfvbApi.md#deleteSfvbPreviewSession) | **DELETE** /sfvb/storefronts/{storefront_oid}/preview_sessions/{preview_session_id} | Delete a preview session |
| [**downloadSfvbFile**](SfvbApi.md#downloadSfvbFile) | **GET** /sfvb/storefronts/{storefront_oid}/files/download | Read a storefront file&#39;s raw bytes |
| [**duplicateSfvbTheme**](SfvbApi.md#duplicateSfvbTheme) | **POST** /sfvb/storefronts/{storefront_oid}/themes/{theme_oid}/duplicate | Duplicate a theme |
| [**getSfvbCjsonUsedElements**](SfvbApi.md#getSfvbCjsonUsedElements) | **POST** /sfvb/cjson/elements | Element types used by a container |
| [**getSfvbContainer**](SfvbApi.md#getSfvbContainer) | **GET** /sfvb/storefronts/{storefront_oid}/containers/{owner_type}/{owner_object_id} | Read a container stored outside the file system |
| [**getSfvbContainerVersion**](SfvbApi.md#getSfvbContainerVersion) | **GET** /sfvb/storefronts/{storefront_oid}/container_versions/{container_history_oid} | Read the CJSON stored in one container history entry |
| [**getSfvbElement**](SfvbApi.md#getSfvbElement) | **GET** /sfvb/elements/{element_type} | Configuration schema for one element type |
| [**getSfvbFileContent**](SfvbApi.md#getSfvbFileContent) | **GET** /sfvb/storefronts/{storefront_oid}/files/content | Read a storefront file |
| [**getSfvbFileUploadUrl**](SfvbApi.md#getSfvbFileUploadUrl) | **GET** /sfvb/storefronts/{storefront_oid}/files/upload_url/{extension} | Get a URL to upload a binary asset to |
| [**getSfvbLibraryEntry**](SfvbApi.md#getSfvbLibraryEntry) | **GET** /sfvb/storefronts/{storefront_oid}/library/{library_oid} | Read one library entry including its CJSON |
| [**getSfvbPreviewUrl**](SfvbApi.md#getSfvbPreviewUrl) | **GET** /sfvb/storefronts/{storefront_oid}/preview_sessions/{preview_session_id}/url | URL that renders a preview session |
| [**getSfvbTheme**](SfvbApi.md#getSfvbTheme) | **GET** /sfvb/storefronts/{storefront_oid}/themes/{theme_oid} | Get a theme |
| [**getSfvbThemeJob**](SfvbApi.md#getSfvbThemeJob) | **GET** /sfvb/storefronts/{storefront_oid}/theme_jobs/{job_id} | Status of an asynchronous theme job |
| [**getSfvbVersion**](SfvbApi.md#getSfvbVersion) | **GET** /sfvb/version | Compiler version for this merchant |
| [**getSfvbWhoami**](SfvbApi.md#getSfvbWhoami) | **GET** /sfvb/whoami | Who this token is |
| [**installSfvbLibraryEntry**](SfvbApi.md#installSfvbLibraryEntry) | **POST** /sfvb/storefronts/{storefront_oid}/library/{library_oid}/install | Install a library entry into a storefront |
| [**listSfvbContainerVersions**](SfvbApi.md#listSfvbContainerVersions) | **GET** /sfvb/storefronts/{storefront_oid}/container_versions | Version history for a container stored outside the file system |
| [**listSfvbElements**](SfvbApi.md#listSfvbElements) | **GET** /sfvb/elements | List every SFVB element type |
| [**listSfvbFileVersions**](SfvbApi.md#listSfvbFileVersions) | **GET** /sfvb/storefronts/{storefront_oid}/files/versions | Version history for a storefront file |
| [**listSfvbFiles**](SfvbApi.md#listSfvbFiles) | **GET** /sfvb/storefronts/{storefront_oid}/files | List a storefront directory |
| [**listSfvbStorefronts**](SfvbApi.md#listSfvbStorefronts) | **GET** /sfvb/storefronts | List storefronts |
| [**listSfvbThemes**](SfvbApi.md#listSfvbThemes) | **GET** /sfvb/storefronts/{storefront_oid}/themes | List themes for a storefront |
| [**listSfvbUpsellOffers**](SfvbApi.md#listSfvbUpsellOffers) | **GET** /sfvb/storefronts/{storefront_oid}/upsell_offers | List upsell offers |
| [**putSfvbContainer**](SfvbApi.md#putSfvbContainer) | **PUT** /sfvb/storefronts/{storefront_oid}/containers/{owner_type}/{owner_object_id} | Write a container stored outside the file system |
| [**putSfvbFileContent**](SfvbApi.md#putSfvbFileContent) | **PUT** /sfvb/storefronts/{storefront_oid}/files/content | Write a storefront file |
| [**putSfvbPreviewSession**](SfvbApi.md#putSfvbPreviewSession) | **PUT** /sfvb/storefronts/{storefront_oid}/preview_sessions/{preview_session_id} | Push containers into a preview session |
| [**renderSfvbWidgets**](SfvbApi.md#renderSfvbWidgets) | **POST** /sfvb/storefronts/{storefront_oid}/themes/{theme_oid}/render | Render a CJSON node to HTML |
| [**reserveSfvbWidgetIds**](SfvbApi.md#reserveSfvbWidgetIds) | **POST** /sfvb/storefronts/{storefront_oid}/widget_ids | Reserve a block of widget ids |
| [**revertSfvbContainer**](SfvbApi.md#revertSfvbContainer) | **POST** /sfvb/storefronts/{storefront_oid}/containers/{owner_type}/{owner_object_id}/revert | Revert a container stored outside the file system |
| [**revertSfvbFile**](SfvbApi.md#revertSfvbFile) | **POST** /sfvb/storefronts/{storefront_oid}/files/revert | Revert a storefront file to an earlier version |
| [**searchSfvbFiles**](SfvbApi.md#searchSfvbFiles) | **POST** /sfvb/storefronts/{storefront_oid}/files/search | Search storefront files |
| [**searchSfvbLibrary**](SfvbApi.md#searchSfvbLibrary) | **GET** /sfvb/storefronts/{storefront_oid}/library | Search the element library |
| [**uploadSfvbFile**](SfvbApi.md#uploadSfvbFile) | **POST** /sfvb/storefronts/{storefront_oid}/files/upload | Store a binary asset that was already uploaded |
| [**validateSfvbCjson**](SfvbApi.md#validateSfvbCjson) | **POST** /sfvb/cjson/validate | Validate CJSON |
| [**validateSfvbVelocity**](SfvbApi.md#validateSfvbVelocity) | **POST** /sfvb/storefronts/{storefront_oid}/themes/{theme_oid}/velocity/validate | Validate a Velocity template against a theme |


<a name="compileSfvbCjson"></a>
# **compileSfvbCjson**
> SfvbCompileResponse compileSfvbCjson(compileRequest)

Compile CJSON to Velocity

Compiles a container document to Velocity without storing anything.  Supply theme_oid to compile with the theme&#39;s inherit groups applied; omit it to compile standalone. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **compileRequest** | [**SfvbCompileRequest**](SfvbCompileRequest.md)| CJSON to compile | |

### Return type

[**SfvbCompileResponse**](SfvbCompileResponse.md)

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
| **413** |  |  -  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="createSfvbPreviewSession"></a>
# **createSfvbPreviewSession**
> SfvbPreviewSessionResponse createSfvbPreviewSession(storefrontOid)

Create a preview session

Returns a server generated session id to push containers into.  The id is not caller supplied, because concurrent agents choosing their own would be free to collide, and the browser editor&#39;s habit of minting one with Math.random is not a property worth carrying into an API.  Expires after eight hours and can be deleted sooner.  Requires a token that resolves to a user, so use the device authorization flow. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |

### Return type

[**SfvbPreviewSessionResponse**](SfvbPreviewSessionResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="deleteSfvbFile"></a>
# **deleteSfvbFile**
> deleteSfvbFile(storefrontOid, ifMatch, path)

Delete a storefront file

Recoverable from the recycle bin. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **ifMatch** | **String**| Content hash of the file being deleted.  Required; 428 when absent, 412 when stale. | |
| **path** | **String**|  | [optional] |

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="deleteSfvbPreviewSession"></a>
# **deleteSfvbPreviewSession**
> deleteSfvbPreviewSession(storefrontOid, previewSessionId)

Delete a preview session

Releases the session before its eight hour expiry.  Without this the only way to free one is to wait, which is a poor answer for a tool that may open a dozen in an afternoon. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **previewSessionId** | **String**|  | |

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="downloadSfvbFile"></a>
# **downloadSfvbFile**
> downloadSfvbFile(storefrontOid, path)

Read a storefront file&#39;s raw bytes

Returns the file itself rather than a JSON envelope, for any type including binaries that files/content refuses.  Use this to verify what you uploaded, and note it is the only way to read a file inside a theme that is not active - such a file is served to nobody until the theme is promoted, so it has no public URL to fetch instead.  On success the body is the file; on failure it is the usual JSON error object, so do not assume the content type without checking the status. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **path** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="duplicateSfvbTheme"></a>
# **duplicateSfvbTheme**
> SfvbThemeJobResponse duplicateSfvbTheme(storefrontOid, themeOid, duplicateRequest)

Duplicate a theme

Copies a theme into a new one and returns a job handle to poll.  Asynchronous, because copying a theme copies every file in it.  Needs sfvb_write rather than sfvb_publish, because the job explicitly does not activate what it creates, so the worst outcome of a mistaken call is a spare theme.  This is how you get somewhere safe to work - duplicate, edit the copy with an ordinary write scope, and let a human promote it. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **themeOid** | **Integer**|  | |
| **duplicateRequest** | [**SfvbThemeDuplicateRequest**](SfvbThemeDuplicateRequest.md)| Theme duplication details | |

### Return type

[**SfvbThemeJobResponse**](SfvbThemeJobResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **412** |  |  -  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbCjsonUsedElements"></a>
# **getSfvbCjsonUsedElements**
> SfvbElementsResponse getSfvbCjsonUsedElements(compileRequest)

Element types used by a container

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **compileRequest** | [**SfvbCompileRequest**](SfvbCompileRequest.md)| CJSON to inspect | |

### Return type

[**SfvbElementsResponse**](SfvbElementsResponse.md)

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
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbContainer"></a>
# **getSfvbContainer**
> SfvbContainerResponse getSfvbContainer(storefrontOid, ownerType, ownerObjectId, containerName)

Read a container stored outside the file system

owner_type is one of upsell, email, postcardfront, postcardback or item.  Item containers also require container_name.  Theme and page containers are files; read those through files/content. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **ownerType** | **String**|  | |
| **ownerObjectId** | **String**|  | |
| **containerName** | **String**|  | [optional] |

### Return type

[**SfvbContainerResponse**](SfvbContainerResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbContainerVersion"></a>
# **getSfvbContainerVersion**
> SfvbContainerVersion getSfvbContainerVersion(storefrontOid, containerHistoryOid, ownerType, ownerObjectId, containerName)

Read the CJSON stored in one container history entry

Inspect or diff an earlier version without reverting to it.  The version is addressed through the container that owns it, so a history oid belonging to some other resource cannot be read through this route. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **containerHistoryOid** | **Integer**|  | |
| **ownerType** | **String**|  | [optional] |
| **ownerObjectId** | **String**|  | [optional] |
| **containerName** | **String**|  | [optional] |

### Return type

[**SfvbContainerVersion**](SfvbContainerVersion.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbElement"></a>
# **getSfvbElement**
> SfvbElementSchemaResponse getSfvbElement(elementType)

Configuration schema for one element type

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **elementType** | **String**|  | |

### Return type

[**SfvbElementSchemaResponse**](SfvbElementSchemaResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbFileContent"></a>
# **getSfvbFileContent**
> SfvbFileContentResponse getSfvbFileContent(storefrontOid, path, version)

Read a storefront file

Returns the current content, or an earlier version when version is supplied.  Send the body&#39;s hash_sha256 back as If-Match when writing.  The ETag header carries the same hash, but a compressing proxy may append a suffix such as -gzip to it, so prefer the body value. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **path** | **String**|  | [optional] |
| **version** | **Integer**|  | [optional] |

### Return type

[**SfvbFileContentResponse**](SfvbFileContentResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **413** |  |  -  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbFileUploadUrl"></a>
# **getSfvbFileUploadUrl**
> SfvbFileUploadUrlResponse getSfvbFileUploadUrl(storefrontOid, extension)

Get a URL to upload a binary asset to

Binary content does not travel through this API as JSON, so uploading an image, font, video or PDF is two steps.  Ask here for a URL, PUT the raw bytes straight to it, then call uploadSfvbFile quoting the key you were given.  The bytes never pass through the API server.  The extension is checked against the accepted type list before a URL is issued, so an unsupported type fails here rather than after you have sent the file.  The URL is short lived and the key is bound to your account. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **extension** | **String**|  | |

### Return type

[**SfvbFileUploadUrlResponse**](SfvbFileUploadUrlResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbLibraryEntry"></a>
# **getSfvbLibraryEntry**
> SfvbLibraryEntry getSfvbLibraryEntry(storefrontOid, libraryOid)

Read one library entry including its CJSON

Returns the fragment as authored.  If it references images or other storefront files those paths will not resolve on this storefront until the entry is installed, so use install rather than this when the intent is to place the fragment. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **libraryOid** | **Integer**|  | |

### Return type

[**SfvbLibraryEntry**](SfvbLibraryEntry.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbPreviewUrl"></a>
# **getSfvbPreviewUrl**
> SfvbPreviewUrlResponse getSfvbPreviewUrl(storefrontOid, previewSessionId, path)

URL that renders a preview session

Refuses a session that does not exist, so a URL you receive is for a session that was really there.  expires_in_seconds is the time actually remaining, not the configured lifetime.  Needs a token that resolves to a user, because a preview session belongs to the person who created it. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **previewSessionId** | **String**|  | |
| **path** | **String**|  | [optional] |

### Return type

[**SfvbPreviewUrlResponse**](SfvbPreviewUrlResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbTheme"></a>
# **getSfvbTheme**
> SfvbTheme getSfvbTheme(storefrontOid, themeOid)

Get a theme

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **themeOid** | **Integer**|  | |

### Return type

[**SfvbTheme**](SfvbTheme.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbThemeJob"></a>
# **getSfvbThemeJob**
> SfvbThemeJobResponse getSfvbThemeJob(storefrontOid, jobId)

Status of an asynchronous theme job

Poll until complete is true, then check success.  Note that the new theme&#39;s oid is not returned.  The job&#39;s product is a plain text report rather than a structured result, so once it completes, list themes and match on the target_path the start call gave you. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **jobId** | **Integer**|  | |

### Return type

[**SfvbThemeJobResponse**](SfvbThemeJobResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbVersion"></a>
# **getSfvbVersion**
> SfvbVersionResponse getSfvbVersion()

Compiler version for this merchant

The visual builder release channel is per merchant, so a CLI holding cached schema or element data should compare against this to know when it has gone stale. 

### Example


(No example for this operation).


### Parameters
This endpoint does not need any parameter.

### Return type

[**SfvbVersionResponse**](SfvbVersionResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="getSfvbWhoami"></a>
# **getSfvbWhoami**
> SfvbWhoamiResponse getSfvbWhoami()

Who this token is

Returns the merchant, user, granted scopes and reachable storefronts for the calling token.  Declared for any scope so an application can always discover which account it is connected to. 

### Example


(No example for this operation).


### Parameters
This endpoint does not need any parameter.

### Return type

[**SfvbWhoamiResponse**](SfvbWhoamiResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="installSfvbLibraryEntry"></a>
# **installSfvbLibraryEntry**
> SfvbLibraryEntry installSfvbLibraryEntry(storefrontOid, libraryOid)

Install a library entry into a storefront

Copies the fragment&#39;s referenced assets into the storefront file system and returns the CJSON with its paths resolved, ready to place.  This writes, which is why it is a POST rather than the GET the internal admin endpoint uses.  It also requires sfvb_publish, because the assets land in the shared storefront file system, which is served to shoppers regardless of which theme is active, so no amount of working inside a duplicate theme isolates them. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **libraryOid** | **Integer**|  | |

### Return type

[**SfvbLibraryEntry**](SfvbLibraryEntry.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="listSfvbContainerVersions"></a>
# **listSfvbContainerVersions**
> SfvbContainerVersionsResponse listSfvbContainerVersions(storefrontOid, ownerType, ownerObjectId, containerName)

Version history for a container stored outside the file system

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **ownerType** | **String**|  | [optional] |
| **ownerObjectId** | **String**|  | [optional] |
| **containerName** | **String**|  | [optional] |

### Return type

[**SfvbContainerVersionsResponse**](SfvbContainerVersionsResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="listSfvbElements"></a>
# **listSfvbElements**
> SfvbElementsResponse listSfvbElements()

List every SFVB element type

The authoritative vocabulary, taken from the same lookup the compiler uses.  A type absent from this list compiles to a literal placeholder line in the page rather than failing, which is why validation treats an unknown type as an error. 

### Example


(No example for this operation).


### Parameters
This endpoint does not need any parameter.

### Return type

[**SfvbElementsResponse**](SfvbElementsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="listSfvbFileVersions"></a>
# **listSfvbFileVersions**
> SfvbFileVersionsResponse listSfvbFileVersions(storefrontOid, path)

Version history for a storefront file

Version history is the undo for anything in the storefront file system, which is what makes an agent&#39;s writes recoverable. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **path** | **String**|  | [optional] |

### Return type

[**SfvbFileVersionsResponse**](SfvbFileVersionsResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="listSfvbFiles"></a>
# **listSfvbFiles**
> SfvbFilesResponse listSfvbFiles(storefrontOid, path, storefrontFsDirectoryOid, themeOid, maxEntries)

List a storefront directory

Directories first, then files, each sorted by name.  Address by path or by directory oid; supplying theme_oid also retries a path that does not resolve at the storefront root relative to that theme, so /theme/css/ works without knowing the theme&#39;s directory name.  Each file carries its content hash, so a listing is enough to start an If-Match write without a separate read. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **path** | **String**|  | [optional] |
| **storefrontFsDirectoryOid** | **Integer**|  | [optional] |
| **themeOid** | **Integer**|  | [optional] |
| **maxEntries** | **Integer**|  | [optional] |

### Return type

[**SfvbFilesResponse**](SfvbFilesResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="listSfvbStorefronts"></a>
# **listSfvbStorefronts**
> SfvbStorefrontsResponse listSfvbStorefronts()

List storefronts

### Example


(No example for this operation).


### Parameters
This endpoint does not need any parameter.

### Return type

[**SfvbStorefrontsResponse**](SfvbStorefrontsResponse.md)

### Authorization

[ultraCartOauth](../README.md#ultraCartOauth), [ultraCartSimpleApiKey](../README.md#ultraCartSimpleApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="listSfvbThemes"></a>
# **listSfvbThemes**
> SfvbThemesResponse listSfvbThemes(storefrontOid)

List themes for a storefront

Exactly one theme is flagged active.  Writing to the active theme is writing live and requires the sfvb_publish scope. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |

### Return type

[**SfvbThemesResponse**](SfvbThemesResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="listSfvbUpsellOffers"></a>
# **listSfvbUpsellOffers**
> SfvbUpsellOffersResponse listSfvbUpsellOffers(storefrontOid)

List upsell offers

Without container JSON, so the funnel can be surveyed cheaply.  A large container size alongside a small element count is the signature of markup pasted into a single html element. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |

### Return type

[**SfvbUpsellOffersResponse**](SfvbUpsellOffersResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="putSfvbContainer"></a>
# **putSfvbContainer**
> SfvbContainerResponse putSfvbContainer(storefrontOid, ownerType, ownerObjectId, ifMatch, containerWriteRequest, containerName)

Write a container stored outside the file system

Validation is mandatory and runs here regardless of whether the caller validated first.  The previous value is snapshotted before the write, so the change can be reverted.  Side effects the visual builder performs on save, such as upsell screenshot regeneration and email content review flagging, are applied too. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **ownerType** | **String**|  | |
| **ownerObjectId** | **String**|  | |
| **ifMatch** | **String**| CJSON hash from the last read.  Required; 428 when absent, 412 when stale. | |
| **containerWriteRequest** | [**SfvbContainerWriteRequest**](SfvbContainerWriteRequest.md)| Container CJSON to write | |
| **containerName** | **String**|  | [optional] |

### Return type

[**SfvbContainerResponse**](SfvbContainerResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **412** |  |  -  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="putSfvbFileContent"></a>
# **putSfvbFileContent**
> SfvbFileWriteResponse putSfvbFileContent(storefrontOid, ifMatch, fileWriteRequest, path)

Write a storefront file

Runs the template sandbox, Velocity validation and the internationalization check, records a version, and compiles the sibling .vm when the file is a .cjson under a theme.  Send If-Match with the hash from the last read to avoid clobbering a concurrent change.  Writing into the active theme requires sfvb_publish. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **ifMatch** | **String**| Content hash from the last read.  Required; 428 when absent, 412 when stale. | |
| **fileWriteRequest** | [**SfvbFileWriteRequest**](SfvbFileWriteRequest.md)| File content to write | |
| **path** | **String**|  | [optional] |

### Return type

[**SfvbFileWriteResponse**](SfvbFileWriteResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **412** |  |  -  |
| **413** |  |  -  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="putSfvbPreviewSession"></a>
# **putSfvbPreviewSession**
> SfvbPreviewSessionResponse putSfvbPreviewSession(storefrontOid, previewSessionId, previewSession, themeOid)

Push containers into a preview session

Stores compiled containers against a session created by createSfvbPreviewSession.  Replaces whatever the session held.  Nothing durable is written.  Requires a token that resolves to a user, so use the device authorization flow. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **previewSessionId** | **String**|  | |
| **previewSession** | [**SfvbPreviewSessionRequest**](SfvbPreviewSessionRequest.md)| Containers to stage in the preview session | |
| **themeOid** | **Integer**|  | [optional] |

### Return type

[**SfvbPreviewSessionResponse**](SfvbPreviewSessionResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="renderSfvbWidgets"></a>
# **renderSfvbWidgets**
> SfvbRenderResponse renderSfvbWidgets(storefrontOid, themeOid, renderRequest)

Render a CJSON node to HTML

Renders one node in the context of a theme and a page.  Unlike compile this is stateful.  Rendering resolves merchant data, so an element bound to an item renders wrongly, and silently, without a context item id.  One node per call, so a node that fails to render fails on its own rather than taking a batch with it, and a failure says why. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **themeOid** | **Integer**|  | |
| **renderRequest** | [**SfvbRenderRequest**](SfvbRenderRequest.md)| Widgets to render | |

### Return type

[**SfvbRenderResponse**](SfvbRenderResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="reserveSfvbWidgetIds"></a>
# **reserveSfvbWidgetIds**
> SfvbWidgetIdsResponse reserveSfvbWidgetIds(storefrontOid, count)

Reserve a block of widget ids

Widget ids are allocated by the server, not invented by the caller.  Reserve a block, then form ids as elementType-number.  This is the single most likely thing to get wrong on a first write.  A POST rather than a GET because it consumes a sequence.  A GET that mutates will eventually be prefetched, retried or cached by something that assumed it was safe. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **count** | **Integer**|  | [optional] |

### Return type

[**SfvbWidgetIdsResponse**](SfvbWidgetIdsResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="revertSfvbContainer"></a>
# **revertSfvbContainer**
> SfvbContainerResponse revertSfvbContainer(storefrontOid, ownerType, ownerObjectId, ifMatch, containerRevertRequest, containerName)

Revert a container stored outside the file system

The restore is itself snapshotted, so a revert can be undone in turn.  Reverting to an entry recorded before the container existed removes it again.  Addressed through the owning container and guarded by If-Match, because a revert overwrites live content just as much as an ordinary write does. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **ownerType** | **String**|  | |
| **ownerObjectId** | **String**|  | |
| **ifMatch** | **String**| CJSON hash of the container being reverted.  Required; 428 when absent, 412 when stale. | |
| **containerRevertRequest** | [**SfvbContainerRevertRequest**](SfvbContainerRevertRequest.md)| Version to revert the container to | |
| **containerName** | **String**|  | [optional] |

### Return type

[**SfvbContainerResponse**](SfvbContainerResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **412** |  |  -  |
| **428** |  |  -  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="revertSfvbFile"></a>
# **revertSfvbFile**
> SfvbFileWriteResponse revertSfvbFile(storefrontOid, ifMatch, fileRevertRequest)

Revert a storefront file to an earlier version

The revert lands as a new version, so it is itself undoable. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **ifMatch** | **String**| Content hash of the file being reverted.  Required; 428 when absent, 412 when stale. | |
| **fileRevertRequest** | [**SfvbFileRevertRequest**](SfvbFileRevertRequest.md)| Version to revert the file to | |

### Return type

[**SfvbFileWriteResponse**](SfvbFileWriteResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="searchSfvbFiles"></a>
# **searchSfvbFiles**
> SfvbFileSearchResponse searchSfvbFiles(storefrontOid, searchRequest)

Search storefront files

Searches names and, when text is supplied, file contents.  For a CLI with no local copy this is the only way to answer where something is defined without walking the whole tree.  Results are capped and truncation is always reported. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **searchRequest** | [**SfvbFileSearchRequest**](SfvbFileSearchRequest.md)| File search | |

### Return type

[**SfvbFileSearchResponse**](SfvbFileSearchResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="searchSfvbLibrary"></a>
# **searchSfvbLibrary**
> SfvbLibraryResponse searchSfvbLibrary(storefrontOid, segment, search, pageNumber, resultsPerPage)

Search the element library

Known-good CJSON fragments a human already built out of real elements.  This is what a lint warning about a monolithic html element should point at - a warning that names a fragment solving the same problem is an instruction, where a warning on its own is only criticism.  Results are terse; fetch a single entry for its CJSON.  Narrow with facet_{name}&#x3D;{option} query parameters. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **segment** | **String**|  | [optional] |
| **search** | **String**|  | [optional] |
| **pageNumber** | **Integer**|  | [optional] |
| **resultsPerPage** | **Integer**|  | [optional] |

### Return type

[**SfvbLibraryResponse**](SfvbLibraryResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="uploadSfvbFile"></a>
# **uploadSfvbFile**
> SfvbFileWriteResponse uploadSfvbFile(storefrontOid, fileUploadRequest, ifMatch)

Store a binary asset that was already uploaded

The second half of the two step upload.  The bytes are fetched from the key, checked against the extension they claim to be, and written exactly as a text write is - so the same If-Match precondition, the same read only refusal and the same publish gate apply.  An SVG is sanitized before it is stored.  Writing outside /themes/ requires sfvb_publish, because anything served off the storefront root is live by definition. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **fileUploadRequest** | [**SfvbFileUploadRequest**](SfvbFileUploadRequest.md)| Where to store the uploaded bytes | |
| **ifMatch** | **String**| Content hash from the last read.  Required when the file already exists; 428 when absent, 412 when stale. | [optional] |

### Return type

[**SfvbFileWriteResponse**](SfvbFileWriteResponse.md)

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
| **403** | Status Code 403: forbidden |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **412** |  |  -  |
| **413** |  |  -  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="validateSfvbCjson"></a>
# **validateSfvbCjson**
> SfvbValidationResponse validateSfvbCjson(validateRequest)

Validate CJSON

Runs the structural schema, the contextual business rules for the destination owner type, and the quality lint.  A document that fails returns HTTP 200 with valid false rather than a transport error - the request was well formed, the document was not. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **validateRequest** | [**SfvbValidateRequest**](SfvbValidateRequest.md)| CJSON to validate | |

### Return type

[**SfvbValidationResponse**](SfvbValidationResponse.md)

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
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="validateSfvbVelocity"></a>
# **validateSfvbVelocity**
> SfvbValidationResponse validateSfvbVelocity(storefrontOid, themeOid, velocityValidateRequest)

Validate a Velocity template against a theme

Theme scoped rather than stateless.  Validation builds a theme template context and evaluates against it.  Also applies the template sandbox, so an agent learns the rule before a write fails. 

### Example


(No example for this operation).


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **storefrontOid** | **Integer**|  | |
| **themeOid** | **Integer**|  | |
| **velocityValidateRequest** | [**SfvbVelocityValidateRequest**](SfvbVelocityValidateRequest.md)| Velocity template to validate | |

### Return type

[**SfvbValidationResponse**](SfvbValidationResponse.md)

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
| **404** | Status Code 404: not found |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

