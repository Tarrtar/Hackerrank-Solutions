package com.tartarjr;

import com.tartarjr.IO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by emuoztu on 3/27/2017.
 */
public class QueensAttackII {

    //possible directions of queen
    private static final String LEFT_BOTTOM = "lb";
    private static final String RIGHT_TOP = "rt";
    private static final String LEFT_TOP = "lt";
    private static final String RIGHT_BOTTOM = "rb";
    private static final String X_POSITIVE = "x+";
    private static final String X_NEGATIVE = "x-";
    private static final String Y_POSITIVE = "y+";
    private static final String Y_NEGATIVE = "y-";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int rQueen = in.nextInt();
        int cQueen = in.nextInt();

        List<Integer> inputs = IO.readFile();

        HashMap<String, Position<Integer, Integer>> validObstaclePositions = new HashMap<>();



        for (int a0 = 0; a0 <= inputs.size() - 2; a0 += 2) {
            int rObstacle = inputs.get(a0);
            int cObstacle = inputs.get(a0 + 1);

            if (Math.abs(rQueen - rObstacle) == Math.abs(cQueen - cObstacle)) {
                if (rQueen > rObstacle && cQueen > cObstacle) {
                    if (!validObstaclePositions.containsKey(LEFT_BOTTOM)) {
                        validObstaclePositions.put(LEFT_BOTTOM, new Position<Integer, Integer>(rObstacle, cObstacle));
                    } else {
                        if (validObstaclePositions.get(LEFT_BOTTOM).getKey() < rObstacle && validObstaclePositions.get(LEFT_BOTTOM).getValue() < cObstacle) {
                            validObstaclePositions.put(LEFT_BOTTOM, new Position<Integer, Integer>(rObstacle, cObstacle));
                        }
                    }
                }
                if (rQueen < rObstacle && cQueen < cObstacle) {
                    if (!validObstaclePositions.containsKey(RIGHT_TOP)) {
                        validObstaclePositions.put(RIGHT_TOP, new Position<Integer, Integer>(rObstacle, cObstacle));
                    } else {
                        if (validObstaclePositions.get(RIGHT_TOP).getKey() > rObstacle && validObstaclePositions.get(RIGHT_TOP).getValue() > cObstacle) {
                            validObstaclePositions.put(RIGHT_TOP, new Position<Integer, Integer>(rObstacle, cObstacle));
                        }
                    }
                }
                if (rQueen > rObstacle && cQueen < cObstacle) {
                    if (!validObstaclePositions.containsKey(RIGHT_BOTTOM)) {
                        validObstaclePositions.put(RIGHT_BOTTOM, new Position<Integer, Integer>(rObstacle, cObstacle));
                    } else {
                        if (validObstaclePositions.get(RIGHT_BOTTOM).getKey() < rObstacle && validObstaclePositions.get(RIGHT_BOTTOM).getValue() > cObstacle) {
                            validObstaclePositions.put(RIGHT_BOTTOM, new Position<Integer, Integer>(rObstacle, cObstacle));
                        }
                    }
                }
                if (rQueen < rObstacle && cQueen > cObstacle) {
                    if (!validObstaclePositions.containsKey(LEFT_TOP)) {
                        validObstaclePositions.put(LEFT_TOP, new Position<Integer, Integer>(rObstacle, cObstacle));
                    } else {
                        if (validObstaclePositions.get(LEFT_TOP).getKey() > rObstacle && validObstaclePositions.get(LEFT_TOP).getValue() < cObstacle) {
                            validObstaclePositions.put(LEFT_TOP, new Position<Integer, Integer>(rObstacle, cObstacle));
                        }
                    }
                }
            }

            if (rQueen > rObstacle && cQueen == cObstacle) {
                if (!validObstaclePositions.containsKey(Y_NEGATIVE)) {
                    validObstaclePositions.put(Y_NEGATIVE, new Position<Integer, Integer>(rObstacle, cObstacle));
                } else {
                    if (validObstaclePositions.get(Y_NEGATIVE).getKey() < rObstacle) {
                        validObstaclePositions.put(Y_NEGATIVE, new Position<Integer, Integer>(rObstacle, cObstacle));
                    }
                }
            } else if (rQueen < rObstacle && cQueen == cObstacle) {
                if (!validObstaclePositions.containsKey(Y_POSITIVE)) {
                    validObstaclePositions.put(Y_POSITIVE, new Position<Integer, Integer>(rObstacle, cObstacle));
                } else {
                    if (validObstaclePositions.get(Y_POSITIVE).getKey() > rObstacle) {
                        validObstaclePositions.put(Y_POSITIVE, new Position<Integer, Integer>(rObstacle, cObstacle));
                    }
                }
            } else if (cQueen > cObstacle && rQueen == rObstacle) {
                if (!validObstaclePositions.containsKey(X_NEGATIVE)) {
                    validObstaclePositions.put(X_NEGATIVE, new Position<Integer, Integer>(rObstacle, cObstacle));
                } else {
                    if (validObstaclePositions.get(X_NEGATIVE).getValue() < cObstacle) {
                        validObstaclePositions.put(X_NEGATIVE, new Position<Integer, Integer>(rObstacle, cObstacle));
                    }
                }
            } else if (cQueen < cObstacle && rQueen == rObstacle) {
                if (!validObstaclePositions.containsKey(X_POSITIVE)) {
                    validObstaclePositions.put(X_POSITIVE, new Position<Integer, Integer>(rObstacle, cObstacle));
                } else {
                    if (validObstaclePositions.get(X_POSITIVE).getValue() > cObstacle) {
                        validObstaclePositions.put(X_POSITIVE, new Position<Integer, Integer>(rObstacle, cObstacle));
                    }
                }
            }
        }

