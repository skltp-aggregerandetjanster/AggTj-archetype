package ${package};

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.apache.camel.test.spring.CamelSpringRunner;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import se.skltp.aggregatingservices.AgServiceFactoryBase;

@RunWith(CamelSpringRunner.class)
@SpringBootTest
public class ${kort_service_namn}AgpServiceFactoryTest {

  private static String patientId = "patientId";
  private static String  sourceSystemHSAId = "sourceSystemHSAId";
  private static int responses = 7;

  private static AgServiceFactoryBase<${request_class}, ${responce_class}> agpServiceFactory;
  private static ${request_class} request;
  private static List<${responce_class}> response ;

  @BeforeClass
  public static void before() {
    agpServiceFactory = new ${kort_service_namn}AgpServiceFactoryImpl();
    request = ${kort_service_namn}TestDataGenerator.generateRequest(patientId, sourceSystemHSAId);
    response = ${kort_service_namn}TestDataGenerator.generateResponse(responses);
  }

  @Test
  public void testGetPatientId() {
    assertEquals(patientId, agpServiceFactory.getPatientId(request));
  }

  @Test
  public void testGetSourceSystemHsaId(){
    assertEquals(sourceSystemHSAId, agpServiceFactory.getSourceSystemHsaId(request));
  }

  @Test

  public void aggregateResponseTest(){
    ${responce_class} responseType = agpServiceFactory.aggregateResponse(response);
    assertEquals(responses, responseType./*change_it*/);
  }


}
