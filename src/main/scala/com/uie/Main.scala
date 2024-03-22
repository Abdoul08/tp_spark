package com.uie
import com.uie.commons.sparkutils.{get_sparkSession}
import org.apache.spark.sql.DataFrame

object main {

  def main(args: Array[String]): Unit ={

    val spark = get_sparkSession("spark lesson exemples")

   // val data = spark.sql("select 1+1;")
   // val data = spark.read.csv(path="/opt/spark-data/tp1.csv")
   val data = spark.read.option("header","true").option("delimiter",",").csv(path="/opt/spark-data/tp1.csv")
    data.show()
    val d2=data.filter("v2='whistle'").filter("v4='replace'")
    println("Calcul de D2")
    d2.show()
    val d3=data.filter("v5='action'")
    println("Calcul de D3")
    d3.show()
    val d4=data.filter("v8='baby'")
    println("Calcul de D4")
    d4.show()

    spark.stop()
  }
}
