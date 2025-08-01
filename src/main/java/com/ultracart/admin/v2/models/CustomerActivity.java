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
import com.ultracart.admin.v2.models.Activity;
import com.ultracart.admin.v2.models.ListSegmentMembership;
import com.ultracart.admin.v2.models.Metric;
import com.ultracart.admin.v2.models.Property;
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
 * CustomerActivity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class CustomerActivity {
  public static final String SERIALIZED_NAME_ACTIVITIES = "activities";
  @SerializedName(SERIALIZED_NAME_ACTIVITIES)
  private List<Activity> activities = null;

  public static final String SERIALIZED_NAME_GLOBAL_UNSUBSCRIBED = "global_unsubscribed";
  @SerializedName(SERIALIZED_NAME_GLOBAL_UNSUBSCRIBED)
  private Boolean globalUnsubscribed;

  public static final String SERIALIZED_NAME_GLOBAL_UNSUBSCRIBED_DTS = "global_unsubscribed_dts";
  @SerializedName(SERIALIZED_NAME_GLOBAL_UNSUBSCRIBED_DTS)
  private String globalUnsubscribedDts;

  public static final String SERIALIZED_NAME_MEMBERSHIPS = "memberships";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIPS)
  private List<ListSegmentMembership> memberships = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<Metric> metrics = null;

  public static final String SERIALIZED_NAME_PROPERTIES_LIST = "properties_list";
  @SerializedName(SERIALIZED_NAME_PROPERTIES_LIST)
  private List<Property> propertiesList = null;

  public static final String SERIALIZED_NAME_SPAM_COMPLAINT = "spam_complaint";
  @SerializedName(SERIALIZED_NAME_SPAM_COMPLAINT)
  private Boolean spamComplaint;

  public static final String SERIALIZED_NAME_SPAM_COMPLAINT_DTS = "spam_complaint_dts";
  @SerializedName(SERIALIZED_NAME_SPAM_COMPLAINT_DTS)
  private String spamComplaintDts;

  public CustomerActivity() { 
  }

  public CustomerActivity activities(List<Activity> activities) {
    
    this.activities = activities;
    return this;
  }

  public CustomerActivity addActivitiesItem(Activity activitiesItem) {
    if (this.activities == null) {
      this.activities = new ArrayList<>();
    }
    this.activities.add(activitiesItem);
    return this;
  }

   /**
   * Get activities
   * @return activities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Activity> getActivities() {
    return activities;
  }


  public void setActivities(List<Activity> activities) {
    this.activities = activities;
  }


  public CustomerActivity globalUnsubscribed(Boolean globalUnsubscribed) {
    
    this.globalUnsubscribed = globalUnsubscribed;
    return this;
  }

   /**
   * Get globalUnsubscribed
   * @return globalUnsubscribed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGlobalUnsubscribed() {
    return globalUnsubscribed;
  }


  public void setGlobalUnsubscribed(Boolean globalUnsubscribed) {
    this.globalUnsubscribed = globalUnsubscribed;
  }


  public CustomerActivity globalUnsubscribedDts(String globalUnsubscribedDts) {
    
    this.globalUnsubscribedDts = globalUnsubscribedDts;
    return this;
  }

   /**
   * Get globalUnsubscribedDts
   * @return globalUnsubscribedDts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGlobalUnsubscribedDts() {
    return globalUnsubscribedDts;
  }


  public void setGlobalUnsubscribedDts(String globalUnsubscribedDts) {
    this.globalUnsubscribedDts = globalUnsubscribedDts;
  }


  public CustomerActivity memberships(List<ListSegmentMembership> memberships) {
    
    this.memberships = memberships;
    return this;
  }

  public CustomerActivity addMembershipsItem(ListSegmentMembership membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new ArrayList<>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

   /**
   * Get memberships
   * @return memberships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ListSegmentMembership> getMemberships() {
    return memberships;
  }


  public void setMemberships(List<ListSegmentMembership> memberships) {
    this.memberships = memberships;
  }


  public CustomerActivity metrics(List<Metric> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public CustomerActivity addMetricsItem(Metric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Metric> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<Metric> metrics) {
    this.metrics = metrics;
  }


  public CustomerActivity propertiesList(List<Property> propertiesList) {
    
    this.propertiesList = propertiesList;
    return this;
  }

  public CustomerActivity addPropertiesListItem(Property propertiesListItem) {
    if (this.propertiesList == null) {
      this.propertiesList = new ArrayList<>();
    }
    this.propertiesList.add(propertiesListItem);
    return this;
  }

   /**
   * Get propertiesList
   * @return propertiesList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Property> getPropertiesList() {
    return propertiesList;
  }


  public void setPropertiesList(List<Property> propertiesList) {
    this.propertiesList = propertiesList;
  }


  public CustomerActivity spamComplaint(Boolean spamComplaint) {
    
    this.spamComplaint = spamComplaint;
    return this;
  }

   /**
   * Get spamComplaint
   * @return spamComplaint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSpamComplaint() {
    return spamComplaint;
  }


  public void setSpamComplaint(Boolean spamComplaint) {
    this.spamComplaint = spamComplaint;
  }


  public CustomerActivity spamComplaintDts(String spamComplaintDts) {
    
    this.spamComplaintDts = spamComplaintDts;
    return this;
  }

   /**
   * Get spamComplaintDts
   * @return spamComplaintDts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpamComplaintDts() {
    return spamComplaintDts;
  }


  public void setSpamComplaintDts(String spamComplaintDts) {
    this.spamComplaintDts = spamComplaintDts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerActivity customerActivity = (CustomerActivity) o;
    return Objects.equals(this.activities, customerActivity.activities) &&
        Objects.equals(this.globalUnsubscribed, customerActivity.globalUnsubscribed) &&
        Objects.equals(this.globalUnsubscribedDts, customerActivity.globalUnsubscribedDts) &&
        Objects.equals(this.memberships, customerActivity.memberships) &&
        Objects.equals(this.metrics, customerActivity.metrics) &&
        Objects.equals(this.propertiesList, customerActivity.propertiesList) &&
        Objects.equals(this.spamComplaint, customerActivity.spamComplaint) &&
        Objects.equals(this.spamComplaintDts, customerActivity.spamComplaintDts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activities, globalUnsubscribed, globalUnsubscribedDts, memberships, metrics, propertiesList, spamComplaint, spamComplaintDts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerActivity {\n");
    sb.append("    activities: ").append(toIndentedString(activities)).append("\n");
    sb.append("    globalUnsubscribed: ").append(toIndentedString(globalUnsubscribed)).append("\n");
    sb.append("    globalUnsubscribedDts: ").append(toIndentedString(globalUnsubscribedDts)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    propertiesList: ").append(toIndentedString(propertiesList)).append("\n");
    sb.append("    spamComplaint: ").append(toIndentedString(spamComplaint)).append("\n");
    sb.append("    spamComplaintDts: ").append(toIndentedString(spamComplaintDts)).append("\n");
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
    openapiFields.add("activities");
    openapiFields.add("global_unsubscribed");
    openapiFields.add("global_unsubscribed_dts");
    openapiFields.add("memberships");
    openapiFields.add("metrics");
    openapiFields.add("properties_list");
    openapiFields.add("spam_complaint");
    openapiFields.add("spam_complaint_dts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomerActivity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomerActivity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomerActivity is not found in the empty JSON string", CustomerActivity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomerActivity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomerActivity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayactivities = jsonObj.getAsJsonArray("activities");
      if (jsonArrayactivities != null) {
        // ensure the json data is an array
        if (!jsonObj.get("activities").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `activities` to be an array in the JSON string but got `%s`", jsonObj.get("activities").toString()));
        }

        // validate the optional field `activities` (array)
        for (int i = 0; i < jsonArrayactivities.size(); i++) {
          Activity.validateJsonObject(jsonArrayactivities.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("global_unsubscribed_dts") != null && !jsonObj.get("global_unsubscribed_dts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `global_unsubscribed_dts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("global_unsubscribed_dts").toString()));
      }
      JsonArray jsonArraymemberships = jsonObj.getAsJsonArray("memberships");
      if (jsonArraymemberships != null) {
        // ensure the json data is an array
        if (!jsonObj.get("memberships").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `memberships` to be an array in the JSON string but got `%s`", jsonObj.get("memberships").toString()));
        }

        // validate the optional field `memberships` (array)
        for (int i = 0; i < jsonArraymemberships.size(); i++) {
          ListSegmentMembership.validateJsonObject(jsonArraymemberships.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraymetrics = jsonObj.getAsJsonArray("metrics");
      if (jsonArraymetrics != null) {
        // ensure the json data is an array
        if (!jsonObj.get("metrics").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `metrics` to be an array in the JSON string but got `%s`", jsonObj.get("metrics").toString()));
        }

        // validate the optional field `metrics` (array)
        for (int i = 0; i < jsonArraymetrics.size(); i++) {
          Metric.validateJsonObject(jsonArraymetrics.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraypropertiesList = jsonObj.getAsJsonArray("properties_list");
      if (jsonArraypropertiesList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("properties_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `properties_list` to be an array in the JSON string but got `%s`", jsonObj.get("properties_list").toString()));
        }

        // validate the optional field `properties_list` (array)
        for (int i = 0; i < jsonArraypropertiesList.size(); i++) {
          Property.validateJsonObject(jsonArraypropertiesList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("spam_complaint_dts") != null && !jsonObj.get("spam_complaint_dts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spam_complaint_dts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spam_complaint_dts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomerActivity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomerActivity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomerActivity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomerActivity.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomerActivity>() {
           @Override
           public void write(JsonWriter out, CustomerActivity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomerActivity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomerActivity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomerActivity
  * @throws IOException if the JSON string is invalid with respect to CustomerActivity
  */
  public static CustomerActivity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomerActivity.class);
  }

 /**
  * Convert an instance of CustomerActivity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

