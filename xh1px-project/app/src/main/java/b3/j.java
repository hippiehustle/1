package b3;

import L7.AbstractC0166y;
import N7.s;
import Z5.y;
import android.graphics.Point;
import android.net.Uri;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.List;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9152h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f9153i;
    public final /* synthetic */ List j;
    public final /* synthetic */ List k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f9154l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Point f9155m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, List list, List list2, Uri uri, Point point, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9153i = nVar;
        this.j = list;
        this.k = list2;
        this.f9154l = uri;
        this.f9155m = point;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        j jVar = (j) p((InterfaceC0617c) obj2, (s) obj);
        y yVar = y.f7506a;
        jVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        j jVar = new j(this.f9153i, this.j, this.k, this.f9154l, this.f9155m, interfaceC0617c);
        jVar.f9152h = obj;
        return jVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        s sVar = (s) this.f9152h;
        Z5.a.d(obj);
        AbstractC0166y.q(sVar, null, null, new i(this.f9153i, this.j, this.k, this.f9154l, this.f9155m, sVar, null), 3);
        return y.f7506a;
    }
}
