package sample;

public class ForSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
            for(var i = 1; i <= 10; i++) { 
            System.out.println(i); 
            }
            
            for(int j = 1; j <= 20; j++) { 
                if(j % 2== 0) { 
                System.out.println(j); 
                } 
                }
            
            for (int g = 2; g <= 100; g+=2) { 
                if (g > 20) { 
                // 繰り返しから抜け出す
                break; 
                } 
                System.out.println(g); 
                }
    }

}
