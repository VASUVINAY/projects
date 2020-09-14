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
public class cerificate_issue_pojo {
   private int certificate_no,u_id,s_id;
   private String issue_date;

    public int getCertificate_no() {
        return certificate_no;
    }

    public void setCertificate_no(int certificate_no) {
        this.certificate_no = certificate_no;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }
}
