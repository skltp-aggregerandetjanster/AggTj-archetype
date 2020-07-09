#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.skltp.aggregatingservices.api.AgpServiceFactory;
import se.skltp.aggregatingservices.tests.CreateRequestListTest;

@RunWith(SpringJUnit4ClassRunner.class)
public class ${short_service_name}CreateRequestListTest extends CreateRequestListTest {

  private static ${short_service_name}AgpServiceConfiguration configuration = new ${short_service_name}AgpServiceConfiguration();
  private static AgpServiceFactory<${response_class}> agpServiceFactory = new ${short_service_name}AgpServiceFactoryImpl();
  private static ServiceTestDataGenerator testDataGenerator = new ServiceTestDataGenerator();


  public ${short_service_name}CreateRequestListTest() {
    super(testDataGenerator, agpServiceFactory, configuration);
  }
}