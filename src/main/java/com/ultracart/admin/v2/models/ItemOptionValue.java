/*
 * UltraCart Rest API V2
 * This is the next generation UltraCart REST API...
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ultracart.admin.v2.models.Distance;
import com.ultracart.admin.v2.models.ItemOptionValueAdditionalItem;
import com.ultracart.admin.v2.models.ItemOptionValueDigitalItem;
import com.ultracart.admin.v2.models.Weight;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemOptionValue
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class ItemOptionValue {
  /**
   * Additional dimensions application
   */
  @JsonAdapter(AdditionalDimensionApplicationEnum.Adapter.class)
  public enum AdditionalDimensionApplicationEnum {
    NONE("none"),
    
    SET_ITEM_TO("set item to"),
    
    ADD_ITEM("add item");

    private String value;

    AdditionalDimensionApplicationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AdditionalDimensionApplicationEnum fromValue(String text) {
      for (AdditionalDimensionApplicationEnum b : AdditionalDimensionApplicationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AdditionalDimensionApplicationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AdditionalDimensionApplicationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AdditionalDimensionApplicationEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AdditionalDimensionApplicationEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("additional_dimension_application")
  private AdditionalDimensionApplicationEnum additionalDimensionApplication = null;

  @SerializedName("additional_items")
  private List<ItemOptionValueAdditionalItem> additionalItems = null;

  @SerializedName("cost_change")
  private BigDecimal costChange = null;

  @SerializedName("default_value")
  private Boolean defaultValue = null;

  @SerializedName("digital_items")
  private List<ItemOptionValueDigitalItem> digitalItems = null;

  @SerializedName("height")
  private Distance height = null;

  @SerializedName("length")
  private Distance length = null;

  @SerializedName("merchant_item_multimedia_oid")
  private Integer merchantItemMultimediaOid = null;

  @SerializedName("option_value_oid")
  private Integer optionValueOid = null;

  @SerializedName("percent_cost_change")
  private BigDecimal percentCostChange = null;

  @SerializedName("translated_text_instance_oid")
  private Integer translatedTextInstanceOid = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("weight_change")
  private Weight weightChange = null;

  @SerializedName("weight_change_percent")
  private BigDecimal weightChangePercent = null;

  @SerializedName("width")
  private Distance width = null;

  public ItemOptionValue additionalDimensionApplication(AdditionalDimensionApplicationEnum additionalDimensionApplication) {
    this.additionalDimensionApplication = additionalDimensionApplication;
    return this;
  }

   /**
   * Additional dimensions application
   * @return additionalDimensionApplication
  **/
  @ApiModelProperty(value = "Additional dimensions application")
  public AdditionalDimensionApplicationEnum getAdditionalDimensionApplication() {
    return additionalDimensionApplication;
  }

  public void setAdditionalDimensionApplication(AdditionalDimensionApplicationEnum additionalDimensionApplication) {
    this.additionalDimensionApplication = additionalDimensionApplication;
  }

  public ItemOptionValue additionalItems(List<ItemOptionValueAdditionalItem> additionalItems) {
    this.additionalItems = additionalItems;
    return this;
  }

  public ItemOptionValue addAdditionalItemsItem(ItemOptionValueAdditionalItem additionalItemsItem) {
    if (this.additionalItems == null) {
      this.additionalItems = new ArrayList<ItemOptionValueAdditionalItem>();
    }
    this.additionalItems.add(additionalItemsItem);
    return this;
  }

   /**
   * Additional items to add to the order if this value is selected
   * @return additionalItems
  **/
  @ApiModelProperty(value = "Additional items to add to the order if this value is selected")
  public List<ItemOptionValueAdditionalItem> getAdditionalItems() {
    return additionalItems;
  }

  public void setAdditionalItems(List<ItemOptionValueAdditionalItem> additionalItems) {
    this.additionalItems = additionalItems;
  }

  public ItemOptionValue costChange(BigDecimal costChange) {
    this.costChange = costChange;
    return this;
  }

   /**
   * Cost change
   * @return costChange
  **/
  @ApiModelProperty(value = "Cost change")
  public BigDecimal getCostChange() {
    return costChange;
  }

  public void setCostChange(BigDecimal costChange) {
    this.costChange = costChange;
  }

  public ItemOptionValue defaultValue(Boolean defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * True if default value
   * @return defaultValue
  **/
  @ApiModelProperty(value = "True if default value")
  public Boolean isDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Boolean defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ItemOptionValue digitalItems(List<ItemOptionValueDigitalItem> digitalItems) {
    this.digitalItems = digitalItems;
    return this;
  }

  public ItemOptionValue addDigitalItemsItem(ItemOptionValueDigitalItem digitalItemsItem) {
    if (this.digitalItems == null) {
      this.digitalItems = new ArrayList<ItemOptionValueDigitalItem>();
    }
    this.digitalItems.add(digitalItemsItem);
    return this;
  }

   /**
   * Digital items to allow the customer to download if this option value is selected
   * @return digitalItems
  **/
  @ApiModelProperty(value = "Digital items to allow the customer to download if this option value is selected")
  public List<ItemOptionValueDigitalItem> getDigitalItems() {
    return digitalItems;
  }

  public void setDigitalItems(List<ItemOptionValueDigitalItem> digitalItems) {
    this.digitalItems = digitalItems;
  }

  public ItemOptionValue height(Distance height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Distance getHeight() {
    return height;
  }

  public void setHeight(Distance height) {
    this.height = height;
  }

  public ItemOptionValue length(Distance length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Distance getLength() {
    return length;
  }

  public void setLength(Distance length) {
    this.length = length;
  }

  public ItemOptionValue merchantItemMultimediaOid(Integer merchantItemMultimediaOid) {
    this.merchantItemMultimediaOid = merchantItemMultimediaOid;
    return this;
  }

   /**
   * Multimedia object identifier associated with this option value
   * @return merchantItemMultimediaOid
  **/
  @ApiModelProperty(value = "Multimedia object identifier associated with this option value")
  public Integer getMerchantItemMultimediaOid() {
    return merchantItemMultimediaOid;
  }

  public void setMerchantItemMultimediaOid(Integer merchantItemMultimediaOid) {
    this.merchantItemMultimediaOid = merchantItemMultimediaOid;
  }

  public ItemOptionValue optionValueOid(Integer optionValueOid) {
    this.optionValueOid = optionValueOid;
    return this;
  }

   /**
   * Option value object identifier
   * @return optionValueOid
  **/
  @ApiModelProperty(value = "Option value object identifier")
  public Integer getOptionValueOid() {
    return optionValueOid;
  }

  public void setOptionValueOid(Integer optionValueOid) {
    this.optionValueOid = optionValueOid;
  }

  public ItemOptionValue percentCostChange(BigDecimal percentCostChange) {
    this.percentCostChange = percentCostChange;
    return this;
  }

   /**
   * Percentage cost change
   * @return percentCostChange
  **/
  @ApiModelProperty(value = "Percentage cost change")
  public BigDecimal getPercentCostChange() {
    return percentCostChange;
  }

  public void setPercentCostChange(BigDecimal percentCostChange) {
    this.percentCostChange = percentCostChange;
  }

  public ItemOptionValue translatedTextInstanceOid(Integer translatedTextInstanceOid) {
    this.translatedTextInstanceOid = translatedTextInstanceOid;
    return this;
  }

   /**
   * Translated text instance id
   * @return translatedTextInstanceOid
  **/
  @ApiModelProperty(value = "Translated text instance id")
  public Integer getTranslatedTextInstanceOid() {
    return translatedTextInstanceOid;
  }

  public void setTranslatedTextInstanceOid(Integer translatedTextInstanceOid) {
    this.translatedTextInstanceOid = translatedTextInstanceOid;
  }

  public ItemOptionValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  @ApiModelProperty(value = "Value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ItemOptionValue weightChange(Weight weightChange) {
    this.weightChange = weightChange;
    return this;
  }

   /**
   * Get weightChange
   * @return weightChange
  **/
  @ApiModelProperty(value = "")
  public Weight getWeightChange() {
    return weightChange;
  }

  public void setWeightChange(Weight weightChange) {
    this.weightChange = weightChange;
  }

  public ItemOptionValue weightChangePercent(BigDecimal weightChangePercent) {
    this.weightChangePercent = weightChangePercent;
    return this;
  }

   /**
   * Percentage weight change
   * @return weightChangePercent
  **/
  @ApiModelProperty(value = "Percentage weight change")
  public BigDecimal getWeightChangePercent() {
    return weightChangePercent;
  }

  public void setWeightChangePercent(BigDecimal weightChangePercent) {
    this.weightChangePercent = weightChangePercent;
  }

  public ItemOptionValue width(Distance width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Distance getWidth() {
    return width;
  }

  public void setWidth(Distance width) {
    this.width = width;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemOptionValue itemOptionValue = (ItemOptionValue) o;
    return Objects.equals(this.additionalDimensionApplication, itemOptionValue.additionalDimensionApplication) &&
        Objects.equals(this.additionalItems, itemOptionValue.additionalItems) &&
        Objects.equals(this.costChange, itemOptionValue.costChange) &&
        Objects.equals(this.defaultValue, itemOptionValue.defaultValue) &&
        Objects.equals(this.digitalItems, itemOptionValue.digitalItems) &&
        Objects.equals(this.height, itemOptionValue.height) &&
        Objects.equals(this.length, itemOptionValue.length) &&
        Objects.equals(this.merchantItemMultimediaOid, itemOptionValue.merchantItemMultimediaOid) &&
        Objects.equals(this.optionValueOid, itemOptionValue.optionValueOid) &&
        Objects.equals(this.percentCostChange, itemOptionValue.percentCostChange) &&
        Objects.equals(this.translatedTextInstanceOid, itemOptionValue.translatedTextInstanceOid) &&
        Objects.equals(this.value, itemOptionValue.value) &&
        Objects.equals(this.weightChange, itemOptionValue.weightChange) &&
        Objects.equals(this.weightChangePercent, itemOptionValue.weightChangePercent) &&
        Objects.equals(this.width, itemOptionValue.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalDimensionApplication, additionalItems, costChange, defaultValue, digitalItems, height, length, merchantItemMultimediaOid, optionValueOid, percentCostChange, translatedTextInstanceOid, value, weightChange, weightChangePercent, width);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemOptionValue {\n");
    
    sb.append("    additionalDimensionApplication: ").append(toIndentedString(additionalDimensionApplication)).append("\n");
    sb.append("    additionalItems: ").append(toIndentedString(additionalItems)).append("\n");
    sb.append("    costChange: ").append(toIndentedString(costChange)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    digitalItems: ").append(toIndentedString(digitalItems)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    merchantItemMultimediaOid: ").append(toIndentedString(merchantItemMultimediaOid)).append("\n");
    sb.append("    optionValueOid: ").append(toIndentedString(optionValueOid)).append("\n");
    sb.append("    percentCostChange: ").append(toIndentedString(percentCostChange)).append("\n");
    sb.append("    translatedTextInstanceOid: ").append(toIndentedString(translatedTextInstanceOid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    weightChange: ").append(toIndentedString(weightChange)).append("\n");
    sb.append("    weightChangePercent: ").append(toIndentedString(weightChangePercent)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
