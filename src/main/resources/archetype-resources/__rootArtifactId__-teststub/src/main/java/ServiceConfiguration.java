#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
#macro( ccase $str )$str.toLowerCase()#end
#set($service_prefix = "#ccase($rootArtifactId)" + ".v" + "$contract_version")
package ${package};

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import se.skltp.aggregatingservices.config.TestProducerConfiguration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="${service_prefix}.teststub")
public class ServiceConfiguration extends TestProducerConfiguration {

  public static final String SCHEMA_PATH = "/schemas/CHANGE_IT/.wsdl";

  public ServiceConfiguration() {
    setProducerAddress("CHANGE_IT");
    setServiceClass(CHANGE_IT.class.getName());
    setServiceNamespace("urn:riv:CHANGE_IT");
    setPortName(CHANGE_IT.toString());
    setWsdlPath(SCHEMA_PATH);
    setTestDataGeneratorClass(ServiceTestDataGenerator.class.getName());
  }

}
