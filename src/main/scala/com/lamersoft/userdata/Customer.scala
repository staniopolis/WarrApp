package com.lamersoft.userdata

import java.util.UUID

final case class Customer(id: UUID,
                          login: String,
                          password: String,
                          picture: Object,
                          address: String,
                          phoneNumber: String,
                          addPhoneNumber: String,
                          email: String,
                          skype: String,
                          whatsapp: String,
                          telegram: String,
                          messenger: String,
                          firstName: String,
                          lastName: String,
                          active: Boolean) extends UserCommonData {

}
