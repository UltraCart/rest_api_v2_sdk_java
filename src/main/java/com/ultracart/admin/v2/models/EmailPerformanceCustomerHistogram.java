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
import com.ultracart.admin.v2.models.EmailPerformanceCustomerHistogramPeriod;
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
 * EmailPerformanceCustomerHistogram
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class EmailPerformanceCustomerHistogram {
  public static final String SERIALIZED_NAME_PERIODS = "periods";
  @SerializedName(SERIALIZED_NAME_PERIODS)
  private List<EmailPerformanceCustomerHistogramPeriod> periods = null;

  public EmailPerformanceCustomerHistogram() { 
  }

  public EmailPerformanceCustomerHistogram periods(List<EmailPerformanceCustomerHistogramPeriod> periods) {
    
    this.periods = periods;
    return this;
  }

  public EmailPerformanceCustomerHistogram addPeriodsItem(EmailPerformanceCustomerHistogramPeriod periodsItem) {
    if (this.periods == null) {
      this.periods = new ArrayList<>();
    }
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * Periods (newest to oldest)
   * @return periods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Periods (newest to oldest)")

  public List<EmailPerformanceCustomerHistogramPeriod> getPeriods() {
    return periods;
  }


  public void setPeriods(List<EmailPerformanceCustomerHistogramPeriod> periods) {
    this.periods = periods;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailPerformanceCustomerHistogram emailPerformanceCustomerHistogram = (EmailPerformanceCustomerHistogram) o;
    return Objects.equals(this.periods, emailPerformanceCustomerHistogram.periods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailPerformanceCustomerHistogram {\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
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
    openapiFields.add("periods");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailPerformanceCustomerHistogram
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EmailPerformanceCustomerHistogram.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailPerformanceCustomerHistogram is not found in the empty JSON string", EmailPerformanceCustomerHistogram.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EmailPerformanceCustomerHistogram.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailPerformanceCustomerHistogram` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayperiods = jsonObj.getAsJsonArray("periods");
      if (jsonArrayperiods != null) {
        // ensure the json data is an array
        if (!jsonObj.get("periods").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `periods` to be an array in the JSON string but got `%s`", jsonObj.get("periods").toString()));
        }

        // validate the optional field `periods` (array)
        for (int i = 0; i < jsonArrayperiods.size(); i++) {
          EmailPerformanceCustomerHistogramPeriod.validateJsonObject(jsonArrayperiods.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailPerformanceCustomerHistogram.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailPerformanceCustomerHistogram' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailPerformanceCustomerHistogram> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailPerformanceCustomerHistogram.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailPerformanceCustomerHistogram>() {
           @Override
           public void write(JsonWriter out, EmailPerformanceCustomerHistogram value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailPerformanceCustomerHistogram read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailPerformanceCustomerHistogram given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailPerformanceCustomerHistogram
  * @throws IOException if the JSON string is invalid with respect to EmailPerformanceCustomerHistogram
  */
  public static EmailPerformanceCustomerHistogram fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailPerformanceCustomerHistogram.class);
  }

 /**
  * Convert an instance of EmailPerformanceCustomerHistogram to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

