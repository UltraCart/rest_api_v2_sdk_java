

# Customer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activity** | [**CustomerActivity**](CustomerActivity.md) |  |  [optional] |
|**affiliateOid** | **Integer** | Affiliate oid |  [optional] |
|**allow3rdPartyBilling** | **Boolean** | Allow 3rd party billing |  [optional] |
|**allowCod** | **Boolean** | Allow COD |  [optional] |
|**allowDropShipping** | **Boolean** | Allow Drop Shipping |  [optional] |
|**allowPurchaseOrder** | **Boolean** | Allow purchase orders by this customer |  [optional] |
|**allowQuoteRequest** | **Boolean** | Allow quote request |  [optional] |
|**allowSelectionOfAddressType** | **Boolean** | Allow selection of residential or business address type |  [optional] |
|**attachments** | [**List&lt;CustomerAttachment&gt;**](CustomerAttachment.md) | Attachments |  [optional] |
|**autoApproveCod** | **Boolean** | Auto approve COD |  [optional] |
|**autoApprovePurchaseOrder** | **Boolean** | Auto approve purchase orders by this customer |  [optional] |
|**automaticMerchantNotes** | **String** | Automatic merchant notes are added to every order placed |  [optional] |
|**billing** | [**List&lt;CustomerBilling&gt;**](CustomerBilling.md) | Billing addresses for this customer |  [optional] |
|**businessNotes** | **String** | Business notes (internally visible only) |  [optional] |
|**cards** | [**List&lt;CustomerCard&gt;**](CustomerCard.md) | Credit Cards for this customer |  [optional] |
|**ccEmails** | [**List&lt;CustomerEmail&gt;**](CustomerEmail.md) | Additional emails to CC notification |  [optional] |
|**customerProfileOid** | **Integer** | Customer profile object identifier |  [optional] |
|**dhlAccountNumber** | **String** | DHL account number |  [optional] |
|**dhlDutyAccountNumber** | **String** | DHL duty account number |  [optional] |
|**doNotSendMail** | **Boolean** | Do not send mail (null will not update) |  [optional] |
|**edi** | [**CustomerEDI**](CustomerEDI.md) |  |  [optional] |
|**email** | **String** | Email address of this customer profile |  [optional] |
|**exemptShippingHandlingCharge** | **Boolean** | Exempt shipping handling charge |  [optional] |
|**fedexAccountNumber** | **String** | FedEx account number |  [optional] |
|**freeShipping** | **Boolean** | This customer always receives free shipping |  [optional] |
|**freeShippingMinimum** | **BigDecimal** | If free_shipping is true, this is the minimum subtotal required for free shipping |  [optional] |
|**lastModifiedBy** | **String** | Last modified by |  [optional] |
|**lastModifiedDts** | **String** | Last modified date |  [optional] |
|**loyalty** | [**CustomerLoyalty**](CustomerLoyalty.md) |  |  [optional] |
|**maximumItemCount** | **Integer** | Maximum item count |  [optional] |
|**merchantId** | **String** | Merchant ID |  [optional] |
|**minimumItemCount** | **Integer** | Minimum item count |  [optional] |
|**minimumSubtotal** | **BigDecimal** | Minimum subtotal |  [optional] |
|**noCoupons** | **Boolean** | No coupons |  [optional] |
|**noFreeShipping** | **Boolean** | No free shipping regardless of coupons or item level settings |  [optional] |
|**noRealtimeCharge** | **Boolean** | No realtime charge |  [optional] |
|**orders** | [**List&lt;Order&gt;**](Order.md) | Orders associated with this customer profile |  [optional] |
|**ordersSummary** | [**CustomerOrdersSummary**](CustomerOrdersSummary.md) |  |  [optional] |
|**password** | **String** | Password (may only be set, never read) |  [optional] |
|**pricingTiers** | [**List&lt;CustomerPricingTier&gt;**](CustomerPricingTier.md) | Pricing tiers for this customer |  [optional] |
|**privacy** | [**CustomerPrivacy**](CustomerPrivacy.md) |  |  [optional] |
|**properties** | [**List&lt;CustomerProperty&gt;**](CustomerProperty.md) | Properties for this customer |  [optional] |
|**qbClass** | **String** | QuickBooks class to import this customer as |  [optional] |
|**qbCode** | **String** | QuickBooks name to import this customer as |  [optional] |
|**qbTaxExemptionReasonCode** | **Integer** | QuickBooks tax exemption reason code |  [optional] |
|**quotes** | [**List&lt;Order&gt;**](Order.md) | Quotes associated with this customer profile |  [optional] |
|**quotesSummary** | [**CustomerQuotesSummary**](CustomerQuotesSummary.md) |  |  [optional] |
|**referralSource** | **String** | Referral Source |  [optional] |
|**reviewer** | [**CustomerReviewer**](CustomerReviewer.md) |  |  [optional] |
|**salesRepCode** | **String** | Sales rep code |  [optional] |
|**sendSignupNotification** | **Boolean** | Send signup notification, if true during customer creation, will send a notification. |  [optional] |
|**shipping** | [**List&lt;CustomerShipping&gt;**](CustomerShipping.md) | Shipping addresses for this customer |  [optional] |
|**signupDts** | **String** | Signup date |  [optional] |
|**softwareEntitlements** | [**List&lt;CustomerSoftwareEntitlement&gt;**](CustomerSoftwareEntitlement.md) | Software entitlements owned by this customer |  [optional] |
|**suppressBuysafe** | **Boolean** | Suppress buySAFE (deprecated) |  [optional] |
|**tags** | [**List&lt;CustomerTag&gt;**](CustomerTag.md) | Tags for this customer |  [optional] |
|**taxCodes** | [**CustomerTaxCodes**](CustomerTaxCodes.md) |  |  [optional] |
|**taxExempt** | **Boolean** | True if the customer is tax exempt |  [optional] |
|**taxId** | **String** | Tax ID |  [optional] |
|**terms** | **String** | Terms for this customer |  [optional] |
|**trackSeparately** | **Boolean** | True if the customer should be tracked separately in QuickBooks |  [optional] |
|**unapproved** | **Boolean** | Unapproved |  [optional] |
|**upsAccountNumber** | **String** | UPS account number |  [optional] |
|**websiteUrl** | **String** | Website url |  [optional] |



