/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certificate;

/**
 *
 * @author VASUDEV
 */
public class attendence_pojo {
   private int s_id;
   private String status_info,atten_date;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getStatus_info() {
        return status_info;
    }

    public void setStatus_info(String status_info) {
        this.status_info = status_info;
    }

    public String getAtten_date() {
        return atten_date;
    }

    public void setAtten_date(String atten_date) {
        this.atten_date = atten_date;
    }
}
