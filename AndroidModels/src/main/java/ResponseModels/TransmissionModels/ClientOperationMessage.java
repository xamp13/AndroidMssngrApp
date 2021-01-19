package ResponseModels.TransmissionModels;

import com.example.androidmodels.Enums.Transmissions.ClientOperations;

public class ClientOperationMessage {
    private ClientOperations Operation;
    private String JsonData ;

    public ClientOperations getOperation() {
        return Operation;
    }

    public String getJsonData() {
        return JsonData;
    }

    public void setJsonData(String jsonData) {
        JsonData = jsonData;
    }

    public void setOperation(ClientOperations operation) {
        Operation = operation;
    }
}
