/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.cassandra.thrift;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TokenRange implements org.apache.thrift.TBase<TokenRange, TokenRange._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TokenRange");

  private static final org.apache.thrift.protocol.TField START_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("start_token", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField END_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("end_token", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ENDPOINTS_FIELD_DESC = new org.apache.thrift.protocol.TField("endpoints", org.apache.thrift.protocol.TType.LIST, (short)3);

  public String start_token;
  public String end_token;
  public List<String> endpoints;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    START_TOKEN((short)1, "start_token"),
    END_TOKEN((short)2, "end_token"),
    ENDPOINTS((short)3, "endpoints");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // START_TOKEN
          return START_TOKEN;
        case 2: // END_TOKEN
          return END_TOKEN;
        case 3: // ENDPOINTS
          return ENDPOINTS;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.START_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("start_token", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.END_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("end_token", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENDPOINTS, new org.apache.thrift.meta_data.FieldMetaData("endpoints", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TokenRange.class, metaDataMap);
  }

  public TokenRange() {
  }

  public TokenRange(
    String start_token,
    String end_token,
    List<String> endpoints)
  {
    this();
    this.start_token = start_token;
    this.end_token = end_token;
    this.endpoints = endpoints;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TokenRange(TokenRange other) {
    if (other.isSetStart_token()) {
      this.start_token = other.start_token;
    }
    if (other.isSetEnd_token()) {
      this.end_token = other.end_token;
    }
    if (other.isSetEndpoints()) {
      List<String> __this__endpoints = new ArrayList<String>();
      for (String other_element : other.endpoints) {
        __this__endpoints.add(other_element);
      }
      this.endpoints = __this__endpoints;
    }
  }

  public TokenRange deepCopy() {
    return new TokenRange(this);
  }

  @Override
  public void clear() {
    this.start_token = null;
    this.end_token = null;
    this.endpoints = null;
  }

  public String getStart_token() {
    return this.start_token;
  }

  public TokenRange setStart_token(String start_token) {
    this.start_token = start_token;
    return this;
  }

  public void unsetStart_token() {
    this.start_token = null;
  }

  /** Returns true if field start_token is set (has been assigned a value) and false otherwise */
  public boolean isSetStart_token() {
    return this.start_token != null;
  }

  public void setStart_tokenIsSet(boolean value) {
    if (!value) {
      this.start_token = null;
    }
  }

  public String getEnd_token() {
    return this.end_token;
  }

  public TokenRange setEnd_token(String end_token) {
    this.end_token = end_token;
    return this;
  }

  public void unsetEnd_token() {
    this.end_token = null;
  }

  /** Returns true if field end_token is set (has been assigned a value) and false otherwise */
  public boolean isSetEnd_token() {
    return this.end_token != null;
  }

  public void setEnd_tokenIsSet(boolean value) {
    if (!value) {
      this.end_token = null;
    }
  }

  public int getEndpointsSize() {
    return (this.endpoints == null) ? 0 : this.endpoints.size();
  }

  public java.util.Iterator<String> getEndpointsIterator() {
    return (this.endpoints == null) ? null : this.endpoints.iterator();
  }

  public void addToEndpoints(String elem) {
    if (this.endpoints == null) {
      this.endpoints = new ArrayList<String>();
    }
    this.endpoints.add(elem);
  }

  public List<String> getEndpoints() {
    return this.endpoints;
  }

  public TokenRange setEndpoints(List<String> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public void unsetEndpoints() {
    this.endpoints = null;
  }

  /** Returns true if field endpoints is set (has been assigned a value) and false otherwise */
  public boolean isSetEndpoints() {
    return this.endpoints != null;
  }

  public void setEndpointsIsSet(boolean value) {
    if (!value) {
      this.endpoints = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case START_TOKEN:
      if (value == null) {
        unsetStart_token();
      } else {
        setStart_token((String)value);
      }
      break;

    case END_TOKEN:
      if (value == null) {
        unsetEnd_token();
      } else {
        setEnd_token((String)value);
      }
      break;

    case ENDPOINTS:
      if (value == null) {
        unsetEndpoints();
      } else {
        setEndpoints((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case START_TOKEN:
      return getStart_token();

    case END_TOKEN:
      return getEnd_token();

    case ENDPOINTS:
      return getEndpoints();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case START_TOKEN:
      return isSetStart_token();
    case END_TOKEN:
      return isSetEnd_token();
    case ENDPOINTS:
      return isSetEndpoints();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TokenRange)
      return this.equals((TokenRange)that);
    return false;
  }

  public boolean equals(TokenRange that) {
    if (that == null)
      return false;

    boolean this_present_start_token = true && this.isSetStart_token();
    boolean that_present_start_token = true && that.isSetStart_token();
    if (this_present_start_token || that_present_start_token) {
      if (!(this_present_start_token && that_present_start_token))
        return false;
      if (!this.start_token.equals(that.start_token))
        return false;
    }

    boolean this_present_end_token = true && this.isSetEnd_token();
    boolean that_present_end_token = true && that.isSetEnd_token();
    if (this_present_end_token || that_present_end_token) {
      if (!(this_present_end_token && that_present_end_token))
        return false;
      if (!this.end_token.equals(that.end_token))
        return false;
    }

    boolean this_present_endpoints = true && this.isSetEndpoints();
    boolean that_present_endpoints = true && that.isSetEndpoints();
    if (this_present_endpoints || that_present_endpoints) {
      if (!(this_present_endpoints && that_present_endpoints))
        return false;
      if (!this.endpoints.equals(that.endpoints))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(TokenRange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TokenRange typedOther = (TokenRange)other;

    lastComparison = Boolean.valueOf(isSetStart_token()).compareTo(typedOther.isSetStart_token());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStart_token()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.start_token, typedOther.start_token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEnd_token()).compareTo(typedOther.isSetEnd_token());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnd_token()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.end_token, typedOther.end_token);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndpoints()).compareTo(typedOther.isSetEndpoints());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndpoints()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.endpoints, typedOther.endpoints);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // START_TOKEN
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.start_token = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // END_TOKEN
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.end_token = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ENDPOINTS
          if (field.type == org.apache.thrift.protocol.TType.LIST) {
            {
              org.apache.thrift.protocol.TList _list20 = iprot.readListBegin();
              this.endpoints = new ArrayList<String>(_list20.size);
              for (int _i21 = 0; _i21 < _list20.size; ++_i21)
              {
                String _elem22;
                _elem22 = iprot.readString();
                this.endpoints.add(_elem22);
              }
              iprot.readListEnd();
            }
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.start_token != null) {
      oprot.writeFieldBegin(START_TOKEN_FIELD_DESC);
      oprot.writeString(this.start_token);
      oprot.writeFieldEnd();
    }
    if (this.end_token != null) {
      oprot.writeFieldBegin(END_TOKEN_FIELD_DESC);
      oprot.writeString(this.end_token);
      oprot.writeFieldEnd();
    }
    if (this.endpoints != null) {
      oprot.writeFieldBegin(ENDPOINTS_FIELD_DESC);
      {
        oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, this.endpoints.size()));
        for (String _iter23 : this.endpoints)
        {
          oprot.writeString(_iter23);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TokenRange(");
    boolean first = true;

    sb.append("start_token:");
    if (this.start_token == null) {
      sb.append("null");
    } else {
      sb.append(this.start_token);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("end_token:");
    if (this.end_token == null) {
      sb.append("null");
    } else {
      sb.append(this.end_token);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("endpoints:");
    if (this.endpoints == null) {
      sb.append("null");
    } else {
      sb.append(this.endpoints);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (start_token == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'start_token' was not present! Struct: " + toString());
    }
    if (end_token == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'end_token' was not present! Struct: " + toString());
    }
    if (endpoints == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'endpoints' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

