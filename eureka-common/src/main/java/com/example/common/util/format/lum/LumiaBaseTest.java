package format.lum;

import javax.swing.*;
import java.util.function.Consumer;

public class LumiaBaseTest {
    public static void main(String[] args) {

        /*new Thread(
                () -> System.out.println("hello world")
        ).start();
*/
        /*Consumer<Integer>  c = (x) -> {
                System.out.println(6+x);
                        };
        System.out.println(c);
*/
        Runnable r = () -> System.out.println("hello world");
        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton = new JButton("MyJButton");

        jButton.addActionListener(( event)->{
            System.out.println("哈哈哈");
        });
    }
}
