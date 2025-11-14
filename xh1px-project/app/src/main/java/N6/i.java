package N6;

import a6.AbstractC0436k;
import java.util.List;
import java.util.ServiceLoader;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class i implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public static final i f3791d = new Object();

    @Override // n6.InterfaceC1162a
    public final Object a() {
        j jVar = j.f3792a;
        ServiceLoader load = ServiceLoader.load(k.class, k.class.getClassLoader());
        o6.j.d(load, "load(...)");
        List Q02 = AbstractC0436k.Q0(load);
        if (!Q02.isEmpty()) {
            return Q02;
        }
        throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }
}
