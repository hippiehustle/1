package K3;

import D4.C0040p;
import L7.AbstractC0160s;
import O7.C0232e;
import O7.P;
import O7.V;
import O7.i0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.lifecycle.U;
import androidx.lifecycle.Z;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e2.C0639b;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import f6.AbstractC0720j;
import j2.C0902b;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import l0.C0997a;
import l1.C0999a;
import l1.C1000b;
import u6.AbstractC1638C;

/* loaded from: classes.dex */
public final class D extends Z {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0160s f2640b;

    /* renamed from: c, reason: collision with root package name */
    public final q1.e f2641c;

    /* renamed from: d, reason: collision with root package name */
    public final H3.n f2642d;

    /* renamed from: e, reason: collision with root package name */
    public final v2.h f2643e;

    /* renamed from: f, reason: collision with root package name */
    public final J2.b f2644f;

    /* renamed from: g, reason: collision with root package name */
    public final i0 f2645g;

    /* renamed from: h, reason: collision with root package name */
    public final P f2646h;

    /* renamed from: i, reason: collision with root package name */
    public final A4.c f2647i;
    public final A4.c j;
    public final W0.c k;

    /* renamed from: l, reason: collision with root package name */
    public final P f2648l;

    /* renamed from: m, reason: collision with root package name */
    public final R3.r f2649m;

