public class FizzBuzz(){
  init();
}

public init(){
int[] nums;
nums = int[100];

for (int i = 0; i<100;i++){
  StringBuilder sb;
  sb = new StringBuilder();
  if (i%3==0 && i%5==0){
    out = "FizzBuzz";
  }
  else if (i%3==0){
    out = "Fizz";
  }
  else if (i%5==0){
    out = "Buzz";
  }
  else {
    out = i;
  }
  println(out);
}
}
