package w6;

import n6.InterfaceC1162a;
import p7.InterfaceC1333o;

/* loaded from: classes.dex */
public final class Q implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15809d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final T f15810e;

    /* renamed from: f, reason: collision with root package name */
    public final S f15811f;

    public Q(S s8, T t8) {
        this.f15811f = s8;
        this.f15810e = t8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r0.f7517a == Z6.a.MULTIFILE_CLASS_PART) goto L12;
     */
    @Override // n6.InterfaceC1162a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        String str;
        switch (this.f15809d) {
            case 0:
                s0 s0Var = this.f15811f.f15813c;
                u6.s sVar = S.f15812g[0];
                H6.b bVar = (H6.b) s0Var.a();
                if (bVar != null) {
                    Z6.b bVar2 = bVar.f2038b;
                    str = bVar2.f7522f;
                    break;
                }
                str = null;
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return this.f15810e.f15818e.getClassLoader().loadClass(I7.v.Y(str, '/', '.'));
            default:
                s0 s0Var2 = this.f15811f.f15814d;
                u6.s sVar2 = S.f15812g[1];
                Object a3 = s0Var2.a();
                o6.j.d(a3, "getValue(...)");
                return this.f15810e.k((InterfaceC1333o) a3, EnumC1712D.f15788d);
        }
    }

    public Q(T t8, S s8) {
        this.f15810e = t8;
        this.f15811f = s8;
    }
}
