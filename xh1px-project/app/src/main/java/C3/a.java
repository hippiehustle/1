package C3;

import O7.g0;
import O7.i0;
import a6.s;
import f2.f;
import f2.o;
import java.util.List;
import k2.C0952b;
import k2.C0953c;
import m1.InterfaceC1053c;
import n6.InterfaceC1163b;
import o6.j;

/* loaded from: classes.dex */
public final class a extends D3.d {
    public final D3.d k;

    /* renamed from: l, reason: collision with root package name */
    public final D3.d f587l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(A1.e eVar, i0 i0Var) {
        super(eVar, i0Var, 2);
        j.e(i0Var, "parentItem");
        int i4 = 0;
        int i8 = 0;
        this.k = new D3.d((InterfaceC1163b) new A1.e(1, this, a.class, "onEditedActionIntentExtraUpdated", "onEditedActionIntentExtraUpdated(Ljava/util/List;)V", i8, i4, 2), true, (g0) this.f894h);
        this.f587l = new D3.d((InterfaceC1163b) new A1.e(1, this, a.class, "onEditedActionEventToggleUpdated", "onEditedActionEventToggleUpdated(Ljava/util/List;)V", i8, i4, 1), true, (g0) this.f894h);
    }

    @Override // D3.d
    public final boolean c(InterfaceC1053c interfaceC1053c, Object obj) {
        f2.a aVar = (f2.a) interfaceC1053c;
        if (aVar instanceof f2.e) {
            if (obj instanceof C0953c) {
                f2.e eVar = (f2.e) aVar;
                if (!eVar.d() || eVar.f10695f == f2.d.f10688e) {
                    return false;
                }
            } else if (obj instanceof C0952b) {
                f2.e eVar2 = (f2.e) aVar;
                if (eVar2.d()) {
                    if (((C0952b) obj).f11962d == 1 && !eVar2.j()) {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return ((f2.e) aVar).d();
            }
            return true;
        }
        if (aVar != null) {
            return aVar.d();
        }
        return false;
    }

    @Override // D3.d
    public final /* bridge */ /* synthetic */ void e(InterfaceC1053c interfaceC1053c) {
        throw null;
    }

    @Override // D3.d
    public final void g() {
        this.k.f();
        super.g();
    }

    public final void k(f2.a aVar) {
        j.e(aVar, "item");
        super.e(aVar);
        if (aVar instanceof f) {
            List list = ((f) aVar).j;
            if (list == null) {
                list = s.f7766d;
            }
            this.k.d(list);
            return;
        }
        if (aVar instanceof o) {
            this.f587l.d(((o) aVar).f10756g);
        }
    }
}
