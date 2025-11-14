package c2;

import T1.B;
import T1.C0304c;
import T1.EnumC0305d;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.H;
import T1.N;
import android.content.ComponentName;
import android.graphics.Point;
import d6.InterfaceC0617c;
import e2.AbstractC0640c;
import e2.C0639b;
import f6.AbstractC0720j;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class l extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f9547h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f9548i;
    public final /* synthetic */ z j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j, z zVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f9548i = j;
        this.j = zVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((l) p((InterfaceC0617c) obj2, (f2.a) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        l lVar = new l(this.f9548i, this.j, interfaceC0617c);
        lVar.f9547h = obj;
        return lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x048f, code lost:
    
        if (r4 != 0) goto L95;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        C0304c c0304c;
        C0304c c0304c2;
        C0304c c0304c3;
        T1.u uVar;
        Integer num;
        String str;
        C0304c c0304c4;
        B b4;
        String str2;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Long l6;
        C0999a c0999a;
        long longValue;
        Integer num6;
        Integer num7;
        Long l8;
        Integer num8;
        Integer num9;
        f2.a aVar = (f2.a) this.f9547h;
        Z5.a.d(obj);
        o6.j.e(aVar, "<this>");
        if (aVar.d()) {
            boolean z8 = aVar instanceof f2.e;
            if (z8) {
                f2.e eVar = (f2.e) aVar;
                C0999a c0999a2 = eVar.f10690a;
                Point point = eVar.f10698i;
                long j = c0999a2.f12187a;
                long j5 = eVar.f10691b.f12187a;
                int i4 = eVar.f10693d;
                String str3 = eVar.f10692c;
                o6.j.b(str3);
                Long l9 = eVar.f10694e;
                EnumC0307f valueOf = EnumC0307f.valueOf(eVar.f10695f.name());
                Point point2 = eVar.f10696g;
                if (point2 != null) {
                    num6 = Integer.valueOf(point2.x);
                } else {
                    num6 = null;
                }
                if (point2 != null) {
                    num7 = Integer.valueOf(point2.y);
                } else {
                    num7 = null;
                }
                C0999a c0999a3 = eVar.f10697h;
                if (c0999a3 != null) {
                    l8 = Long.valueOf(c0999a3.f12187a);
                } else {
                    l8 = null;
                }
                if (point != null) {
                    num8 = Integer.valueOf(point.x);
                } else {
                    num8 = null;
                }
                if (point != null) {
                    num9 = Integer.valueOf(point.y);
                } else {
                    num9 = null;
                }
                c0304c4 = new C0304c(j, j5, i4, str3, EnumC0305d.f5582d, valueOf, num6, num7, l8, l9, num8, num9, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -4096, 31);
            } else {
                if (aVar instanceof f2.k) {
                    f2.k kVar = (f2.k) aVar;
                    C0999a c0999a4 = kVar.f10730a;
                    Point point3 = kVar.f10736g;
                    long j8 = c0999a4.f12187a;
                    long j9 = kVar.f10731b.f12187a;
                    int i8 = kVar.f10733d;
                    String str4 = kVar.f10732c;
                    o6.j.b(str4);
                    Long l10 = kVar.f10734e;
                    Point point4 = kVar.f10735f;
                    if (point4 != null) {
                        num2 = Integer.valueOf(point4.x);
                    } else {
                        num2 = null;
                    }
                    if (point4 != null) {
                        num3 = Integer.valueOf(point4.y);
                    } else {
                        num3 = null;
                    }
                    if (point3 != null) {
                        num4 = Integer.valueOf(point3.x);
                    } else {
                        num4 = null;
                    }
                    if (point3 != null) {
                        num5 = Integer.valueOf(point3.y);
                    } else {
                        num5 = null;
                    }
                    c0304c3 = new C0304c(j8, j9, i8, str4, EnumC0305d.f5583e, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, num2, num3, num4, num5, l10, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -127008, 31);
                } else {
                    if (aVar instanceof f2.i) {
                        f2.i iVar = (f2.i) aVar;
                        long j10 = iVar.f10719a.f12187a;
                        long j11 = iVar.f10720b.f12187a;
                        int i9 = iVar.f10722d;
                        String str5 = iVar.f10721c;
                        o6.j.b(str5);
                        c0304c = new C0304c(j10, j11, i9, str5, EnumC0305d.f5584f, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, iVar.f10723e, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -131104, 31);
                    } else if (aVar instanceof f2.f) {
                        f2.f fVar = (f2.f) aVar;
                        long j12 = fVar.f10699a.f12187a;
                        long j13 = fVar.f10700b.f12187a;
                        int i10 = fVar.f10702d;
                        String str6 = fVar.f10701c;
                        o6.j.b(str6);
                        Boolean bool = fVar.f10703e;
                        Boolean valueOf2 = Boolean.valueOf(fVar.f10704f);
                        String str7 = fVar.f10705g;
                        ComponentName componentName = fVar.f10706h;
                        if (componentName != null) {
                            str2 = componentName.flattenToString();
                        } else {
                            str2 = null;
                        }
                        c0304c = new C0304c(j12, j13, i10, str6, EnumC0305d.f5585g, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, bool, valueOf2, str7, str2, fVar.f10707i, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -8126496, 31);
                    } else {
                        if (aVar instanceof f2.o) {
                            f2.o oVar = (f2.o) aVar;
                            long j14 = oVar.f10750a.f12187a;
                            long j15 = oVar.f10751b.f12187a;
                            int i11 = oVar.f10753d;
                            String str8 = oVar.f10752c;
                            o6.j.b(str8);
                            f2.n nVar = oVar.f10755f;
                            if (nVar != null) {
                                b4 = B.valueOf(nVar.name());
                            } else {
                                b4 = null;
                            }
                            c0304c2 = new C0304c(j14, j15, i11, str8, EnumC0305d.f5586h, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, Boolean.valueOf(oVar.f10754e), b4, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -25165856, 31);
                        } else if (aVar instanceof f2.c) {
                            f2.c cVar = (f2.c) aVar;
                            AbstractC0640c abstractC0640c = cVar.f10686g;
                            boolean z9 = abstractC0640c instanceof C0639b;
                            long j16 = cVar.f10680a.f12187a;
                            long j17 = cVar.f10681b.f12187a;
                            int i12 = cVar.f10683d;
                            String str9 = cVar.f10682c;
                            o6.j.b(str9);
                            String str10 = cVar.f10684e;
                            EnumC0306e valueOf3 = EnumC0306e.valueOf(cVar.f10685f.name());
                            if (z9) {
                                uVar = T1.u.f5647d;
                            } else {
                                uVar = T1.u.f5648e;
                            }
                            T1.u uVar2 = uVar;
                            if (z9) {
                                num = Integer.valueOf(((C0639b) abstractC0640c).f10598a);
                            } else {
                                num = null;
                            }
                            if (z9) {
                                str = null;
                            } else {
                                Object a3 = abstractC0640c.a();
                                o6.j.c(a3, "null cannot be cast to non-null type kotlin.String");
                                str = (String) a3;
                            }
                            c0304c3 = new C0304c(j16, j17, i12, str9, EnumC0305d.f5587i, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, str10, valueOf3, uVar2, num, str, (H) null, (String) null, (String) null, (Integer) null, (N) null, (String) null, (Boolean) null, -1040187424, 31);
                        } else if (aVar instanceof f2.h) {
                            f2.h hVar = (f2.h) aVar;
                            long j18 = hVar.f10711a.f12187a;
                            long j19 = hVar.f10712b.f12187a;
                            int i13 = hVar.f10714d;
                            String str11 = hVar.f10713c;
                            o6.j.b(str11);
                            c0304c2 = new C0304c(j18, j19, i13, str11, EnumC0305d.j, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, H.valueOf(hVar.f10715e.name()), hVar.f10716f, hVar.f10717g, Integer.valueOf(hVar.f10718h), (N) null, (String) null, (Boolean) null, 1073741792, 28);
                        } else if (aVar instanceof f2.m) {
                            f2.m mVar = (f2.m) aVar;
                            long j20 = mVar.f10741a.f12187a;
                            long j21 = mVar.f10742b.f12187a;
                            int i14 = mVar.f10744d;
                            String str12 = mVar.f10743c;
                            o6.j.b(str12);
                            c0304c = new C0304c(j20, j21, i14, str12, EnumC0305d.k, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, N.valueOf(mVar.f10745e.name()), (String) null, (Boolean) null, -32, 27);
                        } else if (aVar instanceof f2.j) {
                            f2.j jVar = (f2.j) aVar;
                            long j22 = jVar.f10724a.f12187a;
                            long j23 = jVar.f10725b.f12187a;
                            int i15 = jVar.f10727d;
                            String str13 = jVar.f10726c;
                            o6.j.b(str13);
                            c0304c = new C0304c(j22, j23, i15, str13, EnumC0305d.f5588l, (EnumC0307f) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null, (Boolean) null, (B) null, (String) null, (EnumC0306e) null, (T1.u) null, (Integer) null, (String) null, (H) null, (String) null, (String) null, (Integer) null, (N) null, jVar.f10728e, Boolean.valueOf(jVar.f10729f), -32, 7);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0304c4 = c0304c2;
                    }
                    c0304c4 = c0304c;
                }
                c0304c4 = c0304c3;
            }
            c0304c4.f5559b = this.f9548i;
            R.g gVar = this.j.f9607h;
            gVar.getClass();
            if (z8 && (c0999a = ((f2.e) aVar).f10697h) != null) {
                Long l11 = c0999a.f12188b;
                if (l11 == null) {
                    longValue = c0999a.f12187a;
                }
                Long l12 = (Long) ((LinkedHashMap) gVar.f4988f).get(l11);
                if (l12 != null) {
                    longValue = l12.longValue();
                    l6 = Long.valueOf(longValue);
                } else {
                    throw new IllegalStateException("Identifier is not found in condition map for " + c0999a);
                }
            } else {
                l6 = null;
            }
            c0304c4.f5566i = l6;
            return c0304c4;
        }
        throw new IllegalStateException("Can't transform to entity, action is incomplete: " + aVar);
    }
}
