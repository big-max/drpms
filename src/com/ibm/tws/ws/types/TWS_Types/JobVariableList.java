/**
 * JobVariableList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.types.TWS_Types;

public class JobVariableList  implements java.io.Serializable {
    private int jobNumber;

    private com.ibm.tws.ws.types.TWS_Types.Property[] variableList;

    public JobVariableList() {
    }

    public JobVariableList(
           int jobNumber,
           com.ibm.tws.ws.types.TWS_Types.Property[] variableList) {
           this.jobNumber = jobNumber;
           this.variableList = variableList;
    }


    /**
     * Gets the jobNumber value for this JobVariableList.
     * 
     * @return jobNumber
     */
    public int getJobNumber() {
        return jobNumber;
    }


    /**
     * Sets the jobNumber value for this JobVariableList.
     * 
     * @param jobNumber
     */
    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }


    /**
     * Gets the variableList value for this JobVariableList.
     * 
     * @return variableList
     */
    public com.ibm.tws.ws.types.TWS_Types.Property[] getVariableList() {
        return variableList;
    }


    /**
     * Sets the variableList value for this JobVariableList.
     * 
     * @param variableList
     */
    public void setVariableList(com.ibm.tws.ws.types.TWS_Types.Property[] variableList) {
        this.variableList = variableList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobVariableList)) return false;
        JobVariableList other = (JobVariableList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.jobNumber == other.getJobNumber() &&
            ((this.variableList==null && other.getVariableList()==null) || 
             (this.variableList!=null &&
              java.util.Arrays.equals(this.variableList, other.getVariableList())));
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
        _hashCode += getJobNumber();
        if (getVariableList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariableList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariableList(), i);
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
        new org.apache.axis.description.TypeDesc(JobVariableList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobVariableList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "variableList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Property"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Property"));
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
