import java.util.Scanner;
class Main {
    public static void homePage(String[] reg,String[] regName,int[] prfMarks,int[] dbmsMarks,int
            index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t WELCOME TO GDSE MARKS MANAGEMENT SYSTEM \t \t \t \t|");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("[1] Add New Student\t\t\t\t\t\t");
        System.out.println("[2] Add New Student with Marks ");
        System.out.print("[3] Add Marks\t\t\t\t\t\t\t");
        System.out.println("[4] Update Student Details ");
        System.out.print("[5] Update Marks\t\t\t\t\t\t");
        System.out.println("[6] Delete Student ");
        System.out.print("[7] Print Student Details\t\t\t\t");
        System.out.println("[8] Print Student Ranks ");
        System.out.print("[9] Best in Programming Fundamentals\t");
        System.out.println("[10] Best in Databse Management Systems ");
        System.out.println();
        System.out.print("Enter an option to continue > ");
        int option = input.nextInt();
        clearConsole();
        switch(option){
            case 1:
//System.out.println("----------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t \t \tADD NEW STUDENT \t \t \t \t \t |");
//System.out.println("---------------------------------------------------------------------------------------------------------");
                System.out.println();
                addNewStudent(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            case 2:
                //System.out.println("-----------------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t \t \tADD NEW STUDENT WITH MARKS \t \t \t \t |");
//System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println();
                addNewStudentWithMarks(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            case 3:
                //System.out.println("----------------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t \t \t \t ADD MARKS \t \t \t \t \t \t |");
//System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                addMarks(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            case 4:
                //System.out.println("------------------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t \t \tUPDATE STUDENT DETAILS \t \t \t \t \t \t |");
//System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                updateStudentDetails(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            case 5:
                //System.out.println("------------------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t \t \tUPDATE MARKS \t \t \t \t \t \t \t |");
//System.out.println("-----------------------------------------------------------------------------------------------------------------");
                System.out.println();
                updateMarks(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            case 6:
                //System.out.println("-----------------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t \t \tDELETE STUDENT \t \t \t \t \t \t \t |");
//System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                deleteStudent(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            case 7:
                //System.out.println("------------------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t \t \tPRINT STUDENT DETAILS \t \t \t \t \t \t |");
//System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                printStudentDetails(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            case 8:
                //System.out.println("------------------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t \t \tPRINT STUDENT RANKS \t \t \t \t \t \t |");
//System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                printStudentRanks(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            case 9:
                //System.out.println("------------------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t BEST IN PROGRAMMING  FUNDAMENTALS \t \t \t \t \t \t |");
//System.out.println("------------------------------------------------------------------------------------------------------------------");
//System.out.println();
                bestPRF(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            case 10:
                //System.out.println("------------------------------------------------------------------------------------------------------------------");
//System.out.println("|\t \t \t \t BEST IN DATABASE MANAGEMENT SYSTEMS \t \t \t \t \t \t |");
//System.out.println("------------------------------------------------------------------------------------------------------------------");
                System.out.println();
                bestDBMS(reg,regName,prfMarks,dbmsMarks,index,total,average);
                break;
            default: System.out.println("Wrong Option. Try Again.");
        }
    }

    public static void addNewStudent(String[] reg,String[] regName,int[] prfMarks,int[] dbmsMarks,int
            index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t \t \tADD NEW STUDENT \t \t \t \t \t |");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        System.out.println();
        L1: for(int i=index;i<reg.length;i++){
            L2: for(int j=0;j<reg.length;j++){
                System.out.println();
                System.out.print("Enter Student Id:");
                String id=input.next();
                L3: for (int k = 0; k <reg.length ; k++){
                    if (id.equals(reg[k])){
                        System.out.print("The Student Id already exists");
                        System.out.println();
                        continue L2;
                    }
                }
                reg[i]=id;

                break;
            }
            System.out.print("Enter student Name : ");
            String name=input.next();
            regName[i]=name;

            index=i+1;

            System.out.println();
            System.out.print("Student has been added successfully .");
            System.out.print("Do you want to add a new student(Y/n)");

            String status ="s";
            status = input.next();

            if(status.equals("Y")){
                addNewStudent(reg,regName,prfMarks,dbmsMarks,index,total,average);
            }else if(status.equals("n")){
                clearConsole();
                homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
            }
            break;
        }
    }
    public static void addNewStudentWithMarks(String[] reg,String[] regName,int[] prfMarks,int[]
            dbmsMarks,int index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t \t \tADD NEW STUDENT WITH MARKS \t \t \t \t \t |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println();
        L4: for (int i = index; i <reg.length ; i++){
            L5: for (int j = 0; j <reg.length ; j++){
                System.out.println();
                System.out.print("Enter Student Id:");
                String id=input.next();
                L6: for (int k = 0; k <reg.length ; k++){
                    if (id.equals(reg[k])){
                        System.out.print("The Student Id already exists");
                        System.out.println();
                        continue L4;
                    }
                }
                reg[i]=id;
                break;
            }
            System.out.print("Enter student Name : ");
            String name=input.next();
            regName[i]=name;

            L8:for(int l=0;l<reg.length;l++){
                System.out.print("Programming Fundamental Marks : ");
                prfMarks[i]=input.nextInt();
                if( prfMarks[i]<0 || prfMarks[i]>101){
                    System.out.println("Invalid marks, please enter correct marks ");
                    System.out.println();

                }
                System.out.print("Database Management System Marks : ");
                dbmsMarks[i]=input.nextInt();
                if(dbmsMarks[i]<0 || dbmsMarks[i]>101){
                    System.out.println("Invalid marks, please enter correct marks ");
                    System.out.println();

                }
                System.out.print("Student and Marks has been added successfully .");
                System.out.print("Do you want to add a new student with marks(Y/n)");
                String status ="s";
                status = input.next();


                if(status.equals("Y")){

                    addNewStudentWithMarks(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }else if(status.equals("n")){
                    clearConsole();
                    homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }
                break;
            }
        }
    }


    public static void addMarks(String[] reg,String[] regName,int[] prfMarks,int[] dbmsMarks,int
            index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t \t \t \t ADD MARKS \t \t \t \t \t \t |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println();
        L9: for (int i = index; i <reg.length ; i++){
            L7: for(int j=0;j<reg.length;j++){
                System.out.println();
                System.out.print("Enter Student Id:");
                String id=input.next();
                L8: for (int k = 0; k <reg.length ; k++){
                    if (id.equals(reg[k])){
                        System.out.println("Student name : "+regName[k]);
                        System.out.println();
                        L10: for(int l=0;l<reg.length;l++){
                            System.out.print("Programming Fundamental Marks : ");
                            prfMarks[k]=input.nextInt();
                            if(prfMarks[k]<0 || prfMarks[k]>=100){
                                System.out.println("Invalid marks, please enter correct marks ");
                                System.out.println();
                                continue;
                            }
                            System.out.print("Database Management System Marks : ");
                            dbmsMarks[k]=input.nextInt();
                            if(dbmsMarks[k]<0 || dbmsMarks[k]>=100){
                                System.out.println("Invalid marks, please enter correct marks ");
                                System.out.println();
                                continue;
                            }

                            System.out.print("Student and Marks has been added successfully .");
                            System.out.print("Do you want to add a new student with marks(Y/n)");
                            String status ="s";
                            status = input.next();

                            if(status.equals("Y")){
                                addMarks(reg,regName,prfMarks,dbmsMarks,index,total,average);
                            }else if(status.equals("n")){
                                clearConsole();
                                homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                            }
                        }
                    }
                }
                System.out.print("Invalid Student ID. Do you want to search again (Y/n) : ");
                String status ="s";
                status = input.next();

                if(status.equals("Y")){
                    addMarks(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }else if(status.equals("n")){
                    clearConsole();
                    homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }
            }
        }
    }
    public static void updateStudentDetails(String[] reg,String[] regName,int[] prfMarks,int[]
            dbmsMarks,int index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t \t \tUPDATE STUDENT DETAILS \t \t \t \t \t \t |");
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println();
        L11: for (int i = index; i <reg.length ; i++){
            L12: for(int j=0;j<reg.length;j++){
                System.out.println();
                System.out.print("Enter Student Id:");
                String id=input.next();
                L13: for (int k = 0; k <reg.length ; k++){
                    if (id.equals(reg[k])){
                        System.out.println("Student name : "+regName[k]);
                        System.out.println();
                        for(int l=0;l<prfMarks.length;l++){
                            System.out.print("Enter the new student name : " );
                            regName[k]=input.next();
                            System.out.println();
                            System.out.println("Student details update successfully " );
                            System.out.print("Do you want to update another student details(Y/n) " );
                            String status ="s";
                            status = input.next();

                            if(status.equals("Y")){
                                updateStudentDetails(reg,regName,prfMarks,dbmsMarks,index,total,average);
                            }else if(status.equals("n")){
                                clearConsole();
                                homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                            }
                        }
                    }
                }
                System.out.print("Invalid Student ID. Do you want to search again (Y/n) : ");
                String status ="s";
                status = input.next();
                if(status.equals("Y")){
                    updateStudentDetails(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }else if(status.equals("s")){
                    clearConsole();
                    homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }
            }
        }
    }

    public static void updateMarks(String[] reg,String[] regName,int[] prfMarks,int[] dbmsMarks,int
            index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t \t \tUPDATE MARKS \t \t \t \t \t \t \t |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        L11: for (int i = index; i <reg.length ; i++){
            L12: for(int j=0;j<reg.length;j++){
                System.out.println();
                System.out.print("Enter Student Id:");
                String id=input.next();
                L13: for (int k = 0; k <reg.length ; k++){
                    if (id.equals(reg[k])){
                        System.out.println("Student name : "+regName[k]);
                        System.out.println();
                        System.out.println("Programming fundamental Marks : "+prfMarks[k]);
                        System.out.println("Database Management System Marks : "+dbmsMarks[k]);
                        for(int l=0;i<prfMarks.length;l++){
                            System.out.print("Enter new Programming Fundamental Marks : " );
                            prfMarks[k]=input.nextInt();
                            if(prfMarks[l]<0 || prfMarks[l]>101){
                                System.out.println("Invalid marks, please enter correct marks ");
                                System.out.println();
                                continue;
                            }
                            System.out.print("Enter new Database Management System Marks : " );
                            dbmsMarks[k]=input.nextInt();
                            if(dbmsMarks[l]<0 || dbmsMarks[l]>101){
                                System.out.println("Invalid marks, please enter correct marks ");
                                System.out.println();

                            }
                            System.out.println();
                            System.out.println("Marks have been update successfully " );
                            System.out.print("Do you want to update another student details(Y/n) " );
                            String status ="s";
                            status = input.next();
                            if(status.equals("Y")){
                                updateMarks(reg,regName,prfMarks,dbmsMarks,index,total,average);
                            }else if(status.equals("n")){
                                clearConsole();
                                homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                            }
                        }
                    }
                }
                System.out.print("Invalid Student ID. Do you want to search again (Y/n) : ");
                String status ="s";
                status = input.next();
                if(status.equals("Y")){
                    updateMarks(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }else if(status.equals("n")){
                    clearConsole();
                    homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }
            }
        }
    }

    public static void deleteStudent(String[] reg,String[] regName,int[] prfMarks,int[] dbmsMarks,int
            index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t \t \tDELETE STUDENT \t \t \t \t \t \t \t |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        L14: for (int i = index; i <reg.length ; i++){
            L15: for(int j=0;j<reg.length;j++){
                System.out.println();
                System.out.print("Enter Student Id:");
                String id=input.next();
                L16: for (int k = 0; k <reg.length ; k++){
                    if (id.equals(reg[k])){
                        reg[k]=null;
                        regName[k]=null;
                        prfMarks[k]=0;
                        dbmsMarks[k]=0;

                        System.out.println("Student has been deleteed successfully " );
                        System.out.print("Do you want to update another student details(Y/n) " );

                        String status ="s";
                        status = input.next();

                        if(status.equals("Y")){
                            deleteStudent(reg,regName,prfMarks,dbmsMarks,index,total,average);
                        }else if(status.equals("n")){
                            clearConsole();
                            homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                        }
                    }
                }
                System.out.print("Invalid Student ID. Do you want to search again (Y/n) : ");
                String status ="s";
                status = input.next();

                if(status.equals("Y")){
                    deleteStudent(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }else if(status.equals("n")){
                    clearConsole();
                    homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }
            }
        }
    }


    public static void printStudentDetails(String[] reg,String[] regName,int[] prfMarks,int[]
            dbmsMarks,int index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t \t \tPRINT STUDENT DETAILS \t \t \t \t \t \t |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println();
        sort(reg,regName,prfMarks,dbmsMarks,index,total,average);
        L12:for(int i=0;i<reg.length;i++){
            System.out.println();
            System.out.print("Enter Student Id:");
            String id=input.next();
            int x=search(id,reg);
            if(x>=0){
                System.out.println("Student name : "+regName[x]);
                System.out.println();
                System.out.println();
                System.out.println("+----------------------------------------------+");
                System.out.println("|Programming fundamental Marks | "+prfMarks[x]+" |");
                System.out.println("| | | ");
                System.out.println("|Database Management System Marks | "+dbmsMarks[x]+" |");
                System.out.println("| | |");
                System.out.println("|Total Marks | "+(prfMarks[x]+dbmsMarks[x])+" |");
                System.out.println("| | |");
                System.out.println("|Avg Marks | "+(prfMarks[x]+dbmsMarks[x])/2.0+" |");
                System.out.println("| | |");
                System.out.println("|Rank | "+(x+1)+" |");
                System.out.println("| | |");
                System.out.println("+----------------------------------------------+");
                System.out.println();
                System.out.print("Do you want to search another student details(Y/n) " );
                String status ="s";
                status = input.next();
                if(status.equals("Y")){
                    printStudentDetails(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }else if(status.equals("n")){
                    clearConsole();
                    homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }
            }else{
                System.out.print("Invalid Student ID. Do you want to search again (Y/n) : ");
                String status ="s";
                status = input.next();

                if(status.equals("Y")){
                    printStudentDetails(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }else if(status.equals("n")){
                    clearConsole();
                    homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
                }
            }
            break;
        }
    }

    //print student ranks[8]
    public static void printStudentRanks(String[] reg,String[] regName,int[] prfMarks,int[]
            dbmsMarks,int index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t \t \tPRINT STUDENT RANKS \t \t \t \t \t \t |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("+-----+-------+----------+--------------+-------------+");
        System.out.println("Rank |"+" Id |"+" Name |"+" Total Marks |"+" Avg Marks |");
        System.out.println("+-----+-------+----------+--------------+-------------+");
        String data="|%-3d | %-2s | %-5s| %12d| %12s|%n";
        for(int i=0;i<reg.length;i++){
            total[i]=prfMarks[i]+dbmsMarks[i];
            average[i]=total[i]/2;
        }
        sort(reg,regName,prfMarks,dbmsMarks,index,total,average);
        for(int i=0;i<reg.length;i++){
            if(total[i]>0){
                System.out.format(data,(i+1),reg[i],regName[i],total[i],average[i]);
            }
        }
        System.out.println("+-----+-------+----------+--------------+-------------+");
        System.out.print("Do you want to go back to main menu(Y/n) " );
        String status ="s";
        status = input.next();

        if(status.equals("Y")){
            printStudentRanks(reg,regName,prfMarks,dbmsMarks,index,total,average);
        }else if(status.equals("n")){
            clearConsole();
            homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
        }
    }
    public static int search(String id,String[]reg){
        int x=0;
        for(x=0;x<10;x++){
            if(id.equals(reg[x])){
                return x;
            }
        }
        x=-1;
        return x;
    }
    public static void sort (String[] reg,String[] regName,int[] prfMarks,int[] dbmsMarks,int index,int[]
            total,double[] average){
        for(int i=0;i<reg.length;i++){
            for(int j=0;j<reg.length-1;j++){
                total[i]=prfMarks[i]+dbmsMarks[i];
                if(total[j]<total[j+1]){
                    int temp=total[j];
                    String temp1=reg[j];
                    String temp2=regName[j];
                    int temp3=prfMarks[j];
                    int temp4=dbmsMarks[j];
                    double temp5=average[j];
                    total[j]=total[j+1];
                    reg[j]=reg[j+1];
                    regName[j]=regName[j+1];
                    prfMarks[j]=prfMarks[j+1];
                    dbmsMarks[j]=dbmsMarks[j+1];
                    average[j]=average[j+1];
                    total[j+1]=temp;
                    reg[j+1]=temp1;
                    regName[j+1]=temp2;
                    prfMarks[j+1]=temp3;
                    dbmsMarks[j+1]=temp4;
                    average[j+1]=temp5;
                }
            }
        }
    }
    public static void bestPRF(String[] reg,String[] regName,int[] prfMarks,int[] dbmsMarks,int
            index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();


        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t BEST IN PROGRAMMING FUNDAMENTALS \t \t \t \t \t \t |");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println();

        System.out.println("+------+----------+------------+-------------+");
        System.out.println(" Id |"+" Name |"+" PF Marks |"+" DBMS Marks |");
        System.out.println("+------+----------+------------+-------------+");
        String data="|%-3s | %-9s| %10d | %11d |%n";

        for(int i=0;i<reg.length;i++){
            for(int j=0;j<reg.length-1;j++){
                if(prfMarks[j]<prfMarks[j+1]){
                    int temp=prfMarks[j];
                    String temp1=reg[j];
                    String temp2=regName[j];
                    int temp4=dbmsMarks[j];

                    prfMarks[j]=prfMarks[j+1];
                    reg[j]=reg[j+1];
                    regName[j]=regName[j+1];
                    dbmsMarks[j]=dbmsMarks[j+1];

                    prfMarks[j+1]=temp;
                    reg[j+1]=temp1;
                    regName[j+1]=temp2;
                    dbmsMarks[j+1]=temp4;

                }
            }
        }
        for(int i=0;i<reg.length;i++){
            if(prfMarks[i]>0){
                System.out.format(data,reg[i],regName[i],prfMarks[i],dbmsMarks[i]);
            }
        }
        System.out.println("+------+----------+------------+-------------+");
        System.out.print("Do you want to go back to main menu(Y/n) " );
        String status ="s";
        status = input.next();
        if(status.equals("Y")){
            bestPRF(reg,regName,prfMarks,dbmsMarks,index,total,average);
        }else if(status.equals("n")){
            clearConsole();
            homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
        }
    }

    public static void bestDBMS(String[] reg,String[] regName,int[] prfMarks,int[] dbmsMarks,int
            index,int[] total,double[] average){
        Scanner input=new Scanner(System.in);
        clearConsole();
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\t \t \t \t BEST IN DATABASE MANAGEMENT SYSTEMS \t \t \t \t \t \t |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("");
        System.out.println("+------+----------+--------------+------------+");
        System.out.println(" Id |"+" Name |"+" DBMS Marks |"+" PF Marks |");
        System.out.println("+------+----------+------------+-------------+");
        String data="|%-3s | %-9s| %12d | %9d |%n";

        for(int i=0;i<reg.length;i++){
            for(int j=0;j<reg.length-1;j++){

                if(dbmsMarks[j]<dbmsMarks[j+1]){
                    int temp=dbmsMarks[j];
                    String temp1=reg[j];
                    String temp2=regName[j];
                    int temp3=prfMarks[j];

                    dbmsMarks[j]=dbmsMarks[j+1];
                    reg[j]=reg[j+1];
                    regName[j]=regName[j+1];
                    prfMarks[j]=prfMarks[j+1];

                    dbmsMarks[j+1]=temp;
                    reg[j+1]=temp1;
                    regName[j+1]=temp2;
                    prfMarks[j+1]=temp3;

                }
            }
        }
        for(int i=0;i<reg.length;i++){
            if(dbmsMarks[i]>0){
                System.out.format(data,reg[i],regName[i],dbmsMarks[i],prfMarks[i]);
            }
        }
        System.out.println("+------+----------+------------+-------------+");
        System.out.print("Do you want to go back to main menu(Y/n) " );
        String status ="s";
        status = input.next();

        if(status.equals("Y")){
            bestDBMS(reg,regName,prfMarks,dbmsMarks,index,total,average);
        }else if(status.equals("n")){
            clearConsole();
            homePage(reg,regName,prfMarks,dbmsMarks,index,total,average);
        }
    }

    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
// Handle any exceptions.
        }

    }

    //    public static boolean searchElement(String[] reg,String[] regName,int[] prfMarks,int[]  dbmsMarks,int index,int[] total,double[] average)
//
//
//for(int i=0; i<reg.length; i++){
//if(reg[i].equals(id)){
//return true;
//}else{
//pushToRegArray(reg,regName,prfMarks,dbmsMarks,index,total,average);
//}
//}
//return false;
//}
    public static void main (String args[]){
        //create 1D arrays for each which has 100 length to enter 100 elements
        String[] reg = new String[100];
        String[] regName = new String[100];
        int[] prfMarks = new int[100];
        int[] dbmsMarks = new int[100];
        int[] total = new int[100];
        double[] average = new double[100];
        int index = 0;

        homePage(reg, regName, prfMarks, dbmsMarks, index, total, average);


    }
}