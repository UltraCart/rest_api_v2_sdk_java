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
import com.ultracart.admin.v2.models.ItemAutoOrderStepArbitraryUnitCostSchedule;
import com.ultracart.admin.v2.models.ItemAutoOrderStepGrandfatherPricing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemAutoOrderStep
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class ItemAutoOrderStep {
  @SerializedName("arbitrary_schedule_days")
  private Integer arbitraryScheduleDays = null;

  @SerializedName("arbitrary_unit_cost")
  private BigDecimal arbitraryUnitCost = null;

  @SerializedName("arbitrary_unit_cost_schedules")
  private List<ItemAutoOrderStepArbitraryUnitCostSchedule> arbitraryUnitCostSchedules = null;

  @SerializedName("grandfather_pricing")
  private List<ItemAutoOrderStepGrandfatherPricing> grandfatherPricing = null;

  @SerializedName("managed_by")
  private String managedBy = null;

  @SerializedName("pause_days")
  private Integer pauseDays = null;

  @SerializedName("pause_until_date")
  private String pauseUntilDate = null;

  @SerializedName("preshipment_notice_days")
  private Integer preshipmentNoticeDays = null;

  @SerializedName("recurring_merchant_item_id")
  private String recurringMerchantItemId = null;

  @SerializedName("recurring_merchant_item_oid")
  private Integer recurringMerchantItemOid = null;

  @SerializedName("repeat_count")
  private Integer repeatCount = null;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("subscribe_email_list_name")
  private String subscribeEmailListName = null;

  @SerializedName("subscribe_email_list_oid")
  private Integer subscribeEmailListOid = null;

  /**
   * Type of step (item or pause)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ITEM("item"),
    
    PAUSE("pause");

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

  public ItemAutoOrderStep arbitraryScheduleDays(Integer arbitraryScheduleDays) {
    this.arbitraryScheduleDays = arbitraryScheduleDays;
    return this;
  }

   /**
   * If the schedule is arbitrary, then this is the number of days
   * @return arbitraryScheduleDays
  **/
  @ApiModelProperty(value = "If the schedule is arbitrary, then this is the number of days")
  public Integer getArbitraryScheduleDays() {
    return arbitraryScheduleDays;
  }

  public void setArbitraryScheduleDays(Integer arbitraryScheduleDays) {
    this.arbitraryScheduleDays = arbitraryScheduleDays;
  }

  public ItemAutoOrderStep arbitraryUnitCost(BigDecimal arbitraryUnitCost) {
    this.arbitraryUnitCost = arbitraryUnitCost;
    return this;
  }

   /**
   * Arbitrary unit cost used to override the regular item cost
   * @return arbitraryUnitCost
  **/
  @ApiModelProperty(value = "Arbitrary unit cost used to override the regular item cost")
  public BigDecimal getArbitraryUnitCost() {
    return arbitraryUnitCost;
  }

  public void setArbitraryUnitCost(BigDecimal arbitraryUnitCost) {
    this.arbitraryUnitCost = arbitraryUnitCost;
  }

  public ItemAutoOrderStep arbitraryUnitCostSchedules(List<ItemAutoOrderStepArbitraryUnitCostSchedule> arbitraryUnitCostSchedules) {
    this.arbitraryUnitCostSchedules = arbitraryUnitCostSchedules;
    return this;
  }

  public ItemAutoOrderStep addArbitraryUnitCostSchedulesItem(ItemAutoOrderStepArbitraryUnitCostSchedule arbitraryUnitCostSchedulesItem) {
    if (this.arbitraryUnitCostSchedules == null) {
      this.arbitraryUnitCostSchedules = new ArrayList<ItemAutoOrderStepArbitraryUnitCostSchedule>();
    }
    this.arbitraryUnitCostSchedules.add(arbitraryUnitCostSchedulesItem);
    return this;
  }

   /**
   * Arbitrary unit costs schedules for more advanced discounting by rebill attempt
   * @return arbitraryUnitCostSchedules
  **/
  @ApiModelProperty(value = "Arbitrary unit costs schedules for more advanced discounting by rebill attempt")
  public List<ItemAutoOrderStepArbitraryUnitCostSchedule> getArbitraryUnitCostSchedules() {
    return arbitraryUnitCostSchedules;
  }

  public void setArbitraryUnitCostSchedules(List<ItemAutoOrderStepArbitraryUnitCostSchedule> arbitraryUnitCostSchedules) {
    this.arbitraryUnitCostSchedules = arbitraryUnitCostSchedules;
  }

  public ItemAutoOrderStep grandfatherPricing(List<ItemAutoOrderStepGrandfatherPricing> grandfatherPricing) {
    this.grandfatherPricing = grandfatherPricing;
    return this;
  }

  public ItemAutoOrderStep addGrandfatherPricingItem(ItemAutoOrderStepGrandfatherPricing grandfatherPricingItem) {
    if (this.grandfatherPricing == null) {
      this.grandfatherPricing = new ArrayList<ItemAutoOrderStepGrandfatherPricing>();
    }
    this.grandfatherPricing.add(grandfatherPricingItem);
    return this;
  }

   /**
   * Grand-father pricing configuration if the rebill schedule has changed over time
   * @return grandfatherPricing
  **/
  @ApiModelProperty(value = "Grand-father pricing configuration if the rebill schedule has changed over time")
  public List<ItemAutoOrderStepGrandfatherPricing> getGrandfatherPricing() {
    return grandfatherPricing;
  }

  public void setGrandfatherPricing(List<ItemAutoOrderStepGrandfatherPricing> grandfatherPricing) {
    this.grandfatherPricing = grandfatherPricing;
  }

  public ItemAutoOrderStep managedBy(String managedBy) {
    this.managedBy = managedBy;
    return this;
  }

   /**
   * Managed by (defaults to UltraCart)
   * @return managedBy
  **/
  @ApiModelProperty(value = "Managed by (defaults to UltraCart)")
  public String getManagedBy() {
    return managedBy;
  }

  public void setManagedBy(String managedBy) {
    this.managedBy = managedBy;
  }

  public ItemAutoOrderStep pauseDays(Integer pauseDays) {
    this.pauseDays = pauseDays;
    return this;
  }

   /**
   * Number of days to pause
   * @return pauseDays
  **/
  @ApiModelProperty(value = "Number of days to pause")
  public Integer getPauseDays() {
    return pauseDays;
  }

  public void setPauseDays(Integer pauseDays) {
    this.pauseDays = pauseDays;
  }

  public ItemAutoOrderStep pauseUntilDate(String pauseUntilDate) {
    this.pauseUntilDate = pauseUntilDate;
    return this;
  }

   /**
   * Wait for this step to happen until the specified date
   * @return pauseUntilDate
  **/
  @ApiModelProperty(value = "Wait for this step to happen until the specified date")
  public String getPauseUntilDate() {
    return pauseUntilDate;
  }

  public void setPauseUntilDate(String pauseUntilDate) {
    this.pauseUntilDate = pauseUntilDate;
  }

  public ItemAutoOrderStep preshipmentNoticeDays(Integer preshipmentNoticeDays) {
    this.preshipmentNoticeDays = preshipmentNoticeDays;
    return this;
  }

   /**
   * If set, a pre-shipment notice is sent to the customer this many days in advance
   * @return preshipmentNoticeDays
  **/
  @ApiModelProperty(value = "If set, a pre-shipment notice is sent to the customer this many days in advance")
  public Integer getPreshipmentNoticeDays() {
    return preshipmentNoticeDays;
  }

  public void setPreshipmentNoticeDays(Integer preshipmentNoticeDays) {
    this.preshipmentNoticeDays = preshipmentNoticeDays;
  }

  public ItemAutoOrderStep recurringMerchantItemId(String recurringMerchantItemId) {
    this.recurringMerchantItemId = recurringMerchantItemId;
    return this;
  }

   /**
   * Item id to rebill
   * @return recurringMerchantItemId
  **/
  @ApiModelProperty(value = "Item id to rebill")
  public String getRecurringMerchantItemId() {
    return recurringMerchantItemId;
  }

  public void setRecurringMerchantItemId(String recurringMerchantItemId) {
    this.recurringMerchantItemId = recurringMerchantItemId;
  }

  public ItemAutoOrderStep recurringMerchantItemOid(Integer recurringMerchantItemOid) {
    this.recurringMerchantItemOid = recurringMerchantItemOid;
    return this;
  }

   /**
   * Item object identifier to rebill
   * @return recurringMerchantItemOid
  **/
  @ApiModelProperty(value = "Item object identifier to rebill")
  public Integer getRecurringMerchantItemOid() {
    return recurringMerchantItemOid;
  }

  public void setRecurringMerchantItemOid(Integer recurringMerchantItemOid) {
    this.recurringMerchantItemOid = recurringMerchantItemOid;
  }

  public ItemAutoOrderStep repeatCount(Integer repeatCount) {
    this.repeatCount = repeatCount;
    return this;
  }

   /**
   * Number of times to rebill.  Last step can be null for infinite
   * @return repeatCount
  **/
  @ApiModelProperty(value = "Number of times to rebill.  Last step can be null for infinite")
  public Integer getRepeatCount() {
    return repeatCount;
  }

  public void setRepeatCount(Integer repeatCount) {
    this.repeatCount = repeatCount;
  }

  public ItemAutoOrderStep schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * Frequency of the rebill
   * @return schedule
  **/
  @ApiModelProperty(value = "Frequency of the rebill")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public ItemAutoOrderStep subscribeEmailListName(String subscribeEmailListName) {
    this.subscribeEmailListName = subscribeEmailListName;
    return this;
  }

   /**
   * Email list name to subscribe the customer to when the rebill occurs
   * @return subscribeEmailListName
  **/
  @ApiModelProperty(value = "Email list name to subscribe the customer to when the rebill occurs")
  public String getSubscribeEmailListName() {
    return subscribeEmailListName;
  }

  public void setSubscribeEmailListName(String subscribeEmailListName) {
    this.subscribeEmailListName = subscribeEmailListName;
  }

  public ItemAutoOrderStep subscribeEmailListOid(Integer subscribeEmailListOid) {
    this.subscribeEmailListOid = subscribeEmailListOid;
    return this;
  }

   /**
   * Email list identifier to subscribe the customer to when this rebill occurs
   * @return subscribeEmailListOid
  **/
  @ApiModelProperty(value = "Email list identifier to subscribe the customer to when this rebill occurs")
  public Integer getSubscribeEmailListOid() {
    return subscribeEmailListOid;
  }

  public void setSubscribeEmailListOid(Integer subscribeEmailListOid) {
    this.subscribeEmailListOid = subscribeEmailListOid;
  }

  public ItemAutoOrderStep type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of step (item or pause)
   * @return type
  **/
  @ApiModelProperty(value = "Type of step (item or pause)")
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
    ItemAutoOrderStep itemAutoOrderStep = (ItemAutoOrderStep) o;
    return Objects.equals(this.arbitraryScheduleDays, itemAutoOrderStep.arbitraryScheduleDays) &&
        Objects.equals(this.arbitraryUnitCost, itemAutoOrderStep.arbitraryUnitCost) &&
        Objects.equals(this.arbitraryUnitCostSchedules, itemAutoOrderStep.arbitraryUnitCostSchedules) &&
        Objects.equals(this.grandfatherPricing, itemAutoOrderStep.grandfatherPricing) &&
        Objects.equals(this.managedBy, itemAutoOrderStep.managedBy) &&
        Objects.equals(this.pauseDays, itemAutoOrderStep.pauseDays) &&
        Objects.equals(this.pauseUntilDate, itemAutoOrderStep.pauseUntilDate) &&
        Objects.equals(this.preshipmentNoticeDays, itemAutoOrderStep.preshipmentNoticeDays) &&
        Objects.equals(this.recurringMerchantItemId, itemAutoOrderStep.recurringMerchantItemId) &&
        Objects.equals(this.recurringMerchantItemOid, itemAutoOrderStep.recurringMerchantItemOid) &&
        Objects.equals(this.repeatCount, itemAutoOrderStep.repeatCount) &&
        Objects.equals(this.schedule, itemAutoOrderStep.schedule) &&
        Objects.equals(this.subscribeEmailListName, itemAutoOrderStep.subscribeEmailListName) &&
        Objects.equals(this.subscribeEmailListOid, itemAutoOrderStep.subscribeEmailListOid) &&
        Objects.equals(this.type, itemAutoOrderStep.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arbitraryScheduleDays, arbitraryUnitCost, arbitraryUnitCostSchedules, grandfatherPricing, managedBy, pauseDays, pauseUntilDate, preshipmentNoticeDays, recurringMerchantItemId, recurringMerchantItemOid, repeatCount, schedule, subscribeEmailListName, subscribeEmailListOid, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemAutoOrderStep {\n");
    
    sb.append("    arbitraryScheduleDays: ").append(toIndentedString(arbitraryScheduleDays)).append("\n");
    sb.append("    arbitraryUnitCost: ").append(toIndentedString(arbitraryUnitCost)).append("\n");
    sb.append("    arbitraryUnitCostSchedules: ").append(toIndentedString(arbitraryUnitCostSchedules)).append("\n");
    sb.append("    grandfatherPricing: ").append(toIndentedString(grandfatherPricing)).append("\n");
    sb.append("    managedBy: ").append(toIndentedString(managedBy)).append("\n");
    sb.append("    pauseDays: ").append(toIndentedString(pauseDays)).append("\n");
    sb.append("    pauseUntilDate: ").append(toIndentedString(pauseUntilDate)).append("\n");
    sb.append("    preshipmentNoticeDays: ").append(toIndentedString(preshipmentNoticeDays)).append("\n");
    sb.append("    recurringMerchantItemId: ").append(toIndentedString(recurringMerchantItemId)).append("\n");
    sb.append("    recurringMerchantItemOid: ").append(toIndentedString(recurringMerchantItemOid)).append("\n");
    sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    subscribeEmailListName: ").append(toIndentedString(subscribeEmailListName)).append("\n");
    sb.append("    subscribeEmailListOid: ").append(toIndentedString(subscribeEmailListOid)).append("\n");
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
