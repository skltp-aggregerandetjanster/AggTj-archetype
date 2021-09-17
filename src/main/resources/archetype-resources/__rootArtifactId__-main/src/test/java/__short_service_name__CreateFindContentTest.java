#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import se.skltp.aggregatingservices.tests.CreateFindContentTest;


@ExtendWith(SpringExtension.class)
public class ${short_service_name}CreateFindContentTest extends CreateFindContentTest {

  public ${short_service_name}CreateFindContentTest() {
    super(new ServiceTestDataGenerator(), new ${short_service_name}AgpServiceFactoryImpl(), new ${short_service_name}AgpServiceConfiguration());
  }

}
