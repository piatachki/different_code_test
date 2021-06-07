class Aggreagator {
    private SystemA systemA;
    private SystemB systemB;
  
    Object doRequest() { // 10 sec
       
        Object responseA = systemA.doRequest(); // 5 sec
        Object responseB = systemB.doRequest(); // 5 sec
  
        return aggregate(responseA, responseB);
    }
  
    Object aggregate(Object responseA, Object responseA) {
        // ...
        return data;
    }
}
  
class SystemA {
      
    Object doRequest() {
        // ...
        return data;
    }
}
  
  class SystemB {
      
    Object doRequest() {
        // ...
        return data;
    }
}
