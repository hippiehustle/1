package j3;

import O7.i0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.Editable;
import android.view.View;
import n6.InterfaceC1163b;
import p2.C1304a;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0915a implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0934t f11853e;

    public /* synthetic */ C0915a(C0934t c0934t, int i4) {
        this.f11852d = i4;
        this.f11853e = c0934t;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        C1304a c1304a;
        long j;
        C1304a c1304a2;
        int i4;
        C1304a c1304a3;
        long j5;
        C1304a c1304a4;
        Q2.c cVar;
        Point point;
        PointF pointF;
        switch (this.f11852d) {
            case 0:
                o6.j.e((View) obj, "it");
                C0934t c0934t = this.f11853e;
                c0934t.f11892x.a();
                c0934t.a();
                break;
            case 1:
                o6.j.e((View) obj, "it");
                C0934t c0934t2 = this.f11853e;
                C1304a c1304a5 = (C1304a) c0934t2.G().f11842b.f();
                if (c1304a5 != null) {
                    C0914I G8 = c0934t2.G();
                    Context k = c0934t2.k();
                    C1304a c1304a6 = (C1304a) G8.f11842b.f();
                    if (c1304a6 != null) {
                        SharedPreferences.Editor edit = D2.f.r(k).edit();
                        o6.j.d(edit, "edit(...)");
                        SharedPreferences.Editor putLong = edit.putLong("Last_Click_Press_Duration", c1304a6.f13684i);
                        o6.j.d(putLong, "putLong(...)");
                        SharedPreferences.Editor putInt = putLong.putInt("Last_Click_Repeat_Count", c1304a6.f13680e);
                        o6.j.d(putInt, "putInt(...)");
                        SharedPreferences.Editor putLong2 = putInt.putLong("Last_Click_Repeat_Delay", c1304a6.f13682g);
                        o6.j.d(putLong2, "putLong(...)");
                        putLong2.apply();
                    }
                    c0934t2.f11890v.m(c1304a5);
                    c0934t2.a();
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e((View) obj, "it");
                C0934t c0934t3 = this.f11853e;
                C1304a c1304a7 = (C1304a) c0934t3.G().f11842b.f();
                if (c1304a7 != null) {
                    c0934t3.f11891w.m(c1304a7);
                    c0934t3.a();
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                C0914I G9 = this.f11853e.G();
                String obj2 = editable.toString();
                o6.j.e(obj2, "newName");
                i0 i0Var = G9.f11842b;
                C1304a c1304a8 = (C1304a) i0Var.f();
                if (c1304a8 != null) {
                    c1304a = C1304a.i(c1304a8, null, null, obj2, 0, 0, false, 0L, null, 0L, 507);
                } else {
                    c1304a = null;
                }
                i0Var.g(c1304a);
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                C0914I G10 = this.f11853e.G();
                if (editable2.length() > 0) {
                    j = Long.parseLong(editable2.toString());
                } else {
                    j = 0;
                }
                long j8 = j;
                i0 i0Var2 = G10.f11842b;
                C1304a c1304a9 = (C1304a) i0Var2.f();
                if (c1304a9 != null) {
                    c1304a2 = C1304a.i(c1304a9, null, null, null, 0, 0, false, 0L, null, j8, 255);
                } else {
                    c1304a2 = null;
                }
                i0Var2.g(c1304a2);
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Editable editable3 = (Editable) obj;
                o6.j.e(editable3, "it");
                C0914I G11 = this.f11853e.G();
                if (editable3.length() > 0) {
                    i4 = Integer.parseInt(editable3.toString());
                } else {
                    i4 = 0;
                }
                int i8 = i4;
                i0 i0Var3 = G11.f11842b;
                C1304a c1304a10 = (C1304a) i0Var3.f();
                if (c1304a10 != null) {
                    c1304a3 = C1304a.i(c1304a10, null, null, null, 0, i8, false, 0L, null, 0L, 495);
                } else {
                    c1304a3 = null;
                }
                i0Var3.g(c1304a3);
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Editable editable4 = (Editable) obj;
                o6.j.e(editable4, "it");
                C0914I G12 = this.f11853e.G();
                if (editable4.length() > 0) {
                    j5 = Long.parseLong(editable4.toString());
                } else {
                    j5 = 0;
                }
                long j9 = j5;
                i0 i0Var4 = G12.f11842b;
                C1304a c1304a11 = (C1304a) i0Var4.f();
                if (c1304a11 != null) {
                    c1304a4 = C1304a.i(c1304a11, null, null, null, 0, 0, false, j9, null, 0L, 447);
                } else {
                    c1304a4 = null;
                }
                i0Var4.g(c1304a4);
                break;
            default:
                P2.a aVar = (P2.a) obj;
                o6.j.e(aVar, "description");
                C0914I G13 = this.f11853e.G();
                C1304a c1304a12 = null;
                if (aVar instanceof Q2.c) {
                    cVar = (Q2.c) aVar;
                } else {
                    cVar = null;
                }
                if (cVar != null && (pointF = cVar.f4781b) != null) {
                    point = new Point((int) pointF.x, (int) pointF.y);
                } else {
                    point = null;
                }
                if (point != null) {
                    i0 i0Var5 = G13.f11842b;
                    C1304a c1304a13 = (C1304a) i0Var5.f();
                    if (c1304a13 != null) {
                        c1304a12 = C1304a.i(c1304a13, null, null, null, 0, 0, false, 0L, point, 0L, 383);
                    }
                    i0Var5.g(c1304a12);
                }
                return Z5.y.f7506a;
        }
        return Z5.y.f7506a;
    }
}
