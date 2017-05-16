package com.bitrex

/**
  * Created by root on 17-5-16.
  */
import net.liftweb.json._

import scalaj.http.Http
class BittrexApi {
  implicit val formats = DefaultFormats // Brings in default date formats etc.

  case class Child(name: String, age: Int,
                   birthdate: Option[java.util.Date])
  case class Address(street: String, city: String)
  case class Person(name: String, address: Address,
                    children: List[Child])
  val json = parse("""
         { "name": "joe",
           "address": {
             "street": "Bulevard",
             "city": "Helsinki"
           },
           "children": [
             {
               "name": "Mary",
               "age": 5
               "birthdate": "2004-09-04T18:06:22Z"
             },
             {
               "name": "Mazy",
               "age": 3
             }
           ]
         }
                   """)

  json.extract[Person]
}

object BittrexApi{
  def main(args: Array[String]) {
    Http("http://foo.com/search").param("q", "monkeys").asString
  }
}