        printMaxPossibleMoves(n, rQueen, cQueen, validObstaclePositions);
    }

    private static void printMaxPossibleMoves(int n, int rQueen, int cQueen, HashMap<String, Position<Integer, Integer>> validObstaclePositions) {

        //calculate max linear moves possible
        int maxMovesXPositive = n - cQueen;
        int maxMovesXNegative = cQueen - 1;
        int maxMovesYPositive = n - rQueen;
        int maxMovesYNegative = rQueen - 1;

        //calculate max diagonal moves possible
        int maxMovesLeftBottom = Math.min(rQueen, cQueen) - 1;
        int maxMovesRightTop = n - Math.max(rQueen, cQueen);

        int maxMovesRightBottom = Math.min(rQueen - 1, n - cQueen);
        int maxMovesLeftTop = Math.min(n - rQueen, cQueen - 1);

        for (Map.Entry<String, Position<Integer, Integer>> entry : validObstaclePositions.entrySet()) {

            //calculating max moves for x axis with obstacles
            if (rQueen == validObstaclePositions.get(entry.getKey()).getKey() && cQueen > validObstaclePositions.get(entry.getKey()).getValue()) {
                //blockedLinearMoves += validObstaclePositions.get(entry.getKey()).getValue();
                maxMovesXNegative = cQueen - validObstaclePositions.get(entry.getKey()).getValue() - 1;
            }
            if (rQueen == validObstaclePositions.get(entry.getKey()).getKey() && cQueen < validObstaclePositions.get(entry.getKey()).getValue()) {
                maxMovesXPositive = validObstaclePositions.get(entry.getKey()).getValue() - cQueen - 1;
            }

            //calculating max moves for y axis with obstacles
            if (cQueen == validObstaclePositions.get(entry.getKey()).getValue() && rQueen > validObstaclePositions.get(entry.getKey()).getKey()) {
                maxMovesYNegative = rQueen - validObstaclePositions.get(entry.getKey()).getKey() - 1;
            }
            if (cQueen == validObstaclePositions.get(entry.getKey()).getValue() && rQueen < validObstaclePositions.get(entry.getKey()).getKey()) {
                maxMovesYPositive = validObstaclePositions.get(entry.getKey()).getKey() - rQueen - 1;
            }

            //calculating max moves for diagonal moves with obstacles
            if (Math.abs(rQueen - validObstaclePositions.get(entry.getKey()).getKey()) == Math.abs(cQueen - validObstaclePositions.get(entry.getKey()).getValue())) {
                if (rQueen > validObstaclePositions.get(entry.getKey()).getKey() && cQueen > validObstaclePositions.get(entry.getKey()).getValue()) {
                    maxMovesLeftBottom = Math.abs(rQueen - validObstaclePositions.get(entry.getKey()).getKey()) - 1;
                }
                if (rQueen < validObstaclePositions.get(entry.getKey()).getKey() && cQueen < validObstaclePositions.get(entry.getKey()).getValue()) {
                    maxMovesRightTop = Math.abs(rQueen - validObstaclePositions.get(entry.getKey()).getKey()) - 1;
                }
                if (rQueen > validObstaclePositions.get(entry.getKey()).getKey() && cQueen < validObstaclePositions.get(entry.getKey()).getValue()) {
                    maxMovesRightBottom = Math.abs(rQueen - validObstaclePositions.get(entry.getKey()).getKey()) - 1;
                }
                if (rQueen < validObstaclePositions.get(entry.getKey()).getKey() && cQueen > validObstaclePositions.get(entry.getKey()).getValue()) {
                    maxMovesLeftTop = Math.abs(rQueen - validObstaclePositions.get(entry.getKey()).getKey()) - 1;
                }
            }
        }

        System.out.println(maxMovesXPositive + maxMovesXNegative + maxMovesYPositive + maxMovesYNegative + maxMovesLeftBottom + maxMovesRightTop + maxMovesRightBottom + maxMovesLeftTop);
    }

    static final class Position<K, V> implements Map.Entry<K, V> {
        private final K row;
        private V column;

        public Position(K row, V column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public K getKey() {
            return row;
        }

        @Override
        public V getValue() {
            return column;
        }

        @Override
        public V setValue(V value) {
            V old = this.column;
            this.column = value;
            return old;
        }
    }
}
