public class Arrays {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 92;
//        myArr[1] = 64;
//        myArr[2] = 28;
//        myArr[3] = 37;
//        myArr[4] = 85;

        int[] myArr = {92, 64, 28, 37, 85};
        int index = 2;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[2]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[4]);

        //Array traversal
        int i = 0;
        while(i < myArr.length){
            System.out.println(myArr[i]);
            i++;
        }

        String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);
    }
}

