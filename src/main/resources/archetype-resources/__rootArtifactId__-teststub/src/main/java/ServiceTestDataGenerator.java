#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import lombok.extern.log4j.Log4j2;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Service;
import se.skltp.aggregatingservices.data.TestDataGenerator;

@Log4j2
@Service
public class ServiceTestDataGenerator extends TestDataGenerator {

	@Override
	public String getPatientId(MessageContentsList messageContentsList) {
		${request_class} request = (${request_class}) messageContentsList.get(1);
		String patientId = /*change_it*/
		return patientId;
	}

	@Override
	public Object createResponse(Object... responseItems) {
		log.info("Creating a response with {} items", responseItems.length);
		${response_class} response = new ${response_class}();
		for (int i = 0; i < responseItems.length; i++) {
			/*change_it*/
		}

		log.info("response.toString:" + response.toString());

		return response;
	}

	@Override
	public Object createResponseItem(String logicalAddress, String registeredResidentId, String businessObjectId, String time) {
		log.debug("Created ResponseItem for logical-address {}, registeredResidentId {} and businessObjectId {}",
				new Object[]{logicalAddress, registeredResidentId, businessObjectId});

		/*change_it*/

		return /*change_it*/;
	}

	public Object createRequest(String patientId, String sourceSystemHSAId){
		${request_class} requestType = new ${request_class}();

		/*change_it*/

		return requestType;
	}
}
