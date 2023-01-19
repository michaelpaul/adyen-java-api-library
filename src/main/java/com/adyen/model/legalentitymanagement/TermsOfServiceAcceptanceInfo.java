/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 2
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalentitymanagement;

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
import java.time.OffsetDateTime;

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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * TermsOfServiceAcceptanceInfo
 */

public class TermsOfServiceAcceptanceInfo {
  public static final String SERIALIZED_NAME_ACCEPTED_BY = "acceptedBy";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_BY)
  private String acceptedBy;

  public static final String SERIALIZED_NAME_ACCEPTED_FOR = "acceptedFor";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_FOR)
  private String acceptedFor;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of Terms of Service.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ADYENCAPITAL("adyenCapital"),
    
    ADYENFORPLATFORMSADVANCED("adyenForPlatformsAdvanced"),
    
    ADYENFORPLATFORMSMANAGE("adyenForPlatformsManage"),
    
    ADYENISSUING("adyenIssuing");

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

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public TermsOfServiceAcceptanceInfo() { 
  }

  public TermsOfServiceAcceptanceInfo acceptedBy(String acceptedBy) {
    
    this.acceptedBy = acceptedBy;
    return this;
  }

   /**
   * The unique identifier of the user that accepted the Terms of Service.
   * @return acceptedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the user that accepted the Terms of Service.")

  public String getAcceptedBy() {
    return acceptedBy;
  }


  public void setAcceptedBy(String acceptedBy) {
    this.acceptedBy = acceptedBy;
  }


  public TermsOfServiceAcceptanceInfo acceptedFor(String acceptedFor) {
    
    this.acceptedFor = acceptedFor;
    return this;
  }

   /**
   * The unique identifier of the legal entity for which the Terms of Service are accepted.
   * @return acceptedFor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the legal entity for which the Terms of Service are accepted.")

  public String getAcceptedFor() {
    return acceptedFor;
  }


  public void setAcceptedFor(String acceptedFor) {
    this.acceptedFor = acceptedFor;
  }


  public TermsOfServiceAcceptanceInfo createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date when the Terms of Service were accepted.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the Terms of Service were accepted.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TermsOfServiceAcceptanceInfo id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * An Adyen-generated reference for the accepted Terms of Service.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An Adyen-generated reference for the accepted Terms of Service.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TermsOfServiceAcceptanceInfo type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of Terms of Service.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of Terms of Service.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermsOfServiceAcceptanceInfo termsOfServiceAcceptanceInfo = (TermsOfServiceAcceptanceInfo) o;
    return Objects.equals(this.acceptedBy, termsOfServiceAcceptanceInfo.acceptedBy) &&
        Objects.equals(this.acceptedFor, termsOfServiceAcceptanceInfo.acceptedFor) &&
        Objects.equals(this.createdAt, termsOfServiceAcceptanceInfo.createdAt) &&
        Objects.equals(this.id, termsOfServiceAcceptanceInfo.id) &&
        Objects.equals(this.type, termsOfServiceAcceptanceInfo.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedBy, acceptedFor, createdAt, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsOfServiceAcceptanceInfo {\n");
    sb.append("    acceptedBy: ").append(toIndentedString(acceptedBy)).append("\n");
    sb.append("    acceptedFor: ").append(toIndentedString(acceptedFor)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("acceptedBy");
    openapiFields.add("acceptedFor");
    openapiFields.add("createdAt");
    openapiFields.add("id");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TermsOfServiceAcceptanceInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TermsOfServiceAcceptanceInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TermsOfServiceAcceptanceInfo is not found in the empty JSON string", TermsOfServiceAcceptanceInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TermsOfServiceAcceptanceInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TermsOfServiceAcceptanceInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field acceptedBy
      if (jsonObj.get("acceptedBy") != null && !jsonObj.get("acceptedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptedBy").toString()));
      }
      // validate the optional field acceptedFor
      if (jsonObj.get("acceptedFor") != null && !jsonObj.get("acceptedFor").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acceptedFor` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acceptedFor").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the field type can be parsed to an enum value
      if (jsonObj.get("type") != null) {
        if(!jsonObj.get("type").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
        }
        TypeEnum.fromValue(jsonObj.get("type").getAsString());
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TermsOfServiceAcceptanceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TermsOfServiceAcceptanceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TermsOfServiceAcceptanceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TermsOfServiceAcceptanceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<TermsOfServiceAcceptanceInfo>() {
           @Override
           public void write(JsonWriter out, TermsOfServiceAcceptanceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TermsOfServiceAcceptanceInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TermsOfServiceAcceptanceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TermsOfServiceAcceptanceInfo
  * @throws IOException if the JSON string is invalid with respect to TermsOfServiceAcceptanceInfo
  */
  public static TermsOfServiceAcceptanceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TermsOfServiceAcceptanceInfo.class);
  }

 /**
  * Convert an instance of TermsOfServiceAcceptanceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

