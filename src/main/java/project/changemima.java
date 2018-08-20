package project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther opprash
 * @Date 2018\8\16 0016 2:17
 */
public class changemima implements changesMiMa {
    String uuid;
    String phoneNum;
    protected int shuru;
    message Mes;
    private String mima;
    public changemima(String uuid,String phoneNum){
        this.uuid=uuid;
        this.phoneNum=phoneNum;
        Mes=new message(this.uuid,this.phoneNum);
    }
   //@Override

    public  boolean isMobile() {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$"); // 验证手机号
        m = p.matcher(this.phoneNum);
        b = m.matches();
        return b;
    }
    public boolean send(){
        if(Mes.send()){
            return true;

        }else {return false;}


    }

    //@Override
    public boolean comPare(int shuru) {
        if(Mes.getAndcompare(this.uuid,this.phoneNum)){
            return true;
        }else{
            return false;
        }
    }

    public void changmima(){
        if(isMobile()){
            if(send()){
                if(comPare(this.shuru)){
                    //this.mima="";
                    //查表并修改该用户的密码；


                    System.out.println("修改成功");
                }else{
                    System.out.println("比较错误，验证码有误");
                }
            }else{
                System.out.println("发送错误");
            }
        }else{
            System.out.println("手机号错误，请确保你输入的是11位的手机号");
        }
    }
}
