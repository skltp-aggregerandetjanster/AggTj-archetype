#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "${kort_service_namn}")
public class ${kort_service_namn}AgpServiceConfiguration extends se.skltp.aggregatingservices.configuration.AgpServiceConfiguration {

public static final String SCHEMA_PATH = "CHANGE_IT";

  public ${kort_service_namn}AgpServiceConfiguration() {

    setServiceName("CHANGE_IT");
    setTargetNamespace("urn:riv:CHANGE_IT");

    // Set inbound defaults
    setInboundServiceURL("http://localhost:CHANGE_IT/${artifactId}/CHANGE_IT");
    setInboundServiceWsdl(SCHEMA_PATH);
    setInboundServiceClass(CHANGE_IT.class.getName());

    // Set outbound defaults
    setOutboundServiceURL("http://localhost:CHANGE_IT/vp/${kort_service_namn}");
    setOutboundServiceWsdl(SCHEMA_PATH);
    setOutboundServiceClass(CHANGE_IT.class.getName());

    // FindContent
    setEiServiceDomain("CHANGE_IT");
    setEiCategorization("CHANGE_IT");

    // TAK
    setTakContract("CHANGE_IT");

    // Set service factory
    setServiceFactoryClass(${kort_service_namn}AgpServiceFactoryImpl.class.getName());
    }


    }
