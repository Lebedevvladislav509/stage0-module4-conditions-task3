package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if(second%first==0 && second != first){
            System.out.println("Aliquot");
        }
        System.out.println("Not aliquot");
    }
}
//"Aliquot" is yes otherwise "Not aliquot"
