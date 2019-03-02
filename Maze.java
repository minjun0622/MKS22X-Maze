import java.util.*;
import java.io.*;

public class Maze {
  private char[][]maze;
  private boolean animate;

  public Maze(String filename) throws FileNotFoundException{
    if (filename != /* not a valid file. */) {
      throw new FileNotFoundException();
    }
    animate = false;
  }

  public void setAnimate(boolean b){
    animate = b;
  }

    public void clearTerminal(){
      //erase terminal, go to top left of screen.
      System.out.println("\033[2J\033[1;1H");
    }

//change the textfile that constructor received and change the characters.
public String toString(){
  String result = "";
  for (int i = 0; i < maze.length; i++){
    for (int x = 0; x < maze[i].length; x++){
      result += maze[i][x];
    }
    result += "\n";
  }
}

    public int solve(){
      for (int i = 0; i < maze.length; i++){
        for (int x = 0; x < maze[i].length; x++){
          if (maze[i][x] = 'S'){
            maze[i][x] = ' ';
          return solve(i, x, 0);
        }
      }
    }
  }

  //helper method that checks for white space to see if there are any other moves available.
  private boolean solved() {
    for (int i = 0; i < maze.length; i++){
      for (int x = 0; x < board[i].length; x++){
        if (maze[i][x] = ' '){
          return true;
        }
      }
    }
    return false;
  }

    /*
      Recursive Solve function:

      A solved maze has a path marked with '@' from S to E.

      Returns the number of @ symbols from S to E when the maze is solved,
      Returns -1 when the maze has no solution.

      Postcondition:
        The S is replaced with '@' but the 'E' is not.
        All visited spots that were not part of the solution are changed to '.'
        All visited spots that are part of the solution are changed to '@'
    */
    //thinking of a way for a way to count the moves so when you trace back it helps you.
    /*
    up = maze[i - 1][x]
    down = maze[i + 1][x]
    left = maze [i][x - 1]
    right = maze[i][x + 1]
    how can you use the helper method and also the third parameter to help solve the maze?
    */
    private int solve(int row, int col, int moves){
        if(animate){
            clearTerminal();
            System.out.println(this);
            wait(20);
        }
        if (maze[row][col + 1] != '#') {
          maze[row][col] = '@';
          if (solved()) {
          solve(row, col + 1, moves + 1);
        }
      }
        if (maze[row + 1][col] != '#'){
          maze[row][col] = '@';
          if (solved()) {
            solve(row + 1, col, moves + 1);
          }
        }

        //if there is no solution.
        if (moves == 0) {
          return -1;
        }
    }
    private void wait(int millis){
      try {
        Thread.sleep(millis);
        }
        catch (InterruptedException e) {
        }
      }






















}
