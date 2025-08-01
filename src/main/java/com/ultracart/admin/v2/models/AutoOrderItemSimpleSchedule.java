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
 * AutoOrderItemSimpleSchedule
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class AutoOrderItemSimpleSchedule {
  /**
   * Frequency of the rebill if not a fixed schedule
   */
  @JsonAdapter(FrequencyEnum.Adapter.class)
  public enum FrequencyEnum {
    WEEKLY("Weekly"),
    
    BIWEEKLY("Biweekly"),
    
    EVERY_("Every..."),
    
    EVERY_10_DAYS("Every 10 Days"),
    
    EVERY_24_DAYS("Every 24 Days"),
    
    EVERY_28_DAYS("Every 28 Days"),
    
    MONTHLY("Monthly"),
    
    EVERY_45_DAYS("Every 45 Days"),
    
    EVERY_2_MONTHS("Every 2 Months"),
    
    EVERY_3_MONTHS("Every 3 Months"),
    
    EVERY_4_MONTHS("Every 4 Months"),
    
    EVERY_5_MONTHS("Every 5 Months"),
    
    EVERY_6_MONTHS("Every 6 Months"),
    
    YEARLY("Yearly"),
    
    EVERY_4_WEEKS("Every 4 Weeks"),
    
    EVERY_6_WEEKS("Every 6 Weeks"),
    
    EVERY_8_WEEKS("Every 8 Weeks");

    private String value;

    FrequencyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FrequencyEnum fromValue(String value) {
      for (FrequencyEnum b : FrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<FrequencyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FrequencyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FrequencyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FrequencyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private FrequencyEnum frequency;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_REPEAT_COUNT = "repeat_count";
  @SerializedName(SERIALIZED_NAME_REPEAT_COUNT)
  private Integer repeatCount;

  public AutoOrderItemSimpleSchedule() { 
  }

  public AutoOrderItemSimpleSchedule frequency(FrequencyEnum frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * Frequency of the rebill if not a fixed schedule
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Frequency of the rebill if not a fixed schedule")

  public FrequencyEnum getFrequency() {
    return frequency;
  }


  public void setFrequency(FrequencyEnum frequency) {
    this.frequency = frequency;
  }


  public AutoOrderItemSimpleSchedule itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * Item ID that should rebill
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Item ID that should rebill")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public AutoOrderItemSimpleSchedule repeatCount(Integer repeatCount) {
    
    this.repeatCount = repeatCount;
    return this;
  }

   /**
   * The number of times this simple schedule is configured for
   * @return repeatCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of times this simple schedule is configured for")

  public Integer getRepeatCount() {
    return repeatCount;
  }


  public void setRepeatCount(Integer repeatCount) {
    this.repeatCount = repeatCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoOrderItemSimpleSchedule autoOrderItemSimpleSchedule = (AutoOrderItemSimpleSchedule) o;
    return Objects.equals(this.frequency, autoOrderItemSimpleSchedule.frequency) &&
        Objects.equals(this.itemId, autoOrderItemSimpleSchedule.itemId) &&
        Objects.equals(this.repeatCount, autoOrderItemSimpleSchedule.repeatCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, itemId, repeatCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoOrderItemSimpleSchedule {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
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
    openapiFields.add("frequency");
    openapiFields.add("item_id");
    openapiFields.add("repeat_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AutoOrderItemSimpleSchedule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AutoOrderItemSimpleSchedule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AutoOrderItemSimpleSchedule is not found in the empty JSON string", AutoOrderItemSimpleSchedule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AutoOrderItemSimpleSchedule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AutoOrderItemSimpleSchedule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("frequency") != null && !jsonObj.get("frequency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `frequency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("frequency").toString()));
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AutoOrderItemSimpleSchedule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AutoOrderItemSimpleSchedule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AutoOrderItemSimpleSchedule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AutoOrderItemSimpleSchedule.class));

       return (TypeAdapter<T>) new TypeAdapter<AutoOrderItemSimpleSchedule>() {
           @Override
           public void write(JsonWriter out, AutoOrderItemSimpleSchedule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AutoOrderItemSimpleSchedule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AutoOrderItemSimpleSchedule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AutoOrderItemSimpleSchedule
  * @throws IOException if the JSON string is invalid with respect to AutoOrderItemSimpleSchedule
  */
  public static AutoOrderItemSimpleSchedule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AutoOrderItemSimpleSchedule.class);
  }

 /**
  * Convert an instance of AutoOrderItemSimpleSchedule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

