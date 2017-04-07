package com.tartarjr;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by emuoztu on 3/28/2017.
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();

        HashMap<String, Pair<Integer, Integer>> validObstaclePositions = new HashMap<>();

        for (int a0 = 0; a0 < k; a0++) {
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();

            if (Math.abs(rQueen - rObstacle) == Math.abs(cQueen - cObstacle)) {
                if (rQueen > rObstacle && cQueen > cObstacle) {
                    if (!validObstaclePositions.containsKey("lb")) {
                        validObstaclePositions.put("lb", new Pair<>(rObstacle, cObstacle));
                    } else {
                        if (validObstaclePositions.get("lb").getKey() < rObstacle && validObstaclePositions.get("lb").getValue() < cObstacle) {
                            validObstaclePositions.put("lb", new Pair<>(rObstacle, cObstacle));
                        }
                    }
                }
                if (rQueen < rObstacle && cQueen < cObstacle) {
                    if (!validObstaclePositions.containsKey("rt")) {
                        validObstaclePositions.put("rt", new Pair<>(rObstacle, cObstacle));
                    } else {
                        if (validObstaclePositions.get("rt").getKey() > rObstacle && validObstaclePositions.get("rt").getValue() > cObstacle) {
                            validObstaclePositions.put("rt", new Pair<>(rObstacle, cObstacle));
                        }
                    }
                }
                if (rQueen > rObstacle && cQueen < cObstacle) {
                    if (!validObstaclePositions.containsKey("rb")) {
                        validObstaclePositions.put("rb", new Pair<>(rObstacle, cObstacle));
                    } else {
                        if (validObstaclePositions.get("rb").getKey() < rObstacle && validObstaclePositions.get("rb").getValue() > cObstacle) {
                            validObstaclePositions.put("rb", new Pair<>(rObstacle, cObstacle));
                        }
                    }
                }
                if (rQueen < rObstacle && cQueen > cObstacle) {
                    if (!validObstaclePositions.containsKey("lt")) {
                        validObstaclePositions.put("lt", new Pair<>(rObstacle, cObstacle));
                    } else {
                        if (validObstaclePositions.get("lt").getKey() > rObstacle && validObstaclePositions.get("lt").getValue() < cObstacle) {
                            validObstaclePositions.put("lt", new Pair<>(rObstacle, cObstacle));
                        }
                    }
                }
            }

            if (rQueen > rObstacle && cQueen == cObstacle) {
                if (!validObstaclePositions.containsKey("x-")) {
                    validObstaclePositions.put("x-", new Pair<>(rObstacle, cObstacle));
                } else {
                    if (validObstaclePositions.get("x-").getKey() < rObstacle) {
                        validObstaclePositions.put("x-", new Pair<>(rObstacle, cObstacle));
                    }
                }
            } else if (rQueen < rObstacle && cQueen == cObstacle) {
                if (!validObstaclePositions.containsKey("x+")) {
                    validObstaclePositions.put("x+", new Pair<>(rObstacle, cObstacle));
                } else {
                    if (validObstaclePositions.get("x+").getKey() > rObstacle) {
                        validObstaclePositions.put("x+", new Pair<>(rObstacle, cObstacle));
                    }
                }
            } else if (cQueen > cObstacle && rQueen == rObstacle) {
                if (!validObstaclePositions.containsKey("y-")) {
                    validObstaclePositions.put("y-", new Pair<>(rObstacle, cObstacle));
                } else {
                    if (validObstaclePositions.get("y-").getValue() < cObstacle) {
                        validObstaclePositions.put("y-", new Pair<>(rObstacle, cObstacle));
                    }
                }
            } else if (cQueen < cObstacle && rQueen == rObstacle) {
                if (!validObstaclePositions.containsKey("y+")) {
                    validObstaclePositions.put("y+", new Pair<>(rObstacle, cObstacle));
                } else {
                    if (validObstaclePositions.get("lt").getValue() > cObstacle) {
                        validObstaclePositions.put("y+", new Pair<>(rObstacle, cObstacle));
                    }
                }
            }
        }

        for (Map.Entry<String, Pair<Integer, Integer>> entry : validObstaclePositions.entrySet()) {
            Pair value = entry.getValue();
            System.out.println(value.getKey() + ", " + value.getValue());
        }

    }

}
