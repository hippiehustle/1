package c3;

import L7.InterfaceC0163v;
import O7.C0229b;
import Z5.y;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import b3.m;
import b3.n;
import d6.C0623i;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.List;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f9640h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f9641i;
    public final /* synthetic */ j j;
    public final /* synthetic */ Uri k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f9642l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f9643m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f9644n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z8, j jVar, Uri uri, List list, List list2, Context context, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9641i = z8;
        this.j = jVar;
        this.k = uri;
        this.f9642l = list;
        this.f9643m = list2;
        this.f9644n = context;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new i(this.f9641i, this.j, this.k, this.f9642l, this.f9643m, this.f9644n, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r2.x(r3, r16) == r15) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r2.x(r3, r16) == r15) goto L17;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        j jVar = this.j;
        Y1.d dVar = jVar.f9646c;
        n nVar = jVar.f9645b;
        int i4 = this.f9640h;
        if (i4 != 0) {
            if (i4 != 1 && i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
        } else {
            Z5.a.d(obj);
            boolean z8 = this.f9641i;
            N7.a aVar = N7.a.f3795d;
            C0623i c0623i = C0623i.f10448d;
            Context context = this.f9644n;
            Uri uri = this.k;
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (z8) {
                Point point = dVar.f7104e.f7094a;
                nVar.getClass();
                C0229b c0229b = new C0229b(new m(nVar, uri, point, null), c0623i, -2, aVar);
                h hVar = new h(jVar, context, 0);
                this.f9640h = 1;
            } else {
                Point point2 = dVar.f7104e.f7094a;
                nVar.getClass();
                C0229b c0229b2 = new C0229b(new b3.j(nVar, this.f9642l, this.f9643m, uri, point2, null), c0623i, -2, aVar);
                h hVar2 = new h(jVar, context, 1);
                this.f9640h = 2;
            }
        }
        return y.f7506a;
    }
}
