/*
 * UltraCart Rest API V2
 * This is the next generation UltraCart REST API...
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OrderInternal
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class OrderInternal {
  @SerializedName("exported_to_accounting")
  private Boolean exportedToAccounting = null;

  @SerializedName("merchant_notes")
  private String merchantNotes = null;

  @SerializedName("placed_by_user")
  private String placedByUser = null;

  @SerializedName("refund_by_user")
  private String refundByUser = null;

  @SerializedName("sales_rep_code")
  private String salesRepCode = null;

  public OrderInternal exportedToAccounting(Boolean exportedToAccounting) {
    this.exportedToAccounting = exportedToAccounting;
    return this;
  }

   /**
   * True if the order has been exported to QuickBooks. If QuickBooks is not configured, then this will already be true
   * @return exportedToAccounting
  **/
  @ApiModelProperty(value = "True if the order has been exported to QuickBooks. If QuickBooks is not configured, then this will already be true")
  public Boolean isExportedToAccounting() {
    return exportedToAccounting;
  }

  public void setExportedToAccounting(Boolean exportedToAccounting) {
    this.exportedToAccounting = exportedToAccounting;
  }

  public OrderInternal merchantNotes(String merchantNotes) {
    this.merchantNotes = merchantNotes;
    return this;
  }

   /**
   * Merchant notes
   * @return merchantNotes
  **/
  @ApiModelProperty(value = "Merchant notes")
  public String getMerchantNotes() {
    return merchantNotes;
  }

  public void setMerchantNotes(String merchantNotes) {
    this.merchantNotes = merchantNotes;
  }

  public OrderInternal placedByUser(String placedByUser) {
    this.placedByUser = placedByUser;
    return this;
  }

   /**
   * If placed via the BEOE, this is the user that placed the order
   * @return placedByUser
  **/
  @ApiModelProperty(value = "If placed via the BEOE, this is the user that placed the order")
  public String getPlacedByUser() {
    return placedByUser;
  }

  public void setPlacedByUser(String placedByUser) {
    this.placedByUser = placedByUser;
  }

  public OrderInternal refundByUser(String refundByUser) {
    this.refundByUser = refundByUser;
    return this;
  }

   /**
   * User that issued the refund
   * @return refundByUser
  **/
  @ApiModelProperty(value = "User that issued the refund")
  public String getRefundByUser() {
    return refundByUser;
  }

  public void setRefundByUser(String refundByUser) {
    this.refundByUser = refundByUser;
  }

  public OrderInternal salesRepCode(String salesRepCode) {
    this.salesRepCode = salesRepCode;
    return this;
  }

   /**
   * Sales rep code associated with the order
   * @return salesRepCode
  **/
  @ApiModelProperty(value = "Sales rep code associated with the order")
  public String getSalesRepCode() {
    return salesRepCode;
  }

  public void setSalesRepCode(String salesRepCode) {
    this.salesRepCode = salesRepCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderInternal orderInternal = (OrderInternal) o;
    return Objects.equals(this.exportedToAccounting, orderInternal.exportedToAccounting) &&
        Objects.equals(this.merchantNotes, orderInternal.merchantNotes) &&
        Objects.equals(this.placedByUser, orderInternal.placedByUser) &&
        Objects.equals(this.refundByUser, orderInternal.refundByUser) &&
        Objects.equals(this.salesRepCode, orderInternal.salesRepCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportedToAccounting, merchantNotes, placedByUser, refundByUser, salesRepCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderInternal {\n");
    
    sb.append("    exportedToAccounting: ").append(toIndentedString(exportedToAccounting)).append("\n");
    sb.append("    merchantNotes: ").append(toIndentedString(merchantNotes)).append("\n");
    sb.append("    placedByUser: ").append(toIndentedString(placedByUser)).append("\n");
    sb.append("    refundByUser: ").append(toIndentedString(refundByUser)).append("\n");
    sb.append("    salesRepCode: ").append(toIndentedString(salesRepCode)).append("\n");
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
