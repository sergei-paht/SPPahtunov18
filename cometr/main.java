package cometr;

import java.io.IOException;
class Gun{
    public static void main(String[] args){
        try {

                final Process p = Runtime.getRuntime().exec("1.bat");

                final int retCode = p.waitFor();

        }
         catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
