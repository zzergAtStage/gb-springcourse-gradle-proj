package com.zergatstage.grdltst;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

public class Controller<T> {
    private static Gson gson;
    private final TypeToken<List<T>> listType = new TypeToken<>() {
    };

    public static <T> Controller<T> create(){
        gson = new Gson();
        return new Controller<>();
    }

    public String transformObjectsToJson(T object){
        return gson.toJson(object);
    }

    public T transformJsonToPerson(String json, Class<T> type){
        return gson.fromJson(json, type);
    }

    public String transformListToJson(List<T> objectList){
        return gson.toJson(objectList, listType.getType());
    }

    public List<T> transformJsonToList(String json){
        return gson.fromJson(json, listType.getType());
    }

}
