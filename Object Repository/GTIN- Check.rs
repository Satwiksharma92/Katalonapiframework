<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GTIN- Check</name>
   <tag></tag>
   <elementGuidId>29b0779c-4de5-4b2b-b727-40842445a66f</elementGuidId>
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
   <restUrl>https://${url}?gtin=${gtin}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'gs-dv-fit.gs1.org/api/v1/product/check'</defaultValue>
      <description></description>
      <id>1e20daed-5f50-4481-90fe-581200d3da5e</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>'POST'</defaultValue>
      <description></description>
      <id>1c74db7c-554b-4b64-bc8b-4a0f9bcad9b2</id>
      <masked>false</masked>
      <name>methodforcall</name>
   </variables>
   <variables>
      <defaultValue>'status'</defaultValue>
      <description></description>
      <id>bdb5b9d8-2f24-4df3-843a-e9aa0b308cbd</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>'200'</defaultValue>
      <description></description>
      <id>952071f0-1639-493e-bced-d7142360dcc6</id>
      <masked>false</masked>
      <name>statuscode</name>
   </variables>
   <variables>
      <defaultValue>'messageId'</defaultValue>
      <description></description>
      <id>14abeb0e-f349-4d5b-947d-07e799ce804e</id>
      <masked>false</masked>
      <name>messageid</name>
   </variables>
   <variables>
      <defaultValue>'E012'</defaultValue>
      <description></description>
      <id>a093e61e-16cc-425b-a84b-8f862a7fe1a4</id>
      <masked>false</masked>
      <name>messageidvalue</name>
   </variables>
   <variables>
      <defaultValue>'4000132000004'</defaultValue>
      <description></description>
      <id>549ed7b3-21d6-48fb-891f-2230cbb3ee09</id>
      <masked>false</masked>
      <name>gtin</name>
   </variables>
   <variables>
      <defaultValue>'\r\n  &quot;eoid&quot;: &quot;1BC74000007000009&quot;,\r\n  &quot;brand&quot;: &quot;Ramesh Updated&quot;,\r\n  &quot;grossWeight&quot;: &quot;20.25&quot;,\r\n  &quot;requestDateTime&quot;: &quot;756568765768&quot;'</defaultValue>
      <description></description>
      <id>d4d6ed73-9b99-4535-836f-98dcfb2d9e7b</id>
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
