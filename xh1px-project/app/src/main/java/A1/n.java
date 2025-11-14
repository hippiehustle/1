package A1;

import K3.D;
import K3.L;
import K3.v;
import L7.AbstractC0166y;
import O3.C0219q;
import O7.i0;
import Z5.y;
import Z7.C0399u;
import Z7.C0400v;
import a6.AbstractC0436k;
import a6.t;
import a6.x;
import a8.q;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.U;
import c4.C0580g;
import d4.C0600f;
import e4.C0643a;
import g0.AbstractComponentCallbacksC0755y;
import g2.C0777a;
import h4.AbstractC0832f;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import k2.C0952b;
import k2.C0953c;
import k3.C0958e;
import k3.C0959f;
import k3.C0965l;
import kotlin.NoWhenBranchMatchedException;
import n0.C1131i;
import n0.C1134l;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import o3.C1233d;
import o3.C1244o;
import o3.C1250u;
import p0.C1299g;
import w4.C1704i;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f267f;

    public /* synthetic */ n(G1.f fVar, int i4, G1.a aVar) {
        this.f265d = 2;
        this.f266e = fVar;
        this.f267f = aVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // n6.InterfaceC1162a
    public final Object a() {
        String[] names;
        String str;
        switch (this.f265d) {
            case 0:
                p pVar = (p) this.f266e;
                g gVar = (g) this.f267f;
                pVar.a();
                pVar.f271w.m(gVar);
                return y.f7506a;
            case 1:
                F1.e eVar = (F1.e) this.f266e;
                Q2.c cVar = (Q2.c) this.f267f;
                eVar.a();
                eVar.f1297J.m(cVar);
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                ((G1.f) this.f266e).Y((G1.a) this.f267f);
                return y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                H1.a aVar = (H1.a) this.f266e;
                E1.a aVar2 = (E1.a) this.f267f;
                aVar.f1881f = false;
                aVar2.a();
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                H1.a aVar3 = (H1.a) this.f266e;
                E1.a aVar4 = (E1.a) this.f267f;
                aVar3.f1878c = false;
                aVar4.a();
                return y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                J2.b bVar = (J2.b) this.f266e;
                J2.a aVar5 = J2.a.k;
                B0.e eVar2 = (B0.e) this.f267f;
                bVar.f2387c.remove(aVar5);
                eVar2.a();
                return y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                D d2 = (D) this.f266e;
                AbstractC0166y.q(U.g(d2), d2.f2640b, null, new v((B0.e) this.f267f, null), 2);
                return y.f7506a;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                L l6 = (L) this.f266e;
                E2.d.R(l6, l6.G(), ((C0643a) ((G1.a) this.f267f).f1694b).f10609d);
                return y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                N3.d dVar = (N3.d) this.f266e;
                N3.e eVar3 = (N3.e) this.f267f;
                dVar.a();
                dVar.f3743v.m(eVar3.f3748a.f10609d);
                return y.f7506a;
            case 9:
                ((C0219q) this.f266e).u((C0777a) this.f267f);
                return y.f7506a;
            case 10:
                P3.e eVar4 = (P3.e) this.f266e;
                eVar4.f4505u.m((ComponentName) this.f267f);
                eVar4.a();
                return y.f7506a;
            case 11:
                Q3.f fVar = (Q3.f) this.f266e;
                fVar.f4848u.m((ComponentName) this.f267f);
                fVar.a();
                return y.f7506a;
            case 12:
                S3.g gVar2 = (S3.g) this.f266e;
                Uri uri = (Uri) this.f267f;
                C1.g o7 = gVar2.o();
                Context k = gVar2.k();
                o6.j.e(uri, "uri");
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setFlags(268435456);
                Intent makeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
                makeMainSelectorActivity.setData(uri);
                makeMainSelectorActivity.setFlags(268435456);
                o7.d(k, new F1.a(intent, makeMainSelectorActivity), true);
                return y.f7506a;
            case 13:
                C0400v c0400v = (C0400v) this.f266e;
                String str2 = (String) this.f267f;
                Enum[] enumArr = c0400v.f7648a;
                C0399u c0399u = new C0399u(str2, enumArr.length);
                for (Enum r02 : enumArr) {
                    c0399u.l(r02.name(), false);
                }
                return c0399u;
            case 14:
                b5.f fVar2 = (b5.f) this.f266e;
                b5.d dVar2 = (b5.d) this.f267f;
                int ordinal = fVar2.f9193a.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2 && ordinal != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Bundle bundle = Bundle.EMPTY;
                        o6.j.d(bundle, "EMPTY");
                        D2.f.I(dVar2, ":ConditionsMigrationDialog:state", bundle);
                        dVar2.S(false, false);
                    }
                } else {
                    b5.h hVar = (b5.h) dVar2.f9191x0.getValue();
                    if (hVar.f9200d.f() == b5.i.f9202d) {
                        AbstractC0166y.q(U.g(hVar), hVar.f9198b, null, new b5.g(hVar, null), 2);
                    }
                }
                return y.f7506a;
            case 15:
                X7.f fVar3 = (X7.f) this.f266e;
                a8.b bVar2 = (a8.b) this.f267f;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                bVar2.f8280a.getClass();
                b8.j.o(fVar3, bVar2);
                int c6 = fVar3.c();
                for (int i4 = 0; i4 < c6; i4++) {
                    List i8 = fVar3.i(i4);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : i8) {
                        if (obj instanceof q) {
                            arrayList.add(obj);
                        }
                    }
                    q qVar = (q) AbstractC0436k.I0(arrayList);
                    if (qVar != null && (names = qVar.names()) != null) {
                        for (String str3 : names) {
                            if (o6.j.a(fVar3.e(), X7.h.f7072f)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str3)) {
                                linkedHashMap.put(str3, Integer.valueOf(i4));
                            } else {
                                String str4 = "The suggested name '" + str3 + "' for " + str + ' ' + fVar3.d(i4) + " is already one of the names for " + str + ' ' + fVar3.d(((Number) x.M0(linkedHashMap, str3)).intValue()) + " in " + fVar3;
                                o6.j.e(str4, "message");
                                throw new IllegalArgumentException(str4);
                            }
                        }
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return t.f7767d;
                }
                return linkedHashMap;
            case 16:
                C0580g c0580g = (C0580g) this.f266e;
                c0580g.f9660u.m((String) this.f267f);
                c0580g.a();
                return y.f7506a;
            case 17:
                C0600f c0600f = (C0600f) this.f266e;
                Uri uri2 = (Uri) this.f267f;
                C1.g o8 = c0600f.o();
                Context k6 = c0600f.k();
                o6.j.e(uri2, "uri");
                Intent intent2 = new Intent("android.intent.action.VIEW", uri2);
                intent2.setFlags(268435456);
                Intent makeMainSelectorActivity2 = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
                makeMainSelectorActivity2.setData(uri2);
                makeMainSelectorActivity2.setFlags(268435456);
                o8.d(k6, new F1.a(intent2, makeMainSelectorActivity2), true);
                return y.f7506a;
            case 18:
                Context context = (Context) this.f266e;
                String str5 = (String) this.f267f;
                o6.j.e(context, "<this>");
                o6.j.e(str5, "name");
                String concat = str5.concat(".preferences_pb");
                o6.j.e(concat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(concat));
            case 19:
                C0958e c0958e = (C0958e) this.f266e;
                C0959f c0959f = (C0959f) this.f267f;
                c0958e.a();
                c0958e.f11983v.m(c0959f.f11988a.f12003f);
                return y.f7506a;
            case 20:
                C1134l c1134l = (C1134l) this.f266e;
                C1131i c1131i = (C1131i) this.f267f;
                synchronized (c1134l.f12767a) {
                    try {
                        i0 i0Var = c1134l.f12768b;
                        Iterable iterable = (Iterable) i0Var.f();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : iterable) {
                            if (!o6.j.a((C1131i) obj2, c1131i)) {
                                arrayList2.add(obj2);
                            } else {
                                i0Var.getClass();
                                i0Var.h(null, arrayList2);
                            }
                        }
                        i0Var.getClass();
                        i0Var.h(null, arrayList2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return y.f7506a;
            case 21:
                C1250u c1250u = (C1250u) this.f266e;
                AbstractC0166y.q(U.g(c1250u), c1250u.f13489b, null, new C1244o((C1233d) this.f267f, null), 2);
                return y.f7506a;
            case 22:
                C1134l c1134l2 = (C1134l) this.f266e;
                AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y = (AbstractComponentCallbacksC0755y) this.f267f;
                for (C1131i c1131i2 : (Iterable) c1134l2.f12772f.f4088d.f()) {
                    if (C1299g.n()) {
                        Objects.toString(c1131i2);
                        Objects.toString(abstractComponentCallbacksC0755y);
                    }
                    c1134l2.c(c1131i2);
                }
                return y.f7506a;
            case 23:
                q3.j jVar = (q3.j) this.f266e;
                C0965l c0965l = (C0965l) this.f267f;
                C1.g o9 = jVar.i().o();
                Context h8 = jVar.h();
                p2.d dVar3 = c0965l.f12003f;
                R.g gVar3 = jVar.f13998p;
                if (gVar3 != null) {
                    AbstractC0832f.B(o9, h8, dVar3, gVar3);
                    return y.f7506a;
                }
                o6.j.i("updateActionUiFlowListener");
                throw null;
            case 24:
                r2.j jVar2 = (r2.j) this.f266e;
                B0.e eVar5 = (B0.e) this.f267f;
                Log.w("DetectorEngine", "projection lost");
                jVar2.e();
                eVar5.a();
                return y.f7506a;
            case 25:
                ((u4.k) this.f266e).u((C0952b) this.f267f);
                return y.f7506a;
            case 26:
                InterfaceC1163b interfaceC1163b = (InterfaceC1163b) this.f266e;
                View view = (View) this.f267f;
                o6.j.b(view);
                interfaceC1163b.m(view);
                return y.f7506a;
            default:
                ((C1704i) this.f266e).u((C0953c) this.f267f);
                return y.f7506a;
        }
    }

    public /* synthetic */ n(J2.b bVar, B0.e eVar) {
        this.f265d = 5;
        this.f266e = bVar;
        this.f267f = eVar;
    }

    public /* synthetic */ n(Object obj, int i4, Object obj2) {
        this.f265d = i4;
        this.f266e = obj;
        this.f267f = obj2;
    }

    public /* synthetic */ n(C1131i c1131i, C1134l c1134l, C1299g c1299g, AbstractComponentCallbacksC0755y abstractComponentCallbacksC0755y) {
        this.f265d = 22;
        this.f266e = c1134l;
        this.f267f = abstractComponentCallbacksC0755y;
    }

    public /* synthetic */ n(C1134l c1134l, C1131i c1131i, boolean z8) {
        this.f265d = 20;
        this.f266e = c1134l;
        this.f267f = c1131i;
    }
}
