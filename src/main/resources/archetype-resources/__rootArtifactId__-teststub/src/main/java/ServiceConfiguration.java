#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
#macro( ccase $str )$str.toLowerCase()#end
#set($short_service_name_lc = "#ccase($short_service_name)")
package ${package};

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import se.skltp.aggregatingservices.config.TestProducerConfiguration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix="${short_service_name_lc}.teststub")
public class ServiceConfiguration extends TestProducerConfiguration {
}
