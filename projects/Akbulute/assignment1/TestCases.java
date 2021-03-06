/*
 * This file was automatically generated by EvoSuite
 * Sun Jul 09 20:30:19 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MergeSort_ESTest extends MergeSort_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      mergeSort0.sort((int[]) null, 2849, (-743));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        mergeSort0.merge(intArray0, 0, 710, 710);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         assertThrownBy("MergeSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mergeSort0.merge(intArray0, (-1), 11, 380);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         assertThrownBy("MergeSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[0];
      MergeSort.printArray(intArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      // Undeclared exception!
      try { 
        mergeSort0.sort((int[]) null, 4, 1331);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("MergeSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      int[] intArray0 = new int[1];
      mergeSort0.sort(intArray0, 0, (-497));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        mergeSort0.sort(intArray0, 0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("MergeSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        MergeSort.printArray((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("MergeSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      int[] intArray0 = new int[2];
      MergeSort.printArray(intArray0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      // Undeclared exception!
      try { 
        mergeSort0.merge((int[]) null, (-701), (-701), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("MergeSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        mergeSort0.merge(intArray0, 7, 7, (-409));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("MergeSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      int[] intArray0 = new int[6];
      mergeSort0.merge(intArray0, 0, 0, 0);
      assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      int[] intArray0 = new int[2];
      mergeSort0.merge(intArray0, (-1), (-1), (-1));
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        MergeSort.main((String[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         assertThrownBy("MergeSort", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MergeSort mergeSort0 = new MergeSort();
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        mergeSort0.merge(intArray0, 0, 1, 12);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         assertThrownBy("MergeSort", e);
      }
  }
}

