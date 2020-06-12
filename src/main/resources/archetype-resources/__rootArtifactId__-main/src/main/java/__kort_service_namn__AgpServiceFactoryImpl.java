#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.List;
import lombok.extern.log4j.Log4j2;
import se.skltp.aggregatingservices.AgServiceFactoryBase;

@Log4j2
public class ${kort_service_namn}AgpServiceFactoryImpl extends
    AgServiceFactoryBase<${request_class}, ${response_class}>{

@Override
public String getPatientId(${request_class}queryObject){
    return /*change_it*/
    }

@Override
public String getSourceSystemHsaId(${request_class}queryObject){
    return /*change_it*/
    }

@Override
public ${response_class} aggregateResponse(
    List<${response_class}>aggregatedResponseList){

    ${response_class}aggregatedResponse=new ${response_class}();

    /*change_it*/

    return aggregatedResponse;
    }
}

