/*
 * Legal Entity Management API
 *
 * The version of the OpenAPI document: 3
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.legalEntityManagement;

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

import com.adyen.model.legalEntityManagement.JSON;

/**
 * RecurringDetail
 */

public class RecurringDetail {
  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public RecurringDetail() { 
  }

  public RecurringDetail merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account used when the payment details were stored.
   * @return merchantAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The merchant account used when the payment details were stored.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public RecurringDetail reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The &#x60;recurringDetailReference&#x60; returned in the response when the payment details were stored.
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `recurringDetailReference` returned in the response when the payment details were stored.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public RecurringDetail shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * The unique identifier used when the payment details were stored.
   * @return shopperReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier used when the payment details were stored.")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDetail recurringDetail = (RecurringDetail) o;
    return Objects.equals(this.merchantAccount, recurringDetail.merchantAccount) &&
        Objects.equals(this.reference, recurringDetail.reference) &&
        Objects.equals(this.shopperReference, recurringDetail.shopperReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantAccount, reference, shopperReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDetail {\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
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
    openapiFields.add("merchantAccount");
    openapiFields.add("reference");
    openapiFields.add("shopperReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecurringDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RecurringDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecurringDetail is not found in the empty JSON string", RecurringDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecurringDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecurringDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecurringDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecurringDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecurringDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecurringDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<RecurringDetail>() {
           @Override
           public void write(JsonWriter out, RecurringDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecurringDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecurringDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecurringDetail
  * @throws IOException if the JSON string is invalid with respect to RecurringDetail
  */
  public static RecurringDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecurringDetail.class);
  }

 /**
  * Convert an instance of RecurringDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

