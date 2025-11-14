package B6;

import C6.InterfaceC0002c;
import C6.InterfaceC0004e;
import java.io.Serializable;
import n6.InterfaceC1163b;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class q extends F7.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f502c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f503d;

    public /* synthetic */ q(Object obj, Serializable serializable, int i4) {
        this.f501b = i4;
        this.f502c = obj;
        this.f503d = serializable;
    }

    @Override // F7.l
    public void b(Object obj) {
        switch (this.f501b) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC0002c interfaceC0002c = (InterfaceC0002c) obj;
                o6.j.e(interfaceC0002c, "current");
                o6.u uVar = (o6.u) this.f503d;
                if (uVar.f13642d == null && ((Boolean) ((InterfaceC1163b) this.f502c).m(interfaceC0002c)).booleanValue()) {
                    uVar.f13642d = interfaceC0002c;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // F7.l
    public final boolean c(Object obj) {
        switch (this.f501b) {
            case 0:
                InterfaceC0004e interfaceC0004e = (InterfaceC0004e) obj;
                o6.u uVar = (o6.u) this.f503d;
                o6.j.e(interfaceC0004e, "javaClassDescriptor");
                String M8 = AbstractC1638C.M(interfaceC0004e, (String) this.f502c);
                if (u.f519b.contains(M8)) {
                    uVar.f13642d = o.f495d;
                } else if (u.f521d.contains(M8)) {
                    uVar.f13642d = o.f496e;
                } else if (u.f520c.contains(M8)) {
                    uVar.f13642d = o.f497f;
                } else if (u.f518a.contains(M8)) {
                    uVar.f13642d = o.f499h;
                }
                if (uVar.f13642d == null) {
                    return true;
                }
                return false;
            case 1:
                boolean[] zArr = (boolean[]) this.f503d;
                if (((Boolean) ((InterfaceC1163b) this.f502c).m(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            default:
                o6.j.e((InterfaceC0002c) obj, "current");
                if (((o6.u) this.f503d).f13642d == null) {
                    return true;
                }
                return false;
        }
    }

    @Override // F7.l
    public final Object j() {
        switch (this.f501b) {
            case 0:
                o oVar = (o) ((o6.u) this.f503d).f13642d;
                if (oVar == null) {
                    return o.f498g;
                }
                return oVar;
            case 1:
                return Boolean.valueOf(((boolean[]) this.f503d)[0]);
            default:
                return (InterfaceC0002c) ((o6.u) this.f503d).f13642d;
        }
    }

    public q(o6.u uVar, InterfaceC1163b interfaceC1163b) {
        this.f501b = 2;
        this.f503d = uVar;
        this.f502c = interfaceC1163b;
    }
}
