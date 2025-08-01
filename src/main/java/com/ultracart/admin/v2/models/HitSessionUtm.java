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
 * HitSessionUtm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-07-28T15:30:33.009-04:00[America/Indianapolis]")
public class HitSessionUtm {
  public static final String SERIALIZED_NAME_FB_AD_ID = "fb_ad_id";
  @SerializedName(SERIALIZED_NAME_FB_AD_ID)
  private String fbAdId;

  public static final String SERIALIZED_NAME_FBCLID = "fbclid";
  @SerializedName(SERIALIZED_NAME_FBCLID)
  private String fbclid;

  public static final String SERIALIZED_NAME_GBRAID = "gbraid";
  @SerializedName(SERIALIZED_NAME_GBRAID)
  private String gbraid;

  public static final String SERIALIZED_NAME_GCLID = "gclid";
  @SerializedName(SERIALIZED_NAME_GCLID)
  private String gclid;

  public static final String SERIALIZED_NAME_MSCLKID = "msclkid";
  @SerializedName(SERIALIZED_NAME_MSCLKID)
  private String msclkid;

  public static final String SERIALIZED_NAME_TTCLID = "ttclid";
  @SerializedName(SERIALIZED_NAME_TTCLID)
  private String ttclid;

  public static final String SERIALIZED_NAME_UC_MESSAGE_ID = "uc_message_id";
  @SerializedName(SERIALIZED_NAME_UC_MESSAGE_ID)
  private String ucMessageId;

  public static final String SERIALIZED_NAME_UTM_CAMPAIGN = "utm_campaign";
  @SerializedName(SERIALIZED_NAME_UTM_CAMPAIGN)
  private String utmCampaign;

  public static final String SERIALIZED_NAME_UTM_CONTENT = "utm_content";
  @SerializedName(SERIALIZED_NAME_UTM_CONTENT)
  private String utmContent;

  public static final String SERIALIZED_NAME_UTM_ID = "utm_id";
  @SerializedName(SERIALIZED_NAME_UTM_ID)
  private String utmId;

  public static final String SERIALIZED_NAME_UTM_MEDIUM = "utm_medium";
  @SerializedName(SERIALIZED_NAME_UTM_MEDIUM)
  private String utmMedium;

  public static final String SERIALIZED_NAME_UTM_SOURCE = "utm_source";
  @SerializedName(SERIALIZED_NAME_UTM_SOURCE)
  private String utmSource;

  public static final String SERIALIZED_NAME_UTM_TERM = "utm_term";
  @SerializedName(SERIALIZED_NAME_UTM_TERM)
  private String utmTerm;

  public static final String SERIALIZED_NAME_VMCID = "vmcid";
  @SerializedName(SERIALIZED_NAME_VMCID)
  private String vmcid;

  public static final String SERIALIZED_NAME_WBRAID = "wbraid";
  @SerializedName(SERIALIZED_NAME_WBRAID)
  private String wbraid;

  public HitSessionUtm() { 
  }

  public HitSessionUtm fbAdId(String fbAdId) {
    
    this.fbAdId = fbAdId;
    return this;
  }

