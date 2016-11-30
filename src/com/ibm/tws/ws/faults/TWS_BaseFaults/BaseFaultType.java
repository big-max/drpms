/**
 * BaseFaultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.faults.TWS_BaseFaults;

public class BaseFaultType  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.util.Calendar timestamp;

    private java.lang.String errorCode;

    private com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultTypeDescription[] description;

    private com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultType[] faultCause;

    public BaseFaultType() {
    }

    public BaseFaultType(
           java.util.Calendar timestamp,
           java.lang.String errorCode,
           com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultTypeDescription[] description,
           com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultType[] faultCause) {
        this.timestamp = timestamp;
        this.errorCode = errorCode;
        this.description = description;
        this.faultCause = faultCause;
    }


    /**
     * Gets the timestamp value for this BaseFaultType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this BaseFaultType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the errorCode value for this BaseFaultType.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this BaseFaultType.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the description value for this BaseFaultType.
     * 
     * @return description
     */
    public com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultTypeDescription[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this BaseFaultType.
     * 
     * @param description
     */
    public void setDescription(com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultTypeDescription[] description) {
        this.description = description;
    }

    public com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultTypeDescription getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultTypeDescription _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the faultCause value for this BaseFaultType.
     * 
     * @return faultCause
     */
    public com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultType[] getFaultCause() {
        return faultCause;
    }


    /**
     * Sets the faultCause value for this BaseFaultType.
     * 
     * @param faultCause
     */
    public void setFaultCause(com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultType[] faultCause) {
        this.faultCause = faultCause;
    }

    public com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultType getFaultCause(int i) {
        return this.faultCause[i];
    }

    public void setFaultCause(int i, com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultType _value) {
        this.faultCause[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseFaultType)) return false;
        BaseFaultType other = (BaseFaultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.faultCause==null && other.getFaultCause()==null) || 
             (this.faultCause!=null &&
              java.util.Arrays.equals(this.faultCause, other.getFaultCause())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaultCause() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaultCause());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaultCause(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseFaultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-BaseFaults", "BaseFaultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-BaseFaults", ">BaseFaultType>Description"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultCause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FaultCause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-BaseFaults", "BaseFaultType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
