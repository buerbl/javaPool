package 输入与输出;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import javax.xml.soap.SAAJResult;
import java.io.File;
import java.io.IOException;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/11/19 16:04
 */
@Slf4j
public class FileUtils extends org.apache.commons.io.FileUtils {

    /**
     * 创建单个目录
     * @param descDirName  目录名称
     * @return
     */
    public static boolean createDirectory(String descDirName){
        String descDirNames = descDirName;
        if (! descDirNames.endsWith(File.separator)){
            descDirNames = descDirNames + File.separator;
        }
        File descDir = new File(descDirNames);
        if (descDir.exists()){
            log.info("目录："+ descDir.getAbsolutePath() + "已经存在了");
            return false;
        }

        //创建目录
        if (descDir.mkdirs()){
            log.info("目录"+ descDirNames + "创建成功了");
            return true;
        }else {
            log.info("目录"+ descDirNames + "创建失败了");
            return false;
        }
    }





    @Test
    public void tetsCreat(){
        createDirectory("hello");

    }

    @Test
    public void testZip(){
        File file = new File("test.zip");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



