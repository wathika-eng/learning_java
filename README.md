### Resources

- Oracle university - <https://academy.oracle.com/en/solutions-curriculum-java.html#java1-tab>
- Moocfi - <https://java-programming.mooc.fi/>

Install Java: <https://sdkman.io/>

<!-- packages - more classes -  small letters - reverse domain - com.me
classes - PascalCase - container for methods
methods - camelCase

intellj idea- new project - Java - project sdk

folder -> .idea and src -> packageName -> -->

```java
//  one public class per file
public class Hello
{
  public String name; // declare  a public var
  private int age; // can't be accessed outside class
  public static void main(String[] args){
    System.out.println("Hey");
    }
  
  // getter
  public static int getAge() {
    return age;
  }
   new Customer // a pointer/reference, allocate mem
   int price2 = 10, price3 = 11, price4 = 40;
   // each var must be declared separate or in one liner but not together with another
}

// other classes should be private
class Helper{}

// avoid this can cause null pointer
Clothing item1, item2 = new Clothing();
// use
Clothing item1 = new Clothing(), item2 = new Clothing();
//or each on it's own line

// input always read as string using scanner

// condition if true, assign to val 1 else assign to val 2
condition ? val1 : val2

switch (condition){
  case "something":
    val
  default:
    val
 }

 // array - collection of variables with same data type 
 // can't grow or shrink
 String[] names = {"hey", "bye"} //or 
 
 String[] names = new String[2] // 2 is size, have null at start

 Arrays.sort(names) // builtin 
 // enhanced for loop or for each
 for(String fruit: fruits){
   System.out.println(fruit);
   }
   
  // don't have a fixed size, like slices in Go
  // can only contains objects, but you can use primitive wrappers I, L, B
  ArrayList<DataType> friends = new ArrayList<>(Arrays.asList("John")); // diamond operator
  // method calls
  friends.get(idx); //element at index
  friends.size(); // length
  
  // can't add to an array but can add to ArrayList with .add()
  friends.set(idx, val) // update
  friends.remove(idx or val)
  // prints all values directly
```
