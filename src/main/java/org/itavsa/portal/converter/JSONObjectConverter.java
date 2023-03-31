package org.itavsa.portal.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.apache.logging.log4j.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

@Converter(autoApply = true)
public class JSONObjectConverter implements AttributeConverter<JSONObject, String> {
    @Override
    public String convertToDatabaseColumn(JSONObject jsonData) {
        String json;
        try {
            json = jsonData.toString();
        } catch (NullPointerException ex) {
            // TODO: extend error handling
            json = "";
        }
        return json;
    }

    @Override
    public JSONObject convertToEntityAttribute(String jsonDataAsJson) {
        JSONObject jsonData;
        if(!Strings.isBlank(jsonDataAsJson)) {
            try {
                jsonData = new JSONObject(jsonDataAsJson);
            } catch (JSONException ex) {
                // TODO: extend error handling
                jsonData = null;
            }
        } else {
            jsonData = new JSONObject();
        }
        return jsonData;
    }
}