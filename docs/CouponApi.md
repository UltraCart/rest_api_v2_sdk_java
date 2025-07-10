# CouponApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCoupon**](CouponApi.md#deleteCoupon) | **DELETE** /coupon/coupons/{coupon_oid} | Delete a coupon |
| [**deleteCouponsByCode**](CouponApi.md#deleteCouponsByCode) | **DELETE** /coupon/coupons/by_code | Deletes multiple coupons |
| [**deleteCouponsByOid**](CouponApi.md#deleteCouponsByOid) | **DELETE** /coupon/coupons/by_oid | Deletes multiple coupons |
| [**doesCouponCodeExist**](CouponApi.md#doesCouponCodeExist) | **GET** /coupon/coupons/merchant_code/{merchant_code}/exists | Determines if a coupon merchant code already exists |
| [**generateCouponCodes**](CouponApi.md#generateCouponCodes) | **POST** /coupon/coupons/{coupon_oid}/generate_codes | Generates one time codes for a coupon |
| [**generateOneTimeCodesByMerchantCode**](CouponApi.md#generateOneTimeCodesByMerchantCode) | **POST** /coupon/coupons/merchant_code/{merchant_code}/generate_codes | Generates one time codes by merchant code |
| [**getAutoApply**](CouponApi.md#getAutoApply) | **GET** /coupon/auto_apply | Retrieve auto apply rules and conditions |
| [**getCoupon**](CouponApi.md#getCoupon) | **GET** /coupon/coupons/{coupon_oid} | Retrieve a coupon |
| [**getCouponByMerchantCode**](CouponApi.md#getCouponByMerchantCode) | **GET** /coupon/coupons/merchant_code/{merchant_code} | Retrieve a coupon by merchant code |
| [**getCoupons**](CouponApi.md#getCoupons) | **GET** /coupon/coupons | Retrieve coupons |
| [**getCouponsByQuery**](CouponApi.md#getCouponsByQuery) | **POST** /coupon/coupons/query | Retrieve coupons by query |
| [**getEditorValues**](CouponApi.md#getEditorValues) | **GET** /coupon/editor_values | Retrieve values needed for a coupon editor |
| [**insertCoupon**](CouponApi.md#insertCoupon) | **POST** /coupon/coupons | Insert a coupon |
| [**insertCoupons**](CouponApi.md#insertCoupons) | **POST** /coupon/coupons/batch | Insert multiple coupons |
| [**searchItems**](CouponApi.md#searchItems) | **GET** /coupon/searchItems | Searches for items to display within a coupon editor and assign to coupons |
| [**updateAutoApply**](CouponApi.md#updateAutoApply) | **POST** /coupon/auto_apply | Update auto apply rules and conditions |
| [**updateCoupon**](CouponApi.md#updateCoupon) | **PUT** /coupon/coupons/{coupon_oid} | Update a coupon |
| [**updateCoupons**](CouponApi.md#updateCoupons) | **PUT** /coupon/coupons/batch | Update multiple coupons |
| [**uploadCouponCodes**](CouponApi.md#uploadCouponCodes) | **POST** /coupon/coupons/{coupon_oid}/upload_codes | Upload one-time codes for a coupon |


<a name="deleteCoupon"></a>
# **deleteCoupon**
> deleteCoupon(couponOid)

Delete a coupon

Delete a coupon on the UltraCart account. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponAmountOffSubtotal;
import com.ultracart.admin.v2.models.CouponResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.UUID;

public class DeleteCoupon {
    
    /**
     * Deletes a specific coupon using the UltraCart API
     */
    public static void execute() {
        System.out.println("--- " + DeleteCoupon.class.getSimpleName() + " ---");
        
        CouponApi couponApi = new CouponApi(Constants.API_KEY);
        String expand = null; // coupons do not have expansions.
        
        Coupon coupon = new Coupon();
        coupon.setMerchantCode(UUID.randomUUID().toString().substring(0, 8));
        coupon.setDescription("Test coupon for sdk_sample.coupon.DeleteCoupon");
        
        CouponAmountOffSubtotal amountOff = new CouponAmountOffSubtotal();
        amountOff.setCurrencyCode("USD");
        amountOff.setDiscountAmount(new BigDecimal("0.01")); // one penny discount
        coupon.setAmountOffSubtotal(amountOff);

        try {
            CouponResponse couponResponse = couponApi.insertCoupon(coupon, expand);
            coupon = couponResponse.getCoupon();

            System.out.println("Created the following temporary coupon:");
            System.out.println("Coupon OID: " + coupon.getCouponOid());
            System.out.println("Coupon Type: " + coupon.getCouponType());
            System.out.println("Coupon Description: " + coupon.getDescription());
            
            int couponOid = coupon.getCouponOid();
            
            // Delete the coupon
            couponApi.deleteCoupon(couponOid);

            System.out.println("Successfully deleted coupon with ID: " + couponOid);
        } catch (ApiException e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon_oid to delete. | |

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

<a name="deleteCouponsByCode"></a>
# **deleteCouponsByCode**
> deleteCouponsByCode(couponDeleteRequest)

Deletes multiple coupons

Delete coupons on the UltraCart account. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponAmountOffSubtotal;
import com.ultracart.admin.v2.models.CouponDeletesRequest;
import com.ultracart.admin.v2.models.CouponResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.UUID;

public class DeleteCouponsByCode {
    
    /**
     * Deletes a specific coupon using the UltraCart API
     */
    public static void execute() {
        System.out.println("--- " + DeleteCouponsByCode.class.getSimpleName() + " ---");

        CouponApi couponApi = new CouponApi(Constants.API_KEY);
        String expand = null; // coupons do not have expansions.

        String merchantCode = UUID.randomUUID().toString().substring(0, 8);
        
        Coupon coupon = new Coupon();
        coupon.setMerchantCode(merchantCode); 
        coupon.setDescription("Test coupon for DeleteCouponsByCode");
        
        CouponAmountOffSubtotal amountOff = new CouponAmountOffSubtotal();
        amountOff.setCurrencyCode("USD");
        amountOff.setDiscountAmount(new BigDecimal("0.01")); // one penny discount
        coupon.setAmountOffSubtotal(amountOff);

        try {
            CouponResponse couponResponse = couponApi.insertCoupon(coupon, expand);
            coupon = couponResponse.getCoupon();

            System.out.println("Created the following temporary coupon:");
            System.out.println("Coupon OID: " + coupon.getMerchantCode());
            System.out.println("Coupon Type: " + coupon.getCouponType());
            System.out.println("Coupon Description: " + coupon.getDescription());
            
            // Delete the coupon
            CouponDeletesRequest deleteRequest = new CouponDeletesRequest();
            deleteRequest.setCouponCodes(Collections.singletonList(merchantCode));             
            couponApi.deleteCouponsByCode(deleteRequest);

            System.out.println("Successfully deleted coupon with merchantCode: " + merchantCode);
        } catch (ApiException e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponDeleteRequest** | [**CouponDeletesRequest**](CouponDeletesRequest.md)| Coupon oids to delete | |

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
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="deleteCouponsByOid"></a>
# **deleteCouponsByOid**
> deleteCouponsByOid(couponDeleteRequest)

Deletes multiple coupons

Delete coupons on the UltraCart account. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponAmountOffSubtotal;
import com.ultracart.admin.v2.models.CouponDeletesRequest;
import com.ultracart.admin.v2.models.CouponResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.UUID;

public class DeleteCouponsByOid {
    
    /**
     * Deletes a specific coupon using the UltraCart API
     */
    public static void execute() {
        System.out.println("--- " + DeleteCouponsByOid.class.getSimpleName() + " ---");

        CouponApi couponApi = new CouponApi(Constants.API_KEY);
        String expand = null; // coupons do not have expansions.

        String merchantCode = UUID.randomUUID().toString().substring(0, 8);
        
        Coupon coupon = new Coupon();
        coupon.setMerchantCode(merchantCode); 
        coupon.setDescription("Test coupon for DeleteCouponsByCode");
        
        CouponAmountOffSubtotal amountOff = new CouponAmountOffSubtotal();
        amountOff.setCurrencyCode("USD");
        amountOff.setDiscountAmount(new BigDecimal("0.01")); // one penny discount
        coupon.setAmountOffSubtotal(amountOff);

        try {
            CouponResponse couponResponse = couponApi.insertCoupon(coupon, expand);
            coupon = couponResponse.getCoupon();

            System.out.println("Created the following temporary coupon:");
            System.out.println("Coupon OID: " + coupon.getMerchantCode());
            System.out.println("Coupon Type: " + coupon.getCouponType());
            System.out.println("Coupon Description: " + coupon.getDescription());
            
            // Delete the coupon
            CouponDeletesRequest deleteRequest = new CouponDeletesRequest();
            deleteRequest.setCouponOids(Collections.singletonList(coupon.getCouponOid()));             
            couponApi.deleteCouponsByOid(deleteRequest);

            System.out.println("Successfully deleted coupon with merchantCode: " + merchantCode);
        } catch (ApiException e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponDeleteRequest** | [**CouponDeletesRequest**](CouponDeletesRequest.md)| Coupon oids to delete | |

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
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="doesCouponCodeExist"></a>
# **doesCouponCodeExist**
> CouponExistsResponse doesCouponCodeExist(merchantCode)

Determines if a coupon merchant code already exists

Determines if a coupon merchant code already exists. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponAmountOffSubtotal;
import com.ultracart.admin.v2.models.CouponExistsResponse;
import com.ultracart.admin.v2.models.CouponResponse;
import common.Constants;

import java.math.BigDecimal;
import java.util.UUID;

public class DoesCouponCodeExist {
    public static void execute() {
        System.out.println("--- " + DoesCouponCodeExist.class.getSimpleName() + " ---");

        try {
            CouponApi couponApi = new CouponApi(Constants.API_KEY);

            String merchantCode = UUID.randomUUID().toString().substring(0, 8);

            CouponExistsResponse couponExistsResponse = couponApi.doesCouponCodeExist(merchantCode);
            // The response should be false.
            if (couponExistsResponse.getExists()) {
                throw new Exception("CouponApi.doesCouponCodeExist should have returned false.");
            }

            // Now create the coupon and ensure it exists.
            Coupon coupon = new Coupon();
            coupon.setMerchantCode(merchantCode);
            coupon.setDescription("Test coupon for DoesCouponCodeExist");
            
            CouponAmountOffSubtotal amountOff = new CouponAmountOffSubtotal();
            amountOff.setCurrencyCode("USD");
            amountOff.setDiscountAmount(new BigDecimal("0.01")); // one penny discount
            coupon.setAmountOffSubtotal(amountOff);

            CouponResponse couponResponse = couponApi.insertCoupon(coupon, null);
            coupon = couponResponse.getCoupon();

            System.out.println("Created the following temporary coupon:");
            System.out.println("Coupon OID: " + coupon.getMerchantCode());
            System.out.println("Coupon Type: " + coupon.getCouponType());
            System.out.println("Coupon Description: " + coupon.getDescription());

            couponExistsResponse = couponApi.doesCouponCodeExist(merchantCode);
            if (!couponExistsResponse.getExists()) {
                throw new Exception(
                    "CouponApi.doesCouponCodeExist should have returned true after creating the coupon.");
            }

            // Delete the coupon
            couponApi.deleteCoupon(coupon.getCouponOid());
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
| **merchantCode** | **String**| The coupon merchant code to examine. | |

### Return type

[**CouponExistsResponse**](CouponExistsResponse.md)

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

<a name="generateCouponCodes"></a>
# **generateCouponCodes**
> CouponCodesResponse generateCouponCodes(couponOid, couponCodesRequest)

Generates one time codes for a coupon

Generate one time codes for a coupon 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;

public class GenerateCouponCodes {
    public static void execute() {
        System.out.println("--- " + GenerateCouponCodes.class.getSimpleName() + " ---");
        
        try {
            // Create coupon API instance using API key
            CouponApi couponApi = new CouponApi(Constants.API_KEY);

            String merchantCode = UUID.randomUUID().toString().substring(0, 8);
                
            // Now create the coupon and ensure it exists.
            Coupon coupon = new Coupon();
            coupon.setMerchantCode(merchantCode);
            coupon.setDescription("Test coupon for GetCoupon");
            
            CouponAmountOffSubtotal amountOff = new CouponAmountOffSubtotal();
            amountOff.setCurrencyCode("USD");
            amountOff.setDiscountAmount(new BigDecimal("0.01")); // one penny discount
            coupon.setAmountOffSubtotal(amountOff);

            CouponResponse couponResponse = couponApi.insertCoupon(coupon, null);
            coupon = couponResponse.getCoupon();
                
            CouponCodesRequest codesRequest = new CouponCodesRequest();
            codesRequest.setQuantity(5); // give me 5 codes.
            codesRequest.setExpirationDts(Instant.now().plus(90, ChronoUnit.DAYS).toString()); // do you want the codes to expire?
            // codesRequest.setExpirationSeconds(null); // also an option for short-lived coupons
                
            CouponCodesResponse apiResponse = couponApi.generateCouponCodes(coupon.getCouponOid(), codesRequest);
            List<String> couponCodes = apiResponse.getCouponCodes();
                
            // Display generated coupon codes
            System.out.println("Generated " + couponCodes.size() + " coupon codes:");
            for (String code : couponCodes) {
                System.out.println(code);
            }
                
            // Delete the coupon
            couponApi.deleteCoupon(coupon.getCouponOid());
                
        } catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon oid to generate codes. | |
| **couponCodesRequest** | [**CouponCodesRequest**](CouponCodesRequest.md)| Coupon code generation parameters | |

### Return type

[**CouponCodesResponse**](CouponCodesResponse.md)

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

<a name="generateOneTimeCodesByMerchantCode"></a>
# **generateOneTimeCodesByMerchantCode**
> CouponCodesResponse generateOneTimeCodesByMerchantCode(merchantCode, couponCodesRequest)

Generates one time codes by merchant code

Generate one time codes by merchant code 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;

public class GenerateOneTimeCodesByMerchantCode {
    public static void execute() {
        System.out.println("--- " + GenerateOneTimeCodesByMerchantCode.class.getSimpleName() + " ---");
        
        try {
            // Create coupon API instance using API key
            CouponApi couponApi = new CouponApi(Constants.API_KEY);

            String merchantCode = UUID.randomUUID().toString().substring(0, 8);
                
            // Now create the coupon and ensure it exists.
            Coupon coupon = new Coupon();
            coupon.setMerchantCode(merchantCode);
            coupon.setDescription("Test coupon for GetCoupon");
            
            CouponAmountOffSubtotal amountOff = new CouponAmountOffSubtotal();
            amountOff.setCurrencyCode("USD");
            amountOff.setDiscountAmount(new BigDecimal("0.01")); // one penny discount
            coupon.setAmountOffSubtotal(amountOff);

            CouponResponse couponResponse = couponApi.insertCoupon(coupon, null);
            coupon = couponResponse.getCoupon();

            System.out.println("Created the following temporary coupon:");
            System.out.println("Coupon OID: " + coupon.getMerchantCode());
            System.out.println("Coupon Type: " + coupon.getCouponType());
            System.out.println("Coupon Description: " + coupon.getDescription());
                
            CouponCodesRequest codesRequest = new CouponCodesRequest();
            codesRequest.setQuantity(5); // give me 5 codes.
            codesRequest.setExpirationDts(Instant.now().plus(90, ChronoUnit.DAYS).toString()); // do you want the codes to expire?
            // codesRequest.setExpirationSeconds(null); // also an option for short-lived coupons
                
            CouponCodesResponse apiResponse = couponApi.generateOneTimeCodesByMerchantCode(merchantCode, codesRequest);
            List<String> couponCodes = apiResponse.getCouponCodes();
                
            // Display generated coupon codes
            System.out.println("Generated " + couponCodes.size() + " one-time coupon codes for merchant code '" + merchantCode + "':");
            for (String code : couponCodes) {
                System.out.println(code);
            }
                
            // Delete the coupon
            couponApi.deleteCoupon(coupon.getCouponOid());
                
        } catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantCode** | **String**| The merchant code to generate one time codes. | |
| **couponCodesRequest** | [**CouponCodesRequest**](CouponCodesRequest.md)| Coupon code generation parameters | |

### Return type

[**CouponCodesResponse**](CouponCodesResponse.md)

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

<a name="getAutoApply"></a>
# **getAutoApply**
> CouponAutoApplyConditions getAutoApply()

Retrieve auto apply rules and conditions

Retrieve auto apply rules and conditions 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.CouponAutoApplyConditions;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

public class GetAutoApply {
    /*
      getAutoApply returns back the items and subtotals that trigger "auto coupons", i.e. coupons that are automatically
      added to a shopping cart.  The manual configuration of auto coupons is at the bottom of the main coupons screen.
      See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1376525/Coupons#Coupons-Navigation
    */
    public static void execute() {
        try {
            // Create coupon API instance using API key
            CouponApi couponApi = new CouponApi(Constants.API_KEY);
            
            // Get auto apply coupons information
            CouponAutoApplyConditions apiResponse = couponApi.getAutoApply();
            
            // Display subtotal levels
            System.out.println("These are the subtotal levels:");
            for (Object subtotalLevel : apiResponse.getSubtotalLevels()) {
                System.out.println(subtotalLevel);
            }
            
            // Display item triggers
            System.out.println("These are the item triggers:");
            for (Object requiredItem : apiResponse.getRequiredItems()) {
                System.out.println(requiredItem);
            }
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**CouponAutoApplyConditions**](CouponAutoApplyConditions.md)

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

<a name="getCoupon"></a>
# **getCoupon**
> CouponResponse getCoupon(couponOid, expand)

Retrieve a coupon

Retrieves a single coupon using the specified coupon profile oid. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponAmountOffSubtotal;
import com.ultracart.admin.v2.models.CouponResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.UUID;

public class GetCoupon {
    public static void execute() {
        try {
            CouponApi couponApi = new CouponApi(Constants.API_KEY);

            String merchantCode = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);
            
            // Now create the coupon and ensure it exists.
            Coupon coupon = new Coupon();
            coupon.setMerchantCode(merchantCode);
            coupon.setDescription("Test coupon for GetCoupon");
            coupon.setAmountOffSubtotal(new CouponAmountOffSubtotal()); // one penny discount.
            coupon.getAmountOffSubtotal().setDiscountAmount(BigDecimal.valueOf(.01));
            coupon.getAmountOffSubtotal().setCurrencyCode("USD");

            CouponResponse couponResponse = couponApi.insertCoupon(coupon, null);
            coupon = couponResponse.getCoupon();

            System.out.println("Created the following temporary coupon:");
            System.out.println("Coupon OID: " + coupon.getMerchantCode());
            System.out.println("Coupon Type: " + coupon.getCouponType());
            System.out.println("Coupon Description: " + coupon.getDescription());

            couponResponse = couponApi.getCoupon(coupon.getCouponOid(), null);
            Coupon copyOfCoupon = couponResponse.getCoupon();
            System.out.println("GetCoupon returned the following coupon:");
            System.out.println("Coupon OID: " + copyOfCoupon.getMerchantCode());
            System.out.println("Coupon Type: " + copyOfCoupon.getCouponType());
            System.out.println("Coupon Description: " + copyOfCoupon.getDescription());
            
            // Delete the coupon
            couponApi.deleteCoupon(coupon.getCouponOid());
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon oid to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponResponse**](CouponResponse.md)

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

<a name="getCouponByMerchantCode"></a>
# **getCouponByMerchantCode**
> CouponResponse getCouponByMerchantCode(merchantCode, expand)

Retrieve a coupon by merchant code

Retrieves a single coupon using the specified merchant code. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponAmountOffSubtotal;
import com.ultracart.admin.v2.models.CouponResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.UUID;

public class GetCouponByMerchantCode {
    public static void execute() {
        try {
            CouponApi couponApi = new CouponApi(Constants.API_KEY);

            String merchantCode = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);
            
            // Now create the coupon and ensure it exists.
            Coupon coupon = new Coupon();
            coupon.setMerchantCode(merchantCode);
            coupon.setDescription("Test coupon for GetCoupon");
            coupon.setAmountOffSubtotal(new CouponAmountOffSubtotal()); // one penny discount.
            coupon.getAmountOffSubtotal().setDiscountAmount(BigDecimal.valueOf(.01));
            coupon.getAmountOffSubtotal().setCurrencyCode("USD");


            CouponResponse couponResponse = couponApi.insertCoupon(coupon, null);
            coupon = couponResponse.getCoupon();

            System.out.println("Created the following temporary coupon:");
            System.out.println("Coupon OID: " + coupon.getMerchantCode());
            System.out.println("Coupon Type: " + coupon.getCouponType());
            System.out.println("Coupon Description: " + coupon.getDescription());

            couponResponse = couponApi.getCouponByMerchantCode(merchantCode, null);
            Coupon copyOfCoupon = couponResponse.getCoupon();
            System.out.println("GetCoupon returned the following coupon:");
            System.out.println("Coupon OID: " + copyOfCoupon.getMerchantCode());
            System.out.println("Coupon Type: " + copyOfCoupon.getCouponType());
            System.out.println("Coupon Description: " + copyOfCoupon.getDescription());
            
            // Delete the coupon
            couponApi.deleteCoupon(coupon.getCouponOid());
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantCode** | **String**| The coupon merchant code to retrieve. | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponResponse**](CouponResponse.md)

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

<a name="getCoupons"></a>
# **getCoupons**
> CouponsResponse getCoupons(merchantCode, description, couponType, startDateBegin, startDateEnd, expirationDateBegin, expirationDateEnd, affiliateOid, excludeExpired, limit, offset, sort, expand)

Retrieve coupons

Retrieves coupons for this account.  If no parameters are specified, all coupons will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponsResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class GetCoupons {
    public static void execute() {
        try {
            List<Coupon> coupons = new ArrayList<>();
            
            int iteration = 1;
            int offset = 0;
            int limit = 200;
            boolean needMoreRecords = true;
            
            while (needMoreRecords) {
                System.out.println("executing iteration #" + iteration++);
                List<Coupon> blockOfCoupons = getCouponsChunk(offset, limit);
                coupons.addAll(blockOfCoupons);
                
                offset += limit;
                needMoreRecords = blockOfCoupons.size() == limit;
            }
            
            // Display the coupons
            for (Coupon coupon : coupons) {
                System.out.println(coupon);
            }
            
            System.out.println("Total coupons retrieved: " + coupons.size());
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    /**
     * Returns a block of coupons
     * 
     * @param offset pagination variable
     * @param limit pagination variable. max server will allow is 200
     * @return List of Coupon objects
     */
    public static List<Coupon> getCouponsChunk(int offset, int limit) throws ApiException {
        // Create coupon API instance using API key
        CouponApi couponApi = new CouponApi(Constants.API_KEY);
        
        // TODO: consider using getCouponsByQuery() as it does not require all search parameters
        String merchantCode = null;
        String description = null;
        String couponType = null;
        String startDateBegin = null;
        String startDateEnd = null;
        String expirationDateBegin = null;
        String expirationDateEnd = null;
        Integer affiliateOid = null;
        Boolean excludeExpired = null;
        
        String sort = null;
        String expand = null; // getCoupons doesn't have any expansions. full record is always returned.
        
        CouponsResponse getResponse = couponApi.getCoupons(
            merchantCode, description, couponType, 
            startDateBegin, startDateEnd, 
            expirationDateBegin, expirationDateEnd, 
            affiliateOid, excludeExpired, 
            limit, offset, sort, expand
        );
            
        return getResponse.getCoupons() != null ? getResponse.getCoupons() : new ArrayList<>();
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **merchantCode** | **String**| Merchant code | [optional] |
| **description** | **String**| Description | [optional] |
| **couponType** | **String**| Coupon type | [optional] |
| **startDateBegin** | **String**| Start date begin | [optional] |
| **startDateEnd** | **String**| Start date end | [optional] |
| **expirationDateBegin** | **String**| Expiration date begin | [optional] |
| **expirationDateEnd** | **String**| Expiration date end | [optional] |
| **affiliateOid** | **Integer**| Affiliate oid | [optional] |
| **excludeExpired** | **Boolean**| Exclude expired | [optional] |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the coupons.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponsResponse**](CouponsResponse.md)

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

<a name="getCouponsByQuery"></a>
# **getCouponsByQuery**
> CouponsResponse getCouponsByQuery(couponQuery, limit, offset, sort, expand)

Retrieve coupons by query

Retrieves coupons from the account.  If no parameters are specified, all coupons will be returned.  You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponQuery;
import com.ultracart.admin.v2.models.CouponsResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.util.ArrayList;
import java.util.List;

public class GetCouponsByQuery {
    /*
    retrieves coupons by query.  Can filter on specific coupons or return back all coupons.  Support pagination.
    A note about the coupon type below.  Those are string literals representing coupons.  This method is used UltraCart's
    backend, and it uses a dropdown box for that value showing friendly descriptions of them.

    It's not anticipated a merchant would need to query by coupon type, but in the event you do, here's the list of constants:
    (Full list of coupon type constants from original C# comment)
    */
    public static void execute() {
        try {
            List<Coupon> coupons = new ArrayList<>();
            
            int iteration = 1;
            int offset = 0;
            int limit = 200;
            boolean moreRecordsToFetch = true;
            
            while (moreRecordsToFetch) {
                System.out.println("executing iteration " + iteration);
                List<Coupon> chunkOfCoupons = getCouponChunk(offset, limit);
                coupons.addAll(chunkOfCoupons);
                offset += limit;
                moreRecordsToFetch = chunkOfCoupons.size() == limit;
                iteration++;
            }
            
            // Display the coupons
            for (Coupon coupon : coupons) {
                System.out.println(coupon);
            }
            
            System.out.println("Total coupons retrieved: " + coupons.size());
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    /**
     * Returns a chunk of coupons based on query parameters
     * 
     * @param offset Pagination offset
     * @param limit Maximum number of records to return
     * @return List of matching coupons
     */
    public static List<Coupon> getCouponChunk(int offset, int limit) throws ApiException {
        // Create coupon API instance using API key
        CouponApi couponApi = new CouponApi(Constants.API_KEY);
        
        CouponQuery query = new CouponQuery();
        query.setMerchantCode("10OFF"); // supports partial matching
        query.setDescription("Saturday"); // supports partial matching
        // query.setCouponType(null); // see the note at the top of this sample.
        // query.setStartDtsBegin(Instant.now().minus(2000, ChronoUnit.DAYS).toString()); // yes, that 2,000 days.
        // query.setStartDtsEnd(Instant.now().toString());
        // query.setExpirationDtsBegin(null);
        // query.setExpirationDtsEnd(null);
        // query.setAffiliateOid(0); // this requires an affiliate_oid. If you need help finding an affiliate's oid, contact support.
        query.setExcludeExpired(true);
        
        String expand = null; // coupons do not have expansions
        String sort = "merchant_code"; // Possible sorts: "coupon_type", "merchant_code", "description", "start_dts", "expiration_dts", "quickbooks_code"
        
        CouponsResponse apiResponse = couponApi.getCouponsByQuery(query, limit, offset, sort, expand);
        return apiResponse.getCoupons() != null ? apiResponse.getCoupons() : new ArrayList<>();
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponQuery** | [**CouponQuery**](CouponQuery.md)| Coupon query | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Max 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the coupons.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponsResponse**](CouponsResponse.md)

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

<a name="getEditorValues"></a>
# **getEditorValues**
> CouponEditorValues getEditorValues()

Retrieve values needed for a coupon editor

Retrieve values needed for a coupon editor 

### Example

```java
// This is an internal method used by our Coupon management screen.  It returns back all the static data needed
// for our dropdown lists, such as coupon constants.  You can call it if you like, but the data won't be
// of much use.
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**CouponEditorValues**](CouponEditorValues.md)

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

<a name="insertCoupon"></a>
# **insertCoupon**
> CouponResponse insertCoupon(coupon, expand)

Insert a coupon

Insert a coupon on the UltraCart account. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponAmountOffSubtotal;
import com.ultracart.admin.v2.models.CouponResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;

public class InsertCoupon {
    public static void execute() {
        try {
            // Create coupon API instance using API key
            CouponApi couponApi = new CouponApi(Constants.API_KEY);

            // Create a new coupon
            Coupon coupon = new Coupon();
            coupon.setMerchantCode("InsertCouponSample");
            coupon.setDescription("One penny off subtotal");

            // Each coupon must have a 'type' defined by creating a child object directly beneath the main Coupon object.
            // This is complex and there are a LOT of coupon types. See the backend (secure.ultracart.com) coupon screens
            // to get an idea of what functionality each coupon possesses. If you're not sure, contact UltraCart support.
            coupon.setAmountOffSubtotal(new CouponAmountOffSubtotal()); // one penny discount.
            coupon.getAmountOffSubtotal().setDiscountAmount(BigDecimal.valueOf(.01));
            coupon.getAmountOffSubtotal().setCurrencyCode("USD");

            // Commented out list of coupon types from original code...

            String expand = null; // coupons do not have expansions
            CouponResponse apiResponse = couponApi.insertCoupon(coupon, expand);
            
            coupon = apiResponse.getCoupon();
            System.out.println("Created the following temporary coupon:");
            System.out.println("Coupon OID: " + coupon.getCouponOid());
            System.out.println("Coupon Type: " + coupon.getCouponType());
            System.out.println("Coupon Description: " + coupon.getDescription());
            
            System.out.println("Deleting newly created coupon to clean up.");
            couponApi.deleteCoupon(coupon.getCouponOid());
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **coupon** | [**Coupon**](Coupon.md)| Coupon to insert | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponResponse**](CouponResponse.md)

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

<a name="insertCoupons"></a>
# **insertCoupons**
> CouponsResponse insertCoupons(couponsRequest, expand, placeholders)

Insert multiple coupons

Insert multiple coupon on the UltraCart account. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponAmountOffSubtotal;
import com.ultracart.admin.v2.models.CouponsRequest;
import com.ultracart.admin.v2.models.CouponsResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InsertCoupons {
    public static void Execute() {
        System.out.println("--- " + InsertCoupons.class.getSimpleName() + " ---");
        try {
            // Create coupon API instance using API key
            CouponApi couponApi = new CouponApi(Constants.API_KEY);
            
            Coupon coupon1 = new Coupon();
            coupon1.setMerchantCode("PennyOff");
            coupon1.setDescription("Test Coupon for InsertCoupons sample");
            coupon1.setAmountOffSubtotal(new CouponAmountOffSubtotal()); // see InsertCoupon for examples of types
            coupon1.getAmountOffSubtotal().setDiscountAmount(new BigDecimal("0.01"));

            Coupon coupon2 = new Coupon();
            coupon2.setMerchantCode("TwoPenniesOff");
            coupon2.setDescription("Test Coupon for InsertCoupons sample");
            coupon2.setAmountOffSubtotal(new CouponAmountOffSubtotal()); // see InsertCoupon for examples of types
            coupon2.getAmountOffSubtotal().setDiscountAmount(new BigDecimal("0.02"));
            
            CouponsRequest couponsRequest = new CouponsRequest();
            List<Coupon> couponList = new ArrayList<>();
            couponList.add(coupon1);
            couponList.add(coupon2);
            couponsRequest.setCoupons(couponList);

            CouponsResponse apiResponse = couponApi.insertCoupons(couponsRequest, null, false);
            
            System.out.println(apiResponse);

            for (Coupon coupon : apiResponse.getCoupons()) {
                System.out.println("Deleting newly created coupon (Coupon OID " + coupon.getCouponOid() + ") to clean up.");
                couponApi.deleteCoupon(coupon.getCouponOid());
            }
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponsRequest** | [**CouponsRequest**](CouponsRequest.md)| Coupons to insert (maximum 50) | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |

### Return type

[**CouponsResponse**](CouponsResponse.md)

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

<a name="searchItems"></a>
# **searchItems**
> CouponItemSearchResultsResponse searchItems(s, m)

Searches for items to display within a coupon editor and assign to coupons

Searches for items to display within a coupon editor and assign to coupons 

### Example

```java
// This is an internal method used by our Coupon management screen.  It searches merchant items to display in
// some of the coupon editor dropdowns.  See ItemApi.getItemsByQuery if you need to search items.  This method
// is inflexible and geared toward our UI.
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **s** | **String**|  | [optional] |
| **m** | **Integer**|  | [optional] |

### Return type

[**CouponItemSearchResultsResponse**](CouponItemSearchResultsResponse.md)

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

<a name="updateAutoApply"></a>
# **updateAutoApply**
> updateAutoApply(conditions)

Update auto apply rules and conditions

Update auto apply rules and conditions 

### Example

```java
package coupon;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.CouponAutoApplyConditions;
import com.ultracart.admin.v2.models.CouponAutoApplyCondition;
import com.ultracart.admin.v2.util.ApiException;

import common.Constants;

public class UpdateAutoApply {
    /*
      updateAutoApply updates the items and subtotals conditions that trigger "auto coupons", i.e. coupons that are automatically
      added to a shopping cart.  The manual configuration of auto coupons is at the bottom of the main coupons screen.
      See: https://ultracart.atlassian.net/wiki/spaces/ucdoc/pages/1376525/Coupons#Coupons-Navigation

      // Success is 200 (There is no content.  Yes, this should return a 204, but it returns a 200 with no content)
    */
    public static void Execute() {
        System.out.println("--- " + UpdateAutoApply.class.getSimpleName() + " ---");
        
        try {
            // Create coupon API instance using API key
            CouponApi couponApi = new CouponApi(Constants.API_KEY);
            
            // Create auto apply conditions
            CouponAutoApplyConditions autoApply = new CouponAutoApplyConditions();
            
            // Create item condition
            CouponAutoApplyCondition itemCondition = new CouponAutoApplyCondition();
            itemCondition.setRequiredItemId("ITEM_ABC");
            itemCondition.setCouponCode("10OFF");
            List<CouponAutoApplyCondition> itemConditions = new ArrayList<>();
            itemConditions.add(itemCondition);
            
            // Create subtotal condition
            CouponAutoApplyCondition subtotalCondition = new CouponAutoApplyCondition();
            subtotalCondition.setMinimumSubtotal(new BigDecimal("50")); // must spend fifty dollars
            subtotalCondition.setCouponCode("5OFF");
            List<CouponAutoApplyCondition> subtotalConditions = new ArrayList<>();
            subtotalConditions.add(subtotalCondition);
            
            // Set conditions to auto apply object
            autoApply.setRequiredItems(itemConditions);
            autoApply.setSubtotalLevels(subtotalConditions);
            
            // Update auto apply conditions
            couponApi.updateAutoApply(autoApply);
            
            System.out.println("Auto apply conditions updated successfully");
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conditions** | [**CouponAutoApplyConditions**](CouponAutoApplyConditions.md)| Conditions | |

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
| **400** | Status Code 400: bad request input such as invalid json |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **401** | Status Code 401: invalid credentials supplied |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **410** | Status Code 410: Your authorized application has been disabled by UltraCart |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **429** | Status Code 429: you have exceeded the allowed API call rate limit for your application. |  * UC-REST-ERROR - Contains human readable error message <br>  |
| **500** | Status Code 500: any server side error.  the body will contain a generic server error message |  * UC-REST-ERROR - Contains human readable error message <br>  |

<a name="updateCoupon"></a>
# **updateCoupon**
> CouponResponse updateCoupon(couponOid, coupon, expand)

Update a coupon

Update a coupon on the UltraCart account. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.Coupon;
import com.ultracart.admin.v2.models.CouponAmountOffSubtotal;
import com.ultracart.admin.v2.models.CouponResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class UpdateCoupon {
    public static void Execute() {
        System.out.println("--- " + UpdateCoupon.class.getSimpleName() + " ---");
        
        try {
            // Create coupon API instance using API key
            CouponApi couponApi = new CouponApi(Constants.API_KEY);

            String merchantCode = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);
            
            // Now create the coupon and ensure it exists.
            Coupon coupon = new Coupon();
            coupon.setMerchantCode(merchantCode);
            coupon.setDescription("Test coupon for GetCoupon");
            coupon.setAmountOffSubtotal(new CouponAmountOffSubtotal()); // one penny discount.
            coupon.getAmountOffSubtotal().setDiscountAmount(BigDecimal.valueOf(.01));
            coupon.getAmountOffSubtotal().setCurrencyCode("USD");


            CouponResponse couponResponse = couponApi.insertCoupon(coupon, null);
            coupon = couponResponse.getCoupon();
            
            // update the coupon. this can be difficult given the complexity of coupons. see insertCoupon sample for details.
            coupon.setExpirationDts(Instant.now().plus(90, ChronoUnit.DAYS).toString());

            CouponResponse updatedResponse = couponApi.updateCoupon(coupon.getCouponOid(), coupon, null);
            Coupon updatedCoupon = updatedResponse.getCoupon();

            // Display the updated coupon
            System.out.println(updatedCoupon);
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon_oid to update. | |
| **coupon** | [**Coupon**](Coupon.md)| Coupon to update | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |

### Return type

[**CouponResponse**](CouponResponse.md)

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

<a name="updateCoupons"></a>
# **updateCoupons**
> CouponsResponse updateCoupons(couponsRequest, expand, placeholders, async)

Update multiple coupons

Update multiple coupon on the UltraCart account. 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UpdateCoupons {
    public static void Execute() {
        System.out.println("--- " + UpdateCoupons.class.getSimpleName() + " ---");
        
        try {
            // Create coupon API instance using API key
            CouponApi couponApi = new CouponApi(Constants.API_KEY);

            String merchantCode = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);
            
            // Now create the coupon and ensure it exists.
            Coupon coupon = new Coupon();
            coupon.setMerchantCode(merchantCode);
            coupon.setDescription("Test coupon for GetCoupon");
            coupon.setAmountOffSubtotal(new CouponAmountOffSubtotal()); // one penny discount.
            coupon.getAmountOffSubtotal().setDiscountAmount(BigDecimal.valueOf(.01));
            coupon.getAmountOffSubtotal().setCurrencyCode("USD");


            CouponResponse couponResponse = couponApi.insertCoupon(coupon, null);
            coupon = couponResponse.getCoupon();
            
            // update the coupon. this can be difficult given the complexity of coupons. see insertCoupon sample for details.
            coupon.setExpirationDts(Instant.now().plus(90, ChronoUnit.DAYS).toString());

            // This example only has one coupon. But it's a trivial matter to add more coupons
            CouponsRequest couponsRequest = new CouponsRequest();
            List<Coupon> couponList = new ArrayList<>();
            couponList.add(coupon);
            couponsRequest.setCoupons(couponList);

            CouponsResponse updatedResponse = couponApi.updateCoupons(couponsRequest, null, false, false);
            List<Coupon> updatedCoupons = updatedResponse.getCoupons();

            // Display the updated coupons
            for (Coupon updatedCoupon : updatedCoupons) {
                System.out.println(updatedCoupon);
            }
            
            // Delete the coupon
            couponApi.deleteCoupon(coupon.getCouponOid());

        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponsRequest** | [**CouponsRequest**](CouponsRequest.md)| Coupons to update (synchronous maximum 50 / asynchronous maximum 100) | |
| **expand** | **String**| The object expansion to perform on the result.  See documentation for examples | [optional] |
| **placeholders** | **Boolean**| Whether or not placeholder values should be returned in the result.  Useful for UIs that consume this REST API. | [optional] |
| **async** | **Boolean**| True if the operation should be run async.  No result returned | [optional] |

### Return type

[**CouponsResponse**](CouponsResponse.md)

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

<a name="uploadCouponCodes"></a>
# **uploadCouponCodes**
> UploadCouponCodesResponse uploadCouponCodes(couponOid, uploadCouponCodesRequest)

Upload one-time codes for a coupon

Upload one-time codes for a coupon 

### Example

```java
package coupon;

import com.ultracart.admin.v2.CouponApi;
import com.ultracart.admin.v2.models.*;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UploadCouponCodes {
    /*
      uploadCouponCodes allows a merchant to upload one-time use codes and associate them with a merchant code (i.e. a coupon).
      UltraCart has methods for generating one-time codes, and they work well, but this method exists when the merchant generates
      them themselves. This frequently occurs when a merchant sends out a mailer with unique coupon codes on the mailer. The
      merchant can then upload those codes with this method.
    */
    public static void Execute() {
        System.out.println("--- " + UploadCouponCodes.class.getSimpleName() + " ---");
        
        try {
            // Create coupon API instance using API key
            CouponApi couponApi = new CouponApi(Constants.API_KEY);

            String merchantCode = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8);
            
            // Now create the coupon and ensure it exists.
            Coupon coupon = new Coupon();
            coupon.setMerchantCode(merchantCode);
            coupon.setDescription("Test coupon for GetCoupon");
            coupon.setAmountOffSubtotal(new CouponAmountOffSubtotal()); // one penny discount.
            coupon.getAmountOffSubtotal().setDiscountAmount(BigDecimal.valueOf(.01));
            coupon.getAmountOffSubtotal().setCurrencyCode("USD");


            CouponResponse couponResponse = couponApi.insertCoupon(coupon, null);
            coupon = couponResponse.getCoupon();
            
            // Create request for uploading coupon codes
            UploadCouponCodesRequest codesRequest = new UploadCouponCodesRequest();
            List<String> codes = new ArrayList<>();
            codes.add("code1");
            codes.add("code2");
            codes.add("code3");
            codesRequest.setCouponCodes(codes);
            
            // Upload the coupon codes
            UploadCouponCodesResponse apiResponse = couponApi.uploadCouponCodes(coupon.getCouponOid(), codesRequest);
            
            // Display results
            System.out.println("Uploaded codes:");
            for (String code : apiResponse.getUploadedCodes()) {
                System.out.println(code);
            }
            
            System.out.println("Duplicated codes:");
            for (String code : apiResponse.getDuplicateCodes()) {
                System.out.println(code);
            }
            
            System.out.println("Rejected codes:");
            for (String code : apiResponse.getRejectedCodes()) {
                System.out.println(code);
            }
            
            // Delete the coupon
            couponApi.deleteCoupon(coupon.getCouponOid());
            
        }
        catch (ApiException ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **couponOid** | **Integer**| The coupon oid to associate with the provided one-time codes. | |
| **uploadCouponCodesRequest** | [**UploadCouponCodesRequest**](UploadCouponCodesRequest.md)| One-time coupon codes | |

### Return type

[**UploadCouponCodesResponse**](UploadCouponCodesResponse.md)

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

