#import <Foundation/Foundation.h>
#import "SWGError.h"
#import "SWGApiKey.h"
#import "SWGInlineResponse200.h"
#import "SWGObject.h"
#import "SWGApiClient.h"


/**
 * NOTE: This class is auto generated by the swagger code generator program. 
 * https://github.com/swagger-api/swagger-codegen 
 * Do not edit the class manually.
 */

@interface SWGApiKeyApi: NSObject

@property(nonatomic, assign)SWGApiClient *apiClient;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient;
-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGApiKeyApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(SWGApiKeyApi*) sharedAPI;
///
///
/// Get your API Keys.
/// 
///
/// @param reverse If true, will sort results newest first.
/// 
///
/// @return NSArray<SWGApiKey>*
-(NSNumber*) apiKeyGetKeysWithCompletionBlock :(NSNumber*) reverse 
    
    completionHandler: (void (^)(NSArray<SWGApiKey>* output, NSError* error))completionBlock;
    


///
///
/// Create a new API Key.
/// API Keys can also be created via <a href=\"https://github.com/BitMEX/market-maker/blob/master/generate-api-key.py\">this Python script</a>. See the <a href=\"/app/apiKeys\">API Key Documentation</a> for more information on capabilities.
///
/// @param name Key name. This name is for reference only.
/// @param cidr CIDR block to restrict this key to. To restrict to a single address, append \&quot;/32\&quot;, e.g. 207.39.29.22/32. Leave blank or set to 0.0.0.0/0 to allow all IPs. Only one block may be set. &lt;a href=\&quot;http://software77.net/cidr-101.html\&quot;&gt;More on CIDR blocks&lt;/a&gt;
/// @param permissions Key Permissions. All keys can read margin and position data. Additional permissions must be added. Available: [\&quot;order\&quot;, \&quot;withdraw\&quot;].
/// @param enabled Set to true to enable this key on creation. Otherwise, it must be explicitly enabled via /apiKey/enable.
/// @param token OTP Token (YubiKey, Google Authenticator)
/// 
///
/// @return SWGApiKey*
-(NSNumber*) apiKeyCreateKeyWithCompletionBlock :(NSString*) name 
     cidr:(NSString*) cidr 
     permissions:(NSString*) permissions 
     enabled:(NSNumber*) enabled 
     token:(NSString*) token 
    
    completionHandler: (void (^)(SWGApiKey* output, NSError* error))completionBlock;
    


///
///
/// Remove an API Key.
/// 
///
/// @param apiKeyID API Key ID (public component).
/// 
///
/// @return SWGInlineResponse200*
-(NSNumber*) apiKeyRemoveWithCompletionBlock :(NSString*) apiKeyID 
    
    completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock;
    


///
///
/// Disable an API Key.
/// 
///
/// @param apiKeyID API Key ID (public component).
/// 
///
/// @return SWGApiKey*
-(NSNumber*) apiKeyDisableWithCompletionBlock :(NSString*) apiKeyID 
    
    completionHandler: (void (^)(SWGApiKey* output, NSError* error))completionBlock;
    


///
///
/// Enable an API Key.
/// 
///
/// @param apiKeyID API Key ID (public component).
/// 
///
/// @return SWGApiKey*
-(NSNumber*) apiKeyEnableWithCompletionBlock :(NSString*) apiKeyID 
    
    completionHandler: (void (^)(SWGApiKey* output, NSError* error))completionBlock;
    



@end
