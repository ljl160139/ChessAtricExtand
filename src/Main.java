/**
 * Created by kinglong on 2017/7/3.
 */
public class Main {


    static int columns = 4;  //列
    static int rows = 5;    //行
    static int[] markIndex = {16,18,19};   //哪些棋子不能走
    static int startIndex = 1;    //开始位置


    public static void main(String[] args) {
        //设置起始位置，查找路径
        PathFinder.findPath(startIndex, PathFinder.getChessBoard(PathFinder.getChesses(columns, rows, markIndex), columns, rows));

        //不设置其实位置查找全部路径
        //PathFinder.findAllPath( PathFinder.getChessBoard(PathFinder.getChesses(colums, rows, markIndex), colums, rows));
    }
}
