package M7;

import L7.C0161t;
import android.os.Build;
import d6.AbstractC0615a;
import d6.InterfaceC0620f;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class b extends AbstractC0615a implements InterfaceC0620f {
    private volatile Object _preHandler;

    public b() {
        super(C0161t.f3243d);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r0.getModifiers()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(Throwable th) {
        Method method;
        Object obj;
        int i4 = Build.VERSION.SDK_INT;
        if (26 <= i4 && i4 < 28) {
            Object obj2 = this._preHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (obj2 != this) {
                method = (Method) obj2;
            } else {
                try {
                    method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                    if (Modifier.isPublic(method.getModifiers())) {
                    }
                } catch (Throwable unused) {
                }
                method = null;
                this._preHandler = method;
            }
            if (method != null) {
                obj = method.invoke(null, null);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
