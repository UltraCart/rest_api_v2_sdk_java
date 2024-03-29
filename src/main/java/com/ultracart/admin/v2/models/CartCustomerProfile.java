/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
 *
 * OpenAPI spec version: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ultracart.admin.v2.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ultracart.admin.v2.models.CartCustomerProfileAddress;
import com.ultracart.admin.v2.models.CartCustomerProfileCreditCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * CartCustomerProfile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CartCustomerProfile {
  @SerializedName("allow_3rd_party_billing")
  private Boolean allow3rdPartyBilling = null;

  @SerializedName("allow_cod")
  private Boolean allowCod = null;

  @SerializedName("allow_purchase_order")
  private Boolean allowPurchaseOrder = null;

  @SerializedName("billing_addresses")
  private List<CartCustomerProfileAddress> billingAddresses = null;

  @SerializedName("credit_cards")
  private List<CartCustomerProfileCreditCard> creditCards = null;

  @SerializedName("customer_profile_oid")
  private Integer customerProfileOid = null;

  @SerializedName("dhl_account_number")
  private String dhlAccountNumber = null;

  @SerializedName("dhl_duty_account_number")
  private String dhlDutyAccountNumber = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("fedex_account_number")
  private String fedexAccountNumber = null;

  @SerializedName("free_shipping")
  private Boolean freeShipping = null;

  @SerializedName("free_shipping_minimum")
  private BigDecimal freeShippingMinimum = null;

  @SerializedName("maximum_item_count")
  private Integer maximumItemCount = null;

  @SerializedName("minimum_item_count")
  private Integer minimumItemCount = null;

  @SerializedName("minimum_subtotal")
  private BigDecimal minimumSubtotal = null;

  @SerializedName("no_coupons")
  private Boolean noCoupons = null;

  @SerializedName("no_free_shipping")
  private Boolean noFreeShipping = null;

  @SerializedName("no_realtime_charge")
  private Boolean noRealtimeCharge = null;

  @SerializedName("pricing_tiers")
  private List<String> pricingTiers = null;

  @SerializedName("shipping_addresses")
  private List<CartCustomerProfileAddress> shippingAddresses = null;

  @SerializedName("signup_dts")
  private String signupDts = null;

  @SerializedName("tax_exempt")
  private Boolean taxExempt = null;

  @SerializedName("ups_account_number")
  private String upsAccountNumber = null;

  public CartCustomerProfile allow3rdPartyBilling(Boolean allow3rdPartyBilling) {
    this.allow3rdPartyBilling = allow3rdPartyBilling;
    return this;
  }

   /**
   * True if profile is allowed to bill to their 3rd party shipping account
   * @return allow3rdPartyBilling
  **/
  @ApiModelProperty(value = "True if profile is allowed to bill to their 3rd party shipping account")
  public Boolean isAllow3rdPartyBilling() {
    return allow3rdPartyBilling;
  }

  public void setAllow3rdPartyBilling(Boolean allow3rdPartyBilling) {
    this.allow3rdPartyBilling = allow3rdPartyBilling;
  }

  public CartCustomerProfile allowCod(Boolean allowCod) {
    this.allowCod = allowCod;
    return this;
  }

   /**
   * True if this profile is allowed to use a COD
   * @return allowCod
  **/
  @ApiModelProperty(value = "True if this profile is allowed to use a COD")
  public Boolean isAllowCod() {
    return allowCod;
  }

  public void setAllowCod(Boolean allowCod) {
    this.allowCod = allowCod;
  }

  public CartCustomerProfile allowPurchaseOrder(Boolean allowPurchaseOrder) {
    this.allowPurchaseOrder = allowPurchaseOrder;
    return this;
  }

   /**
   * True if this profile is allowed to use a purchase order
   * @return allowPurchaseOrder
  **/
  @ApiModelProperty(value = "True if this profile is allowed to use a purchase order")
  public Boolean isAllowPurchaseOrder() {
    return allowPurchaseOrder;
  }

  public void setAllowPurchaseOrder(Boolean allowPurchaseOrder) {
    this.allowPurchaseOrder = allowPurchaseOrder;
  }

  public CartCustomerProfile billingAddresses(List<CartCustomerProfileAddress> billingAddresses) {
    this.billingAddresses = billingAddresses;
    return this;
  }

  public CartCustomerProfile addBillingAddressesItem(CartCustomerProfileAddress billingAddressesItem) {
    if (this.billingAddresses == null) {
      this.billingAddresses = new ArrayList<CartCustomerProfileAddress>();
    }
    this.billingAddresses.add(billingAddressesItem);
    return this;
  }

   /**
   * Billing addresses on file for this profile
   * @return billingAddresses
  **/
  @ApiModelProperty(value = "Billing addresses on file for this profile")
  public List<CartCustomerProfileAddress> getBillingAddresses() {
    return billingAddresses;
  }

  public void setBillingAddresses(List<CartCustomerProfileAddress> billingAddresses) {
    this.billingAddresses = billingAddresses;
  }

  public CartCustomerProfile creditCards(List<CartCustomerProfileCreditCard> creditCards) {
    this.creditCards = creditCards;
    return this;
  }

  public CartCustomerProfile addCreditCardsItem(CartCustomerProfileCreditCard creditCardsItem) {
    if (this.creditCards == null) {
      this.creditCards = new ArrayList<CartCustomerProfileCreditCard>();
    }
    this.creditCards.add(creditCardsItem);
    return this;
  }

   /**
   * Credit cards on file for this profile (masked)
   * @return creditCards
  **/
  @ApiModelProperty(value = "Credit cards on file for this profile (masked)")
  public List<CartCustomerProfileCreditCard> getCreditCards() {
    return creditCards;
  }

  public void setCreditCards(List<CartCustomerProfileCreditCard> creditCards) {
    this.creditCards = creditCards;
  }

  public CartCustomerProfile customerProfileOid(Integer customerProfileOid) {
    this.customerProfileOid = customerProfileOid;
    return this;
  }

   /**
   * Unique identifier
   * @return customerProfileOid
  **/
  @ApiModelProperty(value = "Unique identifier")
  public Integer getCustomerProfileOid() {
    return customerProfileOid;
  }

  public void setCustomerProfileOid(Integer customerProfileOid) {
    this.customerProfileOid = customerProfileOid;
  }

  public CartCustomerProfile dhlAccountNumber(String dhlAccountNumber) {
    this.dhlAccountNumber = dhlAccountNumber;
    return this;
  }

   /**
   * DHL account number on file
   * @return dhlAccountNumber
  **/
  @ApiModelProperty(value = "DHL account number on file")
  public String getDhlAccountNumber() {
    return dhlAccountNumber;
  }

  public void setDhlAccountNumber(String dhlAccountNumber) {
    this.dhlAccountNumber = dhlAccountNumber;
  }

  public CartCustomerProfile dhlDutyAccountNumber(String dhlDutyAccountNumber) {
    this.dhlDutyAccountNumber = dhlDutyAccountNumber;
    return this;
  }

   /**
   * DHL duty account number on file
   * @return dhlDutyAccountNumber
  **/
  @ApiModelProperty(value = "DHL duty account number on file")
  public String getDhlDutyAccountNumber() {
    return dhlDutyAccountNumber;
  }

  public void setDhlDutyAccountNumber(String dhlDutyAccountNumber) {
    this.dhlDutyAccountNumber = dhlDutyAccountNumber;
  }

  public CartCustomerProfile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  @ApiModelProperty(value = "Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CartCustomerProfile fedexAccountNumber(String fedexAccountNumber) {
    this.fedexAccountNumber = fedexAccountNumber;
    return this;
  }

   /**
   * FedEx account number on file
   * @return fedexAccountNumber
  **/
  @ApiModelProperty(value = "FedEx account number on file")
  public String getFedexAccountNumber() {
    return fedexAccountNumber;
  }

  public void setFedexAccountNumber(String fedexAccountNumber) {
    this.fedexAccountNumber = fedexAccountNumber;
  }

  public CartCustomerProfile freeShipping(Boolean freeShipping) {
    this.freeShipping = freeShipping;
    return this;
  }

   /**
   * True if this profile always qualifies for free shipping
   * @return freeShipping
  **/
  @ApiModelProperty(value = "True if this profile always qualifies for free shipping")
  public Boolean isFreeShipping() {
    return freeShipping;
  }

  public void setFreeShipping(Boolean freeShipping) {
    this.freeShipping = freeShipping;
  }

  public CartCustomerProfile freeShippingMinimum(BigDecimal freeShippingMinimum) {
    this.freeShippingMinimum = freeShippingMinimum;
    return this;
  }

   /**
   * The minimum amount that this profile has to purchase to qualify for free shipping
   * @return freeShippingMinimum
  **/
  @ApiModelProperty(value = "The minimum amount that this profile has to purchase to qualify for free shipping")
  public BigDecimal getFreeShippingMinimum() {
    return freeShippingMinimum;
  }

  public void setFreeShippingMinimum(BigDecimal freeShippingMinimum) {
    this.freeShippingMinimum = freeShippingMinimum;
  }

  public CartCustomerProfile maximumItemCount(Integer maximumItemCount) {
    this.maximumItemCount = maximumItemCount;
    return this;
  }

   /**
   * Maximum item count this profile can purchase
   * @return maximumItemCount
  **/
  @ApiModelProperty(value = "Maximum item count this profile can purchase")
  public Integer getMaximumItemCount() {
    return maximumItemCount;
  }

  public void setMaximumItemCount(Integer maximumItemCount) {
    this.maximumItemCount = maximumItemCount;
  }

  public CartCustomerProfile minimumItemCount(Integer minimumItemCount) {
    this.minimumItemCount = minimumItemCount;
    return this;
  }

   /**
   * Minimum item count this profile must purchase
   * @return minimumItemCount
  **/
  @ApiModelProperty(value = "Minimum item count this profile must purchase")
  public Integer getMinimumItemCount() {
    return minimumItemCount;
  }

  public void setMinimumItemCount(Integer minimumItemCount) {
    this.minimumItemCount = minimumItemCount;
  }

  public CartCustomerProfile minimumSubtotal(BigDecimal minimumSubtotal) {
    this.minimumSubtotal = minimumSubtotal;
    return this;
  }

   /**
   * Minimum subtotal this profile must purchase
   * @return minimumSubtotal
  **/
  @ApiModelProperty(value = "Minimum subtotal this profile must purchase")
  public BigDecimal getMinimumSubtotal() {
    return minimumSubtotal;
  }

  public void setMinimumSubtotal(BigDecimal minimumSubtotal) {
    this.minimumSubtotal = minimumSubtotal;
  }

  public CartCustomerProfile noCoupons(Boolean noCoupons) {
    this.noCoupons = noCoupons;
    return this;
  }

   /**
   * True if this profile is prevented from using coupons
   * @return noCoupons
  **/
  @ApiModelProperty(value = "True if this profile is prevented from using coupons")
  public Boolean isNoCoupons() {
    return noCoupons;
  }

  public void setNoCoupons(Boolean noCoupons) {
    this.noCoupons = noCoupons;
  }

  public CartCustomerProfile noFreeShipping(Boolean noFreeShipping) {
    this.noFreeShipping = noFreeShipping;
    return this;
  }

   /**
   * True if this profile is never given free shipping
   * @return noFreeShipping
  **/
  @ApiModelProperty(value = "True if this profile is never given free shipping")
  public Boolean isNoFreeShipping() {
    return noFreeShipping;
  }

  public void setNoFreeShipping(Boolean noFreeShipping) {
    this.noFreeShipping = noFreeShipping;
  }

  public CartCustomerProfile noRealtimeCharge(Boolean noRealtimeCharge) {
    this.noRealtimeCharge = noRealtimeCharge;
    return this;
  }

   /**
   * True if this customers orders are not charged in real-time
   * @return noRealtimeCharge
  **/
  @ApiModelProperty(value = "True if this customers orders are not charged in real-time")
  public Boolean isNoRealtimeCharge() {
    return noRealtimeCharge;
  }

  public void setNoRealtimeCharge(Boolean noRealtimeCharge) {
    this.noRealtimeCharge = noRealtimeCharge;
  }

  public CartCustomerProfile pricingTiers(List<String> pricingTiers) {
    this.pricingTiers = pricingTiers;
    return this;
  }

  public CartCustomerProfile addPricingTiersItem(String pricingTiersItem) {
    if (this.pricingTiers == null) {
      this.pricingTiers = new ArrayList<String>();
    }
    this.pricingTiers.add(pricingTiersItem);
    return this;
  }

   /**
   * Pricing tier names this profile qualifies for
   * @return pricingTiers
  **/
  @ApiModelProperty(value = "Pricing tier names this profile qualifies for")
  public List<String> getPricingTiers() {
    return pricingTiers;
  }

  public void setPricingTiers(List<String> pricingTiers) {
    this.pricingTiers = pricingTiers;
  }

  public CartCustomerProfile shippingAddresses(List<CartCustomerProfileAddress> shippingAddresses) {
    this.shippingAddresses = shippingAddresses;
    return this;
  }

  public CartCustomerProfile addShippingAddressesItem(CartCustomerProfileAddress shippingAddressesItem) {
    if (this.shippingAddresses == null) {
      this.shippingAddresses = new ArrayList<CartCustomerProfileAddress>();
    }
    this.shippingAddresses.add(shippingAddressesItem);
    return this;
  }

   /**
   * Shipping addresses on file for this profile
   * @return shippingAddresses
  **/
  @ApiModelProperty(value = "Shipping addresses on file for this profile")
  public List<CartCustomerProfileAddress> getShippingAddresses() {
    return shippingAddresses;
  }

  public void setShippingAddresses(List<CartCustomerProfileAddress> shippingAddresses) {
    this.shippingAddresses = shippingAddresses;
  }

  public CartCustomerProfile signupDts(String signupDts) {
    this.signupDts = signupDts;
    return this;
  }

   /**
   * Signup date
   * @return signupDts
  **/
  @ApiModelProperty(value = "Signup date")
  public String getSignupDts() {
    return signupDts;
  }

  public void setSignupDts(String signupDts) {
    this.signupDts = signupDts;
  }

  public CartCustomerProfile taxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
    return this;
  }

   /**
   * True if this profile is exempt from sales tax
   * @return taxExempt
  **/
  @ApiModelProperty(value = "True if this profile is exempt from sales tax")
  public Boolean isTaxExempt() {
    return taxExempt;
  }

  public void setTaxExempt(Boolean taxExempt) {
    this.taxExempt = taxExempt;
  }

  public CartCustomerProfile upsAccountNumber(String upsAccountNumber) {
    this.upsAccountNumber = upsAccountNumber;
    return this;
  }

   /**
   * UPS account number on file
   * @return upsAccountNumber
  **/
  @ApiModelProperty(value = "UPS account number on file")
  public String getUpsAccountNumber() {
    return upsAccountNumber;
  }

  public void setUpsAccountNumber(String upsAccountNumber) {
    this.upsAccountNumber = upsAccountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartCustomerProfile cartCustomerProfile = (CartCustomerProfile) o;
    return Objects.equals(this.allow3rdPartyBilling, cartCustomerProfile.allow3rdPartyBilling) &&
        Objects.equals(this.allowCod, cartCustomerProfile.allowCod) &&
        Objects.equals(this.allowPurchaseOrder, cartCustomerProfile.allowPurchaseOrder) &&
        Objects.equals(this.billingAddresses, cartCustomerProfile.billingAddresses) &&
        Objects.equals(this.creditCards, cartCustomerProfile.creditCards) &&
        Objects.equals(this.customerProfileOid, cartCustomerProfile.customerProfileOid) &&
        Objects.equals(this.dhlAccountNumber, cartCustomerProfile.dhlAccountNumber) &&
        Objects.equals(this.dhlDutyAccountNumber, cartCustomerProfile.dhlDutyAccountNumber) &&
        Objects.equals(this.email, cartCustomerProfile.email) &&
        Objects.equals(this.fedexAccountNumber, cartCustomerProfile.fedexAccountNumber) &&
        Objects.equals(this.freeShipping, cartCustomerProfile.freeShipping) &&
        Objects.equals(this.freeShippingMinimum, cartCustomerProfile.freeShippingMinimum) &&
        Objects.equals(this.maximumItemCount, cartCustomerProfile.maximumItemCount) &&
        Objects.equals(this.minimumItemCount, cartCustomerProfile.minimumItemCount) &&
        Objects.equals(this.minimumSubtotal, cartCustomerProfile.minimumSubtotal) &&
        Objects.equals(this.noCoupons, cartCustomerProfile.noCoupons) &&
        Objects.equals(this.noFreeShipping, cartCustomerProfile.noFreeShipping) &&
        Objects.equals(this.noRealtimeCharge, cartCustomerProfile.noRealtimeCharge) &&
        Objects.equals(this.pricingTiers, cartCustomerProfile.pricingTiers) &&
        Objects.equals(this.shippingAddresses, cartCustomerProfile.shippingAddresses) &&
        Objects.equals(this.signupDts, cartCustomerProfile.signupDts) &&
        Objects.equals(this.taxExempt, cartCustomerProfile.taxExempt) &&
        Objects.equals(this.upsAccountNumber, cartCustomerProfile.upsAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allow3rdPartyBilling, allowCod, allowPurchaseOrder, billingAddresses, creditCards, customerProfileOid, dhlAccountNumber, dhlDutyAccountNumber, email, fedexAccountNumber, freeShipping, freeShippingMinimum, maximumItemCount, minimumItemCount, minimumSubtotal, noCoupons, noFreeShipping, noRealtimeCharge, pricingTiers, shippingAddresses, signupDts, taxExempt, upsAccountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartCustomerProfile {\n");
    
    sb.append("    allow3rdPartyBilling: ").append(toIndentedString(allow3rdPartyBilling)).append("\n");
    sb.append("    allowCod: ").append(toIndentedString(allowCod)).append("\n");
    sb.append("    allowPurchaseOrder: ").append(toIndentedString(allowPurchaseOrder)).append("\n");
    sb.append("    billingAddresses: ").append(toIndentedString(billingAddresses)).append("\n");
    sb.append("    creditCards: ").append(toIndentedString(creditCards)).append("\n");
    sb.append("    customerProfileOid: ").append(toIndentedString(customerProfileOid)).append("\n");
    sb.append("    dhlAccountNumber: ").append(toIndentedString(dhlAccountNumber)).append("\n");
    sb.append("    dhlDutyAccountNumber: ").append(toIndentedString(dhlDutyAccountNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fedexAccountNumber: ").append(toIndentedString(fedexAccountNumber)).append("\n");
    sb.append("    freeShipping: ").append(toIndentedString(freeShipping)).append("\n");
    sb.append("    freeShippingMinimum: ").append(toIndentedString(freeShippingMinimum)).append("\n");
    sb.append("    maximumItemCount: ").append(toIndentedString(maximumItemCount)).append("\n");
    sb.append("    minimumItemCount: ").append(toIndentedString(minimumItemCount)).append("\n");
    sb.append("    minimumSubtotal: ").append(toIndentedString(minimumSubtotal)).append("\n");
    sb.append("    noCoupons: ").append(toIndentedString(noCoupons)).append("\n");
    sb.append("    noFreeShipping: ").append(toIndentedString(noFreeShipping)).append("\n");
    sb.append("    noRealtimeCharge: ").append(toIndentedString(noRealtimeCharge)).append("\n");
    sb.append("    pricingTiers: ").append(toIndentedString(pricingTiers)).append("\n");
    sb.append("    shippingAddresses: ").append(toIndentedString(shippingAddresses)).append("\n");
    sb.append("    signupDts: ").append(toIndentedString(signupDts)).append("\n");
    sb.append("    taxExempt: ").append(toIndentedString(taxExempt)).append("\n");
    sb.append("    upsAccountNumber: ").append(toIndentedString(upsAccountNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

