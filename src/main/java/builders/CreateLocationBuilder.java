package builders;


import entities.request.Address;
import entities.request.CreateLocationRequest;
import entities.request.Custom;
import entities.request.Teams;

public class CreateLocationBuilder {

    private CreateLocationRequest createLocationRequest = new CreateLocationRequest();

    public CreateLocationBuilder withId(String id) {
        createLocationRequest.setId(id);
        return this;
    }

    public CreateLocationBuilder withClientId(String clientId){
        createLocationRequest.setClientId(clientId);
        return this;
    }

    public CreateLocationBuilder withCode(String code) {
        createLocationRequest.setCode(code);
        return this;
    }

    public CreateLocationBuilder withname(String name){
        createLocationRequest.setName(name);
        return this;
    }

    public CreateLocationBuilder withtype(String type) {
        createLocationRequest.setType(type);
        return this;
    }

//    public CreateLocationBuilder withteam(Teams cli){
//        createLocationRequest.set(teams);
//        return this;
//    }
//
//    public CreateLocationBuilder withaddress(String []address) {
//        createLocationRequest.setAddress(address);
//        return this;
//    }
//
//    public CreateLocationBuilder withtimeSlots(String []timeSlots){
//        createLocationRequest.setTimeSlots(timeSlots);
//        return this;
//    }

//    public CreateLocationBuilder withAddresa(Address placename) {
//        createLocationRequest.
//        return this;
//    }

    public CreateLocationBuilder withskills(String skills){
        return this;
    }

//    public CreateLocationBuilder withVechicle(String vechicle) {
//        createLocationRequest.setVehicleModels(vechicle);
//        return this;
//    }
//
//    public CreateLocationBuilder withcustomProperties(String customProperties){
//        createLocationRequest.setCustomProperties(customProperties);
//        return this;
//    }
//
//    public CreateLocationBuilder withpincodes(String pincodes) {
//        createLocationRequest.setPincodes(pincodes);
//        return this;
//    }
//
//    public CreateLocationBuilder withlocationLearningAudit(String locationLearningAudit){
//        createLocationRequest.setLocationLearningAudit(locationLearningAudit);
//        return this;
//    }



    public CreateLocationRequest build() {
        return createLocationRequest;
    }
}
