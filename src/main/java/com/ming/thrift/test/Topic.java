/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ming.thrift.test;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-02-16")
public class Topic implements org.apache.thrift.TBase<Topic, Topic._Fields>, java.io.Serializable, Cloneable, Comparable<Topic> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Topic");

  private static final org.apache.thrift.protocol.TField UID_FIELD_DESC = new org.apache.thrift.protocol.TField("uid", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONTENT_FIELD_DESC = new org.apache.thrift.protocol.TField("content", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TopicStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TopicTupleSchemeFactory();

  public int uid; // required
  public String name; // required
  public String content; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UID((short)1, "uid"),
    NAME((short)2, "name"),
    CONTENT((short)3, "content");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // UID
          return UID;
        case 2: // NAME
          return NAME;
        case 3: // CONTENT
          return CONTENT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __UID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.UID, new org.apache.thrift.meta_data.FieldMetaData("uid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENT, new org.apache.thrift.meta_data.FieldMetaData("content", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Topic.class, metaDataMap);
  }

  public Topic() {
  }

  public Topic(
    int uid,
    String name,
    String content)
  {
    this();
    this.uid = uid;
    setUidIsSet(true);
    this.name = name;
    this.content = content;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Topic(Topic other) {
    __isset_bitfield = other.__isset_bitfield;
    this.uid = other.uid;
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetContent()) {
      this.content = other.content;
    }
  }

  public Topic deepCopy() {
    return new Topic(this);
  }

  @Override
  public void clear() {
    setUidIsSet(false);
    this.uid = 0;
    this.name = null;
    this.content = null;
  }

  public int getUid() {
    return this.uid;
  }

  public Topic setUid(int uid) {
    this.uid = uid;
    setUidIsSet(true);
    return this;
  }

  public void unsetUid() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UID_ISSET_ID);
  }

  /** Returns true if field uid is set (has been assigned a value) and false otherwise */
  public boolean isSetUid() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UID_ISSET_ID);
  }

  public void setUidIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UID_ISSET_ID, value);
  }

  public String getName() {
    return this.name;
  }

  public Topic setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getContent() {
    return this.content;
  }

  public Topic setContent(String content) {
    this.content = content;
    return this;
  }

  public void unsetContent() {
    this.content = null;
  }

  /** Returns true if field content is set (has been assigned a value) and false otherwise */
  public boolean isSetContent() {
    return this.content != null;
  }

  public void setContentIsSet(boolean value) {
    if (!value) {
      this.content = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case UID:
      if (value == null) {
        unsetUid();
      } else {
        setUid((Integer)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case CONTENT:
      if (value == null) {
        unsetContent();
      } else {
        setContent((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case UID:
      return getUid();

    case NAME:
      return getName();

    case CONTENT:
      return getContent();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case UID:
      return isSetUid();
    case NAME:
      return isSetName();
    case CONTENT:
      return isSetContent();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Topic)
      return this.equals((Topic)that);
    return false;
  }

  public boolean equals(Topic that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_uid = true;
    boolean that_present_uid = true;
    if (this_present_uid || that_present_uid) {
      if (!(this_present_uid && that_present_uid))
        return false;
      if (this.uid != that.uid)
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_content = true && this.isSetContent();
    boolean that_present_content = true && that.isSetContent();
    if (this_present_content || that_present_content) {
      if (!(this_present_content && that_present_content))
        return false;
      if (!this.content.equals(that.content))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + uid;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + ((isSetContent()) ? 131071 : 524287);
    if (isSetContent())
      hashCode = hashCode * 8191 + content.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Topic other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUid()).compareTo(other.isSetUid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.uid, other.uid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContent()).compareTo(other.isSetContent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.content, other.content);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Topic(");
    boolean first = true;

    sb.append("uid:");
    sb.append(this.uid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("content:");
    if (this.content == null) {
      sb.append("null");
    } else {
      sb.append(this.content);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TopicStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TopicStandardScheme getScheme() {
      return new TopicStandardScheme();
    }
  }

  private static class TopicStandardScheme extends org.apache.thrift.scheme.StandardScheme<Topic> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Topic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.uid = iprot.readI32();
              struct.setUidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.content = iprot.readString();
              struct.setContentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Topic struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(UID_FIELD_DESC);
      oprot.writeI32(struct.uid);
      oprot.writeFieldEnd();
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.content != null) {
        oprot.writeFieldBegin(CONTENT_FIELD_DESC);
        oprot.writeString(struct.content);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TopicTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TopicTupleScheme getScheme() {
      return new TopicTupleScheme();
    }
  }

  private static class TopicTupleScheme extends org.apache.thrift.scheme.TupleScheme<Topic> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Topic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUid()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetContent()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetUid()) {
        oprot.writeI32(struct.uid);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetContent()) {
        oprot.writeString(struct.content);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Topic struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.uid = iprot.readI32();
        struct.setUidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.content = iprot.readString();
        struct.setContentIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
