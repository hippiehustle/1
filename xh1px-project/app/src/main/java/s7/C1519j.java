package s7;

import C6.EnumC0023y;
import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import a7.T;
import java.util.ArrayList;
import w7.AbstractC1759v;

/* renamed from: s7.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1519j implements InterfaceC1520k, InterfaceC1522m, InterfaceC1521l {

    /* renamed from: c, reason: collision with root package name */
    public static final C1519j f14591c = new C1519j(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C1519j f14592d = new C1519j(1);

    /* renamed from: e, reason: collision with root package name */
    public static final C1519j f14593e = new C1519j(2);

    /* renamed from: f, reason: collision with root package name */
    public static final C1519j f14594f = new C1519j(3);

    /* renamed from: g, reason: collision with root package name */
    public static final C1519j f14595g = new C1519j(4);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14596b;

    public /* synthetic */ C1519j(int i4) {
        this.f14596b = i4;
    }

    public static EnumC0023y e(a7.C c6) {
        int i4;
        if (c6 == null) {
            i4 = -1;
        } else {
            i4 = w.f14631a[c6.ordinal()];
        }
        EnumC0023y enumC0023y = EnumC0023y.f778e;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return enumC0023y;
                    }
                    return EnumC0023y.f779f;
                }
                return EnumC0023y.f781h;
            }
            return EnumC0023y.f780g;
        }
        return enumC0023y;
    }

    @Override // s7.InterfaceC1521l
    public void a(InterfaceC0002c interfaceC0002c) {
        if (interfaceC0002c != null) {
        } else {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // s7.InterfaceC1520k
    public Boolean b() {
        switch (this.f14596b) {
            case 1:
                return null;
            default:
                return Boolean.TRUE;
        }
    }

    @Override // s7.InterfaceC1522m
    public AbstractC1759v d(T t8, String str, w7.z zVar, w7.z zVar2) {
        o6.j.e(t8, "proto");
        o6.j.e(str, "flexibleId");
        o6.j.e(zVar, "lowerBound");
        o6.j.e(zVar2, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // s7.InterfaceC1521l
    public void c(InterfaceC0004e interfaceC0004e, ArrayList arrayList) {
    }
}
