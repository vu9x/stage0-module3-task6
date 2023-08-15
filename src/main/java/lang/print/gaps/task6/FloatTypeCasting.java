package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int result = (int) (numberToBeRounded + 0.5f);
        System.out.println(result);
    }
}
