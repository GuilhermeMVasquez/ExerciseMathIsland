import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class shipp1 {
    public static void main(String[] args) {
        String[] arr = new String[783];
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
        String facing = "E";
        String sfacing = "E";
        int vertical = 0;
        int horizontal = 0;
        for(int i = 0; i < arr.length; i++){
            String placeholder = arr[i];
            String[] separate = placeholder.split("(?<=\\D)(?=\\d)");
            if(separate[0].equals("R")){
                if(separate[1].equals("90")){
                    if(facing.equals("N")){
                        sfacing = "E";
                    }
                    if(facing.equals("E")){
                        sfacing = "S";
                    }
                    if(facing.equals("S")){
                        sfacing = "W";
                    }
                    if(facing.equals("W")){
                        sfacing = "N";
                    }
                }
                if(separate[1].equals("180")){
                    if(facing.equals("N")){
                        sfacing = "S";
                    }
                    if(facing.equals("S")){
                        sfacing = "N";
                    }
                    if(facing.equals("E")){
                        sfacing = "W";
                    }
                    if(facing.equals("W")){
                        sfacing = "E";
                    }
                }
                if(separate[1].equals("270")){
                    if(facing.equals("N")){
                        sfacing = "W";
                    }
                    if(facing.equals("E")){
                        sfacing = "N";
                    }
                    if(facing.equals("S")){
                        sfacing = "E";
                    }
                    if(facing.equals("W")){
                        sfacing = "S";
                    }
                }
            }
            if(separate[0].equals("L")){
                if(separate[1].equals("90")){
                    if(facing.equals("N")){
                        sfacing = "W";
                    }
                    if(facing.equals("W")){
                        sfacing = "S";
                    }
                    if(facing.equals("S")){
                        sfacing = "E";
                    }
                    if(facing.equals("E")){
                        sfacing = "N";
                    }
                }
                if(separate[1].equals("180")){
                    if(facing.equals("N")){
                        sfacing = "S";
                    }
                    if(facing.equals("S")){
                        sfacing = "N";
                    }
                    if(facing.equals("E")){
                        sfacing = "W";
                    }
                    if(facing.equals("W")){
                        sfacing = "E";
                    }
                }
                if(separate[1].equals("270")){
                    if(facing.equals("N")){
                        sfacing = "E";
                    }
                    if(facing.equals("E")){
                        sfacing = "S";
                    }
                    if(facing.equals("S")){
                        sfacing = "W";
                    }
                    if(facing.equals("W")){
                        sfacing = "N";
                    }
                }
            }
            facing = sfacing;
            if(separate[0].equals("F")){
                separate[0] = facing;
            }
            if(separate[0].equals("N")){
                vertical += Integer.parseInt(separate[1]);
            }
            if(separate[0].equals("S")){
                vertical -= Integer.parseInt(separate[1]);
            }
            if(separate[0].equals("E")){
                horizontal += Integer.parseInt(separate[1]);
            }
            if(separate[0].equals("W")){
                horizontal -= Integer.parseInt(separate[1]);
            }
            
        }  
        System.out.println(Math.abs(vertical) + Math.abs(horizontal));
    }
}
