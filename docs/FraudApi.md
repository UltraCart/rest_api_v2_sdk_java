# FraudApi

All URIs are relative to *https://secure.ultracart.com/rest/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**declineEmail**](FraudApi.md#declineEmail) | **POST** /fraud/decline_email | Decline email during checkout fraud review |
| [**deleteFraudRule**](FraudApi.md#deleteFraudRule) | **DELETE** /fraud/rules/{fraud_rule_oid} | Delete a fraud rule |
| [**establishFraudRulesFromOrder**](FraudApi.md#establishFraudRulesFromOrder) | **POST** /fraud/rules/from_order | Establish fraud rules from an order |
| [**getFraudLookupValues**](FraudApi.md#getFraudLookupValues) | **GET** /fraud/lookup_values | Retrieve fraud rule lookup values |
| [**insertFraudRule**](FraudApi.md#insertFraudRule) | **POST** /fraud/rules | Insert a fraud rule |
| [**searchFraudRules**](FraudApi.md#searchFraudRules) | **POST** /fraud/rules/search | Search fraud rules |


<a name="declineEmail"></a>
# **declineEmail**
> declineEmail(fraudDeclineEmailsRequest)

Decline email during checkout fraud review

Adds one email address to the fraud decline list for this merchant account. 

### Example

```java
package fraud;

import com.ultracart.admin.v2.FraudApi;
import com.ultracart.admin.v2.models.FraudDeclineEmailRequest;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

/**
 * declineEmail is a shortcut for telling UltraCart to decline orders from a specific email
 * address. It is the quick alternative to building a full "address email" fraud rule by hand.
 */
public class DeclineEmail {
    public static void execute() {
        System.out.println("--- DeclineEmail ---");
        try {
            FraudApi fraudApi = new FraudApi(Constants.API_KEY);

            FraudDeclineEmailRequest declineRequest = new FraudDeclineEmailRequest();
            declineRequest.setEmail("chargeback-charlie@example.com");

            fraudApi.declineEmail(declineRequest);

            System.out.println("Declined email: " + declineRequest.getEmail());
        } catch (ApiException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fraudDeclineEmailsRequest** | [**FraudDeclineEmailRequest**](FraudDeclineEmailRequest.md)| Fraud decline emails request | |

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

<a name="deleteFraudRule"></a>
# **deleteFraudRule**
> deleteFraudRule(fraudRuleOid)

Delete a fraud rule

Deletes a fraud rule for this merchant account. 

### Example

```java
package fraud;

import com.ultracart.admin.v2.FraudApi;
import com.ultracart.admin.v2.models.FraudRuleInsertRequest;
import com.ultracart.admin.v2.models.FraudRuleResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;

/**
 * deleteFraudRule removes a fraud rule by its oid.
 *
 * To keep this sample self-contained it first inserts a throwaway rule, then deletes it using
 * the oid returned from the insert. In your own code you would already have the oid of the rule
 * you want to remove (for example from SearchFraudRules).
 */
public class DeleteFraudRule {
    public static void execute() {
        System.out.println("--- DeleteFraudRule ---");
        try {
            FraudApi fraudApi = new FraudApi(Constants.API_KEY);

            // Insert a rule so we have something to delete.
            FraudRuleInsertRequest rule = new FraudRuleInsertRequest();
            rule.setRuleType(FraudRuleInsertRequest.RuleTypeEnum.CREDIT_CARD_SINGLE_TRANSACTION_EXCEEDS);
            rule.setAmountThreshold(BigDecimal.valueOf(2500.00));
            rule.setFailureAction(FraudRuleInsertRequest.FailureActionEnum.FLAG_FOR_REVIEW);
            rule.setAutoNote("Temporary rule created by the DeleteFraudRule sample");

            FraudRuleResponse insertResponse = fraudApi.insertFraudRule(rule);
            Integer fraudRuleOid = insertResponse.getFraudRule().getFraudRuleOid();
            System.out.println("Inserted temporary rule, oid = " + fraudRuleOid);

            // Now delete it.
            fraudApi.deleteFraudRule(fraudRuleOid);
            System.out.println("Deleted fraud rule oid = " + fraudRuleOid);
        } catch (ApiException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fraudRuleOid** | **Integer**|  | |

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

<a name="establishFraudRulesFromOrder"></a>
# **establishFraudRulesFromOrder**
> FraudRulesResponse establishFraudRulesFromOrder(fraudRuleFromOrderRequest)

Establish fraud rules from an order

Creates one or more fraud rules for this merchant account derived from an existing order, mirroring the &#39;establish fraud filter&#39; action in the order processing screen. Select which filters to establish; all values are taken from the order. The IP rule is created against the order&#39;s /24 subnet (last octet masked). The credit card filter duplicates the order&#39;s stored card vault token, so no card number is sent through the API. Filters whose order data is missing (no stored card, no email, no usable IP, or no numeric street) are skipped and reported in the warning slot rather than failing the request. 

### Example

```java
package fraud;

import com.ultracart.admin.v2.FraudApi;
import com.ultracart.admin.v2.models.FraudRuleFromOrderRequest;
import com.ultracart.admin.v2.models.FraudRulePublic;
import com.ultracart.admin.v2.models.FraudRulesResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

/**
 * establishFraudRulesFromOrder is a shortcut that derives fraud rules from an existing order.
 * Point it at an order you have identified as fraudulent and tell it which attributes of that
 * order to turn into rules: the email, the credit card, the ip address, and/or the address.
 * It creates the matching rules and returns them. This is the fast way to "block everything
 * associated with this bad order" instead of building each rule by hand.
 *
 * Not every filter produces a rule; the order must actually have that attribute. For example an
 * order with no stored card data will not produce a credit card rule.
 */
public class EstablishFraudRulesFromOrder {
    public static void execute() {
        System.out.println("--- EstablishFraudRulesFromOrder ---");
        try {
            FraudApi fraudApi = new FraudApi(Constants.API_KEY);

            FraudRuleFromOrderRequest request = new FraudRuleFromOrderRequest();
            request.setOrderId("DEMO-0009104434");
            request.setEstablishEmailFilter(true);
            request.setEstablishCardFilter(true);
            request.setEstablishIpFilter(true);
            request.setEstablishAddressFilter(true);
            request.setFailureAction(FraudRuleFromOrderRequest.FailureActionEnum.FLAG_FOR_REVIEW);
            request.setAutoNote("Established from fraudulent order DEMO-0009104434");

            FraudRulesResponse apiResponse = fraudApi.establishFraudRulesFromOrder(request);

            System.out.println("Established " + apiResponse.getFraudRules().size() + " rule(s) from the order:");
            for (FraudRulePublic fraudRule : apiResponse.getFraudRules()) {
                System.out.println("  oid " + fraudRule.getFraudRuleOid() + " - " + fraudRule.getRuleType() + " - " + fraudRule.getAutoNote());
            }
        } catch (ApiException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fraudRuleFromOrderRequest** | [**FraudRuleFromOrderRequest**](FraudRuleFromOrderRequest.md)| Fraud rule from order request | |

### Return type

[**FraudRulesResponse**](FraudRulesResponse.md)

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

<a name="getFraudLookupValues"></a>
# **getFraudLookupValues**
> FraudLookupValuesResponse getFraudLookupValues()

Retrieve fraud rule lookup values

Returns the dropdown values required to build valid fraud rule insert and search requests. Includes rule types, failure actions, user actions, IP range types, AVS match types, the merchant&#39;s rotating transaction gateways, screen branding themes, countries, and affiliates. 

### Example

```java
package fraud;

import com.ultracart.admin.v2.FraudApi;
import com.ultracart.admin.v2.models.FraudLookupValues;
import com.ultracart.admin.v2.models.FraudLookupValuesResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

/**
 * getFraudLookupValues returns the lookup values used when building fraud rules:
 * the allowed countries, affiliates, ip range types, rule groups, and rule types.
 * Call this first when constructing a rule so you supply valid values.
 */
public class GetFraudLookupValues {
    public static void execute() {
        System.out.println("--- GetFraudLookupValues ---");
        try {
            FraudApi fraudApi = new FraudApi(Constants.API_KEY);

            FraudLookupValuesResponse apiResponse = fraudApi.getFraudLookupValues();
            FraudLookupValues lookupValues = apiResponse.getFraudLookupValues();

            System.out.println("Rule types: " + lookupValues.getRuleTypes());
            System.out.println("Rule groups: " + lookupValues.getRuleGroups());
            System.out.println("IP range types: " + lookupValues.getIpRangeTypes());
            System.out.println("Countries: " + lookupValues.getCountries());
        } catch (ApiException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**FraudLookupValuesResponse**](FraudLookupValuesResponse.md)

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

<a name="insertFraudRule"></a>
# **insertFraudRule**
> FraudRuleResponse insertFraudRule(fraudRuleInsertRequest)

Insert a fraud rule

Creates a fraud rule for this merchant account. Field names in the request body are semantic (eg amount_threshold, email, ip_address). Call GET /v2/fraud/lookup_values for the list of valid rule_type, failure_action, and related dropdown values. The &#39;credit card matches&#39; rule type is not supported via REST. 

### Example

```java
package fraud;

import com.ultracart.admin.v2.FraudApi;
import com.ultracart.admin.v2.models.FraudRuleInsertRequest;
import com.ultracart.admin.v2.models.FraudRulePublic;
import com.ultracart.admin.v2.models.FraudRuleResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * insertFraudRule creates a single fraud rule. Each rule has a rule_type (what it inspects),
 * a failure_action (what happens when it matches), and type-specific fields such as an amount
 * threshold, country code, ip address, or email.
 *
 * This sample has some fun and inserts several rules of different types in one run. Call
 * GetFraudLookupValues.java to see every valid rule_type and the other lookup values.
 */
public class InsertFraudRule {
    public static void execute() {
        System.out.println("--- InsertFraudRule ---");
        try {
            FraudApi fraudApi = new FraudApi(Constants.API_KEY);

            List<FraudRuleInsertRequest> rules = new ArrayList<>();

            // 1. Decline any order placed with a known-bad email address.
            FraudRuleInsertRequest emailRule = new FraudRuleInsertRequest();
            emailRule.setRuleType(FraudRuleInsertRequest.RuleTypeEnum.ADDRESS_EMAIL);
            emailRule.setEmail("chargeback-charlie@example.com");
            emailRule.setFailureAction(FraudRuleInsertRequest.FailureActionEnum.DECLINE_TRANSACTION);
            emailRule.setAutoNote("Known chargeback email - decline on sight");
            rules.add(emailRule);

            // 2. Flag large single credit card transactions over $1,000 for manual review.
            FraudRuleInsertRequest largeTxnRule = new FraudRuleInsertRequest();
            largeTxnRule.setRuleType(FraudRuleInsertRequest.RuleTypeEnum.CREDIT_CARD_SINGLE_TRANSACTION_EXCEEDS);
            largeTxnRule.setAmountThreshold(BigDecimal.valueOf(1000.00));
            largeTxnRule.setFailureAction(FraudRuleInsertRequest.FailureActionEnum.FLAG_FOR_REVIEW);
            largeTxnRule.setAutoNote("Large single transaction - review before shipping");
            rules.add(largeTxnRule);

            // 3. Decline orders that ship outside the United States.
            FraudRuleInsertRequest countryRule = new FraudRuleInsertRequest();
            countryRule.setRuleType(FraudRuleInsertRequest.RuleTypeEnum.ADDRESS_NOT_IN_COUNTRY);
            countryRule.setCountryCode("US");
            countryRule.setFailureAction(FraudRuleInsertRequest.FailureActionEnum.DECLINE_TRANSACTION);
            countryRule.setAutoNote("Domestic shipping only");
            rules.add(countryRule);

            // 4. Decline transactions originating from a specific bad IP address.
            FraudRuleInsertRequest ipRule = new FraudRuleInsertRequest();
            ipRule.setRuleType(FraudRuleInsertRequest.RuleTypeEnum.IP_MATCHES);
            ipRule.setIpAddress("203.0.113.66");
            ipRule.setIpRangeType(FraudRuleInsertRequest.IpRangeTypeEnum.ADDRESS);
            ipRule.setFailureAction(FraudRuleInsertRequest.FailureActionEnum.DECLINE_TRANSACTION);
            ipRule.setAutoNote("Blocked IP address");
            rules.add(ipRule);

            // 5. Flag prepaid credit cards for review.
            FraudRuleInsertRequest prepaidRule = new FraudRuleInsertRequest();
            prepaidRule.setRuleType(FraudRuleInsertRequest.RuleTypeEnum.CREDIT_CARD_BLOCK_PREPAID);
            prepaidRule.setFailureAction(FraudRuleInsertRequest.FailureActionEnum.FLAG_FOR_REVIEW);
            prepaidRule.setAutoNote("Prepaid card - take a closer look");
            rules.add(prepaidRule);

            // 6. Flag a customer IP making more than 10 transactions in a single day.
            FraudRuleInsertRequest velocityRule = new FraudRuleInsertRequest();
            velocityRule.setRuleType(FraudRuleInsertRequest.RuleTypeEnum.IP_DAILY_TRANSACTION_COUNT_EXCEEDS);
            velocityRule.setCountThreshold(10);
            velocityRule.setIpRangeType(FraudRuleInsertRequest.IpRangeTypeEnum.ADDRESS);
            velocityRule.setUserAction(FraudRuleInsertRequest.UserActionEnum.ATTEMPTED);
            velocityRule.setFailureAction(FraudRuleInsertRequest.FailureActionEnum.FLAG_FOR_REVIEW);
            velocityRule.setAutoNote("IP velocity - more than 10 orders in a day");
            rules.add(velocityRule);

            for (FraudRuleInsertRequest rule : rules) {
                FraudRuleResponse apiResponse = fraudApi.insertFraudRule(rule);
                FraudRulePublic created = apiResponse.getFraudRule();
                System.out.println("Inserted '" + rule.getRuleType() + "' rule, oid = " + created.getFraudRuleOid());
            }
        } catch (ApiException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fraudRuleInsertRequest** | [**FraudRuleInsertRequest**](FraudRuleInsertRequest.md)| Fraud rule insert request | |

### Return type

[**FraudRuleResponse**](FraudRuleResponse.md)

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

<a name="searchFraudRules"></a>
# **searchFraudRules**
> FraudRulesResponse searchFraudRules(fraudRuleSearchRequest, limit, offset, sort)

Search fraud rules

Searches fraud rules for this merchant account using semantic filter fields. Pagination and sort are passed as query parameters (_limit, _offset, _sort). You will need to make multiple API calls in order to retrieve the entire result set since this API performs result set pagination. Results are capped at 10,000 records by ElasticSearch and the warning slot indicates when that cap was hit. Use more selective filters in that case. 

### Example

```java
package fraud;

import com.ultracart.admin.v2.FraudApi;
import com.ultracart.admin.v2.models.FraudRulePublic;
import com.ultracart.admin.v2.models.FraudRuleSearchRequest;
import com.ultracart.admin.v2.models.FraudRulesResponse;
import com.ultracart.admin.v2.util.ApiException;
import common.Constants;

/**
 * searchFraudRules returns the fraud rules that match the supplied criteria. Every field on the
 * FraudRuleSearchRequest is optional; supply only the ones you want to filter on. Pagination and
 * sort are passed as the limit, offset, and sort parameters.
 *
 * This sample searches for every rule whose action is "Decline Transaction".
 */
public class SearchFraudRules {
    public static void execute() {
        System.out.println("--- SearchFraudRules ---");
        try {
            FraudApi fraudApi = new FraudApi(Constants.API_KEY);

            FraudRuleSearchRequest searchRequest = new FraudRuleSearchRequest();
            searchRequest.setFailureAction(FraudRuleSearchRequest.FailureActionEnum.DECLINE_TRANSACTION);

            Integer limit = 200;
            Integer offset = 0;
            String sort = null;

            FraudRulesResponse apiResponse = fraudApi.searchFraudRules(searchRequest, limit, offset, sort);

            System.out.println("Found " + apiResponse.getFraudRules().size() + " rule(s) with action 'Decline Transaction'");
            for (FraudRulePublic fraudRule : apiResponse.getFraudRules()) {
                System.out.println("  oid " + fraudRule.getFraudRuleOid() + " - " + fraudRule.getRuleType() + " - " + fraudRule.getAutoNote());
            }
        } catch (ApiException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```


### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **fraudRuleSearchRequest** | [**FraudRuleSearchRequest**](FraudRuleSearchRequest.md)| Fraud rule search request | |
| **limit** | **Integer**| The maximum number of records to return on this one API call. (Maximum 200) | [optional] [default to 100] |
| **offset** | **Integer**| Pagination of the record set.  Offset is a zero based index. | [optional] [default to 0] |
| **sort** | **String**| The sort order of the fraud rules.  See Sorting documentation for examples of using multiple values and sorting by ascending and descending. | [optional] |

### Return type

[**FraudRulesResponse**](FraudRulesResponse.md)

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

