package C6;

import a6.AbstractC0436k;
import f7.C0722b;
import java.util.List;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class r implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final r f768e = new r(0);

    /* renamed from: f, reason: collision with root package name */
    public static final r f769f = new r(1);

    /* renamed from: g, reason: collision with root package name */
    public static final r f770g = new r(2);

    /* renamed from: h, reason: collision with root package name */
    public static final r f771h = new r(3);

    /* renamed from: i, reason: collision with root package name */
    public static final r f772i = new r(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f773d;

    public /* synthetic */ r(int i4) {
        this.f773d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f773d) {
            case 0:
                o6.j.e((C0722b) obj, "it");
                return 0;
            case 1:
                F f8 = (F) obj;
                o6.j.e(f8, "it");
                return ((F6.E) f8).f1461i;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC0010k interfaceC0010k = (InterfaceC0010k) obj;
                o6.j.e(interfaceC0010k, "it");
                return Boolean.valueOf(interfaceC0010k instanceof InterfaceC0001b);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e((InterfaceC0010k) obj, "it");
                return Boolean.valueOf(!(r2 instanceof InterfaceC0009j));
            default:
                InterfaceC0010k interfaceC0010k2 = (InterfaceC0010k) obj;
                o6.j.e(interfaceC0010k2, "it");
                List typeParameters = ((InterfaceC0001b) interfaceC0010k2).getTypeParameters();
                o6.j.d(typeParameters, "getTypeParameters(...)");
                return AbstractC0436k.k0(typeParameters);
        }
    }
}
