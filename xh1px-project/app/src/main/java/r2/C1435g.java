package r2;

import A1.n;
import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import android.content.Intent;
import android.graphics.Point;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: r2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1435g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public a2.h f14281h;

    /* renamed from: i, reason: collision with root package name */
    public Point f14282i;
    public a2.h j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f14283l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f14284m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f14285n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Intent f14286o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Point f14287p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ B0.e f14288q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1435g(j jVar, int i4, Intent intent, Point point, B0.e eVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14284m = jVar;
        this.f14285n = i4;
        this.f14286o = intent;
        this.f14287p = point;
        this.f14288q = eVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1435g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1435g(this.f14284m, this.f14285n, this.f14286o, this.f14287p, this.f14288q, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5.d(r8, r11) == r7) goto L22;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Point point;
        a2.h hVar;
        int i4;
        a2.h hVar2;
        int i8 = this.f14283l;
        y yVar = y.f7506a;
        j jVar = this.f14284m;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                i0 i0Var = jVar.f14305o;
                this.f14281h = null;
                this.f14282i = null;
                this.f14283l = 3;
                i0Var.n(k.f14310f, this);
                if (yVar == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            }
            i4 = this.k;
            hVar = this.j;
            point = this.f14282i;
            hVar2 = this.f14281h;
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            a2.h hVar3 = jVar.f14297e;
            n nVar = new n(jVar, 24, this.f14288q);
            this.f14281h = hVar3;
            point = this.f14287p;
            this.f14282i = point;
            this.j = hVar3;
            this.k = 0;
            this.f14283l = 1;
            if (hVar3.c(this.f14285n, this.f14286o, nVar, this) != enumC0646a) {
                hVar = hVar3;
                i4 = 0;
                hVar2 = hVar;
            }
            return enumC0646a;
        }
        this.f14281h = hVar2;
        this.f14282i = null;
        this.j = null;
        this.k = i4;
        this.f14283l = 2;
    }
}
