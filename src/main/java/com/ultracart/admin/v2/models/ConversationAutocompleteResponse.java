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
import com.ultracart.admin.v2.models.ConversationAutocompleteValue;
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.ResponseMetadata;
import com.ultracart.admin.v2.models.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ConversationAutocompleteResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ConversationAutocompleteResponse {
  @SerializedName("error")
  private Error error = null;

  @SerializedName("field")
  private String field = null;

  @SerializedName("metadata")
  private ResponseMetadata metadata = null;

  @SerializedName("results")
  private List<ConversationAutocompleteValue> results = null;

  @SerializedName("success")
  private Boolean success = null;

  @SerializedName("term")
  private String term = null;

  @SerializedName("warning")
  private Warning warning = null;

  public ConversationAutocompleteResponse error(Error error) {
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

  public ConversationAutocompleteResponse field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(value = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ConversationAutocompleteResponse metadata(ResponseMetadata metadata) {
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

  public ConversationAutocompleteResponse results(List<ConversationAutocompleteValue> results) {
    this.results = results;
    return this;
  }

  public ConversationAutocompleteResponse addResultsItem(ConversationAutocompleteValue resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<ConversationAutocompleteValue>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
  public List<ConversationAutocompleteValue> getResults() {
    return results;
  }

  public void setResults(List<ConversationAutocompleteValue> results) {
    this.results = results;
  }

  public ConversationAutocompleteResponse success(Boolean success) {
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

  public ConversationAutocompleteResponse term(String term) {
    this.term = term;
    return this;
  }

   /**
   * Get term
   * @return term
  **/
  @ApiModelProperty(value = "")
  public String getTerm() {
    return term;
  }

  public void setTerm(String term) {
    this.term = term;
  }

  public ConversationAutocompleteResponse warning(Warning warning) {
    this.warning = warning;
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @ApiModelProperty(value = "")
  public Warning getWarning() {
    return warning;
  }

  public void setWarning(Warning warning) {
    this.warning = warning;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAutocompleteResponse conversationAutocompleteResponse = (ConversationAutocompleteResponse) o;
    return Objects.equals(this.error, conversationAutocompleteResponse.error) &&
        Objects.equals(this.field, conversationAutocompleteResponse.field) &&
        Objects.equals(this.metadata, conversationAutocompleteResponse.metadata) &&
        Objects.equals(this.results, conversationAutocompleteResponse.results) &&
        Objects.equals(this.success, conversationAutocompleteResponse.success) &&
        Objects.equals(this.term, conversationAutocompleteResponse.term) &&
        Objects.equals(this.warning, conversationAutocompleteResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, field, metadata, results, success, term, warning);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAutocompleteResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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

