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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.ResponseMetadata;
import com.ultracart.admin.v2.models.TaxProviderAvalara;
import com.ultracart.admin.v2.models.TaxProviderSelf;
import com.ultracart.admin.v2.models.TaxProviderTaxJar;
import com.ultracart.admin.v2.models.TaxProviderUltraCart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TaxProvidersResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-23T03:23:57.585-04:00")
public class TaxProvidersResponse {
  @SerializedName("avalara")
  private TaxProviderAvalara avalara = null;

  @SerializedName("error")
  private Error error = null;

  @SerializedName("metadata")
  private ResponseMetadata metadata = null;

  @SerializedName("self")
  private TaxProviderSelf self = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("taxjar")
  private TaxProviderTaxJar taxjar = null;

  @SerializedName("ultracart")
  private TaxProviderUltraCart ultracart = null;

  public TaxProvidersResponse avalara(TaxProviderAvalara avalara) {
    this.avalara = avalara;
    return this;
  }

   /**
   * Get avalara
   * @return avalara
  **/
  @ApiModelProperty(value = "")
  public TaxProviderAvalara getAvalara() {
    return avalara;
  }

  public void setAvalara(TaxProviderAvalara avalara) {
    this.avalara = avalara;
  }

  public TaxProvidersResponse error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }

  public TaxProvidersResponse metadata(ResponseMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public ResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
  }

  public TaxProvidersResponse self(TaxProviderSelf self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @ApiModelProperty(value = "")
  public TaxProviderSelf getSelf() {
    return self;
  }

  public void setSelf(TaxProviderSelf self) {
    this.self = self;
  }

  public TaxProvidersResponse success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Indicates if API call was successful
   * @return success
  **/
  @ApiModelProperty(value = "Indicates if API call was successful")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public TaxProvidersResponse taxjar(TaxProviderTaxJar taxjar) {
    this.taxjar = taxjar;
    return this;
  }

   /**
   * Get taxjar
   * @return taxjar
  **/
  @ApiModelProperty(value = "")
  public TaxProviderTaxJar getTaxjar() {
    return taxjar;
  }

  public void setTaxjar(TaxProviderTaxJar taxjar) {
    this.taxjar = taxjar;
  }

  public TaxProvidersResponse ultracart(TaxProviderUltraCart ultracart) {
    this.ultracart = ultracart;
    return this;
  }

   /**
   * Get ultracart
   * @return ultracart
  **/
  @ApiModelProperty(value = "")
  public TaxProviderUltraCart getUltracart() {
    return ultracart;
  }

  public void setUltracart(TaxProviderUltraCart ultracart) {
    this.ultracart = ultracart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxProvidersResponse taxProvidersResponse = (TaxProvidersResponse) o;
    return Objects.equals(this.avalara, taxProvidersResponse.avalara) &&
        Objects.equals(this.error, taxProvidersResponse.error) &&
        Objects.equals(this.metadata, taxProvidersResponse.metadata) &&
        Objects.equals(this.self, taxProvidersResponse.self) &&
        Objects.equals(this.success, taxProvidersResponse.success) &&
        Objects.equals(this.taxjar, taxProvidersResponse.taxjar) &&
        Objects.equals(this.ultracart, taxProvidersResponse.ultracart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avalara, error, metadata, self, success, taxjar, ultracart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxProvidersResponse {\n");
    
    sb.append("    avalara: ").append(toIndentedString(avalara)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    taxjar: ").append(toIndentedString(taxjar)).append("\n");
    sb.append("    ultracart: ").append(toIndentedString(ultracart)).append("\n");
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
