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
 * WebData
 */

public class WebData {
  public static final String SERIALIZED_NAME_WEB_ADDRESS = "webAddress";
  @SerializedName(SERIALIZED_NAME_WEB_ADDRESS)
  private String webAddress;

  public static final String SERIALIZED_NAME_WEB_ADDRESS_ID = "webAddressId";
  @SerializedName(SERIALIZED_NAME_WEB_ADDRESS_ID)
  private String webAddressId;

  public WebData() { 
  }

  
  public WebData(
     String webAddressId
  ) {
    this();
    this.webAddressId = webAddressId;
  }

  public WebData webAddress(String webAddress) {
    
    this.webAddress = webAddress;
    return this;
  }

   /**
   * The URL of the website or the app store URL.
   * @return webAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the website or the app store URL.")

  public String getWebAddress() {
    return webAddress;
  }


  public void setWebAddress(String webAddress) {
    this.webAddress = webAddress;
  }


   /**
   * The unique identifier of the web address.
   * @return webAddressId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the web address.")

  public String getWebAddressId() {
    return webAddressId;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebData webData = (WebData) o;
    return Objects.equals(this.webAddress, webData.webAddress) &&
        Objects.equals(this.webAddressId, webData.webAddressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webAddress, webAddressId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebData {\n");
    sb.append("    webAddress: ").append(toIndentedString(webAddress)).append("\n");
    sb.append("    webAddressId: ").append(toIndentedString(webAddressId)).append("\n");
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
    openapiFields.add("webAddress");
    openapiFields.add("webAddressId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WebData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebData is not found in the empty JSON string", WebData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field webAddress
      if (jsonObj.get("webAddress") != null && !jsonObj.get("webAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webAddress").toString()));
      }
      // validate the optional field webAddressId
      if (jsonObj.get("webAddressId") != null && !jsonObj.get("webAddressId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webAddressId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webAddressId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebData.class));

       return (TypeAdapter<T>) new TypeAdapter<WebData>() {
           @Override
           public void write(JsonWriter out, WebData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebData
  * @throws IOException if the JSON string is invalid with respect to WebData
  */
  public static WebData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebData.class);
  }

 /**
  * Convert an instance of WebData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

