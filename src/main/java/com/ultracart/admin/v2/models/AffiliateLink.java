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

/**
 * AffiliateLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class AffiliateLink {
  @SerializedName("affiliate_link_oid")
  private Integer affiliateLinkOid = null;

  @SerializedName("affiliate_managed_link_oid")
  private Integer affiliateManagedLinkOid = null;

  @SerializedName("affiliate_oid")
  private Integer affiliateOid = null;

  @SerializedName("affiliate_program_item_oid")
  private Integer affiliateProgramItemOid = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("creative_oid")
  private Integer creativeOid = null;

  @SerializedName("custom_html")
  private String customHtml = null;

  /**
   * Approved status of the custom html
   */
  @JsonAdapter(CustomHtmlApprovalStatusEnum.Adapter.class)
  public enum CustomHtmlApprovalStatusEnum {
    PENDING("Pending"),
    
    APPROVED("Approved"),
    
    REJECTED("Rejected");

    private String value;

    CustomHtmlApprovalStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CustomHtmlApprovalStatusEnum fromValue(String text) {
      for (CustomHtmlApprovalStatusEnum b : CustomHtmlApprovalStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CustomHtmlApprovalStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CustomHtmlApprovalStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CustomHtmlApprovalStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CustomHtmlApprovalStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("custom_html_approval_status")
  private CustomHtmlApprovalStatusEnum customHtmlApprovalStatus = null;

  @SerializedName("custom_landing_url")
  private String customLandingUrl = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  /**
   * Invisible link approval status
   */
  @JsonAdapter(InvisibleLinkApprovalStatusEnum.Adapter.class)
  public enum InvisibleLinkApprovalStatusEnum {
    PENDING("Pending"),
    
    APPROVED("Approved"),
    
    REJECTED("Rejected");

    private String value;

    InvisibleLinkApprovalStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InvisibleLinkApprovalStatusEnum fromValue(String text) {
      for (InvisibleLinkApprovalStatusEnum b : InvisibleLinkApprovalStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InvisibleLinkApprovalStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InvisibleLinkApprovalStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InvisibleLinkApprovalStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InvisibleLinkApprovalStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("invisible_link_approval_status")
  private InvisibleLinkApprovalStatusEnum invisibleLinkApprovalStatus = null;

  @SerializedName("invisible_link_url_prefix")
  private String invisibleLinkUrlPrefix = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Type of link
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    IMAGE("image"),
    
    TEXT("text"),
    
    INVISIBLE("invisible"),
    
    DIRECT("direct");

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

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public AffiliateLink affiliateLinkOid(Integer affiliateLinkOid) {
    this.affiliateLinkOid = affiliateLinkOid;
    return this;
  }

   /**
   * Unique object identifier associated with this link
   * @return affiliateLinkOid
  **/
  @ApiModelProperty(value = "Unique object identifier associated with this link")
  public Integer getAffiliateLinkOid() {
    return affiliateLinkOid;
  }

  public void setAffiliateLinkOid(Integer affiliateLinkOid) {
    this.affiliateLinkOid = affiliateLinkOid;
  }

  public AffiliateLink affiliateManagedLinkOid(Integer affiliateManagedLinkOid) {
    this.affiliateManagedLinkOid = affiliateManagedLinkOid;
    return this;
  }

   /**
   * Managed link OID that this link object was generated from
   * @return affiliateManagedLinkOid
  **/
  @ApiModelProperty(value = "Managed link OID that this link object was generated from")
  public Integer getAffiliateManagedLinkOid() {
    return affiliateManagedLinkOid;
  }

  public void setAffiliateManagedLinkOid(Integer affiliateManagedLinkOid) {
    this.affiliateManagedLinkOid = affiliateManagedLinkOid;
  }

  public AffiliateLink affiliateOid(Integer affiliateOid) {
    this.affiliateOid = affiliateOid;
    return this;
  }

   /**
   * Affiliate object ID associated with this link
   * @return affiliateOid
  **/
  @ApiModelProperty(value = "Affiliate object ID associated with this link")
  public Integer getAffiliateOid() {
    return affiliateOid;
  }

  public void setAffiliateOid(Integer affiliateOid) {
    this.affiliateOid = affiliateOid;
  }

  public AffiliateLink affiliateProgramItemOid(Integer affiliateProgramItemOid) {
    this.affiliateProgramItemOid = affiliateProgramItemOid;
    return this;
  }

   /**
   * The affiliate program item this managed link is associated with
   * @return affiliateProgramItemOid
  **/
  @ApiModelProperty(value = "The affiliate program item this managed link is associated with")
  public Integer getAffiliateProgramItemOid() {
    return affiliateProgramItemOid;
  }

  public void setAffiliateProgramItemOid(Integer affiliateProgramItemOid) {
    this.affiliateProgramItemOid = affiliateProgramItemOid;
  }

  public AffiliateLink code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code associated with the link
   * @return code
  **/
  @ApiModelProperty(value = "Code associated with the link")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AffiliateLink creativeOid(Integer creativeOid) {
    this.creativeOid = creativeOid;
    return this;
  }

   /**
   * Creative (image or text) associated with this link
   * @return creativeOid
  **/
  @ApiModelProperty(value = "Creative (image or text) associated with this link")
  public Integer getCreativeOid() {
    return creativeOid;
  }

  public void setCreativeOid(Integer creativeOid) {
    this.creativeOid = creativeOid;
  }

  public AffiliateLink customHtml(String customHtml) {
    this.customHtml = customHtml;
    return this;
  }

   /**
   * Custom HTML associated with this link
   * @return customHtml
  **/
  @ApiModelProperty(value = "Custom HTML associated with this link")
  public String getCustomHtml() {
    return customHtml;
  }

  public void setCustomHtml(String customHtml) {
    this.customHtml = customHtml;
  }

  public AffiliateLink customHtmlApprovalStatus(CustomHtmlApprovalStatusEnum customHtmlApprovalStatus) {
    this.customHtmlApprovalStatus = customHtmlApprovalStatus;
    return this;
  }

   /**
   * Approved status of the custom html
   * @return customHtmlApprovalStatus
  **/
  @ApiModelProperty(value = "Approved status of the custom html")
  public CustomHtmlApprovalStatusEnum getCustomHtmlApprovalStatus() {
    return customHtmlApprovalStatus;
  }

  public void setCustomHtmlApprovalStatus(CustomHtmlApprovalStatusEnum customHtmlApprovalStatus) {
    this.customHtmlApprovalStatus = customHtmlApprovalStatus;
  }

  public AffiliateLink customLandingUrl(String customLandingUrl) {
    this.customLandingUrl = customLandingUrl;
    return this;
  }

   /**
   * Custom landing page URL if configured
   * @return customLandingUrl
  **/
  @ApiModelProperty(value = "Custom landing page URL if configured")
  public String getCustomLandingUrl() {
    return customLandingUrl;
  }

  public void setCustomLandingUrl(String customLandingUrl) {
    this.customLandingUrl = customLandingUrl;
  }

  public AffiliateLink deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * True if the link has been deleted
   * @return deleted
  **/
  @ApiModelProperty(value = "True if the link has been deleted")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public AffiliateLink invisibleLinkApprovalStatus(InvisibleLinkApprovalStatusEnum invisibleLinkApprovalStatus) {
    this.invisibleLinkApprovalStatus = invisibleLinkApprovalStatus;
    return this;
  }

   /**
   * Invisible link approval status
   * @return invisibleLinkApprovalStatus
  **/
  @ApiModelProperty(value = "Invisible link approval status")
  public InvisibleLinkApprovalStatusEnum getInvisibleLinkApprovalStatus() {
    return invisibleLinkApprovalStatus;
  }

  public void setInvisibleLinkApprovalStatus(InvisibleLinkApprovalStatusEnum invisibleLinkApprovalStatus) {
    this.invisibleLinkApprovalStatus = invisibleLinkApprovalStatus;
  }

  public AffiliateLink invisibleLinkUrlPrefix(String invisibleLinkUrlPrefix) {
    this.invisibleLinkUrlPrefix = invisibleLinkUrlPrefix;
    return this;
  }

   /**
   * Invisible link URL prefix
   * @return invisibleLinkUrlPrefix
  **/
  @ApiModelProperty(value = "Invisible link URL prefix")
  public String getInvisibleLinkUrlPrefix() {
    return invisibleLinkUrlPrefix;
  }

  public void setInvisibleLinkUrlPrefix(String invisibleLinkUrlPrefix) {
    this.invisibleLinkUrlPrefix = invisibleLinkUrlPrefix;
  }

  public AffiliateLink name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the link
   * @return name
  **/
  @ApiModelProperty(value = "Name of the link")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AffiliateLink type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of link
   * @return type
  **/
  @ApiModelProperty(value = "Type of link")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffiliateLink affiliateLink = (AffiliateLink) o;
    return Objects.equals(this.affiliateLinkOid, affiliateLink.affiliateLinkOid) &&
        Objects.equals(this.affiliateManagedLinkOid, affiliateLink.affiliateManagedLinkOid) &&
        Objects.equals(this.affiliateOid, affiliateLink.affiliateOid) &&
        Objects.equals(this.affiliateProgramItemOid, affiliateLink.affiliateProgramItemOid) &&
        Objects.equals(this.code, affiliateLink.code) &&
        Objects.equals(this.creativeOid, affiliateLink.creativeOid) &&
        Objects.equals(this.customHtml, affiliateLink.customHtml) &&
        Objects.equals(this.customHtmlApprovalStatus, affiliateLink.customHtmlApprovalStatus) &&
        Objects.equals(this.customLandingUrl, affiliateLink.customLandingUrl) &&
        Objects.equals(this.deleted, affiliateLink.deleted) &&
        Objects.equals(this.invisibleLinkApprovalStatus, affiliateLink.invisibleLinkApprovalStatus) &&
        Objects.equals(this.invisibleLinkUrlPrefix, affiliateLink.invisibleLinkUrlPrefix) &&
        Objects.equals(this.name, affiliateLink.name) &&
        Objects.equals(this.type, affiliateLink.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affiliateLinkOid, affiliateManagedLinkOid, affiliateOid, affiliateProgramItemOid, code, creativeOid, customHtml, customHtmlApprovalStatus, customLandingUrl, deleted, invisibleLinkApprovalStatus, invisibleLinkUrlPrefix, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffiliateLink {\n");
    
    sb.append("    affiliateLinkOid: ").append(toIndentedString(affiliateLinkOid)).append("\n");
    sb.append("    affiliateManagedLinkOid: ").append(toIndentedString(affiliateManagedLinkOid)).append("\n");
    sb.append("    affiliateOid: ").append(toIndentedString(affiliateOid)).append("\n");
    sb.append("    affiliateProgramItemOid: ").append(toIndentedString(affiliateProgramItemOid)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    creativeOid: ").append(toIndentedString(creativeOid)).append("\n");
    sb.append("    customHtml: ").append(toIndentedString(customHtml)).append("\n");
    sb.append("    customHtmlApprovalStatus: ").append(toIndentedString(customHtmlApprovalStatus)).append("\n");
    sb.append("    customLandingUrl: ").append(toIndentedString(customLandingUrl)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    invisibleLinkApprovalStatus: ").append(toIndentedString(invisibleLinkApprovalStatus)).append("\n");
    sb.append("    invisibleLinkUrlPrefix: ").append(toIndentedString(invisibleLinkUrlPrefix)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

