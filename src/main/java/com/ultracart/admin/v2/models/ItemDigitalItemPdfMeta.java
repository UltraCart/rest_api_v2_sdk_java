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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * ItemDigitalItemPdfMeta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ItemDigitalItemPdfMeta {
  public static final String SERIALIZED_NAME_ASSEMBLY_ALLOWED = "assembly_allowed";
  @SerializedName(SERIALIZED_NAME_ASSEMBLY_ALLOWED)
  private Boolean assemblyAllowed;

  public static final String SERIALIZED_NAME_COPY_ALLOWED = "copy_allowed";
  @SerializedName(SERIALIZED_NAME_COPY_ALLOWED)
  private Boolean copyAllowed;

  public static final String SERIALIZED_NAME_CUSTOM_FOOTER = "custom_footer";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FOOTER)
  private String customFooter;

  public static final String SERIALIZED_NAME_CUSTOM_HEADER = "custom_header";
  @SerializedName(SERIALIZED_NAME_CUSTOM_HEADER)
  private String customHeader;

  public static final String SERIALIZED_NAME_DEGRADED_PRINTING_ALLOWED = "degraded_printing_allowed";
  @SerializedName(SERIALIZED_NAME_DEGRADED_PRINTING_ALLOWED)
  private Boolean degradedPrintingAllowed;

  public static final String SERIALIZED_NAME_FILLIN_ALLOWED = "fillin_allowed";
  @SerializedName(SERIALIZED_NAME_FILLIN_ALLOWED)
  private Boolean fillinAllowed;

  public static final String SERIALIZED_NAME_MODIFY_ANNOTATIONS_ALLOWED = "modify_annotations_allowed";
  @SerializedName(SERIALIZED_NAME_MODIFY_ANNOTATIONS_ALLOWED)
  private Boolean modifyAnnotationsAllowed;

  public static final String SERIALIZED_NAME_MODIFY_CONTENTS_ALLOWED = "modify_contents_allowed";
  @SerializedName(SERIALIZED_NAME_MODIFY_CONTENTS_ALLOWED)
  private Boolean modifyContentsAllowed;

  public static final String SERIALIZED_NAME_PRINTING_ALLOWED = "printing_allowed";
  @SerializedName(SERIALIZED_NAME_PRINTING_ALLOWED)
  private Boolean printingAllowed;

  public static final String SERIALIZED_NAME_SCREEN_READERS_ALLOWED = "screen_readers_allowed";
  @SerializedName(SERIALIZED_NAME_SCREEN_READERS_ALLOWED)
  private Boolean screenReadersAllowed;

  public static final String SERIALIZED_NAME_TAGGED = "tagged";
  @SerializedName(SERIALIZED_NAME_TAGGED)
  private Boolean tagged;

  public ItemDigitalItemPdfMeta() { 
  }

  public ItemDigitalItemPdfMeta assemblyAllowed(Boolean assemblyAllowed) {
    
    this.assemblyAllowed = assemblyAllowed;
    return this;
  }

   /**
   * Assembly allowed
   * @return assemblyAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Assembly allowed")

  public Boolean getAssemblyAllowed() {
    return assemblyAllowed;
  }


  public void setAssemblyAllowed(Boolean assemblyAllowed) {
    this.assemblyAllowed = assemblyAllowed;
  }


  public ItemDigitalItemPdfMeta copyAllowed(Boolean copyAllowed) {
    
    this.copyAllowed = copyAllowed;
    return this;
  }

   /**
   * Copy/Paste is allowed
   * @return copyAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Copy/Paste is allowed")

  public Boolean getCopyAllowed() {
    return copyAllowed;
  }


  public void setCopyAllowed(Boolean copyAllowed) {
    this.copyAllowed = copyAllowed;
  }


  public ItemDigitalItemPdfMeta customFooter(String customFooter) {
    
    this.customFooter = customFooter;
    return this;
  }

   /**
   * A custom footer for each pdf page
   * @return customFooter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A custom footer for each pdf page")

  public String getCustomFooter() {
    return customFooter;
  }


  public void setCustomFooter(String customFooter) {
    this.customFooter = customFooter;
  }


  public ItemDigitalItemPdfMeta customHeader(String customHeader) {
    
    this.customHeader = customHeader;
    return this;
  }

   /**
   * A custom header for each pdf page
   * @return customHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A custom header for each pdf page")

  public String getCustomHeader() {
    return customHeader;
  }


  public void setCustomHeader(String customHeader) {
    this.customHeader = customHeader;
  }


  public ItemDigitalItemPdfMeta degradedPrintingAllowed(Boolean degradedPrintingAllowed) {
    
    this.degradedPrintingAllowed = degradedPrintingAllowed;
    return this;
  }

   /**
   * Degraded printing allowed
   * @return degradedPrintingAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Degraded printing allowed")

  public Boolean getDegradedPrintingAllowed() {
    return degradedPrintingAllowed;
  }


  public void setDegradedPrintingAllowed(Boolean degradedPrintingAllowed) {
    this.degradedPrintingAllowed = degradedPrintingAllowed;
  }


  public ItemDigitalItemPdfMeta fillinAllowed(Boolean fillinAllowed) {
    
    this.fillinAllowed = fillinAllowed;
    return this;
  }

   /**
   * Fillin is allowed
   * @return fillinAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Fillin is allowed")

  public Boolean getFillinAllowed() {
    return fillinAllowed;
  }


  public void setFillinAllowed(Boolean fillinAllowed) {
    this.fillinAllowed = fillinAllowed;
  }


  public ItemDigitalItemPdfMeta modifyAnnotationsAllowed(Boolean modifyAnnotationsAllowed) {
    
    this.modifyAnnotationsAllowed = modifyAnnotationsAllowed;
    return this;
  }

   /**
   * Modifying annotations is allowed
   * @return modifyAnnotationsAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Modifying annotations is allowed")

  public Boolean getModifyAnnotationsAllowed() {
    return modifyAnnotationsAllowed;
  }


  public void setModifyAnnotationsAllowed(Boolean modifyAnnotationsAllowed) {
    this.modifyAnnotationsAllowed = modifyAnnotationsAllowed;
  }


  public ItemDigitalItemPdfMeta modifyContentsAllowed(Boolean modifyContentsAllowed) {
    
    this.modifyContentsAllowed = modifyContentsAllowed;
    return this;
  }

   /**
   * Modifying contents is allowed
   * @return modifyContentsAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Modifying contents is allowed")

  public Boolean getModifyContentsAllowed() {
    return modifyContentsAllowed;
  }


  public void setModifyContentsAllowed(Boolean modifyContentsAllowed) {
    this.modifyContentsAllowed = modifyContentsAllowed;
  }


  public ItemDigitalItemPdfMeta printingAllowed(Boolean printingAllowed) {
    
    this.printingAllowed = printingAllowed;
    return this;
  }

   /**
   * Printing is allowed
   * @return printingAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Printing is allowed")

  public Boolean getPrintingAllowed() {
    return printingAllowed;
  }


  public void setPrintingAllowed(Boolean printingAllowed) {
    this.printingAllowed = printingAllowed;
  }


  public ItemDigitalItemPdfMeta screenReadersAllowed(Boolean screenReadersAllowed) {
    
    this.screenReadersAllowed = screenReadersAllowed;
    return this;
  }

   /**
   * Screen readers are allowed
   * @return screenReadersAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Screen readers are allowed")

  public Boolean getScreenReadersAllowed() {
    return screenReadersAllowed;
  }


  public void setScreenReadersAllowed(Boolean screenReadersAllowed) {
    this.screenReadersAllowed = screenReadersAllowed;
  }


  public ItemDigitalItemPdfMeta tagged(Boolean tagged) {
    
    this.tagged = tagged;
    return this;
  }

   /**
   * PDF is tagged
   * @return tagged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PDF is tagged")

  public Boolean getTagged() {
    return tagged;
  }


  public void setTagged(Boolean tagged) {
    this.tagged = tagged;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemDigitalItemPdfMeta itemDigitalItemPdfMeta = (ItemDigitalItemPdfMeta) o;
    return Objects.equals(this.assemblyAllowed, itemDigitalItemPdfMeta.assemblyAllowed) &&
        Objects.equals(this.copyAllowed, itemDigitalItemPdfMeta.copyAllowed) &&
        Objects.equals(this.customFooter, itemDigitalItemPdfMeta.customFooter) &&
        Objects.equals(this.customHeader, itemDigitalItemPdfMeta.customHeader) &&
        Objects.equals(this.degradedPrintingAllowed, itemDigitalItemPdfMeta.degradedPrintingAllowed) &&
        Objects.equals(this.fillinAllowed, itemDigitalItemPdfMeta.fillinAllowed) &&
        Objects.equals(this.modifyAnnotationsAllowed, itemDigitalItemPdfMeta.modifyAnnotationsAllowed) &&
        Objects.equals(this.modifyContentsAllowed, itemDigitalItemPdfMeta.modifyContentsAllowed) &&
        Objects.equals(this.printingAllowed, itemDigitalItemPdfMeta.printingAllowed) &&
        Objects.equals(this.screenReadersAllowed, itemDigitalItemPdfMeta.screenReadersAllowed) &&
        Objects.equals(this.tagged, itemDigitalItemPdfMeta.tagged);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assemblyAllowed, copyAllowed, customFooter, customHeader, degradedPrintingAllowed, fillinAllowed, modifyAnnotationsAllowed, modifyContentsAllowed, printingAllowed, screenReadersAllowed, tagged);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemDigitalItemPdfMeta {\n");
    sb.append("    assemblyAllowed: ").append(toIndentedString(assemblyAllowed)).append("\n");
    sb.append("    copyAllowed: ").append(toIndentedString(copyAllowed)).append("\n");
    sb.append("    customFooter: ").append(toIndentedString(customFooter)).append("\n");
    sb.append("    customHeader: ").append(toIndentedString(customHeader)).append("\n");
    sb.append("    degradedPrintingAllowed: ").append(toIndentedString(degradedPrintingAllowed)).append("\n");
    sb.append("    fillinAllowed: ").append(toIndentedString(fillinAllowed)).append("\n");
    sb.append("    modifyAnnotationsAllowed: ").append(toIndentedString(modifyAnnotationsAllowed)).append("\n");
    sb.append("    modifyContentsAllowed: ").append(toIndentedString(modifyContentsAllowed)).append("\n");
    sb.append("    printingAllowed: ").append(toIndentedString(printingAllowed)).append("\n");
    sb.append("    screenReadersAllowed: ").append(toIndentedString(screenReadersAllowed)).append("\n");
    sb.append("    tagged: ").append(toIndentedString(tagged)).append("\n");
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
    openapiFields.add("assembly_allowed");
    openapiFields.add("copy_allowed");
    openapiFields.add("custom_footer");
    openapiFields.add("custom_header");
    openapiFields.add("degraded_printing_allowed");
    openapiFields.add("fillin_allowed");
    openapiFields.add("modify_annotations_allowed");
    openapiFields.add("modify_contents_allowed");
    openapiFields.add("printing_allowed");
    openapiFields.add("screen_readers_allowed");
    openapiFields.add("tagged");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemDigitalItemPdfMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemDigitalItemPdfMeta.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemDigitalItemPdfMeta is not found in the empty JSON string", ItemDigitalItemPdfMeta.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemDigitalItemPdfMeta.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemDigitalItemPdfMeta` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("custom_footer") != null && !jsonObj.get("custom_footer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_footer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_footer").toString()));
      }
      if (jsonObj.get("custom_header") != null && !jsonObj.get("custom_header").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom_header` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom_header").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemDigitalItemPdfMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemDigitalItemPdfMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemDigitalItemPdfMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemDigitalItemPdfMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemDigitalItemPdfMeta>() {
           @Override
           public void write(JsonWriter out, ItemDigitalItemPdfMeta value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemDigitalItemPdfMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemDigitalItemPdfMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemDigitalItemPdfMeta
  * @throws IOException if the JSON string is invalid with respect to ItemDigitalItemPdfMeta
  */
  public static ItemDigitalItemPdfMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemDigitalItemPdfMeta.class);
  }

 /**
  * Convert an instance of ItemDigitalItemPdfMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

