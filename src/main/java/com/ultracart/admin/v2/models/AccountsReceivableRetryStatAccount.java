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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ultracart.admin.v2.models.AccountsReceivableRetryStatMetrics;
import com.ultracart.admin.v2.models.AccountsReceivableRetryStatRevenue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountsReceivableRetryStatAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-23T03:23:57.585-04:00")
public class AccountsReceivableRetryStatAccount {
  @SerializedName("days")
  private List<AccountsReceivableRetryStatMetrics> days = null;

  @SerializedName("merchant_id")
  private String merchantId = null;

  @SerializedName("overall")
  private AccountsReceivableRetryStatMetrics overall = null;

  @SerializedName("revenue_for_period")
  private List<AccountsReceivableRetryStatRevenue> revenueForPeriod = null;

  public AccountsReceivableRetryStatAccount days(List<AccountsReceivableRetryStatMetrics> days) {
    this.days = days;
    return this;
  }

  public AccountsReceivableRetryStatAccount addDaysItem(AccountsReceivableRetryStatMetrics daysItem) {
    if (this.days == null) {
      this.days = new ArrayList<AccountsReceivableRetryStatMetrics>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(value = "")
  public List<AccountsReceivableRetryStatMetrics> getDays() {
    return days;
  }

  public void setDays(List<AccountsReceivableRetryStatMetrics> days) {
    this.days = days;
  }

  public AccountsReceivableRetryStatAccount merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  @ApiModelProperty(value = "")
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public AccountsReceivableRetryStatAccount overall(AccountsReceivableRetryStatMetrics overall) {
    this.overall = overall;
    return this;
  }

   /**
   * Get overall
   * @return overall
  **/
  @ApiModelProperty(value = "")
  public AccountsReceivableRetryStatMetrics getOverall() {
    return overall;
  }

  public void setOverall(AccountsReceivableRetryStatMetrics overall) {
    this.overall = overall;
  }

  public AccountsReceivableRetryStatAccount revenueForPeriod(List<AccountsReceivableRetryStatRevenue> revenueForPeriod) {
    this.revenueForPeriod = revenueForPeriod;
    return this;
  }

  public AccountsReceivableRetryStatAccount addRevenueForPeriodItem(AccountsReceivableRetryStatRevenue revenueForPeriodItem) {
    if (this.revenueForPeriod == null) {
      this.revenueForPeriod = new ArrayList<AccountsReceivableRetryStatRevenue>();
    }
    this.revenueForPeriod.add(revenueForPeriodItem);
    return this;
  }

   /**
   * Get revenueForPeriod
   * @return revenueForPeriod
  **/
  @ApiModelProperty(value = "")
  public List<AccountsReceivableRetryStatRevenue> getRevenueForPeriod() {
    return revenueForPeriod;
  }

  public void setRevenueForPeriod(List<AccountsReceivableRetryStatRevenue> revenueForPeriod) {
    this.revenueForPeriod = revenueForPeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsReceivableRetryStatAccount accountsReceivableRetryStatAccount = (AccountsReceivableRetryStatAccount) o;
    return Objects.equals(this.days, accountsReceivableRetryStatAccount.days) &&
        Objects.equals(this.merchantId, accountsReceivableRetryStatAccount.merchantId) &&
        Objects.equals(this.overall, accountsReceivableRetryStatAccount.overall) &&
        Objects.equals(this.revenueForPeriod, accountsReceivableRetryStatAccount.revenueForPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days, merchantId, overall, revenueForPeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsReceivableRetryStatAccount {\n");
    
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    revenueForPeriod: ").append(toIndentedString(revenueForPeriod)).append("\n");
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
