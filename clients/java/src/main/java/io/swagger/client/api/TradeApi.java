package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.TypeRef;

import io.swagger.client.model.Trade;
import io.swagger.client.model.Error;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.client.model.TradeBin;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-30T13:35:44.556-06:00")
public class TradeApi {
  private ApiClient apiClient;

  public TradeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TradeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get Trades.
   * 
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
   * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
   * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
   * @param count Number of results to fetch.
   * @param start Starting point for results.
   * @param reverse If true, will sort results newest first.
   * @param startTime Starting date filter for results.
   * @param endTime Ending date filter for results.
   * @return List<Trade>
   */
  public List<Trade> tradeGet (String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, Date startTime, Date endTime) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/trade".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "columns", columns));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count", count));
    
    queryParams.addAll(apiClient.parameterToPairs("", "start", start));
    
    queryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<Trade>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get previous trades in time buckets.
   * 
   * @param binSize Time interval to bucket by. Available options: [&#39;1m&#39;, &#39;5m&#39;, &#39;1h&#39;, &#39;1d&#39;].
   * @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
   * @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
   * @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
   * @param count Number of results to fetch.
   * @param start Starting point for results.
   * @param reverse If true, will sort results newest first.
   * @param startTime Starting date filter for results.
   * @param endTime Ending date filter for results.
   * @return List<TradeBin>
   */
  public List<TradeBin> tradeGetBucketed (String binSize, String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, Date startTime, Date endTime) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
    // create path and map variables
    String path = "/trade/bucketed".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "binSize", binSize));
    
    queryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    
    queryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(apiClient.parameterToPairs("", "columns", columns));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count", count));
    
    queryParams.addAll(apiClient.parameterToPairs("", "start", start));
    
    queryParams.addAll(apiClient.parameterToPairs("", "reverse", reverse));
    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<TradeBin>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get trades between two dates. [Deprecated, use GET /trades]
   * 
   * @param startTime Start date.
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
   * @param endTime End Date.
   * @return List<Trade>
   */
  public List<Trade> tradeGetByDate (Date startTime, String symbol, Date endTime) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'startTime' is set
     if (startTime == null) {
        throw new ApiException(400, "Missing the required parameter 'startTime' when calling tradeGetByDate");
     }
     
    // create path and map variables
    String path = "/trade/byDate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    
    queryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    
    queryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<Trade>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
  /**
   * Get recent trades. [Deprecated, use GET /trades]
   * 
   * @param count Number of trades to fetch.
   * @param symbol Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.
   * @return List<Trade>
   */
  public List<Trade> tradeGetRecent (BigDecimal count, String symbol) throws ApiException {
    Object postBody = null;
    byte[] postBinaryBody = null;
    
     // verify the required parameter 'count' is set
     if (count == null) {
        throw new ApiException(400, "Missing the required parameter 'count' when calling tradeGetRecent");
     }
     
    // create path and map variables
    String path = "/trade/recent".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    
    queryParams.addAll(apiClient.parameterToPairs("", "count", count));
    

    

    

    final String[] accepts = {
      "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json", "application/x-www-form-urlencoded"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    

    
    
    TypeRef returnType = new TypeRef<List<Trade>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, postBinaryBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
    


  }
  
}
