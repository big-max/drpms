/**
 * FilterCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.types.TWS_Types;

public class FilterCriteria  implements java.io.Serializable {
    private java.lang.String details;

    private java.lang.String[] value;

    private java.lang.String minimum;

    private java.lang.String maximum;

    private java.lang.String dataType;

    public FilterCriteria() {
    }

    public FilterCriteria(
           java.lang.String details,
           java.lang.String[] value,
           java.lang.String minimum,
           java.lang.String maximum,
           java.lang.String dataType) {
           this.details = details;
           this.value = value;
           this.minimum = minimum;
           this.maximum = maximum;
           this.dataType = dataType;
    }


    /**
     * Gets the details value for this FilterCriteria.
     * 
     * @return details
     */
    public java.lang.String getDetails() {
        return details;
    }


    /**
     * Sets the details value for this FilterCriteria.
     * 
     * @param details
     */
    public void setDetails(java.lang.String details) {
        this.details = details;
    }


    /**
     * Gets the value value for this FilterCriteria.
     * 
     * @return value
     */
    public java.lang.String[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this FilterCriteria.
     * 
     * @param value
     */
    public void setValue(java.lang.String[] value) {
        this.value = value;
    }


    /**
     * Gets the minimum value for this FilterCriteria.
     * 
     * @return minimum
     */
    public java.lang.String getMinimum() {
        return minimum;
    }


    /**
     * Sets the minimum value for this FilterCriteria.
     * 
     * @param minimum
     */
    public void setMinimum(java.lang.String minimum) {
        this.minimum = minimum;
    }


    /**
     * Gets the maximum value for this FilterCriteria.
     * 
     * @return maximum
     */
    public java.lang.String getMaximum() {
        return maximum;
    }


    /**
     * Sets the maximum value for this FilterCriteria.
     * 
     * @param maximum
     */
    public void setMaximum(java.lang.String maximum) {
        this.maximum = maximum;
    }


    /**
     * Gets the dataType value for this FilterCriteria.
     * 
     * @return dataType
     */
    public java.lang.String getDataType() {
        return dataType;
    }


    /**
     * Sets the dataType value for this FilterCriteria.
     * 
     * @param dataType
     */
    public void setDataType(java.lang.String dataType) {
        this.dataType = dataType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterCriteria)) return false;
        FilterCriteria other = (FilterCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              this.details.equals(other.getDetails()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue()))) &&
            ((this.minimum==null && other.getMinimum()==null) || 
             (this.minimum!=null &&
              this.minimum.equals(other.getMinimum()))) &&
            ((this.maximum==null && other.getMaximum()==null) || 
             (this.maximum!=null &&
              this.maximum.equals(other.getMaximum()))) &&
            ((this.dataType==null && other.getDataType()==null) || 
             (this.dataType!=null &&
              this.dataType.equals(other.getDataType())));
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
        if (getDetails() != null) {
            _hashCode += getDetails().hashCode();
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMinimum() != null) {
            _hashCode += getMinimum().hashCode();
        }
        if (getMaximum() != null) {
            _hashCode += getMaximum().hashCode();
        }
        if (getDataType() != null) {
            _hashCode += getDataType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "FilterCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "minimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "maximum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "dataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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

}
