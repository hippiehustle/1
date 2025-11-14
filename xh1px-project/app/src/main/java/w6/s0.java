package w6;

import java.lang.ref.SoftReference;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class s0 implements InterfaceC1162a {

    /* renamed from: f, reason: collision with root package name */
    public static final t0 f15909f = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1162a f15910d;

    /* renamed from: e, reason: collision with root package name */
    public volatile SoftReference f15911e;

    public s0(Object obj, InterfaceC1162a interfaceC1162a) {
        if (interfaceC1162a != null) {
            this.f15911e = null;
            this.f15910d = interfaceC1162a;
            if (obj != null) {
                this.f15911e = new SoftReference(obj);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        Object obj;
        Object obj2 = f15909f;
        SoftReference softReference = this.f15911e;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object a3 = this.f15910d.a();
        if (a3 != null) {
            obj2 = a3;
        }
        this.f15911e = new SoftReference(obj2);
        return a3;
    }
}
