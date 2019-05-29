<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>GLN Check - EOID</name>
   <tag></tag>
   <elementGuidId>13d9c771-175b-4858-9d97-1a45b83b59b3</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  ${body}\n}&quot;,
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
      <name>Ocp-Apim-Subscription-Key</name>
      <type>Main</type>
      <value>549615007ce74b2288e9b830cc58fe41</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
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
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://${url}?${urlvalue}=${glngtingiaiparameters}</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>'4891001000153'</defaultValue>
      <description></description>
      <id>5623bcb2-9475-4ac4-a92d-1679649617a9</id>
      <masked>false</masked>
      <name>glngtingiaiparameters</name>
   </variables>
   <variables>
      <defaultValue>'gs-dv-fit.gs1.org/api/v1/product/check'</defaultValue>
      <description></description>
      <id>d94c00ad-59a6-44a5-a661-39a0663875af</id>
      <masked>false</masked>
      <name>url</name>
   </variables>
   <variables>
      <defaultValue>'&quot;eoid&quot;: &quot;1BC74000007000009&quot;,\n  &quot;brand&quot;: &quot;Ramesh Updated&quot;,\n  &quot;grossWeight&quot;: &quot;20.25&quot;,\n  &quot;requestDateTime&quot;: &quot;756568765768&quot;'</defaultValue>
      <description></description>
      <id>fa37e7c3-8771-4ea6-983b-96ecc538303f</id>
      <masked>false</masked>
      <name>body</name>
   </variables>
   <variables>
      <defaultValue>'POST'</defaultValue>
      <description></description>
      <id>03833443-72c8-43a1-91f2-9ba40164d919</id>
      <masked>false</masked>
      <name>methodforcall</name>
   </variables>
   <variables>
      <defaultValue>'status'</defaultValue>
      <description></description>
      <id>9d4e42eb-490d-4785-937d-2586d26fbb17</id>
      <masked>false</masked>
      <name>status</name>
   </variables>
   <variables>
      <defaultValue>'200'</defaultValue>
      <description></description>
      <id>5cfeec3f-d330-42a5-b99e-077fcf9349dd</id>
      <masked>false</masked>
      <name>statuscode</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f2190f7b-36ce-43b3-8bcf-e030fecc8710</id>
      <masked>false</masked>
      <name>messageid</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>ab7e83c0-ea0a-4dc4-b5e0-9390ed9f6aa2</id>
      <masked>false</masked>
      <name>messageidvalue</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e7fc2a4d-bc23-4443-a337-fbb2d1c7d9c0</id>
      <masked>false</masked>
      <name>companyname</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f671b2e8-0a31-43ac-85fb-2c969971ce16</id>
      <masked>false</masked>
      <name>companynamevalue</name>
   </variables>
   <variables>
      <defaultValue>'gtin'</defaultValue>
      <description></description>
      <id>c169d2f6-6cea-4e12-93d5-aab9f7ae7157</id>
      <masked>false</masked>
      <name>urlvalue</name>
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
