package L7;

/* renamed from: L7.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165x extends Error {
    public C0165x() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165x(String str) {
        super(str);
        o6.j.e(str, "message");
    }
}
