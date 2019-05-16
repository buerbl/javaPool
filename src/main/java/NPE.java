import org.junit.Test;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Objects;

/**
 * @Author buer
 * @create 2019/5/15 22:24
 * @description
 */
public class NPE {
    private String name;
    private int a;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NPE npe = (NPE) o;
        return Objects.equals(name, npe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    @Test
    public  void  test1(){
        if (name != null ){
            System.out.println(name);
        }else {
            System.out.println("q");
        }


    }

}
