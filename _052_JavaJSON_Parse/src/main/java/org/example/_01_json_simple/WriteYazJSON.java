package org.example._01_json_simple;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteYazJSON {
    public static void main(String[] args) {

        JSONObject calisanDetayi = new JSONObject();
        calisanDetayi.put("adi","Serkan");
        calisanDetayi.put("soyadi","Zorlu");
        calisanDetayi.put("yasi",25);

        JSONObject calisanlarObj = new JSONObject();
        calisanlarObj.put("calisanlar",calisanDetayi);

        JSONObject calisanDetayi2 = new JSONObject();
        calisanDetayi2.put("adi","Burak");
        calisanDetayi2.put("soyadi","Delice");
        calisanDetayi2.put("yasi",33);

        JSONObject calisanlarObj2 = new JSONObject();
        calisanlarObj2.put("calisanlar",calisanDetayi2);

        JSONArray calisanList = new JSONArray();
        calisanList.add(calisanlarObj);
        calisanList.add(calisanlarObj2);

        try(FileWriter file = new FileWriter("calisanlar.json")){
            file.write(calisanList.toJSONString());
            file.flush();
        }catch (IOException e){
           throw new RuntimeException(e);
        }

    }
}
