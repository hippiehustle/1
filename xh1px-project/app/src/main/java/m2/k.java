package m2;

import Z5.y;
import android.graphics.Point;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import kotlin.NoWhenBranchMatchedException;
import n2.C1155c;
import n2.EnumC1156d;
import n6.InterfaceC1164c;
import p2.C1304a;

/* loaded from: classes.dex */
public final class k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f12408h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f12409i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f12409i = j;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((k) p((InterfaceC0617c) obj2, (p2.d) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        k kVar = new k(this.f12409i, interfaceC0617c);
        kVar.f12408h = obj;
        return kVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        p2.d dVar = (p2.d) this.f12408h;
        Z5.a.d(obj);
        o6.j.e(dVar, "<this>");
        boolean z8 = dVar instanceof C1304a;
        long j = this.f12409i;
        if (z8) {
            C1304a c1304a = (C1304a) dVar;
            if (c1304a.h()) {
                long j5 = c1304a.f13676a.f12187a;
                if (j == 0) {
                    j = c1304a.f13677b.f12187a;
                }
                long j8 = j;
                String str = c1304a.f13678c;
                int i4 = c1304a.f13679d;
                int i8 = c1304a.f13680e;
                boolean z9 = c1304a.f13681f;
                long j9 = c1304a.f13682g;
                long j10 = c1304a.f13684i;
                Point point = c1304a.f13683h;
                int i9 = point.x;
                int i10 = point.y;
                return new C1155c(j5, j8, i4, str, EnumC1156d.f12882d, Integer.valueOf(i8), Boolean.valueOf(z9), Long.valueOf(j9), Long.valueOf(j10), Integer.valueOf(i9), Integer.valueOf(i10), (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, 129024);
            }
            throw new IllegalStateException("Can't transform to entity, Click is incomplete.");
        }
        if (dVar instanceof p2.c) {
            p2.c cVar = (p2.c) dVar;
            if (cVar.h()) {
                long j11 = cVar.f13690a.f12187a;
                if (j == 0) {
                    j = cVar.f13691b.f12187a;
                }
                long j12 = j;
                String str2 = cVar.f13692c;
                int i11 = cVar.f13693d;
                int i12 = cVar.f13694e;
                boolean z10 = cVar.f13695f;
                long j13 = cVar.f13696g;
                long j14 = cVar.j;
                Point point2 = cVar.f13697h;
                int i13 = point2.x;
                int i14 = point2.y;
                Point point3 = cVar.f13698i;
                int i15 = point3.x;
                int i16 = point3.y;
                return new C1155c(j11, j12, i11, str2, EnumC1156d.f12883e, Integer.valueOf(i12), Boolean.valueOf(z10), Long.valueOf(j13), (Long) null, (Integer) null, (Integer) null, Long.valueOf(j14), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), (Long) null, 67328);
            }
            throw new IllegalStateException("Can't transform to entity, Swipe is incomplete.");
        }
        if (dVar instanceof p2.b) {
            p2.b bVar = (p2.b) dVar;
            if (bVar.h()) {
                long j15 = bVar.f13685a.f12187a;
                if (j == 0) {
                    j = bVar.f13686b.f12187a;
                }
                return new C1155c(j15, j, bVar.f13688d, bVar.f13687c, EnumC1156d.f12884f, (Integer) null, (Boolean) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, Long.valueOf(bVar.f13689e), 65504);
            }
            throw new IllegalStateException("Can't transform to entity, Pause is incomplete.");
        }
        throw new NoWhenBranchMatchedException();
    }
}
