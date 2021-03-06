part of api;


@Entity()
class Instrument {
  
  String symbol = null;
  
  
  String rootSymbol = null;
  
  
  String state = null;
  
  
  String typ = null;
  
  
  DateTime listing = null;
  
  
  DateTime front = null;
  
  
  DateTime expiry = null;
  
  
  DateTime relistInterval = null;
  
  
  String inverseLeg = null;
  
  
  String sellLeg = null;
  
  
  String buyLeg = null;
  
  
  String underlying = null;
  
  
  String quoteCurrency = null;
  
  
  String underlyingSymbol = null;
  
  
  String reference = null;
  
  
  String referenceSymbol = null;
  
  
  num tickSize = null;
  
  
  Number multiplier = null;
  
  
  String settlCurrency = null;
  
  
  Number underlyingToSettleMultiplier = null;
  
  
  Number quoteToSettleMultiplier = null;
  
  
  bool isQuanto = null;
  
  
  bool isInverse = null;
  
  
  num initMargin = null;
  
  
  num maintMargin = null;
  
  
  num limit = null;
  
  
  bool capped = null;
  
  
  bool taxed = null;
  
  
  num makerFee = null;
  
  
  num takerFee = null;
  
  
  num insuranceFee = null;
  
  
  num hedgerMakerFee = null;
  
  
  num hedgerTakerFee = null;
  
  
  num hedgerInsuranceFee = null;
  
  
  DateTime openingTimestamp = null;
  
  
  DateTime closingTimestamp = null;
  
  
  DateTime sessionInterval = null;
  
  
  num prevClosePrice = null;
  
  
  num limitDownPrice = null;
  
  
  num limitUpPrice = null;
  
  
  num bankruptLimitDownPrice = null;
  
  
  num bankruptLimitUpPrice = null;
  
  
  Number prevTotalVolume = null;
  
  
  Number totalVolume = null;
  
  
  Number volume = null;
  
  
  Number volume24h = null;
  
  
  Number prevTotalTurnover = null;
  
  
  Number totalTurnover = null;
  
  
  Number turnover = null;
  
  
  Number turnover24h = null;
  
  
  num prevPrice24h = null;
  
  
  num vwap = null;
  
  
  num highPrice = null;
  
  
  num lowPrice = null;
  
  
  num lastPrice = null;
  
  
  num lastPriceProtected = null;
  
  
  String lastTickDirection = null;
  
  
  num lastChangePcnt = null;
  
  
  num bidPrice = null;
  
  
  num midPrice = null;
  
  
  num askPrice = null;
  
  
  num impactBidPrice = null;
  
  
  num impactMidPrice = null;
  
  
  num impactAskPrice = null;
  
  
  bool hasLiquidity = null;
  
  
  Number openInterest = null;
  
  
  Number openValue = null;
  
  
  String fairMethod = null;
  
  
  num fairBasisRate = null;
  
  
  num fairBasis = null;
  
  
  num fairPrice = null;
  
  
  String markMethod = null;
  
  
  num markPrice = null;
  
  
  num indicativeTaxRate = null;
  
  
  num indicativeSettlePrice = null;
  
  
  num settledPrice = null;
  
  
  DateTime timestamp = null;
  
  
  Instrument();

  @override
  String toString()  {
    return 'Instrument[symbol=$symbol, rootSymbol=$rootSymbol, state=$state, typ=$typ, listing=$listing, front=$front, expiry=$expiry, relistInterval=$relistInterval, inverseLeg=$inverseLeg, sellLeg=$sellLeg, buyLeg=$buyLeg, underlying=$underlying, quoteCurrency=$quoteCurrency, underlyingSymbol=$underlyingSymbol, reference=$reference, referenceSymbol=$referenceSymbol, tickSize=$tickSize, multiplier=$multiplier, settlCurrency=$settlCurrency, underlyingToSettleMultiplier=$underlyingToSettleMultiplier, quoteToSettleMultiplier=$quoteToSettleMultiplier, isQuanto=$isQuanto, isInverse=$isInverse, initMargin=$initMargin, maintMargin=$maintMargin, limit=$limit, capped=$capped, taxed=$taxed, makerFee=$makerFee, takerFee=$takerFee, insuranceFee=$insuranceFee, hedgerMakerFee=$hedgerMakerFee, hedgerTakerFee=$hedgerTakerFee, hedgerInsuranceFee=$hedgerInsuranceFee, openingTimestamp=$openingTimestamp, closingTimestamp=$closingTimestamp, sessionInterval=$sessionInterval, prevClosePrice=$prevClosePrice, limitDownPrice=$limitDownPrice, limitUpPrice=$limitUpPrice, bankruptLimitDownPrice=$bankruptLimitDownPrice, bankruptLimitUpPrice=$bankruptLimitUpPrice, prevTotalVolume=$prevTotalVolume, totalVolume=$totalVolume, volume=$volume, volume24h=$volume24h, prevTotalTurnover=$prevTotalTurnover, totalTurnover=$totalTurnover, turnover=$turnover, turnover24h=$turnover24h, prevPrice24h=$prevPrice24h, vwap=$vwap, highPrice=$highPrice, lowPrice=$lowPrice, lastPrice=$lastPrice, lastPriceProtected=$lastPriceProtected, lastTickDirection=$lastTickDirection, lastChangePcnt=$lastChangePcnt, bidPrice=$bidPrice, midPrice=$midPrice, askPrice=$askPrice, impactBidPrice=$impactBidPrice, impactMidPrice=$impactMidPrice, impactAskPrice=$impactAskPrice, hasLiquidity=$hasLiquidity, openInterest=$openInterest, openValue=$openValue, fairMethod=$fairMethod, fairBasisRate=$fairBasisRate, fairBasis=$fairBasis, fairPrice=$fairPrice, markMethod=$markMethod, markPrice=$markPrice, indicativeTaxRate=$indicativeTaxRate, indicativeSettlePrice=$indicativeSettlePrice, settledPrice=$settledPrice, timestamp=$timestamp, ]';
  }

}

