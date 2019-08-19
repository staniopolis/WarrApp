package com.lamersoft.userdata

import java.sql.Time

trait LegacyUserCommonData {
  val companyName: String
  val workScheduler: Seq[(String, Time, Time)]
  val googleAccount: String
}
