package pdf;

/**
 * @author boolean
 * Date: 2019/5/20 18:11
 * description:
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.SimpleBookmark;

public class TestPdf {

    public static void main ( String [] args ) throws Exception {
        PdfReader reader = new PdfReader ( "F:/书籍/java基础/Java核心技术 卷2 高级特性 原书第10版(1)" ) ;
        List<HashMap<String, Object>> list = SimpleBookmark.getBookmark ( reader ) ;

        for ( Iterator<HashMap<String, Object>> i = list.iterator () ; i.hasNext () ; ) {

            showBookmark ( i.next ()) ;

        }
        for ( Iterator<HashMap<String, Object>> i = list.iterator () ; i.hasNext () ; ) {

            getPageNumbers( i.next ());
        }

    }
    //获取标题
    private static void showBookmark ( HashMap<String, Object> bookmark) {
        System.out.println (bookmark.get ( "Title" )) ;
        @SuppressWarnings("unchecked")
        ArrayList<HashMap<String, Object>> kids =  (ArrayList<HashMap<String, Object>>) bookmark.get ( "Kids" ) ;
        if ( kids == null )
            return ;
        for ( Iterator<HashMap<String, Object>> i = kids.iterator () ; i.hasNext () ; ) {

            showBookmark ( i.next ()) ;
        }
    }

    //获取页码
    public static void getPageNumbers(HashMap<String, Object> bookmark) {
        if (bookmark == null)
            return;

        if ("GoTo".equals(bookmark.get("Action"))) {

            String page = (String)bookmark.get("Page");
            if (page != null) {

                page = page.trim();

                int idx = page.indexOf(' ');

                int pageNum;

                if (idx < 0){

                    pageNum = Integer.parseInt(page);
                    System.out.println ("pageNum :"+ pageNum) ;
                }
                else{

                    pageNum = Integer.parseInt(page.substring(0, idx));
                    System.out.println ("pageNum:" +pageNum) ;
                }
            }
            @SuppressWarnings("unchecked")
            ArrayList<HashMap<String, Object>> kids =  (ArrayList<HashMap<String, Object>>) bookmark.get ( "Kids" ) ;
            if ( kids == null )
                return ;
            for ( Iterator<HashMap<String, Object>> i = kids.iterator () ; i.hasNext () ; ) {

                getPageNumbers ( i.next ()) ;
            }

        }
    }

}
