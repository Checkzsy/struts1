package cap.action;

import com.opensymphony.xwork2.ActionSupport;

import java.awt.*;

public class TimerAction extends ActionSupport{
    public String timer()
    {
        try{
            Thread.sleep(500);
        }catch (InterruptedExeception e){
            e.printStackTrace();
        }
        return SUCCESS;
    }
}
