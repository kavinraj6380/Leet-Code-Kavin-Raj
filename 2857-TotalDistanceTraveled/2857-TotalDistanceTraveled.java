// Last updated: 8/11/2026, 2:21:55 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
     int dist=0;
     while(mainTank>=5 && additionalTank>=1){
        dist+=10*5;
        mainTank-=4;
        additionalTank-=1;
     }
     return dist+(mainTank*10);
     }   
    }
