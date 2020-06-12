#set( $symbol_pound = '#' )
    #set( $symbol_dollar = '$' )
    #set( $symbol_escape = '\' )
    package ${package};

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.skltp.aggregatingservices.api.AgpServiceFactory;
import se.skltp.aggregatingservices.serviceTests.CreateFindContentTest;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ${kort_service_namn}CreateFindContentTest extends CreateFindContentTest {

  private static ${kort_service_namn}AgpServiceConfiguration configuration = new ${kort_service_namn}AgpServiceConfiguration();
  private static AgpServiceFactory<${response_class}> agpServiceFactory = new ${kort_service_namn}AgpServiceFactoryImpl();
  private static ServiceTestDataGenerator testDataGenerator = new ServiceTestDataGenerator();

  public ${kort_service_namn}CreateFindContentTest() {
    super(testDataGenerator, agpServiceFactory, configuration);
  }

  @BeforeClass
  public static void before() {
    configuration = new ${kort_service_namn}AgpServiceConfiguration();
    agpServiceFactory = new ${kort_service_namn}AgpServiceFactoryImpl();
    agpServiceFactory.setAgpServiceConfiguration(configuration);
  }


}
