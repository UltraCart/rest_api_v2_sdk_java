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
import com.ultracart.admin.v2.models.ScreenRecordingFilterValuesEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ScreenRecordingFilterValues
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-01T07:55:46.727-05:00")



public class ScreenRecordingFilterValues {
  @SerializedName("events")
  private List<ScreenRecordingFilterValuesEvent> events = null;

  @SerializedName("geolocation_countries")
  private List<String> geolocationCountries = null;

  @SerializedName("geolocation_states")
  private List<String> geolocationStates = null;

  @SerializedName("max_values")
  private Integer maxValues = null;

  @SerializedName("urls")
  private List<String> urls = null;

  @SerializedName("user_agent_device_names")
  private List<String> userAgentDeviceNames = null;

  @SerializedName("user_agent_device_os_names")
  private List<String> userAgentDeviceOsNames = null;

  @SerializedName("user_agent_device_os_versions")
  private List<String> userAgentDeviceOsVersions = null;

  @SerializedName("user_agent_names")
  private List<String> userAgentNames = null;

  @SerializedName("user_agent_originals")
  private List<String> userAgentOriginals = null;

  public ScreenRecordingFilterValues events(List<ScreenRecordingFilterValuesEvent> events) {
    this.events = events;
    return this;
  }

  public ScreenRecordingFilterValues addEventsItem(ScreenRecordingFilterValuesEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<ScreenRecordingFilterValuesEvent>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @ApiModelProperty(value = "")
  public List<ScreenRecordingFilterValuesEvent> getEvents() {
    return events;
  }

  public void setEvents(List<ScreenRecordingFilterValuesEvent> events) {
    this.events = events;
  }

  public ScreenRecordingFilterValues geolocationCountries(List<String> geolocationCountries) {
    this.geolocationCountries = geolocationCountries;
    return this;
  }

  public ScreenRecordingFilterValues addGeolocationCountriesItem(String geolocationCountriesItem) {
    if (this.geolocationCountries == null) {
      this.geolocationCountries = new ArrayList<String>();
    }
    this.geolocationCountries.add(geolocationCountriesItem);
    return this;
  }

   /**
   * Get geolocationCountries
   * @return geolocationCountries
  **/
  @ApiModelProperty(value = "")
  public List<String> getGeolocationCountries() {
    return geolocationCountries;
  }

  public void setGeolocationCountries(List<String> geolocationCountries) {
    this.geolocationCountries = geolocationCountries;
  }

  public ScreenRecordingFilterValues geolocationStates(List<String> geolocationStates) {
    this.geolocationStates = geolocationStates;
    return this;
  }

  public ScreenRecordingFilterValues addGeolocationStatesItem(String geolocationStatesItem) {
    if (this.geolocationStates == null) {
      this.geolocationStates = new ArrayList<String>();
    }
    this.geolocationStates.add(geolocationStatesItem);
    return this;
  }

   /**
   * Get geolocationStates
   * @return geolocationStates
  **/
  @ApiModelProperty(value = "")
  public List<String> getGeolocationStates() {
    return geolocationStates;
  }

  public void setGeolocationStates(List<String> geolocationStates) {
    this.geolocationStates = geolocationStates;
  }

  public ScreenRecordingFilterValues maxValues(Integer maxValues) {
    this.maxValues = maxValues;
    return this;
  }

   /**
   * Get maxValues
   * @return maxValues
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxValues() {
    return maxValues;
  }

  public void setMaxValues(Integer maxValues) {
    this.maxValues = maxValues;
  }

  public ScreenRecordingFilterValues urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public ScreenRecordingFilterValues addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<String>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(value = "")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }

  public ScreenRecordingFilterValues userAgentDeviceNames(List<String> userAgentDeviceNames) {
    this.userAgentDeviceNames = userAgentDeviceNames;
    return this;
  }

  public ScreenRecordingFilterValues addUserAgentDeviceNamesItem(String userAgentDeviceNamesItem) {
    if (this.userAgentDeviceNames == null) {
      this.userAgentDeviceNames = new ArrayList<String>();
    }
    this.userAgentDeviceNames.add(userAgentDeviceNamesItem);
    return this;
  }

   /**
   * Get userAgentDeviceNames
   * @return userAgentDeviceNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserAgentDeviceNames() {
    return userAgentDeviceNames;
  }

  public void setUserAgentDeviceNames(List<String> userAgentDeviceNames) {
    this.userAgentDeviceNames = userAgentDeviceNames;
  }

  public ScreenRecordingFilterValues userAgentDeviceOsNames(List<String> userAgentDeviceOsNames) {
    this.userAgentDeviceOsNames = userAgentDeviceOsNames;
    return this;
  }

  public ScreenRecordingFilterValues addUserAgentDeviceOsNamesItem(String userAgentDeviceOsNamesItem) {
    if (this.userAgentDeviceOsNames == null) {
      this.userAgentDeviceOsNames = new ArrayList<String>();
    }
    this.userAgentDeviceOsNames.add(userAgentDeviceOsNamesItem);
    return this;
  }

   /**
   * Get userAgentDeviceOsNames
   * @return userAgentDeviceOsNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserAgentDeviceOsNames() {
    return userAgentDeviceOsNames;
  }

  public void setUserAgentDeviceOsNames(List<String> userAgentDeviceOsNames) {
    this.userAgentDeviceOsNames = userAgentDeviceOsNames;
  }

  public ScreenRecordingFilterValues userAgentDeviceOsVersions(List<String> userAgentDeviceOsVersions) {
    this.userAgentDeviceOsVersions = userAgentDeviceOsVersions;
    return this;
  }

  public ScreenRecordingFilterValues addUserAgentDeviceOsVersionsItem(String userAgentDeviceOsVersionsItem) {
    if (this.userAgentDeviceOsVersions == null) {
      this.userAgentDeviceOsVersions = new ArrayList<String>();
    }
    this.userAgentDeviceOsVersions.add(userAgentDeviceOsVersionsItem);
    return this;
  }

   /**
   * Get userAgentDeviceOsVersions
   * @return userAgentDeviceOsVersions
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserAgentDeviceOsVersions() {
    return userAgentDeviceOsVersions;
  }

  public void setUserAgentDeviceOsVersions(List<String> userAgentDeviceOsVersions) {
    this.userAgentDeviceOsVersions = userAgentDeviceOsVersions;
  }

  public ScreenRecordingFilterValues userAgentNames(List<String> userAgentNames) {
    this.userAgentNames = userAgentNames;
    return this;
  }

  public ScreenRecordingFilterValues addUserAgentNamesItem(String userAgentNamesItem) {
    if (this.userAgentNames == null) {
      this.userAgentNames = new ArrayList<String>();
    }
    this.userAgentNames.add(userAgentNamesItem);
    return this;
  }

   /**
   * Get userAgentNames
   * @return userAgentNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserAgentNames() {
    return userAgentNames;
  }

  public void setUserAgentNames(List<String> userAgentNames) {
    this.userAgentNames = userAgentNames;
  }

  public ScreenRecordingFilterValues userAgentOriginals(List<String> userAgentOriginals) {
    this.userAgentOriginals = userAgentOriginals;
    return this;
  }

  public ScreenRecordingFilterValues addUserAgentOriginalsItem(String userAgentOriginalsItem) {
    if (this.userAgentOriginals == null) {
      this.userAgentOriginals = new ArrayList<String>();
    }
    this.userAgentOriginals.add(userAgentOriginalsItem);
    return this;
  }

   /**
   * Get userAgentOriginals
   * @return userAgentOriginals
  **/
  @ApiModelProperty(value = "")
  public List<String> getUserAgentOriginals() {
    return userAgentOriginals;
  }

  public void setUserAgentOriginals(List<String> userAgentOriginals) {
    this.userAgentOriginals = userAgentOriginals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenRecordingFilterValues screenRecordingFilterValues = (ScreenRecordingFilterValues) o;
    return Objects.equals(this.events, screenRecordingFilterValues.events) &&
        Objects.equals(this.geolocationCountries, screenRecordingFilterValues.geolocationCountries) &&
        Objects.equals(this.geolocationStates, screenRecordingFilterValues.geolocationStates) &&
        Objects.equals(this.maxValues, screenRecordingFilterValues.maxValues) &&
        Objects.equals(this.urls, screenRecordingFilterValues.urls) &&
        Objects.equals(this.userAgentDeviceNames, screenRecordingFilterValues.userAgentDeviceNames) &&
        Objects.equals(this.userAgentDeviceOsNames, screenRecordingFilterValues.userAgentDeviceOsNames) &&
        Objects.equals(this.userAgentDeviceOsVersions, screenRecordingFilterValues.userAgentDeviceOsVersions) &&
        Objects.equals(this.userAgentNames, screenRecordingFilterValues.userAgentNames) &&
        Objects.equals(this.userAgentOriginals, screenRecordingFilterValues.userAgentOriginals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, geolocationCountries, geolocationStates, maxValues, urls, userAgentDeviceNames, userAgentDeviceOsNames, userAgentDeviceOsVersions, userAgentNames, userAgentOriginals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingFilterValues {\n");
    
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    geolocationCountries: ").append(toIndentedString(geolocationCountries)).append("\n");
    sb.append("    geolocationStates: ").append(toIndentedString(geolocationStates)).append("\n");
    sb.append("    maxValues: ").append(toIndentedString(maxValues)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    userAgentDeviceNames: ").append(toIndentedString(userAgentDeviceNames)).append("\n");
    sb.append("    userAgentDeviceOsNames: ").append(toIndentedString(userAgentDeviceOsNames)).append("\n");
    sb.append("    userAgentDeviceOsVersions: ").append(toIndentedString(userAgentDeviceOsVersions)).append("\n");
    sb.append("    userAgentNames: ").append(toIndentedString(userAgentNames)).append("\n");
    sb.append("    userAgentOriginals: ").append(toIndentedString(userAgentOriginals)).append("\n");
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
