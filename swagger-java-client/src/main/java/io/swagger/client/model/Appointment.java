/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Appointment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-10T20:38:06.405+02:00")



public class Appointment {
  @SerializedName("address")
  private String address = null;

  @SerializedName("begin")
  private OffsetDateTime begin = null;

  @SerializedName("end")
  private OffsetDateTime end = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("salesEmployeeId")
  private Long salesEmployeeId = null;

  public Appointment address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Appointment begin(OffsetDateTime begin) {
    this.begin = begin;
    return this;
  }

   /**
   * Get begin
   * @return begin
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getBegin() {
    return begin;
  }

  public void setBegin(OffsetDateTime begin) {
    this.begin = begin;
  }

  public Appointment end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public Appointment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Appointment note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Appointment salesEmployeeId(Long salesEmployeeId) {
    this.salesEmployeeId = salesEmployeeId;
    return this;
  }

   /**
   * Get salesEmployeeId
   * @return salesEmployeeId
  **/
  @ApiModelProperty(value = "")
  public Long getSalesEmployeeId() {
    return salesEmployeeId;
  }

  public void setSalesEmployeeId(Long salesEmployeeId) {
    this.salesEmployeeId = salesEmployeeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appointment appointment = (Appointment) o;
    return Objects.equals(this.address, appointment.address) &&
        Objects.equals(this.begin, appointment.begin) &&
        Objects.equals(this.end, appointment.end) &&
        Objects.equals(this.id, appointment.id) &&
        Objects.equals(this.note, appointment.note) &&
        Objects.equals(this.salesEmployeeId, appointment.salesEmployeeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, begin, end, id, note, salesEmployeeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Appointment {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    salesEmployeeId: ").append(toIndentedString(salesEmployeeId)).append("\n");
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

