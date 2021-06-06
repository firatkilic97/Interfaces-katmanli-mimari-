
package interfaces;

import java.util.ArrayList;

public class EmailLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Email gönderildi.");
       
       
    }
    
}
