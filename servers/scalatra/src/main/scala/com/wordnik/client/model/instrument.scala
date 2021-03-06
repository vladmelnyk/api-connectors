package com.wordnik.client.model

import java.util.Date
import java.math.BigDecimal


case class Instrument (
  symbol: String,
  rootSymbol: String,
  state: String,
  typ: String,
  listing: Date,
  front: Date,
  expiry: Date,
  relistInterval: Date,
  inverseLeg: String,
  sellLeg: String,
  buyLeg: String,
  underlying: String,
  quoteCurrency: String,
  underlyingSymbol: String,
  reference: String,
  referenceSymbol: String,
  tickSize: Double,
  multiplier: BigDecimal,
  settlCurrency: String,
  underlyingToSettleMultiplier: BigDecimal,
  quoteToSettleMultiplier: BigDecimal,
  isQuanto: Boolean,
  isInverse: Boolean,
  initMargin: Double,
  maintMargin: Double,
  limit: Double,
  capped: Boolean,
  taxed: Boolean,
  makerFee: Double,
  takerFee: Double,
  insuranceFee: Double,
  hedgerMakerFee: Double,
  hedgerTakerFee: Double,
  hedgerInsuranceFee: Double,
  openingTimestamp: Date,
  closingTimestamp: Date,
  sessionInterval: Date,
  prevClosePrice: Double,
  limitDownPrice: Double,
  limitUpPrice: Double,
  bankruptLimitDownPrice: Double,
  bankruptLimitUpPrice: Double,
  prevTotalVolume: BigDecimal,
  totalVolume: BigDecimal,
  volume: BigDecimal,
  volume24h: BigDecimal,
  prevTotalTurnover: BigDecimal,
  totalTurnover: BigDecimal,
  turnover: BigDecimal,
  turnover24h: BigDecimal,
  prevPrice24h: Double,
  vwap: Double,
  highPrice: Double,
  lowPrice: Double,
  lastPrice: Double,
  lastPriceProtected: Double,
  lastTickDirection: String,
  lastChangePcnt: Double,
  bidPrice: Double,
  midPrice: Double,
  askPrice: Double,
  impactBidPrice: Double,
  impactMidPrice: Double,
  impactAskPrice: Double,
  hasLiquidity: Boolean,
  openInterest: BigDecimal,
  openValue: BigDecimal,
  fairMethod: String,
  fairBasisRate: Double,
  fairBasis: Double,
  fairPrice: Double,
  markMethod: String,
  markPrice: Double,
  indicativeTaxRate: Double,
  indicativeSettlePrice: Double,
  settledPrice: Double,
  timestamp: Date
)
