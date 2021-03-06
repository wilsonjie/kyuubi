/**
 * Generated by Scrooge
 *   version: 19.12.0
 *   rev: dfdb68cf6b9c501dbbe3ae644504bf403ad76bfa
 *   built at: 20191212-171820
 */
package org.apache.hive.service.rpc.thrift

import com.twitter.io.Buf
import com.twitter.scrooge.{
  InvalidFieldsException,
  LazyTProtocol,
  StructBuilder,
  StructBuilderFactory,
  TFieldBlob,
  ThriftStruct,
  ThriftStructCodec3,
  ThriftStructField,
  ThriftStructFieldInfo,
  ThriftStructMetaData,
  ValidatingThriftStruct,
  ValidatingThriftStructCodec3
}
import org.apache.thrift.protocol._
import org.apache.thrift.transport.TMemoryBuffer
import scala.collection.immutable.{Map => immutable$Map}
import scala.collection.mutable.Builder
import scala.reflect.{ClassTag, classTag}


object TI16Value extends ValidatingThriftStructCodec3[TI16Value] with StructBuilderFactory[TI16Value] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("TI16Value")
  val ValueField: TField = new TField("value", TType.I16, 1)
  val ValueFieldManifest: Manifest[Short] = implicitly[Manifest[Short]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      ValueField,
      true,
      false,
      ValueFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    )
  )

  lazy val structAnnotations: immutable$Map[String, String] =
    immutable$Map.empty[String, String]

  private val fieldTypes: IndexedSeq[ClassTag[_]] = IndexedSeq(
    classTag[_root_.scala.Option[Short]].asInstanceOf[ClassTag[_]]
  )

  private[this] val structFields: Seq[ThriftStructField[TI16Value]] = {
    Seq(
      new ThriftStructField[TI16Value](
        ValueField,
        _root_.scala.Some(ValueFieldManifest),
        classOf[TI16Value]) {
          def getValue[R](struct: TI16Value): R = struct.value.asInstanceOf[R]
      }
    )
  }

  override lazy val metaData: ThriftStructMetaData[TI16Value] =
    new ThriftStructMetaData(this, structFields, fieldInfos, Seq(), structAnnotations)

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: TI16Value): Unit = {
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: TI16Value): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    buf ++= validateField(item.value)
    buf.toList
  }

  def withoutPassthroughFields(original: TI16Value): TI16Value =
    new Immutable(
      value =
        {
          val field = original.value
          field.map { field =>
            field
          }
        }
    )

  def newBuilder(): StructBuilder[TI16Value] = new TI16ValueStructBuilder(_root_.scala.None, fieldTypes)

  override def encode(_item: TI16Value, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): TI16Value = {

    var valueOffset: Int = -1

    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false
    val _start_offset = _iprot.offset

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.I16 =>
                valueOffset = _iprot.offsetSkipI16
    
              case _actualType =>
                val _expectedType = TType.I16
                throw new TProtocolException(
                  "Received wrong type for field 'value' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      valueOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): TI16Value =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[thrift] def eagerDecode(_iprot: TProtocol): TI16Value = {
    var value: _root_.scala.Option[Short] = _root_.scala.None
    var _passthroughFields: Builder[(Short, TFieldBlob), immutable$Map[Short, TFieldBlob]] = null
    var _done = false

    _iprot.readStructBegin()
    while (!_done) {
      val _field = _iprot.readFieldBegin()
      if (_field.`type` == TType.STOP) {
        _done = true
      } else {
        _field.id match {
          case 1 =>
            _field.`type` match {
              case TType.I16 =>
                value = _root_.scala.Some(readValueValue(_iprot))
              case _actualType =>
                val _expectedType = TType.I16
                throw new TProtocolException(
                  "Received wrong type for field 'value' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case _ =>
            if (_passthroughFields == null)
              _passthroughFields = immutable$Map.newBuilder[Short, TFieldBlob]
            _passthroughFields += (_field.id -> TFieldBlob.read(_field, _iprot))
        }
        _iprot.readFieldEnd()
      }
    }
    _iprot.readStructEnd()

    new Immutable(
      value,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    value: _root_.scala.Option[Short] = _root_.scala.None
  ): TI16Value =
    new Immutable(
      value
    )

  def unapply(_item: TI16Value): _root_.scala.Option[_root_.scala.Option[Short]] = _root_.scala.Some(_item.value)


  @inline private[thrift] def readValueValue(_iprot: TProtocol): Short = {
    _iprot.readI16()
  }

  @inline private def writeValueField(value_item: Short, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ValueField)
    writeValueValue(value_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeValueValue(value_item: Short, _oprot: TProtocol): Unit = {
    _oprot.writeI16(value_item)
  }


  object Immutable extends ThriftStructCodec3[TI16Value] {
    override def encode(_item: TI16Value, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): TI16Value = TI16Value.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[TI16Value] = TI16Value.metaData
  }

  /**
   * The default read-only implementation of TI16Value.  You typically should not need to
   * directly reference this class; instead, use the TI16Value.apply method to construct
   * new instances.
   */
  class Immutable(
      val value: _root_.scala.Option[Short],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TI16Value {
    def this(
      value: _root_.scala.Option[Short] = _root_.scala.None
    ) = this(
      value,
      immutable$Map.empty[Short, TFieldBlob]
    )
  }

  /**
   * This is another Immutable, this however keeps strings as lazy values that are lazily decoded from the backing
   * array byte on read.
   */
  private[this] class LazyImmutable(
      _proto: LazyTProtocol,
      _buf: Array[Byte],
      _start_offset: Int,
      _end_offset: Int,
      valueOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TI16Value {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val value: _root_.scala.Option[Short] =
      if (valueOffset == -1)
        None
      else {
        Some(_proto.decodeI16(_buf, valueOffset))
      }

    /**
     * Override the super hash code to make it a lazy val rather than def.
     *
     * Calculating the hash code can be expensive, caching it where possible
     * can provide significant performance wins. (Key in a hash map for instance)
     * Usually not safe since the normal constructor will accept a mutable map or
     * set as an arg
     * Here however we control how the class is generated from serialized data.
     * With the class private and the contract that we throw away our mutable references
     * having the hash code lazy here is safe.
     */
    override lazy val hashCode = super.hashCode
  }

  /**
   * This Proxy trait allows you to extend the TI16Value trait with additional state or
   * behavior and implement the read-only methods from TI16Value using an underlying
   * instance.
   */
  trait Proxy extends TI16Value {
    protected def _underlying_TI16Value: TI16Value
    override def value: _root_.scala.Option[Short] = _underlying_TI16Value.value
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_TI16Value._passthroughFields
  }
}

/**
 * Prefer the companion object's [[org.apache.hive.service.rpc.thrift.TI16Value.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait TI16Value
  extends ThriftStruct
  with _root_.scala.Product1[Option[Short]]
  with ValidatingThriftStruct[TI16Value]
  with java.io.Serializable
{
  import TI16Value._

  def value: _root_.scala.Option[Short]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: _root_.scala.Option[Short] = value


  /**
   * Gets a field value encoded as a binary blob using TCompactProtocol.  If the specified field
   * is present in the passthrough map, that value is returned.  Otherwise, if the specified field
   * is known and not optional and set to None, then the field is serialized and returned.
   */
  def getFieldBlob(_fieldId: Short): _root_.scala.Option[TFieldBlob] = {
    lazy val _buff = new TMemoryBuffer(32)
    lazy val _oprot = new TCompactProtocol(_buff)
    _passthroughFields.get(_fieldId) match {
      case blob: _root_.scala.Some[TFieldBlob] => blob
      case _root_.scala.None => {
        val _fieldOpt: _root_.scala.Option[TField] =
          _fieldId match {
            case 1 =>
              if (value.isDefined) {
                writeValueValue(value.get, _oprot)
                _root_.scala.Some(TI16Value.ValueField)
              } else {
                _root_.scala.None
              }
            case _ => _root_.scala.None
          }
        _fieldOpt match {
          case _root_.scala.Some(_field) =>
            _root_.scala.Some(TFieldBlob(_field, Buf.ByteArray.Owned(_buff.getArray())))
          case _root_.scala.None =>
            _root_.scala.None
        }
      }
    }
  }

  /**
   * Collects TCompactProtocol-encoded field values according to `getFieldBlob` into a map.
   */
  def getFieldBlobs(ids: TraversableOnce[Short]): immutable$Map[Short, TFieldBlob] =
    (ids flatMap { id => getFieldBlob(id) map { id -> _ } }).toMap

  /**
   * Sets a field using a TCompactProtocol-encoded binary blob.  If the field is a known
   * field, the blob is decoded and the field is set to the decoded value.  If the field
   * is unknown and passthrough fields are enabled, then the blob will be stored in
   * _passthroughFields.
   */
  def setField(_blob: TFieldBlob): TI16Value = {
    var value: _root_.scala.Option[Short] = this.value
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        value = _root_.scala.Some(readValueValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      value,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): TI16Value = {
    var value: _root_.scala.Option[Short] = this.value

    _fieldId match {
      case 1 =>
        value = _root_.scala.None
      case _ =>
    }
    new Immutable(
      value,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetValue: TI16Value = unsetField(1)


  override def write(_oprot: TProtocol): Unit = {
    TI16Value.validate(this)
    _oprot.writeStructBegin(Struct)
    if (value.isDefined) writeValueField(value.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    value: _root_.scala.Option[Short] = this.value,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): TI16Value =
    new Immutable(
      value,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[TI16Value]

  private def _equals(x: TI16Value, y: TI16Value): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[TI16Value])

  override def hashCode: Int = {
    _root_.scala.runtime.ScalaRunTime._hashCode(this)
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 1

  override def productElement(n: Int): Any = n match {
    case 0 => this.value
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "TI16Value"

  def _codec: ValidatingThriftStructCodec3[TI16Value] = TI16Value

  def newBuilder(): StructBuilder[TI16Value] = new TI16ValueStructBuilder(_root_.scala.Some(this), fieldTypes)
}

private[thrift] class TI16ValueStructBuilder(instance: _root_.scala.Option[TI16Value], fieldTypes: IndexedSeq[ClassTag[_]])
    extends StructBuilder[TI16Value](fieldTypes) {

  def build(): TI16Value = instance match {
    case _root_.scala.Some(i) =>
      TI16Value(
        (if (fieldArray(0) == null) i.value else fieldArray(0)).asInstanceOf[_root_.scala.Option[Short]]
      )
    case _root_.scala.None =>
      if (fieldArray.contains(null)) throw new InvalidFieldsException(structBuildError("TI16Value"))
      else {
        TI16Value(
          fieldArray(0).asInstanceOf[_root_.scala.Option[Short]]
        )
      }
    }
}

