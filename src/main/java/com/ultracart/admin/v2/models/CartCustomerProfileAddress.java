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
 * CartCustomerProfileAddress
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class CartCustomerProfileAddress {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("day_phone")
  private String dayPhone = null;

  @SerializedName("evening_phone")
  private String eveningPhone = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("oid")
  private Integer oid = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state_region")
  private String stateRegion = null;

  @SerializedName("tax_county")
  private String taxCounty = null;

  @SerializedName("title")
  private String title = null;

  public CartCustomerProfileAddress address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Address 1
   * @return address1
  **/
  @ApiModelProperty(value = "Address 1")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public CartCustomerProfileAddress address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Address 2
   * @return address2
  **/
  @ApiModelProperty(value = "Address 2")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public CartCustomerProfileAddress city(String city) {
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

  public CartCustomerProfileAddress company(String company) {
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

  public CartCustomerProfileAddress countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * ISO-3166 Country code
   * @return countryCode
  **/
  @ApiModelProperty(value = "ISO-3166 Country code")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public CartCustomerProfileAddress dayPhone(String dayPhone) {
    this.dayPhone = dayPhone;
    return this;
  }

   /**
   * Day phone
   * @return dayPhone
  **/
  @ApiModelProperty(value = "Day phone")
  public String getDayPhone() {
    return dayPhone;
  }

  public void setDayPhone(String dayPhone) {
    this.dayPhone = dayPhone;
  }

  public CartCustomerProfileAddress eveningPhone(String eveningPhone) {
    this.eveningPhone = eveningPhone;
    return this;
  }

   /**
   * Evening phone
   * @return eveningPhone
  **/
  @ApiModelProperty(value = "Evening phone")
  public String getEveningPhone() {
    return eveningPhone;
  }

  public void setEveningPhone(String eveningPhone) {
    this.eveningPhone = eveningPhone;
  }

  public CartCustomerProfileAddress firstName(String firstName) {
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

  public CartCustomerProfileAddress lastName(String lastName) {
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

  public CartCustomerProfileAddress oid(Integer oid) {
    this.oid = oid;
    return this;
  }

   /**
   * Unique identifier for this address
   * @return oid
  **/
  @ApiModelProperty(value = "Unique identifier for this address")
  public Integer getOid() {
    return oid;
  }

  public void setOid(Integer oid) {
    this.oid = oid;
  }

  public CartCustomerProfileAddress postalCode(String postalCode) {
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

  public CartCustomerProfileAddress stateRegion(String stateRegion) {
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

  public CartCustomerProfileAddress taxCounty(String taxCounty) {
    this.taxCounty = taxCounty;
    return this;
  }

   /**
   * Tax county if a billing address
   * @return taxCounty
  **/
  @ApiModelProperty(value = "Tax county if a billing address")
  public String getTaxCounty() {
    return taxCounty;
  }

  public void setTaxCounty(String taxCounty) {
    this.taxCounty = taxCounty;
  }

  public CartCustomerProfileAddress title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title
   * @return title
  **/
  @ApiModelProperty(value = "Title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartCustomerProfileAddress cartCustomerProfileAddress = (CartCustomerProfileAddress) o;
    return Objects.equals(this.address1, cartCustomerProfileAddress.address1) &&
        Objects.equals(this.address2, cartCustomerProfileAddress.address2) &&
        Objects.equals(this.city, cartCustomerProfileAddress.city) &&
        Objects.equals(this.company, cartCustomerProfileAddress.company) &&
        Objects.equals(this.countryCode, cartCustomerProfileAddress.countryCode) &&
        Objects.equals(this.dayPhone, cartCustomerProfileAddress.dayPhone) &&
        Objects.equals(this.eveningPhone, cartCustomerProfileAddress.eveningPhone) &&
        Objects.equals(this.firstName, cartCustomerProfileAddress.firstName) &&
        Objects.equals(this.lastName, cartCustomerProfileAddress.lastName) &&
        Objects.equals(this.oid, cartCustomerProfileAddress.oid) &&
        Objects.equals(this.postalCode, cartCustomerProfileAddress.postalCode) &&
        Objects.equals(this.stateRegion, cartCustomerProfileAddress.stateRegion) &&
        Objects.equals(this.taxCounty, cartCustomerProfileAddress.taxCounty) &&
        Objects.equals(this.title, cartCustomerProfileAddress.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, city, company, countryCode, dayPhone, eveningPhone, firstName, lastName, oid, postalCode, stateRegion, taxCounty, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartCustomerProfileAddress {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    dayPhone: ").append(toIndentedString(dayPhone)).append("\n");
    sb.append("    eveningPhone: ").append(toIndentedString(eveningPhone)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateRegion: ").append(toIndentedString(stateRegion)).append("\n");
    sb.append("    taxCounty: ").append(toIndentedString(taxCounty)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

