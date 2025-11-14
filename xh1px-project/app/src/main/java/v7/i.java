package v7;

/* loaded from: classes.dex */
public class i extends h implements l {
    @Override // v7.h, n6.InterfaceC1162a
    public final Object a() {
        Object a3 = super.a();
        if (a3 != null) {
            return a3;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue", "invoke"));
    }
}
