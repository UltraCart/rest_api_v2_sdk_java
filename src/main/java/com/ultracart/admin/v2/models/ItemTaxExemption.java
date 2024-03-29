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

/**
 * ItemTaxExemption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemTaxExemption {
  @SerializedName("city")
  private String city = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("county")
  private String county = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state_code")
  private String stateCode = null;

  public ItemTaxExemption city(String city) {
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

  public ItemTaxExemption countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code (ISO-3166 two letter)
   * @return countryCode
  **/
  @ApiModelProperty(value = "Country code (ISO-3166 two letter)")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public ItemTaxExemption county(String county) {
    this.county = county;
    return this;
  }

   /**
   * County
   * @return county
  **/
  @ApiModelProperty(value = "County")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public ItemTaxExemption postalCode(String postalCode) {
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

  public ItemTaxExemption stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * State code
   * @return stateCode
  **/
  @ApiModelProperty(value = "State code")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemTaxExemption itemTaxExemption = (ItemTaxExemption) o;
    return Objects.equals(this.city, itemTaxExemption.city) &&
        Objects.equals(this.countryCode, itemTaxExemption.countryCode) &&
        Objects.equals(this.county, itemTaxExemption.county) &&
        Objects.equals(this.postalCode, itemTaxExemption.postalCode) &&
        Objects.equals(this.stateCode, itemTaxExemption.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, countryCode, county, postalCode, stateCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemTaxExemption {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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

