/**
 * Dependency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.types.TWS_Types;

public class Dependency  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String type;

    private int jobNumber;

    private int dependencyNumber;

    public Dependency() {
    }

    public Dependency(
           java.lang.String action,
           java.lang.String type,
           int jobNumber,
           int dependencyNumber) {
           this.action = action;
           this.type = type;
           this.jobNumber = jobNumber;
           this.dependencyNumber = dependencyNumber;
    }


    /**
     * Gets the action value for this Dependency.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this Dependency.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the type value for this Dependency.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Dependency.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the jobNumber value for this Dependency.
     * 
     * @return jobNumber
     */
    public int getJobNumber() {
        return jobNumber;
    }


    /**
     * Sets the jobNumber value for this Dependency.
     * 
     * @param jobNumber
     */
    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }


    /**
     * Gets the dependencyNumber value for this Dependency.
     * 
     * @return dependencyNumber
     */
    public int getDependencyNumber() {
        return dependencyNumber;
    }


    /**
     * Sets the dependencyNumber value for this Dependency.
     * 
     * @param dependencyNumber
     */
    public void setDependencyNumber(int dependencyNumber) {
        this.dependencyNumber = dependencyNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dependency)) return false;
        Dependency other = (Dependency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.jobNumber == other.getJobNumber() &&
            this.dependencyNumber == other.getDependencyNumber();
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getJobNumber();
        _hashCode += getDependencyNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dependency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Dependency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependencyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "dependencyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
