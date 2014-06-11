import org.junit.Test;

import static org.junit.Assert.*;

public class MedianMaintainTest {

    @Test
    public void testMaintain(){


        MedianMaintain test = new MedianMaintain();
        String testFile1 = "C:\\JavaProject\\CourseraHW\\testMedian1.txt";
        String testFile2 = "C:\\JavaProject\\CourseraHW\\testMedian2.txt";


        assertEquals(54, test.findMedian(testFile1));


        assertEquals(82, test.findMedian(testFile2));



    }

}