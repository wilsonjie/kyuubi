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


object TGetOperationStatusReq extends ValidatingThriftStructCodec3[TGetOperationStatusReq] with StructBuilderFactory[TGetOperationStatusReq] {
  val NoPassthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty[Short, TFieldBlob]
  val Struct: TStruct = new TStruct("TGetOperationStatusReq")
  val OperationHandleField: TField = new TField("operationHandle", TType.STRUCT, 1)
  val OperationHandleFieldManifest: Manifest[org.apache.hive.service.rpc.thrift.TOperationHandle] = implicitly[Manifest[org.apache.hive.service.rpc.thrift.TOperationHandle]]
  val GetProgressUpdateField: TField = new TField("getProgressUpdate", TType.BOOL, 2)
  val GetProgressUpdateFieldManifest: Manifest[Boolean] = implicitly[Manifest[Boolean]]

  /**
   * Field information in declaration order.
   */
  lazy val fieldInfos: scala.List[ThriftStructFieldInfo] = scala.List[ThriftStructFieldInfo](
    new ThriftStructFieldInfo(
      OperationHandleField,
      false,
      true,
      OperationHandleFieldManifest,
      _root_.scala.None,
      _root_.scala.None,
      immutable$Map.empty[String, String],
      immutable$Map.empty[String, String],
      None
    ),
    new ThriftStructFieldInfo(
      GetProgressUpdateField,
      true,
      false,
      GetProgressUpdateFieldManifest,
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
    classTag[org.apache.hive.service.rpc.thrift.TOperationHandle].asInstanceOf[ClassTag[_]],
    classTag[_root_.scala.Option[Boolean]].asInstanceOf[ClassTag[_]]
  )

  private[this] val structFields: Seq[ThriftStructField[TGetOperationStatusReq]] = {
    Seq(
      new ThriftStructField[TGetOperationStatusReq](
        OperationHandleField,
        _root_.scala.Some(OperationHandleFieldManifest),
        classOf[TGetOperationStatusReq]) {
          def getValue[R](struct: TGetOperationStatusReq): R = struct.operationHandle.asInstanceOf[R]
      },
      new ThriftStructField[TGetOperationStatusReq](
        GetProgressUpdateField,
        _root_.scala.Some(GetProgressUpdateFieldManifest),
        classOf[TGetOperationStatusReq]) {
          def getValue[R](struct: TGetOperationStatusReq): R = struct.getProgressUpdate.asInstanceOf[R]
      }
    )
  }

  override lazy val metaData: ThriftStructMetaData[TGetOperationStatusReq] =
    new ThriftStructMetaData(this, structFields, fieldInfos, Seq(), structAnnotations)

  /**
   * Checks that all required fields are non-null.
   */
  def validate(_item: TGetOperationStatusReq): Unit = {
    if (_item.operationHandle == null) throw new TProtocolException("Required field operationHandle cannot be null")
  }

  /**
   * Checks that the struct is a valid as a new instance. If there are any missing required or
   * construction required fields, return a non-empty list.
   */
  def validateNewInstance(item: TGetOperationStatusReq): scala.Seq[com.twitter.scrooge.validation.Issue] = {
    val buf = scala.collection.mutable.ListBuffer.empty[com.twitter.scrooge.validation.Issue]

    if (item.operationHandle == null)
      buf += com.twitter.scrooge.validation.MissingRequiredField(fieldInfos.apply(0))
    buf ++= validateField(item.operationHandle)
    buf ++= validateField(item.getProgressUpdate)
    buf.toList
  }

  def withoutPassthroughFields(original: TGetOperationStatusReq): TGetOperationStatusReq =
    new Immutable(
      operationHandle =
        {
          val field = original.operationHandle
          org.apache.hive.service.rpc.thrift.TOperationHandle.withoutPassthroughFields(field)
        },
      getProgressUpdate =
        {
          val field = original.getProgressUpdate
          field.map { field =>
            field
          }
        }
    )

  def newBuilder(): StructBuilder[TGetOperationStatusReq] = new TGetOperationStatusReqStructBuilder(_root_.scala.None, fieldTypes)

  override def encode(_item: TGetOperationStatusReq, _oproto: TProtocol): Unit = {
    _item.write(_oproto)
  }


  private[this] def lazyDecode(_iprot: LazyTProtocol): TGetOperationStatusReq = {

    var operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle = null
    var _got_operationHandle = false
    var getProgressUpdateOffset: Int = -1

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
              case TType.STRUCT =>
    
                operationHandle = readOperationHandleValue(_iprot)
                _got_operationHandle = true
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'operationHandle' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.BOOL =>
                getProgressUpdateOffset = _iprot.offsetSkipBool
    
              case _actualType =>
                val _expectedType = TType.BOOL
                throw new TProtocolException(
                  "Received wrong type for field 'getProgressUpdate' (expected=%s, actual=%s).".format(
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

    if (!_got_operationHandle) throw new TProtocolException("Required field 'operationHandle' was not found in serialized data for struct TGetOperationStatusReq")
    new LazyImmutable(
      _iprot,
      _iprot.buffer,
      _start_offset,
      _iprot.offset,
      operationHandle,
      getProgressUpdateOffset,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  override def decode(_iprot: TProtocol): TGetOperationStatusReq =
    _iprot match {
      case i: LazyTProtocol => lazyDecode(i)
      case i => eagerDecode(i)
    }

  private[thrift] def eagerDecode(_iprot: TProtocol): TGetOperationStatusReq = {
    var operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle = null
    var _got_operationHandle = false
    var getProgressUpdate: _root_.scala.Option[Boolean] = _root_.scala.None
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
              case TType.STRUCT =>
                operationHandle = readOperationHandleValue(_iprot)
                _got_operationHandle = true
              case _actualType =>
                val _expectedType = TType.STRUCT
                throw new TProtocolException(
                  "Received wrong type for field 'operationHandle' (expected=%s, actual=%s).".format(
                    ttypeToString(_expectedType),
                    ttypeToString(_actualType)
                  )
                )
            }
          case 2 =>
            _field.`type` match {
              case TType.BOOL =>
                getProgressUpdate = _root_.scala.Some(readGetProgressUpdateValue(_iprot))
              case _actualType =>
                val _expectedType = TType.BOOL
                throw new TProtocolException(
                  "Received wrong type for field 'getProgressUpdate' (expected=%s, actual=%s).".format(
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

    if (!_got_operationHandle) throw new TProtocolException("Required field 'operationHandle' was not found in serialized data for struct TGetOperationStatusReq")
    new Immutable(
      operationHandle,
      getProgressUpdate,
      if (_passthroughFields == null)
        NoPassthroughFields
      else
        _passthroughFields.result()
    )
  }

  def apply(
    operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle,
    getProgressUpdate: _root_.scala.Option[Boolean] = _root_.scala.None
  ): TGetOperationStatusReq =
    new Immutable(
      operationHandle,
      getProgressUpdate
    )

  def unapply(_item: TGetOperationStatusReq): _root_.scala.Option[_root_.scala.Tuple2[org.apache.hive.service.rpc.thrift.TOperationHandle, Option[Boolean]]] = _root_.scala.Some(_item.toTuple)


  @inline private[thrift] def readOperationHandleValue(_iprot: TProtocol): org.apache.hive.service.rpc.thrift.TOperationHandle = {
    org.apache.hive.service.rpc.thrift.TOperationHandle.decode(_iprot)
  }

  @inline private def writeOperationHandleField(operationHandle_item: org.apache.hive.service.rpc.thrift.TOperationHandle, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(OperationHandleField)
    writeOperationHandleValue(operationHandle_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeOperationHandleValue(operationHandle_item: org.apache.hive.service.rpc.thrift.TOperationHandle, _oprot: TProtocol): Unit = {
    operationHandle_item.write(_oprot)
  }

  @inline private[thrift] def readGetProgressUpdateValue(_iprot: TProtocol): Boolean = {
    _iprot.readBool()
  }

  @inline private def writeGetProgressUpdateField(getProgressUpdate_item: Boolean, _oprot: TProtocol): Unit = {
    _oprot.writeFieldBegin(GetProgressUpdateField)
    writeGetProgressUpdateValue(getProgressUpdate_item, _oprot)
    _oprot.writeFieldEnd()
  }

  @inline private def writeGetProgressUpdateValue(getProgressUpdate_item: Boolean, _oprot: TProtocol): Unit = {
    _oprot.writeBool(getProgressUpdate_item)
  }


  object Immutable extends ThriftStructCodec3[TGetOperationStatusReq] {
    override def encode(_item: TGetOperationStatusReq, _oproto: TProtocol): Unit = { _item.write(_oproto) }
    override def decode(_iprot: TProtocol): TGetOperationStatusReq = TGetOperationStatusReq.decode(_iprot)
    override lazy val metaData: ThriftStructMetaData[TGetOperationStatusReq] = TGetOperationStatusReq.metaData
  }

  /**
   * The default read-only implementation of TGetOperationStatusReq.  You typically should not need to
   * directly reference this class; instead, use the TGetOperationStatusReq.apply method to construct
   * new instances.
   */
  class Immutable(
      val operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle,
      val getProgressUpdate: _root_.scala.Option[Boolean],
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TGetOperationStatusReq {
    def this(
      operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle,
      getProgressUpdate: _root_.scala.Option[Boolean] = _root_.scala.None
    ) = this(
      operationHandle,
      getProgressUpdate,
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
      val operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle,
      getProgressUpdateOffset: Int,
      override val _passthroughFields: immutable$Map[Short, TFieldBlob])
    extends TGetOperationStatusReq {

    override def write(_oprot: TProtocol): Unit = {
      _oprot match {
        case i: LazyTProtocol => i.writeRaw(_buf, _start_offset, _end_offset - _start_offset)
        case _ => super.write(_oprot)
      }
    }

    lazy val getProgressUpdate: _root_.scala.Option[Boolean] =
      if (getProgressUpdateOffset == -1)
        None
      else {
        Some(_proto.decodeBool(_buf, getProgressUpdateOffset))
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
   * This Proxy trait allows you to extend the TGetOperationStatusReq trait with additional state or
   * behavior and implement the read-only methods from TGetOperationStatusReq using an underlying
   * instance.
   */
  trait Proxy extends TGetOperationStatusReq {
    protected def _underlying_TGetOperationStatusReq: TGetOperationStatusReq
    override def operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle = _underlying_TGetOperationStatusReq.operationHandle
    override def getProgressUpdate: _root_.scala.Option[Boolean] = _underlying_TGetOperationStatusReq.getProgressUpdate
    override def _passthroughFields: immutable$Map[Short, TFieldBlob] = _underlying_TGetOperationStatusReq._passthroughFields
  }
}

/**
 * Prefer the companion object's [[org.apache.hive.service.rpc.thrift.TGetOperationStatusReq.apply]]
 * for construction if you don't need to specify passthrough fields.
 */
trait TGetOperationStatusReq
  extends ThriftStruct
  with _root_.scala.Product2[org.apache.hive.service.rpc.thrift.TOperationHandle, Option[Boolean]]
  with ValidatingThriftStruct[TGetOperationStatusReq]
  with java.io.Serializable
{
  import TGetOperationStatusReq._

  def operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle
  def getProgressUpdate: _root_.scala.Option[Boolean]

  def _passthroughFields: immutable$Map[Short, TFieldBlob] = immutable$Map.empty

  def _1: org.apache.hive.service.rpc.thrift.TOperationHandle = operationHandle
  def _2: _root_.scala.Option[Boolean] = getProgressUpdate

  def toTuple: _root_.scala.Tuple2[org.apache.hive.service.rpc.thrift.TOperationHandle, Option[Boolean]] = {
    (
      operationHandle,
      getProgressUpdate
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
              if (operationHandle ne null) {
                writeOperationHandleValue(operationHandle, _oprot)
                _root_.scala.Some(TGetOperationStatusReq.OperationHandleField)
              } else {
                _root_.scala.None
              }
            case 2 =>
              if (getProgressUpdate.isDefined) {
                writeGetProgressUpdateValue(getProgressUpdate.get, _oprot)
                _root_.scala.Some(TGetOperationStatusReq.GetProgressUpdateField)
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
  def setField(_blob: TFieldBlob): TGetOperationStatusReq = {
    var operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle = this.operationHandle
    var getProgressUpdate: _root_.scala.Option[Boolean] = this.getProgressUpdate
    var _passthroughFields = this._passthroughFields
    _blob.id match {
      case 1 =>
        operationHandle = readOperationHandleValue(_blob.read)
      case 2 =>
        getProgressUpdate = _root_.scala.Some(readGetProgressUpdateValue(_blob.read))
      case _ => _passthroughFields += (_blob.id -> _blob)
    }
    new Immutable(
      operationHandle,
      getProgressUpdate,
      _passthroughFields
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetField(_fieldId: Short): TGetOperationStatusReq = {
    var operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle = this.operationHandle
    var getProgressUpdate: _root_.scala.Option[Boolean] = this.getProgressUpdate

    _fieldId match {
      case 1 =>
        operationHandle = null
      case 2 =>
        getProgressUpdate = _root_.scala.None
      case _ =>
    }
    new Immutable(
      operationHandle,
      getProgressUpdate,
      _passthroughFields - _fieldId
    )
  }

  /**
   * If the specified field is optional, it is set to None.  Otherwise, if the field is
   * known, it is reverted to its default value; if the field is unknown, it is removed
   * from the passthroughFields map, if present.
   */
  def unsetOperationHandle: TGetOperationStatusReq = unsetField(1)

  def unsetGetProgressUpdate: TGetOperationStatusReq = unsetField(2)


  override def write(_oprot: TProtocol): Unit = {
    TGetOperationStatusReq.validate(this)
    _oprot.writeStructBegin(Struct)
    if (operationHandle ne null) writeOperationHandleField(operationHandle, _oprot)
    if (getProgressUpdate.isDefined) writeGetProgressUpdateField(getProgressUpdate.get, _oprot)
    if (_passthroughFields.nonEmpty) {
      _passthroughFields.values.foreach { _.write(_oprot) }
    }
    _oprot.writeFieldStop()
    _oprot.writeStructEnd()
  }

  def copy(
    operationHandle: org.apache.hive.service.rpc.thrift.TOperationHandle = this.operationHandle,
    getProgressUpdate: _root_.scala.Option[Boolean] = this.getProgressUpdate,
    _passthroughFields: immutable$Map[Short, TFieldBlob] = this._passthroughFields
  ): TGetOperationStatusReq =
    new Immutable(
      operationHandle,
      getProgressUpdate,
      _passthroughFields
    )

  override def canEqual(other: Any): Boolean = other.isInstanceOf[TGetOperationStatusReq]

  private def _equals(x: TGetOperationStatusReq, y: TGetOperationStatusReq): Boolean =
      x.productArity == y.productArity &&
      x.productIterator.sameElements(y.productIterator) &&
      x._passthroughFields == y._passthroughFields

  override def equals(other: Any): Boolean =
    canEqual(other) &&
      _equals(this, other.asInstanceOf[TGetOperationStatusReq])

  override def hashCode: Int = {
    _root_.scala.runtime.ScalaRunTime._hashCode(this)
  }

  override def toString: String = _root_.scala.runtime.ScalaRunTime._toString(this)


  override def productArity: Int = 2

  override def productElement(n: Int): Any = n match {
    case 0 => this.operationHandle
    case 1 => this.getProgressUpdate
    case _ => throw new IndexOutOfBoundsException(n.toString)
  }

  override def productPrefix: String = "TGetOperationStatusReq"

  def _codec: ValidatingThriftStructCodec3[TGetOperationStatusReq] = TGetOperationStatusReq

  def newBuilder(): StructBuilder[TGetOperationStatusReq] = new TGetOperationStatusReqStructBuilder(_root_.scala.Some(this), fieldTypes)
}

private[thrift] class TGetOperationStatusReqStructBuilder(instance: _root_.scala.Option[TGetOperationStatusReq], fieldTypes: IndexedSeq[ClassTag[_]])
    extends StructBuilder[TGetOperationStatusReq](fieldTypes) {

  def build(): TGetOperationStatusReq = instance match {
    case _root_.scala.Some(i) =>
      TGetOperationStatusReq(
        (if (fieldArray(0) == null) i.operationHandle else fieldArray(0)).asInstanceOf[org.apache.hive.service.rpc.thrift.TOperationHandle],
        (if (fieldArray(1) == null) i.getProgressUpdate else fieldArray(1)).asInstanceOf[_root_.scala.Option[Boolean]]
      )
    case _root_.scala.None =>
      if (fieldArray.contains(null)) throw new InvalidFieldsException(structBuildError("TGetOperationStatusReq"))
      else {
        TGetOperationStatusReq(
          fieldArray(0).asInstanceOf[org.apache.hive.service.rpc.thrift.TOperationHandle],
          fieldArray(1).asInstanceOf[_root_.scala.Option[Boolean]]
        )
      }
    }
}

