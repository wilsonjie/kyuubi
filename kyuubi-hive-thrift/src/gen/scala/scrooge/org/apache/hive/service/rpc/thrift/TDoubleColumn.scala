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


object TDoubleColumn extends ValidatingThriftStructCodec3[TDoubleColumn] with StructBuilderFactory[TDoubleColumn] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("TDoubleColumn")
  val ValuesField: TField = new TField("values", TType.LIST, 1)
  val ValuesFieldManifest: Manifest[_root_.scala.collection.Seq[Double]] = implicitly[Manifest[_root_.scala.collection.Seq[Double]]]
  val NullsField: TField = new TField("nulls", TType.STRING, 2)
  val NullsFieldManifest: Manifest[_root_.java.nio.ByteBuffer] = implicitly[Manifest[_root_.java.nio.ByteBuffer]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      ValuesField,
      false,
      true,
      ValuesFieldManifest,
      _root_.scala.None,
      _root_.scala.Some(implicitly[Manifest[Double]]),
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      NullsField,
      false,
      true,
      NullsFieldManifest,
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
    classTag[_root_.scala.collection.Seq[Double]].asInstanceOf[ClassTag[_]],
    classTag[_root_.java.nio.ByteBuffer].asInstanceOf[ClassTag[_]]
  )

  private[this] val structFields: Seq[ThriftStructField[TDoubleColumn]] = {
    Seq(
      new ThriftStructField[TDoubleColumn](
        ValuesField,
        _root_.scala.Some(ValuesFieldManifest),
        classOf[TDoubleColumn]) {
          def getValue[R](struct: TDoubleColumn): R = struct.values.asInstanceOf[R]
      },
      new ThriftStructField[TDoubleColumn](
        NullsField,
        _root_.scala.Some(NullsFieldManifest),
        classOf[TDoubleColumn]) {
          def getValue[R](struct: TDoubleColumn): R = struct.nulls.asInstanceOf[R]
      }
    )
  }

  override lazy val metaData: ThriftStructMetaData[TDoubleColumn] =
    new ThriftStructMetaData(this, structFields, fieldInfos, Seq(), structAnnotations)

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: TDoubleColumn): Unit = {
    if (_item.values == null) throw new TProtocolException("Required field values cannot be null")
    if (_item.nulls == null) throw new TProtocolException("Required field nulls cannot be null")
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: TDoubleColumn): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    if (item.values == null)
      buf += com.twitter.scrooge.validation.MissingRequiredField(fieldInfos.apply(0))
    buf ++= validateField(item.values)
    if (item.nulls == null)
      buf += com.twitter.scrooge.validation.MissingRequiredField(fieldInfos.apply(1))
    buf ++= validateField(item.nulls)
    buf.toList
  }

  def withoutPassthroughFields(original: TDoubleColumn): TDoubleColumn =
    new Immutable(
      values =
        {
          val field = original.values
          field.map { field =>
            field
          }
        },
      nulls =
        {
          val field = original.nulls
          field
        }
    )

  def newBuilder(): StructBuilder[TDoubleColumn] = new TDoubleColumnStructBuilder(_root_.scala.None, fieldTypes)

  override def encode(_item: TDoubleColumn, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): TDoubleColumn = {

    var values: _root_.scala.collection.Seq[Double] = _root_.scala.collection.immutable.Nil
    var _got_values = false
    var nulls: _root_.java.nio.ByteBuffer = null
    var _got_nulls = false

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
              case TType.LIST =>
    
                values = readValuesValue(_iprot)
                _got_values = true
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'values' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
    
                nulls = readNullsValue(_iprot)
                _got_nulls = true
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'nulls' (expected=%s, actual=%s).".format(
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

    if (!_got_values) throw new TProtocolException("Required field 'values' was not found in serialized data for struct TDoubleColumn")
    if (!_got_nulls) throw new TProtocolException("Required field 'nulls' was not found in serialized data for struct TDoubleColumn")
    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      values,
      nulls,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): TDoubleColumn =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[thrift] def eagerDecode(_iprot: TProtocol): TDoubleColumn = {
    var values: _root_.scala.collection.Seq[Double] = _root_.scala.collection.immutable.Nil
    var _got_values = false
    var nulls: _root_.java.nio.ByteBuffer = null
    var _got_nulls = false
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
              case TType.LIST =>
                values = readValuesValue(_iprot)
                _got_values = true
              case _actualType =>
                val _expectedType = TType.LIST
                throw new TProtocolException(
                  "Received wrong type for field 'values' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.STRING =>
                nulls = readNullsValue(_iprot)
                _got_nulls = true
              case _actualType =>
                val _expectedType = TType.STRING
                throw new TProtocolException(
                  "Received wrong type for field 'nulls' (expected=%s, actual=%s).".format(
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

    if (!_got_values) throw new TProtocolException("Required field 'values' was not found in serialized data for struct TDoubleColumn")
    if (!_got_nulls) throw new TProtocolException("Required field 'nulls' was not found in serialized data for struct TDoubleColumn")
    new Immutable(
      values,
      nulls,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    values: _root_.scala.collection.Seq[Double] = _root_.scala.collection.immutable.Nil,
    nulls: _root_.java.nio.ByteBuffer
  ): TDoubleColumn =
    new Immutable(
      values,
      nulls
    )

  def unapply(_item: TDoubleColumn): _root_.scala.Option[_root_.scala.Tuple2[_root_.scala.collection.Seq[Double], _root_.java.nio.ByteBuffer]] = _root_.scala.Some(_item.toTuple)


  @inline private[thrift] def readValuesValue(_iprot: TProtocol): _root_.scala.collection.Seq[Double] = {
    val _list = _iprot.readListBegin()
    if (_list.size == 0) {
      _iprot.readListEnd()
      Nil
    } else {
      val _rv = new _root_.scala.collection.mutable.ArrayBuffer[Double](_list.size)
      var _i = 0
      while (_i < _list.size) {
        _rv += {
          _iprot.readDouble()
        }
        _i += 1
      }
      _iprot.readListEnd()
      _rv
    }
  }

  @inline private def writeValuesField(values_item: _root_.scala.collection.Seq[Double], _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(ValuesField)
    writeValuesValue(values_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeValuesValue(values_item: _root_.scala.collection.Seq[Double], _oprot: TProtocol): Unit = {
    _oprot.writeListBegin(new TList(TType.DOUBLE, values_item.size))
    values_item match {
      case _: IndexedSeq[_] =>
        var _i = 0
        val _size = values_item.size
        while (_i < _size) {
          val values_item_element = values_item(_i)
          _oprot.writeDouble(values_item_element)
          _i += 1
        }
      case _ =>
        values_item.foreach { values_item_element =>
          _oprot.writeDouble(values_item_element)
        }
    }
    _oprot.writeListEnd()
  }

  @inline private[thrift] def readNullsValue(_iprot: TProtocol): _root_.java.nio.ByteBuffer = {
    _iprot.readBinary()
  }

  @inline private def writeNullsField(nulls_item: _root_.java.nio.ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(NullsField)
    writeNullsValue(nulls_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeNullsValue(nulls_item: _root_.java.nio.ByteBuffer, _oprot: TProtocol): Unit = {
    _oprot.writeBinary(nulls_item)
  }


  object Immutable extends ThriftStructCodec3[TDoubleColumn] {
    override def encode(_item: TDoubleColumn, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): TDoubleColumn = TDoubleColumn.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[TDoubleColumn] = TDoubleColumn.metaData
  }

  /**
   * The default read-only implementation of TDoubleColumn.  You typically should not need to
   * directly reference this class; instead, use the TDoubleColumn.apply method to construct
   * new instances.
   */
  class Immutable(
      val values: _root_.scala.collection.Seq[Double],
      val nulls: _root_.java.nio.ByteBuffer,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TDoubleColumn {
    def this(
      values: _root_.scala.collection.Seq[Double] = _root_.scala.collection.immutable.Nil,
      nulls: _root_.java.nio.ByteBuffer
    ) = this(
      values,
      nulls,
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
      val values: _root_.scala.collection.Seq[Double],
      val nulls: _root_.java.nio.ByteBuffer,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TDoubleColumn {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
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
   * This Proxy trait allows you to extend the TDoubleColumn trait with additional state or
   * behavior and implement the read-only methods from TDoubleColumn using an underlying
   * instance.
   */
  trait Proxy extends TDoubleColumn {
    protected def _underlying_TDoubleColumn: TDoubleColumn
    override def values: _root_.scala.collection.Seq[Double] = _underlying_TDoubleColumn.values
    override def nulls: _root_.java.nio.ByteBuffer = _underlying_TDoubleColumn.nulls
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_TDoubleColumn._passthroughFields
  }
}

/**
 * Prefer the companion object's [[org.apache.hive.service.rpc.thrift.TDoubleColumn.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait TDoubleColumn
  extends ThriftStruct
  with _root_.scala.Product2[_root_.scala.collection.Seq[Double], _root_.java.nio.ByteBuffer]
  with ValidatingThriftStruct[TDoubleColumn]
  with java.io.Serializable
{
  import TDoubleColumn._

  def values: _root_.scala.collection.Seq[Double]
  def nulls: _root_.java.nio.ByteBuffer

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: _root_.scala.collection.Seq[Double] = values
  def _2: _root_.java.nio.ByteBuffer = nulls

  def toTuple: _root_.scala.Tuple2[_root_.scala.collection.Seq[Double], _root_.java.nio.ByteBuffer] = {
    (
      values,
      nulls
    )
  }


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
              if (values ne null) {
                writeValuesValue(values, _oprot)
                _root_.scala.Some(TDoubleColumn.ValuesField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (nulls ne null) {
                writeNullsValue(nulls, _oprot)
                _root_.scala.Some(TDoubleColumn.NullsField)
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
  def setField(_blob: TFieldBlob): TDoubleColumn = {
    var values: _root_.scala.collection.Seq[Double] = this.values
    var nulls: _root_.java.nio.ByteBuffer = this.nulls
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        values = readValuesValue(_blob.read)
      case 2 =>
        nulls = readNullsValue(_blob.read)
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      values,
      nulls,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): TDoubleColumn = {
    var values: _root_.scala.collection.Seq[Double] = this.values
    var nulls: _root_.java.nio.ByteBuffer = this.nulls

    _fieldId match {
      case 1 =>
        values = _root_.scala.collection.immutable.Nil
      case 2 =>
        nulls = null
      case _ =>
    }
    new Immutable(
      values,
      nulls,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetValues: TDoubleColumn = unsetField(1)

  def unsetNulls: TDoubleColumn = unsetField(2)


  override def write(_oprot: TProtocol): Unit = {
    TDoubleColumn.validate(this)
    _oprot.writeStructBegin(Struct)
    if (values ne null) writeValuesField(values, _oprot)
    if (nulls ne null) writeNullsField(nulls, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    values: _root_.scala.collection.Seq[Double] = this.values,
    nulls: _root_.java.nio.ByteBuffer = this.nulls,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): TDoubleColumn =
    new Immutable(
      values,
      nulls,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[TDoubleColumn]

  private def _equals(x: TDoubleColumn, y: TDoubleColumn): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[TDoubleColumn])

  override def hashCode: Int = {
    _root_.scala.runtime.ScalaRunTime._hashCode(this)
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => this.values
    case 1 => this.nulls
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "TDoubleColumn"

  def _codec: ValidatingThriftStructCodec3[TDoubleColumn] = TDoubleColumn

  def newBuilder(): StructBuilder[TDoubleColumn] = new TDoubleColumnStructBuilder(_root_.scala.Some(this), fieldTypes)
}

private[thrift] class TDoubleColumnStructBuilder(instance: _root_.scala.Option[TDoubleColumn], fieldTypes: IndexedSeq[ClassTag[_]])
    extends StructBuilder[TDoubleColumn](fieldTypes) {

  def build(): TDoubleColumn = instance match {
    case _root_.scala.Some(i) =>
      TDoubleColumn(
        (if (fieldArray(0) == null) i.values else fieldArray(0)).asInstanceOf[_root_.scala.collection.Seq[Double]],
        (if (fieldArray(1) == null) i.nulls else fieldArray(1)).asInstanceOf[_root_.java.nio.ByteBuffer]
      )
    case _root_.scala.None =>
      if (fieldArray.contains(null)) throw new InvalidFieldsException(structBuildError("TDoubleColumn"))
      else {
        TDoubleColumn(
          fieldArray(0).asInstanceOf[_root_.scala.collection.Seq[Double]],
          fieldArray(1).asInstanceOf[_root_.java.nio.ByteBuffer]
        )
      }
    }
}

