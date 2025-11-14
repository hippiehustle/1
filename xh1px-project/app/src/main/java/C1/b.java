package C1;

import A1.n;
import I7.m;
import I7.v;
import K3.D;
import K3.s;
import L7.C0161t;
import L7.InterfaceC0153k;
import L7.X;
import L7.d0;
import M1.h;
import Q2.p;
import Q7.q;
import Z5.j;
import Z5.y;
import a6.AbstractC0436k;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.buzbuz.smartautoclicker.core.ui.views.gesturerecord.GestureRecordView;
import d6.InterfaceC0620f;
import d6.InterfaceC0621g;
import f2.k;
import h4.AbstractC0832f;
import j2.C0902b;
import j4.l;
import java.util.Iterator;
import java.util.List;
import n1.AbstractC1149a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import t6.C1586a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC1164c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f563e;

    public /* synthetic */ b(int i4, Object obj) {
        this.f562d = i4;
        this.f563e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e2, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    @Override // n6.InterfaceC1164c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj, Object obj2) {
        int i4;
        Object obj3;
        j jVar;
        Object obj4;
        Point point;
        C3.a aVar;
        switch (this.f562d) {
            case 0:
                g gVar = (g) this.f563e;
                o6.j.e((Context) obj, "<unused var>");
                o6.j.e((w1.e) obj2, "<unused var>");
                gVar.f579h = null;
                return y.f7506a;
            case 1:
                G1.f fVar = (G1.f) this.f563e;
                int intValue = ((Integer) obj).intValue();
                G1.a aVar2 = (G1.a) obj2;
                o6.j.e(aVar2, "brief");
                fVar.h(new n(fVar, intValue, aVar2));
                return y.f7506a;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) this.f563e;
                CharSequence charSequence = (CharSequence) obj;
                int intValue2 = ((Integer) obj2).intValue();
                o6.j.e(charSequence, "$this$DelimitedRangesSequence");
                if (list.size() == 1) {
                    String str = (String) AbstractC0436k.F0(list);
                    int i02 = m.i0(charSequence, str, intValue2, false, 4);
                    if (i02 >= 0) {
                        jVar = new j(Integer.valueOf(i02), str);
                        if (jVar != null) {
                            return null;
                        }
                        return new j(jVar.f7485d, Integer.valueOf(((String) jVar.f7486e).length()));
                    }
                    jVar = null;
                    if (jVar != null) {
                    }
                } else {
                    if (intValue2 < 0) {
                        intValue2 = 0;
                    }
                    C1586a c1586a = new C1586a(intValue2, charSequence.length(), 1);
                    boolean z8 = charSequence instanceof String;
                    int i8 = c1586a.f15125f;
                    int i9 = c1586a.f15124e;
                    if (z8) {
                        if ((i8 > 0 && intValue2 <= i9) || (i8 < 0 && i9 <= intValue2)) {
                            int i10 = intValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (v.X(0, i10, str2.length(), str2, (String) charSequence, false)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    jVar = new j(Integer.valueOf(i10), str3);
                                } else if (i10 != i9) {
                                    i10 += i8;
                                }
                            }
                            if (jVar != null) {
                            }
                        }
                        jVar = null;
                        if (jVar != null) {
                        }
                    } else {
                        if ((i8 > 0 && intValue2 <= i9) || (i8 < 0 && i9 <= intValue2)) {
                            int i11 = intValue2;
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        i4 = i9;
                                        if (!m.n0(str4, 0, charSequence, i11, str4.length(), false)) {
                                            i9 = i4;
                                        }
                                    } else {
                                        i4 = i9;
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    jVar = new j(Integer.valueOf(i11), str5);
                                } else if (i11 != i4) {
                                    i11 += i8;
                                    i9 = i4;
                                }
                            }
                            if (jVar != null) {
                            }
                        }
                        jVar = null;
                        if (jVar != null) {
                        }
                    }
                }
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                s sVar = (s) this.f563e;
                P2.a aVar3 = (P2.a) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (aVar3 != null && booleanValue) {
                    D h02 = sVar.h0();
                    Context k = sVar.k();
                    H3.n nVar = h02.f2642d;
                    f2.a aVar4 = null;
                    Point point2 = null;
                    Point point3 = null;
                    if (aVar3 instanceof Q2.c) {
                        f2.e b4 = nVar.f1949d.b(k);
                        Q2.c cVar = (Q2.c) aVar3;
                        PointF pointF = cVar.f4781b;
                        if (pointF != null) {
                            point2 = new Point((int) pointF.x, (int) pointF.y);
                        }
                        aVar4 = f2.e.i(b4, null, null, null, 0, Long.valueOf(cVar.f4780a), f2.d.f10687d, point2, null, null, 399);
                    } else if (aVar3 instanceof p) {
                        k e9 = nVar.f1949d.e(k);
                        p pVar = (p) aVar3;
                        PointF pointF2 = pVar.f4837b;
                        if (pointF2 != null) {
                            point = new Point((int) pointF2.x, (int) pointF2.y);
                        } else {
                            point = null;
                        }
                        PointF pointF3 = pVar.f4838c;
                        if (pointF3 != null) {
                            point3 = new Point((int) pointF3.x, (int) pointF3.y);
                        }
                        aVar4 = k.i(e9, null, null, null, 0, Long.valueOf(pVar.f4836a), point, point3, 15);
                    }
                    if (aVar4 != null) {
                        nVar.c(aVar4);
                        E3.a aVar5 = (E3.a) nVar.f1948c.f601h.f();
                        if (aVar5 != null && (aVar = aVar5.f1193m) != null) {
                            aVar.j();
                        }
                    }
                }
                return y.f7506a;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                h hVar = (h) this.f563e;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                if (booleanValue2 || booleanValue3) {
                    hVar.S(false, false);
                }
                return y.f7506a;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                GestureRecordView gestureRecordView = (GestureRecordView) this.f563e;
                O2.c cVar2 = (O2.c) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                InterfaceC1164c interfaceC1164c = gestureRecordView.f9788f;
                if (interfaceC1164c != null) {
                    interfaceC1164c.l(cVar2, bool);
                }
                return y.f7506a;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                P7.y yVar = (P7.y) this.f563e;
                int intValue3 = ((Integer) obj).intValue();
                InterfaceC0620f interfaceC0620f = (InterfaceC0620f) obj2;
                InterfaceC0621g key = interfaceC0620f.getKey();
                InterfaceC0620f B8 = yVar.f4688h.B(key);
                if (key != C0161t.f3244e) {
                    if (interfaceC0620f != B8) {
                        intValue3 = Integer.MIN_VALUE;
                    }
                    intValue3++;
                } else {
                    X x8 = (X) B8;
                    X x9 = (X) interfaceC0620f;
                    while (true) {
                        if (x9 == null) {
                            x9 = null;
                        } else if (x9 != x8 && (x9 instanceof q)) {
                            InterfaceC0153k interfaceC0153k = (InterfaceC0153k) d0.f3211e.get((q) x9);
                            if (interfaceC0153k != null) {
                                x9 = interfaceC0153k.getParent();
                            } else {
                                x9 = null;
                            }
                        }
                    }
                    if (x9 != x8) {
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + x9 + ", expected child of " + x8 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                return Integer.valueOf(intValue3);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                R.g gVar2 = (R.g) this.f563e;
                long longValue = ((Long) obj).longValue();
                int intValue4 = ((Integer) obj2).intValue() + 600;
                if (intValue4 > 10000) {
                    intValue4 = 10000;
                }
                String f8 = AbstractC1149a.f("WHERE `id` = ", longValue);
                ContentValues contentValues = new ContentValues();
                contentValues.put("detection_quality", Integer.valueOf(intValue4));
                gVar2.S(f8, contentValues);
                return y.f7506a;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                j4.f fVar2 = (j4.f) this.f563e;
                C0902b c0902b = (C0902b) obj;
                InterfaceC1163b interfaceC1163b = (InterfaceC1163b) obj2;
                o6.j.e(c0902b, "bitmap");
                o6.j.e(interfaceC1163b, "onLoaded");
                l lVar = (l) fVar2.f11925w.getValue();
                return AbstractC0832f.p(lVar, lVar.f11932b, c0902b, interfaceC1163b);
            case 9:
                q3.j jVar2 = (q3.j) this.f563e;
                Point point4 = (Point) obj;
                Point point5 = (Point) obj2;
                o6.j.e(point4, "from");
                o6.j.e(point5, "to");
                return jVar2.t().f14007b.f11153f.w(jVar2.h(), point4, point5);
            default:
                z1.b bVar = (z1.b) this.f563e;
                View view = (View) obj;
                o6.j.e(view, "view");
                o6.j.e((MotionEvent) obj2, "<unused var>");
                bVar.D();
                return Boolean.valueOf(view.performClick());
        }
    }
}
