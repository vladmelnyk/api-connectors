package io.swagger.client.model;

import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OrderBook  {
  
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("level")
  private BigDecimal level = null;
  @SerializedName("bidSize")
  private BigDecimal bidSize = null;
  @SerializedName("bidPrice")
  private Double bidPrice = null;
  @SerializedName("askPrice")
  private Double askPrice = null;
  @SerializedName("askSize")
  private BigDecimal askSize = null;
  @SerializedName("timestamp")
  private Date timestamp = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getLevel() {
    return level;
  }
  public void setLevel(BigDecimal level) {
    this.level = level;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getBidSize() {
    return bidSize;
  }
  public void setBidSize(BigDecimal bidSize) {
    this.bidSize = bidSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getBidPrice() {
    return bidPrice;
  }
  public void setBidPrice(Double bidPrice) {
    this.bidPrice = bidPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Double getAskPrice() {
    return askPrice;
  }
  public void setAskPrice(Double askPrice) {
    this.askPrice = askPrice;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getAskSize() {
    return askSize;
  }
  public void setAskSize(BigDecimal askSize) {
    this.askSize = askSize;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBook {\n");
    
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  level: ").append(level).append("\n");
    sb.append("  bidSize: ").append(bidSize).append("\n");
    sb.append("  bidPrice: ").append(bidPrice).append("\n");
    sb.append("  askPrice: ").append(askPrice).append("\n");
    sb.append("  askSize: ").append(askSize).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
