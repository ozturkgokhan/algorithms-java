package com.gokhan.algorithms;

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int coordinateX = 0, coordinateY = 0;

        for(int i= 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            switch (c) {
                case 'U' : coordinateY++;
                    break;
                case 'D' : coordinateY--;
                    break;
                case 'R' : coordinateX++;
                    break;
                case 'L' : coordinateX--;
                    break;
                default: throw new IllegalArgumentException("Other than one of the following arguments are passed: UDRL");
            }
        }

        return (coordinateX == 0 && coordinateY == 0);
    }
}
