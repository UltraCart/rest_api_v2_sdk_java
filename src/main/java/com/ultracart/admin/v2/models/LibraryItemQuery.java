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
import java.math.BigDecimal;

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
 * LibraryItemQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class LibraryItemQuery {
  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INDUSTRY = "industry";
  @SerializedName(SERIALIZED_NAME_INDUSTRY)
  private String industry;

  public static final String SERIALIZED_NAME_PRICE_HIGH = "price_high";
  @SerializedName(SERIALIZED_NAME_PRICE_HIGH)
  private BigDecimal priceHigh;

  public static final String SERIALIZED_NAME_PRICE_LOW = "price_low";
  @SerializedName(SERIALIZED_NAME_PRICE_LOW)
  private BigDecimal priceLow;

  public static final String SERIALIZED_NAME_PUBLISHED_DTS_BEGIN = "published_dts_begin";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_DTS_BEGIN)
  private String publishedDtsBegin;

  public static final String SERIALIZED_NAME_PUBLISHED_DTS_END = "published_dts_end";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_DTS_END)
  private String publishedDtsEnd;

  public static final String SERIALIZED_NAME_SOURCE_OF_PUBLISHED = "source_of_published";
  @SerializedName(SERIALIZED_NAME_SOURCE_OF_PUBLISHED)
  private Boolean sourceOfPublished;

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private String style;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public LibraryItemQuery() { 
  }

  public LibraryItemQuery category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * Category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Category")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public LibraryItemQuery contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Library item content type such as flow, campaign, cjson, email, or transactional_email
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Library item content type such as flow, campaign, cjson, email, or transactional_email")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public LibraryItemQuery description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of library item
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of library item")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public LibraryItemQuery industry(String industry) {
    
    this.industry = industry;
    return this;
  }

   /**
   * Industry
   * @return industry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Industry")

  public String getIndustry() {
    return industry;
  }


  public void setIndustry(String industry) {
    this.industry = industry;
  }


  public LibraryItemQuery priceHigh(BigDecimal priceHigh) {
    
    this.priceHigh = priceHigh;
    return this;
  }

   /**
   * Maximum price
   * @return priceHigh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum price")

  public BigDecimal getPriceHigh() {
    return priceHigh;
  }


  public void setPriceHigh(BigDecimal priceHigh) {
    this.priceHigh = priceHigh;
  }


  public LibraryItemQuery priceLow(BigDecimal priceLow) {
    
    this.priceLow = priceLow;
    return this;
  }

   /**
   * Minimum price
   * @return priceLow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum price")

  public BigDecimal getPriceLow() {
    return priceLow;
  }


  public void setPriceLow(BigDecimal priceLow) {
    this.priceLow = priceLow;
  }


  public LibraryItemQuery publishedDtsBegin(String publishedDtsBegin) {
    
    this.publishedDtsBegin = publishedDtsBegin;
    return this;
  }

   /**
   * Minimum published date/time
   * @return publishedDtsBegin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum published date/time")

  public String getPublishedDtsBegin() {
    return publishedDtsBegin;
  }


  public void setPublishedDtsBegin(String publishedDtsBegin) {
    this.publishedDtsBegin = publishedDtsBegin;
  }


  public LibraryItemQuery publishedDtsEnd(String publishedDtsEnd) {
    
    this.publishedDtsEnd = publishedDtsEnd;
    return this;
  }

   /**
   * Maximum published date/time
   * @return publishedDtsEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum published date/time")

  public String getPublishedDtsEnd() {
    return publishedDtsEnd;
  }


  public void setPublishedDtsEnd(String publishedDtsEnd) {
    this.publishedDtsEnd = publishedDtsEnd;
  }


  public LibraryItemQuery sourceOfPublished(Boolean sourceOfPublished) {
    
    this.sourceOfPublished = sourceOfPublished;
    return this;
  }

   /**
   * Boolean, true if this library item has been published and is the master copy of that published work
   * @return sourceOfPublished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean, true if this library item has been published and is the master copy of that published work")

  public Boolean getSourceOfPublished() {
    return sourceOfPublished;
  }


  public void setSourceOfPublished(Boolean sourceOfPublished) {
    this.sourceOfPublished = sourceOfPublished;
  }


  public LibraryItemQuery style(String style) {
    
    this.style = style;
    return this;
  }

   /**
   * Library item style
   * @return style
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Library item style")

  public String getStyle() {
    return style;
  }


  public void setStyle(String style) {
    this.style = style;
  }


  public LibraryItemQuery title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the library item
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the library item")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public LibraryItemQuery type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Library item type such as header, footer, shipping block, etc
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Library item type such as header, footer, shipping block, etc")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryItemQuery libraryItemQuery = (LibraryItemQuery) o;
    return Objects.equals(this.category, libraryItemQuery.category) &&
        Objects.equals(this.contentType, libraryItemQuery.contentType) &&
        Objects.equals(this.description, libraryItemQuery.description) &&
        Objects.equals(this.industry, libraryItemQuery.industry) &&
        Objects.equals(this.priceHigh, libraryItemQuery.priceHigh) &&
        Objects.equals(this.priceLow, libraryItemQuery.priceLow) &&
        Objects.equals(this.publishedDtsBegin, libraryItemQuery.publishedDtsBegin) &&
        Objects.equals(this.publishedDtsEnd, libraryItemQuery.publishedDtsEnd) &&
        Objects.equals(this.sourceOfPublished, libraryItemQuery.sourceOfPublished) &&
        Objects.equals(this.style, libraryItemQuery.style) &&
        Objects.equals(this.title, libraryItemQuery.title) &&
        Objects.equals(this.type, libraryItemQuery.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, contentType, description, industry, priceHigh, priceLow, publishedDtsBegin, publishedDtsEnd, sourceOfPublished, style, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryItemQuery {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    priceHigh: ").append(toIndentedString(priceHigh)).append("\n");
    sb.append("    priceLow: ").append(toIndentedString(priceLow)).append("\n");
    sb.append("    publishedDtsBegin: ").append(toIndentedString(publishedDtsBegin)).append("\n");
    sb.append("    publishedDtsEnd: ").append(toIndentedString(publishedDtsEnd)).append("\n");
    sb.append("    sourceOfPublished: ").append(toIndentedString(sourceOfPublished)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("category");
    openapiFields.add("content_type");
    openapiFields.add("description");
    openapiFields.add("industry");
    openapiFields.add("price_high");
    openapiFields.add("price_low");
    openapiFields.add("published_dts_begin");
    openapiFields.add("published_dts_end");
    openapiFields.add("source_of_published");
    openapiFields.add("style");
    openapiFields.add("title");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LibraryItemQuery
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LibraryItemQuery.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LibraryItemQuery is not found in the empty JSON string", LibraryItemQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LibraryItemQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LibraryItemQuery` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("content_type") != null && !jsonObj.get("content_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content_type").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("industry") != null && !jsonObj.get("industry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `industry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("industry").toString()));
      }
      if (jsonObj.get("published_dts_begin") != null && !jsonObj.get("published_dts_begin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `published_dts_begin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("published_dts_begin").toString()));
      }
      if (jsonObj.get("published_dts_end") != null && !jsonObj.get("published_dts_end").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `published_dts_end` to be a primitive type in the JSON string but got `%s`", jsonObj.get("published_dts_end").toString()));
      }
      if (jsonObj.get("style") != null && !jsonObj.get("style").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `style` to be a primitive type in the JSON string but got `%s`", jsonObj.get("style").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LibraryItemQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LibraryItemQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LibraryItemQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LibraryItemQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<LibraryItemQuery>() {
           @Override
           public void write(JsonWriter out, LibraryItemQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LibraryItemQuery read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LibraryItemQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LibraryItemQuery
  * @throws IOException if the JSON string is invalid with respect to LibraryItemQuery
  */
  public static LibraryItemQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LibraryItemQuery.class);
  }

 /**
  * Convert an instance of LibraryItemQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

