import java.io.*;
public class Main {
    public static void main(String[] args) {
        rd();
    }
    public static void rd(){
        try(BufferedReader read = new BufferedReader(new FileReader("firstCode.txt"))){
            String cod;
            boolean prov = false;
            while ((cod = read.readLine()) != null){
                cod = cod.replaceAll("\\s*", ""); //удаление пробелов
                boolean result = cod.matches("^(//.*)|(.*/\\*.*)|(.*\\*/)$"); // регулярное выражение для удаления комментариев
                if(result){
                    boolean AnResult = cod.matches("^(.*\\*/)$"); //регулярное выражение для начала многострочного комментариев
                    boolean AnResult_2 = cod.matches("^(.*/\\*.*)$"); //регулярное выражение для конца многострочного комментариев
                    if(AnResult){ // Проверка на начало многострочного комментария
                        prov = false;
                    }
                    else if (AnResult_2){ // Проверка на конец многострочного  комментария
                        prov = true;
                    }
                    else{
                        prov = false;
                    }
                }
                else if (!prov){
                    wr(cod);
                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void wr(String cod){ // метод для записи преобразованного кода в файл
        try(BufferedWriter wr = new BufferedWriter(new FileWriter("finalCode.txt", true))){
            wr.write(cod);
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
