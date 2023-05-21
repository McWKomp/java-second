package homeworkjava2;

public class secondProject {

    public static void main(String [] args){
        taskManager();
    }

    //PRINT -----
    public static void print(String print){
        System.out.println(print);
    }

    //TASK 1 -----
    public static void task1(int a){
        if(a==0){
            print("True. Value: "+a);
        } else {
            print("False. Value: "+a);
        }
    }

    //TASK 2 -----
    public static void task2(int a){
        if(a>0){
            print("True. Value: "+a);
        } else {
            print("False. Value: "+a);
        }
    }

    //TASK 3 -----
    public static void task3(int a){
        if(a<0){
            print("True. Value: "+a);
        } else {
            print("False. Value: "+a);
        }
    }

    //TASK 4 -----
    public static void task4(int a){
        if(a>=0){
            print("True. Value: "+a);
        } else {
            print("False. Value: "+a);
        }
    }

    //TASK 5 -----
    public static void task5(int a){
        if(a<=0){
            print("True. Value: "+a);
        } else {
            print("False. Value: "+a);
        }
    }

    //TASK 6 -----
    public static void task6(int a){
        if(a!=0){
            print("True. Value: "+a);
        } else {
            print("False. Value: "+a);
        }
    }

    //TASK 7 -----
    public static void task7(String a){
        if(a == "test"){
            print("True. Value: "+a);
        } else {
            print("False. Value: "+a);
        }
    }

    //TASK 10 -----
    public static void task10(boolean test){
        if(!test){
            print("True. Value: "+test);
        } else {
            print("False. Value: "+test);
        }
    }

    //TASK 11 -----
    public static void task11(int a){
        if(a>0 && a<5){
            print("True. Value: "+a);
        } else{
            print("False. Value: "+a);
        }
    }

    //TASK 12 -----
    public static void task12(int a){
        if (a == 0 || a == 2){
            print(a +" + 7 = " + Integer.toString(a+7));
        } else {
            print(a +" / 10 = " + Integer.toString(a/10));
        }
    }

    //TASK 13 -----
    public static void task13(int a, int b){
        if( a<= 1 && b >=3){
            print(a +" + " + b + " = " +Integer.toString(a+b));
        } else{
            print(a +" - " + b + " = " +Integer.toString(a-b));
        }
    }

    //TASK 14 -----
    public static void task14(int a, int b){
        if (a>2 && a< 11 || b>=6 && b< 14){
            print("True. Values: "+a +" and "+b);
        } else{
            print("False. Values: "+a +" and "+b);
        }
    }

    //TASK 15 -----
    public static void task15(int num){
        switch (num) {
            case 1:
                print("Winter");
                break;
            case 2:
                print("Spring");
                break;
            case 3:
                print("Summer");
                break;
            case 4:
                print("Fall");
                break;
        }
    }

    //TASK 16 -----
    public static void task16(int day){
        if (day >= 1 && day < 11) {
            print("It is first decade");
        } if (day >= 11 && day < 21) {
            print("It is second decade");
        } if (day >= 21 && day <= 31) {
            print("It is third decade");
        }
    }


    //TASK 17 -----
    public static void task17(int month){
        if (month >= 1 && month < 4) {
            print("It is winter");
        } if (month >= 4 && month < 7) {
            print("It is spring");
        } if (month >= 7 && month < 10) {
            print("It is summer");
        } if (month >= 10 && month <= 12) {
            print("It is fall");
        }
    }

    //TASK MANAGER -----
    public static void taskManager(){

        //TASK 1 -----
        print("TASK 1 -----");
        task1(1);
        task1(0);
        task1(-3);

        print("TASK 2 -----");
        //TASK 2 -----
        task2(1);
        task2(0);
        task2(-3);

        print("TASK 3 -----");
        //TASK 3 -----
        task3(1);
        task3(0);
        task3(-3);

        print("TASK 4 -----");
        //TASK 4 -----
        task4(1);
        task4(0);
        task4(-3);

        print("TASK 5 -----");
        //TASK 5 -----
        task5(1);
        task5(0);
        task5(-3);

        print("TASK 6 -----");
        //TASK 6 -----
        task6(1);
        task6(0);
        task6(-3);

        print("TASK 7 -----");
        //TASK 7 -----
        task7("test");
        task7("тест");
        task7("3");

        print("TASK 10 -----");
        //TASK 10 -----
        task10(true);
        task10(false);

        print("TASK 10b (Ternary) -----");
        //TASK 10b (Ternary) -----
        boolean test = true;
        String res = !test? ("True. "):("False. ");
        print(res + "Value: " + test);

        print("TASK 11 -----");
        //TASK 11 -----
        task11(5);
        task11(0);
        task11(-3);
        task11(2);

        print("TASK 12 -----");
        //TASK 12 -----
        task12(5);
        task12(0);
        task12(-3);
        task12(2);

        print("TASK 13 -----");
        //TASK 13 -----
        task13(1, 3);
        task13(0, 6);
        task13(3, 5);

        print("TASK 14 -----");
        //TASK 14 -----
        task14(1, 3);
        task14(0, 6);
        task14(3, 5);

        print("TASK 15 -----");
        //TASK 15 -----
        task15(1);
        task15(2);
        task15(3);
        task15(4);

        print("TASK 16 -----");
        //TASK 16 -----
        task16(6);
        task16(15);
        task16(28);

        print("TASK 17 -----");
        //TASK 17 -----
        task17(2);
        task17(5);
        task17(8);
        task17(11);

    }
}
