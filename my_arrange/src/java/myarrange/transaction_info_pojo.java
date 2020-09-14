/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarrange;

/**
 *
 * @author VASUDEV
 */
public class transaction_info_pojo {
    private int s_id;
    private float price;
    private String transaction_id,pay_mode,REFERENCE_NO;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getPay_mode() {
        return pay_mode;
    }

    public void setPay_mode(String pay_mode) {
        this.pay_mode = pay_mode;
    }

    public String getREFERENCE_NO() {
        return REFERENCE_NO;
    }

    public void setREFERENCE_NO(String REFERENCE_NO) {
        this.REFERENCE_NO = REFERENCE_NO;
    }
}
