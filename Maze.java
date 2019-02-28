import java.util.*;
import java.io.*;
public class Maze {
  private char[][]maze;
  private boolean animate;

  public Maze(String filename) throws FileNotFoundException{
    File f = new File(filename);
    if (/* find a way for it to make file not valid or not found*/) {
      throw new FileNotFoundException();
    }
    Scanner d = new Scanner(d);
    setAnimate(false);
  }

  public void setAnimate(boolean b){
    animate = b;
  }

  private void wait(int millis){
    try {
      Thread.sleep(millis);
      }
      catch (InterruptedException e) {
      }
    }

    public void clearTerminal(){
      //erase terminal, go to top left of screen.
      System.out.println("\033[2J\033[1;1H");
    }

//change the textfile that constructor received and change the characters.
public String toString(){
  String result;
}

/*Wrapper Solve Function returns the helper function
      Note the helper function has the same name, but different parameters.
      Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists.
    */

    //find the location of the S.
    //erase the S
    //and start solving at the location of the s.
    //return solve(???,???);
    public int solve(){
      for (int i = 0; i < maze.length; i++){
        for (int x = 0; x < maze[i].length; x++){
          if (maze[i][x] = 's'){
            maze[i][x] = ' ';
          return solve(i, x);
        }
        }
      }
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
    private int solve(int row, int col){
        if(animate){
            clearTerminal();
            System.out.println(this);
            wait(20);
        }

        //COMPLETE SOLVE
        return -1; //so it compiles
    }





















}
