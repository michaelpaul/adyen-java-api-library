/*
 * Adyen Checkout API
 *
 * The version of the OpenAPI document: 69
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.checkout;

import java.util.Objects;
import java.util.Arrays;
import com.adyen.model.checkout.Avs;
import com.adyen.model.checkout.InstallmentsNumber;
import com.adyen.model.checkout.ShopperInput;
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

import com.adyen.model.checkout.JSON;

/**
 * ModelConfiguration
 */

public class ModelConfiguration {
  public static final String SERIALIZED_NAME_AVS = "avs";
  @SerializedName(SERIALIZED_NAME_AVS)
  private Avs avs;

  /**
   * Determines whether the cardholder name should be provided or not.  Permitted values: * NONE * OPTIONAL * REQUIRED
   */
  @JsonAdapter(CardHolderNameEnum.Adapter.class)
  public enum CardHolderNameEnum {
    NONE("NONE"),
    
    OPTIONAL("OPTIONAL"),
    
    REQUIRED("REQUIRED");

    private String value;

    CardHolderNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CardHolderNameEnum fromValue(String value) {
      for (CardHolderNameEnum b : CardHolderNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CardHolderNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardHolderNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CardHolderNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CardHolderNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CARD_HOLDER_NAME = "cardHolderName";
  @SerializedName(SERIALIZED_NAME_CARD_HOLDER_NAME)
  private CardHolderNameEnum cardHolderName;

  public static final String SERIALIZED_NAME_INSTALLMENTS = "installments";
  @SerializedName(SERIALIZED_NAME_INSTALLMENTS)
  private InstallmentsNumber installments;

  public static final String SERIALIZED_NAME_SHOPPER_INPUT = "shopperInput";
  @SerializedName(SERIALIZED_NAME_SHOPPER_INPUT)
  private ShopperInput shopperInput;

  public ModelConfiguration() { 
  }

  public ModelConfiguration avs(Avs avs) {
    
    this.avs = avs;
    return this;
  }

   /**
   * Get avs
   * @return avs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Avs getAvs() {
    return avs;
  }


  public void setAvs(Avs avs) {
    this.avs = avs;
  }


  public ModelConfiguration cardHolderName(CardHolderNameEnum cardHolderName) {
    
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Determines whether the cardholder name should be provided or not.  Permitted values: * NONE * OPTIONAL * REQUIRED
   * @return cardHolderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether the cardholder name should be provided or not.  Permitted values: * NONE * OPTIONAL * REQUIRED")

  public CardHolderNameEnum getCardHolderName() {
    return cardHolderName;
  }


  public void setCardHolderName(CardHolderNameEnum cardHolderName) {
    this.cardHolderName = cardHolderName;
  }


  public ModelConfiguration installments(InstallmentsNumber installments) {
    
    this.installments = installments;
    return this;
  }

   /**
   * Get installments
   * @return installments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InstallmentsNumber getInstallments() {
    return installments;
  }


  public void setInstallments(InstallmentsNumber installments) {
    this.installments = installments;
  }


  public ModelConfiguration shopperInput(ShopperInput shopperInput) {
    
    this.shopperInput = shopperInput;
    return this;
  }

   /**
   * Get shopperInput
   * @return shopperInput
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ShopperInput getShopperInput() {
    return shopperInput;
  }


  public void setShopperInput(ShopperInput shopperInput) {
    this.shopperInput = shopperInput;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfiguration configuration = (ModelConfiguration) o;
    return Objects.equals(this.avs, configuration.avs) &&
        Objects.equals(this.cardHolderName, configuration.cardHolderName) &&
        Objects.equals(this.installments, configuration.installments) &&
        Objects.equals(this.shopperInput, configuration.shopperInput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avs, cardHolderName, installments, shopperInput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    sb.append("    avs: ").append(toIndentedString(avs)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    installments: ").append(toIndentedString(installments)).append("\n");
    sb.append("    shopperInput: ").append(toIndentedString(shopperInput)).append("\n");
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
    openapiFields.add("avs");
    openapiFields.add("cardHolderName");
    openapiFields.add("installments");
    openapiFields.add("shopperInput");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModelConfiguration.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelConfiguration is not found in the empty JSON string", ModelConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelConfiguration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `avs`
      if (jsonObj.getAsJsonObject("avs") != null) {
        Avs.validateJsonObject(jsonObj.getAsJsonObject("avs"));
      }
      // ensure the field cardHolderName can be parsed to an enum value
      if (jsonObj.get("cardHolderName") != null) {
        if(!jsonObj.get("cardHolderName").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `cardHolderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cardHolderName").toString()));
        }
        CardHolderNameEnum.fromValue(jsonObj.get("cardHolderName").getAsString());
      }
      // validate the optional field `installments`
      if (jsonObj.getAsJsonObject("installments") != null) {
        InstallmentsNumber.validateJsonObject(jsonObj.getAsJsonObject("installments"));
      }
      // validate the optional field `shopperInput`
      if (jsonObj.getAsJsonObject("shopperInput") != null) {
        ShopperInput.validateJsonObject(jsonObj.getAsJsonObject("shopperInput"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelConfiguration>() {
           @Override
           public void write(JsonWriter out, ModelConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelConfiguration
  * @throws IOException if the JSON string is invalid with respect to ModelConfiguration
  */
  public static ModelConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelConfiguration.class);
  }

 /**
  * Convert an instance of ModelConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

