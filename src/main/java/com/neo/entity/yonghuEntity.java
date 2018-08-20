package com.neo.entity;

/**
 * @Auther opprash
 * @Date 2018\8\16 0016 10:28
 */
public class yonghuEntity {
    private String uuid;
    private String phoneNum;
    private int yangzheng;
    public yonghuEntity(){
        super();
    }
    public yonghuEntity(String uuid,String phoneNum ,int yangzheng){
        super();
        this.phoneNum=phoneNum;
        this.uuid=uuid;
        this.yangzheng=yangzheng;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getYangzheng() {
        return yangzheng;
    }

    public void setYangzheng(int yangzheng) {
        this.yangzheng = yangzheng;
    }
    @Override
    public String toString(){
        return "uuid"+this.uuid+"phoneNum"+this.phoneNum+"yangzheng"+this.yangzheng;
    }
}
