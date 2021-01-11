/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package io.buman.curd;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-01-08")
public class UserInsertDto implements org.apache.thrift.TBase<UserInsertDto, UserInsertDto._Fields>, java.io.Serializable, Cloneable, Comparable<UserInsertDto> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserInsertDto");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField AGE_FIELD_DESC = new org.apache.thrift.protocol.TField("age", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField GENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("gender", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField ADDR_FIELD_DESC = new org.apache.thrift.protocol.TField("addr", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UserInsertDtoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UserInsertDtoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String name; // required
  public int age; // required
  /**
   * 
   * @see GenderEnum
   */
  public @org.apache.thrift.annotation.Nullable GenderEnum gender; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String addr; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    AGE((short)2, "age"),
    /**
     * 
     * @see GenderEnum
     */
    GENDER((short)3, "gender"),
    ADDR((short)4, "addr");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // AGE
          return AGE;
        case 3: // GENDER
          return GENDER;
        case 4: // ADDR
          return ADDR;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __AGE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ADDR};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AGE, new org.apache.thrift.meta_data.FieldMetaData("age", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.GENDER, new org.apache.thrift.meta_data.FieldMetaData("gender", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, GenderEnum.class)));
    tmpMap.put(_Fields.ADDR, new org.apache.thrift.meta_data.FieldMetaData("addr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserInsertDto.class, metaDataMap);
  }

  public UserInsertDto() {
  }

  public UserInsertDto(
    java.lang.String name,
    int age,
    GenderEnum gender)
  {
    this();
    this.name = name;
    this.age = age;
    setAgeIsSet(true);
    this.gender = gender;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserInsertDto(UserInsertDto other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.age = other.age;
    if (other.isSetGender()) {
      this.gender = other.gender;
    }
    if (other.isSetAddr()) {
      this.addr = other.addr;
    }
  }

  public UserInsertDto deepCopy() {
    return new UserInsertDto(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setAgeIsSet(false);
    this.age = 0;
    this.gender = null;
    this.addr = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getName() {
    return this.name;
  }

  public UserInsertDto setName(@org.apache.thrift.annotation.Nullable java.lang.String name) {
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

  public int getAge() {
    return this.age;
  }

  public UserInsertDto setAge(int age) {
    this.age = age;
    setAgeIsSet(true);
    return this;
  }

  public void unsetAge() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  /** Returns true if field age is set (has been assigned a value) and false otherwise */
  public boolean isSetAge() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AGE_ISSET_ID);
  }

  public void setAgeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AGE_ISSET_ID, value);
  }

  /**
   * 
   * @see GenderEnum
   */
  @org.apache.thrift.annotation.Nullable
  public GenderEnum getGender() {
    return this.gender;
  }

  /**
   * 
   * @see GenderEnum
   */
  public UserInsertDto setGender(@org.apache.thrift.annotation.Nullable GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  public void unsetGender() {
    this.gender = null;
  }

  /** Returns true if field gender is set (has been assigned a value) and false otherwise */
  public boolean isSetGender() {
    return this.gender != null;
  }

  public void setGenderIsSet(boolean value) {
    if (!value) {
      this.gender = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getAddr() {
    return this.addr;
  }

  public UserInsertDto setAddr(@org.apache.thrift.annotation.Nullable java.lang.String addr) {
    this.addr = addr;
    return this;
  }

  public void unsetAddr() {
    this.addr = null;
  }

  /** Returns true if field addr is set (has been assigned a value) and false otherwise */
  public boolean isSetAddr() {
    return this.addr != null;
  }

  public void setAddrIsSet(boolean value) {
    if (!value) {
      this.addr = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((java.lang.String)value);
      }
      break;

    case AGE:
      if (value == null) {
        unsetAge();
      } else {
        setAge((java.lang.Integer)value);
      }
      break;

    case GENDER:
      if (value == null) {
        unsetGender();
      } else {
        setGender((GenderEnum)value);
      }
      break;

    case ADDR:
      if (value == null) {
        unsetAddr();
      } else {
        setAddr((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case AGE:
      return getAge();

    case GENDER:
      return getGender();

    case ADDR:
      return getAddr();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case AGE:
      return isSetAge();
    case GENDER:
      return isSetGender();
    case ADDR:
      return isSetAddr();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UserInsertDto)
      return this.equals((UserInsertDto)that);
    return false;
  }

  public boolean equals(UserInsertDto that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_age = true;
    boolean that_present_age = true;
    if (this_present_age || that_present_age) {
      if (!(this_present_age && that_present_age))
        return false;
      if (this.age != that.age)
        return false;
    }

    boolean this_present_gender = true && this.isSetGender();
    boolean that_present_gender = true && that.isSetGender();
    if (this_present_gender || that_present_gender) {
      if (!(this_present_gender && that_present_gender))
        return false;
      if (!this.gender.equals(that.gender))
        return false;
    }

    boolean this_present_addr = true && this.isSetAddr();
    boolean that_present_addr = true && that.isSetAddr();
    if (this_present_addr || that_present_addr) {
      if (!(this_present_addr && that_present_addr))
        return false;
      if (!this.addr.equals(that.addr))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
    if (isSetName())
      hashCode = hashCode * 8191 + name.hashCode();

    hashCode = hashCode * 8191 + age;

    hashCode = hashCode * 8191 + ((isSetGender()) ? 131071 : 524287);
    if (isSetGender())
      hashCode = hashCode * 8191 + gender.getValue();

    hashCode = hashCode * 8191 + ((isSetAddr()) ? 131071 : 524287);
    if (isSetAddr())
      hashCode = hashCode * 8191 + addr.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UserInsertDto other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAge()).compareTo(other.isSetAge());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAge()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.age, other.age);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGender()).compareTo(other.isSetGender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.gender, other.gender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAddr()).compareTo(other.isSetAddr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.addr, other.addr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UserInsertDto(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("age:");
    sb.append(this.age);
    first = false;
    if (!first) sb.append(", ");
    sb.append("gender:");
    if (this.gender == null) {
      sb.append("null");
    } else {
      sb.append(this.gender);
    }
    first = false;
    if (isSetAddr()) {
      if (!first) sb.append(", ");
      sb.append("addr:");
      if (this.addr == null) {
        sb.append("null");
      } else {
        sb.append(this.addr);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (name == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'age' because it's a primitive and you chose the non-beans generator.
    if (gender == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'gender' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class UserInsertDtoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserInsertDtoStandardScheme getScheme() {
      return new UserInsertDtoStandardScheme();
    }
  }

  private static class UserInsertDtoStandardScheme extends org.apache.thrift.scheme.StandardScheme<UserInsertDto> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UserInsertDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // AGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.age = iprot.readI32();
              struct.setAgeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.gender = io.buman.curd.GenderEnum.findByValue(iprot.readI32());
              struct.setGenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ADDR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.addr = iprot.readString();
              struct.setAddrIsSet(true);
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
      if (!struct.isSetAge()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'age' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, UserInsertDto struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AGE_FIELD_DESC);
      oprot.writeI32(struct.age);
      oprot.writeFieldEnd();
      if (struct.gender != null) {
        oprot.writeFieldBegin(GENDER_FIELD_DESC);
        oprot.writeI32(struct.gender.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.addr != null) {
        if (struct.isSetAddr()) {
          oprot.writeFieldBegin(ADDR_FIELD_DESC);
          oprot.writeString(struct.addr);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UserInsertDtoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UserInsertDtoTupleScheme getScheme() {
      return new UserInsertDtoTupleScheme();
    }
  }

  private static class UserInsertDtoTupleScheme extends org.apache.thrift.scheme.TupleScheme<UserInsertDto> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UserInsertDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.name);
      oprot.writeI32(struct.age);
      oprot.writeI32(struct.gender.getValue());
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAddr()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetAddr()) {
        oprot.writeString(struct.addr);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UserInsertDto struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.name = iprot.readString();
      struct.setNameIsSet(true);
      struct.age = iprot.readI32();
      struct.setAgeIsSet(true);
      struct.gender = io.buman.curd.GenderEnum.findByValue(iprot.readI32());
      struct.setGenderIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.addr = iprot.readString();
        struct.setAddrIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

