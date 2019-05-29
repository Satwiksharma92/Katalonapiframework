<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GLN Approve - EOID</name>
   <tag></tag>
   <elementGuidId>0c6b74a4-7af4-49f1-aabc-972823329cf4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  ${body}\n}\n&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
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
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://${url}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'gs-dv-fit.gs1.org/api/v1/machine/1BC%234000139000007v/approve'</defaultValue>
      <description></description>
      <id>8ca82a97-9c4f-4537-922d-fd2642c23386</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>'POST'</defaultValue>
      <description></description>
      <id>b21e4ea5-14f7-4f01-95e2-b1cd27b7169f</id>
      <masked>false</masked>
      <name>methodforcall</name>
   </variables>
   <variables>
      <defaultValue>'&quot;eoid&quot;: &quot;1BC74000007000009&quot;,\r\n  &quot;fid&quot;: &quot;1BC74000068000000&quot;,\r\n  &quot;serialNumber&quot; : &quot;1AB34&quot;,\r\n  &quot;machineLeased&quot;: &quot;1&quot;,\r\n  &quot;requestDateTime&quot;: &quot;756568765768&quot;'</defaultValue>
      <description></description>
      <id>4eb957c8-fd15-4401-9227-0e6e45b352c5</id>
      <masked>false</masked>
      <name>body</name>
   </variables>
   <variables>
      <defaultValue>'status'</defaultValue>
      <description></description>
      <id>c6ed350f-25f1-456f-9188-2058228aabbb</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>'400'</defaultValue>
      <description></description>
      <id>8ffeb6c3-bd0b-4fd2-a606-f4d05306c13f</id>
      <masked>false</masked>
      <name>statuscode</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>9453e626-6f08-4a30-83c2-86f5850af9fb</id>
      <masked>false</masked>
      <name>message</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>8ab759d4-6381-43c6-bcad-dba9bec5b3fa</id>
      <masked>false</masked>
      <name>messagevalue</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
