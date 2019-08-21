package com.lamersoft.uuid

import java.util.UUID

import io.circe.{Decoder, Encoder}

/**
 * Value wrapper class for ids.
 */
class ObjectId(val id: UUID) extends AnyVal {
  override def toString: String = id.toString
}

object ObjectId {
  /** Constructs a new Id with a random id. */
  def apply(): ObjectId = new ObjectId(UUID.randomUUID())

  /** Constructs a new Id with a given id. */
  def apply(id: UUID): ObjectId = new ObjectId(id)

  // custom circe marshaller and unmarshaller so that the id is not wrapped
  implicit val objectIdDecoder: Decoder[ObjectId] = Decoder.decodeUUID.map(ObjectId(_))
  implicit val objectIdEncoder: Encoder[ObjectId] = Encoder.encodeUUID.contramap(_.id)
}
