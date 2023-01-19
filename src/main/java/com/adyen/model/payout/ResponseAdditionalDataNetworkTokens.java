/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

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

import com.adyen.model.payout.JSON;

/**
 * ResponseAdditionalDataNetworkTokens
 */

public class ResponseAdditionalDataNetworkTokens {
  public static final String SERIALIZED_NAME_NETWORK_TOKEN_AVAILABLE = "networkToken.available";
  @SerializedName(SERIALIZED_NAME_NETWORK_TOKEN_AVAILABLE)
  private String networkTokenAvailable;

  public static final String SERIALIZED_NAME_NETWORK_TOKEN_BIN = "networkToken.bin";
  @SerializedName(SERIALIZED_NAME_NETWORK_TOKEN_BIN)
  private String networkTokenBin;

  public static final String SERIALIZED_NAME_NETWORK_TOKEN_TOKEN_SUMMARY = "networkToken.tokenSummary";
  @SerializedName(SERIALIZED_NAME_NETWORK_TOKEN_TOKEN_SUMMARY)
  private String networkTokenTokenSummary;

  public ResponseAdditionalDataNetworkTokens() { 
  }

  public ResponseAdditionalDataNetworkTokens networkTokenAvailable(String networkTokenAvailable) {
    
    this.networkTokenAvailable = networkTokenAvailable;
    return this;
  }

   /**
   * Indicates whether a network token is available for the specified card.
   * @return networkTokenAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether a network token is available for the specified card.")

  public String getNetworkTokenAvailable() {
    return networkTokenAvailable;
  }


  public void setNetworkTokenAvailable(String networkTokenAvailable) {
    this.networkTokenAvailable = networkTokenAvailable;
  }


  public ResponseAdditionalDataNetworkTokens networkTokenBin(String networkTokenBin) {
    
    this.networkTokenBin = networkTokenBin;
    return this;
  }

   /**
   * The Bank Identification Number of a tokenized card, which is the first six digits of a card number.
   * @return networkTokenBin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Bank Identification Number of a tokenized card, which is the first six digits of a card number.")

  public String getNetworkTokenBin() {
    return networkTokenBin;
  }


  public void setNetworkTokenBin(String networkTokenBin) {
    this.networkTokenBin = networkTokenBin;
  }


  public ResponseAdditionalDataNetworkTokens networkTokenTokenSummary(String networkTokenTokenSummary) {
    
    this.networkTokenTokenSummary = networkTokenTokenSummary;
    return this;
  }

   /**
   * The last four digits of a network token.
   * @return networkTokenTokenSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last four digits of a network token.")

  public String getNetworkTokenTokenSummary() {
    return networkTokenTokenSummary;
  }


  public void setNetworkTokenTokenSummary(String networkTokenTokenSummary) {
    this.networkTokenTokenSummary = networkTokenTokenSummary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseAdditionalDataNetworkTokens responseAdditionalDataNetworkTokens = (ResponseAdditionalDataNetworkTokens) o;
    return Objects.equals(this.networkTokenAvailable, responseAdditionalDataNetworkTokens.networkTokenAvailable) &&
        Objects.equals(this.networkTokenBin, responseAdditionalDataNetworkTokens.networkTokenBin) &&
        Objects.equals(this.networkTokenTokenSummary, responseAdditionalDataNetworkTokens.networkTokenTokenSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkTokenAvailable, networkTokenBin, networkTokenTokenSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseAdditionalDataNetworkTokens {\n");
    sb.append("    networkTokenAvailable: ").append(toIndentedString(networkTokenAvailable)).append("\n");
    sb.append("    networkTokenBin: ").append(toIndentedString(networkTokenBin)).append("\n");
    sb.append("    networkTokenTokenSummary: ").append(toIndentedString(networkTokenTokenSummary)).append("\n");
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
    openapiFields.add("networkToken.available");
    openapiFields.add("networkToken.bin");
    openapiFields.add("networkToken.tokenSummary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseAdditionalDataNetworkTokens
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ResponseAdditionalDataNetworkTokens.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseAdditionalDataNetworkTokens is not found in the empty JSON string", ResponseAdditionalDataNetworkTokens.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseAdditionalDataNetworkTokens.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseAdditionalDataNetworkTokens` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field networkToken.available
      if (jsonObj.get("networkToken.available") != null && !jsonObj.get("networkToken.available").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkToken.available` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkToken.available").toString()));
      }
      // validate the optional field networkToken.bin
      if (jsonObj.get("networkToken.bin") != null && !jsonObj.get("networkToken.bin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkToken.bin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkToken.bin").toString()));
      }
      // validate the optional field networkToken.tokenSummary
      if (jsonObj.get("networkToken.tokenSummary") != null && !jsonObj.get("networkToken.tokenSummary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkToken.tokenSummary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("networkToken.tokenSummary").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseAdditionalDataNetworkTokens.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseAdditionalDataNetworkTokens' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseAdditionalDataNetworkTokens> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseAdditionalDataNetworkTokens.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseAdditionalDataNetworkTokens>() {
           @Override
           public void write(JsonWriter out, ResponseAdditionalDataNetworkTokens value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseAdditionalDataNetworkTokens read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseAdditionalDataNetworkTokens given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseAdditionalDataNetworkTokens
  * @throws IOException if the JSON string is invalid with respect to ResponseAdditionalDataNetworkTokens
  */
  public static ResponseAdditionalDataNetworkTokens fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseAdditionalDataNetworkTokens.class);
  }

 /**
  * Convert an instance of ResponseAdditionalDataNetworkTokens to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

