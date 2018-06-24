package com.student.transaction.domain;

import javax.persistence.*;

/**
 * Created by Josch on 2018/06/22.
 */
@Entity
@Table(name = "Merchant")
public class Merchant {
    @Id
    @Column(name = "merchantId" , unique = true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long merchantId;

    @Column(name = "merchantname" , unique = true, nullable = false)
    private String merchantname;

    @Column(name = "merchant_ID" , unique = true, nullable = false)
    private Long merchant_ID;

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantname() {
        return merchantname;
    }

    public void setMerchantname(String merchantname) {
        this.merchantname = merchantname;
    }

    public Long getMerchant_ID() {
        return merchant_ID;
    }

    public void setMerchant_ID(Long merchant_ID) {
        this.merchant_ID = merchant_ID;
    }
}
