/*
 * UltraCart Rest API V2
 * UltraCart REST API Version 2
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@ultracart.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
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
import com.ultracart.admin.v2.models.Error;
import com.ultracart.admin.v2.models.LibraryItemAttribute;
import com.ultracart.admin.v2.models.ResponseMetadata;
import com.ultracart.admin.v2.models.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.ultracart.admin.v2.util.JSON;

/**
 * ApplyLibraryItemResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ApplyLibraryItemResponse {
  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private List<LibraryItemAttribute> attributes = null;

  public static final String SERIALIZED_NAME_CJSON = "cjson";
  @SerializedName(SERIALIZED_NAME_CJSON)
  private String cjson;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_EMAIL_TEMPLATE_VM_PATH = "email_template_vm_path";
  @SerializedName(SERIALIZED_NAME_EMAIL_TEMPLATE_VM_PATH)
  private String emailTemplateVmPath;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private ResponseMetadata metadata;

  public static final String SERIALIZED_NAME_STOREFRONT_OID = "storefront_oid";
  @SerializedName(SERIALIZED_NAME_STOREFRONT_OID)
  private Integer storefrontOid;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UUID = "uuid";
  @SerializedName(SERIALIZED_NAME_UUID)
  private String uuid;

  public static final String SERIALIZED_NAME_WARNING = "warning";
  @SerializedName(SERIALIZED_NAME_WARNING)
  private Warning warning;

  public ApplyLibraryItemResponse() { 
  }

  public ApplyLibraryItemResponse attributes(List<LibraryItemAttribute> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public ApplyLibraryItemResponse addAttributesItem(LibraryItemAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Attributes from the library item
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Attributes from the library item")

  public List<LibraryItemAttribute> getAttributes() {
    return attributes;
  }


  public void setAttributes(List<LibraryItemAttribute> attributes) {
    this.attributes = attributes;
  }


  public ApplyLibraryItemResponse cjson(String cjson) {
    
    this.cjson = cjson;
    return this;
  }

   /**
   * Cjson from library item, only populated if this library item was a cjson snippet or marketing email (not transactional)
   * @return cjson
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cjson from library item, only populated if this library item was a cjson snippet or marketing email (not transactional)")

  public String getCjson() {
    return cjson;
  }


  public void setCjson(String cjson) {
    this.cjson = cjson;
  }


  public ApplyLibraryItemResponse contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * flow, campaign, cjson, upsell, postcard, transactional_email or email
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "flow, campaign, cjson, upsell, postcard, transactional_email or email")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public ApplyLibraryItemResponse emailTemplateVmPath(String emailTemplateVmPath) {
    
    this.emailTemplateVmPath = emailTemplateVmPath;
    return this;
  }

   /**
   * If a marketing email was applied, this is the path to the template encapsulating the cjson.  This is needed for the UltraCart UI.
   * @return emailTemplateVmPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If a marketing email was applied, this is the path to the template encapsulating the cjson.  This is needed for the UltraCart UI.")

  public String getEmailTemplateVmPath() {
    return emailTemplateVmPath;
  }


  public void setEmailTemplateVmPath(String emailTemplateVmPath) {
    this.emailTemplateVmPath = emailTemplateVmPath;
  }


  public ApplyLibraryItemResponse error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  public ApplyLibraryItemResponse metadata(ResponseMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponseMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(ResponseMetadata metadata) {
    this.metadata = metadata;
  }


  public ApplyLibraryItemResponse storefrontOid(Integer storefrontOid) {
    
    this.storefrontOid = storefrontOid;
    return this;
  }

   /**
   * StoreFront oid where content originates necessary for tracking down relative assets
   * @return storefrontOid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "StoreFront oid where content originates necessary for tracking down relative assets")

  public Integer getStorefrontOid() {
    return storefrontOid;
  }


  public void setStorefrontOid(Integer storefrontOid) {
    this.storefrontOid = storefrontOid;
  }


  public ApplyLibraryItemResponse success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Indicates if API call was successful
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if API call was successful")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public ApplyLibraryItemResponse title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * title of library item, usually the name of the flow or campaign, or description of cjson
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "title of library item, usually the name of the flow or campaign, or description of cjson")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public ApplyLibraryItemResponse uuid(String uuid) {
    
    this.uuid = uuid;
    return this;
  }

   /**
   * UUID of marketing email or communication flow/campaign if this library item was an email, campaign or flow
   * @return uuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID of marketing email or communication flow/campaign if this library item was an email, campaign or flow")

  public String getUuid() {
    return uuid;
  }


  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  public ApplyLibraryItemResponse warning(Warning warning) {
    
    this.warning = warning;
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Warning getWarning() {
    return warning;
  }


  public void setWarning(Warning warning) {
    this.warning = warning;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyLibraryItemResponse applyLibraryItemResponse = (ApplyLibraryItemResponse) o;
    return Objects.equals(this.attributes, applyLibraryItemResponse.attributes) &&
        Objects.equals(this.cjson, applyLibraryItemResponse.cjson) &&
        Objects.equals(this.contentType, applyLibraryItemResponse.contentType) &&
        Objects.equals(this.emailTemplateVmPath, applyLibraryItemResponse.emailTemplateVmPath) &&
        Objects.equals(this.error, applyLibraryItemResponse.error) &&
        Objects.equals(this.metadata, applyLibraryItemResponse.metadata) &&
        Objects.equals(this.storefrontOid, applyLibraryItemResponse.storefrontOid) &&
        Objects.equals(this.success, applyLibraryItemResponse.success) &&
        Objects.equals(this.title, applyLibraryItemResponse.title) &&
        Objects.equals(this.uuid, applyLibraryItemResponse.uuid) &&
        Objects.equals(this.warning, applyLibraryItemResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, cjson, contentType, emailTemplateVmPath, error, metadata, storefrontOid, success, title, uuid, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyLibraryItemResponse {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    cjson: ").append(toIndentedString(cjson)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    emailTemplateVmPath: ").append(toIndentedString(emailTemplateVmPath)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    storefrontOid: ").append(toIndentedString(storefrontOid)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("attributes");
    openapiFields.add("cjson");
    openapiFields.add("content_type");
    openapiFields.add("email_template_vm_path");
    openapiFields.add("error");
    openapiFields.add("metadata");
    openapiFields.add("storefront_oid");
    openapiFields.add("success");
    openapiFields.add("title");
    openapiFields.add("uuid");
    openapiFields.add("warning");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplyLibraryItemResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplyLibraryItemResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplyLibraryItemResponse is not found in the empty JSON string", ApplyLibraryItemResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplyLibraryItemResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplyLibraryItemResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayattributes = jsonObj.getAsJsonArray("attributes");
      if (jsonArrayattributes != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attributes").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
        }

        // validate the optional field `attributes` (array)
        for (int i = 0; i < jsonArrayattributes.size(); i++) {
          LibraryItemAttribute.validateJsonObject(jsonArrayattributes.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("cjson") != null && !jsonObj.get("cjson").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cjson` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cjson").toString()));
      }
      if (jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if (jsonObj.get("email_template_vm_path") != null && !jsonObj.get("email_template_vm_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_template_vm_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_template_vm_path").toString()));
      }
      // validate the optional field `error`
      if (jsonObj.getAsJsonObject("error") != null) {
        Error.validateJsonObject(jsonObj.getAsJsonObject("error"));
      }
      // validate the optional field `metadata`
      if (jsonObj.getAsJsonObject("metadata") != null) {
        ResponseMetadata.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("uuid") != null && !jsonObj.get("uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uuid").toString()));
      }
      // validate the optional field `warning`
      if (jsonObj.getAsJsonObject("warning") != null) {
        Warning.validateJsonObject(jsonObj.getAsJsonObject("warning"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplyLibraryItemResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplyLibraryItemResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplyLibraryItemResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplyLibraryItemResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplyLibraryItemResponse>() {
           @Override
           public void write(JsonWriter out, ApplyLibraryItemResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplyLibraryItemResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplyLibraryItemResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplyLibraryItemResponse
  * @throws IOException if the JSON string is invalid with respect to ApplyLibraryItemResponse
  */
  public static ApplyLibraryItemResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplyLibraryItemResponse.class);
  }

 /**
  * Convert an instance of ApplyLibraryItemResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

