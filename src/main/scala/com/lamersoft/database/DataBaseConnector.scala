package com.lamersoft.database

import com.datastax.oss.driver.api.core.{CqlSession}
import com.datastax.oss.driver.api.querybuilder.QueryBuilder._


class DataBaseConnector {
  val session = CqlSession.builder.build
    val insert = insertInto("warrapp", "warranty")
      .value("id", now())
      .value("seller", literal("Roga i kopita"))
      .value("customer", literal("Loshara"))
      .value("product", literal("hernya"))
      .value("duration", literal(12))
    val statement = insert.build
    val rs = session.execute(statement)
  try {
    val query = selectFrom("warrapp", "warranty")
      .column("id")
      .column("customer")
      .column("product")
      .all().allowFiltering()
      .whereColumn("customer").isEqualTo(literal("Loshara"))
    val statement = query.build
    val rs = session.execute(statement)
    val row = rs.all()
    val it = row.iterator()
    while (it.hasNext) {
      val row = it.next()
      println(row.getUuid("id") + " " + row.getString("customer") + " " + row.getString("product"))
    }
    //      println(row.getString(_."product")))
  } finally if (session != null) session.close()
}
