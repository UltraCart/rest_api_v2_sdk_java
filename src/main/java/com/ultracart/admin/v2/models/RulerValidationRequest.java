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
 * RulerValidationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class RulerValidationRequest {
  @SerializedName("ruler")
  private String ruler = null;

  public RulerValidationRequest ruler(String ruler) {
    this.ruler = ruler;
    return this;
  }

   /**
   * Get ruler
   * @return ruler
  **/
  @ApiModelProperty(value = "")
  public String getRuler() {
    return ruler;
  }

  public void setRuler(String ruler) {
    this.ruler = ruler;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulerValidationRequest rulerValidationRequest = (RulerValidationRequest) o;
    return Objects.equals(this.ruler, rulerValidationRequest.ruler);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruler);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulerValidationRequest {\n");
    
    sb.append("    ruler: ").append(toIndentedString(ruler)).append("\n");
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

