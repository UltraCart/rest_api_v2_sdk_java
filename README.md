# rest-sdk

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.ultracart</groupId>
    <artifactId>rest-sdk</artifactId>
    <version>1.0.4</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.ultracart:rest-sdk:1.0.4"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/rest-sdk-1.0.4.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.ultracart.admin.v2.FulfillmentApi;
import com.ultracart.admin.v2.models.Order;
import com.ultracart.admin.v2.models.OrdersResponse;
import com.ultracart.admin.v2.swagger.ApiClient;
import com.ultracart.admin.v2.swagger.ApiException;
import com.ultracart.admin.v2.swagger.Configuration;
import com.ultracart.admin.v2.swagger.auth.ApiKeyAuth;

import java.util.List;

public class FulfillmentSample {

  private static final String API_KEY = "4256aaf6dfedfa01582fe9a961ab0100216d737b874a4801582fe9a961ab0100";

  private static void initClient(){
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    ApiKeyAuth ultraCartSimpleApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ultraCartSimpleApiKey");
    ultraCartSimpleApiKey.setApiKey(API_KEY);

    defaultClient.addDefaultHeader("X-UltraCart-Api-Version", "2017-03-01");

    defaultClient.setDebugging(true);
    defaultClient.setVerifyingSsl(false);
  }

