#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
#macro( ccase $str )$str.toLowerCase().replace("-", ".")#end
#set($service_prefix = "#ccase($rootArtifactId)")
package ${package};

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "${service_prefix}")
public class ${short_service_name}AgpServiceConfiguration extends se.skltp.aggregatingservices.configuration.AgpServiceConfiguration {

public static final String SCHEMA_PATH = "/schemas/CHANGE_IT/.wsdl";

  public ${short_service_name}AgpServiceConfiguration() {

    setServiceName("${rootArtifactId}");
    setTargetNamespace("urn:riv:CHANGE_IT");

    // Set inbound defaults
    setInboundServiceURL("http://localhost:CHANGE_IT/CHANGE_IT");
    setInboundServiceWsdl(SCHEMA_PATH);
    setInboundServiceClass(CHANGE_IT.class.getName());
    setInboundPortName(CHANGE_IT.toString());

    // Set outbound defaults
    setOutboundServiceWsdl(SCHEMA_PATH);
    setOutboundServiceClass(CHANGE_IT.class.getName());
    setOutboundPortName(CHANGE_IT.toString());

    // FindContent
    setEiServiceDomain("CHANGE_IT");
    setEiCategorization("CHANGE_IT");

    // TAK
    setTakContract("CHANGE_IT");

    // Set service factory
    setServiceFactoryClass(${short_service_name}AgpServiceFactoryImpl.class.getName());
    }


}
