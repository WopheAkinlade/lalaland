import java.io.File;
import java.io.IOException;

public class MyFile {
    public void createMyFile(String filename){
        File file = new File(filename);
        try {
            if (file.exists()){
                System.out.println("File already exists");
            }else{
                if(file.createNewFile()){
                    System.out.println("File created successfully");
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