   /**
   * Get fbAdId
   * @return fbAdId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFbAdId() {
    return fbAdId;
  }


  public void setFbAdId(String fbAdId) {
    this.fbAdId = fbAdId;
  }


  public HitSessionUtm fbclid(String fbclid) {
    
    this.fbclid = fbclid;
    return this;
  }

   /**
   * Get fbclid
   * @return fbclid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFbclid() {
    return fbclid;
  }


  public void setFbclid(String fbclid) {
    this.fbclid = fbclid;
  }


  public HitSessionUtm gbraid(String gbraid) {
    
    this.gbraid = gbraid;
    return this;
  }

   /**
   * Get gbraid
   * @return gbraid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGbraid() {
    return gbraid;
  }


  public void setGbraid(String gbraid) {
    this.gbraid = gbraid;
  }


  public HitSessionUtm gclid(String gclid) {
    
    this.gclid = gclid;
    return this;
  }

   /**
   * Get gclid
   * @return gclid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGclid() {
    return gclid;
  }


  public void setGclid(String gclid) {
    this.gclid = gclid;
  }


  public HitSessionUtm msclkid(String msclkid) {
    
    this.msclkid = msclkid;
    return this;
  }

   /**
   * Get msclkid
   * @return msclkid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMsclkid() {
    return msclkid;
  }


  public void setMsclkid(String msclkid) {
    this.msclkid = msclkid;
  }


  public HitSessionUtm ttclid(String ttclid) {
    
    this.ttclid = ttclid;
    return this;
  }

   /**
   * Get ttclid
   * @return ttclid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTtclid() {
    return ttclid;
  }


  public void setTtclid(String ttclid) {
    this.ttclid = ttclid;
  }


  public HitSessionUtm ucMessageId(String ucMessageId) {
    
    this.ucMessageId = ucMessageId;
    return this;
  }

   /**
   * Get ucMessageId
   * @return ucMessageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUcMessageId() {
    return ucMessageId;
  }


  public void setUcMessageId(String ucMessageId) {
    this.ucMessageId = ucMessageId;
  }


  public HitSessionUtm utmCampaign(String utmCampaign) {
    
    this.utmCampaign = utmCampaign;
    return this;
  }

   /**
   * Get utmCampaign
   * @return utmCampaign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUtmCampaign() {
    return utmCampaign;
  }


  public void setUtmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
  }


  public HitSessionUtm utmContent(String utmContent) {
    
    this.utmContent = utmContent;
    return this;
  }

   /**
   * Get utmContent
   * @return utmContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUtmContent() {
    return utmContent;
  }


  public void setUtmContent(String utmContent) {
    this.utmContent = utmContent;
  }


  public HitSessionUtm utmId(String utmId) {
    
    this.utmId = utmId;
    return this;
  }

   /**
   * Get utmId
   * @return utmId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUtmId() {
    return utmId;
  }


  public void setUtmId(String utmId) {
    this.utmId = utmId;
  }


  public HitSessionUtm utmMedium(String utmMedium) {
    
    this.utmMedium = utmMedium;
    return this;
  }

   /**
   * Get utmMedium
   * @return utmMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUtmMedium() {
    return utmMedium;
  }


  public void setUtmMedium(String utmMedium) {
    this.utmMedium = utmMedium;
  }


  public HitSessionUtm utmSource(String utmSource) {
    
    this.utmSource = utmSource;
    return this;
  }

   /**
   * Get utmSource
   * @return utmSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUtmSource() {
    return utmSource;
  }


  public void setUtmSource(String utmSource) {
    this.utmSource = utmSource;
  }


  public HitSessionUtm utmTerm(String utmTerm) {
    
    this.utmTerm = utmTerm;
    return this;
  }

   /**
   * Get utmTerm
   * @return utmTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUtmTerm() {
    return utmTerm;
  }


  public void setUtmTerm(String utmTerm) {
    this.utmTerm = utmTerm;
  }


  public HitSessionUtm vmcid(String vmcid) {
    
    this.vmcid = vmcid;
    return this;
  }

   /**
   * Get vmcid
   * @return vmcid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVmcid() {
    return vmcid;
  }


  public void setVmcid(String vmcid) {
    this.vmcid = vmcid;
  }


  public HitSessionUtm wbraid(String wbraid) {
    
    this.wbraid = wbraid;
    return this;
  }

   /**
   * Get wbraid
   * @return wbraid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWbraid() {
    return wbraid;
  }


  public void setWbraid(String wbraid) {
    this.wbraid = wbraid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HitSessionUtm hitSessionUtm = (HitSessionUtm) o;
    return Objects.equals(this.fbAdId, hitSessionUtm.fbAdId) &&
        Objects.equals(this.fbclid, hitSessionUtm.fbclid) &&
        Objects.equals(this.gbraid, hitSessionUtm.gbraid) &&
        Objects.equals(this.gclid, hitSessionUtm.gclid) &&
        Objects.equals(this.msclkid, hitSessionUtm.msclkid) &&
        Objects.equals(this.ttclid, hitSessionUtm.ttclid) &&
        Objects.equals(this.ucMessageId, hitSessionUtm.ucMessageId) &&
        Objects.equals(this.utmCampaign, hitSessionUtm.utmCampaign) &&
        Objects.equals(this.utmContent, hitSessionUtm.utmContent) &&
        Objects.equals(this.utmId, hitSessionUtm.utmId) &&
        Objects.equals(this.utmMedium, hitSessionUtm.utmMedium) &&
        Objects.equals(this.utmSource, hitSessionUtm.utmSource) &&
        Objects.equals(this.utmTerm, hitSessionUtm.utmTerm) &&
        Objects.equals(this.vmcid, hitSessionUtm.vmcid) &&
        Objects.equals(this.wbraid, hitSessionUtm.wbraid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fbAdId, fbclid, gbraid, gclid, msclkid, ttclid, ucMessageId, utmCampaign, utmContent, utmId, utmMedium, utmSource, utmTerm, vmcid, wbraid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HitSessionUtm {\n");
    sb.append("    fbAdId: ").append(toIndentedString(fbAdId)).append("\n");
    sb.append("    fbclid: ").append(toIndentedString(fbclid)).append("\n");
    sb.append("    gbraid: ").append(toIndentedString(gbraid)).append("\n");
    sb.append("    gclid: ").append(toIndentedString(gclid)).append("\n");
    sb.append("    msclkid: ").append(toIndentedString(msclkid)).append("\n");
    sb.append("    ttclid: ").append(toIndentedString(ttclid)).append("\n");
    sb.append("    ucMessageId: ").append(toIndentedString(ucMessageId)).append("\n");
    sb.append("    utmCampaign: ").append(toIndentedString(utmCampaign)).append("\n");
    sb.append("    utmContent: ").append(toIndentedString(utmContent)).append("\n");
    sb.append("    utmId: ").append(toIndentedString(utmId)).append("\n");
    sb.append("    utmMedium: ").append(toIndentedString(utmMedium)).append("\n");
    sb.append("    utmSource: ").append(toIndentedString(utmSource)).append("\n");
    sb.append("    utmTerm: ").append(toIndentedString(utmTerm)).append("\n");
    sb.append("    vmcid: ").append(toIndentedString(vmcid)).append("\n");
    sb.append("    wbraid: ").append(toIndentedString(wbraid)).append("\n");
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
    openapiFields.add("fb_ad_id");
    openapiFields.add("fbclid");
    openapiFields.add("gbraid");
    openapiFields.add("gclid");
    openapiFields.add("msclkid");
    openapiFields.add("ttclid");
    openapiFields.add("uc_message_id");
    openapiFields.add("utm_campaign");
    openapiFields.add("utm_content");
    openapiFields.add("utm_id");
    openapiFields.add("utm_medium");
    openapiFields.add("utm_source");
    openapiFields.add("utm_term");
    openapiFields.add("vmcid");
    openapiFields.add("wbraid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HitSessionUtm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (HitSessionUtm.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in HitSessionUtm is not found in the empty JSON string", HitSessionUtm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HitSessionUtm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HitSessionUtm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("fb_ad_id") != null && !jsonObj.get("fb_ad_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fb_ad_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fb_ad_id").toString()));
      }
      if (jsonObj.get("fbclid") != null && !jsonObj.get("fbclid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fbclid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fbclid").toString()));
      }
      if (jsonObj.get("gbraid") != null && !jsonObj.get("gbraid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gbraid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gbraid").toString()));
      }
      if (jsonObj.get("gclid") != null && !jsonObj.get("gclid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gclid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gclid").toString()));
      }
      if (jsonObj.get("msclkid") != null && !jsonObj.get("msclkid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msclkid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msclkid").toString()));
      }
      if (jsonObj.get("ttclid") != null && !jsonObj.get("ttclid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttclid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttclid").toString()));
      }
      if (jsonObj.get("uc_message_id") != null && !jsonObj.get("uc_message_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `uc_message_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("uc_message_id").toString()));
      }
      if (jsonObj.get("utm_campaign") != null && !jsonObj.get("utm_campaign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_campaign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_campaign").toString()));
      }
      if (jsonObj.get("utm_content") != null && !jsonObj.get("utm_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_content").toString()));
      }
      if (jsonObj.get("utm_id") != null && !jsonObj.get("utm_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_id").toString()));
      }
      if (jsonObj.get("utm_medium") != null && !jsonObj.get("utm_medium").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_medium` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_medium").toString()));
      }
      if (jsonObj.get("utm_source") != null && !jsonObj.get("utm_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_source").toString()));
      }
      if (jsonObj.get("utm_term") != null && !jsonObj.get("utm_term").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_term` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_term").toString()));
      }
      if (jsonObj.get("vmcid") != null && !jsonObj.get("vmcid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vmcid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vmcid").toString()));
      }
      if (jsonObj.get("wbraid") != null && !jsonObj.get("wbraid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wbraid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wbraid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HitSessionUtm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HitSessionUtm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HitSessionUtm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HitSessionUtm.class));

       return (TypeAdapter<T>) new TypeAdapter<HitSessionUtm>() {
           @Override
           public void write(JsonWriter out, HitSessionUtm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HitSessionUtm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HitSessionUtm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HitSessionUtm
  * @throws IOException if the JSON string is invalid with respect to HitSessionUtm
  */
  public static HitSessionUtm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HitSessionUtm.class);
  }

 /**
  * Convert an instance of HitSessionUtm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

