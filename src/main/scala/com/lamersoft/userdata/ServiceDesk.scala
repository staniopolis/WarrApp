package com.lamersoft.userdata

import java.sql.Time
import java.util.UUID

import com.lamersoft.servicedata.Brand

final case class ServiceDesk(id: UUID,
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
                             companyName: String,
                             workScheduler: Seq[(String, Time, Time)],
                             googleAccount: String,
                             active: Boolean,
                             brand: Set[Brand])extends UserCommonData with LegacyUserCommonData {

}
