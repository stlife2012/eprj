package com.stlife

import org.apache.spark.SparkContext

object UserCase {
  def main(args: Array[String]): Unit = {
    print("hello world")
    val sc = new SparkContext("local[1]", "total")
    //    sc.appName
    sc.stop()
  }
}
