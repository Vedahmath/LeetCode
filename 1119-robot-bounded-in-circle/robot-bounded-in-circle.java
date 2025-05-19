class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0, y=0, direction=0;
          for(char ch : instructions.toCharArray()){
            if(ch == 'G'){         
                switch (direction){
                case 0: y++; break;
                case 1: x++; break;
                case 2: y--; break;
                case 3: x--; break;
                }
               
            }else if(ch == 'L'){
                direction = direction == 0 ? 3 : (direction-1);
                
            }else if(ch == 'R'){
                direction = (direction + 1)%4;
            }
        }
        if(direction!= 0 || (x == 0 && y == 0)){
            return true;
        }
        return false;
    }
}