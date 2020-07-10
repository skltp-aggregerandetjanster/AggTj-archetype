#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import se.skltp.aggregatingservices.tests.CreateFindContentTest;


@RunWith(SpringJUnit4ClassRunner.class)
public class ${short_service_name}CreateFindContentTest extends CreateFindContentTest {

  public ${short_service_name}CreateFindContentTest() {
    super(new ServiceTestDataGenerator(), new ${short_service_name}AgpServiceFactoryImpl(), new ${short_service_name}AgpServiceConfiguration());
  }

}
