/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errorCheck;

/**
 * This is the error check methods
 * @author burge
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaErrorCheck {
    
    /**
     * check that number should be greater than 1
     * @param sc
     * @return int
     */
    public int checkIntAndZero(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<=0){
                    throw new IllegalArgumentException("Number need to be "
                            +"greater than 0 > ");
                }
                
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input a number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        
        return num;
    }
    
    /**
     * check that speed should between 0 to 5
     * @param sc
     * @return int
     */
    public int checkIntSpeed(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<1){
                    throw new IllegalArgumentException("number need to be "
                            +"greater or equals to 1 > ");
                }
                else if (num>5){
                    throw new IllegalArgumentException("number need to be "
                            +"less or equals to 5 > ");
                }
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        return num;
    }
    
    /**
     * check that int should between 0 to 20
     * @param sc
     * @return int
     */
    public int checkIntTenTwenty(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<10){
                    throw new IllegalArgumentException("number need to be "
                            +"greater or equals to 10 > ");
                }
                else if (num>20){
                    throw new IllegalArgumentException("number need to be "
                            +"less or equals to 20 > ");
                }
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        return num;
    }
    
    /**
     * check that int should between 100 to 200
     * @param sc
     * @return int
     */
    public int checkIntOneHtoTwoH(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<100){
                    throw new IllegalArgumentException("number need to be "
                            +"greater or equals to 100 > ");
                }
                else if (num>200){
                    throw new IllegalArgumentException("number need to be "
                            +"less or equals to 200 > ");
                }
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        return num;
    }
    
    /**
     * check that int should between 100 to 200
     * @param sc
     * @return int
     */
    public int checkIntOneTwo(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<1){
                    throw new IllegalArgumentException("number need to be "
                            +"greater or equals to 1 > ");
                }
                else if (num>2){
                    throw new IllegalArgumentException("number need to be "
                            +"less or equals to 2 > ");
                }
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        return num;
    } 
    
    /**
     * check that int should between 100 to 200
     * @param sc
     * @return int
     */
    public int checkIntOneToFour(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<1){
                    throw new IllegalArgumentException("number need to be "
                            +"greater or equals to 1 > ");
                }
                else if (num>4){
                    throw new IllegalArgumentException("number need to be "
                            +"less or equals to 4 > ");
                }
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        return num;
    }
    
    /**
     * check that int should between 100 to 200
     * @param sc
     * @return int
     */
    public int checkIntOneToFive(Scanner sc){
        int num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextInt();
                if(num<1){
                    throw new IllegalArgumentException("number need to be "
                            +"greater or equals to 1 > ");
                }
                else if (num>5){
                    throw new IllegalArgumentException("number need to be "
                            +"less or equals to 5 > ");
                }
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        return num;
    }    
    
    /**
     * check that double should be greater than 0
     * @param sc
     * @return double
     */
    public double checkDoubleAndZero(Scanner sc){
        double num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextDouble();
                if(num<0){
                    throw new IllegalArgumentException("Number need to be "
                            +"greater than 0 > ");
                }
                if(num==0){
                    throw new IllegalArgumentException("Do not stay here, go "
                            +"out!! Enter a number > ");
                }
                
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input a number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        
        return num;
    }
    
    /**
     * check that double should between 0 to 100
     * @param sc
     * @return double
     */
    public double checkDoubleBetweenZeroHundred(Scanner sc){
        double num=0;
        boolean vaild = false;
        do{
            try{
                num=sc.nextDouble();
                if(num<0){
                    throw new IllegalArgumentException("number need to "
                            +"be greater or equals to 0 > ");
                }
                else if (num>100){
                    throw new IllegalArgumentException("number need to be "
                            +"less or equals to 100 > ");
                }
                vaild = true;
            }catch(InputMismatchException e){
                System.out.println("Please input number > ");
                sc.nextLine();
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }while(!vaild);
        return num;
    }
    
    /**
     * check String for no ""
     * @param sc
     * @return String
     */
    public String checkEnterOfString(Scanner sc){
        String s="";
        boolean vaild = false;
        do{
            try{
                s=sc.nextLine();
                s=s.trim();
                if(s.equals("")){
                    throw new IllegalArgumentException("The name can not be "
                            +"nothing, please enter again > ");
                }
                
                vaild = true;
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while(!vaild);
        return s;
    }
    /**
     * check String only enter Y or N
     * @param sc
     * @return String
     */
    public String checkYorN(Scanner sc){
        String s="";
        boolean vaild = false;
        do{
            try{
                s=sc.nextLine();
                if(s.equals("y")||s.equals("Y")||s.equals("n")||s.equals("N")){
                    vaild = true;
                }
                else throw new IllegalArgumentException("Please enter 'Y/y' "
                            +"for 'Yes', 'N/n' for 'No' > ");

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while(!vaild);
        return s;
    }
    
    /**
     * check the input is only one adjective
     * @param sc
     * @return String
     */
    public String checkOneAdjective(Scanner sc){
        String s="";
        boolean vaild = false;
        do{
            try{
                s=sc.nextLine();
                s=s.trim();
                int i = s.indexOf(" ");
                if(i==-1){
                    vaild = true;
                }
                else throw new IllegalArgumentException("Please enter one "
                            +"adjective to describe the place > ");

            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }while(!vaild);
        return s;
    }

    
}
