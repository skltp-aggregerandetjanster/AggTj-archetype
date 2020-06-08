package ${package};

import java.util.ArrayList;
import java.util.List;
/*change_it */


public class ${kort_service_namn}TestDataGenerator {
  static ${request_class} generateRequest(String patientId, String sourceSystemHSAId) {
    ${request_class} outcomeType = new ${request_class}();

    /* change_it
      exemple:
    IIType patient = new IIType();
    patient.setExtension(patientId);
    patient.setRoot("1.2.3");
    outcomeType.setPatientId(patient);

    IIType sourceSystem = new IIType();
    sourceSystem.setExtension(sourceSystemHSAId);
    sourceSystem.setRoot("1.2.3");
    outcomeType.setSourceSystemHSAId(sourceSystem);
    */
    return outcomeType;

  }

  static List<${responce_class}> generateResponse(int responseNumber){
    List<${responce_class}> response = new ArrayList<${responce_class}>();
    int a = responseNumber/2;
    int b = responseNumber - a;


    ${responce_class} responseTypeA = new ${responce_class}();
    ${responce_class} responseTypeB = new ${responce_class}();

    for (int i = 0; i < a; i++) {
      /*change_it
      exemple:
      LaboratoryOrderOutcomeType outcomeType = new LaboratoryOrderOutcomeType();
      responseTypeA.getLaboratoryOrderOutcome().add(outcomeType);
      */

    }

    for (int i = 0; i < b; i++) {
      /*change_it
      exemple:
      LaboratoryOrderOutcomeType outcomeType = new LaboratoryOrderOutcomeType();
      responseTypeB.getLaboratoryOrderOutcome().add(outcomeType);
      */
    }

    response.add(responseTypeA);
    response.add(responseTypeB);
    return response;
  }



}
