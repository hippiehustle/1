package w7;

import f7.C0723c;
import n6.InterfaceC1163b;

/* renamed from: w7.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1757t implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1757t f16013e = new C1757t(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16014d;

    public /* synthetic */ C1757t(int i4) {
        this.f16014d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f16014d) {
            case 0:
                AbstractC1759v abstractC1759v = (AbstractC1759v) obj;
                o6.j.e(abstractC1759v, "it");
                return abstractC1759v.toString();
            default:
                if (((C0723c) obj) != null) {
                    return Boolean.valueOf(!r2.equals(z6.m.f16791y));
                }
                throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
        }
    }
}
