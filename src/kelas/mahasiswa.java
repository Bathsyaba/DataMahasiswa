/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.json.*;

/**
 *
 * @author HP 14s
 */
public class mahasiswa {
    String token = "ufb2a73ed1e2bae2403ea3b3e9b5eb86ed6fdb66b49";
    String query;
    private static JSONArray dataMhs;
    private static int baris;

    public static JSONArray getDataMhs() {
        return dataMhs;
    }

    public static void setDataMhs(JSONArray dataMhs) {
        mahasiswa.dataMhs = dataMhs;
    }

    public static int getBaris() {
        return baris;
    }

    public static void setBaris(int baris) {
        mahasiswa.baris = baris;
    }

    public JSONObject getMahasiswa() {
       HttpResponse<String> response = Unirest.post("https://siakad.itmnganjuk.ac.id/api/select")
  .header("Content-Type", "application/json")
  .header("Cookie", "siakaditm1=jtdga4j0gm61hrnfq9r9uk6p6j")
  .body("{\"token\":\"ufb2a73ed1e2bae2403ea3b3e9b5eb86ed6fdb66b49\",\r\n\"query\":\"select * from t_mhs where angkatan = 2023\"}")
  .asString();
       
       String jsonrespones = response.getBody();
       JSONObject obj = new JSONObject(jsonrespones);
       
       return obj;

    
    }
}
