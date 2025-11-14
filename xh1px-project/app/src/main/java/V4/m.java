package V4;

import L7.InterfaceC0163v;
import O7.i0;
import Z5.y;
import android.graphics.Point;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import l2.C1001a;
import n6.InterfaceC1164c;
import o2.C1229a;

/* loaded from: classes.dex */
public final class m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6401h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f6402i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(q qVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6402i = qVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((m) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new m(this.f6402i, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r2 == r9) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c1, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bf, code lost:
    
        if (r2 == r9) goto L28;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        q qVar = this.f6402i;
        i0 i0Var = qVar.f6415e;
        int i4 = this.f6401h;
        y yVar = y.f7506a;
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            int ordinal = ((t) qVar.f6418h.f()).ordinal();
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    this.f6401h = 2;
                    b2.r rVar = qVar.f6412b;
                    C0999a c0999a = new C0999a(0L, new Long(0L));
                    Object f8 = i0Var.f();
                    o6.j.b(f8);
                    String str = (String) f8;
                    Point point = qVar.f6414d.f7104e.f7094a;
                    Object b4 = rVar.b(new C1001a(c0999a, str, Math.max(400, (int) Math.floor(Math.max(point.x, point.y) / 2.05d)), false, false, 112), this);
                    if (b4 != enumC0646a) {
                        b4 = yVar;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                this.f6401h = 1;
                C1229a c1229a = qVar.f6413c;
                C0999a c0999a2 = new C0999a(0L, new Long(0L));
                Object f9 = i0Var.f();
                o6.j.b(f9);
                Object a3 = c1229a.f13440a.a(new p2.e(c0999a2, (String) f9, a6.s.f7766d, 1, false, 1, true, false, null), this);
                if (a3 != enumC0646a) {
                    a3 = yVar;
                }
                if (a3 != enumC0646a) {
                    a3 = yVar;
                }
            }
        }
        i0 i0Var2 = qVar.j;
        i0Var2.getClass();
        i0Var2.h(null, a.f6373g);
        return yVar;
    }
}
