public class UseWhile {
    public boolean While(int a) {
        boolean result = true;
        if (a < 2) {
            result = false;
        } else {
            for (int i = 0; i < (a/2); i++) {
                if (a % 2 == 0) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println("KQ:"+result);
        return result;
    }
}
