package io.swagger.model;

import java.util.*;
import java.util.Date;
import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JaxRSServerCodegen", date = "2015-11-30T13:35:57.938-06:00")
public class UserPreferences  {
  
  private Date announcementsLastSeen = null;
  private String colorTheme = null;
  private String currency = null;
  private Boolean debug = null;
  private List<String> disableEmails = new ArrayList<String>();
  private List<String> hideConfirmDialogs = new ArrayList<String>();
  private List<String> hideNotifications = new ArrayList<String>();
  private Boolean hidePhoneConfirm = null;
  private List<String> msgsSeen = new ArrayList<String>();
  private BigDecimal orderBookBinning = null;
  private Boolean orderControlsPlusMinus = null;
  private List<String> sounds = new ArrayList<String>();
  private Boolean strictIPCheck = false;
  private String tickerGroup = null;
  private Boolean tickerPinned = null;
  private String tradeLayout = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("announcementsLastSeen")
  public Date getAnnouncementsLastSeen() {
    return announcementsLastSeen;
  }
  public void setAnnouncementsLastSeen(Date announcementsLastSeen) {
    this.announcementsLastSeen = announcementsLastSeen;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("colorTheme")
  public String getColorTheme() {
    return colorTheme;
  }
  public void setColorTheme(String colorTheme) {
    this.colorTheme = colorTheme;
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
  @JsonProperty("debug")
  public Boolean getDebug() {
    return debug;
  }
  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("disableEmails")
  public List<String> getDisableEmails() {
    return disableEmails;
  }
  public void setDisableEmails(List<String> disableEmails) {
    this.disableEmails = disableEmails;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hideConfirmDialogs")
  public List<String> getHideConfirmDialogs() {
    return hideConfirmDialogs;
  }
  public void setHideConfirmDialogs(List<String> hideConfirmDialogs) {
    this.hideConfirmDialogs = hideConfirmDialogs;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hideNotifications")
  public List<String> getHideNotifications() {
    return hideNotifications;
  }
  public void setHideNotifications(List<String> hideNotifications) {
    this.hideNotifications = hideNotifications;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("hidePhoneConfirm")
  public Boolean getHidePhoneConfirm() {
    return hidePhoneConfirm;
  }
  public void setHidePhoneConfirm(Boolean hidePhoneConfirm) {
    this.hidePhoneConfirm = hidePhoneConfirm;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("msgsSeen")
  public List<String> getMsgsSeen() {
    return msgsSeen;
  }
  public void setMsgsSeen(List<String> msgsSeen) {
    this.msgsSeen = msgsSeen;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("orderBookBinning")
  public BigDecimal getOrderBookBinning() {
    return orderBookBinning;
  }
  public void setOrderBookBinning(BigDecimal orderBookBinning) {
    this.orderBookBinning = orderBookBinning;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("orderControlsPlusMinus")
  public Boolean getOrderControlsPlusMinus() {
    return orderControlsPlusMinus;
  }
  public void setOrderControlsPlusMinus(Boolean orderControlsPlusMinus) {
    this.orderControlsPlusMinus = orderControlsPlusMinus;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("sounds")
  public List<String> getSounds() {
    return sounds;
  }
  public void setSounds(List<String> sounds) {
    this.sounds = sounds;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("strictIPCheck")
  public Boolean getStrictIPCheck() {
    return strictIPCheck;
  }
  public void setStrictIPCheck(Boolean strictIPCheck) {
    this.strictIPCheck = strictIPCheck;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tickerGroup")
  public String getTickerGroup() {
    return tickerGroup;
  }
  public void setTickerGroup(String tickerGroup) {
    this.tickerGroup = tickerGroup;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tickerPinned")
  public Boolean getTickerPinned() {
    return tickerPinned;
  }
  public void setTickerPinned(Boolean tickerPinned) {
    this.tickerPinned = tickerPinned;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("tradeLayout")
  public String getTradeLayout() {
    return tradeLayout;
  }
  public void setTradeLayout(String tradeLayout) {
    this.tradeLayout = tradeLayout;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPreferences userPreferences = (UserPreferences) o;
    return Objects.equals(announcementsLastSeen, userPreferences.announcementsLastSeen) &&
        Objects.equals(colorTheme, userPreferences.colorTheme) &&
        Objects.equals(currency, userPreferences.currency) &&
        Objects.equals(debug, userPreferences.debug) &&
        Objects.equals(disableEmails, userPreferences.disableEmails) &&
        Objects.equals(hideConfirmDialogs, userPreferences.hideConfirmDialogs) &&
        Objects.equals(hideNotifications, userPreferences.hideNotifications) &&
        Objects.equals(hidePhoneConfirm, userPreferences.hidePhoneConfirm) &&
        Objects.equals(msgsSeen, userPreferences.msgsSeen) &&
        Objects.equals(orderBookBinning, userPreferences.orderBookBinning) &&
        Objects.equals(orderControlsPlusMinus, userPreferences.orderControlsPlusMinus) &&
        Objects.equals(sounds, userPreferences.sounds) &&
        Objects.equals(strictIPCheck, userPreferences.strictIPCheck) &&
        Objects.equals(tickerGroup, userPreferences.tickerGroup) &&
        Objects.equals(tickerPinned, userPreferences.tickerPinned) &&
        Objects.equals(tradeLayout, userPreferences.tradeLayout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(announcementsLastSeen, colorTheme, currency, debug, disableEmails, hideConfirmDialogs, hideNotifications, hidePhoneConfirm, msgsSeen, orderBookBinning, orderControlsPlusMinus, sounds, strictIPCheck, tickerGroup, tickerPinned, tradeLayout);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferences {\n");
    
    sb.append("  announcementsLastSeen: ").append(announcementsLastSeen).append("\n");
    sb.append("  colorTheme: ").append(colorTheme).append("\n");
    sb.append("  currency: ").append(currency).append("\n");
    sb.append("  debug: ").append(debug).append("\n");
    sb.append("  disableEmails: ").append(disableEmails).append("\n");
    sb.append("  hideConfirmDialogs: ").append(hideConfirmDialogs).append("\n");
    sb.append("  hideNotifications: ").append(hideNotifications).append("\n");
    sb.append("  hidePhoneConfirm: ").append(hidePhoneConfirm).append("\n");
    sb.append("  msgsSeen: ").append(msgsSeen).append("\n");
    sb.append("  orderBookBinning: ").append(orderBookBinning).append("\n");
    sb.append("  orderControlsPlusMinus: ").append(orderControlsPlusMinus).append("\n");
    sb.append("  sounds: ").append(sounds).append("\n");
    sb.append("  strictIPCheck: ").append(strictIPCheck).append("\n");
    sb.append("  tickerGroup: ").append(tickerGroup).append("\n");
    sb.append("  tickerPinned: ").append(tickerPinned).append("\n");
    sb.append("  tradeLayout: ").append(tradeLayout).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
