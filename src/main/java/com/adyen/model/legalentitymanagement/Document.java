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
import com.adyen.model.legalentitymanagement.Attachment;
import com.adyen.model.legalentitymanagement.OwnerEntity;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.adyen.model.legalentitymanagement.JSON;

/**
 * Document
 */

public class Document {
  public static final String SERIALIZED_NAME_ATTACHMENT = "attachment";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT)
  private Attachment attachment;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private String expiryDate;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUER_COUNTRY = "issuerCountry";
  @SerializedName(SERIALIZED_NAME_ISSUER_COUNTRY)
  private String issuerCountry;

  public static final String SERIALIZED_NAME_ISSUER_STATE = "issuerState";
  @SerializedName(SERIALIZED_NAME_ISSUER_STATE)
  private String issuerState;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modificationDate";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private OffsetDateTime modificationDate;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private OwnerEntity owner;

  /**
   * Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  When providing ID numbers: * For **individual**, the &#x60;type&#x60; values can be **driversLicense**, **identityCard**, **nationalIdNumber**, or **passport**.  When uploading documents: * For **organization**, the &#x60;type&#x60; values can be **proofOfAddress**, **registrationDocument**, **vatDocument**, **proofOfOrganizationTaxInfo**, **proofOfOwnership**, or **proofOfIndustry**.   * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, **passport**, **proofOfNationalIdNumber**, **proofOfResidency**, **proofOfIndustry**, or **proofOfIndividualTaxId**.  * For **soleProprietorship**, the &#x60;type&#x60; values can be **constitutionalDocument**, **proofOfAddress**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    BANKSTATEMENT("bankStatement"),
    
    DRIVERSLICENSE("driversLicense"),
    
    IDENTITYCARD("identityCard"),
    
    NATIONALIDNUMBER("nationalIdNumber"),
    
    PASSPORT("passport"),
    
    PROOFOFADDRESS("proofOfAddress"),
    
    PROOFOFNATIONALIDNUMBER("proofOfNationalIdNumber"),
    
    PROOFOFRESIDENCY("proofOfResidency"),
    
    REGISTRATIONDOCUMENT("registrationDocument"),
    
    VATDOCUMENT("vatDocument"),
    
    PROOFOFORGANIZATIONTAXINFO("proofOfOrganizationTaxInfo"),
    
    PROOFOFINDUSTRY("proofOfIndustry"),
    
    CONSTITUTIONALDOCUMENT("constitutionalDocument");

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

  public Document() { 
  }

  
  public Document(
     OffsetDateTime creationDate, 
     String id, 
     OffsetDateTime modificationDate
  ) {
    this();
    this.creationDate = creationDate;
    this.id = id;
    this.modificationDate = modificationDate;
  }

  public Document attachment(Attachment attachment) {
    
    this.attachment = attachment;
    return this;
  }

   /**
   * Get attachment
   * @return attachment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Attachment getAttachment() {
    return attachment;
  }


  public void setAttachment(Attachment attachment) {
    this.attachment = attachment;
  }


  public Document attachments(List<Attachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public Document addAttachmentsItem(Attachment attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Array that contains the document. The array supports multiple attachments for uploading different sides or pages of a document.
   * @return attachments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array that contains the document. The array supports multiple attachments for uploading different sides or pages of a document.")

  public List<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


   /**
   * The creation date of the document.
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The creation date of the document.")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }




  public Document description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Your description for the document.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Your description for the document.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Document expiryDate(String expiryDate) {
    
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * The expiry date of the document, in YYYY-MM-DD format.
   * @return expiryDate
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expiry date of the document, in YYYY-MM-DD format.")

  public String getExpiryDate() {
    return expiryDate;
  }


  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }


  public Document fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * The filename of the document.
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The filename of the document.")

  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


   /**
   * The unique identifier of the document.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The unique identifier of the document.")

  public String getId() {
    return id;
  }




  public Document issuerCountry(String issuerCountry) {
    
    this.issuerCountry = issuerCountry;
    return this;
  }

   /**
   * The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**.
   * @return issuerCountry
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The two-character [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) country code where the document was issued. For example, **US**.")

  public String getIssuerCountry() {
    return issuerCountry;
  }


  public void setIssuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
  }


  public Document issuerState(String issuerState) {
    
    this.issuerState = issuerState;
    return this;
  }

   /**
   * The state or province where the document was issued (AU only).
   * @return issuerState
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state or province where the document was issued (AU only).")

  public String getIssuerState() {
    return issuerState;
  }


  public void setIssuerState(String issuerState) {
    this.issuerState = issuerState;
  }


   /**
   * The modification date of the document.
   * @return modificationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The modification date of the document.")

  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }




  public Document number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * The number in the document.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number in the document.")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public Document owner(OwnerEntity owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OwnerEntity getOwner() {
    return owner;
  }


  public void setOwner(OwnerEntity owner) {
    this.owner = owner;
  }


  public Document type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  When providing ID numbers: * For **individual**, the &#x60;type&#x60; values can be **driversLicense**, **identityCard**, **nationalIdNumber**, or **passport**.  When uploading documents: * For **organization**, the &#x60;type&#x60; values can be **proofOfAddress**, **registrationDocument**, **vatDocument**, **proofOfOrganizationTaxInfo**, **proofOfOwnership**, or **proofOfIndustry**.   * For **individual**, the &#x60;type&#x60; values can be **identityCard**, **driversLicense**, **passport**, **proofOfNationalIdNumber**, **proofOfResidency**, **proofOfIndustry**, or **proofOfIndividualTaxId**.  * For **soleProprietorship**, the &#x60;type&#x60; values can be **constitutionalDocument**, **proofOfAddress**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of document, used when providing an ID number or uploading a document. The possible values depend on the legal entity type.  When providing ID numbers: * For **individual**, the `type` values can be **driversLicense**, **identityCard**, **nationalIdNumber**, or **passport**.  When uploading documents: * For **organization**, the `type` values can be **proofOfAddress**, **registrationDocument**, **vatDocument**, **proofOfOrganizationTaxInfo**, **proofOfOwnership**, or **proofOfIndustry**.   * For **individual**, the `type` values can be **identityCard**, **driversLicense**, **passport**, **proofOfNationalIdNumber**, **proofOfResidency**, **proofOfIndustry**, or **proofOfIndividualTaxId**.  * For **soleProprietorship**, the `type` values can be **constitutionalDocument**, **proofOfAddress**, or **proofOfIndustry**.  * Use **bankStatement** to upload documents for a [transfer instrument](https://docs.adyen.com/api-explorer/#/legalentity/latest/post/transferInstruments__resParam_id).")

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
    Document document = (Document) o;
    return Objects.equals(this.attachment, document.attachment) &&
        Objects.equals(this.attachments, document.attachments) &&
        Objects.equals(this.creationDate, document.creationDate) &&
        Objects.equals(this.description, document.description) &&
        Objects.equals(this.expiryDate, document.expiryDate) &&
        Objects.equals(this.fileName, document.fileName) &&
        Objects.equals(this.id, document.id) &&
        Objects.equals(this.issuerCountry, document.issuerCountry) &&
        Objects.equals(this.issuerState, document.issuerState) &&
        Objects.equals(this.modificationDate, document.modificationDate) &&
        Objects.equals(this.number, document.number) &&
        Objects.equals(this.owner, document.owner) &&
        Objects.equals(this.type, document.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachment, attachments, creationDate, description, expiryDate, fileName, id, issuerCountry, issuerState, modificationDate, number, owner, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
    sb.append("    issuerState: ").append(toIndentedString(issuerState)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
    openapiFields.add("attachment");
    openapiFields.add("attachments");
    openapiFields.add("creationDate");
    openapiFields.add("description");
    openapiFields.add("expiryDate");
    openapiFields.add("fileName");
    openapiFields.add("id");
    openapiFields.add("issuerCountry");
    openapiFields.add("issuerState");
    openapiFields.add("modificationDate");
    openapiFields.add("number");
    openapiFields.add("owner");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attachments");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("owner");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Document
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Document.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Document is not found in the empty JSON string", Document.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Document.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Document` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Document.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `attachment`
      if (jsonObj.getAsJsonObject("attachment") != null) {
        Attachment.validateJsonObject(jsonObj.getAsJsonObject("attachment"));
      }
      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      if (jsonArrayattachments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attachments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
        }

        // validate the optional field `attachments` (array)
        for (int i = 0; i < jsonArrayattachments.size(); i++) {
          Attachment.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
        };
      }
      // validate the optional field description
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field expiryDate
      if (jsonObj.get("expiryDate") != null && !jsonObj.get("expiryDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiryDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiryDate").toString()));
      }
      // validate the optional field fileName
      if (jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field issuerCountry
      if (jsonObj.get("issuerCountry") != null && !jsonObj.get("issuerCountry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerCountry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerCountry").toString()));
      }
      // validate the optional field issuerState
      if (jsonObj.get("issuerState") != null && !jsonObj.get("issuerState").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issuerState` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issuerState").toString()));
      }
      // validate the optional field number
      if (jsonObj.get("number") != null && !jsonObj.get("number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("number").toString()));
      }
      // validate the optional field `owner`
      if (jsonObj.getAsJsonObject("owner") != null) {
        OwnerEntity.validateJsonObject(jsonObj.getAsJsonObject("owner"));
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
       if (!Document.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Document' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Document> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Document.class));

       return (TypeAdapter<T>) new TypeAdapter<Document>() {
           @Override
           public void write(JsonWriter out, Document value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Document read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Document given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Document
  * @throws IOException if the JSON string is invalid with respect to Document
  */
  public static Document fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Document.class);
  }

 /**
  * Convert an instance of Document to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

