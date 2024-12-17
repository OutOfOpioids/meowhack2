package me.violet.meowhack.util.traits;

import com.google.gson.JsonElement;

public interface Jsonable {
    JsonElement toJson();

    void fromJson(JsonElement element);

    default String getFileName() {
        return "";
    }
}