  public static void main(String ... args) {
    initClient();

    FulfillmentApi api = new FulfillmentApi();
    String distributionCenterCode = "DFLT";

    try {
      OrdersResponse ordersResponse = api.getDistributionCenterOrders(distributionCenterCode);
      List<Order> orders = ordersResponse.getOrders();
      System.out.println("There are " + orders.size() + " in distribution center [" + distributionCenterCode + "]");
      for (Order order : orders) {
        System.out.println(order);
      }

    } catch (ApiException e) {
        System.err.println("Exception when calling FulfillmentApi#getDistributionCenterOrders");
        e.printStackTrace();
    }
  }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://secure.ultracart.com/rest/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AffiliateApi* | [**getClicksByQuery**](docs/AffiliateApi.md#getClicksByQuery) | **POST** /affiliate/clicks/query | Retrieve clicks
*AffiliateApi* | [**getLedgersByQuery**](docs/AffiliateApi.md#getLedgersByQuery) | **POST** /affiliate/ledgers/query | Retrieve ledger entries
*AutoOrderApi* | [**getAutoOrder**](docs/AutoOrderApi.md#getAutoOrder) | **GET** /auto_order/auto_orders/{auto_order_oid} | Retrieve an auto order
*AutoOrderApi* | [**getAutoOrderByCode**](docs/AutoOrderApi.md#getAutoOrderByCode) | **GET** /auto_order/auto_orders/code/{auto_order_code} | Retrieve an auto order
*AutoOrderApi* | [**getAutoOrderByReferenceOrderId**](docs/AutoOrderApi.md#getAutoOrderByReferenceOrderId) | **GET** /auto_order/auto_orders/reference_order_id/{reference_order_id} | Retrieve an auto order
*AutoOrderApi* | [**getAutoOrders**](docs/AutoOrderApi.md#getAutoOrders) | **GET** /auto_order/auto_orders | Retrieve auto orders
*AutoOrderApi* | [**updateAutoOrder**](docs/AutoOrderApi.md#updateAutoOrder) | **PUT** /auto_order/auto_orders/{auto_order_oid} | Update an auto order
*ChargebackApi* | [**deleteChargeback**](docs/ChargebackApi.md#deleteChargeback) | **DELETE** /chargeback/chargebacks/{chargeback_dispute_oid} | Delete a chargeback
*ChargebackApi* | [**getChargebackDispute**](docs/ChargebackApi.md#getChargebackDispute) | **GET** /chargeback/chargebacks/{chargeback_dispute_oid} | Retrieve a chargeback
*ChargebackApi* | [**getChargebackDisputes**](docs/ChargebackApi.md#getChargebackDisputes) | **GET** /chargeback/chargebacks | Retrieve chargebacks
*ChargebackApi* | [**insertChargeback**](docs/ChargebackApi.md#insertChargeback) | **POST** /chargeback/chargebacks | Insert a chargeback
*ChargebackApi* | [**updateChargeback**](docs/ChargebackApi.md#updateChargeback) | **PUT** /chargeback/chargebacks/{chargeback_dispute_oid} | Update a chargeback
*CheckoutApi* | [**cityState**](docs/CheckoutApi.md#cityState) | **POST** /checkout/city_state | City/State for Zip
*CheckoutApi* | [**finalizeOrder**](docs/CheckoutApi.md#finalizeOrder) | **POST** /checkout/cart/finalizeOrder | Finalize Order
*CheckoutApi* | [**getCart**](docs/CheckoutApi.md#getCart) | **GET** /checkout/cart | Get cart
*CheckoutApi* | [**getCartByCartId**](docs/CheckoutApi.md#getCartByCartId) | **GET** /checkout/cart/{cart_id} | Get cart (by cart id)
*CheckoutApi* | [**getCartByReturnCode**](docs/CheckoutApi.md#getCartByReturnCode) | **GET** /checkout/return/{return_code} | Get cart (by return code)
*CheckoutApi* | [**handoffCart**](docs/CheckoutApi.md#handoffCart) | **POST** /checkout/cart/handoff | Handoff cart
*CheckoutApi* | [**login**](docs/CheckoutApi.md#login) | **POST** /checkout/cart/profile/login | Profile login
*CheckoutApi* | [**logout**](docs/CheckoutApi.md#logout) | **POST** /checkout/cart/profile/logout | Profile logout
*CheckoutApi* | [**register**](docs/CheckoutApi.md#register) | **POST** /checkout/cart/profile/register | Profile registration
*CheckoutApi* | [**relatedItemsForCart**](docs/CheckoutApi.md#relatedItemsForCart) | **POST** /checkout/related_items | Related items
*CheckoutApi* | [**relatedItemsForItem**](docs/CheckoutApi.md#relatedItemsForItem) | **POST** /checkout/relatedItems/{item_id} | Related items (specific item)
*CheckoutApi* | [**setupBrowserKey**](docs/CheckoutApi.md#setupBrowserKey) | **PUT** /checkout/browser_key | Setup Browser Application
*CheckoutApi* | [**updateCart**](docs/CheckoutApi.md#updateCart) | **PUT** /checkout/cart | Update cart
*CheckoutApi* | [**validateCart**](docs/CheckoutApi.md#validateCart) | **POST** /checkout/cart/validate | Validate
*CouponApi* | [**deleteCoupon**](docs/CouponApi.md#deleteCoupon) | **DELETE** /coupon/coupons/{coupon_oid} | Delete a coupon
*CouponApi* | [**generateCouponCodes**](docs/CouponApi.md#generateCouponCodes) | **POST** /coupon/coupons/{coupon_oid}/generate_codes | Generates one time codes for a coupon
*CouponApi* | [**generateOneTimeCodesByMerchantCode**](docs/CouponApi.md#generateOneTimeCodesByMerchantCode) | **POST** /coupon/coupons/merchant_code/{merchant_code}/generate_codes | Generates one time codes by merchant code
*CouponApi* | [**getCoupon**](docs/CouponApi.md#getCoupon) | **GET** /coupon/coupons/{coupon_oid} | Retrieve a coupon
*CouponApi* | [**getCouponByMerchantCode**](docs/CouponApi.md#getCouponByMerchantCode) | **GET** /coupon/coupons/merchant_code/{merchant_code} | Retrieve a coupon by merchant code
*CouponApi* | [**getCoupons**](docs/CouponApi.md#getCoupons) | **GET** /coupon/coupons | Retrieve coupons
*CouponApi* | [**getCouponsByQuery**](docs/CouponApi.md#getCouponsByQuery) | **GET** /coupon/coupons/query | Retrieve coupons by query
*CouponApi* | [**getEditorValues**](docs/CouponApi.md#getEditorValues) | **GET** /coupon/editor_values | Retrieve values needed for a coupon editor
*CouponApi* | [**insertCoupon**](docs/CouponApi.md#insertCoupon) | **POST** /coupon/coupons | Insert a coupon
*CouponApi* | [**updateCoupon**](docs/CouponApi.md#updateCoupon) | **PUT** /coupon/coupons/{coupon_oid} | Update a coupon
*CustomerApi* | [**deleteCustomer**](docs/CustomerApi.md#deleteCustomer) | **DELETE** /customer/customers/{customer_profile_oid} | Delete a customer
*CustomerApi* | [**getCustomer**](docs/CustomerApi.md#getCustomer) | **GET** /customer/customers/{customer_profile_oid} | Retrieve a customer
*CustomerApi* | [**getCustomers**](docs/CustomerApi.md#getCustomers) | **GET** /customer/customers | Retrieve customers
*CustomerApi* | [**getCustomersByQuery**](docs/CustomerApi.md#getCustomersByQuery) | **GET** /customer/customers/query | Retrieve customers by query
*CustomerApi* | [**getEditorValues**](docs/CustomerApi.md#getEditorValues) | **GET** /customer/editor_values | Retrieve values needed for a customer profile editor
*CustomerApi* | [**insertCustomer**](docs/CustomerApi.md#insertCustomer) | **POST** /customer/customers | Insert a customer
*CustomerApi* | [**updateCustomer**](docs/CustomerApi.md#updateCustomer) | **PUT** /customer/customers/{customer_profile_oid} | Update a customer
*FulfillmentApi* | [**acknowledgeOrders**](docs/FulfillmentApi.md#acknowledgeOrders) | **PUT** /fulfillment/distribution_centers/{distribution_center_code}/acknowledgements | Acknowledge receipt of orders.
*FulfillmentApi* | [**getDistributionCenterOrders**](docs/FulfillmentApi.md#getDistributionCenterOrders) | **GET** /fulfillment/distribution_centers/{distribution_center_code}/orders | Retrieve orders queued up for this distribution center.
*FulfillmentApi* | [**getDistributionCenters**](docs/FulfillmentApi.md#getDistributionCenters) | **GET** /fulfillment/distribution_centers | Retrieve distribution centers
*FulfillmentApi* | [**shipOrders**](docs/FulfillmentApi.md#shipOrders) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/shipments | Mark orders as shipped
*FulfillmentApi* | [**updateInventory**](docs/FulfillmentApi.md#updateInventory) | **POST** /fulfillment/distribution_centers/{distribution_center_code}/inventory | Update inventory
*ItemApi* | [**deleteItem**](docs/ItemApi.md#deleteItem) | **DELETE** /item/items/{merchant_item_oid} | Delete an item
*ItemApi* | [**getItem**](docs/ItemApi.md#getItem) | **GET** /item/items/{merchant_item_oid} | Retrieve an item
*ItemApi* | [**getItemByMerchantItemId**](docs/ItemApi.md#getItemByMerchantItemId) | **GET** /item/items/merchant_item_id/{merchant_item_id} | Retrieve an item by item id
*ItemApi* | [**getItems**](docs/ItemApi.md#getItems) | **GET** /item/items | Retrieve items
*ItemApi* | [**insertItem**](docs/ItemApi.md#insertItem) | **POST** /item/items | Create an item
*ItemApi* | [**updateItem**](docs/ItemApi.md#updateItem) | **PUT** /item/items/{merchant_item_oid} | Update an item
*ItemApi* | [**updateItems**](docs/ItemApi.md#updateItems) | **PUT** /item/items/batch | Update multiple items
*ItemApi* | [**uploadTemporaryMultimedia**](docs/ItemApi.md#uploadTemporaryMultimedia) | **POST** /item/temp_multimedia | Upload an image to the temporary multimedia.
*OauthApi* | [**oauthAccessToken**](docs/OauthApi.md#oauthAccessToken) | **POST** /oauth/token | Exchange authorization code for access token.
*OauthApi* | [**oauthRevoke**](docs/OauthApi.md#oauthRevoke) | **POST** /oauth/revoke | Revoke this OAuth application.
*OrderApi* | [**cancelOrder**](docs/OrderApi.md#cancelOrder) | **POST** /order/orders/{order_id}/cancel | Cancel an order
*OrderApi* | [**deleteOrder**](docs/OrderApi.md#deleteOrder) | **DELETE** /order/orders/{order_id} | Delete an order
*OrderApi* | [**getOrder**](docs/OrderApi.md#getOrder) | **GET** /order/orders/{order_id} | Retrieve an order
*OrderApi* | [**getOrders**](docs/OrderApi.md#getOrders) | **GET** /order/orders | Retrieve orders
*OrderApi* | [**getOrdersByQuery**](docs/OrderApi.md#getOrdersByQuery) | **POST** /order/orders/query | Retrieve orders
*OrderApi* | [**refundOrder**](docs/OrderApi.md#refundOrder) | **PUT** /order/orders/{order_id}/refund | Refund an order
*OrderApi* | [**resendReceipt**](docs/OrderApi.md#resendReceipt) | **POST** /order/orders/{order_id}/resend_receipt | Resend receipt
*OrderApi* | [**resendShipmentConfirmation**](docs/OrderApi.md#resendShipmentConfirmation) | **POST** /order/orders/{order_id}/resend_shipment_confirmation | Resend shipment confirmation
*OrderApi* | [**updateOrder**](docs/OrderApi.md#updateOrder) | **PUT** /order/orders/{order_id} | Update an order
*WebhookApi* | [**deleteWebhook**](docs/WebhookApi.md#deleteWebhook) | **DELETE** /webhook/webhooks/{webhookOid} | Delete a webhook
*WebhookApi* | [**getWebhookLog**](docs/WebhookApi.md#getWebhookLog) | **GET** /webhook/webhooks/{webhookOid}/logs/{requestId} | Retrieve an individual log
*WebhookApi* | [**getWebhookLogSummaries**](docs/WebhookApi.md#getWebhookLogSummaries) | **GET** /webhook/webhooks/{webhookOid}/logs | Retrieve the log summaries
*WebhookApi* | [**getWebhooks**](docs/WebhookApi.md#getWebhooks) | **GET** /webhook/webhooks | Retrieve webhooks
*WebhookApi* | [**insertWebhook**](docs/WebhookApi.md#insertWebhook) | **POST** /webhook/webhooks | Add a webhook
*WebhookApi* | [**resendEvent**](docs/WebhookApi.md#resendEvent) | **POST** /webhook/webhooks/{webhookOid}/reflow/{eventName} | Resend events to the webhook endpoint.
*WebhookApi* | [**updateWebhook**](docs/WebhookApi.md#updateWebhook) | **PUT** /webhook/webhooks/{webhookOid} | Update a webhook


## Documentation for Models

 - [AffiliateClick](docs/AffiliateClick.md)
 - [AffiliateClickQuery](docs/AffiliateClickQuery.md)
 - [AffiliateClicksResponse](docs/AffiliateClicksResponse.md)
 - [AffiliateLedger](docs/AffiliateLedger.md)
 - [AffiliateLedgerQuery](docs/AffiliateLedgerQuery.md)
 - [AffiliateLedgersResponse](docs/AffiliateLedgersResponse.md)
 - [AffiliateLink](docs/AffiliateLink.md)
 - [ApiUserApplicationProfile](docs/ApiUserApplicationProfile.md)
 - [AutoOrder](docs/AutoOrder.md)
 - [AutoOrderItem](docs/AutoOrderItem.md)
 - [AutoOrderItemOption](docs/AutoOrderItemOption.md)
 - [AutoOrderResponse](docs/AutoOrderResponse.md)
 - [AutoOrdersResponse](docs/AutoOrdersResponse.md)
 - [BaseResponse](docs/BaseResponse.md)
 - [Cart](docs/Cart.md)
 - [CartAffiliate](docs/CartAffiliate.md)
 - [CartBilling](docs/CartBilling.md)
 - [CartBuysafe](docs/CartBuysafe.md)
 - [CartCheckout](docs/CartCheckout.md)
 - [CartCoupon](docs/CartCoupon.md)
 - [CartCustomerProfile](docs/CartCustomerProfile.md)
 - [CartCustomerProfileAddress](docs/CartCustomerProfileAddress.md)
 - [CartCustomerProfileCreditCard](docs/CartCustomerProfileCreditCard.md)
 - [CartFinalizeOrderRequest](docs/CartFinalizeOrderRequest.md)
 - [CartFinalizeOrderRequestOptions](docs/CartFinalizeOrderRequestOptions.md)
 - [CartFinalizeOrderResponse](docs/CartFinalizeOrderResponse.md)
 - [CartGift](docs/CartGift.md)
 - [CartGiftCertificate](docs/CartGiftCertificate.md)
 - [CartItem](docs/CartItem.md)
 - [CartItemAttribute](docs/CartItemAttribute.md)
 - [CartItemMultimedia](docs/CartItemMultimedia.md)
 - [CartItemMultimediaThumbnail](docs/CartItemMultimediaThumbnail.md)
 - [CartItemOption](docs/CartItemOption.md)
 - [CartItemOptionValue](docs/CartItemOptionValue.md)
 - [CartItemPhysical](docs/CartItemPhysical.md)
 - [CartItemVariationSelection](docs/CartItemVariationSelection.md)
 - [CartKitComponentOption](docs/CartKitComponentOption.md)
 - [CartMarketing](docs/CartMarketing.md)
 - [CartPayment](docs/CartPayment.md)
 - [CartPaymentAmazon](docs/CartPaymentAmazon.md)
 - [CartPaymentCheck](docs/CartPaymentCheck.md)
 - [CartPaymentCreditCard](docs/CartPaymentCreditCard.md)
 - [CartPaymentPurchaseOrder](docs/CartPaymentPurchaseOrder.md)
 - [CartProfileLoginRequest](docs/CartProfileLoginRequest.md)
 - [CartProfileLoginResponse](docs/CartProfileLoginResponse.md)
 - [CartProfileRegisterRequest](docs/CartProfileRegisterRequest.md)
 - [CartProfileRegisterResponse](docs/CartProfileRegisterResponse.md)
 - [CartResponse](docs/CartResponse.md)
 - [CartSettings](docs/CartSettings.md)
 - [CartSettingsBilling](docs/CartSettingsBilling.md)
 - [CartSettingsGift](docs/CartSettingsGift.md)
 - [CartSettingsGiftWrap](docs/CartSettingsGiftWrap.md)
 - [CartSettingsPayment](docs/CartSettingsPayment.md)
 - [CartSettingsPaymentAmazon](docs/CartSettingsPaymentAmazon.md)
 - [CartSettingsPaymentCreditCard](docs/CartSettingsPaymentCreditCard.md)
 - [CartSettingsPaymentPayPal](docs/CartSettingsPaymentPayPal.md)
 - [CartSettingsProvince](docs/CartSettingsProvince.md)
 - [CartSettingsShipping](docs/CartSettingsShipping.md)
 - [CartSettingsShippingCalendar](docs/CartSettingsShippingCalendar.md)
 - [CartSettingsShippingEstimate](docs/CartSettingsShippingEstimate.md)
 - [CartSettingsTaxes](docs/CartSettingsTaxes.md)
 - [CartSettingsTerms](docs/CartSettingsTerms.md)
 - [CartShipping](docs/CartShipping.md)
 - [CartSummary](docs/CartSummary.md)
 - [CartTaxes](docs/CartTaxes.md)
 - [CartUpsellAfter](docs/CartUpsellAfter.md)
 - [CartValidationRequest](docs/CartValidationRequest.md)
 - [CartValidationResponse](docs/CartValidationResponse.md)
 - [ChargebackDispute](docs/ChargebackDispute.md)
 - [ChargebackDisputeResponse](docs/ChargebackDisputeResponse.md)
 - [ChargebackDisputesResponse](docs/ChargebackDisputesResponse.md)
 - [CheckoutHandoffRequest](docs/CheckoutHandoffRequest.md)
 - [CheckoutHandoffResponse](docs/CheckoutHandoffResponse.md)
 - [CheckoutSetupBrowserKeyRequest](docs/CheckoutSetupBrowserKeyRequest.md)
 - [CheckoutSetupBrowserKeyResponse](docs/CheckoutSetupBrowserKeyResponse.md)
 - [CityStateZip](docs/CityStateZip.md)
 - [Coupon](docs/Coupon.md)
 - [CouponAmountOffItems](docs/CouponAmountOffItems.md)
 - [CouponAmountOffShipping](docs/CouponAmountOffShipping.md)
 - [CouponAmountOffShippingWithItemsPurchase](docs/CouponAmountOffShippingWithItemsPurchase.md)
 - [CouponAmountOffSubtotal](docs/CouponAmountOffSubtotal.md)
 - [CouponAmountOffSubtotalAndShipping](docs/CouponAmountOffSubtotalAndShipping.md)
 - [CouponAmountOffSubtotalFreeShippingWithPurchase](docs/CouponAmountOffSubtotalFreeShippingWithPurchase.md)
 - [CouponAmountOffSubtotalWithBlockPurchase](docs/CouponAmountOffSubtotalWithBlockPurchase.md)
 - [CouponAmountOffSubtotalWithItemsPurchase](docs/CouponAmountOffSubtotalWithItemsPurchase.md)
 - [CouponCodesRequest](docs/CouponCodesRequest.md)
 - [CouponCodesResponse](docs/CouponCodesResponse.md)
 - [CouponDiscountItemWithItemPurchase](docs/CouponDiscountItemWithItemPurchase.md)
 - [CouponDiscountItems](docs/CouponDiscountItems.md)
 - [CouponEditorValues](docs/CouponEditorValues.md)
 - [CouponFreeItemAndShippingWithSubtotal](docs/CouponFreeItemAndShippingWithSubtotal.md)
 - [CouponFreeItemWithItemPurchase](docs/CouponFreeItemWithItemPurchase.md)
 - [CouponFreeItemWithSubtotal](docs/CouponFreeItemWithSubtotal.md)
 - [CouponFreeItemsWithItemPurchase](docs/CouponFreeItemsWithItemPurchase.md)
 - [CouponFreeItemsWithMixMatchPurchase](docs/CouponFreeItemsWithMixMatchPurchase.md)
 - [CouponFreeShipping](docs/CouponFreeShipping.md)
 - [CouponFreeShippingSpecificItems](docs/CouponFreeShippingSpecificItems.md)
 - [CouponFreeShippingWithItemsPurchase](docs/CouponFreeShippingWithItemsPurchase.md)
 - [CouponFreeShippingWithSubtotal](docs/CouponFreeShippingWithSubtotal.md)
 - [CouponMultipleAmountsOffItems](docs/CouponMultipleAmountsOffItems.md)
 - [CouponNoDiscount](docs/CouponNoDiscount.md)
 - [CouponPercentOffItemWithItemsQuantityPurchase](docs/CouponPercentOffItemWithItemsQuantityPurchase.md)
 - [CouponPercentOffItems](docs/CouponPercentOffItems.md)
 - [CouponPercentOffItemsAndFreeShipping](docs/CouponPercentOffItemsAndFreeShipping.md)
 - [CouponPercentOffItemsWithItemsPurchase](docs/CouponPercentOffItemsWithItemsPurchase.md)
 - [CouponPercentOffRetailPriceItems](docs/CouponPercentOffRetailPriceItems.md)
 - [CouponPercentOffShipping](docs/CouponPercentOffShipping.md)
 - [CouponPercentOffSubtotal](docs/CouponPercentOffSubtotal.md)
 - [CouponPercentOffSubtotalAndFreeShipping](docs/CouponPercentOffSubtotalAndFreeShipping.md)
 - [CouponPercentOffSubtotalLimit](docs/CouponPercentOffSubtotalLimit.md)
 - [CouponPercentOffSubtotalWithItemsPurchase](docs/CouponPercentOffSubtotalWithItemsPurchase.md)
 - [CouponPercentOffSubtotalWithSubtotal](docs/CouponPercentOffSubtotalWithSubtotal.md)
 - [CouponQuery](docs/CouponQuery.md)
 - [CouponResponse](docs/CouponResponse.md)
 - [CouponTierAmount](docs/CouponTierAmount.md)
 - [CouponTierItemDiscount](docs/CouponTierItemDiscount.md)
 - [CouponTierPercent](docs/CouponTierPercent.md)
 - [CouponTierQuantityAmount](docs/CouponTierQuantityAmount.md)
 - [CouponTierQuantityPercent](docs/CouponTierQuantityPercent.md)
 - [CouponTieredAmountOffItem](docs/CouponTieredAmountOffItem.md)
 - [CouponTieredAmountOffSubtotal](docs/CouponTieredAmountOffSubtotal.md)
 - [CouponTieredPercentOffItems](docs/CouponTieredPercentOffItems.md)
 - [CouponTieredPercentOffShipping](docs/CouponTieredPercentOffShipping.md)
 - [CouponTieredPercentOffSubtotal](docs/CouponTieredPercentOffSubtotal.md)
 - [CouponsResponse](docs/CouponsResponse.md)
 - [Currency](docs/Currency.md)
 - [Customer](docs/Customer.md)
 - [CustomerAffiliate](docs/CustomerAffiliate.md)
 - [CustomerBilling](docs/CustomerBilling.md)
 - [CustomerCard](docs/CustomerCard.md)
 - [CustomerEditorValues](docs/CustomerEditorValues.md)
 - [CustomerPricingTier](docs/CustomerPricingTier.md)
 - [CustomerQuery](docs/CustomerQuery.md)
 - [CustomerResponse](docs/CustomerResponse.md)
 - [CustomerShipping](docs/CustomerShipping.md)
 - [CustomersResponse](docs/CustomersResponse.md)
 - [Distance](docs/Distance.md)
 - [DistributionCenter](docs/DistributionCenter.md)
 - [DistributionCentersResponse](docs/DistributionCentersResponse.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [FulfillmentInventory](docs/FulfillmentInventory.md)
 - [FulfillmentShipment](docs/FulfillmentShipment.md)
 - [HTTPHeader](docs/HTTPHeader.md)
 - [Item](docs/Item.md)
 - [ItemAccounting](docs/ItemAccounting.md)
 - [ItemAmember](docs/ItemAmember.md)
 - [ItemAutoOrder](docs/ItemAutoOrder.md)
 - [ItemAutoOrderStep](docs/ItemAutoOrderStep.md)
 - [ItemAutoOrderStepArbitraryUnitCostSchedule](docs/ItemAutoOrderStepArbitraryUnitCostSchedule.md)
 - [ItemAutoOrderStepGrandfatherPricing](docs/ItemAutoOrderStepGrandfatherPricing.md)
 - [ItemCCBill](docs/ItemCCBill.md)
 - [ItemChannelPartnerMapping](docs/ItemChannelPartnerMapping.md)
 - [ItemChargeback](docs/ItemChargeback.md)
 - [ItemChargebackAddendum](docs/ItemChargebackAddendum.md)
 - [ItemChargebackAdjustmentRequest](docs/ItemChargebackAdjustmentRequest.md)
 - [ItemCheckout](docs/ItemCheckout.md)
 - [ItemContent](docs/ItemContent.md)
 - [ItemContentAssignment](docs/ItemContentAssignment.md)
 - [ItemContentAttribute](docs/ItemContentAttribute.md)
 - [ItemContentMultimedia](docs/ItemContentMultimedia.md)
 - [ItemContentMultimediaThumbnail](docs/ItemContentMultimediaThumbnail.md)
 - [ItemDigitalDelivery](docs/ItemDigitalDelivery.md)
 - [ItemDigitalItem](docs/ItemDigitalItem.md)
 - [ItemEbay](docs/ItemEbay.md)
 - [ItemEbayCategorySpecific](docs/ItemEbayCategorySpecific.md)
 - [ItemEbayMarketListing](docs/ItemEbayMarketListing.md)
 - [ItemEbayMarketPlaceAnalysis](docs/ItemEbayMarketPlaceAnalysis.md)
 - [ItemEmailNotifications](docs/ItemEmailNotifications.md)
 - [ItemEnrollment123](docs/ItemEnrollment123.md)
 - [ItemGiftCertificate](docs/ItemGiftCertificate.md)
 - [ItemGoogleProductSearch](docs/ItemGoogleProductSearch.md)
 - [ItemIdentifiers](docs/ItemIdentifiers.md)
 - [ItemInstantPaymentNotification](docs/ItemInstantPaymentNotification.md)
 - [ItemInstantPaymentNotifications](docs/ItemInstantPaymentNotifications.md)
 - [ItemInternal](docs/ItemInternal.md)
 - [ItemKitComponent](docs/ItemKitComponent.md)
 - [ItemKitDefinition](docs/ItemKitDefinition.md)
 - [ItemOption](docs/ItemOption.md)
 - [ItemOptionValue](docs/ItemOptionValue.md)
 - [ItemOptionValueAdditionalItem](docs/ItemOptionValueAdditionalItem.md)
 - [ItemOptionValueDigitalItem](docs/ItemOptionValueDigitalItem.md)
 - [ItemPaymentProcessing](docs/ItemPaymentProcessing.md)
 - [ItemPhysical](docs/ItemPhysical.md)
 - [ItemPricing](docs/ItemPricing.md)
 - [ItemPricingTier](docs/ItemPricingTier.md)
 - [ItemPricingTierDiscount](docs/ItemPricingTierDiscount.md)
 - [ItemPricingTierLimit](docs/ItemPricingTierLimit.md)
 - [ItemRealtimePricing](docs/ItemRealtimePricing.md)
 - [ItemRelated](docs/ItemRelated.md)
 - [ItemRelatedItem](docs/ItemRelatedItem.md)
 - [ItemReporting](docs/ItemReporting.md)
 - [ItemResponse](docs/ItemResponse.md)
 - [ItemRestriction](docs/ItemRestriction.md)
 - [ItemRestrictionItem](docs/ItemRestrictionItem.md)
 - [ItemRevguard](docs/ItemRevguard.md)
 - [ItemReviews](docs/ItemReviews.md)
 - [ItemSalesforce](docs/ItemSalesforce.md)
 - [ItemShipping](docs/ItemShipping.md)
 - [ItemShippingCase](docs/ItemShippingCase.md)
 - [ItemShippingDestinationMarkup](docs/ItemShippingDestinationMarkup.md)
 - [ItemShippingDestinationRestriction](docs/ItemShippingDestinationRestriction.md)
 - [ItemShippingDistributionCenter](docs/ItemShippingDistributionCenter.md)
 - [ItemShippingMethod](docs/ItemShippingMethod.md)
 - [ItemShippingPackageRequirement](docs/ItemShippingPackageRequirement.md)
 - [ItemTax](docs/ItemTax.md)
 - [ItemTaxExemption](docs/ItemTaxExemption.md)
 - [ItemThirdPartyEmailMarketing](docs/ItemThirdPartyEmailMarketing.md)
 - [ItemVariantItem](docs/ItemVariantItem.md)
 - [ItemVariation](docs/ItemVariation.md)
 - [ItemVariationOption](docs/ItemVariationOption.md)
 - [ItemWishlistMember](docs/ItemWishlistMember.md)
 - [ItemsRequest](docs/ItemsRequest.md)
 - [ItemsResponse](docs/ItemsResponse.md)
 - [OauthRevokeSuccessResponse](docs/OauthRevokeSuccessResponse.md)
 - [OauthTokenResponse](docs/OauthTokenResponse.md)
 - [Order](docs/Order.md)
 - [OrderAffiliate](docs/OrderAffiliate.md)
 - [OrderAffiliateLedger](docs/OrderAffiliateLedger.md)
 - [OrderAutoOrder](docs/OrderAutoOrder.md)
 - [OrderBilling](docs/OrderBilling.md)
 - [OrderBuysafe](docs/OrderBuysafe.md)
 - [OrderChannelPartner](docs/OrderChannelPartner.md)
 - [OrderCheckout](docs/OrderCheckout.md)
 - [OrderCoupon](docs/OrderCoupon.md)
 - [OrderDigitalItem](docs/OrderDigitalItem.md)
 - [OrderDigitalOrder](docs/OrderDigitalOrder.md)
 - [OrderEdi](docs/OrderEdi.md)
 - [OrderFraudScore](docs/OrderFraudScore.md)
 - [OrderGift](docs/OrderGift.md)
 - [OrderGiftCertificate](docs/OrderGiftCertificate.md)
 - [OrderInternal](docs/OrderInternal.md)
 - [OrderItem](docs/OrderItem.md)
 - [OrderItemEdi](docs/OrderItemEdi.md)
 - [OrderItemEdiIdentification](docs/OrderItemEdiIdentification.md)
 - [OrderItemEdiLot](docs/OrderItemEdiLot.md)
 - [OrderItemOption](docs/OrderItemOption.md)
 - [OrderItemOptionFileAttachment](docs/OrderItemOptionFileAttachment.md)
 - [OrderLinkedShipment](docs/OrderLinkedShipment.md)
 - [OrderMarketing](docs/OrderMarketing.md)
 - [OrderPayment](docs/OrderPayment.md)
 - [OrderPaymentCheck](docs/OrderPaymentCheck.md)
 - [OrderPaymentCreditCard](docs/OrderPaymentCreditCard.md)
 - [OrderPaymentECheck](docs/OrderPaymentECheck.md)
 - [OrderPaymentPurchaseOrder](docs/OrderPaymentPurchaseOrder.md)
 - [OrderPaymentTransaction](docs/OrderPaymentTransaction.md)
 - [OrderPaymentTransactionDetail](docs/OrderPaymentTransactionDetail.md)
 - [OrderQuery](docs/OrderQuery.md)
 - [OrderQuote](docs/OrderQuote.md)
 - [OrderResponse](docs/OrderResponse.md)
 - [OrderSalesforce](docs/OrderSalesforce.md)
 - [OrderShipping](docs/OrderShipping.md)
 - [OrderSummary](docs/OrderSummary.md)
 - [OrderTaxes](docs/OrderTaxes.md)
 - [OrdersResponse](docs/OrdersResponse.md)
 - [ResponseMetadata](docs/ResponseMetadata.md)
 - [ResultSet](docs/ResultSet.md)
 - [TempMultimedia](docs/TempMultimedia.md)
 - [TempMultimediaResponse](docs/TempMultimediaResponse.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookEventCategory](docs/WebhookEventCategory.md)
 - [WebhookEventSubscription](docs/WebhookEventSubscription.md)
 - [WebhookLog](docs/WebhookLog.md)
 - [WebhookLogResponse](docs/WebhookLogResponse.md)
 - [WebhookLogSummariesResponse](docs/WebhookLogSummariesResponse.md)
 - [WebhookLogSummary](docs/WebhookLogSummary.md)
 - [WebhookResponse](docs/WebhookResponse.md)
 - [WebhookSampleRequest](docs/WebhookSampleRequest.md)
 - [WebhookSampleRequestResponse](docs/WebhookSampleRequestResponse.md)
 - [WebhooksResponse](docs/WebhooksResponse.md)
 - [Weight](docs/Weight.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ultraCartBrowserApiKey

- **Type**: API key
- **API key parameter name**: x-ultracart-browser-key
- **Location**: HTTP header

### ultraCartOauth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://secure.ultracart.com/rest/v2/oauth/authorize
- **Scopes**: 
  - affiliate_read: Allows you to read affiliate information.
  - affiliate_write: Allows you to write affiliate information.
  - auto_order_read: Allows you to read auto order information.
  - auto_order_write: Allows you to write auto order information.
  - chargeback_read: Allows you to read chargeback information.
  - chargeback_write: Allows you to write chargeback information.
  - checkout_read: Allows you to read checkout information.
  - checkout_write: Allows you to write checkout information.
  - coupon_read: Allows you to read coupon information.
  - coupon_write: Allows you to write coupon information.
  - customer_read: Allows you to read customer information.
  - customer_write: Allows you to write customer information.
  - fulfillment_read: Allows you to read fulfillment information.
  - fulfillment_write: Allows you to write fulfillment information.
  - order_read: Allows you to read order information.
  - order_write: Allows you to write order information.
  - item_read: Allows you to read item information.
  - item_write: Allows you to write item information.
  - webhook_read: Allows you to read webhook information.
  - webhook_write: Allows you to write webhook information.
  - ultrabooks_read: 1 of 2 required to use UltraBooks
  - ultrabooks_write: 2 of 2 required to use UltraBooks

### ultraCartSimpleApiKey

- **Type**: API key
- **API key parameter name**: x-ultracart-simple-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@ultracart.com
