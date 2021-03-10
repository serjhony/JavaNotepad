/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_test_package;

import proje_0517_38_78_79.Content;
import proje_0517_38_78_79.NewJFrame;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Egos
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws FileNotFoundException, IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        File file = new File("words.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String line;
        while ((line = br.readLine()) != null) {
            
            if(line != "\n" || line != " " || line != ""){
                arrayList.add(line);
            }
            
        }
        Content content = new Content(arrayList);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void NewJFrameNesne(){
        NewJFrame mJframe = new NewJFrame();
        assertNotNull(mJframe);
    }
    @Test
    public void contentNesne(){
        Content c = new Content();
        assertNotNull(c);
    }
    @Test
    public void contentNesnePolymorph(){
        Content c = new Content(new ArrayList<String>());
        assertNotNull(c);
    }
    @Test
    public void contentKelimeYazma(){
        Content c = new Content();
        c.add("expected");
        assertEquals("expected", c.metin);
    }
    @Test
    public void contentYanlisKelime(){
        Content c = new Content();
        c.add("expceted");
        assertNotEquals("expceted", c.metin);
    }
    @Test
    public void contentDüzeltilenKelime(){
        Content c = new Content();
        c.add("expceted");
        assertEquals("expected", c.metin);
    }
    
   
    @Test
    public void contentCümle(){
        Content c = new Content();
        c.add("This ");
        c.add("is ");
        c.add("a ");
        c.add("test ");
        c.add("sentence.");
        assertEquals("This is a test sentence.", c.metin);
    }
   
   
}
