/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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
import com.ultracart.admin.v2.models.AffiliateClick;
import com.ultracart.admin.v2.models.AffiliateLink;
import com.ultracart.admin.v2.models.Order;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ultracart.admin.v2.util.JSON;

/**
 * AffiliateLedger
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class AffiliateLedger {
  public static final String SERIALIZED_NAME_AFFILIATE_CLICK_OID = "affiliate_click_oid";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_CLICK_OID)
  private Integer affiliateClickOid;

  public static final String SERIALIZED_NAME_AFFILIATE_LEDGER_OID = "affiliate_ledger_oid";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_LEDGER_OID)
  private Integer affiliateLedgerOid;

  public static final String SERIALIZED_NAME_AFFILIATE_LINK_OID = "affiliate_link_oid";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_LINK_OID)
  private Integer affiliateLinkOid;

  public static final String SERIALIZED_NAME_AFFILIATE_OID = "affiliate_oid";
  @SerializedName(SERIALIZED_NAME_AFFILIATE_OID)
  private Integer affiliateOid;

  public static final String SERIALIZED_NAME_ASSIGNED_BY_USER = "assigned_by_user";
  @SerializedName(SERIALIZED_NAME_ASSIGNED_BY_USER)
  private String assignedByUser;

  public static final String SERIALIZED_NAME_CLICK = "click";
  @SerializedName(SERIALIZED_NAME_CLICK)
  private AffiliateClick click;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private AffiliateLink link;

  public static final String SERIALIZED_NAME_ORDER = "order";
  @SerializedName(SERIALIZED_NAME_ORDER)
  private Order order;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_ORIGINAL_TRANSACTION_DTS = "original_transaction_dts";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_TRANSACTION_DTS)
  private String originalTransactionDts;

  public static final String SERIALIZED_NAME_SUB_ID = "sub_id";
  @SerializedName(SERIALIZED_NAME_SUB_ID)
  private String subId;

  public static final String SERIALIZED_NAME_TIER_NUMBER = "tier_number";
  @SerializedName(SERIALIZED_NAME_TIER_NUMBER)
  private Integer tierNumber;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transaction_amount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private BigDecimal transactionAmount;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT_PAID = "transaction_amount_paid";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT_PAID)
  private BigDecimal transactionAmountPaid;

  public static final String SERIALIZED_NAME_TRANSACTION_DTS = "transaction_dts";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DTS)
  private String transactionDts;

  public static final String SERIALIZED_NAME_TRANSACTION_MEMO = "transaction_memo";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_MEMO)
  private String transactionMemo;

  public static final String SERIALIZED_NAME_TRANSACTION_PERCENTAGE = "transaction_percentage";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_PERCENTAGE)
  private BigDecimal transactionPercentage;

  /**
   * Transaction state
   */
  @JsonAdapter(TransactionStateEnum.Adapter.class)
  public enum TransactionStateEnum {
    PENDING("Pending"),
    
    POSTED("Posted"),
    
    APPROVED("Approved"),
    
    PAID("Paid"),
    
    REJECTED("Rejected"),
    
    PARTIALLY_PAID("Partially Paid");

    private String value;

    TransactionStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionStateEnum fromValue(String value) {
      for (TransactionStateEnum b : TransactionStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransactionStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_STATE = "transaction_state";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATE)
  private TransactionStateEnum transactionState;

  public AffiliateLedger() { 
  }

  public AffiliateLedger affiliateClickOid(Integer affiliateClickOid) {
    
    this.affiliateClickOid = affiliateClickOid;
    return this;
  }

   /**
   * Unique object identifier for the click associated with this ledger entry
   * @return affiliateClickOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique object identifier for the click associated with this ledger entry")

  public Integer getAffiliateClickOid() {
    return affiliateClickOid;
  }


  public void setAffiliateClickOid(Integer affiliateClickOid) {
    this.affiliateClickOid = affiliateClickOid;
  }


  public AffiliateLedger affiliateLedgerOid(Integer affiliateLedgerOid) {
    
    this.affiliateLedgerOid = affiliateLedgerOid;
    return this;
  }

   /**
   * Affiliate ledger object ID associated with this ledger
   * @return affiliateLedgerOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Affiliate ledger object ID associated with this ledger")

  public Integer getAffiliateLedgerOid() {
    return affiliateLedgerOid;
  }


  public void setAffiliateLedgerOid(Integer affiliateLedgerOid) {
    this.affiliateLedgerOid = affiliateLedgerOid;
  }


  public AffiliateLedger affiliateLinkOid(Integer affiliateLinkOid) {
    
    this.affiliateLinkOid = affiliateLinkOid;
    return this;
  }

   /**
   * Unique object identifier for the link that this click is associated with
   * @return affiliateLinkOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique object identifier for the link that this click is associated with")

  public Integer getAffiliateLinkOid() {
    return affiliateLinkOid;
  }


  public void setAffiliateLinkOid(Integer affiliateLinkOid) {
    this.affiliateLinkOid = affiliateLinkOid;
  }


  public AffiliateLedger affiliateOid(Integer affiliateOid) {
    
    this.affiliateOid = affiliateOid;
    return this;
  }

   /**
   * Affiliate object ID associated with this transaction
   * @return affiliateOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Affiliate object ID associated with this transaction")

  public Integer getAffiliateOid() {
    return affiliateOid;
  }


  public void setAffiliateOid(Integer affiliateOid) {
    this.affiliateOid = affiliateOid;
  }


  public AffiliateLedger assignedByUser(String assignedByUser) {
    
    this.assignedByUser = assignedByUser;
    return this;
  }

   /**
   * User that assigned the transaction if it was done manually
   * @return assignedByUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User that assigned the transaction if it was done manually")

  public String getAssignedByUser() {
    return assignedByUser;
  }


  public void setAssignedByUser(String assignedByUser) {
    this.assignedByUser = assignedByUser;
  }


  public AffiliateLedger click(AffiliateClick click) {
    
    this.click = click;
    return this;
  }

   /**
   * Get click
   * @return click
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AffiliateClick getClick() {
    return click;
  }


  public void setClick(AffiliateClick click) {
    this.click = click;
  }


  public AffiliateLedger itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Item ID associated with this transaction
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item ID associated with this transaction")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public AffiliateLedger link(AffiliateLink link) {
    
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AffiliateLink getLink() {
    return link;
  }


  public void setLink(AffiliateLink link) {
    this.link = link;
  }


  public AffiliateLedger order(Order order) {
    
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Order getOrder() {
    return order;
  }


  public void setOrder(Order order) {
    this.order = order;
  }


  public AffiliateLedger orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Order ID associated with this transaction
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order ID associated with this transaction")

  public String getOrderId() {
    return orderId;
  }


  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public AffiliateLedger originalTransactionDts(String originalTransactionDts) {
    
    this.originalTransactionDts = originalTransactionDts;
    return this;
  }

   /**
   * Date/time of the original transaction for reversals
   * @return originalTransactionDts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date/time of the original transaction for reversals")

  public String getOriginalTransactionDts() {
    return originalTransactionDts;
  }


  public void setOriginalTransactionDts(String originalTransactionDts) {
    this.originalTransactionDts = originalTransactionDts;
  }


  public AffiliateLedger subId(String subId) {
    
    this.subId = subId;
    return this;
  }

   /**
   * Sub ID associated with transaction (from the click)
   * @return subId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sub ID associated with transaction (from the click)")

  public String getSubId() {
    return subId;
  }


  public void setSubId(String subId) {
    this.subId = subId;
  }


  public AffiliateLedger tierNumber(Integer tierNumber) {
    
    this.tierNumber = tierNumber;
    return this;
  }

   /**
   * Tier number that this transaction earned
   * @return tierNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tier number that this transaction earned")

  public Integer getTierNumber() {
    return tierNumber;
  }


  public void setTierNumber(Integer tierNumber) {
    this.tierNumber = tierNumber;
  }


  public AffiliateLedger transactionAmount(BigDecimal transactionAmount) {
    
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * Transaction amount
   * @return transactionAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction amount")

  public BigDecimal getTransactionAmount() {
    return transactionAmount;
  }


  public void setTransactionAmount(BigDecimal transactionAmount) {
    this.transactionAmount = transactionAmount;
  }


  public AffiliateLedger transactionAmountPaid(BigDecimal transactionAmountPaid) {
    
    this.transactionAmountPaid = transactionAmountPaid;
    return this;
  }

   /**
   * Amount of the transaction that has been paid out.
   * @return transactionAmountPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of the transaction that has been paid out.")

  public BigDecimal getTransactionAmountPaid() {
    return transactionAmountPaid;
  }


  public void setTransactionAmountPaid(BigDecimal transactionAmountPaid) {
    this.transactionAmountPaid = transactionAmountPaid;
  }


  public AffiliateLedger transactionDts(String transactionDts) {
    
    this.transactionDts = transactionDts;
    return this;
  }

   /**
   * Date/time that the transaction was made
   * @return transactionDts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date/time that the transaction was made")

  public String getTransactionDts() {
    return transactionDts;
  }


  public void setTransactionDts(String transactionDts) {
    this.transactionDts = transactionDts;
  }


  public AffiliateLedger transactionMemo(String transactionMemo) {
    
    this.transactionMemo = transactionMemo;
    return this;
  }

   /**
   * Memo explaining the transaction
   * @return transactionMemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Memo explaining the transaction")

  public String getTransactionMemo() {
    return transactionMemo;
  }


  public void setTransactionMemo(String transactionMemo) {
    this.transactionMemo = transactionMemo;
  }


  public AffiliateLedger transactionPercentage(BigDecimal transactionPercentage) {
    
    this.transactionPercentage = transactionPercentage;
    return this;
  }

   /**
   * Percentage associated with this transaction
   * @return transactionPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Percentage associated with this transaction")

  public BigDecimal getTransactionPercentage() {
    return transactionPercentage;
  }


  public void setTransactionPercentage(BigDecimal transactionPercentage) {
    this.transactionPercentage = transactionPercentage;
  }


  public AffiliateLedger transactionState(TransactionStateEnum transactionState) {
    
    this.transactionState = transactionState;
    return this;
  }

   /**
   * Transaction state
   * @return transactionState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction state")

  public TransactionStateEnum getTransactionState() {
    return transactionState;
  }


  public void setTransactionState(TransactionStateEnum transactionState) {
    this.transactionState = transactionState;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffiliateLedger affiliateLedger = (AffiliateLedger) o;
    return Objects.equals(this.affiliateClickOid, affiliateLedger.affiliateClickOid) &&
        Objects.equals(this.affiliateLedgerOid, affiliateLedger.affiliateLedgerOid) &&
        Objects.equals(this.affiliateLinkOid, affiliateLedger.affiliateLinkOid) &&
        Objects.equals(this.affiliateOid, affiliateLedger.affiliateOid) &&
        Objects.equals(this.assignedByUser, affiliateLedger.assignedByUser) &&
        Objects.equals(this.click, affiliateLedger.click) &&
        Objects.equals(this.itemId, affiliateLedger.itemId) &&
        Objects.equals(this.link, affiliateLedger.link) &&
        Objects.equals(this.order, affiliateLedger.order) &&
        Objects.equals(this.orderId, affiliateLedger.orderId) &&
        Objects.equals(this.originalTransactionDts, affiliateLedger.originalTransactionDts) &&
        Objects.equals(this.subId, affiliateLedger.subId) &&
        Objects.equals(this.tierNumber, affiliateLedger.tierNumber) &&
        Objects.equals(this.transactionAmount, affiliateLedger.transactionAmount) &&
        Objects.equals(this.transactionAmountPaid, affiliateLedger.transactionAmountPaid) &&
        Objects.equals(this.transactionDts, affiliateLedger.transactionDts) &&
        Objects.equals(this.transactionMemo, affiliateLedger.transactionMemo) &&
        Objects.equals(this.transactionPercentage, affiliateLedger.transactionPercentage) &&
        Objects.equals(this.transactionState, affiliateLedger.transactionState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateClickOid, affiliateLedgerOid, affiliateLinkOid, affiliateOid, assignedByUser, click, itemId, link, order, orderId, originalTransactionDts, subId, tierNumber, transactionAmount, transactionAmountPaid, transactionDts, transactionMemo, transactionPercentage, transactionState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffiliateLedger {\n");
    sb.append("    affiliateClickOid: ").append(toIndentedString(affiliateClickOid)).append("\n");
    sb.append("    affiliateLedgerOid: ").append(toIndentedString(affiliateLedgerOid)).append("\n");
    sb.append("    affiliateLinkOid: ").append(toIndentedString(affiliateLinkOid)).append("\n");
    sb.append("    affiliateOid: ").append(toIndentedString(affiliateOid)).append("\n");
    sb.append("    assignedByUser: ").append(toIndentedString(assignedByUser)).append("\n");
    sb.append("    click: ").append(toIndentedString(click)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    originalTransactionDts: ").append(toIndentedString(originalTransactionDts)).append("\n");
    sb.append("    subId: ").append(toIndentedString(subId)).append("\n");
    sb.append("    tierNumber: ").append(toIndentedString(tierNumber)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    transactionAmountPaid: ").append(toIndentedString(transactionAmountPaid)).append("\n");
    sb.append("    transactionDts: ").append(toIndentedString(transactionDts)).append("\n");
    sb.append("    transactionMemo: ").append(toIndentedString(transactionMemo)).append("\n");
    sb.append("    transactionPercentage: ").append(toIndentedString(transactionPercentage)).append("\n");
    sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("affiliate_click_oid");
    openapiFields.add("affiliate_ledger_oid");
    openapiFields.add("affiliate_link_oid");
    openapiFields.add("affiliate_oid");
    openapiFields.add("assigned_by_user");
    openapiFields.add("click");
    openapiFields.add("item_id");
    openapiFields.add("link");
    openapiFields.add("order");
    openapiFields.add("order_id");
    openapiFields.add("original_transaction_dts");
    openapiFields.add("sub_id");
    openapiFields.add("tier_number");
    openapiFields.add("transaction_amount");
    openapiFields.add("transaction_amount_paid");
    openapiFields.add("transaction_dts");
    openapiFields.add("transaction_memo");
    openapiFields.add("transaction_percentage");
    openapiFields.add("transaction_state");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AffiliateLedger
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AffiliateLedger.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AffiliateLedger is not found in the empty JSON string", AffiliateLedger.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AffiliateLedger.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AffiliateLedger` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assigned_by_user") != null && !jsonObj.get("assigned_by_user").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assigned_by_user` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assigned_by_user").toString()));
      }
      // validate the optional field `click`
      if (jsonObj.getAsJsonObject("click") != null) {
        AffiliateClick.validateJsonObject(jsonObj.getAsJsonObject("click"));
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      // validate the optional field `link`
      if (jsonObj.getAsJsonObject("link") != null) {
        AffiliateLink.validateJsonObject(jsonObj.getAsJsonObject("link"));
      }
      // validate the optional field `order`
      if (jsonObj.getAsJsonObject("order") != null) {
        Order.validateJsonObject(jsonObj.getAsJsonObject("order"));
      }
      if (jsonObj.get("order_id") != null && !jsonObj.get("order_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_id").toString()));
      }
      if (jsonObj.get("original_transaction_dts") != null && !jsonObj.get("original_transaction_dts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_transaction_dts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_transaction_dts").toString()));
      }
      if (jsonObj.get("sub_id") != null && !jsonObj.get("sub_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_id").toString()));
      }
      if (jsonObj.get("transaction_dts") != null && !jsonObj.get("transaction_dts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_dts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_dts").toString()));
      }
      if (jsonObj.get("transaction_memo") != null && !jsonObj.get("transaction_memo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_memo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_memo").toString()));
      }
      if (jsonObj.get("transaction_state") != null && !jsonObj.get("transaction_state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transaction_state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transaction_state").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AffiliateLedger.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AffiliateLedger' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AffiliateLedger> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AffiliateLedger.class));

       return (TypeAdapter<T>) new TypeAdapter<AffiliateLedger>() {
           @Override
           public void write(JsonWriter out, AffiliateLedger value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AffiliateLedger read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AffiliateLedger given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AffiliateLedger
  * @throws IOException if the JSON string is invalid with respect to AffiliateLedger
  */
  public static AffiliateLedger fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AffiliateLedger.class);
  }

 /**
  * Convert an instance of AffiliateLedger to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

