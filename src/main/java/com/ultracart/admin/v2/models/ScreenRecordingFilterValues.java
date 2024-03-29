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
import com.ultracart.admin.v2.models.ScreenRecordingFilterValuesPageView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ScreenRecordingFilterValues
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ScreenRecordingFilterValues {
  @SerializedName("communications_campaign_names")
  private List<String> communicationsCampaignNames = null;

  @SerializedName("communications_email_subjects")
  private List<String> communicationsEmailSubjects = null;

  @SerializedName("communications_flow_names")
  private List<String> communicationsFlowNames = null;

  @SerializedName("email_domains")
  private List<String> emailDomains = null;

  @SerializedName("geolocation_countries")
  private List<String> geolocationCountries = null;

  @SerializedName("geolocation_states")
  private List<String> geolocationStates = null;

  @SerializedName("language_iso_codes")
  private List<String> languageIsoCodes = null;

  @SerializedName("max_values")
  private Integer maxValues = null;

  @SerializedName("page_views")
  private List<ScreenRecordingFilterValuesPageView> pageViews = null;

  @SerializedName("preferred_languages")
  private List<String> preferredLanguages = null;

  @SerializedName("referrer_domains")
  private List<String> referrerDomains = null;

  @SerializedName("time_on_site_max")
  private Integer timeOnSiteMax = null;

  @SerializedName("time_on_site_min")
  private Integer timeOnSiteMin = null;

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

  @SerializedName("utm_campaigns")
  private List<String> utmCampaigns = null;

  @SerializedName("utm_sources")
  private List<String> utmSources = null;

  public ScreenRecordingFilterValues communicationsCampaignNames(List<String> communicationsCampaignNames) {
    this.communicationsCampaignNames = communicationsCampaignNames;
    return this;
  }

  public ScreenRecordingFilterValues addCommunicationsCampaignNamesItem(String communicationsCampaignNamesItem) {
    if (this.communicationsCampaignNames == null) {
      this.communicationsCampaignNames = new ArrayList<String>();
    }
    this.communicationsCampaignNames.add(communicationsCampaignNamesItem);
    return this;
  }

   /**
   * Get communicationsCampaignNames
   * @return communicationsCampaignNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getCommunicationsCampaignNames() {
    return communicationsCampaignNames;
  }

  public void setCommunicationsCampaignNames(List<String> communicationsCampaignNames) {
    this.communicationsCampaignNames = communicationsCampaignNames;
  }

  public ScreenRecordingFilterValues communicationsEmailSubjects(List<String> communicationsEmailSubjects) {
    this.communicationsEmailSubjects = communicationsEmailSubjects;
    return this;
  }

  public ScreenRecordingFilterValues addCommunicationsEmailSubjectsItem(String communicationsEmailSubjectsItem) {
    if (this.communicationsEmailSubjects == null) {
      this.communicationsEmailSubjects = new ArrayList<String>();
    }
    this.communicationsEmailSubjects.add(communicationsEmailSubjectsItem);
    return this;
  }

   /**
   * Get communicationsEmailSubjects
   * @return communicationsEmailSubjects
  **/
  @ApiModelProperty(value = "")
  public List<String> getCommunicationsEmailSubjects() {
    return communicationsEmailSubjects;
  }

  public void setCommunicationsEmailSubjects(List<String> communicationsEmailSubjects) {
    this.communicationsEmailSubjects = communicationsEmailSubjects;
  }

  public ScreenRecordingFilterValues communicationsFlowNames(List<String> communicationsFlowNames) {
    this.communicationsFlowNames = communicationsFlowNames;
    return this;
  }

  public ScreenRecordingFilterValues addCommunicationsFlowNamesItem(String communicationsFlowNamesItem) {
    if (this.communicationsFlowNames == null) {
      this.communicationsFlowNames = new ArrayList<String>();
    }
    this.communicationsFlowNames.add(communicationsFlowNamesItem);
    return this;
  }

   /**
   * Get communicationsFlowNames
   * @return communicationsFlowNames
  **/
  @ApiModelProperty(value = "")
  public List<String> getCommunicationsFlowNames() {
    return communicationsFlowNames;
  }

  public void setCommunicationsFlowNames(List<String> communicationsFlowNames) {
    this.communicationsFlowNames = communicationsFlowNames;
  }

  public ScreenRecordingFilterValues emailDomains(List<String> emailDomains) {
    this.emailDomains = emailDomains;
    return this;
  }

  public ScreenRecordingFilterValues addEmailDomainsItem(String emailDomainsItem) {
    if (this.emailDomains == null) {
      this.emailDomains = new ArrayList<String>();
    }
    this.emailDomains.add(emailDomainsItem);
    return this;
  }

   /**
   * Get emailDomains
   * @return emailDomains
  **/
  @ApiModelProperty(value = "")
  public List<String> getEmailDomains() {
    return emailDomains;
  }

  public void setEmailDomains(List<String> emailDomains) {
    this.emailDomains = emailDomains;
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

  public ScreenRecordingFilterValues languageIsoCodes(List<String> languageIsoCodes) {
    this.languageIsoCodes = languageIsoCodes;
    return this;
  }

  public ScreenRecordingFilterValues addLanguageIsoCodesItem(String languageIsoCodesItem) {
    if (this.languageIsoCodes == null) {
      this.languageIsoCodes = new ArrayList<String>();
    }
    this.languageIsoCodes.add(languageIsoCodesItem);
    return this;
  }

   /**
   * Get languageIsoCodes
   * @return languageIsoCodes
  **/
  @ApiModelProperty(value = "")
  public List<String> getLanguageIsoCodes() {
    return languageIsoCodes;
  }

  public void setLanguageIsoCodes(List<String> languageIsoCodes) {
    this.languageIsoCodes = languageIsoCodes;
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

  public ScreenRecordingFilterValues pageViews(List<ScreenRecordingFilterValuesPageView> pageViews) {
    this.pageViews = pageViews;
    return this;
  }

  public ScreenRecordingFilterValues addPageViewsItem(ScreenRecordingFilterValuesPageView pageViewsItem) {
    if (this.pageViews == null) {
      this.pageViews = new ArrayList<ScreenRecordingFilterValuesPageView>();
    }
    this.pageViews.add(pageViewsItem);
    return this;
  }

   /**
   * Get pageViews
   * @return pageViews
  **/
  @ApiModelProperty(value = "")
  public List<ScreenRecordingFilterValuesPageView> getPageViews() {
    return pageViews;
  }

  public void setPageViews(List<ScreenRecordingFilterValuesPageView> pageViews) {
    this.pageViews = pageViews;
  }

  public ScreenRecordingFilterValues preferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
    return this;
  }

  public ScreenRecordingFilterValues addPreferredLanguagesItem(String preferredLanguagesItem) {
    if (this.preferredLanguages == null) {
      this.preferredLanguages = new ArrayList<String>();
    }
    this.preferredLanguages.add(preferredLanguagesItem);
    return this;
  }

   /**
   * Get preferredLanguages
   * @return preferredLanguages
  **/
  @ApiModelProperty(value = "")
  public List<String> getPreferredLanguages() {
    return preferredLanguages;
  }

  public void setPreferredLanguages(List<String> preferredLanguages) {
    this.preferredLanguages = preferredLanguages;
  }

  public ScreenRecordingFilterValues referrerDomains(List<String> referrerDomains) {
    this.referrerDomains = referrerDomains;
    return this;
  }

  public ScreenRecordingFilterValues addReferrerDomainsItem(String referrerDomainsItem) {
    if (this.referrerDomains == null) {
      this.referrerDomains = new ArrayList<String>();
    }
    this.referrerDomains.add(referrerDomainsItem);
    return this;
  }

   /**
   * Get referrerDomains
   * @return referrerDomains
  **/
  @ApiModelProperty(value = "")
  public List<String> getReferrerDomains() {
    return referrerDomains;
  }

  public void setReferrerDomains(List<String> referrerDomains) {
    this.referrerDomains = referrerDomains;
  }

  public ScreenRecordingFilterValues timeOnSiteMax(Integer timeOnSiteMax) {
    this.timeOnSiteMax = timeOnSiteMax;
    return this;
  }

   /**
   * Get timeOnSiteMax
   * @return timeOnSiteMax
  **/
  @ApiModelProperty(value = "")
  public Integer getTimeOnSiteMax() {
    return timeOnSiteMax;
  }

  public void setTimeOnSiteMax(Integer timeOnSiteMax) {
    this.timeOnSiteMax = timeOnSiteMax;
  }

  public ScreenRecordingFilterValues timeOnSiteMin(Integer timeOnSiteMin) {
    this.timeOnSiteMin = timeOnSiteMin;
    return this;
  }

   /**
   * Get timeOnSiteMin
   * @return timeOnSiteMin
  **/
  @ApiModelProperty(value = "")
  public Integer getTimeOnSiteMin() {
    return timeOnSiteMin;
  }

  public void setTimeOnSiteMin(Integer timeOnSiteMin) {
    this.timeOnSiteMin = timeOnSiteMin;
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

  public ScreenRecordingFilterValues utmCampaigns(List<String> utmCampaigns) {
    this.utmCampaigns = utmCampaigns;
    return this;
  }

  public ScreenRecordingFilterValues addUtmCampaignsItem(String utmCampaignsItem) {
    if (this.utmCampaigns == null) {
      this.utmCampaigns = new ArrayList<String>();
    }
    this.utmCampaigns.add(utmCampaignsItem);
    return this;
  }

   /**
   * Get utmCampaigns
   * @return utmCampaigns
  **/
  @ApiModelProperty(value = "")
  public List<String> getUtmCampaigns() {
    return utmCampaigns;
  }

  public void setUtmCampaigns(List<String> utmCampaigns) {
    this.utmCampaigns = utmCampaigns;
  }

  public ScreenRecordingFilterValues utmSources(List<String> utmSources) {
    this.utmSources = utmSources;
    return this;
  }

  public ScreenRecordingFilterValues addUtmSourcesItem(String utmSourcesItem) {
    if (this.utmSources == null) {
      this.utmSources = new ArrayList<String>();
    }
    this.utmSources.add(utmSourcesItem);
    return this;
  }

   /**
   * Get utmSources
   * @return utmSources
  **/
  @ApiModelProperty(value = "")
  public List<String> getUtmSources() {
    return utmSources;
  }

  public void setUtmSources(List<String> utmSources) {
    this.utmSources = utmSources;
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
    return Objects.equals(this.communicationsCampaignNames, screenRecordingFilterValues.communicationsCampaignNames) &&
        Objects.equals(this.communicationsEmailSubjects, screenRecordingFilterValues.communicationsEmailSubjects) &&
        Objects.equals(this.communicationsFlowNames, screenRecordingFilterValues.communicationsFlowNames) &&
        Objects.equals(this.emailDomains, screenRecordingFilterValues.emailDomains) &&
        Objects.equals(this.geolocationCountries, screenRecordingFilterValues.geolocationCountries) &&
        Objects.equals(this.geolocationStates, screenRecordingFilterValues.geolocationStates) &&
        Objects.equals(this.languageIsoCodes, screenRecordingFilterValues.languageIsoCodes) &&
        Objects.equals(this.maxValues, screenRecordingFilterValues.maxValues) &&
        Objects.equals(this.pageViews, screenRecordingFilterValues.pageViews) &&
        Objects.equals(this.preferredLanguages, screenRecordingFilterValues.preferredLanguages) &&
        Objects.equals(this.referrerDomains, screenRecordingFilterValues.referrerDomains) &&
        Objects.equals(this.timeOnSiteMax, screenRecordingFilterValues.timeOnSiteMax) &&
        Objects.equals(this.timeOnSiteMin, screenRecordingFilterValues.timeOnSiteMin) &&
        Objects.equals(this.urls, screenRecordingFilterValues.urls) &&
        Objects.equals(this.userAgentDeviceNames, screenRecordingFilterValues.userAgentDeviceNames) &&
        Objects.equals(this.userAgentDeviceOsNames, screenRecordingFilterValues.userAgentDeviceOsNames) &&
        Objects.equals(this.userAgentDeviceOsVersions, screenRecordingFilterValues.userAgentDeviceOsVersions) &&
        Objects.equals(this.userAgentNames, screenRecordingFilterValues.userAgentNames) &&
        Objects.equals(this.userAgentOriginals, screenRecordingFilterValues.userAgentOriginals) &&
        Objects.equals(this.utmCampaigns, screenRecordingFilterValues.utmCampaigns) &&
        Objects.equals(this.utmSources, screenRecordingFilterValues.utmSources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(communicationsCampaignNames, communicationsEmailSubjects, communicationsFlowNames, emailDomains, geolocationCountries, geolocationStates, languageIsoCodes, maxValues, pageViews, preferredLanguages, referrerDomains, timeOnSiteMax, timeOnSiteMin, urls, userAgentDeviceNames, userAgentDeviceOsNames, userAgentDeviceOsVersions, userAgentNames, userAgentOriginals, utmCampaigns, utmSources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingFilterValues {\n");
    
    sb.append("    communicationsCampaignNames: ").append(toIndentedString(communicationsCampaignNames)).append("\n");
    sb.append("    communicationsEmailSubjects: ").append(toIndentedString(communicationsEmailSubjects)).append("\n");
    sb.append("    communicationsFlowNames: ").append(toIndentedString(communicationsFlowNames)).append("\n");
    sb.append("    emailDomains: ").append(toIndentedString(emailDomains)).append("\n");
    sb.append("    geolocationCountries: ").append(toIndentedString(geolocationCountries)).append("\n");
    sb.append("    geolocationStates: ").append(toIndentedString(geolocationStates)).append("\n");
    sb.append("    languageIsoCodes: ").append(toIndentedString(languageIsoCodes)).append("\n");
    sb.append("    maxValues: ").append(toIndentedString(maxValues)).append("\n");
    sb.append("    pageViews: ").append(toIndentedString(pageViews)).append("\n");
    sb.append("    preferredLanguages: ").append(toIndentedString(preferredLanguages)).append("\n");
    sb.append("    referrerDomains: ").append(toIndentedString(referrerDomains)).append("\n");
    sb.append("    timeOnSiteMax: ").append(toIndentedString(timeOnSiteMax)).append("\n");
    sb.append("    timeOnSiteMin: ").append(toIndentedString(timeOnSiteMin)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    userAgentDeviceNames: ").append(toIndentedString(userAgentDeviceNames)).append("\n");
    sb.append("    userAgentDeviceOsNames: ").append(toIndentedString(userAgentDeviceOsNames)).append("\n");
    sb.append("    userAgentDeviceOsVersions: ").append(toIndentedString(userAgentDeviceOsVersions)).append("\n");
    sb.append("    userAgentNames: ").append(toIndentedString(userAgentNames)).append("\n");
    sb.append("    userAgentOriginals: ").append(toIndentedString(userAgentOriginals)).append("\n");
    sb.append("    utmCampaigns: ").append(toIndentedString(utmCampaigns)).append("\n");
    sb.append("    utmSources: ").append(toIndentedString(utmSources)).append("\n");
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

