package com.lamersoft.warrdata

import java.util.{Currency, Date, UUID}

import com.lamersoft.servicedata.Product
import com.lamersoft.userdata.{Customer, Seller}

final case class Warranty(id: UUID,
                          seller: Seller,
                          customer: Customer,
                          product: Product,
                          serialNumber: String,
                          purchasePrice: Double,
                          purchaseCurrency: Currency,
                          purchaseDate: Date,
                          expireDate: Date,
                          active: Boolean)
