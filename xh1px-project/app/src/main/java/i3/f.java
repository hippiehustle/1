package i3;

import C1.g;
import Q2.p;
import Z5.y;
import a6.s;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import g0.b0;
import h4.AbstractC0832f;
import java.util.Objects;
import k3.C0958e;
import kotlin.NoWhenBranchMatchedException;
import l3.C1013l;
import n0.AbstractC1143u;
import n0.C1131i;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import o6.i;
import o6.j;
import o6.r;
import p2.C1304a;
import q0.C1350f;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f11764g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f11765h;

    public /* synthetic */ f(g gVar, R.g gVar2, Context context, b0 b0Var) {
        this.f11761d = 1;
        this.f11762e = b0Var;
        this.f11763f = gVar;
        this.f11764g = context;
        this.f11765h = gVar2;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [o6.i, n6.b] */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        p pVar;
        Q2.c cVar;
        PointF pointF;
        switch (this.f11761d) {
            case 0:
                g gVar = (g) this.f11763f;
                Context context = (Context) this.f11764g;
                b0 b0Var = (b0) this.f11762e;
                R.g gVar2 = (R.g) this.f11765h;
                e eVar = (e) obj;
                j.e(eVar, "choice");
                if (eVar.equals(C0882b.f11758d)) {
                    gVar.d(context, new C0958e(new f(gVar, gVar2, context, b0Var)), false);
                } else if (eVar.equals(C0881a.f11757d)) {
                    gVar.d(context, new F1.e(new Q2.c(0L, (PointF) null, 7), new f(gVar2, gVar, context, b0Var, 3), (InterfaceC1162a) gVar2.f4989g), true);
                } else if (eVar.equals(d.f11760d)) {
                    gVar.d(context, new F1.e(new p(250L, null, null), new f(gVar2, gVar, context, b0Var, 2), (InterfaceC1162a) gVar2.f4989g), true);
                } else if (eVar.equals(C0883c.f11759d)) {
                    p2.b bVar = (p2.b) ((InterfaceC1162a) b0Var.f10989f).a();
                    Objects.toString(bVar);
                    gVar.d(context, new C1013l(bVar, (InterfaceC1163b) gVar2.f4987e, (InterfaceC1163b) gVar2.f4988f, (InterfaceC1162a) gVar2.f4989g), true);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return y.f7506a;
            case 1:
                b0 b0Var2 = (b0) this.f11762e;
                g gVar3 = (g) this.f11763f;
                Context context2 = (Context) this.f11764g;
                R.g gVar4 = (R.g) this.f11765h;
                p2.d dVar = (p2.d) obj;
                j.e(dVar, "actionToCopy");
                p2.d dVar2 = (p2.d) ((i) b0Var2.f10990g).m(dVar);
                if (dVar2 != null) {
                    AbstractC0832f.B(gVar3, context2, dVar2, gVar4);
                }
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                R.g gVar5 = (R.g) this.f11765h;
                g gVar6 = (g) this.f11763f;
                Context context3 = (Context) this.f11764g;
                b0 b0Var3 = (b0) this.f11762e;
                P2.a aVar = (P2.a) obj;
                j.e(aVar, "description");
                if (aVar instanceof p) {
                    pVar = (p) aVar;
                } else {
                    pVar = null;
                }
                if (pVar != null) {
                    PointF pointF2 = pVar.f4838c;
                    PointF pointF3 = pVar.f4837b;
                    if (pointF3 != null && pointF2 != null) {
                        AbstractC0832f.D(gVar6, context3, (p2.c) ((InterfaceC1164c) b0Var3.f10988e).l(new Point((int) pointF3.x, (int) pointF3.y), new Point((int) pointF2.x, (int) pointF2.y)), gVar5);
                    } else {
                        ((InterfaceC1162a) gVar5.f4989g).a();
                    }
                }
                return y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                R.g gVar7 = (R.g) this.f11765h;
                g gVar8 = (g) this.f11763f;
                Context context4 = (Context) this.f11764g;
                b0 b0Var4 = (b0) this.f11762e;
                P2.a aVar2 = (P2.a) obj;
                j.e(aVar2, "description");
                if (aVar2 instanceof Q2.c) {
                    cVar = (Q2.c) aVar2;
                } else {
                    cVar = null;
                }
                if (cVar != null && (pointF = cVar.f4781b) != null) {
                    AbstractC0832f.C(gVar8, context4, (C1304a) ((InterfaceC1163b) b0Var4.f10987d).m(new Point((int) pointF.x, (int) pointF.y)), gVar7);
                } else {
                    ((InterfaceC1162a) gVar7.f4989g).a();
                }
                return y.f7506a;
            default:
                r rVar = (r) this.f11763f;
                C1350f c1350f = (C1350f) this.f11764g;
                AbstractC1143u abstractC1143u = (AbstractC1143u) this.f11762e;
                Bundle bundle = (Bundle) this.f11765h;
                C1131i c1131i = (C1131i) obj;
                j.e(c1131i, "it");
                rVar.f13639d = true;
                c1350f.a(abstractC1143u, bundle, c1131i, s.f7766d);
                return y.f7506a;
        }
    }

    public /* synthetic */ f(R.g gVar, g gVar2, Context context, b0 b0Var, int i4) {
        this.f11761d = i4;
        this.f11765h = gVar;
        this.f11763f = gVar2;
        this.f11764g = context;
        this.f11762e = b0Var;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f11761d = i4;
        this.f11763f = obj;
        this.f11764g = obj2;
        this.f11762e = obj3;
        this.f11765h = obj4;
    }
}
