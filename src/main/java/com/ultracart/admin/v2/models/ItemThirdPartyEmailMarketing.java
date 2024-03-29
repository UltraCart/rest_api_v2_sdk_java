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
import java.util.ArrayList;
import java.util.List;

/**
 * ItemThirdPartyEmailMarketing
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ItemThirdPartyEmailMarketing {
  @SerializedName("add_tags")
  private List<String> addTags = null;

  /**
   * Provider name
   */
  @JsonAdapter(ProviderNameEnum.Adapter.class)
  public enum ProviderNameEnum {
    ACTIVECAMPAIGN("ActiveCampaign"),
    
    AWEBER("AWeber"),
    
    CAMPAIGN_MONITOR("Campaign Monitor"),
    
    CONSTANTCONTACT("ConstantContact"),
    
    EMMA("Emma"),
    
    GETRESPONSE("GetResponse"),
    
    ICONTACT("iContact"),
    
    KLAVIYO("Klaviyo"),
    
    LYRIS("Lyris"),
    
    LYRISHQ("LyrisHQ"),
    
    MAILCHIMP("MailChimp"),
    
    SILVERPOP("SilverPop");

    private String value;

    ProviderNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProviderNameEnum fromValue(String text) {
      for (ProviderNameEnum b : ProviderNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProviderNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProviderNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProviderNameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProviderNameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("provider_name")
  private ProviderNameEnum providerName = null;

  @SerializedName("remove_tags")
  private List<String> removeTags = null;

  @SerializedName("subscribe_lists")
  private List<String> subscribeLists = null;

  @SerializedName("unsubscribe_lists")
  private List<String> unsubscribeLists = null;

  public ItemThirdPartyEmailMarketing addTags(List<String> addTags) {
    this.addTags = addTags;
    return this;
  }

  public ItemThirdPartyEmailMarketing addAddTagsItem(String addTagsItem) {
    if (this.addTags == null) {
      this.addTags = new ArrayList<String>();
    }
    this.addTags.add(addTagsItem);
    return this;
  }

   /**
   * Add tags
   * @return addTags
  **/
  @ApiModelProperty(value = "Add tags")
  public List<String> getAddTags() {
    return addTags;
  }

  public void setAddTags(List<String> addTags) {
    this.addTags = addTags;
  }

  public ItemThirdPartyEmailMarketing providerName(ProviderNameEnum providerName) {
    this.providerName = providerName;
    return this;
  }

   /**
   * Provider name
   * @return providerName
  **/
  @ApiModelProperty(value = "Provider name")
  public ProviderNameEnum getProviderName() {
    return providerName;
  }

  public void setProviderName(ProviderNameEnum providerName) {
    this.providerName = providerName;
  }

  public ItemThirdPartyEmailMarketing removeTags(List<String> removeTags) {
    this.removeTags = removeTags;
    return this;
  }

  public ItemThirdPartyEmailMarketing addRemoveTagsItem(String removeTagsItem) {
    if (this.removeTags == null) {
      this.removeTags = new ArrayList<String>();
    }
    this.removeTags.add(removeTagsItem);
    return this;
  }

   /**
   * Remove tags
   * @return removeTags
  **/
  @ApiModelProperty(value = "Remove tags")
  public List<String> getRemoveTags() {
    return removeTags;
  }

  public void setRemoveTags(List<String> removeTags) {
    this.removeTags = removeTags;
  }

  public ItemThirdPartyEmailMarketing subscribeLists(List<String> subscribeLists) {
    this.subscribeLists = subscribeLists;
    return this;
  }

  public ItemThirdPartyEmailMarketing addSubscribeListsItem(String subscribeListsItem) {
    if (this.subscribeLists == null) {
      this.subscribeLists = new ArrayList<String>();
    }
    this.subscribeLists.add(subscribeListsItem);
    return this;
  }

   /**
   * Subscribe to lists
   * @return subscribeLists
  **/
  @ApiModelProperty(value = "Subscribe to lists")
  public List<String> getSubscribeLists() {
    return subscribeLists;
  }

  public void setSubscribeLists(List<String> subscribeLists) {
    this.subscribeLists = subscribeLists;
  }

  public ItemThirdPartyEmailMarketing unsubscribeLists(List<String> unsubscribeLists) {
    this.unsubscribeLists = unsubscribeLists;
    return this;
  }

  public ItemThirdPartyEmailMarketing addUnsubscribeListsItem(String unsubscribeListsItem) {
    if (this.unsubscribeLists == null) {
      this.unsubscribeLists = new ArrayList<String>();
    }
    this.unsubscribeLists.add(unsubscribeListsItem);
    return this;
  }

   /**
   * Unsubscribe from lists
   * @return unsubscribeLists
  **/
  @ApiModelProperty(value = "Unsubscribe from lists")
  public List<String> getUnsubscribeLists() {
    return unsubscribeLists;
  }

  public void setUnsubscribeLists(List<String> unsubscribeLists) {
    this.unsubscribeLists = unsubscribeLists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemThirdPartyEmailMarketing itemThirdPartyEmailMarketing = (ItemThirdPartyEmailMarketing) o;
    return Objects.equals(this.addTags, itemThirdPartyEmailMarketing.addTags) &&
        Objects.equals(this.providerName, itemThirdPartyEmailMarketing.providerName) &&
        Objects.equals(this.removeTags, itemThirdPartyEmailMarketing.removeTags) &&
        Objects.equals(this.subscribeLists, itemThirdPartyEmailMarketing.subscribeLists) &&
        Objects.equals(this.unsubscribeLists, itemThirdPartyEmailMarketing.unsubscribeLists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addTags, providerName, removeTags, subscribeLists, unsubscribeLists);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemThirdPartyEmailMarketing {\n");
    
    sb.append("    addTags: ").append(toIndentedString(addTags)).append("\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
    sb.append("    removeTags: ").append(toIndentedString(removeTags)).append("\n");
    sb.append("    subscribeLists: ").append(toIndentedString(subscribeLists)).append("\n");
    sb.append("    unsubscribeLists: ").append(toIndentedString(unsubscribeLists)).append("\n");
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

