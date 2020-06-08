#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package};

import lombok.extern.log4j.Log4j2;
import org.apache.cxf.message.MessageContentsList;
import org.springframework.stereotype.Service;
import se.skltp.aggregatingservices.data.ProducerTestDataGenerator;


@Log4j2
@Service
public class ServiceTestDataGenerator extends ProducerTestDataGenerator {

	@Override
	public String getPatientId(MessageContentsList messageContentsList) {
		${request_class} request = (${request_class}) messageContentsList.get(1);
		return request.getPatientId()./*change_it*/;
	}

	@Override
	public Object createResponse(Object... responseItems) {
		log.info("Creating a response with {} items", responseItems.length);
		${responce_class} response = new ${responce_class}();
		for (int i = 0; i < responseItems.length; i++) {
			response./*change_it*/

		}

		log.info("response.toString:" + response.toString());

		return response;
	}

	@Override
	public Object createResponseItem(String logicalAddress, String registeredResidentId, String businessObjectId, String time) {

		log.debug("Created ResponseItem for logical-address {}, registeredResidentId {} and businessObjectId {}",
				new Object[]{logicalAddress, registeredResidentId, businessObjectId});

		/*change it*/

		return responseItem;
	}
}
