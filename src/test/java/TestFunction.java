import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestFunction {
    @Test
    public void test() {
        String str = "aaaaaaa";
        System.out.println(str.substring(0, 1));
    }

    @Test
    public void test1() {
       Set<String> data = new HashSet<String>();
        data.add("leet");
        data.add("code");
      Object[]data1=data.toArray();
      System.out.println(data1[0]);
      System.out.println(data1[1]);
      String str=new String();
      for(int n=0;n<data1.length;n++)
      {str=str+data1[n]; }
      System.out.println(str);
      }

    @Test
    public void test2()
    {char []a=new char[2];
    System.out.println(a[0]);
    }

@Test
    public void test3()
{System.out.println(10<<2);
System.out.println(Math.pow(3,2));}

@Test
    public void test4()
{String result="leetcode";
    Assert.assertEquals("",result.substring(0,0));
}

@Test
    public void test5()
{ArrayList<Integer> in=new ArrayList<>();
in.add(2);
ArrayList<Integer> in2=new ArrayList<>();
in2.add(3);
in2.add(4);
ArrayList<Integer> in3=new ArrayList<>();
ArrayList<ArrayList<Integer>> out=new ArrayList<>();
out.add(in);
out.add(in2);
System.out.println(out.get(1).get(0));

}

@Test
    public void test6()
{

}

}