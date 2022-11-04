/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

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

import com.adyen.model.management.JSON;

/**
 * InstallAndroidAppDetails
 */

public class InstallAndroidAppDetails {
  public static final String SERIALIZED_NAME_APP_ID = "appId";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  /**
   * Type of terminal action: Install an Android app.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    INSTALLANDROIDAPP("InstallAndroidApp");

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
  private TypeEnum type = TypeEnum.INSTALLANDROIDAPP;

  public InstallAndroidAppDetails() { 
  }

  public InstallAndroidAppDetails appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * The unique identifier of the app to be installed.
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the app to be installed.")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public InstallAndroidAppDetails type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of terminal action: Install an Android app.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of terminal action: Install an Android app.")

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
    InstallAndroidAppDetails installAndroidAppDetails = (InstallAndroidAppDetails) o;
    return Objects.equals(this.appId, installAndroidAppDetails.appId) &&
        Objects.equals(this.type, installAndroidAppDetails.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallAndroidAppDetails {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
    openapiFields.add("appId");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstallAndroidAppDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InstallAndroidAppDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstallAndroidAppDetails is not found in the empty JSON string", InstallAndroidAppDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstallAndroidAppDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstallAndroidAppDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field appId
      if (jsonObj.get("appId") != null && !jsonObj.get("appId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appId").toString()));
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
       if (!InstallAndroidAppDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstallAndroidAppDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstallAndroidAppDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstallAndroidAppDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<InstallAndroidAppDetails>() {
           @Override
           public void write(JsonWriter out, InstallAndroidAppDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstallAndroidAppDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstallAndroidAppDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstallAndroidAppDetails
  * @throws IOException if the JSON string is invalid with respect to InstallAndroidAppDetails
  */
  public static InstallAndroidAppDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstallAndroidAppDetails.class);
  }

 /**
  * Convert an instance of InstallAndroidAppDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
