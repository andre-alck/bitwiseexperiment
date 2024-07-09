import java.io.File;

public class MiniTest {
    private Object object;

    private MiniTest() {}

    public static void logForDebugging(Object logContent) {
        MiniTest.logForDebugging(new Object[] { logContent });
    }

    public static void logForDebugging(Object[] logContents) {
        if(logContents == null || logContents.length < 1) {
            return;
        }

        for(Object logContent : logContents) {
            if (logContent == null) {
                MiniTest.log(null);
            } else {
                MiniTest.log(logContent.toString());   
            }
        }
    }

    private static void log(String logContent) {
        System.out.println(logContent);
    }

    public static MiniTest assertThat(Object object) {
        MiniTest instance = new MiniTest();
        instance.object = object;
        return instance;
    }

    public boolean isEqualTo(Object object) {
        if (object == null) {
            return this.informTestStatus(this.object == null);
        }

        return this.informTestStatus(this.object.equals(object));
    }

    private boolean informTestStatus(boolean expression) {
        String name;
        if (expression) {
            name = "firedrill.png";
        } else {
            name = "nogodplsno.jpg";
        }

        this.openImage(name);
        return expression;
    }

    private void openImage(String name) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("eog", name);
            processBuilder.directory(new File("/home/asac/Downloads"));
            processBuilder.start();
        } catch (Exception e) {
            this.handleException(e);
        }
    }

    private void handleException(Exception e) {
        System.out.println(e.getMessage());
    }
}
