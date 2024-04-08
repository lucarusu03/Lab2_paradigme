package ro.ulbs.paradigme.ex2;

import ro.ulbs.paradigme.ex2.doublechained.DoubleChainedList;
import ro.ulbs.paradigme.ex2.doublechained.DoubleChainedNode;
import ro.ulbs.paradigme.ex2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.ex2.simplechained.SimpleChainedNode;

public class Application {
    public static void main(String[] args) {
        SimpleChainedList simpleList = new SimpleChainedList();
        for(int i=1;i<=10;i++){
            simpleList.addValue(i);
        }
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        System.out.println("Lista simpla inlantuita: ");
        simpleList.listNodes();
        DoubleChainedList doubleList = new DoubleChainedList();
        for(int i=1;i<=10;i++){
            doubleList.addValue(i);
        }
        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);
        System.out.println("Lista dubla inlantuita: ");
        doubleList.listNodes();

        SimpleChainedNode currentS = simpleList.getHead();
        int sum1=0,sum2=0;
        while(currentS != null){
            sum1+= currentS.getValue();
            currentS=currentS.getNextNode();
        }
        DoubleChainedNode currentD = doubleList.getHead();
        while(currentD != null){
            sum2+= currentD.getValue();
            currentD=currentD.getNextNode();
        }
        System.out.println("Suma valorilor nodurilor din lista simpla: " + sum1);
        System.out.println("Suma valorilor nodurilor din lista dubla: " + sum2);
        if(doubleList.isSorted()){
            System.out.println("Lista dubla este crescatoare!");
        }
        else System.out.println("Lista dubla este descrescatoare!");

        if(simpleList.isSorted()){
            System.out.println("Lista simpla este crescatoare!");
        }
        else System.out.println("Lista simpla este descrescatoare!");

        System.out.println("TEST!");
    }
}
