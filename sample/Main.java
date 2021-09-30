package sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//Умножения без операции умножения с использованием класса
class Gang{
    public static void main(String[] args){

        try(BufferedReader br=new BufferedReader(new FileReader("Умножение.txt"))){
        String line=br.readLine();
        System.out.println(line);
        String[]values=line.split("\\*");
        Variables array=new Variables(Integer.parseInt(values[0]),Integer.parseInt(values[1]));
        System.out.println(array.multiply(Integer.parseInt(values[0]),Integer.parseInt(values[1])));
        }
        catch(IOException e){
        System.out.println(e.getMessage());
        }
    }
}
