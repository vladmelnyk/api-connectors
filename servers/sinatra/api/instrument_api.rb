require 'json'


MyApp.add_route('GET', '/instrument', {
  "resourcePath" => "/Instrument",
  "summary" => "Get instruments.",
  "nickname" => "instrument/get", 
  "responseClass" => "array[Instrument]", 
  "endpoint" => "/instrument", 
  "notes" => "This returns all instruments and indices, including those that have settled or are unlisted. Use this endpoint if you want to query for individual instruments or use a complex filter. Use the endpoint /instrument/active to return active instruments, or use a filter like {\"state\": \"Open\"}.",
  "parameters" => [
    
    {
      "name" => "symbol",
      "description" => "Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.\n\nYou can also send a timeframe, e.g. &#39;XBU:monthly&#39;. Timeframes are &#39;daily&#39;, &#39;weekly&#39;, &#39;monthly&#39;, &#39;quarterly&#39;, and &#39;biquarterly&#39;.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "filter",
      "description" => "Generic table filter. Send JSON key/value pairs, such as {\&quot;key\&quot;: \&quot;value\&quot;}. You can key on individual fields, and do more advanced querying on timestamps. See &lt;a href=\&quot;http://localhost:2001/app/restAPI#timestamp-filters\&quot;&gt;http://localhost:2001/app/restAPI#timestamp-filters&lt;/a&gt; for more details.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "columns",
      "description" => "Array of column names to fetch. If omitted, will return all columns.\n\nNote that this method will always return item keys, even when not specified, so you may receive more columns that you expect.",
      "dataType" => "string",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "count",
      "description" => "Number of results to fetch.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "100"
    },
    
    {
      "name" => "start",
      "description" => "Starting point for results.",
      "dataType" => "number",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "0"
    },
    
    {
      "name" => "reverse",
      "description" => "If true, will sort results newest first.",
      "dataType" => "boolean",
      "paramType" => "query",
      
      "allowableValues" => "",
      "defaultValue" => "false"
    },
    
    {
      "name" => "start_time",
      "description" => "Starting date filter for results.",
      "dataType" => "date",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    {
      "name" => "end_time",
      "description" => "Ending date filter for results.",
      "dataType" => "date",
      "paramType" => "query",
      
      "allowableValues" => "",
      
    },
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/instrument/active', {
  "resourcePath" => "/Instrument",
  "summary" => "Get all active instruments and instruments that have expired in <24hrs.",
  "nickname" => "instrument/get_active", 
  "responseClass" => "array[Instrument]", 
  "endpoint" => "/instrument/active", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/instrument/activeAndIndices', {
  "resourcePath" => "/Instrument",
  "summary" => "Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active.",
  "nickname" => "instrument/get_active_and_indices", 
  "responseClass" => "array[Instrument]", 
  "endpoint" => "/instrument/activeAndIndices", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/instrument/activeIntervals', {
  "resourcePath" => "/Instrument",
  "summary" => "Return all active contract series and interval pairs.",
  "nickname" => "instrument/get_active_intervals", 
  "responseClass" => "InstrumentInterval", 
  "endpoint" => "/instrument/activeIntervals", 
  "notes" => "This endpoint is useful for determining which pairs are live. It returns two arrays of   strings. The first is intervals, such as `[\"BVOL:daily\", \"BVOL:weekly\", \"XBU:daily\", \"XBU:monthly\", ...]`. These identifiers are usable in any query's \"symbol\" param. The second array is the current resolution of these intervals. Results are mapped at the same index.",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/instrument/indices', {
  "resourcePath" => "/Instrument",
  "summary" => "Get all price indices.",
  "nickname" => "instrument/get_indices", 
  "responseClass" => "array[Instrument]", 
  "endpoint" => "/instrument/indices", 
  "notes" => "",
  "parameters" => [
    
    
    
    
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

