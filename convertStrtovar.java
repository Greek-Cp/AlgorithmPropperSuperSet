package Array;

public class convertStrtovar {

    static void parseStrText(String[] text1 , String[]text2){
        /*
        {block A}
         */
        String Hello = text1[0];
        String World = text1[1];
        /*
        {block B }
         */
        String Apa = text2[0];
        String Kabar = text2[1];
        /*
        {concat}
         */
        String HelloWorld = Hello + World;
        String ApaKabar = Apa + Kabar;
        int lenHelloWorld =  getLenStr(HelloWorld);
        int lenApaKabar = getLenStr(ApaKabar);
        char A[] = new char[lenHelloWorld];
        char B[] = new char[lenApaKabar];
        strToArrayChar(A,B,lenHelloWorld,lenApaKabar,HelloWorld,ApaKabar);

    }
    static int getLenStr(String Text){
        int x = Text.length();
        return x;
    }
    static String toString(char a[],char b[]){
        String string = new String(a);
        return string;
    }
    static void CalculatePattern(char[]a,char[]b){
        int n = a.length; // last index
        for(int c= 0; c<= b.length -1; c++){
            a = new char[n + 1];
            a[n] = b[c];
            if(a[n] == 10){
                continue;
            }

            System.out.println(a[n]);
        }
    }
    static void strToArrayChar(char[]Aset, char[]Bset, int lenHelloWorld, int lenApaKabar, String Text_1 , String Text_2){
        for(int s = 0; s<= lenHelloWorld - 1;s++){
            Aset[s] = Text_1.charAt(s);
        }
        for(int c = 0; c<= lenApaKabar - 1; c++){
            Bset[c] = Text_2.charAt(c);
        }
//        System.out.println("Length: " + Aset.length);
//        for(int d = 0; d<= Aset.length - 1; d++){
//            System.out.println(Aset[d]);
//        }
//        for(int d = 0; d<= Bset.length - 1; d++){
//            System.out.println(Bset[d]);
//        }
        CalculatePattern(Aset,Bset);
    }

    public static void main(String[]args){
        String HelloWorld[] = {"Hello " , "World"};
        String ApaKabar[] = {"Apa","Kabar"};
        parseStrText(HelloWorld,ApaKabar);

//        char Array[] = new char[HelloWorld.length()];
//        for(int d = 0; d<= Array.length - 1; d++) {
//            Array[d] = HelloWorld.charAt(d);
//        }
//        for(int s = 0; s<= Array.length - 1; s++){
//            System.out.println(Array[s]);
//        }
//        String text2[] = {"Apa","Kabar"};
//        String Apa = "Apa";
        }

}
