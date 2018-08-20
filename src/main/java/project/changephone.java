package project;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther opprash
 * @Date 2018\8\16 0016 2:17
 */
public class changephone implements changphone {
    String uuid;
    String phoneNum;
    protected int shuru;
    message Mes;
    public changephone(String uuid,String phoneNum,int shuru){
        this.phoneNum=phoneNum;
        this.shuru=shuru;
        this.uuid=uuid;
        Mes=new message(this.uuid,this.phoneNum);
    }

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
    public void changphones(String phoneNum)  {
        if(isMobile()!=true){
            System.out.println("手机号不合法，请输入11位的手机号" );
        }else{
            if(send()!=true){
                System.out.println("发送u验证码错误");
            }else{
                if(comPare(shuru)!=true){
                    System.out.println("验证错误");
                }else{
                    System.out.println("验证成功，可以修改");
                    //查询数据库，并修改数据库中该用户的电话号码
                    //
                    //
                    //
                    //
                }
            }
        }
    }
}
