package Q7;

import a.AbstractC0405a;
import f6.AbstractC0711a;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4967a = 0;

    static {
        Object b4;
        Object b9;
        Exception exc = new Exception();
        String simpleName = AbstractC0405a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            b4 = AbstractC0711a.class.getCanonicalName();
        } catch (Throwable th) {
            b4 = Z5.a.b(th);
        }
        if (Z5.l.a(b4) != null) {
            b4 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            b9 = s.class.getCanonicalName();
        } catch (Throwable th2) {
            b9 = Z5.a.b(th2);
        }
        if (Z5.l.a(b9) != null) {
            b9 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
