import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public  class AppTest {
@BeforeClass 
public static void beforeClass(){
    System.out.println("Before Class");
}
@Before 
public  void before(){
    System.out.println("Before");
}
@Test 
public void teste1(){
    System.out.println("teste 1");
}
@Test 
public void teste2(){
    System.out.println("teste 2");
}
@Test 
public void teste3(){
    System.out.println("teste 3");
}

@After 
public  void afterClass(){
    System.out.println("After");
}

@AfterClass 
public static void AfterClass(){
    System.out.println("After Class");
}

}
