package b3;

import L7.AbstractC0166y;
import N7.s;
import Z5.y;
import android.graphics.Point;
import android.net.Uri;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9173h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f9174i;
    public final /* synthetic */ Uri j;
    public final /* synthetic */ Point k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Uri uri, Point point, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9174i = nVar;
        this.j = uri;
        this.k = point;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        m mVar = (m) p((InterfaceC0617c) obj2, (s) obj);
        y yVar = y.f7506a;
        mVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        m mVar = new m(this.f9174i, this.j, this.k, interfaceC0617c);
        mVar.f9173h = obj;
        return mVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        s sVar = (s) this.f9173h;
        Z5.a.d(obj);
        AbstractC0166y.q(sVar, null, null, new l(this.f9174i, this.j, this.k, sVar, null), 3);
        return y.f7506a;
    }
}
