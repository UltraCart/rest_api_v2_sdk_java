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
import com.ultracart.admin.v2.models.ItemKitComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ItemKitDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-04T23:05:49.832-05:00")
public class ItemKitDefinition {
  @SerializedName("components")
  private List<ItemKitComponent> components = null;

  public ItemKitDefinition components(List<ItemKitComponent> components) {
    this.components = components;
    return this;
  }

  public ItemKitDefinition addComponentsItem(ItemKitComponent componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<ItemKitComponent>();
    }
    this.components.add(componentsItem);
    return this;
  }

   /**
   * Components
   * @return components
  **/
  @ApiModelProperty(value = "Components")
  public List<ItemKitComponent> getComponents() {
    return components;
  }

  public void setComponents(List<ItemKitComponent> components) {
    this.components = components;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemKitDefinition itemKitDefinition = (ItemKitDefinition) o;
    return Objects.equals(this.components, itemKitDefinition.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemKitDefinition {\n");
    
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
