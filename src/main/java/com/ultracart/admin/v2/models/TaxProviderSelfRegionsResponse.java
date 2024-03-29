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
import com.ultracart.admin.v2.models.TaxStateCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TaxProviderSelfRegionsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class TaxProviderSelfRegionsResponse {
  @SerializedName("regions")
  private List<TaxStateCode> regions = null;

  public TaxProviderSelfRegionsResponse regions(List<TaxStateCode> regions) {
    this.regions = regions;
    return this;
  }

  public TaxProviderSelfRegionsResponse addRegionsItem(TaxStateCode regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<TaxStateCode>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * regions
   * @return regions
  **/
  @ApiModelProperty(value = "regions")
  public List<TaxStateCode> getRegions() {
    return regions;
  }

  public void setRegions(List<TaxStateCode> regions) {
    this.regions = regions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxProviderSelfRegionsResponse taxProviderSelfRegionsResponse = (TaxProviderSelfRegionsResponse) o;
    return Objects.equals(this.regions, taxProviderSelfRegionsResponse.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxProviderSelfRegionsResponse {\n");
    
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

