public class UseFor {
    public boolean isResult(int a) {
        boolean result = true;
        if (a < 2) {
            result = false;
        } else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
