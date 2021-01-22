package WorkWithServer;

import com.google.gson.Gson;

public class JsonStringSerializer {
    public Object Deserializer(String obj) {
        Gson gson = new Gson();
        return gson.fromJson(obj, String.class);
    }

    public String Serialize(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }
}
