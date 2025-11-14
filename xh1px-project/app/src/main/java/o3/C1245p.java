package o3;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import android.util.Log;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import n6.InterfaceC1164c;
import p2.C1304a;
import q2.C1365k;

/* renamed from: o3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1245p extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f13474h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1250u f13475i;
    public final /* synthetic */ List j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1233d f13476l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245p(C1250u c1250u, List list, int i4, C1233d c1233d, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13475i = c1250u;
        this.j = list;
        this.k = i4;
        this.f13476l = c1233d;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1245p) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1245p(this.f13475i, this.j, this.k, this.f13476l, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Object i4;
        int i8 = this.f13474h;
        if (i8 != 0) {
            if (i8 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f13474h = 1;
            Object g8 = AbstractC0166y.g(500L, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (g8 == enumC0646a) {
                return enumC0646a;
            }
        }
        C1250u c1250u = this.f13475i;
        C1365k c1365k = c1250u.f13491d;
        p2.d dVar = (p2.d) this.j.get(this.k);
        A1.n nVar = new A1.n(c1250u, 21, this.f13476l);
        c1365k.getClass();
        o6.j.e(dVar, "dumbAction");
        Log.i("DumbEngine", "Trying dumb action: " + dVar);
        c1365k.f13968g = nVar;
        C0999a c0999a = new C0999a(1L, (Long) null);
        if (dVar instanceof C1304a) {
            i4 = C1304a.i((C1304a) dVar, null, c0999a, null, 0, 0, false, 0L, null, 0L, 477);
        } else if (dVar instanceof p2.c) {
            i4 = p2.c.i((p2.c) dVar, null, c0999a, null, 0, 0, false, 0L, null, null, 0L, 989);
        } else if (dVar instanceof p2.b) {
            i4 = p2.b.i((p2.b) dVar, null, c0999a, null, 0, 0L, 29);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        c1365k.b(new p2.e(c0999a, "Try", E2.d.y(i4), 1, false, 1, false, false, null));
        return y.f7506a;
    }
}
