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
 * ConversationPermissions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ConversationPermissions {
  @SerializedName("edit_settings")
  private Boolean editSettings = null;

  public ConversationPermissions editSettings(Boolean editSettings) {
    this.editSettings = editSettings;
    return this;
  }

   /**
   * Get editSettings
   * @return editSettings
  **/
  @ApiModelProperty(value = "")
  public Boolean isEditSettings() {
    return editSettings;
  }

  public void setEditSettings(Boolean editSettings) {
    this.editSettings = editSettings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationPermissions conversationPermissions = (ConversationPermissions) o;
    return Objects.equals(this.editSettings, conversationPermissions.editSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(editSettings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationPermissions {\n");
    
    sb.append("    editSettings: ").append(toIndentedString(editSettings)).append("\n");
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

