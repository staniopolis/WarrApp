package com.lamersoft.servicedata

import java.util.{Date, UUID}

import com.lamersoft.userdata.ServiceDesk
import com.lamersoft.warrdata.Warranty

final case class ServiceOrder(id: UUID,
                              serviceDesk: ServiceDesk,
                              warranty: Warranty,
                              applicationDate: Date,
                              orderInfo: OrderInfo,
                              activeStatus: Boolean) {

}
