public class FizzBuzz(){
  init();
}

public init(){

for (int i = 1; i<101;i++){

  String out;
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
