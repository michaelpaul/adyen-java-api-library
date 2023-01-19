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
import com.adyen.model.management.Url;
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
 * NotificationUrl
 */

public class NotificationUrl {
  public static final String SERIALIZED_NAME_LOCAL_URLS = "localUrls";
  @SerializedName(SERIALIZED_NAME_LOCAL_URLS)
  private List<Url> localUrls = null;

  public static final String SERIALIZED_NAME_PUBLIC_URLS = "publicUrls";
  @SerializedName(SERIALIZED_NAME_PUBLIC_URLS)
  private List<Url> publicUrls = null;

  public NotificationUrl() { 
  }

  public NotificationUrl localUrls(List<Url> localUrls) {
    
    this.localUrls = localUrls;
    return this;
  }

  public NotificationUrl addLocalUrlsItem(Url localUrlsItem) {
    if (this.localUrls == null) {
      this.localUrls = new ArrayList<>();
    }
    this.localUrls.add(localUrlsItem);
    return this;
  }

   /**
   * One or more local URLs to send notifications to when using Terminal API.
   * @return localUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more local URLs to send notifications to when using Terminal API.")

  public List<Url> getLocalUrls() {
    return localUrls;
  }


  public void setLocalUrls(List<Url> localUrls) {
    this.localUrls = localUrls;
  }


  public NotificationUrl publicUrls(List<Url> publicUrls) {
    
    this.publicUrls = publicUrls;
    return this;
  }

  public NotificationUrl addPublicUrlsItem(Url publicUrlsItem) {
    if (this.publicUrls == null) {
      this.publicUrls = new ArrayList<>();
    }
    this.publicUrls.add(publicUrlsItem);
    return this;
  }

   /**
   * One or more public URLs to send notifications to when using Terminal API.
   * @return publicUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One or more public URLs to send notifications to when using Terminal API.")

  public List<Url> getPublicUrls() {
    return publicUrls;
  }


  public void setPublicUrls(List<Url> publicUrls) {
    this.publicUrls = publicUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationUrl notificationUrl = (NotificationUrl) o;
    return Objects.equals(this.localUrls, notificationUrl.localUrls) &&
        Objects.equals(this.publicUrls, notificationUrl.publicUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localUrls, publicUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationUrl {\n");
    sb.append("    localUrls: ").append(toIndentedString(localUrls)).append("\n");
    sb.append("    publicUrls: ").append(toIndentedString(publicUrls)).append("\n");
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
    openapiFields.add("localUrls");
    openapiFields.add("publicUrls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotificationUrl
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (NotificationUrl.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationUrl is not found in the empty JSON string", NotificationUrl.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NotificationUrl.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationUrl` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraylocalUrls = jsonObj.getAsJsonArray("localUrls");
      if (jsonArraylocalUrls != null) {
        // ensure the json data is an array
        if (!jsonObj.get("localUrls").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `localUrls` to be an array in the JSON string but got `%s`", jsonObj.get("localUrls").toString()));
        }

        // validate the optional field `localUrls` (array)
        for (int i = 0; i < jsonArraylocalUrls.size(); i++) {
          Url.validateJsonObject(jsonArraylocalUrls.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraypublicUrls = jsonObj.getAsJsonArray("publicUrls");
      if (jsonArraypublicUrls != null) {
        // ensure the json data is an array
        if (!jsonObj.get("publicUrls").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `publicUrls` to be an array in the JSON string but got `%s`", jsonObj.get("publicUrls").toString()));
        }

        // validate the optional field `publicUrls` (array)
        for (int i = 0; i < jsonArraypublicUrls.size(); i++) {
          Url.validateJsonObject(jsonArraypublicUrls.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationUrl.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationUrl' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationUrl> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationUrl.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationUrl>() {
           @Override
           public void write(JsonWriter out, NotificationUrl value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationUrl read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationUrl given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationUrl
  * @throws IOException if the JSON string is invalid with respect to NotificationUrl
  */
  public static NotificationUrl fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationUrl.class);
  }

 /**
  * Convert an instance of NotificationUrl to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

