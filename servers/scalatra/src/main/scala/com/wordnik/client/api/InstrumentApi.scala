package com.wordnik.client.api

import com.wordnik.client.model.Instrument
import com.wordnik.client.model.Error
import java.math.BigDecimal
import java.util.Date
import com.wordnik.client.model.InstrumentInterval

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class InstrumentApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "InstrumentApi"
  override protected val applicationName: Option[String] = Some("Instrument")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val instrument.getOperation = (apiOperation[List[Instrument]]("instrument.get")
      summary "Get instruments."
      parameters(queryParam[String]("symbol").description("").optional,
        queryParam[String]("filter").description("").optional,
        queryParam[String]("columns").description("").optional,
        queryParam[BigDecimal]("count").description("").optional.defaultValue(100),
        queryParam[BigDecimal]("start").description("").optional.defaultValue(0),
        queryParam[Boolean]("reverse").description("").optional.defaultValue(false),
        queryParam[Date]("startTime").description("").optional,
        queryParam[Date]("endTime").description("").optional)
  )

  get("/instrument",operation(instrument.getOperation)) {
    
    
    
        
      
      val symbol = params.getAs[String]("symbol")
            

    
    println("symbol: " + symbol)
  
    
    
        
      
      val filter = params.getAs[String]("filter")
            

    
    println("filter: " + filter)
  
    
    
        
      
      val columns = params.getAs[String]("columns")
            

    
    println("columns: " + columns)
  
    
    
        
      
      val count = params.getAs[BigDecimal]("count")
            

    
    println("count: " + count)
  
    
    
        
      
      val start = params.getAs[BigDecimal]("start")
            

    
    println("start: " + start)
  
    
    
        
      
      val reverse = params.getAs[Boolean]("reverse")
            

    
    println("reverse: " + reverse)
  
    
    
        
      
      val startTime = params.getAs[Date]("startTime")
            

    
    println("startTime: " + startTime)
  
    
    
        
      
      val endTime = params.getAs[Date]("endTime")
            

    
    println("endTime: " + endTime)
  
  }

  

  val instrument.getActiveOperation = (apiOperation[List[Instrument]]("instrument.getActive")
      summary "Get all active instruments and instruments that have expired in <24hrs."
      parameters()
  )

  get("/instrument/active",operation(instrument.getActiveOperation)) {
    
  }

  

  val instrument.getActiveAndIndicesOperation = (apiOperation[List[Instrument]]("instrument.getActiveAndIndices")
      summary "Helper method. Gets all active instruments and all indices. This is a join of the result of /indices and /active."
      parameters()
  )

  get("/instrument/activeAndIndices",operation(instrument.getActiveAndIndicesOperation)) {
    
  }

  

  val instrument.getActiveIntervalsOperation = (apiOperation[InstrumentInterval]("instrument.getActiveIntervals")
      summary "Return all active contract series and interval pairs."
      parameters()
  )

  get("/instrument/activeIntervals",operation(instrument.getActiveIntervalsOperation)) {
    
  }

  

  val instrument.getIndicesOperation = (apiOperation[List[Instrument]]("instrument.getIndices")
      summary "Get all price indices."
      parameters()
  )

  get("/instrument/indices",operation(instrument.getIndicesOperation)) {
    
  }

}