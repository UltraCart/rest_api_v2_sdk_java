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
import com.ultracart.admin.v2.models.ReportPageVisualizationDimension;
import com.ultracart.admin.v2.models.ReportPageVisualizationMetric;
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
 * ReportPageVisualization
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class ReportPageVisualization {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private String config;

  public static final String SERIALIZED_NAME_DATA_SOURCE_NAME = "data_source_name";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_NAME)
  private String dataSourceName;

  public static final String SERIALIZED_NAME_DATA_SOURCE_UUID = "data_source_uuid";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_UUID)
  private String dataSourceUuid;

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<ReportPageVisualizationDimension> dimensions = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<ReportPageVisualizationMetric> metrics = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHOW_COMPARISON = "show_comparison";
  @SerializedName(SERIALIZED_NAME_SHOW_COMPARISON)
  private Boolean showComparison;

  public static final String SERIALIZED_NAME_STYLES = "styles";
  @SerializedName(SERIALIZED_NAME_STYLES)
  private String styles;

  /**
   * Type of visualization
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SCORE_CARD("score card"),
    
    LINE_CHART("line chart"),
    
    BAR_CHART("bar chart"),
    
    TEXT("text"),
    
    TABLE("table"),
    
    GAUGE("gauge"),
    
    PIE_CHART("pie chart");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_VISUALIZATION_UUID = "visualization_uuid";
  @SerializedName(SERIALIZED_NAME_VISUALIZATION_UUID)
  private String visualizationUuid;

  public ReportPageVisualization() { 
  }

  public ReportPageVisualization config(String config) {
    
    this.config = config;
    return this;
  }

   /**
   * A JSON representation of the configuration for this visualization
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON representation of the configuration for this visualization")

  public String getConfig() {
    return config;
  }


  public void setConfig(String config) {
    this.config = config;
  }


  public ReportPageVisualization dataSourceName(String dataSourceName) {
    
    this.dataSourceName = dataSourceName;
    return this;
  }

   /**
   * Get dataSourceName
   * @return dataSourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataSourceName() {
    return dataSourceName;
  }


  public void setDataSourceName(String dataSourceName) {
    this.dataSourceName = dataSourceName;
  }


  public ReportPageVisualization dataSourceUuid(String dataSourceUuid) {
    
    this.dataSourceUuid = dataSourceUuid;
    return this;
  }

   /**
   * A unique identifier assigned to the data source.
   * @return dataSourceUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier assigned to the data source.")

  public String getDataSourceUuid() {
    return dataSourceUuid;
  }


  public void setDataSourceUuid(String dataSourceUuid) {
    this.dataSourceUuid = dataSourceUuid;
  }


  public ReportPageVisualization dimensions(List<ReportPageVisualizationDimension> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public ReportPageVisualization addDimensionsItem(ReportPageVisualizationDimension dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReportPageVisualizationDimension> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<ReportPageVisualizationDimension> dimensions) {
    this.dimensions = dimensions;
  }


  public ReportPageVisualization metrics(List<ReportPageVisualizationMetric> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public ReportPageVisualization addMetricsItem(ReportPageVisualizationMetric metricsItem) {
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

  public List<ReportPageVisualizationMetric> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<ReportPageVisualizationMetric> metrics) {
    this.metrics = metrics;
  }


  public ReportPageVisualization name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ReportPageVisualization showComparison(Boolean showComparison) {
    
    this.showComparison = showComparison;
    return this;
  }

   /**
   * True if the visualization should show a comparison based upon the date range
   * @return showComparison
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the visualization should show a comparison based upon the date range")

  public Boolean getShowComparison() {
    return showComparison;
  }


  public void setShowComparison(Boolean showComparison) {
    this.showComparison = showComparison;
  }


  public ReportPageVisualization styles(String styles) {
    
    this.styles = styles;
    return this;
  }

   /**
   * A JSON representation of the style configuration for this visualization
   * @return styles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON representation of the style configuration for this visualization")

  public String getStyles() {
    return styles;
  }


  public void setStyles(String styles) {
    this.styles = styles;
  }


  public ReportPageVisualization type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of visualization
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of visualization")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ReportPageVisualization visualizationUuid(String visualizationUuid) {
    
    this.visualizationUuid = visualizationUuid;
    return this;
  }

   /**
   * A UUID for the visualization
   * @return visualizationUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A UUID for the visualization")

  public String getVisualizationUuid() {
    return visualizationUuid;
  }


  public void setVisualizationUuid(String visualizationUuid) {
    this.visualizationUuid = visualizationUuid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportPageVisualization reportPageVisualization = (ReportPageVisualization) o;
    return Objects.equals(this.config, reportPageVisualization.config) &&
        Objects.equals(this.dataSourceName, reportPageVisualization.dataSourceName) &&
        Objects.equals(this.dataSourceUuid, reportPageVisualization.dataSourceUuid) &&
        Objects.equals(this.dimensions, reportPageVisualization.dimensions) &&
        Objects.equals(this.metrics, reportPageVisualization.metrics) &&
        Objects.equals(this.name, reportPageVisualization.name) &&
        Objects.equals(this.showComparison, reportPageVisualization.showComparison) &&
        Objects.equals(this.styles, reportPageVisualization.styles) &&
        Objects.equals(this.type, reportPageVisualization.type) &&
        Objects.equals(this.visualizationUuid, reportPageVisualization.visualizationUuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, dataSourceName, dataSourceUuid, dimensions, metrics, name, showComparison, styles, type, visualizationUuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportPageVisualization {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    dataSourceName: ").append(toIndentedString(dataSourceName)).append("\n");
    sb.append("    dataSourceUuid: ").append(toIndentedString(dataSourceUuid)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    showComparison: ").append(toIndentedString(showComparison)).append("\n");
    sb.append("    styles: ").append(toIndentedString(styles)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visualizationUuid: ").append(toIndentedString(visualizationUuid)).append("\n");
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
    openapiFields.add("config");
    openapiFields.add("data_source_name");
    openapiFields.add("data_source_uuid");
    openapiFields.add("dimensions");
    openapiFields.add("metrics");
    openapiFields.add("name");
    openapiFields.add("show_comparison");
    openapiFields.add("styles");
    openapiFields.add("type");
    openapiFields.add("visualization_uuid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReportPageVisualization
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReportPageVisualization.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportPageVisualization is not found in the empty JSON string", ReportPageVisualization.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReportPageVisualization.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportPageVisualization` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config").toString()));
      }
      if (jsonObj.get("data_source_name") != null && !jsonObj.get("data_source_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_source_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_source_name").toString()));
      }
      if (jsonObj.get("data_source_uuid") != null && !jsonObj.get("data_source_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_source_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_source_uuid").toString()));
      }
      JsonArray jsonArraydimensions = jsonObj.getAsJsonArray("dimensions");
      if (jsonArraydimensions != null) {
        // ensure the json data is an array
        if (!jsonObj.get("dimensions").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `dimensions` to be an array in the JSON string but got `%s`", jsonObj.get("dimensions").toString()));
        }

        // validate the optional field `dimensions` (array)
        for (int i = 0; i < jsonArraydimensions.size(); i++) {
          ReportPageVisualizationDimension.validateJsonObject(jsonArraydimensions.get(i).getAsJsonObject());
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
          ReportPageVisualizationMetric.validateJsonObject(jsonArraymetrics.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("styles") != null && !jsonObj.get("styles").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `styles` to be a primitive type in the JSON string but got `%s`", jsonObj.get("styles").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("visualization_uuid") != null && !jsonObj.get("visualization_uuid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visualization_uuid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visualization_uuid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportPageVisualization.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportPageVisualization' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportPageVisualization> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportPageVisualization.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportPageVisualization>() {
           @Override
           public void write(JsonWriter out, ReportPageVisualization value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportPageVisualization read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportPageVisualization given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportPageVisualization
  * @throws IOException if the JSON string is invalid with respect to ReportPageVisualization
  */
  public static ReportPageVisualization fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportPageVisualization.class);
  }

 /**
  * Convert an instance of ReportPageVisualization to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

