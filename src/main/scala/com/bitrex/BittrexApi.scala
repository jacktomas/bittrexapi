package com.bitrex

/**
  * Created by root on 17-5-16.
  */


import com.bittrex.responsebody.GetCurrencies
import com.fasterxml.jackson.databind.ObjectMapper

import scalaj.http.Http

object BittrexApi extends App {

  /*
  * import scalaj.http._

    val response: HttpResponse[String] = Http("http://foo.com/search").param("q","monkeys").asString
    response.body
    response.code
    response.headers
    response.cookies
  * */
  private val body: String = Http("https://bittrex.com/api/v1.1/public/getcurrencies").asString.body

  val mapper: ObjectMapper = new ObjectMapper
  val getCurrencies = mapper.readValue(body, classOf[GetCurrencies])

  println(getCurrencies)


}