/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.bacon.client.entity;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-03-22")
public class WebRequest implements org.apache.thrift.TBase<WebRequest, WebRequest._Fields>, java.io.Serializable, Cloneable, Comparable<WebRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("WebRequest");

  private static final org.apache.thrift.protocol.TField REQUEST_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("requestType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PARAMETER_FIELD_DESC = new org.apache.thrift.protocol.TField("parameter", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new WebRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new WebRequestTupleSchemeFactory());
  }

  /**
   * 
   * @see RequestType
   */
  public RequestType requestType; // required
  public String parameter; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see RequestType
     */
    REQUEST_TYPE((short)1, "requestType"),
    PARAMETER((short)2, "parameter");

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
        case 1: // REQUEST_TYPE
          return REQUEST_TYPE;
        case 2: // PARAMETER
          return PARAMETER;
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
    tmpMap.put(_Fields.REQUEST_TYPE, new org.apache.thrift.meta_data.FieldMetaData("requestType", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, RequestType.class)));
    tmpMap.put(_Fields.PARAMETER, new org.apache.thrift.meta_data.FieldMetaData("parameter", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(WebRequest.class, metaDataMap);
  }

  public WebRequest() {
  }

  public WebRequest(
    RequestType requestType,
    String parameter)
  {
    this();
    this.requestType = requestType;
    this.parameter = parameter;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WebRequest(WebRequest other) {
    if (other.isSetRequestType()) {
      this.requestType = other.requestType;
    }
    if (other.isSetParameter()) {
      this.parameter = other.parameter;
    }
  }

  public WebRequest deepCopy() {
    return new WebRequest(this);
  }

  @Override
  public void clear() {
    this.requestType = null;
    this.parameter = null;
  }

  /**
   * 
   * @see RequestType
   */
  public RequestType getRequestType() {
    return this.requestType;
  }

  /**
   * 
   * @see RequestType
   */
  public WebRequest setRequestType(RequestType requestType) {
    this.requestType = requestType;
    return this;
  }

  public void unsetRequestType() {
    this.requestType = null;
  }

  /** Returns true if field requestType is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestType() {
    return this.requestType != null;
  }

  public void setRequestTypeIsSet(boolean value) {
    if (!value) {
      this.requestType = null;
    }
  }

  public String getParameter() {
    return this.parameter;
  }

  public WebRequest setParameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

  public void unsetParameter() {
    this.parameter = null;
  }

  /** Returns true if field parameter is set (has been assigned a value) and false otherwise */
  public boolean isSetParameter() {
    return this.parameter != null;
  }

  public void setParameterIsSet(boolean value) {
    if (!value) {
      this.parameter = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUEST_TYPE:
      if (value == null) {
        unsetRequestType();
      } else {
        setRequestType((RequestType)value);
      }
      break;

    case PARAMETER:
      if (value == null) {
        unsetParameter();
      } else {
        setParameter((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST_TYPE:
      return getRequestType();

    case PARAMETER:
      return getParameter();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUEST_TYPE:
      return isSetRequestType();
    case PARAMETER:
      return isSetParameter();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WebRequest)
      return this.equals((WebRequest)that);
    return false;
  }

  public boolean equals(WebRequest that) {
    if (that == null)
      return false;

    boolean this_present_requestType = true && this.isSetRequestType();
    boolean that_present_requestType = true && that.isSetRequestType();
    if (this_present_requestType || that_present_requestType) {
      if (!(this_present_requestType && that_present_requestType))
        return false;
      if (!this.requestType.equals(that.requestType))
        return false;
    }

    boolean this_present_parameter = true && this.isSetParameter();
    boolean that_present_parameter = true && that.isSetParameter();
    if (this_present_parameter || that_present_parameter) {
      if (!(this_present_parameter && that_present_parameter))
        return false;
      if (!this.parameter.equals(that.parameter))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_requestType = true && (isSetRequestType());
    list.add(present_requestType);
    if (present_requestType)
      list.add(requestType.getValue());

    boolean present_parameter = true && (isSetParameter());
    list.add(present_parameter);
    if (present_parameter)
      list.add(parameter);

    return list.hashCode();
  }

  @Override
  public int compareTo(WebRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRequestType()).compareTo(other.isSetRequestType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestType, other.requestType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetParameter()).compareTo(other.isSetParameter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetParameter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.parameter, other.parameter);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("WebRequest(");
    boolean first = true;

    sb.append("requestType:");
    if (this.requestType == null) {
      sb.append("null");
    } else {
      sb.append(this.requestType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("parameter:");
    if (this.parameter == null) {
      sb.append("null");
    } else {
      sb.append(this.parameter);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (requestType == null) {
      throw new TProtocolException("Required field 'requestType' was not present! Struct: " + toString());
    }
    if (parameter == null) {
      throw new TProtocolException("Required field 'parameter' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class WebRequestStandardSchemeFactory implements SchemeFactory {
    public WebRequestStandardScheme getScheme() {
      return new WebRequestStandardScheme();
    }
  }

  private static class WebRequestStandardScheme extends StandardScheme<WebRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, WebRequest struct) throws TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.requestType = com.bacon.client.entity.RequestType.findByValue(iprot.readI32());
              struct.setRequestTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PARAMETER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.parameter = iprot.readString();
              struct.setParameterIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, WebRequest struct) throws TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.requestType != null) {
        oprot.writeFieldBegin(REQUEST_TYPE_FIELD_DESC);
        oprot.writeI32(struct.requestType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.parameter != null) {
        oprot.writeFieldBegin(PARAMETER_FIELD_DESC);
        oprot.writeString(struct.parameter);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class WebRequestTupleSchemeFactory implements SchemeFactory {
    public WebRequestTupleScheme getScheme() {
      return new WebRequestTupleScheme();
    }
  }

  private static class WebRequestTupleScheme extends TupleScheme<WebRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, WebRequest struct) throws TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.requestType.getValue());
      oprot.writeString(struct.parameter);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, WebRequest struct) throws TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.requestType = com.bacon.client.entity.RequestType.findByValue(iprot.readI32());
      struct.setRequestTypeIsSet(true);
      struct.parameter = iprot.readString();
      struct.setParameterIsSet(true);
    }
  }

}
