package entities.response;


public class CreateLocationResponse{

    private String id;
    private String clientId;
    private String code;
    private String name;
    private String type;
    private String [] teams;
    private String [] address;
    private String [] timeSlots;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String[] getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(String[] timeSlots) {
        this.timeSlots = timeSlots;
    }

    public String getTransactionDuration() {
        return transactionDuration;
    }

    public void setTransactionDuration(String transactionDuration) {
        this.transactionDuration = transactionDuration;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getVehicleModels() {
        return vehicleModels;
    }

    public void setVehicleModels(String vehicleModels) {
        this.vehicleModels = vehicleModels;
    }

    public String getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(String customProperties) {
        this.customProperties = customProperties;
    }

    public String getPincodes() {
        return pincodes;
    }

    public void setPincodes(String pincodes) {
        this.pincodes = pincodes;
    }

    public String getLocationLearningAudit() {
        return locationLearningAudit;
    }

    public void setLocationLearningAudit(String locationLearningAudit) {
        this.locationLearningAudit = locationLearningAudit;
    }

    private String transactionDuration;
    private String skills;
    private String vehicleModels;
    private String customProperties;
    private String pincodes;
    private String locationLearningAudit;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setClientId(String clientId){
        this.clientId = clientId;
    }

    public String getClientId(){
        return clientId;
    }



}