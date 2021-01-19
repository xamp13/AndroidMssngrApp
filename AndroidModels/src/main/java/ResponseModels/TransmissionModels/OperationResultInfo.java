package ResponseModels.TransmissionModels;

import com.example.androidmodels.Enums.Transmissions.ListenerType;
import com.example.androidmodels.Enums.Transmissions.OperationsResults;

public class OperationResultInfo {
    public String ErrorInfo ;
    public Object JsonData ;
    public ListenerType ToListener ;
    public OperationsResults OperationsResults ;

    public void setJsonData(Object jsonData) {
        JsonData = jsonData;
    }

    public ListenerType getToListener() {
        return ToListener;
    }

    public Object getJsonData() {
        return JsonData;
    }

    public OperationsResults getOperationsResults() {
        return OperationsResults;
    }

    public String getErrorInfo() {
        return ErrorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        ErrorInfo = errorInfo;
    }

    public void setOperationsResults(OperationsResults operationsResults) {
        OperationsResults = operationsResults;
    }

    public void setToListener(ListenerType toListener) {
        ToListener = toListener;
    }
}
