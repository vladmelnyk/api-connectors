package io.swagger.client.model;

import io.swagger.client.StringUtil;
import java.math.BigDecimal;
import java.util.Date;


import java.util.Objects;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-30T13:35:44.556-06:00")
public class Execution   {
  
  private String execID = null;
  private String orderID = null;
  private String clOrdID = null;
  private BigDecimal account = null;
  private String symbol = null;
  private String side = null;
  private BigDecimal lastQty = null;
  private Double lastPx = null;
  private Double underlyingLastPx = null;
  private String lastMkt = null;
  private String lastLiquidityInd = null;
  private Double simpleOrderQty = null;
  private BigDecimal orderQty = null;
  private Double price = null;
  private BigDecimal minQty = null;
  private Double stopPx = null;
  private String currency = null;
  private String settlCurrency = null;
  private String execType = null;
  private String ordType = null;
  private String timeInForce = null;
  private String exDestination = null;
  private String ordStatus = null;
  private Boolean workingIndicator = null;
  private String ordRejReason = null;
  private Double simpleLeavesQty = null;
  private BigDecimal leavesQty = null;
  private Double simpleCumQty = null;
  private BigDecimal cumQty = null;
  private Double avgPx = null;
  private Double commission = null;
  private String commType = null;
  private String tradePublishIndicator = null;
  private String multiLegReportingType = null;
  private String text = null;
  private String trdMatchID = null;
  private BigDecimal execCost = null;
  private BigDecimal execComm = null;
  private Double homeNotional = null;
  private Double foreignNotional = null;
  private Date transactTime = null;
  private Date timestamp = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("execID")
  public String getExecID() {
    return execID;
  }
  public void setExecID(String execID) {
    this.execID = execID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("orderID")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("clOrdID")
  public String getClOrdID() {
    return clOrdID;
  }
  public void setClOrdID(String clOrdID) {
    this.clOrdID = clOrdID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("account")
  public BigDecimal getAccount() {
    return account;
  }
  public void setAccount(BigDecimal account) {
    this.account = account;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("symbol")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("side")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastQty")
  public BigDecimal getLastQty() {
    return lastQty;
  }
  public void setLastQty(BigDecimal lastQty) {
    this.lastQty = lastQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastPx")
  public Double getLastPx() {
    return lastPx;
  }
  public void setLastPx(Double lastPx) {
    this.lastPx = lastPx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("underlyingLastPx")
  public Double getUnderlyingLastPx() {
    return underlyingLastPx;
  }
  public void setUnderlyingLastPx(Double underlyingLastPx) {
    this.underlyingLastPx = underlyingLastPx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastMkt")
  public String getLastMkt() {
    return lastMkt;
  }
  public void setLastMkt(String lastMkt) {
    this.lastMkt = lastMkt;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("lastLiquidityInd")
  public String getLastLiquidityInd() {
    return lastLiquidityInd;
  }
  public void setLastLiquidityInd(String lastLiquidityInd) {
    this.lastLiquidityInd = lastLiquidityInd;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("simpleOrderQty")
  public Double getSimpleOrderQty() {
    return simpleOrderQty;
  }
  public void setSimpleOrderQty(Double simpleOrderQty) {
    this.simpleOrderQty = simpleOrderQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("orderQty")
  public BigDecimal getOrderQty() {
    return orderQty;
  }
  public void setOrderQty(BigDecimal orderQty) {
    this.orderQty = orderQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("price")
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("minQty")
  public BigDecimal getMinQty() {
    return minQty;
  }
  public void setMinQty(BigDecimal minQty) {
    this.minQty = minQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("stopPx")
  public Double getStopPx() {
    return stopPx;
  }
  public void setStopPx(Double stopPx) {
    this.stopPx = stopPx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("settlCurrency")
  public String getSettlCurrency() {
    return settlCurrency;
  }
  public void setSettlCurrency(String settlCurrency) {
    this.settlCurrency = settlCurrency;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("execType")
  public String getExecType() {
    return execType;
  }
  public void setExecType(String execType) {
    this.execType = execType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ordType")
  public String getOrdType() {
    return ordType;
  }
  public void setOrdType(String ordType) {
    this.ordType = ordType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timeInForce")
  public String getTimeInForce() {
    return timeInForce;
  }
  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("exDestination")
  public String getExDestination() {
    return exDestination;
  }
  public void setExDestination(String exDestination) {
    this.exDestination = exDestination;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ordStatus")
  public String getOrdStatus() {
    return ordStatus;
  }
  public void setOrdStatus(String ordStatus) {
    this.ordStatus = ordStatus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("workingIndicator")
  public Boolean getWorkingIndicator() {
    return workingIndicator;
  }
  public void setWorkingIndicator(Boolean workingIndicator) {
    this.workingIndicator = workingIndicator;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("ordRejReason")
  public String getOrdRejReason() {
    return ordRejReason;
  }
  public void setOrdRejReason(String ordRejReason) {
    this.ordRejReason = ordRejReason;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("simpleLeavesQty")
  public Double getSimpleLeavesQty() {
    return simpleLeavesQty;
  }
  public void setSimpleLeavesQty(Double simpleLeavesQty) {
    this.simpleLeavesQty = simpleLeavesQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("leavesQty")
  public BigDecimal getLeavesQty() {
    return leavesQty;
  }
  public void setLeavesQty(BigDecimal leavesQty) {
    this.leavesQty = leavesQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("simpleCumQty")
  public Double getSimpleCumQty() {
    return simpleCumQty;
  }
  public void setSimpleCumQty(Double simpleCumQty) {
    this.simpleCumQty = simpleCumQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("cumQty")
  public BigDecimal getCumQty() {
    return cumQty;
  }
  public void setCumQty(BigDecimal cumQty) {
    this.cumQty = cumQty;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("avgPx")
  public Double getAvgPx() {
    return avgPx;
  }
  public void setAvgPx(Double avgPx) {
    this.avgPx = avgPx;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("commission")
  public Double getCommission() {
    return commission;
  }
  public void setCommission(Double commission) {
    this.commission = commission;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("commType")
  public String getCommType() {
    return commType;
  }
  public void setCommType(String commType) {
    this.commType = commType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tradePublishIndicator")
  public String getTradePublishIndicator() {
    return tradePublishIndicator;
  }
  public void setTradePublishIndicator(String tradePublishIndicator) {
    this.tradePublishIndicator = tradePublishIndicator;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("multiLegReportingType")
  public String getMultiLegReportingType() {
    return multiLegReportingType;
  }
  public void setMultiLegReportingType(String multiLegReportingType) {
    this.multiLegReportingType = multiLegReportingType;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("trdMatchID")
  public String getTrdMatchID() {
    return trdMatchID;
  }
  public void setTrdMatchID(String trdMatchID) {
    this.trdMatchID = trdMatchID;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("execCost")
  public BigDecimal getExecCost() {
    return execCost;
  }
  public void setExecCost(BigDecimal execCost) {
    this.execCost = execCost;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("execComm")
  public BigDecimal getExecComm() {
    return execComm;
  }
  public void setExecComm(BigDecimal execComm) {
    this.execComm = execComm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("homeNotional")
  public Double getHomeNotional() {
    return homeNotional;
  }
  public void setHomeNotional(Double homeNotional) {
    this.homeNotional = homeNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("foreignNotional")
  public Double getForeignNotional() {
    return foreignNotional;
  }
  public void setForeignNotional(Double foreignNotional) {
    this.foreignNotional = foreignNotional;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("transactTime")
  public Date getTransactTime() {
    return transactTime;
  }
  public void setTransactTime(Date transactTime) {
    this.transactTime = transactTime;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Execution execution = (Execution) o;
    return Objects.equals(execID, execution.execID) &&
        Objects.equals(orderID, execution.orderID) &&
        Objects.equals(clOrdID, execution.clOrdID) &&
        Objects.equals(account, execution.account) &&
        Objects.equals(symbol, execution.symbol) &&
        Objects.equals(side, execution.side) &&
        Objects.equals(lastQty, execution.lastQty) &&
        Objects.equals(lastPx, execution.lastPx) &&
        Objects.equals(underlyingLastPx, execution.underlyingLastPx) &&
        Objects.equals(lastMkt, execution.lastMkt) &&
        Objects.equals(lastLiquidityInd, execution.lastLiquidityInd) &&
        Objects.equals(simpleOrderQty, execution.simpleOrderQty) &&
        Objects.equals(orderQty, execution.orderQty) &&
        Objects.equals(price, execution.price) &&
        Objects.equals(minQty, execution.minQty) &&
        Objects.equals(stopPx, execution.stopPx) &&
        Objects.equals(currency, execution.currency) &&
        Objects.equals(settlCurrency, execution.settlCurrency) &&
        Objects.equals(execType, execution.execType) &&
        Objects.equals(ordType, execution.ordType) &&
        Objects.equals(timeInForce, execution.timeInForce) &&
        Objects.equals(exDestination, execution.exDestination) &&
        Objects.equals(ordStatus, execution.ordStatus) &&
        Objects.equals(workingIndicator, execution.workingIndicator) &&
        Objects.equals(ordRejReason, execution.ordRejReason) &&
        Objects.equals(simpleLeavesQty, execution.simpleLeavesQty) &&
        Objects.equals(leavesQty, execution.leavesQty) &&
        Objects.equals(simpleCumQty, execution.simpleCumQty) &&
        Objects.equals(cumQty, execution.cumQty) &&
        Objects.equals(avgPx, execution.avgPx) &&
        Objects.equals(commission, execution.commission) &&
        Objects.equals(commType, execution.commType) &&
        Objects.equals(tradePublishIndicator, execution.tradePublishIndicator) &&
        Objects.equals(multiLegReportingType, execution.multiLegReportingType) &&
        Objects.equals(text, execution.text) &&
        Objects.equals(trdMatchID, execution.trdMatchID) &&
        Objects.equals(execCost, execution.execCost) &&
        Objects.equals(execComm, execution.execComm) &&
        Objects.equals(homeNotional, execution.homeNotional) &&
        Objects.equals(foreignNotional, execution.foreignNotional) &&
        Objects.equals(transactTime, execution.transactTime) &&
        Objects.equals(timestamp, execution.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(execID, orderID, clOrdID, account, symbol, side, lastQty, lastPx, underlyingLastPx, lastMkt, lastLiquidityInd, simpleOrderQty, orderQty, price, minQty, stopPx, currency, settlCurrency, execType, ordType, timeInForce, exDestination, ordStatus, workingIndicator, ordRejReason, simpleLeavesQty, leavesQty, simpleCumQty, cumQty, avgPx, commission, commType, tradePublishIndicator, multiLegReportingType, text, trdMatchID, execCost, execComm, homeNotional, foreignNotional, transactTime, timestamp);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Execution {\n");
    
    sb.append("    execID: ").append(StringUtil.toIndentedString(execID)).append("\n");
    sb.append("    orderID: ").append(StringUtil.toIndentedString(orderID)).append("\n");
    sb.append("    clOrdID: ").append(StringUtil.toIndentedString(clOrdID)).append("\n");
    sb.append("    account: ").append(StringUtil.toIndentedString(account)).append("\n");
    sb.append("    symbol: ").append(StringUtil.toIndentedString(symbol)).append("\n");
    sb.append("    side: ").append(StringUtil.toIndentedString(side)).append("\n");
    sb.append("    lastQty: ").append(StringUtil.toIndentedString(lastQty)).append("\n");
    sb.append("    lastPx: ").append(StringUtil.toIndentedString(lastPx)).append("\n");
    sb.append("    underlyingLastPx: ").append(StringUtil.toIndentedString(underlyingLastPx)).append("\n");
    sb.append("    lastMkt: ").append(StringUtil.toIndentedString(lastMkt)).append("\n");
    sb.append("    lastLiquidityInd: ").append(StringUtil.toIndentedString(lastLiquidityInd)).append("\n");
    sb.append("    simpleOrderQty: ").append(StringUtil.toIndentedString(simpleOrderQty)).append("\n");
    sb.append("    orderQty: ").append(StringUtil.toIndentedString(orderQty)).append("\n");
    sb.append("    price: ").append(StringUtil.toIndentedString(price)).append("\n");
    sb.append("    minQty: ").append(StringUtil.toIndentedString(minQty)).append("\n");
    sb.append("    stopPx: ").append(StringUtil.toIndentedString(stopPx)).append("\n");
    sb.append("    currency: ").append(StringUtil.toIndentedString(currency)).append("\n");
    sb.append("    settlCurrency: ").append(StringUtil.toIndentedString(settlCurrency)).append("\n");
    sb.append("    execType: ").append(StringUtil.toIndentedString(execType)).append("\n");
    sb.append("    ordType: ").append(StringUtil.toIndentedString(ordType)).append("\n");
    sb.append("    timeInForce: ").append(StringUtil.toIndentedString(timeInForce)).append("\n");
    sb.append("    exDestination: ").append(StringUtil.toIndentedString(exDestination)).append("\n");
    sb.append("    ordStatus: ").append(StringUtil.toIndentedString(ordStatus)).append("\n");
    sb.append("    workingIndicator: ").append(StringUtil.toIndentedString(workingIndicator)).append("\n");
    sb.append("    ordRejReason: ").append(StringUtil.toIndentedString(ordRejReason)).append("\n");
    sb.append("    simpleLeavesQty: ").append(StringUtil.toIndentedString(simpleLeavesQty)).append("\n");
    sb.append("    leavesQty: ").append(StringUtil.toIndentedString(leavesQty)).append("\n");
    sb.append("    simpleCumQty: ").append(StringUtil.toIndentedString(simpleCumQty)).append("\n");
    sb.append("    cumQty: ").append(StringUtil.toIndentedString(cumQty)).append("\n");
    sb.append("    avgPx: ").append(StringUtil.toIndentedString(avgPx)).append("\n");
    sb.append("    commission: ").append(StringUtil.toIndentedString(commission)).append("\n");
    sb.append("    commType: ").append(StringUtil.toIndentedString(commType)).append("\n");
    sb.append("    tradePublishIndicator: ").append(StringUtil.toIndentedString(tradePublishIndicator)).append("\n");
    sb.append("    multiLegReportingType: ").append(StringUtil.toIndentedString(multiLegReportingType)).append("\n");
    sb.append("    text: ").append(StringUtil.toIndentedString(text)).append("\n");
    sb.append("    trdMatchID: ").append(StringUtil.toIndentedString(trdMatchID)).append("\n");
    sb.append("    execCost: ").append(StringUtil.toIndentedString(execCost)).append("\n");
    sb.append("    execComm: ").append(StringUtil.toIndentedString(execComm)).append("\n");
    sb.append("    homeNotional: ").append(StringUtil.toIndentedString(homeNotional)).append("\n");
    sb.append("    foreignNotional: ").append(StringUtil.toIndentedString(foreignNotional)).append("\n");
    sb.append("    transactTime: ").append(StringUtil.toIndentedString(transactTime)).append("\n");
    sb.append("    timestamp: ").append(StringUtil.toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
