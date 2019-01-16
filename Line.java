package com.codewar;

//codewar Ticket problem
//ohceking it having exchange or not 

public class Line {
    public static String Tickets(int[] peopleInLine)
    {   //25 50 25 100 25
        int twentyfive=0,fifty=0;
        String flag="Yes";

        for (int r:peopleInLine) {
            if(r==25){
                twentyfive+=25;
            }
            else if(r==50&&twentyfive!=0){
                fifty+=50;
                twentyfive-=25;
            }
            else if(r==100&&fifty!=0&&twentyfive!=0){
                fifty-=50;twentyfive-=25;
            }
            else if(r==100&&twentyfive>=75){
                twentyfive-=75;
            }
            else{
                flag="NO";

                break;
            }

        }
        System.out.println(flag);
        return flag;
    }
    public static void main(String args[]){

        int arr[]={25, 25, 50};
        int arrq[]={25,100,100};
        int arru[]={25,25,25,25,25,100,50,100,50};
      //  Tickets(arr);
      // bghd                                                                                                                                                                                                                                  Tickets(arrq);
        Tickets(arru);
    }

}

