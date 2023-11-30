package EjerProT8;

public class ejer8 {
    public static void main(String[] args) {
        int []num =  new int[100];
        
        for(int i = 0;i < 100;i++){
            num [i] = (int) (Math.random()*71 + 10);
        }
        int cont = 0;
        for(int e = 0;e < 100;e++){
            for(int u = 0;u < 100;u++){
                if(num[e] == num[u]){
                    cont++;
                }
            }
        }
    }
}
