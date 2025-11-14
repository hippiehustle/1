package b3;

import L7.InterfaceC0163v;
import N7.s;
import Z5.y;
import android.graphics.Point;
import android.net.Uri;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f9170h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f9171i;
    public final /* synthetic */ Uri j;
    public final /* synthetic */ Point k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f9172l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Uri uri, Point point, s sVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9171i = nVar;
        this.j = uri;
        this.k = point;
        this.f9172l = sVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((l) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new l(this.f9171i, this.j, this.k, this.f9172l, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f9170h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            n nVar = this.f9171i;
            R.g gVar = nVar.f9179e;
            s sVar = this.f9172l;
            A4.a aVar = new A4.a(new f(sVar, null, 1), new k(sVar, nVar, null), new h(sVar, null, 1), new h(sVar, null, 2));
            this.f9170h = 1;
            Object H2 = gVar.H(this.j, this.k, aVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (H2 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
