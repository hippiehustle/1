package z6;

import a6.AbstractC0436k;
import java.util.ServiceLoader;
import n6.InterfaceC1162a;

/* renamed from: z6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1878a implements InterfaceC1162a {

    /* renamed from: e, reason: collision with root package name */
    public static final C1878a f16702e = new C1878a(0);

    /* renamed from: f, reason: collision with root package name */
    public static final C1878a f16703f = new C1878a(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16704d;

    public /* synthetic */ C1878a(int i4) {
        this.f16704d = i4;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f16704d) {
            case 0:
                C1879b c1879b = C1879b.f16705a;
                ServiceLoader load = ServiceLoader.load(InterfaceC1880c.class, InterfaceC1880c.class.getClassLoader());
                o6.j.b(load);
                InterfaceC1880c interfaceC1880c = (InterfaceC1880c) AbstractC0436k.q0(load);
                if (interfaceC1880c != null) {
                    return interfaceC1880c;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            default:
                h hVar = new h(new v7.k("DefaultBuiltIns"));
                hVar.c();
                return hVar;
        }
    }
}
