package pdf;

import com.alibaba.fastjson.JSON;
import com.github.caryyu.excel2pdf.Excel2Pdf;
import com.github.caryyu.excel2pdf.ExcelObject;
import com.itextpdf.text.DocumentException;
import lombok.Builder;
import lombok.Data;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PdfTest1 {
//    @Test
//    public void test(){
//        ArrayList<Object> objects = new ArrayList<>();
//        if(CollectionUtils.isEmpty(objects)){
//            System.out.println("333");
//        }
//
//        for (Object c : objects){
//            System.out.println(1);
//        }
//    }

//

//    @Test
//    public void testExcelToPdf(){
//        //加载Excel文档
//        Workbook wb = new Workbook();
//        wb.loadFromFile("test.xlsx");
//
//        //调用方法保存为PDF格式
//        wb.saveToFile("ToPDF.pdf", FileFormat.PDF);
//    }

    @Test
    public void test() throws IOException, DocumentException {
        String pathOfXls = "D:\\test1.xls";
        String pathOfPdf = "D:\\test1.pdf";
        FileInputStream fis = new FileInputStream(pathOfXls);
        List<ExcelObject> objects = new ArrayList<ExcelObject>();
        objects.add(new ExcelObject("导航1", fis));
        FileOutputStream fos = new FileOutputStream(pathOfPdf);
        Excel2Pdf pdf = new Excel2Pdf(objects, fos);
        pdf.convert();
    }

    @Test
    public void test2() {
        List<User> list = new ArrayList<>();
        User chen = User.builder().name("chen").pass("123").build();
        Clothes red = Clothes.builder().color("RED").build();
        chen.setClothes(red);
        list.add(chen);
        User chen1 = User.builder().name("chen1").pass("456").build();
        list.add(chen1);
        List<Map> mapList = JSON.parseArray(JSON.toJSONString(list), Map.class);
        System.out.println(mapList);
        Map x = mapList.get(0);
        System.out.println(x);
        Map clothes = (Map)x.get("clothes");
        System.out.println(clothes.get("color"));
    }


}
