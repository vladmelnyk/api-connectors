package com.wordnik.client.api

import com.wordnik.client.model.ApiKey
import com.wordnik.client.model.Error
import com.wordnik.client.model.Inline_response_200

import java.io.File

import org.scalatra.{ TypedParamSupport, ScalatraServlet }
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{FileUploadSupport, MultipartConfig, SizeConstraintExceededException}

import scala.collection.JavaConverters._

class ApiKeyApi (implicit val swagger: Swagger) extends ScalatraServlet 
    with FileUploadSupport
    with JacksonJsonSupport
    with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "ApiKeyApi"
  override protected val applicationName: Option[String] = Some("ApiKey")

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val apiKey.getKeysOperation = (apiOperation[List[ApiKey]]("apiKey.getKeys")
      summary "Get your API Keys."
      parameters(queryParam[Boolean]("reverse").description("").optional.defaultValue(false))
  )

  get("/apiKey",operation(apiKey.getKeysOperation)) {
    
    
    
        
      
      val reverse = params.getAs[Boolean]("reverse")
            

    
    println("reverse: " + reverse)
  
  }

  

  val apiKey.createKeyOperation = (apiOperation[ApiKey]("apiKey.createKey")
      summary "Create a new API Key."
      parameters(formParam[String]("name").description("").optional,
        formParam[String]("cidr").description("").optional,
        formParam[String]("permissions").description("").optional,
        formParam[Boolean]("enabled").description("").optional.defaultValue(false),
        formParam[String]("token").description("").optional)
  )

  post("/apiKey",operation(apiKey.createKeyOperation)) {
    
    
    
                
      val name = params.getAs[String]("name")
    

    
    println("name: " + name)
  
    
    
                
      val cidr = params.getAs[String]("cidr")
    

    
    println("cidr: " + cidr)
  
    
    
                
      val permissions = params.getAs[String]("permissions")
    

    
    println("permissions: " + permissions)
  
    
    
                
      val enabled = params.getAs[Boolean]("enabled")
    

    
    println("enabled: " + enabled)
  
    
    
                
      val token = params.getAs[String]("token")
    

    
    println("token: " + token)
  
  }

  

  val apiKey.removeOperation = (apiOperation[Inline_response_200]("apiKey.remove")
      summary "Remove an API Key."
      parameters(formParam[String]("apiKeyID").description(""))
  )

  delete("/apiKey",operation(apiKey.removeOperation)) {
    
    
    
                
      val apiKeyID = params.getAs[String]("apiKeyID")
    

    
    println("apiKeyID: " + apiKeyID)
  
  }

  

  val apiKey.disableOperation = (apiOperation[ApiKey]("apiKey.disable")
      summary "Disable an API Key."
      parameters(formParam[String]("apiKeyID").description(""))
  )

  post("/apiKey/disable",operation(apiKey.disableOperation)) {
    
    
    
                
      val apiKeyID = params.getAs[String]("apiKeyID")
    

    
    println("apiKeyID: " + apiKeyID)
  
  }

  

  val apiKey.enableOperation = (apiOperation[ApiKey]("apiKey.enable")
      summary "Enable an API Key."
      parameters(formParam[String]("apiKeyID").description(""))
  )

  post("/apiKey/enable",operation(apiKey.enableOperation)) {
    
    
    
                
      val apiKeyID = params.getAs[String]("apiKeyID")
    

    
    println("apiKeyID: " + apiKeyID)
  
  }

}