# swagger-java-client

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
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.ultracart.admin.v2.swagger.*;
import com.ultracart.admin.v2.swagger.auth.*;
import com.ultracart.admin.v2.swagger.model.*;
import com.ultracart.admin.v2.ItemApi;

import java.io.File;
import java.util.*;

public class ItemApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/rest/admin/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ItemApi* | [**itemItemsGet**](docs/ItemApi.md#itemItemsGet) | **GET** /item/items | Retrieve items
*ItemApi* | [**itemItemsMerchantItemOidDelete**](docs/ItemApi.md#itemItemsMerchantItemOidDelete) | **DELETE** /item/items/{merchant_item_oid} | Delete an item
*ItemApi* | [**itemItemsMerchantItemOidGet**](docs/ItemApi.md#itemItemsMerchantItemOidGet) | **GET** /item/items/{merchant_item_oid} | Retrieve an item
*ItemApi* | [**itemItemsMerchantItemOidPut**](docs/ItemApi.md#itemItemsMerchantItemOidPut) | **PUT** /item/items/{merchant_item_oid} | Update an item
*ItemApi* | [**itemItemsPost**](docs/ItemApi.md#itemItemsPost) | **POST** /item/items | Create an item
*ItemApi* | [**itemTempMultimediaPost**](docs/ItemApi.md#itemTempMultimediaPost) | **POST** /item/temp_multimedia | Upload an image to the temporary multimedia.


## Documentation for Models

 - [Distance](docs/Distance.md)
 - [Error](docs/Error.md)
 - [ErrorResponse](docs/ErrorResponse.md)
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
 - [ItemsResponse](docs/ItemsResponse.md)
 - [ResponseMetadata](docs/ResponseMetadata.md)
 - [ResultSet](docs/ResultSet.md)
 - [TempMultimedia](docs/TempMultimedia.md)
 - [TempMultimediaResponse](docs/TempMultimediaResponse.md)
 - [Weight](docs/Weight.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ultraCartOauth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorizatoin URL**: https://secure.ultracart.com/rest/oauth/authorize
- **Scopes**: 
  - item_read: Allows you to read item information.
  - item_write: Allows you to write item information.

### ultraCartSimpleApiKey

- **Type**: API key
- **API key parameter name**: x-ultracart-simple-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

support@ultracart.com

