#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGExecution.h"
#import "SWGObject.h"
#import "SWGApiClient.h"


/**
 * NOTE: This class is auto generated by the swagger code generator program. 
 * https://github.com/swagger-api/swagger-codegen 
 * Do not edit the class manually.
 */

@interface SWGExecutionApi: NSObject

@property(nonatomic, assign)SWGApiClient *apiClient;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient;
-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGExecutionApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(SWGExecutionApi*) sharedAPI;
///
///
/// Get all raw executions for your account.
/// This returns all raw transactions, which includes order opening and cancelation, and order status changes. It can be quite noisy. More focused information is available at /execution/tradeHistory. You may also use the `filter` param to target your query. Specify an array as a filter value, such as {\"execType\": [\"Settlement\", \"Trade\"]} to filter on multiple values.
///
/// @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
/// @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
/// @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
/// @param count Number of results to fetch.
/// @param start Starting point for results.
/// @param reverse If true, will sort results newest first.
/// @param startTime Starting date filter for results.
/// @param endTime Ending date filter for results.
/// 
///
/// @return NSArray<SWGExecution>*
-(NSNumber*) executionGetWithCompletionBlock :(NSString*) symbol 
     filter:(NSString*) filter 
     columns:(NSString*) columns 
     count:(NSNumber*) count 
     start:(NSNumber*) start 
     reverse:(NSNumber*) reverse 
     startTime:(NSDate*) startTime 
     endTime:(NSDate*) endTime 
    
    completionHandler: (void (^)(NSArray<SWGExecution>* output, NSError* error))completionBlock;
    


///
///
/// Get all balance-affecting executions. This includes each trade, insurance charge, and settlement.
/// 
///
/// @param symbol Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.
/// @param filter Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.
/// @param columns Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.
/// @param count Number of results to fetch.
/// @param start Starting point for results.
/// @param reverse If true, will sort results newest first.
/// @param startTime Starting date filter for results.
/// @param endTime Ending date filter for results.
/// 
///
/// @return NSArray<SWGExecution>*
-(NSNumber*) executionGetTradeHistoryWithCompletionBlock :(NSString*) symbol 
     filter:(NSString*) filter 
     columns:(NSString*) columns 
     count:(NSNumber*) count 
     start:(NSNumber*) start 
     reverse:(NSNumber*) reverse 
     startTime:(NSDate*) startTime 
     endTime:(NSDate*) endTime 
    
    completionHandler: (void (^)(NSArray<SWGExecution>* output, NSError* error))completionBlock;
    



@end
