package com.bitrex

/**
  * Created by root on 17-5-16.
  */


import com.bittrex.responsebody.GetCurrencies
import com.fasterxml.jackson.databind.ObjectMapper
import spray.json.{JsonParser, RootJsonFormat, DefaultJsonProtocol}

import scalaj.http.Http

object BittrexApi extends App{

  private val body: String = Http("https://bittrex.com/api/v1.1/public/getcurrencies").asString.body

  val mapper: ObjectMapper = new ObjectMapper
  val getCurrencies = mapper.readValue(body, classOf[GetCurrencies])

  println(getCurrencies)





}