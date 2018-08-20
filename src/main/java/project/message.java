package project;


import com.neo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

/**
 * @Auther opprash
 * @Date 2018\8\16 0016 1:52
 */
public class message {
    @Autowired
    private com.neo.mapper.yonghuMapper yonghuMapper;
    private String uuid;
    private String phoneNum;
    private int sendMessage=0;

    public message(String uuid,String phoneNum){
        this.phoneNum=phoneNum;
        this.uuid=uuid;
    }
    public int  getSendMessage(){


        //生成5－26之间的随机数，包括26
        //int randNum = rand.nextInt(22)+5;

        return this.sendMessage;

    }
    public boolean send(){
        //调用修改中台发送短信验证码的接口
        //发送成功，将验证码和手机号以及用户的uuid存储到数据库
        //失败则返回false
        Random rand = new Random();
        int randNum = rand.nextInt(999999);
        yonghuMapper.insert(this.uuid,this.phoneNum,randNum);
        return  true;
    }

    public boolean getAndcompare(String uuid,String  phoneNum){
            yonghuMapper.getOne(this.uuid);
        //使用用户的uuid以及
        return true;
    }


}
