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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * OrderQuery
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class OrderQuery {
  @SerializedName("cc_email")
  private String ccEmail = null;

  @SerializedName("channel_partner_code")
  private String channelPartnerCode = null;

  @SerializedName("channel_partner_order_id")
  private String channelPartnerOrderId = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("creation_date_begin")
  private String creationDateBegin = null;

  @SerializedName("creation_date_end")
  private String creationDateEnd = null;

  /**
   * Current stage that the order is in.
   */
  @JsonAdapter(CurrentStageEnum.Adapter.class)
  public enum CurrentStageEnum {
    ACCOUNTS_RECEIVABLE("Accounts Receivable"),
    
    PENDING_CLEARANCE("Pending Clearance"),
    
    FRAUD_REVIEW("Fraud Review"),
    
    REJECTED("Rejected"),
    
    SHIPPING_DEPARTMENT("Shipping Department"),
    
    COMPLETED_ORDER("Completed Order"),
    
    QUOTE_REQUEST("Quote Request"),
    
    QUOTE_SENT("Quote Sent"),
    
    LEAST_COST_ROUTING("Least Cost Routing"),
    
    UNKNOWN("Unknown");

    private String value;

    CurrentStageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CurrentStageEnum fromValue(String text) {
      for (CurrentStageEnum b : CurrentStageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CurrentStageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CurrentStageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CurrentStageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CurrentStageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("current_stage")
  private CurrentStageEnum currentStage = null;

  @SerializedName("custom_field_1")
  private String customField1 = null;

  @SerializedName("custom_field_2")
  private String customField2 = null;

  @SerializedName("custom_field_3")
  private String customField3 = null;

  @SerializedName("custom_field_4")
  private String customField4 = null;

  @SerializedName("custom_field_5")
  private String customField5 = null;

  @SerializedName("custom_field_6")
  private String customField6 = null;

  @SerializedName("custom_field_7")
  private String customField7 = null;

  @SerializedName("customer_profile_oid")
  private Integer customerProfileOid = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("item_id")
  private String itemId = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("payment_date_begin")
  private String paymentDateBegin = null;

  @SerializedName("payment_date_end")
  private String paymentDateEnd = null;

  /**
   * Payment method
   */
  @JsonAdapter(PaymentMethodEnum.Adapter.class)
  public enum PaymentMethodEnum {
    AFFIRM("Affirm"),
    
    AMAZON("Amazon"),
    
    AMAZON_SC("Amazon SC"),
    
    CASH("Cash"),
    
    CHECK("Check"),
    
    COD("COD"),
    
    CREDIT_CARD("Credit Card"),
    
    ECHECK("eCheck"),
    
    LOANHERO("LoanHero"),
    
    MONEY_ORDER("Money Order"),
    
    PAYPAL("PayPal"),
    
    PURCHASE_ORDER("Purchase Order"),
    
    QUOTE_REQUEST("Quote Request"),
    
    UNKNOWN("Unknown"),
    
    WIRE_TRANSFER("Wire Transfer"),
    
    VENMO("Venmo"),
    
    APPLE_PAY("Apple Pay"),
    
    _GOOGLE_PAY(" Google Pay");

    private String value;

    PaymentMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentMethodEnum fromValue(String text) {
      for (PaymentMethodEnum b : PaymentMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("payment_method")
  private PaymentMethodEnum paymentMethod = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("purchase_order_number")
  private String purchaseOrderNumber = null;

  @SerializedName("refund_date_begin")
  private String refundDateBegin = null;

  @SerializedName("refund_date_end")
  private String refundDateEnd = null;

  @SerializedName("rma")
  private String rma = null;

  @SerializedName("screen_branding_theme_code")
  private String screenBrandingThemeCode = null;

  @SerializedName("shipment_date_begin")
  private String shipmentDateBegin = null;

  @SerializedName("shipment_date_end")
  private String shipmentDateEnd = null;

  @SerializedName("shipped_on_date_begin")
  private String shippedOnDateBegin = null;

  @SerializedName("shipped_on_date_end")
  private String shippedOnDateEnd = null;

  @SerializedName("state_region")
  private String stateRegion = null;

  @SerializedName("storefront_host_name")
  private String storefrontHostName = null;

  @SerializedName("total")
  private BigDecimal total = null;

  public OrderQuery ccEmail(String ccEmail) {
    this.ccEmail = ccEmail;
    return this;
  }

   /**
   * CC Email
   * @return ccEmail
  **/
  @ApiModelProperty(value = "CC Email")
  public String getCcEmail() {
    return ccEmail;
  }

  public void setCcEmail(String ccEmail) {
    this.ccEmail = ccEmail;
  }

  public OrderQuery channelPartnerCode(String channelPartnerCode) {
    this.channelPartnerCode = channelPartnerCode;
    return this;
  }

   /**
   * The code of the channel partner
   * @return channelPartnerCode
  **/
  @ApiModelProperty(value = "The code of the channel partner")
  public String getChannelPartnerCode() {
    return channelPartnerCode;
  }

  public void setChannelPartnerCode(String channelPartnerCode) {
    this.channelPartnerCode = channelPartnerCode;
  }

  public OrderQuery channelPartnerOrderId(String channelPartnerOrderId) {
    this.channelPartnerOrderId = channelPartnerOrderId;
    return this;
  }

   /**
   * The order ID assigned by the channel partner for this order
   * @return channelPartnerOrderId
  **/
  @ApiModelProperty(value = "The order ID assigned by the channel partner for this order")
  public String getChannelPartnerOrderId() {
    return channelPartnerOrderId;
  }

  public void setChannelPartnerOrderId(String channelPartnerOrderId) {
    this.channelPartnerOrderId = channelPartnerOrderId;
  }

  public OrderQuery city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @ApiModelProperty(value = "City")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public OrderQuery company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Company
   * @return company
  **/
  @ApiModelProperty(value = "Company")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public OrderQuery countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO-3166 two letter country code
   * @return countryCode
  **/
  @ApiModelProperty(value = "ISO-3166 two letter country code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public OrderQuery creationDateBegin(String creationDateBegin) {
    this.creationDateBegin = creationDateBegin;
    return this;
  }

   /**
   * Date/time that the order was created
   * @return creationDateBegin
  **/
  @ApiModelProperty(value = "Date/time that the order was created")
  public String getCreationDateBegin() {
    return creationDateBegin;
  }

  public void setCreationDateBegin(String creationDateBegin) {
    this.creationDateBegin = creationDateBegin;
  }

  public OrderQuery creationDateEnd(String creationDateEnd) {
    this.creationDateEnd = creationDateEnd;
    return this;
  }

   /**
   * Date/time that the order was created
   * @return creationDateEnd
  **/
  @ApiModelProperty(value = "Date/time that the order was created")
  public String getCreationDateEnd() {
    return creationDateEnd;
  }

  public void setCreationDateEnd(String creationDateEnd) {
    this.creationDateEnd = creationDateEnd;
  }

  public OrderQuery currentStage(CurrentStageEnum currentStage) {
    this.currentStage = currentStage;
    return this;
  }

   /**
   * Current stage that the order is in.
   * @return currentStage
  **/
  @ApiModelProperty(value = "Current stage that the order is in.")
  public CurrentStageEnum getCurrentStage() {
    return currentStage;
  }

  public void setCurrentStage(CurrentStageEnum currentStage) {
    this.currentStage = currentStage;
  }

  public OrderQuery customField1(String customField1) {
    this.customField1 = customField1;
    return this;
  }

   /**
   * Custom field 1
   * @return customField1
  **/
  @ApiModelProperty(value = "Custom field 1")
  public String getCustomField1() {
    return customField1;
  }

  public void setCustomField1(String customField1) {
    this.customField1 = customField1;
  }

  public OrderQuery customField2(String customField2) {
    this.customField2 = customField2;
    return this;
  }

   /**
   * Custom field 2
   * @return customField2
  **/
  @ApiModelProperty(value = "Custom field 2")
  public String getCustomField2() {
    return customField2;
  }

  public void setCustomField2(String customField2) {
    this.customField2 = customField2;
  }

  public OrderQuery customField3(String customField3) {
    this.customField3 = customField3;
    return this;
  }

   /**
   * Custom field 3
   * @return customField3
  **/
  @ApiModelProperty(value = "Custom field 3")
  public String getCustomField3() {
    return customField3;
  }

  public void setCustomField3(String customField3) {
    this.customField3 = customField3;
  }

  public OrderQuery customField4(String customField4) {
    this.customField4 = customField4;
    return this;
  }

   /**
   * Custom field 4
   * @return customField4
  **/
  @ApiModelProperty(value = "Custom field 4")
  public String getCustomField4() {
    return customField4;
  }

  public void setCustomField4(String customField4) {
    this.customField4 = customField4;
  }

  public OrderQuery customField5(String customField5) {
    this.customField5 = customField5;
    return this;
  }

   /**
   * Custom field 5
   * @return customField5
  **/
  @ApiModelProperty(value = "Custom field 5")
  public String getCustomField5() {
    return customField5;
  }

  public void setCustomField5(String customField5) {
    this.customField5 = customField5;
  }

  public OrderQuery customField6(String customField6) {
    this.customField6 = customField6;
    return this;
  }

   /**
   * Custom field 6
   * @return customField6
  **/
  @ApiModelProperty(value = "Custom field 6")
  public String getCustomField6() {
    return customField6;
  }

  public void setCustomField6(String customField6) {
    this.customField6 = customField6;
  }

  public OrderQuery customField7(String customField7) {
    this.customField7 = customField7;
    return this;
  }

   /**
   * Custom field 7
   * @return customField7
  **/
  @ApiModelProperty(value = "Custom field 7")
  public String getCustomField7() {
    return customField7;
  }

  public void setCustomField7(String customField7) {
    this.customField7 = customField7;
  }

  public OrderQuery customerProfileOid(Integer customerProfileOid) {
    this.customerProfileOid = customerProfileOid;
    return this;
  }

   /**
   * The customer profile to find associated orders for
   * @return customerProfileOid
  **/
  @ApiModelProperty(value = "The customer profile to find associated orders for")
  public Integer getCustomerProfileOid() {
    return customerProfileOid;
  }

  public void setCustomerProfileOid(Integer customerProfileOid) {
    this.customerProfileOid = customerProfileOid;
  }

  public OrderQuery email(String email) {
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

  public OrderQuery firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name
   * @return firstName
  **/
  @ApiModelProperty(value = "First name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public OrderQuery itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Item ID
   * @return itemId
  **/
  @ApiModelProperty(value = "Item ID")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public OrderQuery lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name
   * @return lastName
  **/
  @ApiModelProperty(value = "Last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public OrderQuery orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order ID
   * @return orderId
  **/
  @ApiModelProperty(value = "Order ID")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderQuery paymentDateBegin(String paymentDateBegin) {
    this.paymentDateBegin = paymentDateBegin;
    return this;
  }

   /**
   * Date/time that the order was successfully processed
   * @return paymentDateBegin
  **/
  @ApiModelProperty(value = "Date/time that the order was successfully processed")
  public String getPaymentDateBegin() {
    return paymentDateBegin;
  }

  public void setPaymentDateBegin(String paymentDateBegin) {
    this.paymentDateBegin = paymentDateBegin;
  }

  public OrderQuery paymentDateEnd(String paymentDateEnd) {
    this.paymentDateEnd = paymentDateEnd;
    return this;
  }

   /**
   * Date/time that the order was successfully processed
   * @return paymentDateEnd
  **/
  @ApiModelProperty(value = "Date/time that the order was successfully processed")
  public String getPaymentDateEnd() {
    return paymentDateEnd;
  }

  public void setPaymentDateEnd(String paymentDateEnd) {
    this.paymentDateEnd = paymentDateEnd;
  }

  public OrderQuery paymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Payment method
   * @return paymentMethod
  **/
  @ApiModelProperty(value = "Payment method")
  public PaymentMethodEnum getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public OrderQuery phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Phone
   * @return phone
  **/
  @ApiModelProperty(value = "Phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public OrderQuery postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public OrderQuery purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order number
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(value = "Purchase order number")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public OrderQuery refundDateBegin(String refundDateBegin) {
    this.refundDateBegin = refundDateBegin;
    return this;
  }

   /**
   * Date/time that the order was refunded
   * @return refundDateBegin
  **/
  @ApiModelProperty(value = "Date/time that the order was refunded")
  public String getRefundDateBegin() {
    return refundDateBegin;
  }

  public void setRefundDateBegin(String refundDateBegin) {
    this.refundDateBegin = refundDateBegin;
  }

  public OrderQuery refundDateEnd(String refundDateEnd) {
    this.refundDateEnd = refundDateEnd;
    return this;
  }

   /**
   * Date/time that the order was refunded
   * @return refundDateEnd
  **/
  @ApiModelProperty(value = "Date/time that the order was refunded")
  public String getRefundDateEnd() {
    return refundDateEnd;
  }

  public void setRefundDateEnd(String refundDateEnd) {
    this.refundDateEnd = refundDateEnd;
  }

  public OrderQuery rma(String rma) {
    this.rma = rma;
    return this;
  }

   /**
   * RMA number
   * @return rma
  **/
  @ApiModelProperty(value = "RMA number")
  public String getRma() {
    return rma;
  }

  public void setRma(String rma) {
    this.rma = rma;
  }

  public OrderQuery screenBrandingThemeCode(String screenBrandingThemeCode) {
    this.screenBrandingThemeCode = screenBrandingThemeCode;
    return this;
  }

   /**
   * Screen branding theme code associated with the order (legacy checkout)
   * @return screenBrandingThemeCode
  **/
  @ApiModelProperty(value = "Screen branding theme code associated with the order (legacy checkout)")
  public String getScreenBrandingThemeCode() {
    return screenBrandingThemeCode;
  }

  public void setScreenBrandingThemeCode(String screenBrandingThemeCode) {
    this.screenBrandingThemeCode = screenBrandingThemeCode;
  }

  public OrderQuery shipmentDateBegin(String shipmentDateBegin) {
    this.shipmentDateBegin = shipmentDateBegin;
    return this;
  }

   /**
   * Date/time that the order was shipped
   * @return shipmentDateBegin
  **/
  @ApiModelProperty(value = "Date/time that the order was shipped")
  public String getShipmentDateBegin() {
    return shipmentDateBegin;
  }

  public void setShipmentDateBegin(String shipmentDateBegin) {
    this.shipmentDateBegin = shipmentDateBegin;
  }

  public OrderQuery shipmentDateEnd(String shipmentDateEnd) {
    this.shipmentDateEnd = shipmentDateEnd;
    return this;
  }

   /**
   * Date/time that the order was shipped
   * @return shipmentDateEnd
  **/
  @ApiModelProperty(value = "Date/time that the order was shipped")
  public String getShipmentDateEnd() {
    return shipmentDateEnd;
  }

  public void setShipmentDateEnd(String shipmentDateEnd) {
    this.shipmentDateEnd = shipmentDateEnd;
  }

  public OrderQuery shippedOnDateBegin(String shippedOnDateBegin) {
    this.shippedOnDateBegin = shippedOnDateBegin;
    return this;
  }

   /**
   * Date/time that the order should ship on
   * @return shippedOnDateBegin
  **/
  @ApiModelProperty(value = "Date/time that the order should ship on")
  public String getShippedOnDateBegin() {
    return shippedOnDateBegin;
  }

  public void setShippedOnDateBegin(String shippedOnDateBegin) {
    this.shippedOnDateBegin = shippedOnDateBegin;
  }

  public OrderQuery shippedOnDateEnd(String shippedOnDateEnd) {
    this.shippedOnDateEnd = shippedOnDateEnd;
    return this;
  }

   /**
   * Date/time that the order should ship on
   * @return shippedOnDateEnd
  **/
  @ApiModelProperty(value = "Date/time that the order should ship on")
  public String getShippedOnDateEnd() {
    return shippedOnDateEnd;
  }

  public void setShippedOnDateEnd(String shippedOnDateEnd) {
    this.shippedOnDateEnd = shippedOnDateEnd;
  }

  public OrderQuery stateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
    return this;
  }

   /**
   * State for United States otherwise region or province for other countries
   * @return stateRegion
  **/
  @ApiModelProperty(value = "State for United States otherwise region or province for other countries")
  public String getStateRegion() {
    return stateRegion;
  }

  public void setStateRegion(String stateRegion) {
    this.stateRegion = stateRegion;
  }

  public OrderQuery storefrontHostName(String storefrontHostName) {
    this.storefrontHostName = storefrontHostName;
    return this;
  }

   /**
   * StoreFront host name associated with the order
   * @return storefrontHostName
  **/
  @ApiModelProperty(value = "StoreFront host name associated with the order")
  public String getStorefrontHostName() {
    return storefrontHostName;
  }

  public void setStorefrontHostName(String storefrontHostName) {
    this.storefrontHostName = storefrontHostName;
  }

  public OrderQuery total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Total
   * @return total
  **/
  @ApiModelProperty(value = "Total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderQuery orderQuery = (OrderQuery) o;
    return Objects.equals(this.ccEmail, orderQuery.ccEmail) &&
        Objects.equals(this.channelPartnerCode, orderQuery.channelPartnerCode) &&
        Objects.equals(this.channelPartnerOrderId, orderQuery.channelPartnerOrderId) &&
        Objects.equals(this.city, orderQuery.city) &&
        Objects.equals(this.company, orderQuery.company) &&
        Objects.equals(this.countryCode, orderQuery.countryCode) &&
        Objects.equals(this.creationDateBegin, orderQuery.creationDateBegin) &&
        Objects.equals(this.creationDateEnd, orderQuery.creationDateEnd) &&
        Objects.equals(this.currentStage, orderQuery.currentStage) &&
        Objects.equals(this.customField1, orderQuery.customField1) &&
        Objects.equals(this.customField2, orderQuery.customField2) &&
        Objects.equals(this.customField3, orderQuery.customField3) &&
        Objects.equals(this.customField4, orderQuery.customField4) &&
        Objects.equals(this.customField5, orderQuery.customField5) &&
        Objects.equals(this.customField6, orderQuery.customField6) &&
        Objects.equals(this.customField7, orderQuery.customField7) &&
        Objects.equals(this.customerProfileOid, orderQuery.customerProfileOid) &&
        Objects.equals(this.email, orderQuery.email) &&
        Objects.equals(this.firstName, orderQuery.firstName) &&
        Objects.equals(this.itemId, orderQuery.itemId) &&
        Objects.equals(this.lastName, orderQuery.lastName) &&
        Objects.equals(this.orderId, orderQuery.orderId) &&
        Objects.equals(this.paymentDateBegin, orderQuery.paymentDateBegin) &&
        Objects.equals(this.paymentDateEnd, orderQuery.paymentDateEnd) &&
        Objects.equals(this.paymentMethod, orderQuery.paymentMethod) &&
        Objects.equals(this.phone, orderQuery.phone) &&
        Objects.equals(this.postalCode, orderQuery.postalCode) &&
        Objects.equals(this.purchaseOrderNumber, orderQuery.purchaseOrderNumber) &&
        Objects.equals(this.refundDateBegin, orderQuery.refundDateBegin) &&
        Objects.equals(this.refundDateEnd, orderQuery.refundDateEnd) &&
        Objects.equals(this.rma, orderQuery.rma) &&
        Objects.equals(this.screenBrandingThemeCode, orderQuery.screenBrandingThemeCode) &&
        Objects.equals(this.shipmentDateBegin, orderQuery.shipmentDateBegin) &&
        Objects.equals(this.shipmentDateEnd, orderQuery.shipmentDateEnd) &&
        Objects.equals(this.shippedOnDateBegin, orderQuery.shippedOnDateBegin) &&
        Objects.equals(this.shippedOnDateEnd, orderQuery.shippedOnDateEnd) &&
        Objects.equals(this.stateRegion, orderQuery.stateRegion) &&
        Objects.equals(this.storefrontHostName, orderQuery.storefrontHostName) &&
        Objects.equals(this.total, orderQuery.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ccEmail, channelPartnerCode, channelPartnerOrderId, city, company, countryCode, creationDateBegin, creationDateEnd, currentStage, customField1, customField2, customField3, customField4, customField5, customField6, customField7, customerProfileOid, email, firstName, itemId, lastName, orderId, paymentDateBegin, paymentDateEnd, paymentMethod, phone, postalCode, purchaseOrderNumber, refundDateBegin, refundDateEnd, rma, screenBrandingThemeCode, shipmentDateBegin, shipmentDateEnd, shippedOnDateBegin, shippedOnDateEnd, stateRegion, storefrontHostName, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderQuery {\n");
    
    sb.append("    ccEmail: ").append(toIndentedString(ccEmail)).append("\n");
    sb.append("    channelPartnerCode: ").append(toIndentedString(channelPartnerCode)).append("\n");
    sb.append("    channelPartnerOrderId: ").append(toIndentedString(channelPartnerOrderId)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    creationDateBegin: ").append(toIndentedString(creationDateBegin)).append("\n");
    sb.append("    creationDateEnd: ").append(toIndentedString(creationDateEnd)).append("\n");
    sb.append("    currentStage: ").append(toIndentedString(currentStage)).append("\n");
    sb.append("    customField1: ").append(toIndentedString(customField1)).append("\n");
    sb.append("    customField2: ").append(toIndentedString(customField2)).append("\n");
    sb.append("    customField3: ").append(toIndentedString(customField3)).append("\n");
    sb.append("    customField4: ").append(toIndentedString(customField4)).append("\n");
    sb.append("    customField5: ").append(toIndentedString(customField5)).append("\n");
    sb.append("    customField6: ").append(toIndentedString(customField6)).append("\n");
    sb.append("    customField7: ").append(toIndentedString(customField7)).append("\n");
    sb.append("    customerProfileOid: ").append(toIndentedString(customerProfileOid)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentDateBegin: ").append(toIndentedString(paymentDateBegin)).append("\n");
    sb.append("    paymentDateEnd: ").append(toIndentedString(paymentDateEnd)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    refundDateBegin: ").append(toIndentedString(refundDateBegin)).append("\n");
    sb.append("    refundDateEnd: ").append(toIndentedString(refundDateEnd)).append("\n");
    sb.append("    rma: ").append(toIndentedString(rma)).append("\n");
    sb.append("    screenBrandingThemeCode: ").append(toIndentedString(screenBrandingThemeCode)).append("\n");
    sb.append("    shipmentDateBegin: ").append(toIndentedString(shipmentDateBegin)).append("\n");
    sb.append("    shipmentDateEnd: ").append(toIndentedString(shipmentDateEnd)).append("\n");
    sb.append("    shippedOnDateBegin: ").append(toIndentedString(shippedOnDateBegin)).append("\n");
    sb.append("    shippedOnDateEnd: ").append(toIndentedString(shippedOnDateEnd)).append("\n");
    sb.append("    stateRegion: ").append(toIndentedString(stateRegion)).append("\n");
    sb.append("    storefrontHostName: ").append(toIndentedString(storefrontHostName)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

