package WorkWithServer;


import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

import com.example.androidmodels.Enums.Transmissions.ListenerType;


import java.util.HashMap;
import java.util.function.Consumer;

import ResponseModels.TransmissionModels.OperationResultInfo;

public class DataManager {

    private HashMap<ListenerType, Consumer<OperationResultInfo>> listenerDict;
    public DataManager(){
        listenerDict = new HashMap<ListenerType, Consumer<OperationResultInfo>>();
    }

    public void AddListener(ListenerType key,Consumer<OperationResultInfo> listener)
    {
        listenerDict.put(key,listener);
    }

    public void RemoveListener(ListenerType key){
        listenerDict.remove(key);
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void HandleData(ListenerType key, OperationResultInfo data) throws Exception {
        if(listenerDict.containsKey(key)) {
            listenerDict.get(key).accept(data);
        }
        else {
            throw new Exception("This key isn't contains in listener hashmap");
        }
        Log.w("DataManager", "This key isn't contains in listener hashmap");

    }

}
