package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import io.swagger.client.model.Position;
import io.swagger.client.model.Error;
import java.math.BigDecimal;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class PositionApi {
  String basePath = "https://localhost/api/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Get your positions.
   * 
   * @param filter Table filter. For example, send {\&quot;symbol\&quot;: \&quot;XBT24H\&quot;}.
   * @param columns Which columns to fetch. For example, send [\&quot;columnName\&quot;].
   * @param count Number of rows to fetch.
   * @return List<Position>
   */
  public List<Position>  positionFind (String filter, String columns, BigDecimal count) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/position".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "filter", filter));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "columns", columns));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "count", count));
    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (List<Position>) ApiInvoker.deserialize(response, "array", Position.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Toggle isolated (fixed) margin per-position.
   * On Speculative (DPE-Enabled) contracts, users can switch isolate margin per-position. This function allows switching margin isolation (aka fixed margin) on and off. A position must be open to isolate it.
   * @param symbol Position symbol to isolate.
   * @param enabled If true, will enable isolated margin.
   * @return Position
   */
  public Position  positionIsolateMargin (String symbol, Boolean enabled) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       throw new ApiException(400, "Missing the required parameter 'symbol' when calling positionIsolateMargin");
    }
    

    // create path and map variables
    String path = "/position/isolate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (symbol != null) {
        builder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (enabled != null) {
        builder.addTextBody("enabled", ApiInvoker.parameterToString(enabled), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
      formParams.put("enabled", ApiInvoker.parameterToString(enabled));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Position) ApiInvoker.deserialize(response, "", Position.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Transfer equity in or out of a position.
   * When margin is isolated on a position, use this function to add or remove margin from the position. Note that you cannot remove margin below the initial margin threshold.
   * @param symbol Position symbol to isolate.
   * @param amount Amount to transfer, in satoshis. May be negative.
   * @return Position
   */
  public Position  positionTransferIsolatedMargin (String symbol, BigDecimal amount) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
       throw new ApiException(400, "Missing the required parameter 'symbol' when calling positionTransferIsolatedMargin");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
       throw new ApiException(400, "Missing the required parameter 'amount' when calling positionTransferIsolatedMargin");
    }
    

    // create path and map variables
    String path = "/position/transferMargin".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json","application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (symbol != null) {
        builder.addTextBody("symbol", ApiInvoker.parameterToString(symbol), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (amount != null) {
        builder.addTextBody("amount", ApiInvoker.parameterToString(amount), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("symbol", ApiInvoker.parameterToString(symbol));
      formParams.put("amount", ApiInvoker.parameterToString(amount));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Position) ApiInvoker.deserialize(response, "", Position.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
