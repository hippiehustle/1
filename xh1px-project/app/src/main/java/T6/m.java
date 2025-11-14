package T6;

import C6.InterfaceC0004e;
import C6.InterfaceC0007h;
import F6.N;
import java.lang.reflect.Modifier;
import n6.InterfaceC1163b;
import p7.InterfaceC1333o;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class m implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final m f5860e = new m(0);

    /* renamed from: f, reason: collision with root package name */
    public static final m f5861f = new m(1);

    /* renamed from: g, reason: collision with root package name */
    public static final m f5862g = new m(2);

    /* renamed from: h, reason: collision with root package name */
    public static final m f5863h = new m(3);

    /* renamed from: i, reason: collision with root package name */
    public static final m f5864i = new m(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5865d;

    public /* synthetic */ m(int i4) {
        this.f5865d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f5865d) {
            case 0:
                int i4 = o.f5868v;
                o6.j.e((I6.w) obj, "it");
                return Boolean.valueOf(!Modifier.isStatic(r3.b().getModifiers()));
            case 1:
                N n3 = (N) obj;
                u6.s[] sVarArr = A.f5792m;
                o6.j.e(n3, "$this$selectMostSpecificInEachOverridableGroup");
                return n3;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                I6.w wVar = (I6.w) obj;
                int i8 = D.f5806p;
                o6.j.e(wVar, "it");
                return Boolean.valueOf(Modifier.isStatic(wVar.b().getModifiers()));
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                InterfaceC1333o interfaceC1333o = (InterfaceC1333o) obj;
                int i9 = D.f5806p;
                o6.j.e(interfaceC1333o, "it");
                return interfaceC1333o.c();
            default:
                int i10 = D.f5806p;
                InterfaceC0007h c6 = ((AbstractC1759v) obj).B0().c();
                if (c6 instanceof InterfaceC0004e) {
                    return (InterfaceC0004e) c6;
                }
                return null;
        }
    }
}
