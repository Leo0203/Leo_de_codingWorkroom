package Java_work;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {

    public static void main(String[] args){

        Scanner userIn = new Scanner(System.in);
        System.out.print("Please enter a URL (start with https://): ");
        String URL = userIn.next();
        crawler(URL);
        



    }

    public static void crawler(String startURL){
        //URL not visited
        ArrayList<String> listofPendingURL = new ArrayList<>();
        //URL visited
        ArrayList<String> listofTraversedURL = new ArrayList<>();

        while(!listofPendingURL.isEmpty() && listofTraversedURL.size() <= 100){
            String URL = listofPendingURL.remove(0);
            if(!listofTraversedURL.contains(URL)){
                listofTraversedURL.add(URL);
                System.out.println("Trasversing URL: " + URL);
                for(String str: getSubURLs(URL)){
                    if(!listofTraversedURL.contains(str)){
                        listofPendingURL.add(str);
                    }
                }
            }
        }
    } 
    
    private static ArrayList<String> getSubURLs(String strURL){
        ArrayList<String> urlList = new ArrayList<>();
        try{
            URL url = new URL(strURL);
            Scanner input = new Scanner(System.in);
            int current = 0;
            while(input.hasNext()){
                String line = input.nextLine();
                current = line.indexOf("https:" + current);
                while (current > 0){
                    int endIndex = line.indexOf("\"", current);
                    if(endIndex > 0){
                        urlList.add(line.substring(current, endIndex));
                        current = line.indexOf("https:", endIndex);
                    }else{
                        current = -1;
                    }
                }
            }
            

        }catch(MalformedURLException e){
            System.out.println("Malformed URL Exception: " + e.getMessage());

        }catch(IOException e){
            System.out.println("Exception in IO: " + e.getMessage());

        }catch(Exception e){
            System.out.println("Unknown Exceptions: " + e.getMessage());
        }

        return urlList;
    }






}
