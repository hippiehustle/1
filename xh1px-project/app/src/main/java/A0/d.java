package A0;

import L7.InterfaceC0163v;
import Z5.y;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import u0.u;

/* loaded from: classes.dex */
public final class d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u f196i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f197l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC0617c interfaceC0617c, InterfaceC1163b interfaceC1163b, u uVar, boolean z8, boolean z9) {
        super(2, interfaceC0617c);
        this.f196i = uVar;
        this.j = z8;
        this.k = z9;
        this.f197l = interfaceC1163b;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new d(interfaceC0617c, this.f197l, this.f196i, this.j, this.k);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f195h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        InterfaceC1163b interfaceC1163b = this.f197l;
        u uVar = this.f196i;
        boolean z8 = this.k;
        boolean z9 = this.j;
        g gVar = new g(null, interfaceC1163b, uVar, z8, z9);
        this.f195h = 1;
        Object n3 = uVar.n(z9, gVar, this);
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (n3 == enumC0646a) {
            return enumC0646a;
        }
        return n3;
    }
}
