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
import java.util.ArrayList;
import java.util.List;

/**
 * CartBilling
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class CartBilling {
  @SerializedName("address1")
  private String address1 = null;

  @SerializedName("address2")
  private String address2 = null;

  @SerializedName("cc_emails")
  private List<String> ccEmails = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("company")
  private String company = null;

  @SerializedName("country_code")
  private String countryCode = null;

  @SerializedName("day_phone")
  private String dayPhone = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("email_confirm")
  private String emailConfirm = null;

  @SerializedName("evening_phone")
  private String eveningPhone = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("state_region")
  private String stateRegion = null;

  @SerializedName("title")
  private String title = null;

  public CartBilling address1(String address1) {
    this.address1 = address1;
    return this;
  }

   /**
   * Address line 1
   * @return address1
  **/
  @ApiModelProperty(value = "Address line 1")
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public CartBilling address2(String address2) {
    this.address2 = address2;
    return this;
  }

   /**
   * Address line 2
   * @return address2
  **/
  @ApiModelProperty(value = "Address line 2")
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public CartBilling ccEmails(List<String> ccEmails) {
    this.ccEmails = ccEmails;
    return this;
  }

  public CartBilling addCcEmailsItem(String ccEmailsItem) {
    if (this.ccEmails == null) {
      this.ccEmails = new ArrayList<String>();
    }
    this.ccEmails.add(ccEmailsItem);
    return this;
  }

   /**
   * CC emails.  Multiple allowed, but total length of all emails can not exceed 100 characters.
   * @return ccEmails
  **/
  @ApiModelProperty(value = "CC emails.  Multiple allowed, but total length of all emails can not exceed 100 characters.")
  public List<String> getCcEmails() {
    return ccEmails;
  }

  public void setCcEmails(List<String> ccEmails) {
    this.ccEmails = ccEmails;
  }

  public CartBilling city(String city) {
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

  public CartBilling company(String company) {
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

  public CartBilling countryCode(String countryCode) {
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

  public CartBilling dayPhone(String dayPhone) {
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

  public CartBilling email(String email) {
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

  public CartBilling emailConfirm(String emailConfirm) {
    this.emailConfirm = emailConfirm;
    return this;
  }

   /**
   * Email entered for confirmation
   * @return emailConfirm
  **/
  @ApiModelProperty(value = "Email entered for confirmation")
  public String getEmailConfirm() {
    return emailConfirm;
  }

  public void setEmailConfirm(String emailConfirm) {
    this.emailConfirm = emailConfirm;
  }

  public CartBilling eveningPhone(String eveningPhone) {
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

  public CartBilling firstName(String firstName) {
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

  public CartBilling lastName(String lastName) {
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

  public CartBilling postalCode(String postalCode) {
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

  public CartBilling stateRegion(String stateRegion) {
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

  public CartBilling title(String title) {
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
    CartBilling cartBilling = (CartBilling) o;
    return Objects.equals(this.address1, cartBilling.address1) &&
        Objects.equals(this.address2, cartBilling.address2) &&
        Objects.equals(this.ccEmails, cartBilling.ccEmails) &&
        Objects.equals(this.city, cartBilling.city) &&
        Objects.equals(this.company, cartBilling.company) &&
        Objects.equals(this.countryCode, cartBilling.countryCode) &&
        Objects.equals(this.dayPhone, cartBilling.dayPhone) &&
        Objects.equals(this.email, cartBilling.email) &&
        Objects.equals(this.emailConfirm, cartBilling.emailConfirm) &&
        Objects.equals(this.eveningPhone, cartBilling.eveningPhone) &&
        Objects.equals(this.firstName, cartBilling.firstName) &&
        Objects.equals(this.lastName, cartBilling.lastName) &&
        Objects.equals(this.postalCode, cartBilling.postalCode) &&
        Objects.equals(this.stateRegion, cartBilling.stateRegion) &&
        Objects.equals(this.title, cartBilling.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address1, address2, ccEmails, city, company, countryCode, dayPhone, email, emailConfirm, eveningPhone, firstName, lastName, postalCode, stateRegion, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartBilling {\n");
    
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    ccEmails: ").append(toIndentedString(ccEmails)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    dayPhone: ").append(toIndentedString(dayPhone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailConfirm: ").append(toIndentedString(emailConfirm)).append("\n");
    sb.append("    eveningPhone: ").append(toIndentedString(eveningPhone)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    stateRegion: ").append(toIndentedString(stateRegion)).append("\n");
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
