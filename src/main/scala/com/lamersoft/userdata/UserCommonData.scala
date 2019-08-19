package com.lamersoft.userdata

import java.util.UUID

trait UserCommonData {
  val id: UUID
  val login: String
  val password: String
  val address: String
  val phoneNumber: String
  val addPhoneNumber: String
  val email: String
  val skype: String
  val whatsapp: String
  val telegram: String
  val messenger: String
  val picture: Object
  val active: Boolean
}
