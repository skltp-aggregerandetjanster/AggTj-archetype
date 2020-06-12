    #set( $symbol_pound = '#' )
    #set( $symbol_dollar = '$' )
    #set( $symbol_escape = '\' )
    package ${package};

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import riv.clinicalprocess.healthcond.actoutcome.getlaboratoryorderoutcomeresponder.v4.GetLaboratoryOrderOutcomeResponseType;
import se.skltp.aggregatingservices.api.AgpServiceFactory;
import se.skltp.aggregatingservices.serviceTests.CreateAggregatedResponseTest;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ${kort_service_namn}CreateAggregatedResponse extends CreateAggregatedResponseTest {

  private static GALOOAgpServiceConfiguration configuration = new GALOOAgpServiceConfiguration();
  private static AgpServiceFactory<${response_class}> agpServiceFactory = new GALOOAgpServiceFactoryImpl();
  private static ServiceTestDataGenerator testDataGenerator = new ServiceTestDataGenerator();

  public GALOOCreateAggregatedResponse() {
      super(testDataGenerator, agpServiceFactory, configuration);
  }

  @Override
  public int getResponseSize(Object response) {
    GetLaboratoryOrderOutcomeResponseType galooResponse = (GetLaboratoryOrderOutcomeResponseType)response;
    return galooResponse.getLaboratoryOrderOutcome().size();
  }
}