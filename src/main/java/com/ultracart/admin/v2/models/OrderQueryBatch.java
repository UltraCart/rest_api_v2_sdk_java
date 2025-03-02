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
 * OrderQueryBatch
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2025-02-28T09:16:56.926-05:00")



public class OrderQueryBatch {
  @SerializedName("order_ids")
  private List<String> orderIds = null;

  /**
   * Query Target
   */
  @JsonAdapter(QueryTargetEnum.Adapter.class)
  public enum QueryTargetEnum {
    ORIGIN("origin"),
    
    CACHE("cache");

    private String value;

    QueryTargetEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QueryTargetEnum fromValue(String text) {
      for (QueryTargetEnum b : QueryTargetEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<QueryTargetEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QueryTargetEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QueryTargetEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return QueryTargetEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("query_target")
  private QueryTargetEnum queryTarget = null;

  public OrderQueryBatch orderIds(List<String> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public OrderQueryBatch addOrderIdsItem(String orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<String>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Order IDs
   * @return orderIds
  **/
  @ApiModelProperty(value = "Order IDs")
  public List<String> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(List<String> orderIds) {
    this.orderIds = orderIds;
  }

  public OrderQueryBatch queryTarget(QueryTargetEnum queryTarget) {
    this.queryTarget = queryTarget;
    return this;
  }

   /**
   * Query Target
   * @return queryTarget
  **/
  @ApiModelProperty(value = "Query Target")
  public QueryTargetEnum getQueryTarget() {
    return queryTarget;
  }

  public void setQueryTarget(QueryTargetEnum queryTarget) {
    this.queryTarget = queryTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderQueryBatch orderQueryBatch = (OrderQueryBatch) o;
    return Objects.equals(this.orderIds, orderQueryBatch.orderIds) &&
        Objects.equals(this.queryTarget, orderQueryBatch.queryTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderIds, queryTarget);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderQueryBatch {\n");
    
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    queryTarget: ").append(toIndentedString(queryTarget)).append("\n");
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

