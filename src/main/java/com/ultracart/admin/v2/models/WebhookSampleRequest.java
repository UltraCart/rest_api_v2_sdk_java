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
import com.ultracart.admin.v2.models.HTTPHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * WebhookSampleRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class WebhookSampleRequest {
  @SerializedName("request")
  private String request = null;

  @SerializedName("request_headers")
  private List<HTTPHeader> requestHeaders = null;

  @SerializedName("request_id")
  private String requestId = null;

  @SerializedName("uri")
  private String uri = null;

  public WebhookSampleRequest request(String request) {
    this.request = request;
    return this;
  }

   /**
   * Request
   * @return request
  **/
  @ApiModelProperty(value = "Request")
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  public WebhookSampleRequest requestHeaders(List<HTTPHeader> requestHeaders) {
    this.requestHeaders = requestHeaders;
    return this;
  }

  public WebhookSampleRequest addRequestHeadersItem(HTTPHeader requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new ArrayList<HTTPHeader>();
    }
    this.requestHeaders.add(requestHeadersItem);
    return this;
  }

   /**
   * Request headers
   * @return requestHeaders
  **/
  @ApiModelProperty(value = "Request headers")
  public List<HTTPHeader> getRequestHeaders() {
    return requestHeaders;
  }

  public void setRequestHeaders(List<HTTPHeader> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }

  public WebhookSampleRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Request id
   * @return requestId
  **/
  @ApiModelProperty(value = "Request id")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public WebhookSampleRequest uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * URI to send request to
   * @return uri
  **/
  @ApiModelProperty(value = "URI to send request to")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookSampleRequest webhookSampleRequest = (WebhookSampleRequest) o;
    return Objects.equals(this.request, webhookSampleRequest.request) &&
        Objects.equals(this.requestHeaders, webhookSampleRequest.requestHeaders) &&
        Objects.equals(this.requestId, webhookSampleRequest.requestId) &&
        Objects.equals(this.uri, webhookSampleRequest.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(request, requestHeaders, requestId, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookSampleRequest {\n");
    
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
