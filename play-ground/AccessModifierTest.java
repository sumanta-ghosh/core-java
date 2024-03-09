package play.ground;

public class AccessModifierTest {

  public static void main(String[] args) {
    // OuterClass myOuter = new OuterClass();
    // System.out.println(myOuter.name);
    OuterClass.InnerClass myInner = new OuterClass().new InnerClass();
    myInner.print();
  }
}
