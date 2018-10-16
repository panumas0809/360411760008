package lab9;

import java.io.*;

public class myfileDemo {
    public static void main(String[] args){

        File myFile = new File("D:\\360411760008\\src\\lab9\\mit.txt");
        try {
            if (myFile.createNewFile())
                System.out.println("New File is created.");
            else
                System.out.println("File is already exited");
        } catch (IOException e) {
            e.printStackTrace();
        }
         //System.out.println("Done.");

        writeMyFile(myFile);
        readMyfile(myFile);


    }//main

    private static void readMyfile(File myFile)  {
        FileReader r = null;

        try {
            r = new FileReader(myFile);
            int i;
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


        }




    private static void writeMyFile(File myFile) {
        Writer w = null;
        try {
            w = new FileWriter(myFile,true);
            String content = "MIT SAIYAI 2018 Panumas";
            w.write(content);
            System.out.println("Done. ");
        }catch (IOException ex ) {
            ex.printStackTrace();

        }finally {
            try {
                w.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }







    }//w


}//class
