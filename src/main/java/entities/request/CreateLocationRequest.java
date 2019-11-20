package entities.request;


import org.json.JSONArray;
import org.json.simple.JSONObject;

public class CreateLocationRequest {

    private String id;
    private String clientId;
    private String code;
    private String name;
    private String type;
    private Teams  teams;
    private Address  address;
    private TimeSlot  timeSlots;
    private String transactionDuration;
    private User users;
    private Skills skills;
    private VehicleModel vehicleModels;
    private Custom customProperties;
    private PinCode pincodes;
    private LocationLearning locationLearningAudit;



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

    public String getTransactionDuration() {
        return transactionDuration;
    }

    public void setTransactionDuration(String transactionDuration) {
        this.transactionDuration = transactionDuration;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setClientId(String clientId){
        this.clientId = clientId;
    }

    public String getId(){
        return id;
    }

    public String getClientId(){
        return clientId;
    }
}

