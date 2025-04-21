package org.example;

public class Main {

  static class Solution {
    public int findCircleNum(int[][] isConnected) {
      int count = 0;
      for(int i = 0; i < isConnected.length; ++i){
        if(isConnected[i][i] == 1){
          ++count;
          isConnected[i][i] = -1;
          for(int j = i+1; j < isConnected.length; ++j){
            if(isConnected[i][j] == 1){
              startExecution(isConnected, j);
            }
          }
        }
      }
      return count;
    }
    public void startExecution(int[][] isConnected, int j){
      isConnected[j][j] = -1;
      int i = j;
      ++j;
      for(; j < isConnected.length; ++j){
        if(isConnected[i][j] == 1){
          startExecution(isConnected, j);
        }
      }
    }
  }

  public static void main(String[] args) {

  }

}