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
public class message_pojo {
    private int msg_id;
    private String msg_name,msg_email,msg_msg,msg_contact;

    public String getMsg_contact() {
        return msg_contact;
    }

    public void setMsg_contact(String msg_contact) {
        this.msg_contact = msg_contact;
    }

    public int getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(int msg_id) {
        this.msg_id = msg_id;
    }

    public String getMsg_name() {
        return msg_name;
    }

    public void setMsg_name(String msg_name) {
        this.msg_name = msg_name;
    }

    public String getMsg_email() {
        return msg_email;
    }

    public void setMsg_email(String msg_email) {
        this.msg_email = msg_email;
    }

    public String getMsg_msg() {
        return msg_msg;
    }

    public void setMsg_msg(String msg_msg) {
        this.msg_msg = msg_msg;
    }
}
