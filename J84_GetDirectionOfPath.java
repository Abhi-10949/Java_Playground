public class J84_GetDirectionOfPath {

    public static float getShortestPath(String path){
        int x = 0; int y =0;
        for(int i = 0 ;i<path.length();i++){
            char direction = path.charAt(i);
            //for south
            if(direction == 'S'){
                y--;
            }
            //for north 
            else if(direction == 'N'){
                y++;
            }
            //for west
            else if(direction == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int X2 = x*x; //this is x^2
        int Y2 = y*y; //this is y^2
        return  (float)Math.sqrt(X2+Y2); //this is square root of x^2 + y^2.
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}