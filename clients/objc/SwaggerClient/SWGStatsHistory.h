#import <Foundation/Foundation.h>
#import "SWGObject.h"

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */



@protocol SWGStatsHistory
@end

@interface SWGStatsHistory : SWGObject


@property(nonatomic) NSDate* date;

@property(nonatomic) NSString* rootSymbol;

@property(nonatomic) NSString* currency;

@property(nonatomic) NSNumber* volume;

@property(nonatomic) NSNumber* turnover;

@end
