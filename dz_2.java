import java.io.BufferedWriter;
 import java.io.File;
 import java.io.FileWriter;
 import java.io.IOException;
public class dz_2 {
    public static void main(String[] args) {
        stringInit(20, 'n', 'v');
        addText("TEXT", 100);
    }

    private static void stringInit(int n, char c1 ,char c2){
        String temp = "";
        for (int index = 0; index < n/2; index++) {
            temp += c1;
            temp += c2;
        }
        System.out.println(temp);
    }

    public static void addText(String text, int quantity){

        try{File file = new File("file.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int index = 0; index < quantity; index++) {
                bw.write(text);
            }
            bw.close();

    } catch(IOException e){
        System.out.println("Error" + e);

        }
    }
}

