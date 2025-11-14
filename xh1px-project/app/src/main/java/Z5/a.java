package Z5;

import e6.EnumC0646a;
import h6.AbstractC0836a;
import i6.AbstractC0885a;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import n6.InterfaceC1162a;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0646a f7471a = EnumC0646a.f10656d;

    public static void a(Throwable th, Throwable th2) {
        o6.j.e(th, "<this>");
        o6.j.e(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC0885a.f11769a;
            if (num != null && num.intValue() < 19) {
                Method method = AbstractC0836a.f11420a;
                if (method != null) {
                    method.invoke(th, th2);
                    return;
                }
                return;
            }
            th.addSuppressed(th2);
        }
    }

    public static final k b(Throwable th) {
        o6.j.e(th, "exception");
        return new k(th);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Z5.m, java.lang.Object, Z5.g] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, Z5.g, Z5.z] */
    public static g c(h hVar, InterfaceC1162a interfaceC1162a) {
        v vVar = v.f7503a;
        int ordinal = hVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    ?? obj = new Object();
                    obj.f7507d = interfaceC1162a;
                    obj.f7508e = vVar;
                    return obj;
                }
                throw new NoWhenBranchMatchedException();
            }
            ?? obj2 = new Object();
            obj2.f7489d = interfaceC1162a;
            obj2.f7490e = vVar;
            return obj2;
        }
        return new n(interfaceC1162a);
    }

    public static final void d(Object obj) {
        if (!(obj instanceof k)) {
        } else {
            throw ((k) obj).f7487d;
        }
    }

    public static final String e(int i4, long j) {
        if (j >= 0) {
            AbstractC1492c.f(i4);
            String l6 = Long.toString(j, i4);
            o6.j.d(l6, "toString(...)");
            return l6;
        }
        long j5 = i4;
        long j8 = ((j >>> 1) / j5) << 1;
        long j9 = j - (j8 * j5);
        if (j9 >= j5) {
            j9 -= j5;
            j8++;
        }
        AbstractC1492c.f(i4);
        String l8 = Long.toString(j8, i4);
        o6.j.d(l8, "toString(...)");
        AbstractC1492c.f(i4);
        String l9 = Long.toString(j9, i4);
        o6.j.d(l9, "toString(...)");
        return l8.concat(l9);
    }
}
