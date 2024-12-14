/*
 * OpenAPI Course
 * Specification for OpenAPI Course
 *
 * OpenAPI spec version: 1.0
 * Contact: john@springframework.guru
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PagedResponsePageableSort
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-11-25T22:08:19.323Z[GMT]")
public class PagedResponsePageableSort {
  @SerializedName("sorted")
  private Boolean sorted = null;

  @SerializedName("unsorted")
  private Boolean unsorted = null;

  public PagedResponsePageableSort sorted(Boolean sorted) {
    this.sorted = sorted;
    return this;
  }

   /**
   * Get sorted
   * @return sorted
  **/
  @Schema(description = "")
  public Boolean isSorted() {
    return sorted;
  }

  public void setSorted(Boolean sorted) {
    this.sorted = sorted;
  }

  public PagedResponsePageableSort unsorted(Boolean unsorted) {
    this.unsorted = unsorted;
    return this;
  }

   /**
   * Get unsorted
   * @return unsorted
  **/
  @Schema(description = "")
  public Boolean isUnsorted() {
    return unsorted;
  }

  public void setUnsorted(Boolean unsorted) {
    this.unsorted = unsorted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResponsePageableSort pagedResponsePageableSort = (PagedResponsePageableSort) o;
    return Objects.equals(this.sorted, pagedResponsePageableSort.sorted) &&
        Objects.equals(this.unsorted, pagedResponsePageableSort.unsorted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sorted, unsorted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResponsePageableSort {\n");
    
    sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
    sb.append("    unsorted: ").append(toIndentedString(unsorted)).append("\n");
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