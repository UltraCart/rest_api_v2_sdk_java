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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ScreenRecordingFilterValuesEventParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-12-15T16:13:40.363-05:00")



public class ScreenRecordingFilterValuesEventParams {
  @SerializedName("name")
  private String name = null;

  @SerializedName("values_bd")
  private List<BigDecimal> valuesBd = null;

  @SerializedName("values_bool")
  private List<Boolean> valuesBool = null;

  @SerializedName("values_num")
  private List<Integer> valuesNum = null;

  @SerializedName("values_text")
  private List<String> valuesText = null;

  public ScreenRecordingFilterValuesEventParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScreenRecordingFilterValuesEventParams valuesBd(List<BigDecimal> valuesBd) {
    this.valuesBd = valuesBd;
    return this;
  }

  public ScreenRecordingFilterValuesEventParams addValuesBdItem(BigDecimal valuesBdItem) {
    if (this.valuesBd == null) {
      this.valuesBd = new ArrayList<BigDecimal>();
    }
    this.valuesBd.add(valuesBdItem);
    return this;
  }

   /**
   * Get valuesBd
   * @return valuesBd
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getValuesBd() {
    return valuesBd;
  }

  public void setValuesBd(List<BigDecimal> valuesBd) {
    this.valuesBd = valuesBd;
  }

  public ScreenRecordingFilterValuesEventParams valuesBool(List<Boolean> valuesBool) {
    this.valuesBool = valuesBool;
    return this;
  }

  public ScreenRecordingFilterValuesEventParams addValuesBoolItem(Boolean valuesBoolItem) {
    if (this.valuesBool == null) {
      this.valuesBool = new ArrayList<Boolean>();
    }
    this.valuesBool.add(valuesBoolItem);
    return this;
  }

   /**
   * Get valuesBool
   * @return valuesBool
  **/
  @ApiModelProperty(value = "")
  public List<Boolean> getValuesBool() {
    return valuesBool;
  }

  public void setValuesBool(List<Boolean> valuesBool) {
    this.valuesBool = valuesBool;
  }

  public ScreenRecordingFilterValuesEventParams valuesNum(List<Integer> valuesNum) {
    this.valuesNum = valuesNum;
    return this;
  }

  public ScreenRecordingFilterValuesEventParams addValuesNumItem(Integer valuesNumItem) {
    if (this.valuesNum == null) {
      this.valuesNum = new ArrayList<Integer>();
    }
    this.valuesNum.add(valuesNumItem);
    return this;
  }

   /**
   * Get valuesNum
   * @return valuesNum
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getValuesNum() {
    return valuesNum;
  }

  public void setValuesNum(List<Integer> valuesNum) {
    this.valuesNum = valuesNum;
  }

  public ScreenRecordingFilterValuesEventParams valuesText(List<String> valuesText) {
    this.valuesText = valuesText;
    return this;
  }

  public ScreenRecordingFilterValuesEventParams addValuesTextItem(String valuesTextItem) {
    if (this.valuesText == null) {
      this.valuesText = new ArrayList<String>();
    }
    this.valuesText.add(valuesTextItem);
    return this;
  }

   /**
   * Get valuesText
   * @return valuesText
  **/
  @ApiModelProperty(value = "")
  public List<String> getValuesText() {
    return valuesText;
  }

  public void setValuesText(List<String> valuesText) {
    this.valuesText = valuesText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenRecordingFilterValuesEventParams screenRecordingFilterValuesEventParams = (ScreenRecordingFilterValuesEventParams) o;
    return Objects.equals(this.name, screenRecordingFilterValuesEventParams.name) &&
        Objects.equals(this.valuesBd, screenRecordingFilterValuesEventParams.valuesBd) &&
        Objects.equals(this.valuesBool, screenRecordingFilterValuesEventParams.valuesBool) &&
        Objects.equals(this.valuesNum, screenRecordingFilterValuesEventParams.valuesNum) &&
        Objects.equals(this.valuesText, screenRecordingFilterValuesEventParams.valuesText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, valuesBd, valuesBool, valuesNum, valuesText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenRecordingFilterValuesEventParams {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valuesBd: ").append(toIndentedString(valuesBd)).append("\n");
    sb.append("    valuesBool: ").append(toIndentedString(valuesBool)).append("\n");
    sb.append("    valuesNum: ").append(toIndentedString(valuesNum)).append("\n");
    sb.append("    valuesText: ").append(toIndentedString(valuesText)).append("\n");
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

