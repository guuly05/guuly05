public class fmethod {
    public static int max(int z, int y){
       int result;
        if (z > y)
            result = z;

        else
             result = y;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 6));
    }
}

