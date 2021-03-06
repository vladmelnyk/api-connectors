package io.swagger.api;

import io.swagger.model.*;

import io.swagger.model.Trade;
import io.swagger.model.Error;
import java.math.BigDecimal;
import java.util.Date;
import io.swagger.model.TradeBin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/trade", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/trade", description = "the trade API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2015-11-30T13:35:50.750-06:00")
public class TradeApi {
  

  @ApiOperation(value = "Get Trades.", notes = "", response = Trade.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Trade>> tradeGet(@ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. 'XBU:monthly'. Timeframes are 'daily', 'weekly', 'monthly', 'quarterly', and 'biquarterly'.") @RequestParam(value = "symbol", required = false) String symbol


,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as {\"key\": \"value\"}. You can key on individual fields, and do more advanced querying on timestamps. See <a href=\"http://localhost:2001/app/restAPI#timestamp-filters\">http://localhost:2001/app/restAPI#timestamp-filters</a> for more details.") @RequestParam(value = "filter", required = false) String filter


,
    @ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @RequestParam(value = "columns", required = false) String columns


,
    @ApiParam(value = "Number of results to fetch.", defaultValue = "100") @RequestParam(value = "count", required = false, defaultValue="100") BigDecimal count


,
    @ApiParam(value = "Starting point for results.", defaultValue = "0") @RequestParam(value = "start", required = false, defaultValue="0") BigDecimal start


,
    @ApiParam(value = "If true, will sort results newest first.", defaultValue = "false") @RequestParam(value = "reverse", required = false, defaultValue="false") Boolean reverse


,
    @ApiParam(value = "Starting date filter for results.") @RequestParam(value = "startTime", required = false) Date startTime


,
    @ApiParam(value = "Ending date filter for results.") @RequestParam(value = "endTime", required = false) Date endTime


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Trade>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get previous trades in time buckets.", notes = "", response = TradeBin.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/bucketed", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<TradeBin>> tradeGetBucketed(@ApiParam(value = "Time interval to bucket by. Available options: ['1m', '5m', '1h', '1d'].") @RequestParam(value = "binSize", required = false) String binSize


,
    @ApiParam(value = "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. 'XBU:monthly'. Timeframes are 'daily', 'weekly', 'monthly', 'quarterly', and 'biquarterly'.") @RequestParam(value = "symbol", required = false) String symbol


,
    @ApiParam(value = "Generic table filter. Send JSON key/value pairs, such as {\"key\": \"value\"}. You can key on individual fields, and do more advanced querying on timestamps. See <a href=\"http://localhost:2001/app/restAPI#timestamp-filters\">http://localhost:2001/app/restAPI#timestamp-filters</a> for more details.") @RequestParam(value = "filter", required = false) String filter


,
    @ApiParam(value = "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.") @RequestParam(value = "columns", required = false) String columns


,
    @ApiParam(value = "Number of results to fetch.", defaultValue = "100") @RequestParam(value = "count", required = false, defaultValue="100") BigDecimal count


,
    @ApiParam(value = "Starting point for results.", defaultValue = "0") @RequestParam(value = "start", required = false, defaultValue="0") BigDecimal start


,
    @ApiParam(value = "If true, will sort results newest first.", defaultValue = "false") @RequestParam(value = "reverse", required = false, defaultValue="false") Boolean reverse


,
    @ApiParam(value = "Starting date filter for results.") @RequestParam(value = "startTime", required = false) Date startTime


,
    @ApiParam(value = "Ending date filter for results.") @RequestParam(value = "endTime", required = false) Date endTime


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<TradeBin>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get trades between two dates. [Deprecated, use GET /trades]", notes = "", response = Trade.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/byDate", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Trade>> tradeGetByDate(@ApiParam(value = "Start date.", required = true) @RequestParam(value = "startTime", required = true) Date startTime


,
    @ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.") @RequestParam(value = "symbol", required = false) String symbol


,
    @ApiParam(value = "End Date.") @RequestParam(value = "endTime", required = false) Date endTime


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Trade>>(HttpStatus.OK);
  }

  

  @ApiOperation(value = "Get recent trades. [Deprecated, use GET /trades]", notes = "", response = Trade.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "Request was successful"),
    @ApiResponse(code = 400, message = "Parameter Error"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 404, message = "Not Found") })
  @RequestMapping(value = "/recent", 
    produces = { "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript" }, 
    consumes = { "application/json", "application/x-www-form-urlencoded" },
    method = RequestMethod.GET)
  public ResponseEntity<List<Trade>> tradeGetRecent(@ApiParam(value = "Number of trades to fetch.", required = true, defaultValue = "100") @RequestParam(value = "count", required = true, defaultValue="100") BigDecimal count


,
    @ApiParam(value = "Instrument symbol. Send a series (e.g. XBT) to get data for the nearest contract in that series.") @RequestParam(value = "symbol", required = false) String symbol


)
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Trade>>(HttpStatus.OK);
  }

  
}
