package m3;

import O7.i0;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.Editable;
import android.view.View;
import n6.InterfaceC1163b;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1061a implements InterfaceC1163b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1079s f12436e;

    public /* synthetic */ C1061a(C1079s c1079s, int i4) {
        this.f12435d = i4;
        this.f12436e = c1079s;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        p2.c cVar;
        long j;
        p2.c cVar2;
        int i4;
        p2.c cVar3;
        long j5;
        p2.c cVar4;
        Q2.p pVar;
        Point point;
        Point point2;
        switch (this.f12435d) {
            case 0:
                o6.j.e((View) obj, "it");
                C1079s c1079s = this.f12436e;
                c1079s.f12474x.a();
                c1079s.a();
                break;
            case 1:
                o6.j.e((View) obj, "it");
                C1079s c1079s2 = this.f12436e;
                p2.c cVar5 = (p2.c) c1079s2.G().f12425b.f();
                if (cVar5 != null) {
                    C1060E G8 = c1079s2.G();
                    Context k = c1079s2.k();
                    p2.c cVar6 = (p2.c) G8.f12425b.f();
                    if (cVar6 != null) {
                        SharedPreferences.Editor edit = D2.f.r(k).edit();
                        o6.j.d(edit, "edit(...)");
                        SharedPreferences.Editor putLong = edit.putLong("Last_Swipe_Duration", cVar6.j);
                        o6.j.d(putLong, "putLong(...)");
                        SharedPreferences.Editor putInt = putLong.putInt("Last_Swipe_Repeat_Count", cVar6.f13694e);
                        o6.j.d(putInt, "putInt(...)");
                        SharedPreferences.Editor putLong2 = putInt.putLong("Last_Swipe_Repeat_Delay", cVar6.f13696g);
                        o6.j.d(putLong2, "putLong(...)");
                        putLong2.apply();
                    }
                    c1079s2.f12472v.m(cVar5);
                    c1079s2.a();
                }
                return Z5.y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e((View) obj, "it");
                C1079s c1079s3 = this.f12436e;
                p2.c cVar7 = (p2.c) c1079s3.G().f12425b.f();
                if (cVar7 != null) {
                    c1079s3.f12473w.m(cVar7);
                    c1079s3.a();
                }
                return Z5.y.f7506a;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                Editable editable = (Editable) obj;
                o6.j.e(editable, "it");
                C1060E G9 = this.f12436e.G();
                String obj2 = editable.toString();
                o6.j.e(obj2, "newName");
                i0 i0Var = G9.f12425b;
                p2.c cVar8 = (p2.c) i0Var.f();
                if (cVar8 != null) {
                    cVar = p2.c.i(cVar8, null, null, obj2, 0, 0, false, 0L, null, null, 0L, 1019);
                } else {
                    cVar = null;
                }
                i0Var.g(cVar);
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                Editable editable2 = (Editable) obj;
                o6.j.e(editable2, "it");
                C1060E G10 = this.f12436e.G();
                if (editable2.length() > 0) {
                    j = Long.parseLong(editable2.toString());
                } else {
                    j = 0;
                }
                long j8 = j;
                i0 i0Var2 = G10.f12425b;
                p2.c cVar9 = (p2.c) i0Var2.f();
                if (cVar9 != null) {
                    cVar2 = p2.c.i(cVar9, null, null, null, 0, 0, false, 0L, null, null, j8, 511);
                } else {
                    cVar2 = null;
                }
                i0Var2.g(cVar2);
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                Editable editable3 = (Editable) obj;
                o6.j.e(editable3, "it");
                C1060E G11 = this.f12436e.G();
                if (editable3.length() > 0) {
                    i4 = Integer.parseInt(editable3.toString());
                } else {
                    i4 = 0;
                }
                int i8 = i4;
                i0 i0Var3 = G11.f12425b;
                p2.c cVar10 = (p2.c) i0Var3.f();
                if (cVar10 != null) {
                    cVar3 = p2.c.i(cVar10, null, null, null, 0, i8, false, 0L, null, null, 0L, 1007);
                } else {
                    cVar3 = null;
                }
                i0Var3.g(cVar3);
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                Editable editable4 = (Editable) obj;
                o6.j.e(editable4, "it");
                C1060E G12 = this.f12436e.G();
                if (editable4.length() > 0) {
                    j5 = Long.parseLong(editable4.toString());
                } else {
                    j5 = 0;
                }
                long j9 = j5;
                i0 i0Var4 = G12.f12425b;
                p2.c cVar11 = (p2.c) i0Var4.f();
                if (cVar11 != null) {
                    cVar4 = p2.c.i(cVar11, null, null, null, 0, 0, false, j9, null, null, 0L, 959);
                } else {
                    cVar4 = null;
                }
                i0Var4.g(cVar4);
                break;
            default:
                P2.a aVar = (P2.a) obj;
                o6.j.e(aVar, "swipeDesc");
                p2.c cVar12 = null;
                if (aVar instanceof Q2.p) {
                    pVar = (Q2.p) aVar;
                } else {
                    pVar = null;
                }
                if (pVar != null) {
                    C1060E G13 = this.f12436e.G();
                    PointF pointF = pVar.f4837b;
                    if (pointF != null) {
                        point = new Point((int) pointF.x, (int) pointF.y);
                    } else {
                        point = null;
                    }
                    PointF pointF2 = pVar.f4838c;
                    if (pointF2 != null) {
                        point2 = new Point((int) pointF2.x, (int) pointF2.y);
                    } else {
                        point2 = null;
                    }
                    if (point != null && point2 != null) {
                        i0 i0Var5 = G13.f12425b;
                        p2.c cVar13 = (p2.c) i0Var5.f();
                        if (cVar13 != null) {
                            cVar12 = p2.c.i(cVar13, null, null, null, 0, 0, false, 0L, point, point2, 0L, 639);
                        }
                        i0Var5.g(cVar12);
                    }
                }
                return Z5.y.f7506a;
        }
        return Z5.y.f7506a;
    }
}
