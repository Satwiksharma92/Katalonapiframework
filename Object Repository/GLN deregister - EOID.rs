<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GLN deregister - EOID</name>
   <tag></tag>
   <elementGuidId>211375ee-fd08-4d53-96c4-a48553bf2762</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;&quot;,
  &quot;contentType&quot;: &quot;text/plain&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic T2NwLUFwaW0tU3Vic2NyaXB0aW9uLUtleTo1NDk2MTUwMDdjZTc0YjIyODhlOWI4MzBjYzU4ZmU0MQ==</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Ocp-Apim-Subscription-Key</name>
      <type>Main</type>
      <value>549615007ce74b2288e9b830cc58fe41</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>https://${url}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'gs-dv-fit.gs1.org/api/v1/economicOperator/1BC14000127000002/deregister'</defaultValue>
      <description></description>
      <id>7ead0999-79a6-41b9-9e0c-fd653fe69745</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>cb77776d-e44c-48bc-b7da-68ae76c089ad</id>
      <masked>false</masked>
      <name>methodforcall</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b5d8205e-e052-4efa-9493-d10202eafe7b</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>'409'</defaultValue>
      <description></description>
      <id>9b7ee7ba-c10e-4412-8a22-1f137a4dba2e</id>
      <masked>false</masked>
      <name>statuscode</name>
   </variables>
   <variables>
      <defaultValue>'E012'</defaultValue>
      <description></description>
      <id>4c1b7a9e-6cdc-4066-ad53-5e8776a24c77</id>
      <masked>false</masked>
      <name>messageid</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d9bd716f-f906-427e-a29e-e49b08c6ddbd</id>
      <masked>false</masked>
      <name>messageidvalue</name>
   </variables>
   <variables>
      <defaultValue>'8437000023579'</defaultValue>
      <description></description>
      <id>4c8a8615-fcc4-4122-86cc-04ba37c1fb2b</id>
      <masked>false</masked>
      <name>giai</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable


</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
