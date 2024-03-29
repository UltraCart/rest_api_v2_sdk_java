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
import java.util.ArrayList;
import java.util.List;

/**
 * EmailStatPostcardSummaryRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class EmailStatPostcardSummaryRequest {
  @SerializedName("commseq_postcard_uuids")
  private List<String> commseqPostcardUuids = null;

  @SerializedName("days")
  private Integer days = null;

  public EmailStatPostcardSummaryRequest commseqPostcardUuids(List<String> commseqPostcardUuids) {
    this.commseqPostcardUuids = commseqPostcardUuids;
    return this;
  }

  public EmailStatPostcardSummaryRequest addCommseqPostcardUuidsItem(String commseqPostcardUuidsItem) {
    if (this.commseqPostcardUuids == null) {
      this.commseqPostcardUuids = new ArrayList<String>();
    }
    this.commseqPostcardUuids.add(commseqPostcardUuidsItem);
    return this;
  }

   /**
   * Get commseqPostcardUuids
   * @return commseqPostcardUuids
  **/
  @ApiModelProperty(value = "")
  public List<String> getCommseqPostcardUuids() {
    return commseqPostcardUuids;
  }

  public void setCommseqPostcardUuids(List<String> commseqPostcardUuids) {
    this.commseqPostcardUuids = commseqPostcardUuids;
  }

  public EmailStatPostcardSummaryRequest days(Integer days) {
    this.days = days;
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(value = "")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailStatPostcardSummaryRequest emailStatPostcardSummaryRequest = (EmailStatPostcardSummaryRequest) o;
    return Objects.equals(this.commseqPostcardUuids, emailStatPostcardSummaryRequest.commseqPostcardUuids) &&
        Objects.equals(this.days, emailStatPostcardSummaryRequest.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commseqPostcardUuids, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailStatPostcardSummaryRequest {\n");
    
    sb.append("    commseqPostcardUuids: ").append(toIndentedString(commseqPostcardUuids)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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

