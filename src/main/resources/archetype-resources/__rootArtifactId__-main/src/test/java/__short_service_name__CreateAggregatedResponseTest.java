#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.skltp.aggregatingservices.tests.CreateAggregatedResponseTest;


@RunWith(SpringJUnit4ClassRunner.class)
public class ${short_service_name}CreateAggregatedResponseTest extends CreateAggregatedResponseTest {

  public ${short_service_name}CreateAggregatedResponseTest() {
      super(new ServiceTestDataGenerator(), new ${short_service_name}AgpServiceFactoryImpl(), new ${short_service_name}AgpServiceConfiguration());
  }

  @Override
  public int getResponseSize(Object response) {
        ${response_class} responseType = (${response_class})response;
    return responseType./*change_it*/.size();
  }
}