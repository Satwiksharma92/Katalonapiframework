<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GIAI- Check</name>
   <tag></tag>
   <elementGuidId>b0d7500d-0e8e-4700-9eca-26f6e81f13ef</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n ${body}\n}&quot;,
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
   <restUrl>https://${url}?giai=${gln,giaia,gtinparameters}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'gs-dv-fit.gs1.org/api/v1/machine/check'</defaultValue>
      <description></description>
      <id>d63c43cb-6509-4501-b86e-a0c2dcd94553</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>'POST'</defaultValue>
      <description></description>
      <id>dd865d0f-ce28-4cd4-a8de-286a5bee13f5</id>
      <masked>false</masked>
      <name>methodforcall</name>
   </variables>
   <variables>
      <defaultValue>'status'</defaultValue>
      <description></description>
      <id>2c3299a5-d3e0-40be-96c3-f87e7acbef0e</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>'200'</defaultValue>
      <description></description>
      <id>ad8a9607-b127-41d6-a1e6-4d7cd0ba121c</id>
      <masked>false</masked>
      <name>statuscode</name>
   </variables>
   <variables>
      <defaultValue>'E012'</defaultValue>
      <description></description>
      <id>019882bb-3765-4f29-b0be-d3eefa5b71b3</id>
      <masked>false</masked>
      <name>messageid</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b234712b-8dc7-4109-b467-af58f1a5d3c9</id>
      <masked>false</masked>
      <name>messageidvalue</name>
   </variables>
   <variables>
      <defaultValue>'8437000023579'</defaultValue>
      <description></description>
      <id>ee54b97a-5cee-4ee9-8de5-ee2f45fc991f</id>
      <masked>false</masked>
      <name>gln,giaia,gtinparameters</name>
   </variables>
   <variables>
      <defaultValue>'&quot;eoid&quot;: &quot;1BC34000177000007&quot;,\r\n  &quot;fid&quot;: &quot;1BC34000168000009&quot;,\r\n  &quot;serialNumber&quot; : &quot;1AB34&quot;,\r\n  &quot;machineLeased&quot;: &quot;1&quot;,\r\n  &quot;requestDateTime&quot;: &quot;756568765768&quot;'</defaultValue>
      <description></description>
      <id>e5f17d43-6b14-4410-b4c7-b7323c978e76</id>
      <masked>false</masked>
      <name>body</name>
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
