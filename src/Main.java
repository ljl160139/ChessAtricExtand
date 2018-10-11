/**
 * Created by kinglong on 2017/7/3.
 */
public class Main {


    static int columns = 6;  //列
    static int rows = 6;    //行
    static int[] markIndex = {3,7,29,33};   //哪些棋子不能走
    static int startIndex = 10;    //开始位置


    public static void main(String[] args) {
        //设置起始位置，查找路径
        PathFinder.findPath(startIndex, PathFinder.getChessBoard(PathFinder.getChesses(columns, rows, markIndex), columns, rows));

        //不设置其实位置查找全部路径
        //PathFinder.findAllPath( PathFinder.getChessBoard(PathFinder.getChesses(columns, rows, markIndex), columns, rows));
    }
}
