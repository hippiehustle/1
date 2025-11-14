package o6;

import P.S;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class j {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        h(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        h(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        h(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = j.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            h(nullPointerException, j.class.getName());
            throw nullPointerException;
        }
    }

    public static int f(int i4, int i8) {
        if (i4 < i8) {
            return -1;
        }
        if (i4 == i8) {
            return 0;
        }
        return 1;
    }

    public static final S g(Object[] objArr) {
        e(objArr, "array");
        return new S(objArr);
    }

    public static void h(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i4 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i4 = i8;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i4 + 1, length));
    }

    public static void i(String str) {
        RuntimeException runtimeException = new RuntimeException(A.j.p("lateinit property ", str, " has not been initialized"));
        h(runtimeException, j.class.getName());
        throw runtimeException;
    }
}
