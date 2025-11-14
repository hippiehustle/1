package P1;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import i.AbstractActivityC0870i;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class t extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w f4483h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0870i f4484i;
    public final /* synthetic */ U4.a j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, U4.a aVar, InterfaceC0617c interfaceC0617c, AbstractActivityC0870i abstractActivityC0870i) {
        super(2, interfaceC0617c);
        this.f4483h = wVar;
        this.f4484i = abstractActivityC0870i;
        this.j = aVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        t tVar = (t) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        tVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        AbstractActivityC0870i abstractActivityC0870i = this.f4484i;
        return new t(this.f4483h, this.j, interfaceC0617c, abstractActivityC0870i);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        this.f4483h.getClass();
        w.a(this.f4484i, this.j);
        return y.f7506a;
    }
}
