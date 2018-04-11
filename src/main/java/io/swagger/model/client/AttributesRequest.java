package io.swagger.model.client;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AttributesRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-11T15:35:38.161Z")

public class AttributesRequest   {
  @JsonProperty("transactionDate")
  private String transactionDate = null;

  @JsonProperty("clientIp")
  private String clientIp = null;

  @JsonProperty("channelId")
  private String channelId = null;

  @JsonProperty("consumerId")
  private String consumerId = null;

  @JsonProperty("clientDocumentType")
  private String clientDocumentType = null;

  @JsonProperty("clientDocument")
  private String clientDocument = null;

  @JsonProperty("businessDocumentType")
  private String businessDocumentType = null;

  @JsonProperty("businessDocument")
  private String businessDocument = null;

  public AttributesRequest transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Get transactionDate
   * @return transactionDate
  **/
  @ApiModelProperty(value = "")


  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public AttributesRequest clientIp(String clientIp) {
    this.clientIp = clientIp;
    return this;
  }

  /**
   * Get clientIp
   * @return clientIp
  **/
  @ApiModelProperty(value = "")


  public String getClientIp() {
    return clientIp;
  }

  public void setClientIp(String clientIp) {
    this.clientIp = clientIp;
  }

  public AttributesRequest channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   * @return channelId
  **/
  @ApiModelProperty(value = "")


  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public AttributesRequest consumerId(String consumerId) {
    this.consumerId = consumerId;
    return this;
  }

  /**
   * Get consumerId
   * @return consumerId
  **/
  @ApiModelProperty(value = "")


  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public AttributesRequest clientDocumentType(String clientDocumentType) {
    this.clientDocumentType = clientDocumentType;
    return this;
  }

  /**
   * Get clientDocumentType
   * @return clientDocumentType
  **/
  @ApiModelProperty(value = "")


  public String getClientDocumentType() {
    return clientDocumentType;
  }

  public void setClientDocumentType(String clientDocumentType) {
    this.clientDocumentType = clientDocumentType;
  }

  public AttributesRequest clientDocument(String clientDocument) {
    this.clientDocument = clientDocument;
    return this;
  }

  /**
   * Get clientDocument
   * @return clientDocument
  **/
  @ApiModelProperty(value = "")


  public String getClientDocument() {
    return clientDocument;
  }

  public void setClientDocument(String clientDocument) {
    this.clientDocument = clientDocument;
  }

  public AttributesRequest businessDocumentType(String businessDocumentType) {
    this.businessDocumentType = businessDocumentType;
    return this;
  }

  /**
   * Get businessDocumentType
   * @return businessDocumentType
  **/
  @ApiModelProperty(value = "")


  public String getBusinessDocumentType() {
    return businessDocumentType;
  }

  public void setBusinessDocumentType(String businessDocumentType) {
    this.businessDocumentType = businessDocumentType;
  }

  public AttributesRequest businessDocument(String businessDocument) {
    this.businessDocument = businessDocument;
    return this;
  }

  /**
   * Get businessDocument
   * @return businessDocument
  **/
  @ApiModelProperty(value = "")


  public String getBusinessDocument() {
    return businessDocument;
  }

  public void setBusinessDocument(String businessDocument) {
    this.businessDocument = businessDocument;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributesRequest attributesRequest = (AttributesRequest) o;
    return Objects.equals(this.transactionDate, attributesRequest.transactionDate) &&
        Objects.equals(this.clientIp, attributesRequest.clientIp) &&
        Objects.equals(this.channelId, attributesRequest.channelId) &&
        Objects.equals(this.consumerId, attributesRequest.consumerId) &&
        Objects.equals(this.clientDocumentType, attributesRequest.clientDocumentType) &&
        Objects.equals(this.clientDocument, attributesRequest.clientDocument) &&
        Objects.equals(this.businessDocumentType, attributesRequest.businessDocumentType) &&
        Objects.equals(this.businessDocument, attributesRequest.businessDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDate, clientIp, channelId, consumerId, clientDocumentType, clientDocument, businessDocumentType, businessDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributesRequest {\n");
    
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    consumerId: ").append(toIndentedString(consumerId)).append("\n");
    sb.append("    clientDocumentType: ").append(toIndentedString(clientDocumentType)).append("\n");
    sb.append("    clientDocument: ").append(toIndentedString(clientDocument)).append("\n");
    sb.append("    businessDocumentType: ").append(toIndentedString(businessDocumentType)).append("\n");
    sb.append("    businessDocument: ").append(toIndentedString(businessDocument)).append("\n");
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

