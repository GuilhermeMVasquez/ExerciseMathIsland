import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class waypointp2 {
    public static void main(String[] args) {
        String[] arr = new String[783];
        
        // read txt
        try {
            File myObj = new File("instructions.txt");
            Scanner myReader = new Scanner(myObj);
            for (int index = 0; index < arr.length; index++) {
                String data = myReader.nextLine();
                arr[index] = data;
            }
            myReader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // waypoint coord
        int verticalwaypoint = 1;
        int horizontalwaypoint = 10;

        // ship coord
        int vertical = 0;
        int horizontal = 0;

        for(int i = 0; i < arr.length; i++){

            // separate instructions 1 by 1
            String placeholder = arr[i];
            String[] separate = placeholder.split("(?<=\\D)(?=\\d)");

            // rotate waypoint R or L
            if(separate[0].equals("R")){
                if(separate[1].equals("90")){
                    int aux = verticalwaypoint;
                    verticalwaypoint = -1*horizontalwaypoint;
                    horizontalwaypoint = aux;
                }
                if(separate[1].equals("180")){
                    verticalwaypoint = -1*verticalwaypoint;
                    horizontalwaypoint = -1*horizontalwaypoint;
                }
                if(separate[1].equals("270")){
                    int aux2 = verticalwaypoint;
                    verticalwaypoint = horizontalwaypoint;
                    horizontalwaypoint = -1*aux2;
                }
            }
            if(separate[0].equals("L")){
                if(separate[1].equals("90")){
                    int aux3 = verticalwaypoint;
                    verticalwaypoint = horizontalwaypoint;
                    horizontalwaypoint = -1*aux3;
                }
                if(separate[1].equals("180")){
                    verticalwaypoint = -1*verticalwaypoint;
                    horizontalwaypoint = -1*horizontalwaypoint;
                }
                if(separate[1].equals("270")){
                    int aux4 = verticalwaypoint;
                    verticalwaypoint = -1*horizontalwaypoint;
                    horizontalwaypoint = aux4;
                }
            }

            // move waypoint
            if(separate[0].equals("N")){
                verticalwaypoint += Integer.parseInt(separate[1]);
            }
            if(separate[0].equals("S")){
                verticalwaypoint -= Integer.parseInt(separate[1]);
            }
            if(separate[0].equals("E")){
                horizontalwaypoint += Integer.parseInt(separate[1]);
            }
            if(separate[0].equals("W")){
                horizontalwaypoint -= Integer.parseInt(separate[1]);
            }

            // move ship
            if(separate[0].equals("F")){
                vertical += verticalwaypoint*(Integer.parseInt(separate[1]));
                horizontal += horizontalwaypoint*(Integer.parseInt(separate[1]));
            }
        }  
        System.out.println(Math.abs(vertical) + Math.abs(horizontal));
    }
}
