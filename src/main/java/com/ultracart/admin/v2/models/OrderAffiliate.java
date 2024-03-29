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
import com.ultracart.admin.v2.models.OrderAffiliateLedger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * OrderAffiliate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class OrderAffiliate {
  @SerializedName("affiliate_oid")
  private Integer affiliateOid = null;

  @SerializedName("ledger_entries")
  private List<OrderAffiliateLedger> ledgerEntries = null;

  @SerializedName("sub_id")
  private String subId = null;

  public OrderAffiliate affiliateOid(Integer affiliateOid) {
    this.affiliateOid = affiliateOid;
    return this;
  }

   /**
   * Affiliate ID
   * @return affiliateOid
  **/
  @ApiModelProperty(value = "Affiliate ID")
  public Integer getAffiliateOid() {
    return affiliateOid;
  }

  public void setAffiliateOid(Integer affiliateOid) {
    this.affiliateOid = affiliateOid;
  }

  public OrderAffiliate ledgerEntries(List<OrderAffiliateLedger> ledgerEntries) {
    this.ledgerEntries = ledgerEntries;
    return this;
  }

  public OrderAffiliate addLedgerEntriesItem(OrderAffiliateLedger ledgerEntriesItem) {
    if (this.ledgerEntries == null) {
      this.ledgerEntries = new ArrayList<OrderAffiliateLedger>();
    }
    this.ledgerEntries.add(ledgerEntriesItem);
    return this;
  }

   /**
   * Ledger entries associated with all the commissions earned on this order
   * @return ledgerEntries
  **/
  @ApiModelProperty(value = "Ledger entries associated with all the commissions earned on this order")
  public List<OrderAffiliateLedger> getLedgerEntries() {
    return ledgerEntries;
  }

  public void setLedgerEntries(List<OrderAffiliateLedger> ledgerEntries) {
    this.ledgerEntries = ledgerEntries;
  }

  public OrderAffiliate subId(String subId) {
    this.subId = subId;
    return this;
  }

   /**
   * Sub identifier provided by the affiliate on the click that generated this order
   * @return subId
  **/
  @ApiModelProperty(value = "Sub identifier provided by the affiliate on the click that generated this order")
  public String getSubId() {
    return subId;
  }

  public void setSubId(String subId) {
    this.subId = subId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderAffiliate orderAffiliate = (OrderAffiliate) o;
    return Objects.equals(this.affiliateOid, orderAffiliate.affiliateOid) &&
        Objects.equals(this.ledgerEntries, orderAffiliate.ledgerEntries) &&
        Objects.equals(this.subId, orderAffiliate.subId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateOid, ledgerEntries, subId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderAffiliate {\n");
    
    sb.append("    affiliateOid: ").append(toIndentedString(affiliateOid)).append("\n");
    sb.append("    ledgerEntries: ").append(toIndentedString(ledgerEntries)).append("\n");
    sb.append("    subId: ").append(toIndentedString(subId)).append("\n");
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

