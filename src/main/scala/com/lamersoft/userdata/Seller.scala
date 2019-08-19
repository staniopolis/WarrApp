package com.lamersoft.userdata

import java.sql.Time
import java.util.UUID

final case class Seller(id: UUID,
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
                        active: Boolean) extends UserCommonData with LegacyUserCommonData {

}