    public D(Context context, AbstractC0160s abstractC0160s, b2.r rVar, q1.e eVar, H3.n nVar, v2.h hVar, J2.b bVar, x2.f fVar) {
        o6.j.e(rVar, "repository");
        o6.j.e(eVar, "bitmapRepository");
        o6.j.e(nVar, "editionRepository");
        o6.j.e(hVar, "detectionRepository");
        o6.j.e(bVar, "monitoredViewsManager");
        o6.j.e(fVar, "settingsRepository");
        this.f2640b = abstractC0160s;
        this.f2641c = eVar;
        this.f2642d = nVar;
        this.f2643e = hVar;
        this.f2644f = bVar;
        P p8 = fVar.f16106d;
        H3.y yVar = nVar.f1950e;
        P7.n nVar2 = yVar.f1989l;
        C0040p c0040p = new C0040p(yVar.f1986g, 5);
        i0 c6 = V.c(new C0092f(0, false));
        this.f2645g = c6;
        z zVar = new z(c6, 0);
        C0997a g8 = U.g(this);
        Boolean bool = Boolean.FALSE;
        C0232e c0232e = O7.Z.f4117a;
        this.f2646h = V.t(zVar, g8, c0232e, bool);
        InterfaceC0617c interfaceC0617c = null;
        int i4 = 27;
        this.f2647i = new A4.c(c0040p, nVar2, new t(context, interfaceC0617c, 0), i4);
        this.j = new A4.c(new H3.v(new A4.c(c6, nVar2, new C3.c(3, interfaceC0617c, 3), i4), 1), this, context, 25);
        W0.c cVar = yVar.f2000w;
        this.k = cVar;
        this.f2648l = V.t(new A4.c(cVar, p8, new AbstractC0720j(3, null), 27), U.g(this), c0232e, a6.s.f7766d);
        this.f2649m = rVar.f9113c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(D d2, f2.a aVar, Context context, AbstractC0713c abstractC0713c) {
        C c6;
        int i4;
        PointF pointF;
        PointF pointF2;
        List e9;
        Object obj;
        EnumC0646a enumC0646a;
        long j;
        if (abstractC0713c instanceof C) {
            c6 = (C) abstractC0713c;
            int i8 = c6.k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c6.k = i8 - Integer.MIN_VALUE;
                Object obj2 = c6.f2639i;
                i4 = c6.k;
                if (i4 == 0) {
                    if (i4 == 1) {
                        j = c6.f2638h;
                        pointF2 = c6.f2637g;
                        Z5.a.d(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj2);
                    long j5 = 1;
                    PointF pointF3 = null;
                    if (aVar instanceof f2.e) {
                        f2.e eVar = (f2.e) aVar;
                        Point point = eVar.f10696g;
                        if (point != null) {
                            pointF2 = new PointF(point);
                        } else {
                            pointF2 = null;
                        }
                        Long l6 = eVar.f10694e;
                        if (l6 != null) {
                            j5 = l6.longValue();
                        }
                        c6.f2637g = pointF2;
                        c6.f2638h = j5;
                        c6.k = 1;
                        if (eVar.f10695f == f2.d.f10688e && (e9 = d2.f2642d.f1950e.e()) != null) {
                            Iterator it = e9.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (o6.j.a(((C0902b) obj).f11789a, eVar.f10697h)) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            C0902b c0902b = (C0902b) obj;
                            if (c0902b != null) {
                                obj2 = AbstractC1638C.w(d2.f2641c, c0902b);
                                enumC0646a = EnumC0646a.f10656d;
                                if (obj2 != enumC0646a) {
                                    return enumC0646a;
                                }
                                j = j5;
                            }
                        }
                        obj2 = null;
                        enumC0646a = EnumC0646a.f10656d;
                        if (obj2 != enumC0646a) {
                        }
                    } else {
                        if (aVar instanceof f2.k) {
                            f2.k kVar = (f2.k) aVar;
                            Point point2 = kVar.f10735f;
                            if (point2 != null) {
                                pointF = new PointF(point2);
                            } else {
                                pointF = null;
                            }
                            Point point3 = kVar.f10736g;
                            if (point3 != null) {
                                pointF3 = new PointF(point3);
                            }
                            Long l8 = kVar.f10734e;
                            if (l8 != null) {
                                j5 = l8.longValue();
                            }
                            return new Q2.p(j5, pointF, pointF3);
                        }
                        if (aVar instanceof f2.i) {
                            Long l9 = ((f2.i) aVar).f10723e;
                            if (l9 != null) {
                                j5 = l9.longValue();
                            }
                            return new Q2.m(j5);
                        }
                        return new Q2.f(context.getDrawable(D2.f.s(aVar)));
                    }
                }
                return new Q2.c(j, pointF2, (Bitmap) obj2);
            }
        }
        c6 = new C(d2, abstractC0713c);
        Object obj22 = c6.f2639i;
        i4 = c6.k;
        if (i4 == 0) {
        }
        return new Q2.c(j, pointF2, (Bitmap) obj22);
    }

    public final f2.a f(Context context, V3.k kVar) {
        o6.j.e(kVar, "choice");
        boolean equals = kVar.equals(V3.b.f6357d);
        H3.n nVar = this.f2642d;
        if (equals) {
            return nVar.f1949d.b(context);
        }
        if (kVar.equals(V3.h.f6363d)) {
            return nVar.f1949d.e(context);
        }
        if (kVar.equals(V3.f.f6361d)) {
            H3.b bVar = nVar.f1949d;
            bVar.getClass();
            C0999a a3 = ((C1000b) bVar.k).a();
            C0999a h8 = bVar.h();
            ((W0.d) bVar.f1905h).getClass();
            String string = context.getString(R.string.default_pause_name);
            o6.j.d(string, "getString(...)");
            return new f2.i(a3, h8, string, 0, Long.valueOf(h2.a.j(context).getLong("Last_Pause_Duration", context.getResources().getInteger(R.integer.default_pause_duration))));
        }
        if (kVar.equals(V3.d.f6359d)) {
            H3.b bVar2 = nVar.f1949d;
            bVar2.getClass();
            C0999a a4 = ((C1000b) bVar2.k).a();
            C0999a h9 = bVar2.h();
            ((W0.d) bVar2.f1905h).getClass();
            String string2 = context.getString(R.string.default_intent_name);
            o6.j.d(string2, "getString(...)");
            return new f2.f(a4, h9, string2, 0, Boolean.valueOf(h2.a.j(context).getBoolean("Last_Intent_IsAdvanced", context.getResources().getBoolean(R.bool.default_intent_isAdvanced))), false, null, null, null, null);
        }
        if (kVar.equals(V3.j.f6365d)) {
            H3.b bVar3 = nVar.f1949d;
            bVar3.getClass();
            C0999a a9 = ((C1000b) bVar3.k).a();
            C0999a h10 = bVar3.h();
            ((W0.d) bVar3.f1905h).getClass();
            String string3 = context.getString(R.string.default_toggle_event_name);
            o6.j.d(string3, "getString(...)");
            return new f2.o(a9, h10, string3, 0, false, null, a6.s.f7766d);
        }
        if (kVar.equals(V3.a.f6356d)) {
            H3.b bVar4 = nVar.f1949d;
            bVar4.getClass();
            C0999a a10 = ((C1000b) bVar4.k).a();
            C0999a h11 = bVar4.h();
            ((W0.d) bVar4.f1905h).getClass();
            String string4 = context.getString(R.string.default_change_counter_name);
            o6.j.d(string4, "getString(...)");
            return new f2.c(a10, h11, string4, 0, "", f2.b.f10676d, new C0639b(0));
        }
        if (kVar.equals(V3.e.f6360d)) {
            H3.b bVar5 = nVar.f1949d;
            bVar5.getClass();
            C0999a a11 = ((C1000b) bVar5.k).a();
            C0999a h12 = bVar5.h();
            ((W0.d) bVar5.f1905h).getClass();
            String string5 = context.getString(R.string.default_notification_name);
            o6.j.d(string5, "getString(...)");
            return new f2.h(a11, h12, string5, 0, f2.g.f10708d, "", "", 3);
        }
        if (kVar.equals(V3.i.f6364d)) {
            H3.b bVar6 = nVar.f1949d;
            bVar6.getClass();
            C0999a a12 = ((C1000b) bVar6.k).a();
            C0999a h13 = bVar6.h();
            ((W0.d) bVar6.f1905h).getClass();
            String string6 = context.getString(R.string.default_system_action_name);
            o6.j.d(string6, "getString(...)");
            return new f2.m(a12, h13, string6, 0, f2.l.f10737d);
        }
        if (kVar.equals(V3.g.f6362d)) {
            H3.b bVar7 = nVar.f1949d;
            bVar7.getClass();
            C0999a a13 = ((C1000b) bVar7.k).a();
            C0999a h14 = bVar7.h();
            ((W0.d) bVar7.f1905h).getClass();
            String string7 = context.getString(R.string.default_set_text_name);
            o6.j.d(string7, "getString(...)");
            return new f2.j(a13, h14, string7, 0, "", false);
        }
        if (kVar.equals(V3.c.f6358d)) {
            throw new IllegalArgumentException("Unsupported action type for creation " + kVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
