#import "SWGTrade.h"

@implementation SWGTrade

/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper
{
  return [[JSONKeyMapper alloc] initWithDictionary:@{ @"timestamp": @"timestamp", @"symbol": @"symbol", @"side": @"side", @"size": @"size", @"price": @"price", @"tickDirection": @"tickDirection", @"trdMatchID": @"trdMatchID", @"grossValue": @"grossValue", @"homeNotional": @"homeNotional", @"foreignNotional": @"foreignNotional", @"id": @"_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName
{
  NSArray *optionalProperties = @[@"timestamp", @"symbol", @"side", @"size", @"price", @"tickDirection", @"trdMatchID", @"grossValue", @"homeNotional", @"foreignNotional", @"_id"];

  if ([optionalProperties containsObject:propertyName]) {
    return YES;
  }
  else {
    return NO;
  }
}

/**
 * Gets the string presentation of the object.
 * This method will be called when logging model object using `NSLog`.
 */
- (NSString *)description {
    return [[self toDictionary] description];
}

@end
