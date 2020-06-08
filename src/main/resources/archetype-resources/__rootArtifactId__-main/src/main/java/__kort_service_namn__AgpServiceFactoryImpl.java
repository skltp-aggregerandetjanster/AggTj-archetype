#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.List;
import lombok.extern.log4j.Log4j2;
import se.skltp.aggregatingservices.AgServiceFactoryBase;

@Log4j2
public class ${kort_service_namn}AgpServiceFactoryImpl extends
    AgServiceFactoryBase<${request_class}, ${responce_class}>{

@Override
public String getPatientId(${request_class}queryObject){
    return /*change_it*/
    }

@Override
public String getSourceSystemHsaId(${request_class}queryObject){
    return /*change_it*/
    }

@Override
public ${responce_class}aggregateResponse(
    List<${responce_class}>aggregatedResponseList){

    ${responce_class}aggregatedResponse=new ${responce_class}();

    /*change_it*/

    return aggregatedResponse;
    }
}

